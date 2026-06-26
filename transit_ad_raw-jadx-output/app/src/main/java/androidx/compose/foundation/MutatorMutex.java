package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJU\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "Landroidx/compose/foundation/MutatorMutex$Mutator;", "mutator", "Lkotlin/j;", "tryMutateOrCancel", "R", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Ldj/c;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkj/l;Ldj/c;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkj/p;Ldj/c;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "<init>", "()V", "Mutator", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "other", "", "canInterrupt", "Lkotlin/j;", "cancel", "Landroidx/compose/foundation/MutatePriority;", "priority", "Landroidx/compose/foundation/MutatePriority;", "getPriority", "()Landroidx/compose/foundation/MutatePriority;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/Job;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Mutator {
        private final Job job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, Job job) {
            m.h(mutatePriority, "priority");
            m.h(job, "job");
            this.priority = mutatePriority;
            this.job = job;
        }

        public final boolean canInterrupt(Mutator other) {
            m.h(other, "other");
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void cancel() {
            Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        }

        public final Job getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutate$2, reason: invalid class name */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {173, 119}, m = "invokeSuspend")
    public static final class AnonymousClass2<R> extends SuspendLambda implements p<CoroutineScope, dj.c<? super R>, Object> {
        final /* synthetic */ l<dj.c<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l<? super dj.c<? super R>, ? extends Object> lVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = lVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$priority, this.this$0, this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            l<dj.c<? super R>, Object> lVar;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Mutator mutator2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutex mutex2;
            AtomicReference atomicReference;
            AtomicReference atomicReference2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        li.c.O(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        Job job = coroutineScope.getCoroutineContext().get(Job.Key);
                        m.e(job);
                        Mutator mutator3 = new Mutator(mutatePriority, job);
                        this.this$0.tryMutateOrCancel(mutator3);
                        mutex = this.this$0.mutex;
                        l<dj.c<? super R>, Object> lVar2 = this.$block;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = mutex;
                        this.L$2 = lVar2;
                        this.L$3 = mutatorMutex3;
                        this.label = 1;
                        if (mutex.lock((Object) null, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lVar = lVar2;
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            mutex2 = (Mutex) this.L$1;
                            mutator2 = (Mutator) this.L$0;
                            try {
                                li.c.O(obj);
                                atomicReference2 = mutatorMutex2.currentMutator;
                                while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                                }
                                mutex2.unlock((Object) null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.currentMutator;
                                while (!atomicReference.compareAndSet(mutator2, null)) {
                                }
                                throw th;
                            }
                        }
                        mutatorMutex = (MutatorMutex) this.L$3;
                        lVar = (l) this.L$2;
                        Mutex mutex3 = (Mutex) this.L$1;
                        mutator = (Mutator) this.L$0;
                        li.c.O(obj);
                        mutex = mutex3;
                    }
                    this.L$0 = mutator;
                    this.L$1 = mutex;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutatorMutex2 = mutatorMutex;
                    mutex2 = mutex;
                    obj = objInvoke;
                    mutator2 = mutator;
                    atomicReference2 = mutatorMutex2.currentMutator;
                    while (!atomicReference2.compareAndSet(mutator2, null)) {
                    }
                    mutex2.unlock((Object) null);
                    return obj;
                } catch (Throwable th3) {
                    mutator2 = mutator;
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    atomicReference = mutatorMutex2.currentMutator;
                    while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock((Object) null);
                throw th4;
            }
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super R> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
    public static final class C01652<R> extends SuspendLambda implements p<CoroutineScope, dj.c<? super R>, Object> {
        final /* synthetic */ p<T, dj.c<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01652(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p<? super T, ? super dj.c<? super R>, ? extends Object> pVar, T t, dj.c<? super C01652> cVar) {
            super(2, cVar);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = pVar;
            this.$receiver = t;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01652 c01652 = new C01652(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
            c01652.L$0 = obj;
            return c01652;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            p pVar;
            Object obj2;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Mutator mutator2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutex mutex2;
            AtomicReference atomicReference;
            AtomicReference atomicReference2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        li.c.O(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        Job job = coroutineScope.getCoroutineContext().get(Job.Key);
                        m.e(job);
                        Mutator mutator3 = new Mutator(mutatePriority, job);
                        this.this$0.tryMutateOrCancel(mutator3);
                        mutex = this.this$0.mutex;
                        pVar = this.$block;
                        Object obj3 = this.$receiver;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = mutex;
                        this.L$2 = pVar;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex3;
                        this.label = 1;
                        if (mutex.lock((Object) null, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj2 = obj3;
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            mutex2 = (Mutex) this.L$1;
                            mutator2 = (Mutator) this.L$0;
                            try {
                                li.c.O(obj);
                                atomicReference2 = mutatorMutex2.currentMutator;
                                while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                                }
                                mutex2.unlock((Object) null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.currentMutator;
                                while (!atomicReference.compareAndSet(mutator2, null)) {
                                }
                                throw th;
                            }
                        }
                        mutatorMutex = (MutatorMutex) this.L$4;
                        obj2 = this.L$3;
                        pVar = (p) this.L$2;
                        Mutex mutex3 = (Mutex) this.L$1;
                        mutator = (Mutator) this.L$0;
                        li.c.O(obj);
                        mutex = mutex3;
                    }
                    this.L$0 = mutator;
                    this.L$1 = mutex;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = pVar.invoke(obj2, this);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutatorMutex2 = mutatorMutex;
                    mutex2 = mutex;
                    obj = objInvoke;
                    mutator2 = mutator;
                    atomicReference2 = mutatorMutex2.currentMutator;
                    while (!atomicReference2.compareAndSet(mutator2, null)) {
                    }
                    mutex2.unlock((Object) null);
                    return obj;
                } catch (Throwable th3) {
                    mutator2 = mutator;
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    atomicReference = mutatorMutex2.currentMutator;
                    while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock((Object) null);
                throw th4;
            }
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super R> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, l lVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, lVar, cVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, p pVar, dj.c cVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        boolean z;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            AtomicReference<Mutator> atomicReference = this.currentMutator;
            while (true) {
                if (atomicReference.compareAndSet(mutator2, mutator)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != mutator2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, l<? super dj.c<? super R>, ? extends Object> lVar, dj.c<? super R> cVar) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(mutatePriority, this, lVar, null), cVar);
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, p<? super T, ? super dj.c<? super R>, ? extends Object> pVar, dj.c<? super R> cVar) {
        return CoroutineScopeKt.coroutineScope(new C01652(mutatePriority, this, pVar, t, null), cVar);
    }
}
