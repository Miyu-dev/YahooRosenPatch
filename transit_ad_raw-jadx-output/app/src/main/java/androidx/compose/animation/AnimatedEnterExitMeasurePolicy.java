package androidx.compose.animation;

import a.f;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;
import uj.s;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "scope", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        m.h(animatedVisibilityScopeImpl, "scope");
        this.scope = animatedVisibilityScopeImpl;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, final int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.maxIntrinsicHeight.1
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
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.maxIntrinsicWidth.1
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

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo34measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object obj;
        m.h(measureScope, "$this$measure");
        m.h(list, "measurables");
        List<? extends Measurable> list2 = list;
        final ArrayList arrayList = new ArrayList(jj.a.Q0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo4235measureBRTryo0(j));
        }
        Object obj2 = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int I = f.I(arrayList);
            if (1 <= I) {
                int i3 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int width2 = ((Placeable) obj3).getWidth();
                    if (width < width2) {
                        obj = obj3;
                        width = width2;
                    }
                    if (i3 == I) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int height = ((Placeable) obj4).getHeight();
            int I2 = f.I(arrayList);
            if (1 <= I2) {
                while (true) {
                    Object obj5 = arrayList.get(i2);
                    int height2 = ((Placeable) obj5).getHeight();
                    if (height < height2) {
                        obj4 = obj5;
                        height = height2;
                    }
                    if (i2 == I2) {
                        break;
                    }
                    i2++;
                }
            }
            obj2 = obj4;
        }
        Placeable placeable2 = (Placeable) obj2;
        int height3 = placeable2 != null ? placeable2.getHeight() : 0;
        this.scope.getTargetSize$animation_release().setValue(IntSize.m5419boximpl(IntSizeKt.IntSize(width3, height3)));
        return MeasureScope.CC.p(measureScope, width3, height3, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                invoke((Placeable.PlacementScope) obj6);
                return j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                m.h(placementScope, "$this$layout");
                List<Placeable> list3 = arrayList;
                int size = list3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Placeable.PlacementScope.place$default(placementScope, list3.get(i4), 0, 0, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, final int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.minIntrinsicHeight.1
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
        Integer num = (Integer) s.C(s.A(y.i1(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.minIntrinsicWidth.1
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
