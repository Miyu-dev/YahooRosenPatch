package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kj.l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.material3.TimePickerState$update$2", f = "TimePicker.kt", l = {571, 573}, m = "invokeSuspend")
public final class TimePickerState$update$2 extends SuspendLambda implements l<dj.c<? super j>, Object> {
    final /* synthetic */ boolean $fromTap;
    final /* synthetic */ float $value;
    int label;
    final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$update$2(TimePickerState timePickerState, float f, boolean z, dj.c<? super TimePickerState$update$2> cVar) {
        super(1, cVar);
        this.this$0 = timePickerState;
        this.$value = f;
        this.$fromTap = z;
    }

    public final dj.c<j> create(dj.c<?> cVar) {
        return new TimePickerState$update$2(this.this$0, this.$value, this.$fromTap, cVar);
    }

    public final Object invoke(dj.c<? super j> cVar) {
        return create(cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            if (Selection.m1484equalsimpl0(this.this$0.m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1488getHourJiIwxys())) {
                this.this$0.setHourAngle$material3_release((r8.toHour(this.$value) % 12) * 0.5235988f);
            } else if (this.$fromTap) {
                this.this$0.setMinuteAngle$material3_release((r8.toMinute(this.$value) - (this.this$0.toMinute(this.$value) % 5)) * 0.10471976f);
            } else {
                this.this$0.setMinuteAngle$material3_release(r8.toMinute(this.$value) * 0.10471976f);
            }
            if (this.$fromTap) {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release = this.this$0.getCurrentAngle$material3_release();
                Float f = new Float(this.this$0.getMinuteAngle$material3_release());
                this.label = 1;
                if (currentAngle$material3_release.snapTo(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release2 = this.this$0.getCurrentAngle$material3_release();
                Float f2 = new Float(this.this$0.offsetHour(this.$value));
                this.label = 2;
                if (currentAngle$material3_release2.snapTo(f2, this) == coroutineSingletons) {
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
