package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/TooltipSync;", "", "Landroidx/compose/material3/TooltipState;", "state", "", "persistent", "Lkotlin/j;", "show", "(Landroidx/compose/material3/TooltipState;ZLdj/c;)Ljava/lang/Object;", "dismissCurrentTooltip", "(Landroidx/compose/material3/TooltipState;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "getMutatorMutex", "()Landroidx/compose/foundation/MutatorMutex;", "mutexOwner", "Landroidx/compose/material3/TooltipState;", "getMutexOwner", "()Landroidx/compose/material3/TooltipState;", "setMutexOwner", "(Landroidx/compose/material3/TooltipState;)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
final class TooltipSync {
    public static final TooltipSync INSTANCE = new TooltipSync();
    private static final MutatorMutex mutatorMutex = new MutatorMutex();
    private static TooltipState mutexOwner;

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipSync$dismissCurrentTooltip$2, reason: invalid class name */
    /* JADX INFO: compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.TooltipSync$dismissCurrentTooltip$2", f = "Tooltip.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        int label;

        public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
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

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipSync$show$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.TooltipSync$show$2", f = "Tooltip.kt", l = {623}, m = "invokeSuspend")
    public static final class C04232 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        final /* synthetic */ TooltipState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04232(TooltipState tooltipState, dj.c<? super C04232> cVar) {
            super(1, cVar);
            this.$state = tooltipState;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new C04232(this.$state, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                ((PlainTooltipState) this.$state).setVisible$material3_release(true);
                this.label = 1;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == coroutineSingletons) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipSync$show$4, reason: invalid class name */
    /* JADX INFO: compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.TooltipSync$show$4", f = "Tooltip.kt", l = {771, 642}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        final /* synthetic */ boolean $persistent;
        final /* synthetic */ TooltipState $state;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, TooltipState tooltipState, dj.c<? super AnonymousClass4> cVar) {
            super(1, cVar);
            this.$persistent = z;
            this.$state = tooltipState;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new AnonymousClass4(this.$persistent, this.$state, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            } else {
                li.c.O(obj);
                if (this.$persistent) {
                    TooltipState tooltipState = this.$state;
                    this.L$0 = tooltipState;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(li.c.D(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    ((RichTooltipState) tooltipState).setVisible$material3_release(true);
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    ((RichTooltipState) this.$state).setVisible$material3_release(true);
                    this.label = 2;
                    if (DelayKt.delay(TooltipKt.TooltipDuration, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipSync$show$6, reason: invalid class name */
    /* JADX INFO: compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.TooltipSync$show$6", f = "Tooltip.kt", l = {655}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        final /* synthetic */ kj.a<j> $cleanUp;
        final /* synthetic */ l<dj.c<? super j>, Object> $runBlock;
        final /* synthetic */ TooltipState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(TooltipState tooltipState, l<? super dj.c<? super j>, ? extends Object> lVar, kj.a<j> aVar, dj.c<? super AnonymousClass6> cVar) {
            super(1, cVar);
            this.$state = tooltipState;
            this.$runBlock = lVar;
            this.$cleanUp = aVar;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new AnonymousClass6(this.$state, this.$runBlock, this.$cleanUp, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    li.c.O(obj);
                    TooltipSync.INSTANCE.setMutexOwner(this.$state);
                    l<dj.c<? super j>, Object> lVar = this.$runBlock;
                    this.label = 1;
                    if (lVar.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                }
                TooltipSync.INSTANCE.setMutexOwner(null);
                this.$cleanUp.invoke();
                return j.a;
            } catch (Throwable th) {
                TooltipSync.INSTANCE.setMutexOwner(null);
                this.$cleanUp.invoke();
                throw th;
            }
        }
    }

    private TooltipSync() {
    }

    public final Object dismissCurrentTooltip(TooltipState tooltipState, dj.c<? super j> cVar) {
        if (!m.c(tooltipState, mutexOwner)) {
            return j.a;
        }
        Object objMutate = mutatorMutex.mutate(MutatePriority.UserInput, new AnonymousClass2(null), cVar);
        return objMutate == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate : j.a;
    }

    public final MutatorMutex getMutatorMutex() {
        return mutatorMutex;
    }

    public final TooltipState getMutexOwner() {
        return mutexOwner;
    }

    public final void setMutexOwner(TooltipState tooltipState) {
        mutexOwner = tooltipState;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object show(final TooltipState tooltipState, boolean z, dj.c<? super j> cVar) throws NoWhenBranchMatchedException {
        kj.a<j> aVar;
        l c04232;
        if (tooltipState instanceof PlainTooltipState) {
            c04232 = new C04232(tooltipState, null);
            aVar = new kj.a<j>() { // from class: androidx.compose.material3.TooltipSync.show.3
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m1815invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1815invoke() {
                    ((PlainTooltipState) tooltipState).setVisible$material3_release(false);
                }
            };
        } else {
            if (!(tooltipState instanceof RichTooltipState)) {
                throw new NoWhenBranchMatchedException();
            }
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(z, tooltipState, null);
            aVar = new kj.a<j>() { // from class: androidx.compose.material3.TooltipSync.show.5
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m1816invoke();
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1816invoke() {
                    ((RichTooltipState) tooltipState).setVisible$material3_release(false);
                }
            };
            c04232 = anonymousClass4;
        }
        Object objMutate = mutatorMutex.mutate(MutatePriority.Default, new AnonymousClass6(tooltipState, c04232, aVar, null), cVar);
        return objMutate == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate : j.a;
    }
}
