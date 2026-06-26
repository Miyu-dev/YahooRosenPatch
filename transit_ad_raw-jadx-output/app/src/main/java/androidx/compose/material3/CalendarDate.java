package androidx.compose.material3;

import a6.h;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018HÖ\u0003J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Landroidx/compose/material3/CalendarDate;", "", "year", "", "month", "dayOfMonth", "utcTimeMillis", "", "(IIIJ)V", "getDayOfMonth", "()I", "getMonth", "getUtcTimeMillis", "()J", "getYear", "compareTo", "other", "component1", "component2", "component3", "component4", "copy", "equals", "", "", "format", "", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "skeleton", "locale", "Ljava/util/Locale;", "hashCode", "toString", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final /* data */ class CalendarDate implements Comparable<CalendarDate> {
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    public CalendarDate(int i2, int i3, int i4, long j) {
        this.year = i2;
        this.month = i3;
        this.dayOfMonth = i4;
        this.utcTimeMillis = j;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i2, int i3, int i4, long j, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = calendarDate.year;
        }
        if ((i5 & 2) != 0) {
            i3 = calendarDate.month;
        }
        int i6 = i3;
        if ((i5 & 4) != 0) {
            i4 = calendarDate.dayOfMonth;
        }
        int i7 = i4;
        if ((i5 & 8) != 0) {
            j = calendarDate.utcTimeMillis;
        }
        return calendarDate.copy(i2, i6, i7, j);
    }

    public static /* synthetic */ String format$default(CalendarDate calendarDate, CalendarModel calendarModel, String str, Locale locale, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
            m.g(locale, "getDefault()");
        }
        return calendarDate.format(calendarModel, str, locale);
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
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    public final CalendarDate copy(int year, int month, int dayOfMonth, long utcTimeMillis) {
        return new CalendarDate(year, month, dayOfMonth, utcTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) other;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String skeleton, Locale locale) {
        m.h(calendarModel, "calendarModel");
        m.h(skeleton, "skeleton");
        m.h(locale, "locale");
        return calendarModel.formatWithSkeleton(this, skeleton, locale);
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getMonth() {
        return this.month;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int i2 = ((((this.year * 31) + this.month) * 31) + this.dayOfMonth) * 31;
        long j = this.utcTimeMillis;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", dayOfMonth=");
        sb.append(this.dayOfMonth);
        sb.append(", utcTimeMillis=");
        return h.h(sb, this.utcTimeMillis, ')');
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarDate other) {
        m.h(other, "other");
        long j = this.utcTimeMillis;
        long j2 = other.utcTimeMillis;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
