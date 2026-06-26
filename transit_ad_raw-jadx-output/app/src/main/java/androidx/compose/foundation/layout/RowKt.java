package androidx.compose.foundation.layout;

import androidx.appcompat.widget.v;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kj.q;
import kj.s;
import kotlin.Metadata;

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aJ\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "Row", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultRowMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class RowKt {
    private static final MeasurePolicy DefaultRowMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        float spacing = Arrangement.INSTANCE.getStart().getSpacing();
        CrossAxisAlignment crossAxisAlignmentVertical$foundation_layout_release = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(Alignment.INSTANCE.getTop());
        DefaultRowMeasurePolicy = RowColumnImplKt.m482rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new s<Integer, int[], LayoutDirection, Density, int[], kotlin.j>() { // from class: androidx.compose.foundation.layout.RowKt$DefaultRowMeasurePolicy$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
                return kotlin.j.a;
            }

            public final void invoke(int i2, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                kotlin.jvm.internal.m.h(iArr, "size");
                kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.m.h(density, "density");
                kotlin.jvm.internal.m.h(iArr2, "outPosition");
                Arrangement.INSTANCE.getStart().arrange(density, i2, iArr, layoutDirection, iArr2);
            }
        }, spacing, SizeMode.Wrap, crossAxisAlignmentVertical$foundation_layout_release);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Row(Modifier modifier, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, q<? super RowScope, ? super Composer, ? super Integer, kotlin.j> qVar, Composer composer, int i2, int i3) {
        kotlin.jvm.internal.m.h(qVar, "content");
        composer.startReplaceableGroup(693286680);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = i2 >> 3;
        MeasurePolicy measurePolicyRowMeasurePolicy = rowMeasurePolicy((i3 & 2) != 0 ? Arrangement.INSTANCE.getStart() : horizontal, (i3 & 4) != 0 ? Alignment.INSTANCE.getTop() : vertical, composer, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14));
        int i5 = (i2 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Density density = (Density) v.d(composer, -1323940314);
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        kj.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j> qVarMaterializerOf = LayoutKt.materializerOf(modifier2);
        int i6 = ((i5 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer);
        androidx.appcompat.graphics.drawable.a.g((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer, composer), composer, 2058660585);
        qVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    @Composable
    public static final MeasurePolicy rowMeasurePolicy(final Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Composer composer, int i2) {
        MeasurePolicy measurePolicy;
        kotlin.jvm.internal.m.h(horizontal, "horizontalArrangement");
        kotlin.jvm.internal.m.h(vertical, "verticalAlignment");
        composer.startReplaceableGroup(-837807694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i2, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:102)");
        }
        if (kotlin.jvm.internal.m.c(horizontal, Arrangement.INSTANCE.getStart()) && kotlin.jvm.internal.m.c(vertical, Alignment.INSTANCE.getTop())) {
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(horizontal) | composer.changed(vertical);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float spacing = horizontal.getSpacing();
                CrossAxisAlignment crossAxisAlignmentVertical$foundation_layout_release = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical);
                objRememberedValue = RowColumnImplKt.m482rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new s<Integer, int[], LayoutDirection, Density, int[], kotlin.j>() { // from class: androidx.compose.foundation.layout.RowKt$rowMeasurePolicy$1$1
                    {
                        super(5);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
                        return kotlin.j.a;
                    }

                    public final void invoke(int i3, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                        kotlin.jvm.internal.m.h(iArr, "size");
                        kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
                        kotlin.jvm.internal.m.h(density, "density");
                        kotlin.jvm.internal.m.h(iArr2, "outPosition");
                        horizontal.arrange(density, i3, iArr, layoutDirection, iArr2);
                    }
                }, spacing, SizeMode.Wrap, crossAxisAlignmentVertical$foundation_layout_release);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }
}
