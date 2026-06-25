package app.yukulabo.patches.transit.ads

import app.yukulabo.patches.transit.utils.Constants.COMPATIBILITY_TRANSIT
import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

/*
 * Yahoo! 乗換案内 広告 View 除去パッチ
 *
 * 対象クラスは jp.co.yahoo.android.apps.transit.ad パッケージ内の全広告 View。
 * クラス名は APK 内のバイトコードで保持されており（パッケージ名のみ難読化）、
 * definingClass によって一意に特定できる。
 *
 * 除去戦略:
 *   A) 3引数コンストラクタ (index 1 = super()呼び出しの直後) に
 *      setVisibility(GONE) を注入 → 生成直後から非表示にする。
 *      外部コードが binding root の内部ビューを VISIBLE にしても
 *      コンテナ自体が GONE なので表示されない。
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
// Smali snippets
// ---------------------------------------------------------------------------

/** コンテナ View (p0 = this) を GONE にする。コンストラクタの index 1 (super() 直後) に注入する。 */
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
            // Strategy A: 各広告コンテナのコンストラクタ (index 1 = super() 直後) に GONE を注入
            StationAdTopViewFingerprint.method.addInstructions(1, SET_GONE)
            StationAdBottomViewFingerprint.method.addInstructions(1, SET_GONE)
            RailAdViewFingerprint.method.addInstructions(1, SET_GONE)
            MyPageAdViewFingerprint.method.addInstructions(1, SET_GONE)
            DiainfoDetailAdViewFingerprint.method.addInstructions(1, SET_GONE)
            ReservationAdViewFingerprint.method.addInstructions(1, SET_GONE)
            YdnAdViewFingerprint.method.addInstructions(1, SET_GONE)
            YdnAdAutoSizeViewFingerprint.method.addInstructions(1, SET_GONE)
            NaviSearchAdViewCtorFingerprint.method.addInstructions(1, SET_GONE)
            SearchResultListBottomAdViewFingerprint.method.addInstructions(1, SET_GONE)

            // Strategy B: NaviSearchAdView は onAttachedToWindow でも再度 GONE にする
            NaviSearchAdViewAttachFingerprint.method.addInstructions(0, SET_GONE)

            // Strategy C: SearchResultListBottomAdView の StateFlow ハンドラを無効化
            SearchResultBottomSuspend1Fingerprint.method.addInstructions(0, RETURN_UNIT)
            SearchResultBottomSuspend2Fingerprint.method.addInstructions(0, RETURN_UNIT)
        }
    }
