package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material3/Strings;", "getString-NWtq2-8", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-iSCLEhQ", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class Strings_androidKt {
    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: getString-NWtq2-8, reason: not valid java name */
    public static final String m1581getStringNWtq28(int i2, Composer composer, int i3) {
        String string;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i3, -1, "androidx.compose.material3.getString (Strings.android.kt:28)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.m1515equalsimpl0(i2, companion.m1561getNavigationMenuadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            m.g(string, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1523getCloseDraweradMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
            m.g(string, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1524getCloseSheetadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
            m.g(string, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1556getDefaultErrorMessageadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
            m.g(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1558getExposedDropdownMenuadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            m.g(string, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1564getSliderRangeStartadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
            m.g(string, "resources.getString(R.string.range_start)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1563getSliderRangeEndadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
            m.g(string, "resources.getString(R.string.range_end)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1557getDialogadMyvUU())) {
            string = resources.getString(R.string.dialog);
            m.g(string, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1560getMenuExpandedadMyvUU())) {
            string = resources.getString(R.string.expanded);
            m.g(string, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1559getMenuCollapsedadMyvUU())) {
            string = resources.getString(R.string.collapsed);
            m.g(string, "resources.getString(andr…rial3.R.string.collapsed)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1565getSnackbarDismissadMyvUU())) {
            string = resources.getString(R.string.snackbar_dismiss);
            m.g(string, "resources.getString(\n   …nackbar_dismiss\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1562getSearchBarSearchadMyvUU())) {
            string = resources.getString(R.string.search_bar_search);
            m.g(string, "resources.getString(\n   …arch_bar_search\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1566getSuggestionsAvailableadMyvUU())) {
            string = resources.getString(R.string.suggestions_available);
            m.g(string, "resources.getString(andr…ng.suggestions_available)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1545getDatePickerTitleadMyvUU())) {
            string = resources.getString(R.string.date_picker_title);
            m.g(string, "resources.getString(\n   …te_picker_title\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1533getDatePickerHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_picker_headline);
            m.g(string, "resources.getString(\n   …picker_headline\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1547getDatePickerYearPickerPaneTitleadMyvUU())) {
            string = resources.getString(R.string.date_picker_year_picker_pane_title);
            m.g(string, "resources.getString(\n   …cker_pane_title\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1544getDatePickerSwitchToYearSelectionadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_year_selection);
            m.g(string, "resources.getString(\n   …_year_selection\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1540getDatePickerSwitchToDaySelectionadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_day_selection);
            m.g(string, "resources.getString(\n   …o_day_selection\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1542getDatePickerSwitchToNextMonthadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_next_month);
            m.g(string, "resources.getString(\n   …h_to_next_month\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1543getDatePickerSwitchToPreviousMonthadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_previous_month);
            m.g(string, "resources.getString(\n   …_previous_month\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1535getDatePickerNavigateToYearDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_navigate_to_year_description);
            m.g(string, "resources.getString(\n   …ear_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1534getDatePickerHeadlineDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_headline_description);
            m.g(string, "resources.getString(\n   …ine_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1536getDatePickerNoSelectionDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_no_selection_description);
            m.g(string, "resources.getString(\n   …ion_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1546getDatePickerTodayDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_picker_today_description);
            m.g(string, "resources.getString(\n   …day_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1538getDatePickerScrollToShowLaterYearsadMyvUU())) {
            string = resources.getString(R.string.date_picker_scroll_to_later_years);
            m.g(string, "resources.getString(\n   …_to_later_years\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1537getDatePickerScrollToShowEarlierYearsadMyvUU())) {
            string = resources.getString(R.string.date_picker_scroll_to_earlier_years);
            m.g(string, "resources.getString(\n   …o_earlier_years\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1532getDateInputTitleadMyvUU())) {
            string = resources.getString(R.string.date_input_title);
            m.g(string, "resources.getString(\n   …ate_input_title\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1525getDateInputHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_input_headline);
            m.g(string, "resources.getString(\n   …_input_headline\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1530getDateInputLabeladMyvUU())) {
            string = resources.getString(R.string.date_input_label);
            m.g(string, "resources.getString(\n   …ate_input_label\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1526getDateInputHeadlineDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_input_headline_description);
            m.g(string, "resources.getString(\n   …ine_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1531getDateInputNoInputDescriptionadMyvUU())) {
            string = resources.getString(R.string.date_input_no_input_description);
            m.g(string, "resources.getString(\n   …put_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1528getDateInputInvalidNotAllowedadMyvUU())) {
            string = resources.getString(R.string.date_input_invalid_not_allowed);
            m.g(string, "resources.getString(\n   …lid_not_allowed\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1527getDateInputInvalidForPatternadMyvUU())) {
            string = resources.getString(R.string.date_input_invalid_for_pattern);
            m.g(string, "resources.getString(\n   …lid_for_pattern\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1529getDateInputInvalidYearRangeadMyvUU())) {
            string = resources.getString(R.string.date_input_invalid_year_range);
            m.g(string, "resources.getString(\n   …alid_year_range\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1539getDatePickerSwitchToCalendarModeadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_calendar_mode);
            m.g(string, "resources.getString(\n   …o_calendar_mode\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1541getDatePickerSwitchToInputModeadMyvUU())) {
            string = resources.getString(R.string.date_picker_switch_to_input_mode);
            m.g(string, "resources.getString(\n   …h_to_input_mode\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1555getDateRangePickerTitleadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_title);
            m.g(string, "resources.getString(\n   …ge_picker_title\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1554getDateRangePickerStartHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_start_headline);
            m.g(string, "resources.getString(\n   …_start_headline\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1551getDateRangePickerEndHeadlineadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_end_headline);
            m.g(string, "resources.getString(\n   …er_end_headline\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1552getDateRangePickerScrollToShowNextMonthadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_scroll_to_next_month);
            m.g(string, "resources.getString(\n   …l_to_next_month\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1553getDateRangePickerScrollToShowPreviousMonthadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_scroll_to_previous_month);
            m.g(string, "resources.getString(\n   …_previous_month\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1550getDateRangePickerDayInRangeadMyvUU())) {
            string = resources.getString(R.string.date_range_picker_day_in_range);
            m.g(string, "resources.getString(\n   …er_day_in_range\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1549getDateRangeInputTitleadMyvUU())) {
            string = resources.getString(R.string.date_range_input_title);
            m.g(string, "resources.getString(\n   …nge_input_title\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1548getDateRangeInputInvalidRangeInputadMyvUU())) {
            string = resources.getString(R.string.date_range_input_invalid_range_input);
            m.g(string, "resources.getString(\n   …lid_range_input\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1520getBottomSheetDragHandleDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_drag_handle_description);
            m.g(string, "resources.getString(\n   …dle_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1522getBottomSheetPartialExpandDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_collapse_description);
            m.g(string, "resources.getString(\n   …pse_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1519getBottomSheetDismissDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_dismiss_description);
            m.g(string, "resources.getString(\n   …iss_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1521getBottomSheetExpandDescriptionadMyvUU())) {
            string = resources.getString(R.string.bottom_sheet_expand_description);
            m.g(string, "resources.getString(\n   …and_description\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1579getTooltipLongPressLabeladMyvUU())) {
            string = resources.getString(R.string.tooltip_long_press_label);
            m.g(string, "resources.getString(\n   …ong_press_label\n        )");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1568getTimePickerAMadMyvUU())) {
            string = resources.getString(R.string.time_picker_am);
            m.g(string, "resources.getString(\n   ….R.string.time_picker_am)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1577getTimePickerPMadMyvUU())) {
            string = resources.getString(R.string.time_picker_pm);
            m.g(string, "resources.getString(\n   ….R.string.time_picker_pm)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1578getTimePickerPeriodToggleadMyvUU())) {
            string = resources.getString(R.string.time_picker_period_toggle_description);
            m.g(string, "resources.getString(\n   …eriod_toggle_description)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1574getTimePickerMinuteSelectionadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute_selection);
            m.g(string, "resources.getString(\n   …_picker_minute_selection)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1570getTimePickerHourSelectionadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_selection);
            m.g(string, "resources.getString(\n   …me_picker_hour_selection)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1571getTimePickerHourSuffixadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_suffix);
            m.g(string, "resources.getString(\n   ….time_picker_hour_suffix)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1575getTimePickerMinuteSuffixadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute_suffix);
            m.g(string, "resources.getString(\n   …ime_picker_minute_suffix)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1567getTimePicker24HourSuffixadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_24h_suffix);
            m.g(string, "resources.getString(\n   …e_picker_hour_24h_suffix)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1569getTimePickerHouradMyvUU())) {
            string = resources.getString(R.string.time_picker_hour);
            m.g(string, "resources.getString(\n   ….string.time_picker_hour)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1573getTimePickerMinuteadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute);
            m.g(string, "resources.getString(\n   …tring.time_picker_minute)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1572getTimePickerHourTextFieldadMyvUU())) {
            string = resources.getString(R.string.time_picker_hour_text_field);
            m.g(string, "resources.getString(\n   …e_picker_hour_text_field)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1576getTimePickerMinuteTextFieldadMyvUU())) {
            string = resources.getString(R.string.time_picker_minute_text_field);
            m.g(string, "resources.getString(\n   …picker_minute_text_field)");
        } else if (Strings.m1515equalsimpl0(i2, companion.m1580getTooltipPaneDescriptionadMyvUU())) {
            string = resources.getString(R.string.tooltip_pane_description);
            m.g(string, "resources.getString(\n   …tooltip_pane_description)");
        } else {
            string = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: getString-iSCLEhQ, reason: not valid java name */
    public static final String m1582getStringiSCLEhQ(int i2, Object[] objArr, Composer composer, int i3) {
        m.h(objArr, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126124681, i3, -1, "androidx.compose.material3.getString (Strings.android.kt:201)");
        }
        String strM1581getStringNWtq28 = m1581getStringNWtq28(i2, composer, i3 & 14);
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String strG = androidx.compose.animation.b.g(objArrCopyOf, objArrCopyOf.length, locale, strM1581getStringNWtq28, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strG;
    }
}
