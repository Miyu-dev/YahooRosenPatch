package androidx.compose.material3;

import android.content.res.Configuration;
import android.os.Build;
import android.text.format.DateFormat;
import androidx.compose.material3.CalendarModelImpl;
import androidx.compose.material3.LegacyCalendarModelImpl;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CalendarModel.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0001¨\u0006\u000b"}, d2 = {"CalendarModel", "Landroidx/compose/material3/CalendarModel;", "defaultLocale", "Ljava/util/Locale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "formatWithSkeleton", "", "utcTimeMillis", "", "skeleton", "locale", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class CalendarModel_androidKt {
    @ExperimentalMaterial3Api
    public static final CalendarModel CalendarModel() {
        return Build.VERSION.SDK_INT >= 26 ? new CalendarModelImpl() : new LegacyCalendarModelImpl();
    }

    @Composable
    @ReadOnlyComposable
    @ExperimentalMaterial3Api
    public static final Locale defaultLocale(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895332416, i2, -1, "androidx.compose.material3.defaultLocale (CalendarModel.android.kt:72)");
        }
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
            m.g(locale, "getDefault()");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return locale;
    }

    @ExperimentalMaterial3Api
    public static final String formatWithSkeleton(long j, String str, Locale locale) {
        m.h(str, "skeleton");
        m.h(locale, "locale");
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
        if (Build.VERSION.SDK_INT >= 26) {
            CalendarModelImpl.Companion companion = CalendarModelImpl.INSTANCE;
            m.g(bestDateTimePattern, "pattern");
            return companion.formatWithPattern(j, bestDateTimePattern, locale);
        }
        LegacyCalendarModelImpl.Companion companion2 = LegacyCalendarModelImpl.INSTANCE;
        m.g(bestDateTimePattern, "pattern");
        return companion2.formatWithPattern(j, bestDateTimePattern, locale);
    }

    public static /* synthetic */ String formatWithSkeleton$default(long j, String str, Locale locale, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
            m.g(locale, "m epoch)\n * ");
        }
        return formatWithSkeleton(j, str, locale);
    }
}
