package androidx.compose.foundation.gestures.snapping;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ej.c;
import kj.l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010,\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\b6\u00107J?\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ?\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJG\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u001f\u0010\u0016\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0016\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u0013\u0010\u001b\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\"\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/j;", "onRemainingScrollOffsetUpdate", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "fling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkj/l;Ldj/c;)Ljava/lang/Object;", "velocity", "shortSnap", "onAnimationStep", "longSnap", "initialTargetOffset", "runApproach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkj/l;Ldj/c;)Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "", "isDecayApproachPossible", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLdj/c;)Ljava/lang/Object;", "onSettlingDistanceUpdated", "", "other", "equals", "", "hashCode", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/animation/core/AnimationSpec;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Dp;", "shortSnapVelocityThreshold", "F", "velocityThreshold", "Landroidx/compose/ui/MotionDurationScale;", "motionScaleDuration", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "<init>", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private final Density density;
    private final DecayAnimationSpec<Float> highVelocityAnimationSpec;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;
    private MotionDurationScale motionScaleDuration;
    private final float shortSnapVelocityThreshold;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;
    private final float velocityThreshold;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {132}, m = "fling")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.fling(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$longSnap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {177, 189}, m = "longSnap")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C01971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01971(dj.c<? super C01971> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.longSnap(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {118}, m = "performFling")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C01983 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01983(dj.c<? super C01983> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.performFling(null, 0.0f, null, this);
        }
    }

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r11, float r12, kj.l<? super java.lang.Float, kotlin.j> r13, dj.c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r11 = r0.L$0
            r13 = r11
            kj.l r13 = (kj.l) r13
            li.c.O(r14)
            goto L4f
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            li.c.O(r14)
            androidx.compose.ui.MotionDurationScale r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r14, r2, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, kj.l, dj.c):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float offset, float velocity) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.highVelocityAnimationSpec, 0.0f, velocity)) >= Math.abs(offset) + this.snapLayoutInfoProvider.calculateSnapStepSize(this.density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object longSnap(androidx.compose.foundation.gestures.ScrollScope r26, float r27, final kj.l<? super java.lang.Float, kotlin.j> r28, dj.c<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r29) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.longSnap(androidx.compose.foundation.gestures.ScrollScope, float, kj.l, dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f, float f2, l<? super Float, j> lVar, dj.c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        return SnapFlingBehaviorKt.approach(scrollScope, f, f2, isDecayApproachPossible(f, f2) ? new HighVelocityApproachAnimation(this.highVelocityAnimationSpec) : new LowVelocityApproachAnimation(this.lowVelocityAnimationSpec, this.snapLayoutInfoProvider, this.density), this.snapLayoutInfoProvider, this.density, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f, final l<? super Float, j> lVar, dj.c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        float fFindClosestOffset = SnapFlingBehaviorKt.findClosestOffset(0.0f, this.snapLayoutInfoProvider, this.density);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = fFindClosestOffset;
        return SnapFlingBehaviorKt.animateSnap(scrollScope, fFindClosestOffset, fFindClosestOffset, AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null), this.snapAnimationSpec, new l<Float, j>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.shortSnap.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).floatValue());
                return j.a;
            }

            public final void invoke(float f2) {
                Ref.FloatRef floatRef2 = floatRef;
                float f3 = floatRef2.element - f2;
                floatRef2.element = f3;
                lVar.invoke(Float.valueOf(f3));
            }
        }, cVar);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) other;
        return m.c(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && m.c(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) && m.c(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) && m.c(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider) && m.c(snapFlingBehavior.density, this.density) && Dp.m5272equalsimpl0(snapFlingBehavior.shortSnapVelocityThreshold, this.shortSnapVelocityThreshold);
    }

    /* JADX INFO: renamed from: getMotionScaleDuration$foundation_release, reason: from getter */
    public final MotionDurationScale getMotionScaleDuration() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return Dp.m5273hashCodeimpl(this.shortSnapVelocityThreshold) + ((this.density.hashCode() + ((this.snapLayoutInfoProvider.hashCode() + ((this.lowVelocityAnimationSpec.hashCode() + ((this.highVelocityAnimationSpec.hashCode() + ((this.snapAnimationSpec.hashCode() + 0) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r5, float r6, kj.l<? super java.lang.Float, kotlin.j> r7, dj.c<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C01983
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C01983) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            li.c.O(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            li.c.O(r8)
            r0.label = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L51
            goto L52
        L51:
            r3 = 0
        L52:
            if (r3 == 0) goto L55
            goto L5f
        L55:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5f:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kj.l, dj.c):java.lang.Object");
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale motionDurationScale) {
        m.h(motionDurationScale, "<set-?>");
        this.motionScaleDuration = motionDurationScale;
    }

    private SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec2, Density density, float f) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.lowVelocityAnimationSpec = animationSpec;
        this.highVelocityAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec2;
        this.density = density;
        this.shortSnapVelocityThreshold = f;
        this.velocityThreshold = density.mo348toPx0680j_4(f);
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f, dj.c<? super Float> cVar) {
        return performFling(scrollScope, f, new l<Float, j>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling.2
            public final void invoke(float f2) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).floatValue());
                return j.a;
            }
        }, cVar);
    }

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, (i2 & 32) != 0 ? SnapFlingBehaviorKt.getMinFlingVelocityDp() : f, null);
    }
}
