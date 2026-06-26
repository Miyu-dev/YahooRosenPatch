package androidx.compose.foundation;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(androidx.appcompat.R.styleable.AppCompatTheme_actionModeStyle)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroid/graphics/Rect;", "calcBounds", "findRoot", "coordinates", "Lkotlin/j;", "onGloballyPositioned", "removeRect", "newRect", "replaceRect", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lkotlin/Function1;", "exclusion", "Lkj/l;", "getExclusion", "()Lkj/l;", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "(Landroid/graphics/Rect;)V", "<init>", "(Landroid/view/View;Lkj/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    private final l<LayoutCoordinates, Rect> exclusion;
    private android.graphics.Rect rect;
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureModifier(View view, l<? super LayoutCoordinates, Rect> lVar) {
        m.h(view, "view");
        this.view = view;
        this.exclusion = lVar;
    }

    private final android.graphics.Rect calcBounds(LayoutCoordinates layoutCoordinates, Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRoot = findRoot(layoutCoordinates);
        long jMo4240localPositionOfR5De75A = layoutCoordinatesFindRoot.mo4240localPositionOfR5De75A(layoutCoordinates, rect.m2620getTopLeftF1C5BW0());
        long jMo4240localPositionOfR5De75A2 = layoutCoordinatesFindRoot.mo4240localPositionOfR5De75A(layoutCoordinates, rect.m2621getTopRightF1C5BW0());
        long jMo4240localPositionOfR5De75A3 = layoutCoordinatesFindRoot.mo4240localPositionOfR5De75A(layoutCoordinates, rect.m2613getBottomLeftF1C5BW0());
        long jMo4240localPositionOfR5De75A4 = layoutCoordinatesFindRoot.mo4240localPositionOfR5De75A(layoutCoordinates, rect.m2614getBottomRightF1C5BW0());
        return new android.graphics.Rect(a.f.f0(bk.f.r(Offset.m2585getXimpl(jMo4240localPositionOfR5De75A), new float[]{Offset.m2585getXimpl(jMo4240localPositionOfR5De75A2), Offset.m2585getXimpl(jMo4240localPositionOfR5De75A3), Offset.m2585getXimpl(jMo4240localPositionOfR5De75A4)})), a.f.f0(bk.f.r(Offset.m2586getYimpl(jMo4240localPositionOfR5De75A), new float[]{Offset.m2586getYimpl(jMo4240localPositionOfR5De75A2), Offset.m2586getYimpl(jMo4240localPositionOfR5De75A3), Offset.m2586getYimpl(jMo4240localPositionOfR5De75A4)})), a.f.f0(bk.f.q(Offset.m2585getXimpl(jMo4240localPositionOfR5De75A), new float[]{Offset.m2585getXimpl(jMo4240localPositionOfR5De75A2), Offset.m2585getXimpl(jMo4240localPositionOfR5De75A3), Offset.m2585getXimpl(jMo4240localPositionOfR5De75A4)})), a.f.f0(bk.f.q(Offset.m2586getYimpl(jMo4240localPositionOfR5De75A), new float[]{Offset.m2586getYimpl(jMo4240localPositionOfR5De75A2), Offset.m2586getYimpl(jMo4240localPositionOfR5De75A3), Offset.m2586getYimpl(jMo4240localPositionOfR5De75A4)})));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates == null) {
                return layoutCoordinates3;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final l<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        android.graphics.Rect rectCalcBounds;
        m.h(layoutCoordinates, "coordinates");
        l<LayoutCoordinates, Rect> lVar = this.exclusion;
        if (lVar == null) {
            Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rectCalcBounds = new android.graphics.Rect(a.f.f0(rectBoundsInRoot.getLeft()), a.f.f0(rectBoundsInRoot.getTop()), a.f.f0(rectBoundsInRoot.getRight()), a.f.f0(rectBoundsInRoot.getBottom()));
        } else {
            rectCalcBounds = calcBounds(layoutCoordinates, (Rect) lVar.invoke(layoutCoordinates));
        }
        replaceRect(rectCalcBounds);
    }

    public final void removeRect() {
        replaceRect(null);
    }

    public final void replaceRect(android.graphics.Rect rect) {
        boolean z = false;
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        List systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        m.g(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        android.graphics.Rect rect2 = this.rect;
        if (rect2 != null) {
            mutableVector.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            z = true;
        }
        if (z) {
            mutableVector.add(rect);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = rect;
    }

    public final void setRect(android.graphics.Rect rect) {
        this.rect = rect;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
