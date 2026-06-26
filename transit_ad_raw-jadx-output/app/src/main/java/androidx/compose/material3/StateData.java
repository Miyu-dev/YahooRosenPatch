package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001:B8\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u00107\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\b8\u00109J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR+\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\u0011\u0010-\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b2\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"Landroidx/compose/material3/StateData;", "", "", "startDateMillis", "endDateMillis", "Lkotlin/j;", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/DisplayMode;", "displayMode", "switchDisplayMode-vCnGnXg", "(I)V", "switchDisplayMode", "Lqj/f;", "yearRange", "Lqj/f;", "getYearRange", "()Lqj/f;", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/CalendarModel;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/CalendarDate;", "selectedStartDate", "Landroidx/compose/runtime/MutableState;", "getSelectedStartDate", "()Landroidx/compose/runtime/MutableState;", "setSelectedStartDate", "(Landroidx/compose/runtime/MutableState;)V", "selectedEndDate", "getSelectedEndDate", "setSelectedEndDate", "Landroidx/compose/material3/CalendarMonth;", "<set-?>", "displayedMonth$delegate", "getDisplayedMonth", "()Landroidx/compose/material3/CalendarMonth;", "setDisplayedMonth", "(Landroidx/compose/material3/CalendarMonth;)V", "displayedMonth", "getDisplayMode", "setDisplayMode", "getCurrentMonth", "currentMonth", "", "getDisplayedMonthIndex", "()I", "displayedMonthIndex", "getTotalMonthsInRange", "totalMonthsInRange", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lqj/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class StateData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CalendarModel calendarModel;
    private MutableState<DisplayMode> displayMode;

    /* JADX INFO: renamed from: displayedMonth$delegate, reason: from kotlin metadata */
    private final MutableState displayedMonth;
    private MutableState<CalendarDate> selectedEndDate;
    private MutableState<CalendarDate> selectedStartDate;
    private final f yearRange;

    /* JADX INFO: compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/StateData$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/StateData;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<StateData, Object> Saver() {
            return ListSaverKt.listSaver(new p<SaverScope, StateData, List<? extends Object>>() { // from class: androidx.compose.material3.StateData$Companion$Saver$1
                public final List<Object> invoke(SaverScope saverScope, StateData stateData) {
                    m.h(saverScope, "$this$listSaver");
                    m.h(stateData, "it");
                    Object[] objArr = new Object[6];
                    CalendarDate value = stateData.getSelectedStartDate().getValue();
                    objArr[0] = value != null ? Long.valueOf(value.getUtcTimeMillis()) : null;
                    CalendarDate value2 = stateData.getSelectedEndDate().getValue();
                    objArr[1] = value2 != null ? Long.valueOf(value2.getUtcTimeMillis()) : null;
                    objArr[2] = Long.valueOf(stateData.getDisplayedMonth().getStartUtcTimeMillis());
                    objArr[3] = Integer.valueOf(((qj.d) stateData.getYearRange()).a);
                    objArr[4] = Integer.valueOf(((qj.d) stateData.getYearRange()).b);
                    objArr[5] = Integer.valueOf(stateData.getDisplayMode().getValue().getValue());
                    return a.f.V(objArr);
                }
            }, new l<List, StateData>() { // from class: androidx.compose.material3.StateData$Companion$Saver$2
                public final StateData invoke(List<? extends Object> list) {
                    m.h(list, "value");
                    Long l = (Long) list.get(0);
                    Long l2 = (Long) list.get(1);
                    Long l3 = (Long) list.get(2);
                    Object obj = list.get(3);
                    m.f(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(4);
                    m.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                    f fVar = new f(iIntValue, ((Integer) obj2).intValue());
                    Object obj3 = list.get(5);
                    m.f(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new StateData(l, l2, l3, fVar, DisplayMode.m1252constructorimpl(((Integer) obj3).intValue()), null);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ StateData(Long l, Long l2, Long l3, f fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, fVar, i2);
    }

    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final CalendarMonth getCurrentMonth() {
        CalendarModel calendarModel = this.calendarModel;
        return calendarModel.getMonth(calendarModel.getToday());
    }

    public final MutableState<DisplayMode> getDisplayMode() {
        return this.displayMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CalendarMonth getDisplayedMonth() {
        return (CalendarMonth) this.displayedMonth.getValue();
    }

    public final int getDisplayedMonthIndex() {
        return getDisplayedMonth().indexIn(this.yearRange);
    }

    public final MutableState<CalendarDate> getSelectedEndDate() {
        return this.selectedEndDate;
    }

    public final MutableState<CalendarDate> getSelectedStartDate() {
        return this.selectedStartDate;
    }

    public final int getTotalMonthsInRange() {
        f fVar = this.yearRange;
        return ((((qj.d) fVar).b - ((qj.d) fVar).a) + 1) * 12;
    }

    public final f getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayMode(MutableState<DisplayMode> mutableState) {
        m.h(mutableState, "<set-?>");
        this.displayMode = mutableState;
    }

    public final void setDisplayedMonth(CalendarMonth calendarMonth) {
        m.h(calendarMonth, "<set-?>");
        this.displayedMonth.setValue(calendarMonth);
    }

    public final void setSelectedEndDate(MutableState<CalendarDate> mutableState) {
        m.h(mutableState, "<set-?>");
        this.selectedEndDate = mutableState;
    }

    public final void setSelectedStartDate(MutableState<CalendarDate> mutableState) {
        m.h(mutableState, "<set-?>");
        this.selectedStartDate = mutableState;
    }

    public final void setSelection(Long startDateMillis, Long endDateMillis) {
        CalendarDate canonicalDate = startDateMillis != null ? this.calendarModel.getCanonicalDate(startDateMillis.longValue()) : null;
        CalendarDate canonicalDate2 = endDateMillis != null ? this.calendarModel.getCanonicalDate(endDateMillis.longValue()) : null;
        if (canonicalDate != null && !this.yearRange.e(canonicalDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + canonicalDate.getYear() + ") is out of the years range of " + this.yearRange + '.').toString());
        }
        if (canonicalDate2 != null && !this.yearRange.e(canonicalDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + canonicalDate2.getYear() + ") is out of the years range of " + this.yearRange + '.').toString());
        }
        if (canonicalDate2 != null) {
            if (canonicalDate == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.".toString());
            }
            if (!(canonicalDate.getUtcTimeMillis() <= canonicalDate2.getUtcTimeMillis())) {
                throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
            }
        }
        this.selectedStartDate.setValue(canonicalDate);
        this.selectedEndDate.setValue(canonicalDate2);
    }

    /* JADX INFO: renamed from: switchDisplayMode-vCnGnXg, reason: not valid java name */
    public final void m1510switchDisplayModevCnGnXg(int displayMode) {
        CalendarDate value = this.selectedStartDate.getValue();
        if (value != null) {
            setDisplayedMonth(this.calendarModel.getMonth(value));
        }
        if (this.selectedStartDate.getValue() == null && this.selectedEndDate.getValue() != null) {
            this.selectedEndDate.setValue(null);
        }
        this.displayMode.setValue(DisplayMode.m1251boximpl(displayMode));
    }

    private StateData(Long l, Long l2, Long l3, f fVar, int i2) {
        CalendarMonth currentMonth;
        m.h(fVar, "yearRange");
        this.yearRange = fVar;
        CalendarModel CalendarModel = CalendarModel_androidKt.CalendarModel();
        this.calendarModel = CalendarModel;
        this.selectedStartDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.selectedEndDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l, l2);
        if (l3 != null) {
            currentMonth = CalendarModel.getMonth(l3.longValue());
            if (!fVar.e(currentMonth.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + currentMonth.getYear() + ") is out of the years range of " + fVar + '.').toString());
            }
        } else {
            currentMonth = getCurrentMonth();
        }
        this.displayedMonth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentMonth, null, 2, null);
        this.displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m1251boximpl(i2), null, 2, null);
    }
}
