package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019B0\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR4\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "", "", "dateMillis", "Lkotlin/j;", "setSelection", "(Ljava/lang/Long;)V", "Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/StateData;", "getStateData$material3_release", "()Landroidx/compose/material3/StateData;", "Landroidx/compose/material3/DisplayMode;", "<set-?>", "displayMode$delegate", "Landroidx/compose/runtime/MutableState;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "getSelectedDateMillis", "()Ljava/lang/Long;", "selectedDateMillis", "<init>", "(Landroidx/compose/material3/StateData;)V", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lqj/f;", "yearRange", "initialDisplayMode", "(Ljava/lang/Long;Ljava/lang/Long;Lqj/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DatePickerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: displayMode$delegate, reason: from kotlin metadata */
    private final MutableState displayMode;
    private final StateData stateData;

    /* JADX INFO: compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/DatePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DatePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<DatePickerState, ?> Saver() {
            return SaverKt.Saver(new p<SaverScope, DatePickerState, Object>() { // from class: androidx.compose.material3.DatePickerState$Companion$Saver$1
                public final Object invoke(SaverScope saverScope, DatePickerState datePickerState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(datePickerState, "it");
                    return StateData.INSTANCE.Saver().save(saverScope, datePickerState.getStateData());
                }
            }, new l<Object, DatePickerState>() { // from class: androidx.compose.material3.DatePickerState$Companion$Saver$2
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DatePickerState m1229invoke(Object obj) {
                    m.h(obj, "value");
                    StateData stateDataRestore = StateData.INSTANCE.Saver().restore(obj);
                    m.e(stateDataRestore);
                    return new DatePickerState(stateDataRestore, null);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ DatePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    public final int m1227getDisplayModejFl4v0() {
        return ((DisplayMode) this.displayMode.getValue()).getValue();
    }

    public final Long getSelectedDateMillis() {
        CalendarDate value = this.stateData.getSelectedStartDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    /* JADX INFO: renamed from: getStateData$material3_release, reason: from getter */
    public final StateData getStateData() {
        return this.stateData;
    }

    /* JADX INFO: renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    public final void m1228setDisplayModevCnGnXg(int i2) {
        this.displayMode.setValue(DisplayMode.m1251boximpl(i2));
    }

    public final void setSelection(Long dateMillis) {
        this.stateData.setSelection(dateMillis, null);
    }

    public /* synthetic */ DatePickerState(Long l, Long l2, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, fVar, i2);
    }

    private DatePickerState(StateData stateData) {
        this.stateData = stateData;
        this.displayMode = stateData.getDisplayMode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private DatePickerState(Long l, Long l2, f fVar, int i2) {
        this(new StateData(l, null, l2, fVar, i2, null));
        m.h(fVar, "yearRange");
    }
}
