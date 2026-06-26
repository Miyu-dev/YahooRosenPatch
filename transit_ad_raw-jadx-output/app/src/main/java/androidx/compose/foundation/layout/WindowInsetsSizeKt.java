package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kj.p;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsetsSize.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class WindowInsetsSizeKt {
    @Stable
    public static final Modifier windowInsetsBottomHeight(Modifier modifier, final WindowInsets windowInsets) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(windowInsets, "insets");
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "insetsBottomHeight").set("insets", windowInsets);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new p<WindowInsets, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                kotlin.jvm.internal.m.h(windowInsets2, "$this$$receiver");
                kotlin.jvm.internal.m.h(density, "it");
                return Integer.valueOf(windowInsets2.getBottom(density));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsEndWidth(Modifier modifier, final WindowInsets windowInsets) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(windowInsets, "insets");
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "insetsEndWidth").set("insets", windowInsets);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<WindowInsets, LayoutDirection, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                kotlin.jvm.internal.m.h(windowInsets2, "$this$$receiver");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(density, "density");
                return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsStartWidth(Modifier modifier, final WindowInsets windowInsets) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(windowInsets, "insets");
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "insetsStartWidth").set("insets", windowInsets);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<WindowInsets, LayoutDirection, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                kotlin.jvm.internal.m.h(windowInsets2, "$this$$receiver");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(density, "density");
                return Integer.valueOf(layoutDirection == LayoutDirection.Ltr ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsTopHeight(Modifier modifier, final WindowInsets windowInsets) {
        kotlin.jvm.internal.m.h(modifier, "<this>");
        kotlin.jvm.internal.m.h(windowInsets, "insets");
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj.l<InspectorInfo, kotlin.j>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "insetsTopHeight").set("insets", windowInsets);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return kotlin.j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new p<WindowInsets, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                kotlin.jvm.internal.m.h(windowInsets2, "$this$$receiver");
                kotlin.jvm.internal.m.h(density, "it");
                return Integer.valueOf(windowInsets2.getTop(density));
            }
        }));
    }
}
