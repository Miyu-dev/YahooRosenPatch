package androidx.compose.material3;

import a.f;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 i2\u00020\u0001:\u0001iB\u001f\u0012\u0006\u0010d\u001a\u00020\u0002\u0012\u0006\u0010e\u001a\u00020\u0002\u0012\u0006\u0010f\u001a\u00020\u0013¢\u0006\u0004\bg\u0010hJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0006J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001d\u001a\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ3\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0002J\f\u0010&\u001a\u00020\u0002*\u00020\u000bH\u0002J\f\u0010'\u001a\u00020\u0002*\u00020\u000bH\u0002R\u0017\u0010(\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R$\u00100\u001a\u00020+8@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R4\u00108\u001a\u0002012\u0006\u00102\u001a\u0002018@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010/\"\u0004\b6\u00107R4\u0010>\u001a\u0002092\u0006\u00102\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u0006R+\u0010C\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00104\u001a\u0004\b@\u0010*\"\u0004\bA\u0010BR+\u0010G\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00104\u001a\u0004\bE\u0010*\"\u0004\bF\u0010BR+\u0010M\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00104\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010Q\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u00104\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010V\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010-\u001a\u0004\bV\u0010*R&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020X0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b]\u0010<R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b^\u0010<R\u0014\u0010#\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010<R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00020`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "", "", "minute", "Lkotlin/j;", "setMinute$material3_release", "(I)V", "setMinute", "hour", "setHour$material3_release", "setHour", "", "x", "y", "maxDist", "moveSelector$material3_release", "(FFF)V", "moveSelector", "value", "", "isSelected$material3_release", "(I)Z", "isSelected", "fromTap", "update$material3_release", "(FZLdj/c;)Ljava/lang/Object;", "update", "animateToCurrent$material3_release", "(Ldj/c;)Ljava/lang/Object;", "animateToCurrent", "settle", "autoSwitchToMinute", "onTap$material3_release", "(FFFZLdj/c;)Ljava/lang/Object;", "onTap", "hourForDisplay", "angle", "offsetHour", "toHour", "toMinute", "is24hour", "Z", "()Z", "Landroidx/compose/ui/unit/DpOffset;", "selectorPos$delegate", "Landroidx/compose/runtime/State;", "getSelectorPos-RKDOV3M$material3_release", "()J", "selectorPos", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "center$delegate", "Landroidx/compose/runtime/MutableState;", "getCenter-nOcc-ac$material3_release", "setCenter--gyyYBs$material3_release", "(J)V", "center", "Landroidx/compose/material3/Selection;", "selection$delegate", "getSelection-JiIwxys$material3_release", "()I", "setSelection-iHAOin8$material3_release", "selection", "isAfternoonToggle$delegate", "isAfternoonToggle$material3_release", "setAfternoonToggle$material3_release", "(Z)V", "isAfternoonToggle", "isInnerCircle$delegate", "isInnerCircle$material3_release", "setInnerCircle$material3_release", "isInnerCircle", "hourAngle$delegate", "getHourAngle$material3_release", "()F", "setHourAngle$material3_release", "(F)V", "hourAngle", "minuteAngle$delegate", "getMinuteAngle$material3_release", "setMinuteAngle$material3_release", "minuteAngle", "Landroidx/compose/foundation/MutatorMutex;", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "isAfternoon$delegate", "isAfternoon", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "currentAngle", "Landroidx/compose/animation/core/Animatable;", "getCurrentAngle$material3_release", "()Landroidx/compose/animation/core/Animatable;", "getMinute", "getHour", "getHourForDisplay$material3_release", "", "getValues$material3_release", "()Ljava/util/List;", "values", "initialHour", "initialMinute", "is24Hour", "<init>", "(IIZ)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class TimePickerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: center$delegate, reason: from kotlin metadata */
    private final MutableState center;
    private final Animatable<Float, AnimationVector1D> currentAngle;

    /* JADX INFO: renamed from: hourAngle$delegate, reason: from kotlin metadata */
    private final MutableState hourAngle;
    private final boolean is24hour;

    /* JADX INFO: renamed from: isAfternoon$delegate, reason: from kotlin metadata */
    private final State isAfternoon;

    /* JADX INFO: renamed from: isAfternoonToggle$delegate, reason: from kotlin metadata */
    private final MutableState isAfternoonToggle;

    /* JADX INFO: renamed from: isInnerCircle$delegate, reason: from kotlin metadata */
    private final MutableState isInnerCircle;

    /* JADX INFO: renamed from: minuteAngle$delegate, reason: from kotlin metadata */
    private final MutableState minuteAngle;
    private final MutatorMutex mutex;

    /* JADX INFO: renamed from: selection$delegate, reason: from kotlin metadata */
    private final MutableState selection;

    /* JADX INFO: renamed from: selectorPos$delegate, reason: from kotlin metadata */
    private final State selectorPos;

    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TimePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<TimePickerState, ?> Saver() {
            return SaverKt.Saver(new p<SaverScope, TimePickerState, List<? extends Object>>() { // from class: androidx.compose.material3.TimePickerState$Companion$Saver$1
                public final List<Object> invoke(SaverScope saverScope, TimePickerState timePickerState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(timePickerState, "it");
                    return f.V(Integer.valueOf(timePickerState.getHour()), Integer.valueOf(timePickerState.getMinute()), Boolean.valueOf(timePickerState.getIs24hour()));
                }
            }, new l<List, TimePickerState>() { // from class: androidx.compose.material3.TimePickerState$Companion$Saver$2
                public final TimePickerState invoke(List<? extends Object> list) {
                    m.h(list, "value");
                    Object obj = list.get(0);
                    m.f(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(1);
                    m.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object obj3 = list.get(2);
                    m.f(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    return new TimePickerState(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerState$settle$1, reason: invalid class name */
    /* JADX INFO: compiled from: TimePicker.kt */
    @ej.c(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", l = {616, 617}, m = "settle")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TimePickerState.this.settle(this);
        }
    }

    public TimePickerState(int i2, int i3, final boolean z) {
        if (!(i2 >= 0 && i2 < 24)) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (!(i2 >= 0 && i2 < 60)) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.is24hour = z;
        this.selectorPos = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new kj.a<DpOffset>() { // from class: androidx.compose.material3.TimePickerState$selectorPos$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return DpOffset.m5322boximpl(m1739invokeRKDOV3M());
            }

            /* JADX INFO: renamed from: invoke-RKDOV3M, reason: not valid java name */
            public final long m1739invokeRKDOV3M() {
                boolean zIsInnerCircle$material3_release = this.this$0.isInnerCircle$material3_release();
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f = 2;
                float fM5267constructorimpl = Dp.m5267constructorimpl(timePickerTokens.m2322getClockDialSelectorHandleContainerSizeD9Ej5fM() / f);
                float fM5267constructorimpl2 = Dp.m5267constructorimpl(Dp.m5267constructorimpl(((z && zIsInnerCircle$material3_release && Selection.m1484equalsimpl0(this.this$0.m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1488getHourJiIwxys())) ? TimePickerKt.InnerCircleRadius : TimePickerKt.OuterCircleSizeRadius) - fM5267constructorimpl) + fM5267constructorimpl);
                return DpKt.m5288DpOffsetYgX7TsA(Dp.m5267constructorimpl(Dp.m5267constructorimpl(timePickerTokens.m2320getClockDialContainerSizeD9Ej5fM() / f) + Dp.m5267constructorimpl(((float) Math.cos(this.this$0.getCurrentAngle$material3_release().getValue().floatValue())) * fM5267constructorimpl2)), Dp.m5267constructorimpl(Dp.m5267constructorimpl(timePickerTokens.m2320getClockDialContainerSizeD9Ej5fM() / f) + Dp.m5267constructorimpl(fM5267constructorimpl2 * ((float) Math.sin(this.this$0.getCurrentAngle$material3_release().getValue().floatValue())))));
            }
        });
        this.center = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m5376boximpl(IntOffset.INSTANCE.m5395getZeronOccac()), null, 2, null);
        this.selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Selection.m1481boximpl(Selection.INSTANCE.m1488getHourJiIwxys()), null, 2, null);
        this.isAfternoonToggle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i2 > 12 && !z), null, 2, null);
        this.isInnerCircle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i2 >= 12), null, 2, null);
        this.hourAngle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(((i2 * 0.5235988f) % 12) - 1.5707964f), null, 2, null);
        this.minuteAngle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf((i3 * 0.10471976f) - 1.5707964f), null, 2, null);
        this.mutex = new MutatorMutex();
        this.isAfternoon = SnapshotStateKt.derivedStateOf(new kj.a<Boolean>() { // from class: androidx.compose.material3.TimePickerState.isAfternoon.2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m1738invoke() {
                return Boolean.valueOf((TimePickerState.this.getIs24hour() && TimePickerState.this.isInnerCircle$material3_release()) || TimePickerState.this.isAfternoonToggle$material3_release());
            }
        });
        this.currentAngle = AnimatableKt.Animatable$default(getHourAngle$material3_release(), 0.0f, 2, null);
    }

    private final int hourForDisplay(int hour) {
        if (!this.is24hour || !isInnerCircle$material3_release() || hour != 0) {
            if (this.is24hour) {
                return hour % 24;
            }
            if (hour % 12 != 0) {
                return isAfternoon() ? hour - 12 : hour;
            }
        }
        return 12;
    }

    private final boolean isAfternoon() {
        return ((Boolean) this.isAfternoon.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetHour(float angle) {
        float f = angle + 1.5707964f;
        return f < 0.0f ? f + 6.2831855f : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f) {
        return ((int) ((((double) f) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f) {
        return ((int) ((((double) f) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    public static /* synthetic */ Object update$material3_release$default(TimePickerState timePickerState, float f, boolean z, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return timePickerState.update$material3_release(f, z, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToCurrent$material3_release(dj.c<? super kotlin.j> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.TimePickerState$animateToCurrent$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = (androidx.compose.material3.TimePickerState$animateToCurrent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = new androidx.compose.material3.TimePickerState$animateToCurrent$1
            r0.<init>(r11, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            li.c.O(r12)
            goto Lbb
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            float r1 = r6.F$0
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            li.c.O(r12)
            goto L94
        L3e:
            li.c.O(r12)
            int r12 = r11.m1734getSelectionJiIwxys$material3_release()
            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.INSTANCE
            int r1 = r1.m1488getHourJiIwxys()
            boolean r12 = androidx.compose.material3.Selection.m1484equalsimpl0(r12, r1)
            if (r12 == 0) goto L5e
            float r12 = r11.getMinuteAngle$material3_release()
            float r1 = r11.getHourAngle$material3_release()
            kotlin.Pair r12 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r12, r1)
            goto L6a
        L5e:
            float r12 = r11.getHourAngle$material3_release()
            float r1 = r11.getMinuteAngle$material3_release()
            kotlin.Pair r12 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r12, r1)
        L6a:
            java.lang.Object r1 = r12.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r12 = r12.component2()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r11.currentAngle
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r6.L$0 = r11
            r6.F$0 = r12
            r6.label = r3
            java.lang.Object r1 = r4.snapTo(r5, r6)
            if (r1 != r0) goto L92
            return r0
        L92:
            r3 = r11
            r1 = r12
        L94:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r3.currentAngle
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r1, r7, r4, r7)
            r5 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            r6.L$0 = r7
            r6.label = r2
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto Lbb
            return r0
        Lbb:
            kotlin.j r12 = kotlin.j.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.animateToCurrent$material3_release(dj.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCenter-nOcc-ac$material3_release, reason: not valid java name */
    public final long m1733getCenternOccac$material3_release() {
        return ((IntOffset) this.center.getValue()).getPackedValue();
    }

    public final Animatable<Float, AnimationVector1D> getCurrentAngle$material3_release() {
        return this.currentAngle;
    }

    public final int getHour() {
        return toHour(getHourAngle$material3_release()) + (isAfternoon() ? 12 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getHourAngle$material3_release() {
        return ((Number) this.hourAngle.getValue()).floatValue();
    }

    public final int getHourForDisplay$material3_release() {
        return hourForDisplay(getHour());
    }

    public final int getMinute() {
        return toMinute(getMinuteAngle$material3_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getMinuteAngle$material3_release() {
        return ((Number) this.minuteAngle.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSelection-JiIwxys$material3_release, reason: not valid java name */
    public final int m1734getSelectionJiIwxys$material3_release() {
        return ((Selection) this.selection.getValue()).m1487unboximpl();
    }

    /* JADX INFO: renamed from: getSelectorPos-RKDOV3M$material3_release, reason: not valid java name */
    public final long m1735getSelectorPosRKDOV3M$material3_release() {
        return ((DpOffset) this.selectorPos.getValue()).getPackedValue();
    }

    public final List<Integer> getValues$material3_release() {
        return Selection.m1484equalsimpl0(m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1489getMinuteJiIwxys()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    /* JADX INFO: renamed from: is24hour, reason: from getter */
    public final boolean getIs24hour() {
        return this.is24hour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAfternoonToggle$material3_release() {
        return ((Boolean) this.isAfternoonToggle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInnerCircle$material3_release() {
        return ((Boolean) this.isInnerCircle.getValue()).booleanValue();
    }

    public final boolean isSelected$material3_release(int value) {
        if (!Selection.m1484equalsimpl0(m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1489getMinuteJiIwxys())) {
            if (getHour() == value + (isAfternoon() ? 12 : 0)) {
                return true;
            }
        } else if (value == getMinute()) {
            return true;
        }
        return false;
    }

    public final void moveSelector$material3_release(float x, float y, float maxDist) {
        if (Selection.m1484equalsimpl0(m1734getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1488getHourJiIwxys()) && this.is24hour) {
            setInnerCircle$material3_release(TimePickerKt.dist(x, y, IntOffset.m5385getXimpl(m1733getCenternOccac$material3_release()), IntOffset.m5386getYimpl(m1733getCenternOccac$material3_release())) < maxDist);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onTap$material3_release(float r11, float r12, float r13, boolean r14, dj.c<? super kotlin.j> r15) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.onTap$material3_release(float, float, float, boolean, dj.c):java.lang.Object");
    }

    public final void setAfternoonToggle$material3_release(boolean z) {
        this.isAfternoonToggle.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: setCenter--gyyYBs$material3_release, reason: not valid java name */
    public final void m1736setCentergyyYBs$material3_release(long j) {
        this.center.setValue(IntOffset.m5376boximpl(j));
    }

    public final void setHour$material3_release(int hour) {
        setInnerCircle$material3_release(hour > 12 || hour == 0);
        setHourAngle$material3_release(((hour * 0.5235988f) % 12) - 1.5707964f);
    }

    public final void setHourAngle$material3_release(float f) {
        this.hourAngle.setValue(Float.valueOf(f));
    }

    public final void setInnerCircle$material3_release(boolean z) {
        this.isInnerCircle.setValue(Boolean.valueOf(z));
    }

    public final void setMinute$material3_release(int minute) {
        setMinuteAngle$material3_release((minute * 0.10471976f) - 1.5707964f);
    }

    public final void setMinuteAngle$material3_release(float f) {
        this.minuteAngle.setValue(Float.valueOf(f));
    }

    /* JADX INFO: renamed from: setSelection-iHAOin8$material3_release, reason: not valid java name */
    public final void m1737setSelectioniHAOin8$material3_release(int i2) {
        this.selection.setValue(Selection.m1481boximpl(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settle(dj.c<? super kotlin.j> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.TimePickerState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.TimePickerState$settle$1 r0 = (androidx.compose.material3.TimePickerState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.TimePickerState$settle$1 r0 = new androidx.compose.material3.TimePickerState$settle$1
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            li.c.O(r12)
            goto L92
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            java.lang.Object r1 = r6.L$1
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            li.c.O(r12)
            goto L6a
        L3f:
            li.c.O(r12)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r11.currentAngle
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r1 = r11.getMinuteAngle$material3_release()
            kotlin.Pair r1 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r12, r1)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r11.currentAngle
            java.lang.Object r4 = r1.getFirst()
            r6.L$0 = r11
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r12 = r12.snapTo(r4, r6)
            if (r12 != r0) goto L69
            return r0
        L69:
            r3 = r11
        L6a:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r3.currentAngle
            java.lang.Object r3 = r1.getSecond()
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r1, r7, r4, r7)
            r5 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r2
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L92
            return r0
        L92:
            kotlin.j r12 = kotlin.j.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.settle(dj.c):java.lang.Object");
    }

    public final Object update$material3_release(float f, boolean z, dj.c<? super j> cVar) {
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new TimePickerState$update$2(this, f, z, null), cVar);
        return objMutate == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate : j.a;
    }
}
