package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class PaddingKt {
    @Stable
    /* JADX INFO: renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m454PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    @Stable
    /* JADX INFO: renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m455PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValuesImpl(f, f2, f, f2, null);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m456PaddingValuesYgX7TsA$default(float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        return m455PaddingValuesYgX7TsA(f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m457PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4, null);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m458PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.m5267constructorimpl(0);
        }
        return m457PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @Stable
    /* JADX INFO: renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m459absolutePaddingqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        kotlin.jvm.internal.m.h(modifier, "$this$absolutePadding");
        return modifier.then(new PaddingModifier(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f3, androidx.appcompat.view.menu.a.b(f2, androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "absolutePadding"), "left", inspectorInfo), "top", inspectorInfo), "right", inspectorInfo).set("bottom", Dp.m5265boximpl(f4));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m460absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.m5267constructorimpl(0);
        }
        return m459absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.m.h(paddingValues, "<this>");
        kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo443calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo442calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.m.h(paddingValues, "<this>");
        kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo442calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo443calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "padding").set("paddingValues", paddingValues);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    /* JADX INFO: renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m461padding3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$padding");
        return modifier.then(new PaddingModifier(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.m.h(inspectorInfo, "$this$null");
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* JADX INFO: renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m462paddingVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$padding");
        return modifier.then(new PaddingModifier(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "padding"), "horizontal", inspectorInfo).set("vertical", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m463paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        return m462paddingVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m464paddingqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        kotlin.jvm.internal.m.h(modifier, "$this$padding");
        return modifier.then(new PaddingModifier(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f3, androidx.appcompat.view.menu.a.b(f2, androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "padding"), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", Dp.m5265boximpl(f4));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m465paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.m5267constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.m5267constructorimpl(0);
        }
        return m464paddingqDBjuR0(modifier, f, f2, f3, f4);
    }
}
