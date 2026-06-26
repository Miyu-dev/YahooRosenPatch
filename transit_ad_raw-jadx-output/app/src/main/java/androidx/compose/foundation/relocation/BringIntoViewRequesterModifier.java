package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import dj.c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewChildModifier;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/j;", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultParent", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewParent;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class BringIntoViewRequesterModifier extends BringIntoViewChildModifier {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier(BringIntoViewParent bringIntoViewParent) {
        super(bringIntoViewParent);
        m.h(bringIntoViewParent, "defaultParent");
    }

    public final Object bringIntoView(final Rect rect, c<? super j> cVar) {
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return j.a;
        }
        Object objBringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new kj.a<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterModifier.bringIntoView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Rect m748invoke() {
                Rect rect2 = rect;
                if (rect2 != null) {
                    return rect2;
                }
                LayoutCoordinates layoutCoordinates2 = this.getLayoutCoordinates();
                if (layoutCoordinates2 != null) {
                    return SizeKt.m2675toRectuvyYCjk(IntSizeKt.m5437toSizeozmzZPI(layoutCoordinates2.mo4239getSizeYbymL2g()));
                }
                return null;
            }
        }, cVar);
        return objBringChildIntoView == CoroutineSingletons.COROUTINE_SUSPENDED ? objBringChildIntoView : j.a;
    }
}
