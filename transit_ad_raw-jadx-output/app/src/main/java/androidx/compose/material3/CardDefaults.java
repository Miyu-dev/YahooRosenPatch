package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0013JQ\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010'J=\u0010(\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u0013JQ\u0010*\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "()V", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "cardColors", "Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @Composable
    /* JADX INFO: renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1071cardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jM2863compositeOverOWjLjI;
        composer.startReplaceableGroup(-1589582123);
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(FilledCardTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long jM1152contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(color, composer, i2 & 14) : j2;
        if ((i3 & 4) != 0) {
            FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
            jM2863compositeOverOWjLjI = ColorKt.m2863compositeOverOWjLjI(Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(filledCardTokens.getDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1157surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), filledCardTokens.m2053getDisabledContainerElevationD9Ej5fM()));
        } else {
            jM2863compositeOverOWjLjI = j3;
        }
        long jM2817copywmQWz5c$default = (i3 & 8) != 0 ? Color.m2817copywmQWz5c$default(ColorSchemeKt.m1152contentColorForek8zF_U(color, composer, i2 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:455)");
        }
        CardColors cardColors = new CardColors(color, jM1152contentColorForek8zF_U, jM2863compositeOverOWjLjI, jM2817copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* JADX INFO: renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1072cardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-574898487);
        float fM2052getContainerElevationD9Ej5fM = (i3 & 1) != 0 ? FilledCardTokens.INSTANCE.m2052getContainerElevationD9Ej5fM() : f;
        float fM2058getPressedContainerElevationD9Ej5fM = (i3 & 2) != 0 ? FilledCardTokens.INSTANCE.m2058getPressedContainerElevationD9Ej5fM() : f2;
        float fM2055getFocusContainerElevationD9Ej5fM = (i3 & 4) != 0 ? FilledCardTokens.INSTANCE.m2055getFocusContainerElevationD9Ej5fM() : f3;
        float fM2056getHoverContainerElevationD9Ej5fM = (i3 & 8) != 0 ? FilledCardTokens.INSTANCE.m2056getHoverContainerElevationD9Ej5fM() : f4;
        float fM2054getDraggedContainerElevationD9Ej5fM = (i3 & 16) != 0 ? FilledCardTokens.INSTANCE.m2054getDraggedContainerElevationD9Ej5fM() : f5;
        float fM2053getDisabledContainerElevationD9Ej5fM = (i3 & 32) != 0 ? FilledCardTokens.INSTANCE.m2053getDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i2, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:373)");
        }
        CardElevation cardElevation = new CardElevation(fM2052getContainerElevationD9Ej5fM, fM2058getPressedContainerElevationD9Ej5fM, fM2055getFocusContainerElevationD9Ej5fM, fM2056getHoverContainerElevationD9Ej5fM, fM2054getDraggedContainerElevationD9Ej5fM, fM2053getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @Composable
    /* JADX INFO: renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1073elevatedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jM2863compositeOverOWjLjI;
        composer.startReplaceableGroup(139558303);
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long jM1152contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(color, composer, i2 & 14) : j2;
        if ((i3 & 4) != 0) {
            ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
            jM2863compositeOverOWjLjI = ColorKt.m2863compositeOverOWjLjI(Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(elevatedCardTokens.getDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1157surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), elevatedCardTokens.m1969getDisabledContainerElevationD9Ej5fM()));
        } else {
            jM2863compositeOverOWjLjI = j3;
        }
        long jM2817copywmQWz5c$default = (i3 & 8) != 0 ? Color.m2817copywmQWz5c$default(jM1152contentColorForek8zF_U, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:484)");
        }
        CardColors cardColors = new CardColors(color, jM1152contentColorForek8zF_U, jM2863compositeOverOWjLjI, jM2817copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* JADX INFO: renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1074elevatedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1154241939);
        float fM1968getContainerElevationD9Ej5fM = (i3 & 1) != 0 ? ElevatedCardTokens.INSTANCE.m1968getContainerElevationD9Ej5fM() : f;
        float fM1974getPressedContainerElevationD9Ej5fM = (i3 & 2) != 0 ? ElevatedCardTokens.INSTANCE.m1974getPressedContainerElevationD9Ej5fM() : f2;
        float fM1971getFocusContainerElevationD9Ej5fM = (i3 & 4) != 0 ? ElevatedCardTokens.INSTANCE.m1971getFocusContainerElevationD9Ej5fM() : f3;
        float fM1972getHoverContainerElevationD9Ej5fM = (i3 & 8) != 0 ? ElevatedCardTokens.INSTANCE.m1972getHoverContainerElevationD9Ej5fM() : f4;
        float fM1970getDraggedContainerElevationD9Ej5fM = (i3 & 16) != 0 ? ElevatedCardTokens.INSTANCE.m1970getDraggedContainerElevationD9Ej5fM() : f5;
        float fM1969getDisabledContainerElevationD9Ej5fM = (i3 & 32) != 0 ? ElevatedCardTokens.INSTANCE.m1969getDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:401)");
        }
        CardElevation cardElevation = new CardElevation(fM1968getContainerElevationD9Ej5fM, fM1974getPressedContainerElevationD9Ej5fM, fM1971getFocusContainerElevationD9Ej5fM, fM1972getHoverContainerElevationD9Ej5fM, fM1970getDraggedContainerElevationD9Ej5fM, fM1969getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i2) {
        composer.startReplaceableGroup(-133496185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i2, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:357)");
        }
        Shape shape = ShapesKt.toShape(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i2) {
        composer.startReplaceableGroup(1095404023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i2, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:360)");
        }
        Shape shape = ShapesKt.toShape(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i2) {
        composer.startReplaceableGroup(1266660211);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i2, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:354)");
        }
        Shape shape = ShapesKt.toShape(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Composable
    public final BorderStroke outlinedCardBorder(boolean z, Composer composer, int i2, int i3) throws NoWhenBranchMatchedException {
        long jM2863compositeOverOWjLjI;
        composer.startReplaceableGroup(-392936593);
        if ((i3 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:533)");
        }
        if (z) {
            composer.startReplaceableGroup(-31428837);
            jM2863compositeOverOWjLjI = ColorSchemeKt.toColor(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-31428766);
            OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            jM2863compositeOverOWjLjI = ColorKt.m2863compositeOverOWjLjI(Color.m2817copywmQWz5c$default(ColorSchemeKt.toColor(outlinedCardTokens.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1157surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), outlinedCardTokens.m2155getDisabledContainerElevationD9Ej5fM()));
            composer.endReplaceableGroup();
        }
        Color colorM2808boximpl = Color.m2808boximpl(jM2863compositeOverOWjLjI);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(colorM2808boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m201BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m2160getOutlineWidthD9Ej5fM(), jM2863compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }

    @Composable
    /* JADX INFO: renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1075outlinedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1112362409);
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedCardTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long jM1152contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m1152contentColorForek8zF_U(color, composer, i2 & 14) : j2;
        long j5 = (i3 & 4) != 0 ? color : j3;
        long jM2817copywmQWz5c$default = (i3 & 8) != 0 ? Color.m2817copywmQWz5c$default(jM1152contentColorForek8zF_U, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:514)");
        }
        CardColors cardColors = new CardColors(color, jM1152contentColorForek8zF_U, j5, jM2817copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* JADX INFO: renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1076outlinedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-97678773);
        float fM2154getContainerElevationD9Ej5fM = (i3 & 1) != 0 ? OutlinedCardTokens.INSTANCE.m2154getContainerElevationD9Ej5fM() : f;
        float f7 = (i3 & 2) != 0 ? fM2154getContainerElevationD9Ej5fM : f2;
        float f8 = (i3 & 4) != 0 ? fM2154getContainerElevationD9Ej5fM : f3;
        float f9 = (i3 & 8) != 0 ? fM2154getContainerElevationD9Ej5fM : f4;
        float fM2156getDraggedContainerElevationD9Ej5fM = (i3 & 16) != 0 ? OutlinedCardTokens.INSTANCE.m2156getDraggedContainerElevationD9Ej5fM() : f5;
        float fM2155getDisabledContainerElevationD9Ej5fM = (i3 & 32) != 0 ? OutlinedCardTokens.INSTANCE.m2155getDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:429)");
        }
        CardElevation cardElevation = new CardElevation(fM2154getContainerElevationD9Ej5fM, f7, f8, f9, fM2156getDraggedContainerElevationD9Ej5fM, fM2155getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }
}
