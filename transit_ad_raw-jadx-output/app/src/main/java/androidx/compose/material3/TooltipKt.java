package androidx.compose.material3;

import androidx.appcompat.app.m;
import androidx.appcompat.widget.s;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.constraintlayout.core.widgets.Optimizer;
import dj.e;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001as\u0010\u0012\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0091\u0001\u0010\u0019\u001a\u00020\u00012\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ay\u0010$\u001a\u00020\u00012\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a0\u0010(\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001aT\u0010)\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010.\u001a\u00020\u0004*\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u001a\u001a\u00101\u001a\u00020\u0004*\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020+0/H\u0002\"\u0017\u00102\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103\"\u001d\u00104\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b5\u00106\"\u001d\u00107\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00106\"\u0017\u00109\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u00103\"\u0017\u0010:\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u00103\"\u0017\u0010;\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u00103\"\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0017\u0010?\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00103\"\u001d\u0010@\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u00106\"\u0017\u0010B\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u00103\"\u0017\u0010C\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u00103\"\u0017\u0010D\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u00103\"\u0017\u0010E\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bE\u00103\"\u0017\u0010F\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u00103\"\u0014\u0010H\u001a\u00020G8\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010K\u001a\u00020J8\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010L\"\u0014\u0010M\u001a\u00020J8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/PlainTooltipState;", "tooltipState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipBoxScope;", "content", "PlainTooltipBox-nBX6wN0", "(Lkj/p;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/PlainTooltipState;Landroidx/compose/ui/graphics/Shape;JJLkj/q;Landroidx/compose/runtime/Composer;II)V", "PlainTooltipBox", "text", "Landroidx/compose/material3/RichTooltipState;", "title", "action", "Landroidx/compose/material3/RichTooltipColors;", "colors", "RichTooltipBox", "(Lkj/p;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RichTooltipState;Lkj/p;Lkj/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;Lkj/q;Landroidx/compose/runtime/Composer;II)V", "tooltipContent", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltipPositionProvider", "Landroidx/compose/material3/TooltipState;", "Landroidx/compose/ui/unit/Dp;", "elevation", "maxWidth", "TooltipBox-XDn_Kpo", "(Lkj/p;Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TooltipState;JFFLkj/q;Landroidx/compose/runtime/Composer;I)V", "TooltipBox", "textColor", "PlainTooltipImpl-Iv8Zu3U", "(JLkj/p;Landroidx/compose/runtime/Composer;I)V", "PlainTooltipImpl", "RichTooltipImpl", "(Landroidx/compose/material3/RichTooltipColors;Lkj/p;Lkj/p;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "", "subheadExists", "actionExists", "textVerticalPadding", "Landroidx/compose/animation/core/Transition;", "transition", "animateTooltip", "TooltipAnchorPadding", "F", "TooltipMinHeight", "getTooltipMinHeight", "()F", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "PlainTooltipHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "RichTooltipMaxWidth", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "HeightToSubheadFirstLine", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "ActionLabelMinHeight", "ActionLabelBottomPadding", "", "TooltipDuration", "J", "", "TooltipFadeInDuration", "I", "TooltipFadeOutDuration", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float RichTooltipMaxWidth;
    private static final float TextBottomPadding;
    private static final float TooltipAnchorPadding;
    public static final long TooltipDuration = 1500;
    public static final int TooltipFadeInDuration = 150;
    private static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = Dp.m5267constructorimpl(40);
    private static final float PlainTooltipMaxWidth = Dp.m5267constructorimpl(ComposerKt.invocationKey);

    static {
        float f = 4;
        TooltipAnchorPadding = Dp.m5267constructorimpl(f);
        float f2 = 24;
        TooltipMinHeight = Dp.m5267constructorimpl(f2);
        float fM5267constructorimpl = Dp.m5267constructorimpl(f);
        PlainTooltipVerticalPadding = fM5267constructorimpl;
        float f3 = 8;
        float fM5267constructorimpl2 = Dp.m5267constructorimpl(f3);
        PlainTooltipHorizontalPadding = fM5267constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m455PaddingValuesYgX7TsA(fM5267constructorimpl2, fM5267constructorimpl);
        RichTooltipMaxWidth = Dp.m5267constructorimpl(320);
        float f4 = 16;
        RichTooltipHorizontalPadding = Dp.m5267constructorimpl(f4);
        HeightToSubheadFirstLine = Dp.m5267constructorimpl(28);
        HeightFromSubheadToTextFirstLine = Dp.m5267constructorimpl(f2);
        TextBottomPadding = Dp.m5267constructorimpl(f4);
        ActionLabelMinHeight = Dp.m5267constructorimpl(36);
        ActionLabelBottomPadding = Dp.m5267constructorimpl(f3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: PlainTooltipBox-nBX6wN0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1806PlainTooltipBoxnBX6wN0(final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.PlainTooltipState r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, final kj.q<? super androidx.compose.material3.TooltipBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m1806PlainTooltipBoxnBX6wN0(kj.p, androidx.compose.ui.Modifier, androidx.compose.material3.PlainTooltipState, androidx.compose.ui.graphics.Shape, long, long, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: PlainTooltipImpl-Iv8Zu3U, reason: not valid java name */
    public static final void m1807PlainTooltipImplIv8Zu3U(final long j, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(893340370);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893340370, i4, -1, "androidx.compose.material3.PlainTooltipImpl (Tooltip.kt:280)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, PlainTooltipContentPadding);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
            SkippableUpdater skippableUpdaterD = m.d(companion, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, skippableUpdaterD, composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(j)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, pVar, composer2, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TooltipKt$PlainTooltipImpl$2
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
                TooltipKt.m1807PlainTooltipImplIv8Zu3U(j, pVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RichTooltipBox(final kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.RichTooltipState r30, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r31, kj.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r32, androidx.compose.ui.graphics.Shape r33, androidx.compose.material3.RichTooltipColors r34, final kj.q<? super androidx.compose.material3.TooltipBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.j> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.RichTooltipBox(kj.p, androidx.compose.ui.Modifier, androidx.compose.material3.RichTooltipState, kj.p, kj.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.RichTooltipColors, kj.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RichTooltipImpl(final RichTooltipColors richTooltipColors, final p<? super Composer, ? super Integer, j> pVar, final p<? super Composer, ? super Integer, j> pVar2, final p<? super Composer, ? super Integer, j> pVar3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-878950288);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(richTooltipColors) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar2) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pVar3) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        int i4 = i3;
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-878950288, i4, -1, "androidx.compose.material3.RichTooltipImpl (Tooltip.kt:296)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
            RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
            TextStyle textStyleFromToken = TypographyKt.fromToken(typography, richTooltipTokens.getActionLabelTextFont());
            TextStyle textStyleFromToken2 = TypographyKt.fromToken(materialTheme.getTypography(composerStartRestartGroup, 6), richTooltipTokens.getSubheadFont());
            TextStyle textStyleFromToken3 = TypographyKt.fromToken(materialTheme.getTypography(composerStartRestartGroup, 6), richTooltipTokens.getSupportingTextFont());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM463paddingVpY3zN4$default = PaddingKt.m463paddingVpY3zN4$default(companion, RichTooltipHorizontalPadding, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = a.b.c(companion2, top, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM463paddingVpY3zN4$default);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, m.d(companion3, composerM2437constructorimpl, measurePolicyC, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(51873568);
            if (pVar2 != null) {
                Modifier modifierM391paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m391paddingFromBaselineVpY3zN4$default(companion, HeightToSubheadFirstLine, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierM391paddingFromBaselineVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl2 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf2, m.d(companion3, composerM2437constructorimpl2, measurePolicyB, composerM2437constructorimpl2, density2, composerM2437constructorimpl2, layoutDirection2, composerM2437constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(richTooltipColors.getTitleContentColor())), TextKt.getLocalTextStyle().provides(textStyleFromToken2)}, pVar2, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                j jVar = j.a;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierTextVerticalPadding = textVerticalPadding(companion, pVar2 != null, pVar3 != null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyB2 = android.support.v4.media.a.b(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            kj.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf3 = LayoutKt.materializerOf(modifierTextVerticalPadding);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2437constructorimpl3 = Updater.m2437constructorimpl(composerStartRestartGroup);
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf3, m.d(companion3, composerM2437constructorimpl3, measurePolicyB2, composerM2437constructorimpl3, density3, composerM2437constructorimpl3, layoutDirection3, composerM2437constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(richTooltipColors.getContentColor())), TextKt.getLocalTextStyle().provides(textStyleFromToken3)}, pVar, composerStartRestartGroup, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(75391440);
            if (pVar3 != null) {
                Modifier modifierM465paddingqDBjuR0$default = PaddingKt.m465paddingqDBjuR0$default(SizeKt.m495requiredHeightInVpY3zN4$default(companion, ActionLabelMinHeight, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ActionLabelBottomPadding, 7, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB3 = android.support.v4.media.a.b(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                kj.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf4 = LayoutKt.materializerOf(modifierM465paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2437constructorimpl4 = Updater.m2437constructorimpl(composerStartRestartGroup);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf4, m.d(companion3, composerM2437constructorimpl4, measurePolicyB3, composerM2437constructorimpl4, density4, composerM2437constructorimpl4, layoutDirection4, composerM2437constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(richTooltipColors.getActionContentColor())), TextKt.getLocalTextStyle().provides(textStyleFromToken)}, pVar3, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                j jVar2 = j.a;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TooltipKt.RichTooltipImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                TooltipKt.RichTooltipImpl(richTooltipColors, pVar, pVar2, pVar3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TooltipBox-XDn_Kpo, reason: not valid java name */
    public static final void m1808TooltipBoxXDn_Kpo(final p<? super Composer, ? super Integer, j> pVar, final PopupPositionProvider popupPositionProvider, final Modifier modifier, final Shape shape, final TooltipState tooltipState, final long j, final float f, final float f2, final q<? super TooltipBoxScope, ? super Composer, ? super Integer, j> qVar, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1415647894);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(popupPositionProvider) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(tooltipState) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(qVar) ? 67108864 : 33554432;
        }
        if ((191739611 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415647894, i3, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:188)");
            }
            Object objD = s.d(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objD == companion.getEmpty()) {
                objD = androidx.appcompat.view.menu.a.a(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objD).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Strings.Companion companion2 = Strings.INSTANCE;
            final String strM1581getStringNWtq28 = Strings_androidKt.m1581getStringNWtq28(companion2.m1579getTooltipLongPressLabeladMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new TooltipBoxScope() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1
                    @Override // androidx.compose.material3.TooltipBoxScope
                    public Modifier tooltipAnchor(Modifier modifier2) {
                        kotlin.jvm.internal.m.h(modifier2, "<this>");
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final TooltipState tooltipState2 = tooltipState;
                        final kj.a<Job> aVar = new kj.a<Job>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1

                            /* JADX INFO: renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Tooltip.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                            @ej.c(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1$1", f = "Tooltip.kt", l = {208}, m = "invokeSuspend")
                            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                                final /* synthetic */ TooltipState $tooltipState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(TooltipState tooltipState, dj.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.$tooltipState = tooltipState;
                                }

                                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                                    return new AnonymousClass1(this.$tooltipState, cVar);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        li.c.O(obj);
                                        TooltipState tooltipState = this.$tooltipState;
                                        this.label = 1;
                                        if (tooltipState.show(this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        li.c.O(obj);
                                    }
                                    return j.a;
                                }

                                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            public final Job invoke() {
                                return BuildersKt.launch$default(coroutineScope2, (e) null, (CoroutineStart) null, new AnonymousClass1(tooltipState2, null), 3, (Object) null);
                            }
                        };
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, tooltipState, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(aVar, null));
                        final String str = strM1581getStringNWtq28;
                        return SemanticsModifierKt.semantics(modifierPointerInput, true, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return j.a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                kotlin.jvm.internal.m.h(semanticsPropertyReceiver, "$this$semantics");
                                String str2 = str;
                                final kj.a<Job> aVar2 = aVar;
                                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new kj.a<Boolean>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                                    public final Boolean m1813invoke() {
                                        aVar2.invoke();
                                        return Boolean.TRUE;
                                    }
                                });
                            }
                        });
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TooltipKt$TooltipBox$scope$1$1 tooltipKt$TooltipBox$scope$1$1 = (TooltipKt$TooltipBox$scope$1$1) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            kj.a<ComposeUiNode> constructor = companion4.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(companion3);
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
            androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, m.d(companion4, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(tooltipState.isVisible()), "Tooltip transition", composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.startReplaceableGroup(-1995827526);
            if (((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue() || ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue()) {
                final String strM1581getStringNWtq282 = Strings_androidKt.m1581getStringNWtq28(companion2.m1580getTooltipPaneDescriptionadMyvUU(), composerStartRestartGroup, 6);
                final int i4 = i3;
                TooltipPopup_androidKt.TooltipPopup(popupPositionProvider, new kj.a<j>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.TooltipKt$TooltipBox$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Tooltip.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.material3.TooltipKt$TooltipBox$1$1$1", f = "Tooltip.kt", l = {254}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                        final /* synthetic */ TooltipState $tooltipState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TooltipState tooltipState, dj.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$tooltipState = tooltipState;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            return new AnonymousClass1(this.$tooltipState, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = this.label;
                            if (i2 == 0) {
                                li.c.O(obj);
                                TooltipState tooltipState = this.$tooltipState;
                                this.label = 1;
                                if (tooltipState.dismiss(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                li.c.O(obj);
                            }
                            return j.a;
                        }

                        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                            return create(coroutineScope, cVar).invokeSuspend(j.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1812invoke();
                        return j.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1812invoke() {
                        if (tooltipState.isVisible()) {
                            BuildersKt.launch$default(coroutineScope, (e) null, (CoroutineStart) null, new AnonymousClass1(tooltipState, null), 3, (Object) null);
                        }
                    }
                }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -442150991, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$1$2
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
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-442150991, i5, -1, "androidx.compose.material3.TooltipBox.<anonymous>.<anonymous> (Tooltip.kt:256)");
                        }
                        Modifier modifierAnimateTooltip = TooltipKt.animateTooltip(SizeKt.m508sizeInqDBjuR0$default(modifier, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), f2, 0.0f, 8, null), transitionUpdateTransition);
                        final String str = strM1581getStringNWtq282;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(str);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((SemanticsPropertyReceiver) obj);
                                    return j.a;
                                }

                                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    kotlin.jvm.internal.m.h(semanticsPropertyReceiver, "$this$semantics");
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAnimateTooltip, false, (l) objRememberedValue2, 1, null);
                        Shape shape2 = shape;
                        long j2 = j;
                        float f3 = f;
                        p<Composer, Integer, j> pVar2 = pVar;
                        int i6 = i4;
                        SurfaceKt.m1590SurfaceT9BRK9s(modifierSemantics$default, shape2, j2, 0L, f3, f3, null, pVar2, composer2, ((i6 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i6 >> 9) & 896) | (57344 & (i6 >> 6)) | ((i6 >> 3) & 458752) | ((i6 << 21) & 29360128), 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i3 >> 3) & 14) | 384);
            }
            composerStartRestartGroup.endReplaceableGroup();
            qVar.invoke(tooltipKt$TooltipBox$scope$1$1, composerStartRestartGroup, Integer.valueOf(((i3 >> 21) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i5) {
                TooltipKt.m1808TooltipBoxXDn_Kpo(pVar, popupPositionProvider, modifier, shape, tooltipState, j, f, f2, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier animateTooltip(Modifier modifier, final Transition<Boolean> transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "animateTooltip").set("transition", transition);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TooltipKt.animateTooltip.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final float invoke$lambda$1(State<Float> state) {
                return state.getValue().floatValue();
            }

            private static final float invoke$lambda$3(State<Float> state) {
                return state.getValue().floatValue();
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, -1498516085)) {
                    ComposerKt.traceEventStart(-1498516085, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:699)");
                }
                Transition<Boolean> transition2 = transition;
                TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = new q<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$scale$2
                    @Composable
                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i3) {
                        if (androidx.browser.browseractions.a.o(segment, "$this$animateFloat", composer2, 386845748)) {
                            ComposerKt.traceEventStart(386845748, i3, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:701)");
                        }
                        TweenSpec tweenSpecTween$default = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearOutSlowInEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return tweenSpecTween$default;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }
                };
                composer.startReplaceableGroup(-1338768149);
                i iVar = i.a;
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(iVar);
                composer.startReplaceableGroup(-142660079);
                boolean zBooleanValue = transition2.getCurrentState().booleanValue();
                composer.startReplaceableGroup(-1553362193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
                }
                float f = zBooleanValue ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = transition2.getTargetState().booleanValue();
                composer.startReplaceableGroup(-1553362193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
                }
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, fValueOf, Float.valueOf(f2), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$scale$2.invoke(transition2.getSegment(), composer, 0), vectorConverter, "tooltip transition: scaling", composer, 196608);
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Transition<Boolean> transition3 = transition;
                TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = new q<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$alpha$2
                    @Composable
                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i3) {
                        if (androidx.browser.browseractions.a.o(segment, "$this$animateFloat", composer2, -281714272)) {
                            ComposerKt.traceEventStart(-281714272, i3, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:720)");
                        }
                        TweenSpec tweenSpecTween$default = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return tweenSpecTween$default;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }
                };
                composer.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(iVar);
                composer.startReplaceableGroup(-142660079);
                boolean zBooleanValue3 = transition3.getCurrentState().booleanValue();
                composer.startReplaceableGroup(2073045083);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
                }
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f3);
                boolean zBooleanValue4 = transition3.getTargetState().booleanValue();
                composer.startReplaceableGroup(2073045083);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
                }
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition3, fValueOf2, Float.valueOf(f4), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$alpha$2.invoke(transition3.getSegment(), composer, 0), vectorConverter2, "tooltip transition: alpha", composer, 196608);
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Modifier modifierM2964graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2964graphicsLayerAp8cVGQ$default(modifier2, invoke$lambda$1(stateCreateTransitionAnimation), invoke$lambda$1(stateCreateTransitionAnimation), invoke$lambda$3(stateCreateTransitionAnimation2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM2964graphicsLayerAp8cVGQ$default;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    private static final Modifier textVerticalPadding(Modifier modifier, boolean z, boolean z2) {
        return (z || z2) ? PaddingKt.m465paddingqDBjuR0$default(AlignmentLineKt.m391paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null) : PaddingKt.m463paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
    }
}
