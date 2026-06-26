package app.yukulabo.patches.transit.ads

import app.yukulabo.patches.transit.utils.Constants.COMPATIBILITY_TRANSIT
import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.instructions
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.MutableMethodImplementation
import com.android.tools.smali.dexlib2.immutable.ImmutableMethod
import com.android.tools.smali.dexlib2.immutable.ImmutableMethodParameter

/*
 * Yahoo! 乗換案内 広告 View 除去パッチ
 *
 * 対象クラスは jp.co.yahoo.android.apps.transit.ad パッケージ内の全広告 View。
 * クラス名は APK 内のバイトコードで保持されており（パッケージ名のみ難読化）、
 * definingClass によって一意に特定できる。
 *
 * 除去戦略:
 *   A) 3引数コンストラクタ内の invoke-direct (= super()) の直後に
 *      setVisibility(GONE) を注入 → 生成直後から非表示にする。
 *      Kotlin コンパイラは null チェックを super() の前に生成するため
 *      固定 index 1 は super() 前を指してしまう。INVOKE_DIRECT を動的検索。
 *
 *   B) NaviSearchAdView.onAttachedToWindow() (index 0) にも
 *      setVisibility(GONE) を注入 → Fragment 差し替え等で再アタッチされた
 *      場合にも確実に非表示化する。
 *
 *   C) SearchResultListBottomAdView は状態フロー (StateFlow) が
 *      コルーチン内でコンテナ自身の setVisibility(VISIBLE) を呼ぶため、
 *      対応する invokeSuspend ラムダ ($1, $2) の先頭で kotlin.Unit を
 *      即時返却し、全ての状態処理をスキップする。
 */

private const val CTX = "Landroid/content/Context;"
private const val ATTRS = "Landroid/util/AttributeSet;"
private const val AD_PKG = "Ljp/co/yahoo/android/apps/transit/ad/"

// ---------------------------------------------------------------------------
// Fingerprints — Strategy A: constructor injection
// ---------------------------------------------------------------------------

internal object StationAdTopViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}StationAdTopView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object StationAdBottomViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}StationAdBottomView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object RailAdViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}RailAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object MyPageAdViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}MyPageAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object DiainfoDetailAdViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}DiainfoDetailAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object ReservationAdViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}ReservationAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object YdnAdViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}YdnAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

internal object YdnAdAutoSizeViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}YdnAdAutoSizeView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
)

// Strategy A + B
internal object NaviSearchAdViewCtorFingerprint : Fingerprint(
    definingClass = "${AD_PKG}NaviSearchAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
    strings = listOf("navi_search_ad_video_key"),
)

// Strategy A + C (constructor)
internal object SearchResultListBottomAdViewFingerprint : Fingerprint(
    definingClass = "${AD_PKG}SearchResultListBottomAdView;",
    name = "<init>",
    returnType = "V",
    parameters = listOf(CTX, ATTRS, "I"),
    strings = listOf("search_result_bottom_ad_video_key"),
)

// ---------------------------------------------------------------------------
// Fingerprints — Strategy B: onAttachedToWindow injection
// ---------------------------------------------------------------------------

internal object NaviSearchAdViewAttachFingerprint : Fingerprint(
    definingClass = "${AD_PKG}NaviSearchAdView;",
    name = "onAttachedToWindow",
    returnType = "V",
    parameters = emptyList(),
)

// ---------------------------------------------------------------------------
// Fingerprints — Strategy C: invokeSuspend early return
// 内部クラスの bytecode 名: $a = ad-state handler, $b = video-ad handler
// (ソースコードでは $1/$2 だが bytecode では $a/$b に難読化されている)
// ---------------------------------------------------------------------------

internal object SearchResultBottomSuspend1Fingerprint : Fingerprint(
    definingClass = "${AD_PKG}SearchResultListBottomAdView\$a;",
    name = "invokeSuspend",
    returnType = "Ljava/lang/Object;",
    parameters = listOf("Ljava/lang/Object;"),
)

internal object SearchResultBottomSuspend2Fingerprint : Fingerprint(
    definingClass = "${AD_PKG}SearchResultListBottomAdView\$b;",
    name = "invokeSuspend",
    returnType = "Ljava/lang/Object;",
    parameters = listOf("Ljava/lang/Object;"),
)

// ---------------------------------------------------------------------------
// Fingerprints — Strategy D: 「show」メソッドの無効化
//
// 各広告 View は DataBinding で <merge> レイアウトを inflate しているため、
// binding.getRoot() は親（= View 自身 = this）を返す。広告ロード完了時に
// 内部の show メソッドが getRoot().setVisibility(VISIBLE) を呼ぶと、結果的に
// View 自身が再表示され、コンストラクタの GONE 注入(戦略A)が打ち消される。
// → これらの show メソッド先頭に return-void を注入して無効化し、
//    一度 GONE にした View が二度と表示されないようにする。
//
// 対象 show メソッド（jadx 解析で特定）:
//   StationAdTopView.b(static)        経路結果 上部 / 駅トップ
//   RailAdView.b(static)              路線・経路
//   MyPageAdView.setVisibility(enum)  マイページ
//   DiainfoDetailAdView.setVisibility(enum) 運行情報・時刻表
//   NaviSearchAdView.setVisibility(enum)    ナビ検索
//   YdnAdView.o()                     経路結果 下部 (YDN 広告本体)
// ---------------------------------------------------------------------------

// static void b(Self, boolean, boolean, boolean, int) — getRoot() を VISIBLE に
internal object StationAdTopShowFingerprint : Fingerprint(
    definingClass = "${AD_PKG}StationAdTopView;",
    name = "b",
    returnType = "V",
    parameters = listOf("${AD_PKG}StationAdTopView;", "Z", "Z", "Z", "I"),
)

internal object RailAdShowFingerprint : Fingerprint(
    definingClass = "${AD_PKG}RailAdView;",
    name = "b",
    returnType = "V",
    parameters = listOf("${AD_PKG}RailAdView;", "Z", "Z", "Z", "I"),
)

// void setVisibility(enum) — クラス独自オーバーロード（View.setVisibility(int)
// は継承であり当クラスのメソッドテーブルには無いため name+returnType で一意）
internal object MyPageShowFingerprint : Fingerprint(
    definingClass = "${AD_PKG}MyPageAdView;",
    name = "setVisibility",
    returnType = "V",
)

internal object DiainfoDetailShowFingerprint : Fingerprint(
    definingClass = "${AD_PKG}DiainfoDetailAdView;",
    name = "setVisibility",
    returnType = "V",
)

internal object NaviSearchShowFingerprint : Fingerprint(
    definingClass = "${AD_PKG}NaviSearchAdView;",
    name = "setVisibility",
    returnType = "V",
)

// void o() — YdnAdView 自身を直接 setVisibility(VISIBLE) する show メソッド
internal object YdnAdShowFingerprint : Fingerprint(
    definingClass = "${AD_PKG}YdnAdView;",
    name = "o",
    returnType = "V",
    parameters = emptyList(),
)

// ---------------------------------------------------------------------------
// Fingerprints — Strategy F: バナー広告の生成/表示を断つ
//
// 時刻表(fragment_timetable_top)・運行情報(fragment_diainfo)等の下部広告は、
// 専用の広告 View クラスではなく、汎用 RelativeLayout コンテナ(id=AdView_Bottom)
// に対し共有ヘルパー g9.a が YJBannerAdView(a6.c) を生成・addView して表示する。
// この経路は View 単位の非表示(A〜E)では捕捉できない。
//
//   g9.a.f(Context, String, String, boolean, RelativeLayout, x6.b)
//       = a6.c を new して relativeLayout.addView し広告リクエストする本体
//   g9.a.g(Context, String, boolean, RelativeLayout)
//       = f(...) を呼ぶ薄いラッパー。時刻表(p0)・運行情報(n8.q)が呼ぶ入口
//
// 両方を return-void で無効化する。g9.a.e() は this.g を null チェックしてから
// 使うため、ad view を生成しなくても NPE にならない（確認済み）。
// ---------------------------------------------------------------------------

internal object BannerAdRenderFingerprint : Fingerprint(
    definingClass = "Lg9/a;",
    name = "f",
    returnType = "V",
    parameters = listOf(
        CTX,
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Z",
        "Landroid/widget/RelativeLayout;",
        "Lx6/b;",
    ),
)

internal object BannerAdShowFingerprint : Fingerprint(
    definingClass = "Lg9/a;",
    name = "g",
    returnType = "V",
    parameters = listOf(
        CTX,
        "Ljava/lang/String;",
        "Z",
        "Landroid/widget/RelativeLayout;",
    ),
)

// ---------------------------------------------------------------------------
// Smali snippets
// ---------------------------------------------------------------------------

/** コンテナ View (p0 = this) を GONE にする。super() 直後に注入する。 */
private val SET_GONE = """
    const/16 v0, 0x8
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V
""".trimIndent()

/**
 * kotlin.Unit を即時返却し、広告表示ロジック全体をスキップする。
 * R8 難読化: kotlin.Unit → kotlin.j, INSTANCE → a (v7.40.2 固定)
 */
private val RETURN_UNIT = """
    sget-object v0, Lkotlin/j;->a:Lkotlin/j;
    return-object v0
""".trimIndent()

/** void を返す show メソッドを即時 return して無効化する。 */
private val RETURN_VOID = "return-void"

// ---------------------------------------------------------------------------
// Strategy E: setVisibility(int) override で GONE を強制
//
// 広告 View の多くは XML レイアウトに埋め込まれ、DataBinding が
// View.setVisibility(int) を直接呼んで表示する（時刻表・運行情報など）。
// この経路はコンストラクタ注入(A)・enum オーバーロード無効化(D)では
// 捕捉できない。そこで各 View に setVisibility(I)V override を追加し、
// 引数を無視して常に GONE(8) を super に渡す。これにより:
//   - DataBinding / 外部 / 内部 (getRoot()==this) いずれの再表示も無効化
//   - 子 View (ProgressBar 等の読み込み表示) ごと領域が消える
//
// 各 View の直接の親クラス（invoke-super 先）:
// ---------------------------------------------------------------------------
private const val FRAME = "Landroid/widget/FrameLayout;"
private const val REL = "Landroid/widget/RelativeLayout;"
private const val CLL = "Ljp/co/yahoo/android/apps/transit/ui/view/CustomLinearLayout;"
private const val CCL = "Ljp/co/yahoo/android/apps/transit/ui/view/CustomConstraintLayout;"

/** (広告 View クラス, その直接の親クラス) のペア。 */
private val AD_VIEW_SUPERS =
    listOf(
        "StationAdTopView;" to FRAME,
        "StationAdBottomView;" to CLL,
        "RailAdView;" to FRAME,
        "MyPageAdView;" to FRAME,
        "DiainfoDetailAdView;" to FRAME,
        "ReservationAdView;" to CCL,
        "YdnAdView;" to CCL,
        "YdnAdAutoSizeView;" to CCL,
        "NaviSearchAdView;" to FRAME,
        "SearchResultListBottomAdView;" to REL,
        "YdnInfeed001ImageSize600View;" to CCL,
        "YdnInfeed002FullWidthImageView;" to CCL,
        "YdaTextLarge;" to CCL,
    )

// ---------------------------------------------------------------------------
// Patch definition
// ---------------------------------------------------------------------------

@Suppress("unused")
val hideAdViewsPatch =
    bytecodePatch(
        name = "Hide ad views",
        description = "Yahoo! Transit の全広告 View を非表示にする。",
        default = true,
    ) {
        compatibleWith(COMPATIBILITY_TRANSIT)

        execute {
            // Strategy A: super() の直後に GONE を注入
            // Kotlin は null チェック(invoke-static)を super() 前に生成するため、
            // 固定 index 1 は super() 前を指す → VerifyError の原因。
            // invoke-direct = super() を動的に検索し、その次の index に挿入する。
            listOf(
                StationAdTopViewFingerprint,
                StationAdBottomViewFingerprint,
                RailAdViewFingerprint,
                MyPageAdViewFingerprint,
                DiainfoDetailAdViewFingerprint,
                ReservationAdViewFingerprint,
                YdnAdViewFingerprint,
                YdnAdAutoSizeViewFingerprint,
                NaviSearchAdViewCtorFingerprint,
                SearchResultListBottomAdViewFingerprint,
            ).forEach { fp ->
                val superIdx = fp.method.instructions
                    .indexOfFirst { it.opcode == Opcode.INVOKE_DIRECT }
                fp.method.addInstructions(superIdx + 1, SET_GONE)
            }

            // Strategy B: NaviSearchAdView は onAttachedToWindow でも再度 GONE にする
            NaviSearchAdViewAttachFingerprint.method.addInstructions(0, SET_GONE)

            // Strategy C: SearchResultListBottomAdView の StateFlow ハンドラを無効化
            SearchResultBottomSuspend1Fingerprint.method.addInstructions(0, RETURN_UNIT)
            SearchResultBottomSuspend2Fingerprint.method.addInstructions(0, RETURN_UNIT)

            // Strategy D: 各広告 View の show メソッドを return-void で無効化
            // （<merge> の getRoot()==this 再表示でコンストラクタ GONE が
            //   打ち消される問題への対策。経路結果上部/下部・時刻表トップ等）
            listOf(
                StationAdTopShowFingerprint,
                RailAdShowFingerprint,
                MyPageShowFingerprint,
                DiainfoDetailShowFingerprint,
                NaviSearchShowFingerprint,
                YdnAdShowFingerprint,
            ).forEach { fp ->
                fp.method.addInstructions(0, RETURN_VOID)
            }

            // Strategy E: setVisibility(int) override を各広告 View に追加し GONE 強制
            AD_VIEW_SUPERS.forEach { (cls, sup) ->
                val classType = AD_PKG + cls
                val mutableClass = mutableClassDefByOrNull(classType) ?: return@forEach
                // 既に setVisibility(I)V が存在する場合は二重定義を避ける
                if (mutableClass.methods.any {
                        it.name == "setVisibility" &&
                            it.parameterTypes == listOf("I") &&
                            it.returnType == "V"
                    }
                ) {
                    return@forEach
                }
                val override =
                    ImmutableMethod(
                        classType,
                        "setVisibility",
                        listOf(ImmutableMethodParameter("I", null, null)),
                        "V",
                        AccessFlags.PUBLIC.value,
                        null,
                        null,
                        MutableMethodImplementation(2),
                    ).toMutable()
                override.addInstructions(
                    0,
                    """
                        const/16 p1, 0x8
                        invoke-super {p0, p1}, $sup->setVisibility(I)V
                        return-void
                    """.trimIndent(),
                )
                mutableClass.methods.add(override)
            }

            // Strategy F: バナー広告の生成/表示(g9.a)を return-void で無効化
            // （AdView_Bottom 等の汎用コンテナに YJBannerAdView を addView する経路を断つ。
            //   時刻表・運行情報の下部広告など）
            BannerAdRenderFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
            BannerAdShowFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        }
    }
