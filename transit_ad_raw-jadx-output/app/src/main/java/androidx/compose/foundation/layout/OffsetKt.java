package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tø\u0001\u0001\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "absoluteOffset-VpY3zN4", "absoluteOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, final kj.l<? super Density, IntOffset> lVar) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return modifier.then(new OffsetPxModifier(lVar, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "absoluteOffset").set(TypedValues.CycleType.S_WAVE_OFFSET, lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m447absoluteOffsetVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$absoluteOffset");
        return modifier.then(new OffsetModifier(f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "absoluteOffset"), "x", inspectorInfo).set("y", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m448absoluteOffsetVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        return m447absoluteOffsetVpY3zN4(modifier, f, f2);
    }

    public static final Modifier offset(Modifier modifier, final kj.l<? super Density, IntOffset> lVar) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(lVar, TypedValues.CycleType.S_WAVE_OFFSET);
        return modifier.then(new OffsetPxModifier(lVar, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", TypedValues.CycleType.S_WAVE_OFFSET).set(TypedValues.CycleType.S_WAVE_OFFSET, lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    /* JADX INFO: renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m449offsetVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$offset");
        return modifier.then(new OffsetModifier(f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", TypedValues.CycleType.S_WAVE_OFFSET), "x", inspectorInfo).set("y", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m450offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        return m449offsetVpY3zN4(modifier, f, f2);
    }
}
