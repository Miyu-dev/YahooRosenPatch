package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UpdatableAnimationState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0086@ø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Lkotlin/Function1;", "", "Lkotlin/j;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lkj/l;Lkj/a;Ldj/c;)Ljava/lang/Object;", "", "lastFrameTime", "J", "Landroidx/compose/animation/core/AnimationVector1D;", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "", "isRunning", "Z", "value", "F", "getValue", "()F", "setValue", "(F)V", "<init>", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    @Deprecated
    private static final VectorizedSpringSpec<AnimationVector1D> RebasableAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null).vectorize((TwoWayConverter) VectorConvertersKt.getVectorConverter(i.a));

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u00020\u000e*\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "RebasableAnimationSpec", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getRebasableAnimationSpec", "()Landroidx/compose/animation/core/VectorizedSpringSpec;", "VisibilityThreshold", "", "ZeroVector", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VectorizedSpringSpec<AnimationVector1D> getRebasableAnimationSpec() {
            return UpdatableAnimationState.RebasableAnimationSpec;
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1, reason: invalid class name */
    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 146}, m = "animateToZero")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[Catch: all -> 0x00b4, PHI: r0 r1 r2 r13 r14 r15
  0x0083: PHI (r0v9 ??) = (r0v3 ??), (r0v10 ??) binds: [B:30:0x007b, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r1v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r1v1 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r1v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:30:0x007b, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r2v4 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v2 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v5 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:30:0x007b, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007b, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r14v8 kj.l<? super java.lang.Float, kotlin.j>) = (r14v5 kj.l<? super java.lang.Float, kotlin.j>), (r14v9 kj.l<? super java.lang.Float, kotlin.j>) binds: [B:30:0x007b, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r15v16 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r15v10 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r15v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:30:0x007b, B:41:0x00ad] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b4, blocks: (B:36:0x00a3, B:31:0x0083, B:33:0x008d), top: B:60:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:36:0x00a3, B:31:0x0083, B:33:0x008d), top: B:60:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:53:0x00da, B:45:0x00b7, B:50:0x00c5), top: B:62:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kj.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [kj.a] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kj.a<kotlin.j>] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.foundation.gestures.UpdatableAnimationState, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a0 -> B:60:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToZero(kj.l<? super java.lang.Float, kotlin.j> r13, kj.a<kotlin.j> r14, dj.c<? super kotlin.j> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(kj.l, kj.a, dj.c):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }
}
