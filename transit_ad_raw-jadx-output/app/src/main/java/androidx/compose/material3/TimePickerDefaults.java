package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.Metadata;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J¡\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/TimePickerDefaults;", "", "()V", "colors", "Landroidx/compose/material3/TimePickerColors;", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "colors-u3YEpmA", "(JJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TimePickerColors;", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType-sDNSZnc", "(Landroidx/compose/runtime/Composer;I)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final TimePickerDefaults INSTANCE = new TimePickerDefaults();

    private TimePickerDefaults() {
    }

    @Composable
    /* JADX INFO: renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m1698colorsu3YEpmA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-646352288);
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialColor(), composer, 6) : j;
        long color2 = (i4 & 2) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor(), composer, 6) : j2;
        long color3 = (i4 & 4) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor(), composer, 6) : j3;
        long color4 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor(), composer, 6) : j4;
        long color5 = (i4 & 16) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color6 = (i4 & 32) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor(), composer, 6) : j6;
        long color7 = (i4 & 64) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor(), composer, 6) : j7;
        long jM2853getTransparent0d7_KjU = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Color.INSTANCE.m2853getTransparent0d7_KjU() : j8;
        long color8 = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor(), composer, 6) : j9;
        long color9 = (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor(), composer, 6) : j10;
        long color10 = (i4 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor(), composer, 6) : j11;
        long color11 = (i4 & 2048) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor(), composer, 6) : j12;
        long color12 = (i4 & 4096) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor(), composer, 6) : j13;
        long color13 = (i4 & 8192) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-646352288, i2, i3, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:274)");
        }
        TimePickerColors timePickerColors = new TimePickerColors(color, color4, color5, color6, color2, color3, color7, jM2853getTransparent0d7_KjU, color8, color9, color10, color11, color12, color13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerColors;
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m1699layoutTypesDNSZnc(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, i2, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:316)");
        }
        int defaultTimePickerLayoutType = TimePicker_androidKt.getDefaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }
}
