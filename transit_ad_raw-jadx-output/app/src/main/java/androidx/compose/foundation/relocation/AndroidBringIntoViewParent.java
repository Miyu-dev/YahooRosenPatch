package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import dj.c;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BringIntoViewResponder.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/relocation/AndroidBringIntoViewParent;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "Lkotlin/j;", "bringChildIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkj/a;Ldj/c;)Ljava/lang/Object;", "Landroid/view/View;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class AndroidBringIntoViewParent implements BringIntoViewParent {
    private final View view;

    public AndroidBringIntoViewParent(View view) {
        m.h(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, kj.a<Rect> aVar, c<? super j> cVar) {
        Rect rectM2622translatek4lQ0M;
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect rect = (Rect) aVar.invoke();
        if (rect == null || (rectM2622translatek4lQ0M = rect.m2622translatek4lQ0M(jPositionInRoot)) == null) {
            return j.a;
        }
        this.view.requestRectangleOnScreen(BringIntoViewResponder_androidKt.toRect(rectM2622translatek4lQ0M), false);
        return j.a;
    }
}
