package androidx.compose.material3;

import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    public static String a(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale) {
        m.h(calendarDate, "date");
        m.h(str, "skeleton");
        m.h(locale, "locale");
        return CalendarModel_androidKt.formatWithSkeleton(calendarDate.getUtcTimeMillis(), str, locale);
    }

    public static String b(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale) {
        m.h(calendarMonth, "month");
        m.h(str, "skeleton");
        m.h(locale, "locale");
        return CalendarModel_androidKt.formatWithSkeleton(calendarMonth.getStartUtcTimeMillis(), str, locale);
    }

    public static /* synthetic */ String c(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
            m.g(locale, "getDefault()");
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }

    public static /* synthetic */ String d(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
            m.g(locale, "getDefault()");
        }
        return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
    }

    public static /* synthetic */ DateInputFormat e(CalendarModel calendarModel, Locale locale, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((i2 & 1) != 0) {
            locale = Locale.getDefault();
            m.g(locale, "getDefault()");
        }
        return calendarModel.getDateInputFormat(locale);
    }
}
