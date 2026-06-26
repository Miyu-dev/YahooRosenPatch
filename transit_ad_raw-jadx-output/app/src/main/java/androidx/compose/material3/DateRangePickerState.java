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

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cB:\b\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u001b\u0010#J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR4\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "", "", "startDateMillis", "endDateMillis", "Lkotlin/j;", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/StateData;", "getStateData$material3_release", "()Landroidx/compose/material3/StateData;", "Landroidx/compose/material3/DisplayMode;", "<set-?>", "displayMode$delegate", "Landroidx/compose/runtime/MutableState;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "getSelectedStartDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedEndDateMillis", "selectedEndDateMillis", "<init>", "(Landroidx/compose/material3/StateData;)V", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lqj/f;", "yearRange", "initialDisplayMode", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lqj/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DateRangePickerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: displayMode$delegate, reason: from kotlin metadata */
    private final MutableState displayMode;
    private final StateData stateData;

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/DateRangePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DateRangePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<DateRangePickerState, ?> Saver() {
            return SaverKt.Saver(new p<SaverScope, DateRangePickerState, Object>() { // from class: androidx.compose.material3.DateRangePickerState$Companion$Saver$1
                public final Object invoke(SaverScope saverScope, DateRangePickerState dateRangePickerState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(dateRangePickerState, "it");
                    return StateData.INSTANCE.Saver().save(saverScope, dateRangePickerState.getStateData());
                }
            }, new l<Object, DateRangePickerState>() { // from class: androidx.compose.material3.DateRangePickerState$Companion$Saver$2
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DateRangePickerState m1242invoke(Object obj) {
                    m.h(obj, "value");
                    StateData stateDataRestore = StateData.INSTANCE.Saver().restore(obj);
                    m.e(stateDataRestore);
                    return new DateRangePickerState(stateDataRestore, null);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ DateRangePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    public final int m1240getDisplayModejFl4v0() {
        return ((DisplayMode) this.displayMode.getValue()).getValue();
    }

    public final Long getSelectedEndDateMillis() {
        CalendarDate value = this.stateData.getSelectedEndDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    public final Long getSelectedStartDateMillis() {
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
    public final void m1241setDisplayModevCnGnXg(int i2) {
        this.displayMode.setValue(DisplayMode.m1251boximpl(i2));
    }

    public final void setSelection(Long startDateMillis, Long endDateMillis) {
        this.stateData.setSelection(startDateMillis, endDateMillis);
    }

    public /* synthetic */ DateRangePickerState(Long l, Long l2, Long l3, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, fVar, i2);
    }

    private DateRangePickerState(StateData stateData) {
        this.stateData = stateData;
        this.displayMode = stateData.getDisplayMode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private DateRangePickerState(Long l, Long l2, Long l3, f fVar, int i2) {
        this(new StateData(l, l2, l3, fVar, i2, null));
        m.h(fVar, "yearRange");
    }
}
