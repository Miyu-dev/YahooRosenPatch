package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qj.f;

/* JADX INFO: compiled from: LazyNearestItemsRange.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", f = "LazyNearestItemsRange.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "invokeSuspend")
public final class LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ kj.a<Integer> $extraItemCount;
    final /* synthetic */ kj.a<Integer> $firstVisibleItemIndex;
    final /* synthetic */ kj.a<Integer> $slidingWindowSize;
    final /* synthetic */ MutableState<f> $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(kj.a<Integer> aVar, kj.a<Integer> aVar2, kj.a<Integer> aVar3, MutableState<f> mutableState, dj.c<? super LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1> cVar) {
        super(2, cVar);
        this.$firstVisibleItemIndex = aVar;
        this.$slidingWindowSize = aVar2;
        this.$extraItemCount = aVar3;
        this.$state = mutableState;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(this.$firstVisibleItemIndex, this.$slidingWindowSize, this.$extraItemCount, this.$state, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            final kj.a<Integer> aVar = this.$firstVisibleItemIndex;
            final kj.a<Integer> aVar2 = this.$slidingWindowSize;
            final kj.a<Integer> aVar3 = this.$extraItemCount;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new kj.a<f>() { // from class: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final f invoke() {
                    return LazyNearestItemsRangeKt.calculateNearestItemsRange(((Number) aVar.invoke()).intValue(), ((Number) aVar2.invoke()).intValue(), ((Number) aVar3.invoke()).intValue());
                }
            });
            final MutableState<f> mutableState = this.$state;
            FlowCollector<f> flowCollector = new FlowCollector<f>() { // from class: androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1.2
                public /* bridge */ /* synthetic */ Object emit(Object obj2, dj.c cVar) {
                    return emit((f) obj2, (dj.c<? super j>) cVar);
                }

                public final Object emit(f fVar, dj.c<? super j> cVar) {
                    mutableState.setValue(fVar);
                    return j.a;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutineSingletons) {
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
