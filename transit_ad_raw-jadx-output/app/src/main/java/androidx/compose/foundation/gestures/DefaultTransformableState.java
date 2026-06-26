package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B*\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR2\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/gestures/DefaultTransformableState;", "Landroidx/compose/foundation/gestures/TransformableState;", "Landroidx/compose/foundation/MutatePriority;", "transformPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/TransformScope;", "Ldj/c;", "Lkotlin/j;", "", "block", "transform", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "", "Landroidx/compose/ui/geometry/Offset;", "onTransformation", "Lkj/q;", "getOnTransformation", "()Lkj/q;", "transformScope", "Landroidx/compose/foundation/gestures/TransformScope;", "Landroidx/compose/foundation/MutatorMutex;", "transformMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "isTransformingState", "Landroidx/compose/runtime/MutableState;", "isTransformInProgress", "()Z", "<init>", "(Lkj/q;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class DefaultTransformableState implements TransformableState {
    private final MutableState<Boolean> isTransformingState;
    private final q<Float, Offset, Float, j> onTransformation;
    private final MutatorMutex transformMutex;
    private final TransformScope transformScope;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", l = {249}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ p<TransformScope, dj.c<? super j>, Object> $block;
        final /* synthetic */ MutatePriority $transformPriority;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TransformableState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", l = {252}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
            final /* synthetic */ p<TransformScope, dj.c<? super j>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTransformableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(DefaultTransformableState defaultTransformableState, p<? super TransformScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = defaultTransformableState;
                this.$block = pVar;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
                return create(transformScope, cVar).invokeSuspend(j.a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        li.c.O(obj);
                        TransformScope transformScope = (TransformScope) this.L$0;
                        this.this$0.isTransformingState.setValue(Boolean.TRUE);
                        p<TransformScope, dj.c<? super j>, Object> pVar = this.$block;
                        this.label = 1;
                        if (pVar.invoke(transformScope, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                    }
                    this.this$0.isTransformingState.setValue(Boolean.FALSE);
                    return j.a;
                } catch (Throwable th) {
                    this.this$0.isTransformingState.setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(MutatePriority mutatePriority, p<? super TransformScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$transformPriority = mutatePriority;
            this.$block = pVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return DefaultTransformableState.this.new AnonymousClass2(this.$transformPriority, this.$block, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                MutatorMutex mutatorMutex = DefaultTransformableState.this.transformMutex;
                TransformScope transformScope = DefaultTransformableState.this.transformScope;
                MutatePriority mutatePriority = this.$transformPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultTransformableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(q<? super Float, ? super Offset, ? super Float, j> qVar) {
        m.h(qVar, "onTransformation");
        this.onTransformation = qVar;
        this.transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* JADX INFO: renamed from: transformBy-d-4ec7I, reason: not valid java name */
            public void mo275transformByd4ec7I(float zoomChange, long panChange, float rotationChange) {
                this.this$0.getOnTransformation().invoke(Float.valueOf(zoomChange), Offset.m2574boximpl(panChange), Float.valueOf(rotationChange));
            }
        };
        this.transformMutex = new MutatorMutex();
        this.isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final q<Float, Offset, Float, j> getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, p<? super TransformScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(mutatePriority, pVar, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }
}
