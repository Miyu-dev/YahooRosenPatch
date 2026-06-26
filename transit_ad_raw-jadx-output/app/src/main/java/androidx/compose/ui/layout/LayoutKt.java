package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kj.p;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\t\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\t\u0010\u000b\u001a@\u0010\t\u001a\u00020\u00012\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\t\u0010\u000f\u001a=\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Layout", "(Lkj/p;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "", "contents", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkj/p;", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "materializerOf", "(Landroidx/compose/ui/Modifier;)Lkj/q;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkj/p;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class LayoutKt {
    @Composable
    @UiComposable
    public static final void Layout(p<? super Composer, ? super Integer, kotlin.j> pVar, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i2, int i3) {
        kotlin.jvm.internal.m.h(pVar, "content");
        kotlin.jvm.internal.m.h(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(-1323940314);
        if ((i3 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        kj.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j> qVarMaterializerOf = materializerOf(modifier);
        int i4 = ((i2 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer);
        Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
        Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        androidx.appcompat.graphics.drawable.a.g((i4 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, qVarMaterializerOf, SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composer)), composer, 2058660585);
        pVar.invoke(composer, Integer.valueOf((i4 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void MultiMeasureLayout(Modifier modifier, final p<? super Composer, ? super Integer, kotlin.j> pVar, final MeasurePolicy measurePolicy, Composer composer, final int i2, final int i3) {
        int i4;
        kotlin.jvm.internal.m.h(pVar, "content");
        kotlin.jvm.internal.m.h(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(measurePolicy) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i4, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:203)");
            }
            Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifier);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i6 = ((i4 << 3) & 896) | 6;
            composerStartRestartGroup.startReplaceableGroup(-692256719);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m2444setimpl(composerM2437constructorimpl, modifierMaterialize, companion.getSetModifier());
            Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
            Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m2441initimpl(composerM2437constructorimpl, new kj.l<LayoutNode, kotlin.j>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return kotlin.j.a;
                }

                public final void invoke(LayoutNode layoutNode) {
                    kotlin.jvm.internal.m.h(layoutNode, "$this$init");
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, kotlin.j>() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return kotlin.j.a;
            }

            public final void invoke(Composer composer2, int i7) {
                LayoutKt.MultiMeasureLayout(modifier2, pVar, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    public static final p<Composer, Integer, kotlin.j> combineAsVirtualLayouts(final List<? extends p<? super Composer, ? super Integer, kotlin.j>> list) {
        kotlin.jvm.internal.m.h(list, "contents");
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new p<Composer, Integer, kotlin.j>() { // from class: androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return kotlin.j.a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i2) {
                if ((i2 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953651383, i2, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
                }
                List<p<Composer, Integer, kotlin.j>> list2 = list;
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    p<Composer, Integer, kotlin.j> pVar = list2.get(i3);
                    kj.a<ComposeUiNode> virtualConstructor = ComposeUiNode.INSTANCE.getVirtualConstructor();
                    composer.startReplaceableGroup(-692256719);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(virtualConstructor);
                    } else {
                        composer.useNode();
                    }
                    Updater.m2437constructorimpl(composer);
                    pVar.invoke(composer, 0);
                    composer.endNode();
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j> materializerOf(final Modifier modifier) {
        kotlin.jvm.internal.m.h(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j>() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m4246invokeDeg8D_g(((SkippableUpdater) obj).getComposer(), (Composer) obj2, ((Number) obj3).intValue());
                return kotlin.j.a;
            }

            @Composable
            /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m4246invokeDeg8D_g(Composer composer, Composer composer2, int i2) {
                kotlin.jvm.internal.m.h(composer, "$this$null");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586257396, i2, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)");
                }
                Modifier modifierMaterialize = ComposedModifierKt.materialize(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Updater.m2444setimpl(Updater.m2437constructorimpl(composer), modifierMaterialize, ComposeUiNode.INSTANCE.getSetModifier());
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @Composable
    @UiComposable
    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i2, int i3) {
        kotlin.jvm.internal.m.h(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(544976794);
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier modifierMaterialize = ComposedModifierKt.materialize(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final kj.a<ComposeUiNode> constructor = companion.getConstructor();
        composer.startReplaceableGroup(1405779621);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new kj.a<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                public final ComposeUiNode invoke() {
                    return constructor.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer);
        Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
        Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m2444setimpl(composerM2437constructorimpl, modifierMaterialize, companion.getSetModifier());
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void Layout(List<? extends p<? super Composer, ? super Integer, kotlin.j>> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, Composer composer, int i2, int i3) {
        kotlin.jvm.internal.m.h(list, "contents");
        kotlin.jvm.internal.m.h(multiContentMeasurePolicy, "measurePolicy");
        composer.startReplaceableGroup(1399185516);
        if ((i3 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        p<Composer, Integer, kotlin.j> pVarCombineAsVirtualLayouts = combineAsVirtualLayouts(list);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(multiContentMeasurePolicy);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        int i4 = i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Density density = (Density) v.d(composer, -1323940314);
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        kj.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, kotlin.j> qVarMaterializerOf = materializerOf(modifier);
        int i5 = ((i4 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer);
        Updater.m2444setimpl(composerM2437constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2444setimpl(composerM2437constructorimpl, density, companion.getSetDensity());
        Updater.m2444setimpl(composerM2437constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m2444setimpl(composerM2437constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        androidx.appcompat.graphics.drawable.a.g((i5 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, qVarMaterializerOf, SkippableUpdater.m2425boximpl(SkippableUpdater.m2426constructorimpl(composer)), composer, 2058660585);
        androidx.appcompat.view.menu.a.l((i5 >> 9) & 14, pVarCombineAsVirtualLayouts, composer);
    }
}
