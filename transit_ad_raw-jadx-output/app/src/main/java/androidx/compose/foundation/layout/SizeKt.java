package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a-\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010 \u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010!\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010\"\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a!\u0010#\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a-\u0010&\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001f\u001a!\u0010*\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010%\u001a-\u0010,\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010%\u001a)\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aA\u00106\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010%\u001a-\u0010=\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010%\u001a)\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u00105\u001aA\u0010B\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010:\u001a!\u00101\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010%\u001a-\u0010E\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010\u001f\u001a \u0010G\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010H\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010I\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillModifier;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentModifier;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "createFillHeightModifier", "fraction", "", "createFillSizeModifier", "createFillWidthModifier", "createWrapContentHeightModifier", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "createWrapContentSizeModifier", "Landroidx/compose/ui/Alignment;", "createWrapContentWidthModifier", "Landroidx/compose/ui/Alignment$Horizontal;", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "wrapContentSize", "wrapContentWidth", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class SizeKt {
    private static final WrapContentModifier WrapContentHeightCenter;
    private static final WrapContentModifier WrapContentHeightTop;
    private static final WrapContentModifier WrapContentSizeCenter;
    private static final WrapContentModifier WrapContentSizeTopStart;
    private static final WrapContentModifier WrapContentWidthCenter;
    private static final WrapContentModifier WrapContentWidthStart;
    private static final FillModifier FillWholeMaxWidth = createFillWidthModifier(1.0f);
    private static final FillModifier FillWholeMaxHeight = createFillHeightModifier(1.0f);
    private static final FillModifier FillWholeMaxSize = createFillSizeModifier(1.0f);

    static {
        Alignment.Companion companion = Alignment.INSTANCE;
        WrapContentWidthCenter = createWrapContentWidthModifier(companion.getCenterHorizontally(), false);
        WrapContentWidthStart = createWrapContentWidthModifier(companion.getStart(), false);
        WrapContentHeightCenter = createWrapContentHeightModifier(companion.getCenterVertically(), false);
        WrapContentHeightTop = createWrapContentHeightModifier(companion.getTop(), false);
        WrapContentSizeCenter = createWrapContentSizeModifier(companion.getCenter(), false);
        WrapContentSizeTopStart = createWrapContentSizeModifier(companion.getTopStart(), false);
    }

    private static final FillModifier createFillHeightModifier(final float f) {
        return new FillModifier(Direction.Vertical, f, new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillHeightModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$$receiver", "fillMaxHeight").set("fraction", Float.valueOf(f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        });
    }

    private static final FillModifier createFillSizeModifier(final float f) {
        return new FillModifier(Direction.Both, f, new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillSizeModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$$receiver", "fillMaxSize").set("fraction", Float.valueOf(f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        });
    }

    private static final FillModifier createFillWidthModifier(final float f) {
        return new FillModifier(Direction.Horizontal, f, new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillWidthModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$$receiver", "fillMaxWidth").set("fraction", Float.valueOf(f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        });
    }

    private static final WrapContentModifier createWrapContentHeightModifier(final Alignment.Vertical vertical, final boolean z) {
        return new WrapContentModifier(Direction.Vertical, z, new p<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.1
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return IntOffset.m5376boximpl(m512invoke5SAbXVA(((IntSize) obj).getPackedValue(), (LayoutDirection) obj2));
            }

            /* JADX INFO: renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m512invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "<anonymous parameter 1>");
                return IntOffsetKt.IntOffset(0, vertical.align(0, IntSize.m5426getHeightimpl(j)));
            }
        }, vertical, new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$$receiver", "wrapContentHeight").set("align", vertical);
                inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        });
    }

    private static final WrapContentModifier createWrapContentSizeModifier(final Alignment alignment, final boolean z) {
        return new WrapContentModifier(Direction.Both, z, new p<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.1
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return IntOffset.m5376boximpl(m513invoke5SAbXVA(((IntSize) obj).getPackedValue(), (LayoutDirection) obj2));
            }

            /* JADX INFO: renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m513invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                return alignment.mo2476alignKFBX0sM(IntSize.INSTANCE.m5432getZeroYbymL2g(), j, layoutDirection);
            }
        }, alignment, new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$$receiver", "wrapContentSize").set("align", alignment);
                inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        });
    }

    private static final WrapContentModifier createWrapContentWidthModifier(final Alignment.Horizontal horizontal, final boolean z) {
        return new WrapContentModifier(Direction.Horizontal, z, new p<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.1
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return IntOffset.m5376boximpl(m514invoke5SAbXVA(((IntSize) obj).getPackedValue(), (LayoutDirection) obj2));
            }

            /* JADX INFO: renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m514invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                return IntOffsetKt.IntOffset(horizontal.align(0, IntSize.m5427getWidthimpl(j), layoutDirection), 0);
            }
        }, horizontal, new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$$receiver", "wrapContentWidth").set("align", horizontal);
                inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        });
    }

    @Stable
    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m488defaultMinSizeVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$defaultMinSize");
        return modifier.then(new UnspecifiedConstraintsModifier(f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$defaultMinSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "defaultMinSize"), "minWidth", inspectorInfo).set("minHeight", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m489defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m488defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    @Stable
    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        return modifier.then((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxHeight : createFillHeightModifier(f));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    @Stable
    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        return modifier.then((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxSize : createFillSizeModifier(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    @Stable
    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        return modifier.then((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxWidth : createFillWidthModifier(f));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    @Stable
    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m490height3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$height");
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* JADX INFO: renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m491heightInVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$heightIn");
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "heightIn"), "min", inspectorInfo).set("max", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m492heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m491heightInVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m493requiredHeight3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredHeight");
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m494requiredHeightInVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredHeightIn");
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "requiredHeightIn"), "min", inspectorInfo).set("max", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m495requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m494requiredHeightInVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m496requiredSize3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredSize");
        return modifier.then(new SizeModifier(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* JADX INFO: renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m497requiredSize6HolHcs(Modifier modifier, long j) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredSize");
        return m498requiredSizeVpY3zN4(modifier, DpSize.m5365getWidthD9Ej5fM(j), DpSize.m5363getHeightD9Ej5fM(j));
    }

    @Stable
    /* JADX INFO: renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m498requiredSizeVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredSize");
        return modifier.then(new SizeModifier(f, f2, f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "requiredSize"), "width", inspectorInfo).set("height", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m499requiredSizeInqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredSizeIn");
        return modifier.then(new SizeModifier(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f3, androidx.appcompat.view.menu.a.b(f2, androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "requiredSizeIn"), "minWidth", inspectorInfo), "minHeight", inspectorInfo), "maxWidth", inspectorInfo).set("maxHeight", Dp.m5265boximpl(f4));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m500requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m499requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    /* JADX INFO: renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m501requiredWidth3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredWidth");
        return modifier.then(new SizeModifier(f, 0.0f, f, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m502requiredWidthInVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$requiredWidthIn");
        return modifier.then(new SizeModifier(f, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "requiredWidthIn"), "min", inspectorInfo).set("max", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m503requiredWidthInVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m502requiredWidthInVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m504size3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$size");
        return modifier.then(new SizeModifier(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* JADX INFO: renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m505size6HolHcs(Modifier modifier, long j) {
        kotlin.jvm.internal.m.h(modifier, "$this$size");
        return m506sizeVpY3zN4(modifier, DpSize.m5365getWidthD9Ej5fM(j), DpSize.m5363getHeightD9Ej5fM(j));
    }

    @Stable
    /* JADX INFO: renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m506sizeVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$size");
        return modifier.then(new SizeModifier(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "size"), "width", inspectorInfo).set("height", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* JADX INFO: renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m507sizeInqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        kotlin.jvm.internal.m.h(modifier, "$this$sizeIn");
        return modifier.then(new SizeModifier(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f3, androidx.appcompat.view.menu.a.b(f2, androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "sizeIn"), "minWidth", inspectorInfo), "minHeight", inspectorInfo), "maxWidth", inspectorInfo).set("maxHeight", Dp.m5265boximpl(f4));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m508sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m507sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m509width3ABfNKs(Modifier modifier, final float f) {
        kotlin.jvm.internal.m.h(modifier, "$this$width");
        return modifier.then(new SizeModifier(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m5265boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* JADX INFO: renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m510widthInVpY3zN4(Modifier modifier, final float f, final float f2) {
        kotlin.jvm.internal.m.h(modifier, "$this$widthIn");
        return modifier.then(new SizeModifier(f, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                androidx.appcompat.view.menu.a.b(f, a.b.d(inspectorInfo, "$this$null", "widthIn"), "min", inspectorInfo).set("max", Dp.m5265boximpl(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m511widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM();
        }
        return m510widthInVpY3zN4(modifier, f, f2);
    }

    @Stable
    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(vertical, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!kotlin.jvm.internal.m.c(vertical, companion.getCenterVertically()) || z) ? (!kotlin.jvm.internal.m.c(vertical, companion.getTop()) || z) ? createWrapContentHeightModifier(vertical, z) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    @Stable
    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(alignment, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!kotlin.jvm.internal.m.c(alignment, companion.getCenter()) || z) ? (!kotlin.jvm.internal.m.c(alignment, companion.getTopStart()) || z) ? createWrapContentSizeModifier(alignment, z) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    @Stable
    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(horizontal, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!kotlin.jvm.internal.m.c(horizontal, companion.getCenterHorizontally()) || z) ? (!kotlin.jvm.internal.m.c(horizontal, companion.getStart()) || z) ? createWrapContentWidthModifier(horizontal, z) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }
}
