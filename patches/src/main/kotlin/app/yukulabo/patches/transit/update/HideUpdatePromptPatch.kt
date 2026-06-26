package app.yukulabo.patches.transit.update

import app.yukulabo.patches.transit.utils.Constants.COMPATIBILITY_TRANSIT
import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch

/*
 * アップデート促進ポップアップ除去パッチ
 *
 * 「アップデートのお願い / 最新版へのアップデートをお願いします …」という
 * ダイアログは Yahoo の ForceUpdate ライブラリ (jp.co.yahoo.android.forceupdate)
 * が表示する。文言はサーバー応答 (UpdateInfo) 由来でローカル文字列には無い。
 *
 * 表示の流れ (ForceUpdateChecker.kt = 難読化後 h9.l):
 *   - TransitApplication.onCreate がサーバーから更新情報を取得し
 *     a.b.f10502a.f10500c (MutableLiveData<Result<UpdateInfo>>) に格納。
 *   - ActivityLifecycleCallbacks 実装 h9.l$a の onActivityCreated が
 *     各 Activity 生成時にこの LiveData を observe し、
 *   - 観測ラムダ h9.l$a$a.invoke が SUCCESS かつ更新要求時に
 *     AlertDialog (l8.k) を build して show() する。
 *
 * 除去戦略:
 *   h9.l$a.onActivityCreated(Activity, Bundle) を先頭で return-void し、
 *   そもそも LiveData を observe しないようにする → ダイアログは一切出ない。
 *   このクラス (ForceUpdateChecker) の唯一の役目が更新ダイアログ表示なので
 *   副作用は無い（解析で確認済み）。
 */

internal object ForceUpdateObserverFingerprint : Fingerprint(
    definingClass = "Lh9/l\$a;",
    name = "onActivityCreated",
    returnType = "V",
    parameters = listOf("Landroid/app/Activity;", "Landroid/os/Bundle;"),
)

@Suppress("unused")
val hideUpdatePromptPatch =
    bytecodePatch(
        name = "Hide update prompt",
        description = "アップデート促進ポップアップ（アップデートのお願い）を表示しない。",
        default = true,
    ) {
        compatibleWith(COMPATIBILITY_TRANSIT)

        execute {
            // ForceUpdate オブザーバの登録を阻止 → 更新ダイアログが出ない
            ForceUpdateObserverFingerprint.method.addInstructions(0, "return-void")
        }
    }
