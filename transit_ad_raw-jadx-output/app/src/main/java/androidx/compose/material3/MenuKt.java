package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0082\u0001\u0010\u001b\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0002\b\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f¢\u0006\u0002\b\u000b2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f¢\u0006\u0002\b\u000b2\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u001d\u0010#\u001a\u00020\"8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0017\u0010'\u001a\u00020\"8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010$\"\u001d\u0010(\u001a\u00020\"8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&\"\u0017\u0010*\u001a\u00020\"8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b*\u0010$\"\u0017\u0010+\u001a\u00020\"8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b+\u0010$\"\u0014\u0010-\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "DropdownMenuItemContent", "(Lkj/p;Lkj/a;Landroidx/compose/ui/Modifier;Lkj/p;Lkj/p;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "MenuVerticalMargin", "F", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "", "InTransitionDuration", "I", "OutTransitionDuration", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    private static final float MenuVerticalMargin = Dp.m5267constructorimpl(48);
    private static final float DropdownMenuItemHorizontalPadding = Dp.m5267constructorimpl(12);
    private static final float DropdownMenuVerticalPadding = Dp.m5267constructorimpl(8);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m5267constructorimpl(androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m5267constructorimpl(280);

    /* JADX WARN: Removed duplicated region for block: B:100:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuContent(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r22, final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r23, androidx.compose.ui.Modifier r24, final kj.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(final p<? super Composer, ? super Integer, j> pVar, final kj.a<j> aVar, final Modifier modifier, final p<? super Composer, ? super Integer, j> pVar2, final p<? super Composer, ? super Integer, j> pVar3, final boolean z, final MenuItemColors menuItemColors, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        m.h(pVar, "text");
        m.h(aVar, "onClick");
        m.h(modifier, "modifier");
        m.h(menuItemColors, "colors");
        m.h(paddingValues, "contentPadding");
        m.h(mutableInteractionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1564716777);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar2) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(menuItemColors) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
        }
        final int i4 = i3;
        if ((191739611 & i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i4, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m204clickableO2vRcR0$default(modifier, mutableInteractionSource, RippleKt.m1015rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z, null, null, aVar, 24, null), 0.0f, 1, null);
            float f = DropdownMenuItemDefaultMinWidth;
            float f2 = DropdownMenuItemDefaultMaxWidth;
            MenuTokens menuTokens = MenuTokens.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m508sizeInqDBjuR0$default(modifierFillMaxWidth$default, f, menuTokens.m2120getListItemContainerHeightD9Ej5fM(), f2, 0.0f, 8, null), paddingValues);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierPadding);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyRowMeasurePolicy, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), menuTokens.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1065051884, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1065051884, i5, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:171)");
                    }
                    composer3.startReplaceableGroup(1426254055);
                    if (pVar2 != null) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        MenuItemColors menuItemColors2 = menuItemColors;
                        boolean z2 = z;
                        int i6 = i4;
                        ProvidedValue[] providedValueArr = {localContentColor.provides(menuItemColors2.leadingIconColor$material3_release(z2, composer3, ((i6 >> 15) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i6 >> 15) & 14)).getValue())};
                        final p<Composer, Integer, j> pVar4 = pVar2;
                        final int i7 = i4;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 2035552199, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return j.a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2035552199, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:175)");
                                }
                                Modifier modifierM489defaultMinSizeVpY3zN4$default = SizeKt.m489defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, MenuTokens.INSTANCE.m2121getListItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                p<Composer, Integer, j> pVar5 = pVar4;
                                int i9 = i7;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composer4, 0, -1323940314);
                                Density density2 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                kj.a<ComposeUiNode> constructor2 = companion2.getConstructor();
                                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM489defaultMinSizeVpY3zN4$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer4);
                                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (androidx.compose.animation.b.m((i9 >> 9) & 14, pVar5, composer4)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                    }
                    composer3.endReplaceableGroup();
                    ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
                    MenuItemColors menuItemColors3 = menuItemColors;
                    boolean z3 = z;
                    int i8 = i4;
                    ProvidedValue[] providedValueArr2 = {localContentColor2.provides(menuItemColors3.textColor$material3_release(z3, composer3, ((i8 >> 15) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i8 >> 15) & 14)).getValue())};
                    final RowScope rowScope = rowScopeInstance;
                    final p<Composer, Integer, j> pVar5 = pVar2;
                    final p<Composer, Integer, j> pVar6 = pVar3;
                    final p<Composer, Integer, j> pVar7 = pVar;
                    final int i9 = i4;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer3, -1728894036, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return j.a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1728894036, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:181)");
                            }
                            Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(e.a(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), pVar5 != null ? MenuKt.DropdownMenuItemHorizontalPadding : Dp.m5267constructorimpl(0), 0.0f, pVar6 != null ? MenuKt.DropdownMenuItemHorizontalPadding : Dp.m5267constructorimpl(0), 0.0f, 10, null);
                            p<Composer, Integer, j> pVar8 = pVar7;
                            int i11 = i9;
                            composer4.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composer4, 0, -1323940314);
                            Density density2 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            kj.a<ComposeUiNode> constructor2 = companion2.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer4);
                            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (androidx.compose.animation.b.m(i11 & 14, pVar8, composer4)) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer3, 56);
                    if (pVar3 != null) {
                        ProvidableCompositionLocal<Color> localContentColor3 = ContentColorKt.getLocalContentColor();
                        MenuItemColors menuItemColors4 = menuItemColors;
                        boolean z4 = z;
                        int i10 = i4;
                        ProvidedValue[] providedValueArr3 = {localContentColor3.provides(menuItemColors4.trailingIconColor$material3_release(z4, composer3, ((i10 >> 15) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i10 >> 15) & 14)).getValue())};
                        final p<Composer, Integer, j> pVar8 = pVar3;
                        final int i11 = i4;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr3, ComposableLambdaKt.composableLambda(composer3, 580312062, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return j.a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer4, int i12) {
                                if ((i12 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(580312062, i12, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:204)");
                                }
                                Modifier modifierM489defaultMinSizeVpY3zN4$default = SizeKt.m489defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, MenuTokens.INSTANCE.m2122getListItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                p<Composer, Integer, j> pVar9 = pVar8;
                                int i13 = i11;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composer4, 0, -1323940314);
                                Density density2 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                kj.a<ComposeUiNode> constructor2 = companion2.getConstructor();
                                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM489defaultMinSizeVpY3zN4$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composer4);
                                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (androidx.compose.animation.b.m((i13 >> 12) & 14, pVar9, composer4)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 48);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.MenuKt.DropdownMenuItemContent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer3, int i5) {
                MenuKt.DropdownMenuItemContent(pVar, aVar, modifier, pVar2, pVar3, z, menuItemColors, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long calculateTransformOrigin(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.m.h(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.m.h(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L1b
        L19:
            r0 = r3
            goto L55
        L1b:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L27
            r0 = r2
            goto L55
        L27:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L2e
            goto L19
        L2e:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r0 = r6.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L55:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L61
        L5f:
            r2 = r3
            goto L9b
        L61:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L6c
            goto L9b
        L6c:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L73
            goto L5f
        L73:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r5 = r5 + r1
            int r5 = r5 / 2
            int r1 = r6.getTop()
            int r5 = r5 - r1
            float r5 = (float) r5
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L9b:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
