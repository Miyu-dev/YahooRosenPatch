package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.e;
import qj.f;
import uj.s;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/compose/animation/AnimatedContentScope;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentScope<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentScope<?> animatedContentScope) {
        m.h(animatedContentScope, "rootScope");
        this.rootScope = animatedContentScope;
    }

    public final AnimatedContentScope<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, final int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.maxIntrinsicHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
                m.h(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, final int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.maxIntrinsicWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
                m.h(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        m.h(measureScope, "$this$measure");
        m.h(list, "measurables");
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            placeable = null;
            if (i2 >= size2) {
                break;
            }
            Measurable measurable = list.get(i2);
            Object parentData = measurable.getParentData();
            AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                placeableArr[i2] = measurable.mo4235measureBRTryo0(j);
            }
            i2++;
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Measurable measurable2 = list.get(i3);
            if (placeableArr[i3] == null) {
                placeableArr[i3] = measurable2.mo4235measureBRTryo0(j);
            }
        }
        if ((size == 0) == true) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int i4 = size - 1;
            if (i4 != 0) {
                int width = placeable2 != null ? placeable2.getWidth() : 0;
                e eVarD = new f(1, i4).d();
                while (eVarD.c) {
                    Placeable placeable3 = placeableArr[eVarD.nextInt()];
                    int width2 = placeable3 != null ? placeable3.getWidth() : 0;
                    if (width < width2) {
                        placeable2 = placeable3;
                        width = width2;
                    }
                }
            }
        }
        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if ((size == 0) == false) {
            placeable = placeableArr[0];
            int i5 = size - 1;
            if (i5 != 0) {
                int height = placeable != null ? placeable.getHeight() : 0;
                e eVarD2 = new f(1, i5).d();
                while (eVarD2.c) {
                    Placeable placeable4 = placeableArr[eVarD2.nextInt()];
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (height < height2) {
                        placeable = placeable4;
                        height = height2;
                    }
                }
            }
        }
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        this.rootScope.m44setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        return MeasureScope.CC.p(measureScope, width3, height3, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                m.h(placementScope, "$this$layout");
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i6 = width3;
                int i7 = height3;
                for (Placeable placeable5 : placeableArr2) {
                    if (placeable5 != null) {
                        long jMo2476alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo2476alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i6, i7), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m5385getXimpl(jMo2476alignKFBX0sM), IntOffset.m5386getYimpl(jMo2476alignKFBX0sM), 0.0f, 4, null);
                    }
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, final int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.minIntrinsicHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
                m.h(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, final int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.minIntrinsicWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
                m.h(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
