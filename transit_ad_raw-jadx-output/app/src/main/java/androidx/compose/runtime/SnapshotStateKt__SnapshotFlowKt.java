package androidx.compose.runtime;

import dj.e;
import java.util.Iterator;
import java.util.Set;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u001a-\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"T", "Lkotlinx/coroutines/flow/StateFlow;", "Ldj/e;", "context", "Landroidx/compose/runtime/State;", "collectAsState", "(Lkotlinx/coroutines/flow/StateFlow;Ldj/e;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "Lkotlinx/coroutines/flow/Flow;", "initial", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Ldj/e;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "block", "snapshotFlow", "", "other", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "(Ljava/util/Set;Ljava/util/Set;)Z", "intersects", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_dividerVertical, androidx.appcompat.R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1<R> extends SuspendLambda implements p<ProduceStateScope<R>, dj.c<? super j>, Object> {
        final /* synthetic */ e $context;
        final /* synthetic */ Flow<T> $this_collectAsState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: SnapshotFlow.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
            final /* synthetic */ ProduceStateScope<R> $$this$produceState;
            final /* synthetic */ Flow<T> $this_collectAsState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Flow<? extends T> flow, ProduceStateScope<R> produceStateScope, dj.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$this_collectAsState = flow;
                this.$$this$produceState = produceStateScope;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    Flow<T> flow = this.$this_collectAsState;
                    final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                    FlowCollector<T> flowCollector = new FlowCollector<T>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                        public final Object emit(T t, dj.c<? super j> cVar) {
                            produceStateScope.setValue(t);
                            return j.a;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(e eVar, Flow<? extends T> flow, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = eVar;
            this.$this_collectAsState = flow;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsState, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ProduceStateScope<R> produceStateScope, dj.c<? super j> cVar) {
            return create(produceStateScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                if (m.c(this.$context, EmptyCoroutineContext.INSTANCE)) {
                    Flow<T> flow = this.$this_collectAsState;
                    FlowCollector<T> flowCollector = new FlowCollector<T>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1
                        public final Object emit(T t, dj.c<? super j> cVar) {
                            produceStateScope.setValue(t);
                            return j.a;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    e eVar = this.$context;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                    this.label = 2;
                    if (BuildersKt.withContext(eVar, anonymousClass2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {134, 138, 160}, m = "invokeSuspend")
    public static final class C04571<T> extends SuspendLambda implements p<FlowCollector<? super T>, dj.c<? super j>, Object> {
        final /* synthetic */ kj.a<T> $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04571(kj.a<? extends T> aVar, dj.c<? super C04571> cVar) {
            super(2, cVar);
            this.$block = aVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C04571 c04571 = new C04571(this.$block, cVar);
            c04571.L$0 = obj;
            return c04571;
        }

        /* JADX WARN: Path cross not found for [B:36:0x00e6, B:40:0x00ef], limit reached: 82 */
        /* JADX WARN: Path cross not found for [B:44:0x00fe, B:61:0x0144], limit reached: 82 */
        /* JADX WARN: Path cross not found for [B:61:0x0144, B:44:0x00fe], limit reached: 82 */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00fe A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:34:0x00e2, B:36:0x00e6, B:41:0x00f0, B:44:0x00fe, B:48:0x0114, B:50:0x011d, B:59:0x0140, B:60:0x0143, B:11:0x0049, B:45:0x0109, B:47:0x0111, B:56:0x013b, B:57:0x013e), top: B:72:0x0049, inners: #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.C04571.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, dj.c<? super j> cVar) {
            return create(flowCollector, cVar).invokeSuspend(j.a);
        }
    }

    @Composable
    public static final <T> State<T> collectAsState(StateFlow<? extends T> stateFlow, e eVar, Composer composer, int i2, int i3) {
        m.h(stateFlow, "<this>");
        composer.startReplaceableGroup(-1439883919);
        if ((i3 & 1) != 0) {
            eVar = EmptyCoroutineContext.INSTANCE;
        }
        e eVar2 = eVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, stateFlow.getValue(), eVar2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateCollectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            Iterator<T> it2 = set2.iterator();
            while (it2.hasNext()) {
                if (set.contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final <T> Flow<T> snapshotFlow(kj.a<? extends T> aVar) {
        m.h(aVar, "block");
        return FlowKt.flow(new C04571(aVar, null));
    }

    @Composable
    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> flow, R r, e eVar, Composer composer, int i2, int i3) {
        m.h(flow, "<this>");
        composer.startReplaceableGroup(-606625098);
        if ((i3 & 2) != 0) {
            eVar = EmptyCoroutineContext.INSTANCE;
        }
        e eVar2 = eVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        int i4 = i2 >> 3;
        State<R> stateProduceState = SnapshotStateKt.produceState(r, flow, eVar2, new AnonymousClass1(eVar2, flow, null), composer, (i4 & 8) | 4672 | (i4 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateProduceState;
    }
}
