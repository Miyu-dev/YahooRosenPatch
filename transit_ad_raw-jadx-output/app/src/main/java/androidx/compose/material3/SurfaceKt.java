package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
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
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ap\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0092\u0001\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009a\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010 \u001a;\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a%\u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\" \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070)8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function0;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkj/p;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-o_FOJdg", "(Lkj/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLkj/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLkj/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/p;Landroidx/compose/runtime/Composer;III)V", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surface", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new kj.a<Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        public /* bridge */ /* synthetic */ Object invoke() {
            return Dp.m5265boximpl(m1598invokeD9Ej5fM());
        }

        /* JADX INFO: renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m1598invokeD9Ej5fM() {
            return Dp.m5267constructorimpl(0);
        }
    }, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m1590SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2, int i3) {
        m.h(pVar, "content");
        composer.startReplaceableGroup(-513881741);
        final Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Shape rectangleShape = (i3 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM1116getSurface0d7_KjU = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1116getSurface0d7_KjU() : j;
        long jM1152contentColorForek8zF_U = (i3 & 8) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(jM1116getSurface0d7_KjU, composer, (i2 >> 6) & 14) : j2;
        float fM5267constructorimpl = (i3 & 16) != 0 ? Dp.m5267constructorimpl(0) : f;
        float fM5267constructorimpl2 = (i3 & 32) != 0 ? Dp.m5267constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i2, -1, "androidx.compose.material3.Surface (Surface.kt:99)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM5267constructorimpl3 = Dp.m5267constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5281unboximpl() + fM5267constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(jM1152contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5265boximpl(fM5267constructorimpl3))};
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = fM5267constructorimpl2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, -70914509, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            /* JADX INFO: renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Surface.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.material3.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
                int label;

                public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass2(cVar);
                }

                public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
                    return create(pointerInputScope, cVar).invokeSuspend(j.a);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    return j.a;
                }
            }

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
            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70914509, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:113)");
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m1596surface8ww4TTg(modifier2, rectangleShape, SurfaceKt.m1597surfaceColorAtElevationCLU3JFs(jM1116getSurface0d7_KjU, fM5267constructorimpl3, composer2, (i2 >> 6) & 14), borderStroke3, f3), false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return j.a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        m.h(semanticsPropertyReceiver, "$this$semantics");
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                    }
                }), j.a, new AnonymousClass2(null));
                p<Composer, Integer, j> pVar2 = pVar;
                int i5 = i2;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                kj.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierPointerInput);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer2);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.compose.animation.b.m((i5 >> 21) & 14, pVar2, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m1591Surfaced85dljk(final boolean z, final kj.a<j> aVar, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2, final int i3, int i4) {
        MutableInteractionSource mutableInteractionSource2;
        m.h(aVar, "onClick");
        m.h(pVar, "content");
        composer.startReplaceableGroup(540296512);
        Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i4 & 8) != 0 ? true : z2;
        Shape rectangleShape = (i4 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM1116getSurface0d7_KjU = (i4 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1116getSurface0d7_KjU() : j;
        long jM1152contentColorForek8zF_U = (i4 & 64) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(jM1116getSurface0d7_KjU, composer, (i2 >> 15) & 14) : j2;
        float fM5267constructorimpl = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Dp.m5267constructorimpl(0) : f;
        float fM5267constructorimpl2 = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Dp.m5267constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : borderStroke;
        if ((i4 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i2, i3, "androidx.compose.material3.Surface (Surface.kt:309)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM5267constructorimpl3 = Dp.m5267constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5281unboximpl() + fM5267constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(jM1152contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5265boximpl(fM5267constructorimpl3))};
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j3 = jM1116getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = fM5267constructorimpl2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, -1164547968, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.SurfaceKt$Surface$5
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
                    ComposerKt.traceEventStart(-1164547968, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:327)");
                }
                Modifier modifierM752selectableO2vRcR0$default = SelectableKt.m752selectableO2vRcR0$default(SurfaceKt.m1596surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), shape2, SurfaceKt.m1597surfaceColorAtElevationCLU3JFs(j3, fM5267constructorimpl3, composer2, (i2 >> 15) & 14), borderStroke3, f3), z, mutableInteractionSource3, RippleKt.m1015rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, aVar, 16, null);
                p<Composer, Integer, j> pVar2 = pVar;
                int i6 = i3;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                kj.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM752selectableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer2);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.compose.animation.b.m((i6 >> 3) & 14, pVar2, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m1593Surfaceo_FOJdg(final kj.a<j> aVar, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2, final int i3, int i4) {
        MutableInteractionSource mutableInteractionSource2;
        m.h(aVar, "onClick");
        m.h(pVar, "content");
        composer.startReplaceableGroup(-789752804);
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z2 = (i4 & 4) != 0 ? true : z;
        Shape rectangleShape = (i4 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM1116getSurface0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1116getSurface0d7_KjU() : j;
        long jM1152contentColorForek8zF_U = (i4 & 32) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(jM1116getSurface0d7_KjU, composer, (i2 >> 12) & 14) : j2;
        float fM5267constructorimpl = (i4 & 64) != 0 ? Dp.m5267constructorimpl(0) : f;
        float fM5267constructorimpl2 = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Dp.m5267constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? null : borderStroke;
        if ((i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i2, i3, "androidx.compose.material3.Surface (Surface.kt:201)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM5267constructorimpl3 = Dp.m5267constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5281unboximpl() + fM5267constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(jM1152contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5265boximpl(fM5267constructorimpl3))};
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j3 = jM1116getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = fM5267constructorimpl2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
                    ComposerKt.traceEventStart(1279702876, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:218)");
                }
                Modifier modifierM204clickableO2vRcR0$default = ClickableKt.m204clickableO2vRcR0$default(SurfaceKt.m1596surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), shape2, SurfaceKt.m1597surfaceColorAtElevationCLU3JFs(j3, fM5267constructorimpl3, composer2, (i2 >> 12) & 14), borderStroke3, f3), mutableInteractionSource3, RippleKt.m1015rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z2, null, null, aVar, 24, null);
                p<Composer, Integer, j> pVar2 = pVar;
                int i6 = i3;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                kj.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM204clickableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer2);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.compose.animation.b.m(i6 & 14, pVar2, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1596surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m181backgroundbw27NRU(ShadowKt.m2499shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m1597surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i2) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i2, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:475)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        if (Color.m2819equalsimpl0(j, materialTheme.getColorScheme(composer, 6).m1116getSurface0d7_KjU())) {
            j = ColorSchemeKt.m1157surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer, 6), f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m1592Surfaced85dljk(final boolean z, final l<? super Boolean, j> lVar, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final p<? super Composer, ? super Integer, j> pVar, Composer composer, final int i2, final int i3, int i4) {
        MutableInteractionSource mutableInteractionSource2;
        m.h(lVar, "onCheckedChange");
        m.h(pVar, "content");
        composer.startReplaceableGroup(-1877401889);
        Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i4 & 8) != 0 ? true : z2;
        Shape rectangleShape = (i4 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM1116getSurface0d7_KjU = (i4 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1116getSurface0d7_KjU() : j;
        long jM1152contentColorForek8zF_U = (i4 & 64) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(jM1116getSurface0d7_KjU, composer, (i2 >> 15) & 14) : j2;
        float fM5267constructorimpl = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Dp.m5267constructorimpl(0) : f;
        float fM5267constructorimpl2 = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Dp.m5267constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : borderStroke;
        if ((i4 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i2, i3, "androidx.compose.material3.Surface (Surface.kt:419)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM5267constructorimpl3 = Dp.m5267constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5281unboximpl() + fM5267constructorimpl);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2808boximpl(jM1152contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5265boximpl(fM5267constructorimpl3))};
        final Modifier modifier3 = modifier2;
        final Shape shape2 = rectangleShape;
        final long j3 = jM1116getSurface0d7_KjU;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = fM5267constructorimpl2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 712720927, true, new p<Composer, Integer, j>() { // from class: androidx.compose.material3.SurfaceKt$Surface$7
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
                    ComposerKt.traceEventStart(712720927, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:437)");
                }
                Modifier modifierM756toggleableO2vRcR0$default = ToggleableKt.m756toggleableO2vRcR0$default(SurfaceKt.m1596surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), shape2, SurfaceKt.m1597surfaceColorAtElevationCLU3JFs(j3, fM5267constructorimpl3, composer2, (i2 >> 15) & 14), borderStroke3, f3), z, mutableInteractionSource3, RippleKt.m1015rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, lVar, 16, null);
                p<Composer, Integer, j> pVar2 = pVar;
                int i6 = i3;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                kj.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierM756toggleableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer2);
                androidx.appcompat.graphics.drawable.a.g(0, qVarMaterializerOf, androidx.appcompat.app.m.d(companion, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.compose.animation.b.m((i6 >> 3) & 14, pVar2, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
