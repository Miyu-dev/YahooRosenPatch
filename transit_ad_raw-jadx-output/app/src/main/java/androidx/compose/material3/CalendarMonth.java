package androidx.compose.material3;

import a6.h;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0011HÆ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/material3/CalendarMonth;", "", "Lqj/f;", "years", "", "indexIn", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "", "skeleton", "Ljava/util/Locale;", "locale", "format", "component1", "component2", "component3", "component4", "", "component5", "year", "month", "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "startUtcTimeMillis", "copy", "toString", "hashCode", "other", "", "equals", "I", "getYear", "()I", "getMonth", "getNumberOfDays", "getDaysFromStartOfWeekToFirstOfMonth", "J", "getStartUtcTimeMillis", "()J", "endUtcTimeMillis", "getEndUtcTimeMillis", "<init>", "(IIIIJ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalendarMonth {
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public CalendarMonth(int i2, int i3, int i4, int i5, long j) {
        this.year = i2;
        this.month = i3;
        this.numberOfDays = i4;
        this.daysFromStartOfWeekToFirstOfMonth = i5;
        this.startUtcTimeMillis = j;
        this.endUtcTimeMillis = ((((long) i4) * CalendarModelKt.MillisecondsIn24Hours) + j) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i2, int i3, int i4, int i5, long j, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = calendarMonth.year;
        }
        if ((i6 & 2) != 0) {
            i3 = calendarMonth.month;
        }
        int i7 = i3;
        if ((i6 & 4) != 0) {
            i4 = calendarMonth.numberOfDays;
        }
        int i8 = i4;
        if ((i6 & 8) != 0) {
            i5 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        int i9 = i5;
        if ((i6 & 16) != 0) {
            j = calendarMonth.startUtcTimeMillis;
        }
        return calendarMonth.copy(i2, i7, i8, i9, j);
    }

    public static /* synthetic */ String format$default(CalendarMonth calendarMonth, CalendarModel calendarModel, String str, Locale locale, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
            m.g(locale, "getDefault()");
        }
        return calendarMonth.format(calendarModel, str, locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final CalendarMonth copy(int year, int month, int numberOfDays, int daysFromStartOfWeekToFirstOfMonth, long startUtcTimeMillis) {
        return new CalendarMonth(year, month, numberOfDays, daysFromStartOfWeekToFirstOfMonth, startUtcTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) other;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String skeleton, Locale locale) {
        m.h(calendarModel, "calendarModel");
        m.h(skeleton, "skeleton");
        m.h(locale, "locale");
        return calendarModel.formatWithSkeleton(this, skeleton, locale);
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int i2 = ((((((this.year * 31) + this.month) * 31) + this.numberOfDays) * 31) + this.daysFromStartOfWeekToFirstOfMonth) * 31;
        long j = this.startUtcTimeMillis;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public final int indexIn(f years) {
        m.h(years, "years");
        return (((this.year - ((qj.d) years).a) * 12) + this.month) - 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", numberOfDays=");
        sb.append(this.numberOfDays);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.daysFromStartOfWeekToFirstOfMonth);
        sb.append(", startUtcTimeMillis=");
        return h.h(sb, this.startUtcTimeMillis, ')');
    }
}
