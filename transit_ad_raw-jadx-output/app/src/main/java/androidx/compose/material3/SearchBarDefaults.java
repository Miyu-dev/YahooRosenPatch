package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.Metadata;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u008d\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J¡\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u00020\u00192\b\b\u0002\u00101\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "dockedShape", "Landroidx/compose/ui/graphics/Shape;", "getDockedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "inputFieldShape", "getInputFieldShape", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "colors", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "inputFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "placeholderColor", "disabledPlaceholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;

    static {
        SearchBarTokens searchBarTokens = SearchBarTokens.INSTANCE;
        Elevation = searchBarTokens.m2262getContainerElevationD9Ej5fM();
        InputFieldHeight = searchBarTokens.m2263getContainerHeightD9Ej5fM();
    }

    private SearchBarDefaults() {
    }

    @Composable
    /* JADX INFO: renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m1466colorsKlgxPg(long j, long j2, TextFieldColors textFieldColors, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(701925149);
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long color2 = (i3 & 2) != 0 ? ColorSchemeKt.toColor(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        TextFieldColors textFieldColorsM1470inputFieldColorsITpI4ow = (i3 & 4) != 0 ? m1470inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i2 << 3) & 57344, 16383) : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(701925149, i2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:525)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(color, color2, textFieldColorsM1470inputFieldColorsITpI4ow, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return searchBarColors;
    }

    @Composable
    public final Shape getDockedShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-1447354121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1447354121, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:511)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1467getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final Shape getFullScreenShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-2009956471);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009956471, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:508)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m1468getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    @Composable
    public final Shape getInputFieldShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-1770571533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1770571533, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:504)");
        }
        Shape shape = ShapesKt.toShape(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        composer.startReplaceableGroup(-1795925906);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795925906, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:514)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    @Composable
    /* JADX INFO: renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1469inputFieldColorsuKgnY(long j, long j2, long j3, TextSelectionColors textSelectionColors, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(1842555178);
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long jM2817copywmQWz5c$default = (i4 & 2) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long color2 = (i4 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j3;
        TextSelectionColors textSelectionColors2 = (i4 & 8) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color3 = (i4 & 16) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j4;
        long color4 = (i4 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long jM2817copywmQWz5c$default2 = (i4 & 64) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long color5 = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j7;
        long color6 = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long jM2817copywmQWz5c$default3 = (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long color7 = (i4 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j10;
        long jM2817copywmQWz5c$default4 = (i4 & 2048) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842555178, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:599)");
        }
        int i5 = i2 << 3;
        int i6 = i3 << 6;
        TextFieldColors textFieldColorsM1470inputFieldColorsITpI4ow = m1470inputFieldColorsITpI4ow(color, color, jM2817copywmQWz5c$default, color2, textSelectionColors2, color3, color4, jM2817copywmQWz5c$default2, color5, color6, jM2817copywmQWz5c$default3, color7, color7, jM2817copywmQWz5c$default4, composer, (i2 & 14) | (i5 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), ((i2 >> 27) & 14) | ((i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1470inputFieldColorsITpI4ow;
    }

    @Composable
    /* JADX INFO: renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m1470inputFieldColorsITpI4ow(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-2048506052);
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long color2 = (i4 & 2) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        long jM2817copywmQWz5c$default = (i4 & 4) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        TextSelectionColors textSelectionColors2 = (i4 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i4 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long color5 = (i4 & 64) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long jM2817copywmQWz5c$default2 = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long color6 = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long color7 = (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        long jM2817copywmQWz5c$default3 = (i4 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long color8 = (i4 & 2048) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long color9 = (i4 & 4096) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        long jM2817copywmQWz5c$default4 = (i4 & 8192) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2048506052, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:560)");
        }
        int i5 = i3 << 18;
        TextFieldColors textFieldColorsM1655colors0hiis_0 = TextFieldDefaults.INSTANCE.m1655colors0hiis_0(color, color2, jM2817copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, color3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, color4, color5, jM2817copywmQWz5c$default2, 0L, color6, color7, jM2817copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, color8, color9, jM2817copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | ((i2 << 15) & 234881024), ((i2 >> 12) & 14) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | ((i2 << 3) & 1879048192), ((i2 >> 27) & 14) | ((i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1655colors0hiis_0;
    }
}
