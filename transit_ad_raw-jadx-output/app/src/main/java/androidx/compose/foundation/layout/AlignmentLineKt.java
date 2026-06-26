package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m385alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f2, Measurable measurable, long j) {
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i2 = placeableMo4235measureBRTryo0.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo4235measureBRTryo0.getHeight() : placeableMo4235measureBRTryo0.getWidth();
        int iM5234getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m5234getMaxHeightimpl(j) : Constraints.m5235getMaxWidthimpl(j);
        Dp.Companion companion = Dp.INSTANCE;
        int i3 = iM5234getMaxHeightimpl - height;
        final int i4 = a.l.i((!Dp.m5272equalsimpl0(f, companion.m5287getUnspecifiedD9Ej5fM()) ? measureScope.mo342roundToPx0680j_4(f) : 0) - i2, 0, i3);
        final int i5 = a.l.i(((!Dp.m5272equalsimpl0(f2, companion.m5287getUnspecifiedD9Ej5fM()) ? measureScope.mo342roundToPx0680j_4(f2) : 0) - height) + i2, 0, i3 - i4);
        final int width = getHorizontal(alignmentLine) ? placeableMo4235measureBRTryo0.getWidth() : Math.max(placeableMo4235measureBRTryo0.getWidth() + i4 + i5, Constraints.m5237getMinWidthimpl(j));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo4235measureBRTryo0.getHeight() + i4 + i5, Constraints.m5236getMinHeightimpl(j)) : placeableMo4235measureBRTryo0.getHeight();
        return MeasureScope.CC.p(measureScope, width, iMax, null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return kotlin.j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                int width2;
                kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !Dp.m5272equalsimpl0(f, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()) ? i4 : (width - i5) - placeableMo4235measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !Dp.m5272equalsimpl0(f, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()) ? i4 : (iMax - i5) - placeableMo4235measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    /* JADX INFO: renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m386paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$paddingFrom");
        kotlin.jvm.internal.m.h(alignmentLine, "alignmentLine");
        return modifier.then(new AlignmentLineOffsetDp(alignmentLine, f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "paddingFrom").set("alignmentLine", alignmentLine);
                androidx.appcompat.view.menu.a.b(f, inspectorInfo.getProperties(), "before", inspectorInfo).set("after", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m387paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m386paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m388paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, final long j, final long j2) {
        kotlin.jvm.internal.m.h(modifier, "$this$paddingFrom");
        kotlin.jvm.internal.m.h(alignmentLine, "alignmentLine");
        return modifier.then(new AlignmentLineOffsetTextUnit(alignmentLine, j, j2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "paddingFrom").set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", TextUnit.m5438boximpl(j));
                inspectorInfo.getProperties().set("after", TextUnit.m5438boximpl(j2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m389paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = TextUnit.INSTANCE.m5459getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = TextUnit.INSTANCE.m5459getUnspecifiedXSAIIZE();
        }
        return m388paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    @Stable
    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m390paddingFromBaselineVpY3zN4(Modifier modifier, float f, float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.INSTANCE;
        return modifier.then(!Dp.m5272equalsimpl0(f, companion.m5287getUnspecifiedD9Ej5fM()) ? m387paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null) : Modifier.INSTANCE).then(!Dp.m5272equalsimpl0(f2, companion.m5287getUnspecifiedD9Ej5fM()) ? m387paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m391paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m390paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m392paddingFromBaselinewCyjxdI(Modifier modifier, long j, long j2) {
        kotlin.jvm.internal.m.h(modifier, "$this$paddingFromBaseline");
        return modifier.then(!TextUnitKt.m5466isUnspecifiedR2X_6o(j) ? m389paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null) : Modifier.INSTANCE).then(!TextUnitKt.m5466isUnspecifiedR2X_6o(j2) ? m389paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m393paddingFromBaselinewCyjxdI$default(Modifier modifier, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = TextUnit.INSTANCE.m5459getUnspecifiedXSAIIZE();
        }
        if ((i2 & 2) != 0) {
            j2 = TextUnit.INSTANCE.m5459getUnspecifiedXSAIIZE();
        }
        return m392paddingFromBaselinewCyjxdI(modifier, j, j2);
    }
}
