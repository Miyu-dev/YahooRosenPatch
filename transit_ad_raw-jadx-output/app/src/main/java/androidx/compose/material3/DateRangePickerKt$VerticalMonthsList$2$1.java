package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {586}, m = "invokeSuspend")
public final class DateRangePickerKt$VerticalMonthsList$2$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ StateData $stateData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$2$1(LazyListState lazyListState, StateData stateData, dj.c<? super DateRangePickerKt$VerticalMonthsList$2$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
        this.$stateData = stateData;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.$lazyListState, this.$stateData, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            LazyListState lazyListState = this.$lazyListState;
            StateData stateData = this.$stateData;
            this.label = 1;
            if (DatePickerKt.updateDisplayedMonth(lazyListState, stateData, this) == coroutineSingletons) {
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
