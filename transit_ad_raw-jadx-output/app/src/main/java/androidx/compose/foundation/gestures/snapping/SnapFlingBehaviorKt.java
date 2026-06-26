package androidx.compose.foundation.gestures.snapping;

import androidx.appcompat.R;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ej.c;
import kj.a;
import kj.l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.b;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ak\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000\u001a*\u0010\u0019\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0082\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0082\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001aa\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ai\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010)\u001a\u00020\u0006*\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002\u001a\u0017\u0010-\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0082\b\"\u001d\u0010/\u001a\u00020.8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0014\u00103\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00100\"\u0014\u00104\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u00100\"\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "animation", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "Lkotlin/j;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/ui/unit/Density;Lkj/l;Ldj/c;)Ljava/lang/Object;", "velocity", "findClosestOffset", "", "T", "Lqj/b;", "component1", "(Lqj/b;)Ljava/lang/Comparable;", "component2", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkj/l;Ldj/c;)Ljava/lang/Object;", "cancelOffset", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "animateSnap", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkj/l;Ldj/c;)Ljava/lang/Object;", TypedValues.AttributesType.S_TARGET, "coerceToTarget", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "F", "getMinFlingVelocityDp", "()F", "NoDistance", "NoVelocity", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m5267constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {406}, m = "animateDecay")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {451}, m = "animateSnap")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C02001 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02001(dj.c<? super C02001> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateSnap(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {311}, m = "approach")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C02021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02021(dj.c<? super C02021> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.approach(null, 0.0f, 0.0f, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateDecay(final androidx.compose.foundation.gestures.ScrollScope r5, final float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, final kj.l<? super java.lang.Float, kotlin.j> r9, dj.c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref.FloatRef) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            li.c.O(r10)
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            li.c.O(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            r2 = r3
            goto L53
        L52:
            r2 = 0
        L53:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>()
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L68
            return r1
        L68:
            r5 = r10
        L69:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.element
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kj.l, dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, l<? super Float, j> lVar, float f) {
        float fScrollBy = scrollScope.scrollBy(f);
        lVar.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateSnap(final androidx.compose.foundation.gestures.ScrollScope r13, float r14, final float r15, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r16, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r17, final kj.l<? super java.lang.Float, kotlin.j> r18, dj.c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r19) {
        /*
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C02001
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r2 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C02001) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            r2.<init>(r1)
        L1b:
            r8 = r2
            java.lang.Object r1 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L42
            if (r3 != r4) goto L3a
            float r0 = r8.F$1
            float r2 = r8.F$0
            java.lang.Object r3 = r8.L$1
            kotlin.jvm.internal.Ref$FloatRef r3 = (kotlin.jvm.internal.Ref.FloatRef) r3
            java.lang.Object r4 = r8.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            li.c.O(r1)
            r9 = r0
            r0 = r2
            r1 = r4
            goto L90
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            li.c.O(r1)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            java.lang.Object r3 = r16.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r14)
            java.lang.Object r3 = r16.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L6a
            r3 = r4
            goto L6b
        L6a:
            r3 = 0
        L6b:
            r6 = r3 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2 r7 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2
            r3 = r13
            r10 = r15
            r11 = r18
            r7.<init>()
            r10 = r16
            r8.L$0 = r10
            r8.L$1 = r1
            r8.F$0 = r0
            r8.F$1 = r9
            r8.label = r4
            r3 = r16
            r4 = r5
            r5 = r17
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L8e
            return r2
        L8e:
            r3 = r1
            r1 = r10
        L90:
            java.lang.Object r2 = r1.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r4 = coerceToTarget(r2, r9)
            androidx.compose.foundation.gestures.snapping.AnimationResult r11 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r2 = r3.element
            float r0 = r0 - r2
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r0)
            r2 = 0
            r5 = 0
            r7 = 0
            r0 = 0
            r9 = 29
            r10 = 0
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.copy$default(r1, r2, r3, r4, r6, r8, r9, r10)
            r11.<init>(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kj.l, dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object approach(androidx.compose.foundation.gestures.ScrollScope r7, float r8, float r9, androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r10, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11, androidx.compose.ui.unit.Density r12, kj.l<? super java.lang.Float, kotlin.j> r13, dj.c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C02021
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C02021) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            r0.<init>(r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r7 = r6.L$1
            r12 = r7
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            java.lang.Object r7 = r6.L$0
            r11 = r7
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11 = (androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) r11
            li.c.O(r14)
            goto L57
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            li.c.O(r14)
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r8)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r9)
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r2
            r1 = r10
            r2 = r7
            r5 = r13
            java.lang.Object r14 = r1.approachAnimation(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L57
            return r0
        L57:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            androidx.compose.animation.core.AnimationState r7 = r14.component2()
            java.lang.Object r8 = r7.getVelocity()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = findClosestOffset(r8, r11, r12)
            androidx.compose.foundation.gestures.snapping.AnimationResult r9 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r8)
            r9.<init>(r10, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.foundation.gestures.snapping.ApproachAnimation, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density, kj.l, dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 > 0.0f) {
            if (f <= f2) {
                return f;
            }
        } else if (f >= f2) {
            return f;
        }
        return f2;
    }

    private static final <T extends Comparable<? super T>> T component1(b<T> bVar) {
        m.h(bVar, "<this>");
        return (T) bVar.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(b<T> bVar) {
        m.h(bVar, "<this>");
        return (T) bVar.getEndInclusive();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float findClosestOffset(float r4, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r5, androidx.compose.ui.unit.Density r6) {
        /*
            java.lang.String r0 = "snapLayoutInfoProvider"
            kotlin.jvm.internal.m.h(r5, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.m.h(r6, r0)
            qj.b r5 = r5.calculateSnappingOffsetBounds(r6)
            java.lang.Comparable r6 = component1(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            java.lang.Comparable r5 = component2(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.signum(r4)
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L31
            r1 = r2
            goto L32
        L31:
            r1 = r3
        L32:
            if (r1 == 0) goto L41
            float r4 = java.lang.Math.abs(r5)
            float r1 = java.lang.Math.abs(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 > 0) goto L5a
            goto L4c
        L41:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L49
            r1 = r2
            goto L4a
        L49:
            r1 = r3
        L4a:
            if (r1 == 0) goto L4e
        L4c:
            r6 = r5
            goto L5a
        L4e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r6 = r0
        L5a:
            boolean r4 = findClosestOffset$isValidDistance(r6)
            if (r4 == 0) goto L61
            r0 = r6
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.findClosestOffset(float, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density):float");
    }

    private static final boolean findClosestOffset$isValidDistance(float f) {
        if (!(f == Float.POSITIVE_INFINITY)) {
            if (!(f == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final SnapFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i2) {
        m.h(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:268)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(snapLayoutInfoProvider) | composer.changed(decayAnimationSpecRememberSplineBasedDecay) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density, 0.0f, 32, null);
            composer.updateRememberedValue(snapFlingBehavior);
            objRememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }

    private static final void debugLog(a<String> aVar) {
    }
}
