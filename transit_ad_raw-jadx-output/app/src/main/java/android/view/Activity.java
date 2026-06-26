package android.view;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import dj.c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: renamed from: androidx.activity.PipHintTrackerKt, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Lkotlin/j;", "trackPipAnimationHintView", "(Landroid/app/Activity;Landroid/view/View;Ldj/c;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0})
public final class Activity {
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public static final Object trackPipAnimationHintView(final android.app.Activity activity, View view, c<? super j> cVar) {
        Object objCollect = FlowKt.callbackFlow(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new FlowCollector() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar2) {
                return emit((android.graphics.Rect) obj, (c<? super j>) cVar2);
            }

            public final Object emit(android.graphics.Rect rect, c<? super j> cVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return j.a;
            }
        }, cVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect trackPipAnimationHintView$positionInWindow(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
