package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u001f\u0010 J?\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Ldj/c;", "Lkotlin/j;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "Lkotlin/Function1;", "onDelta", "Lkj/l;", "getOnDelta", "()Lkj/l;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "isScrollingState", "Landroidx/compose/runtime/MutableState;", "isScrollInProgress", "()Z", "<init>", "(Lkj/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class DefaultScrollableState implements ScrollableState {
    private final MutableState<Boolean> isScrollingState;
    private final l<Float, Float> onDelta;
    private final MutatorMutex scrollMutex;
    private final ScrollScope scrollScope;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2, reason: invalid class name */
    /* JADX INFO: compiled from: ScrollableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {175}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ p<ScrollScope, dj.c<? super j>, Object> $block;
        final /* synthetic */ MutatePriority $scrollPriority;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: ScrollableState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {178}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<ScrollScope, dj.c<? super j>, Object> {
            final /* synthetic */ p<ScrollScope, dj.c<? super j>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultScrollableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(DefaultScrollableState defaultScrollableState, p<? super ScrollScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = defaultScrollableState;
                this.$block = pVar;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ScrollScope scrollScope, dj.c<? super j> cVar) {
                return create(scrollScope, cVar).invokeSuspend(j.a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        li.c.O(obj);
                        ScrollScope scrollScope = (ScrollScope) this.L$0;
                        this.this$0.isScrollingState.setValue(Boolean.TRUE);
                        p<ScrollScope, dj.c<? super j>, Object> pVar = this.$block;
                        this.label = 1;
                        if (pVar.invoke(scrollScope, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                    }
                    this.this$0.isScrollingState.setValue(Boolean.FALSE);
                    return j.a;
                } catch (Throwable th) {
                    this.this$0.isScrollingState.setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(MutatePriority mutatePriority, p<? super ScrollScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$scrollPriority = mutatePriority;
            this.$block = pVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return DefaultScrollableState.this.new AnonymousClass2(this.$scrollPriority, this.$block, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                MutatorMutex mutatorMutex = DefaultScrollableState.this.scrollMutex;
                ScrollScope scrollScope = DefaultScrollableState.this.scrollScope;
                MutatePriority mutatePriority = this.$scrollPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultScrollableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(scrollScope, mutatePriority, anonymousClass1, this) == coroutineSingletons) {
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
    public DefaultScrollableState(l<? super Float, Float> lVar) {
        m.h(lVar, "onDelta");
        this.onDelta = lVar;
        this.scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float pixels) {
                return ((Number) this.this$0.getOnDelta().invoke(Float.valueOf(pixels))).floatValue();
            }
        };
        this.scrollMutex = new MutatorMutex();
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return ((Number) this.onDelta.invoke(Float.valueOf(delta))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final /* synthetic */ boolean getCanScrollBackward() {
        return c.a(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final /* synthetic */ boolean getCanScrollForward() {
        return c.b(this);
    }

    public final l<Float, Float> getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super dj.c<? super j>, ? extends Object> pVar, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(mutatePriority, pVar, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }
}
