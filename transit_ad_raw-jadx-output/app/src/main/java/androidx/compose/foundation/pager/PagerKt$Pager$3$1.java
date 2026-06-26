package androidx.compose.foundation.pager;

import androidx.appcompat.R;
import androidx.compose.runtime.SnapshotStateKt;
import ej.c;
import kj.a;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@c(c = "androidx.compose.foundation.pager.PagerKt$Pager$3$1", f = "Pager.kt", l = {287}, m = "invokeSuspend")
public final class PagerKt$Pager$3$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$3$1(PagerState pagerState, dj.c<? super PagerKt$Pager$3$1> cVar) {
        super(2, cVar);
        this.$state = pagerState;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new PagerKt$Pager$3$1(this.$state, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            final PagerState pagerState = this.$state;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new a<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$3$1.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m737invoke() {
                    return Boolean.valueOf(pagerState.isScrollInProgress());
                }
            });
            Flow flowDrop = FlowKt.drop(new Flow<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/j;", "emit", "(Ljava/lang/Object;Ldj/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @c(c = "androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", l = {223}, m = "emit")
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(dj.c cVar) {
                            super(cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, dj.c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            li.c.O(r6)
                            goto L47
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            li.c.O(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            r2 = r5
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            r2 = r2 ^ r3
                            if (r2 == 0) goto L47
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L47
                            return r1
                        L47:
                            kotlin.j r5 = kotlin.j.a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, dj.c):java.lang.Object");
                    }
                }

                public Object collect(FlowCollector flowCollector, dj.c cVar) {
                    Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), cVar);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
                }
            }, 1);
            final PagerState pagerState2 = this.$state;
            FlowCollector<Boolean> flowCollector = new FlowCollector<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$3$1.3
                public /* bridge */ /* synthetic */ Object emit(Object obj2, dj.c cVar) {
                    return emit(((Boolean) obj2).booleanValue(), (dj.c<? super j>) cVar);
                }

                public final Object emit(boolean z, dj.c<? super j> cVar) {
                    pagerState2.updateOnScrollStopped$foundation_release();
                    return j.a;
                }
            };
            this.label = 1;
            if (flowDrop.collect(flowCollector, this) == coroutineSingletons) {
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
