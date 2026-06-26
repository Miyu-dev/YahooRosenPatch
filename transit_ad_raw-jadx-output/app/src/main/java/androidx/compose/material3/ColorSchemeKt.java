package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aµ\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aµ\u0002\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 \u001a\u001f\u0010'\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010$\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u001d\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a)\u0010.\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\u001f\u00101\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u0014\u00104\u001a\u000203*\u00020\u001e2\u0006\u00102\u001a\u00020\u001eH\u0000\u001a\u001e\u00107\u001a\u00020\u0000*\u00020\u001e2\u0006\u00106\u001a\u000205H\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a\u0016\u00109\u001a\u00020\u0000*\u000205H\u0001ø\u0001\u0001¢\u0006\u0004\b9\u0010:\" \u0010<\u001a\b\u0012\u0004\u0012\u00020\u001e0;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0014\u0010A\u001a\u00020@8\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "darkColorScheme-G1PFc-w", "darkColorScheme", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "applyTonalElevation-Hht5A8o", "(Landroidx/compose/material3/ColorScheme;JF)J", "applyTonalElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "other", "Lkotlin/j;", "updateColorSchemeFrom", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "toColor", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "DisabledAlpha", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new kj.a<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final ColorScheme m1158invoke() {
            return ColorSchemeKt.m1156lightColorSchemeG1PFcw$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536870911, null);
        }
    });

    /* JADX INFO: compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: applyTonalElevation-Hht5A8o, reason: not valid java name */
    public static final long m1150applyTonalElevationHht5A8o(ColorScheme colorScheme, long j, float f) {
        m.h(colorScheme, "$this$applyTonalElevation");
        return Color.m2819equalsimpl0(j, colorScheme.m1116getSurface0d7_KjU()) ? m1157surfaceColorAtElevation3ABfNKs(colorScheme, f) : j;
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1151contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        m.h(colorScheme, "$this$contentColorFor");
        return Color.m2819equalsimpl0(j, colorScheme.m1111getPrimary0d7_KjU()) ? colorScheme.m1101getOnPrimary0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1114getSecondary0d7_KjU()) ? colorScheme.m1103getOnSecondary0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1119getTertiary0d7_KjU()) ? colorScheme.m1107getOnTertiary0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1092getBackground0d7_KjU()) ? colorScheme.m1098getOnBackground0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1093getError0d7_KjU()) ? colorScheme.m1099getOnError0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1116getSurface0d7_KjU()) ? colorScheme.m1105getOnSurface0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1118getSurfaceVariant0d7_KjU()) ? colorScheme.m1106getOnSurfaceVariant0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1112getPrimaryContainer0d7_KjU()) ? colorScheme.m1102getOnPrimaryContainer0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1115getSecondaryContainer0d7_KjU()) ? colorScheme.m1104getOnSecondaryContainer0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1120getTertiaryContainer0d7_KjU()) ? colorScheme.m1108getOnTertiaryContainer0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1094getErrorContainer0d7_KjU()) ? colorScheme.m1100getOnErrorContainer0d7_KjU() : Color.m2819equalsimpl0(j, colorScheme.m1097getInverseSurface0d7_KjU()) ? colorScheme.m1095getInverseOnSurface0d7_KjU() : Color.INSTANCE.m2854getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1152contentColorForek8zF_U(long j, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i2, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long jM1151contentColorFor4WTKRHQ = m1151contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (!(jM1151contentColorFor4WTKRHQ != Color.INSTANCE.m2854getUnspecified0d7_KjU())) {
            jM1151contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2828unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1151contentColorFor4WTKRHQ;
    }

    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1153darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1154darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i2, Object obj) {
        long jM1897getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m1897getPrimary0d7_KjU() : j;
        return m1153darkColorSchemeG1PFcw(jM1897getPrimary0d7_KjU, (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m1887getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m1898getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m1888getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m1882getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m1900getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m1889getOnSecondary0d7_KjU() : j7, (i2 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorDarkTokens.INSTANCE.m1901getSecondaryContainer0d7_KjU() : j8, (i2 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorDarkTokens.INSTANCE.m1890getOnSecondaryContainer0d7_KjU() : j9, (i2 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorDarkTokens.INSTANCE.m1905getTertiary0d7_KjU() : j10, (i2 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorDarkTokens.INSTANCE.m1893getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m1906getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m1894getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m1878getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m1884getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m1902getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m1891getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m1904getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m1892getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? jM1897getPrimary0d7_KjU : j20, (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m1883getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m1881getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m1879getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m1885getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m1880getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m1886getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m1895getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m1896getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m1899getScrim0d7_KjU() : j29);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) throws NoWhenBranchMatchedException {
        m.h(colorScheme, "<this>");
        m.h(colorSchemeKeyTokens, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m1092getBackground0d7_KjU();
            case 2:
                return colorScheme.m1093getError0d7_KjU();
            case 3:
                return colorScheme.m1094getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1095getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1096getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1097getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1098getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1099getOnError0d7_KjU();
            case 9:
                return colorScheme.m1100getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1101getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1102getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1103getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1104getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1105getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1106getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1117getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1107getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1108getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1109getOutline0d7_KjU();
            case 20:
                return colorScheme.m1110getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1111getPrimary0d7_KjU();
            case androidx.appcompat.R.styleable.AppCompatTheme_actionModeCutDrawable /* 22 */:
                return colorScheme.m1112getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1113getScrim0d7_KjU();
            case 24:
                return colorScheme.m1114getSecondary0d7_KjU();
            case androidx.appcompat.R.styleable.AppCompatTheme_actionModePopupWindowStyle /* 25 */:
                return colorScheme.m1115getSecondaryContainer0d7_KjU();
            case androidx.appcompat.R.styleable.AppCompatTheme_actionModeSelectAllDrawable /* 26 */:
                return colorScheme.m1116getSurface0d7_KjU();
            case androidx.appcompat.R.styleable.AppCompatTheme_actionModeShareDrawable /* 27 */:
                return colorScheme.m1118getSurfaceVariant0d7_KjU();
            case androidx.appcompat.R.styleable.AppCompatTheme_actionModeSplitBackground /* 28 */:
                return colorScheme.m1119getTertiary0d7_KjU();
            case androidx.appcompat.R.styleable.AppCompatTheme_actionModeStyle /* 29 */:
                return colorScheme.m1120getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1155lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1156lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i2, Object obj) {
        long jM1926getPrimary0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m1926getPrimary0d7_KjU() : j;
        return m1155lightColorSchemeG1PFcw(jM1926getPrimary0d7_KjU, (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m1916getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m1927getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m1917getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m1911getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m1929getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m1918getOnSecondary0d7_KjU() : j7, (i2 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? ColorLightTokens.INSTANCE.m1930getSecondaryContainer0d7_KjU() : j8, (i2 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? ColorLightTokens.INSTANCE.m1919getOnSecondaryContainer0d7_KjU() : j9, (i2 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? ColorLightTokens.INSTANCE.m1934getTertiary0d7_KjU() : j10, (i2 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? ColorLightTokens.INSTANCE.m1922getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m1935getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m1923getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m1907getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m1913getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? ColorLightTokens.INSTANCE.m1931getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m1920getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? ColorLightTokens.INSTANCE.m1933getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m1921getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? jM1926getPrimary0d7_KjU : j20, (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m1912getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m1910getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m1908getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m1914getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m1909getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m1915getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m1924getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m1925getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m1928getScrim0d7_KjU() : j29);
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1157surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        m.h(colorScheme, "$this$surfaceColorAtElevation");
        if (Dp.m5272equalsimpl0(f, Dp.m5267constructorimpl(0))) {
            return colorScheme.m1116getSurface0d7_KjU();
        }
        return ColorKt.m2863compositeOverOWjLjI(Color.m2817copywmQWz5c$default(colorScheme.m1117getSurfaceTint0d7_KjU(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1116getSurface0d7_KjU());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Composable
    @ReadOnlyComposable
    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i2) throws NoWhenBranchMatchedException {
        m.h(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i2, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme colorScheme2) {
        m.h(colorScheme, "<this>");
        m.h(colorScheme2, "other");
        colorScheme.m1140setPrimary8_81llA$material3_release(colorScheme2.m1111getPrimary0d7_KjU());
        colorScheme.m1130setOnPrimary8_81llA$material3_release(colorScheme2.m1101getOnPrimary0d7_KjU());
        colorScheme.m1141setPrimaryContainer8_81llA$material3_release(colorScheme2.m1112getPrimaryContainer0d7_KjU());
        colorScheme.m1131setOnPrimaryContainer8_81llA$material3_release(colorScheme2.m1102getOnPrimaryContainer0d7_KjU());
        colorScheme.m1125setInversePrimary8_81llA$material3_release(colorScheme2.m1096getInversePrimary0d7_KjU());
        colorScheme.m1143setSecondary8_81llA$material3_release(colorScheme2.m1114getSecondary0d7_KjU());
        colorScheme.m1132setOnSecondary8_81llA$material3_release(colorScheme2.m1103getOnSecondary0d7_KjU());
        colorScheme.m1144setSecondaryContainer8_81llA$material3_release(colorScheme2.m1115getSecondaryContainer0d7_KjU());
        colorScheme.m1133setOnSecondaryContainer8_81llA$material3_release(colorScheme2.m1104getOnSecondaryContainer0d7_KjU());
        colorScheme.m1148setTertiary8_81llA$material3_release(colorScheme2.m1119getTertiary0d7_KjU());
        colorScheme.m1136setOnTertiary8_81llA$material3_release(colorScheme2.m1107getOnTertiary0d7_KjU());
        colorScheme.m1149setTertiaryContainer8_81llA$material3_release(colorScheme2.m1120getTertiaryContainer0d7_KjU());
        colorScheme.m1137setOnTertiaryContainer8_81llA$material3_release(colorScheme2.m1108getOnTertiaryContainer0d7_KjU());
        colorScheme.m1121setBackground8_81llA$material3_release(colorScheme2.m1092getBackground0d7_KjU());
        colorScheme.m1127setOnBackground8_81llA$material3_release(colorScheme2.m1098getOnBackground0d7_KjU());
        colorScheme.m1145setSurface8_81llA$material3_release(colorScheme2.m1116getSurface0d7_KjU());
        colorScheme.m1134setOnSurface8_81llA$material3_release(colorScheme2.m1105getOnSurface0d7_KjU());
        colorScheme.m1147setSurfaceVariant8_81llA$material3_release(colorScheme2.m1118getSurfaceVariant0d7_KjU());
        colorScheme.m1135setOnSurfaceVariant8_81llA$material3_release(colorScheme2.m1106getOnSurfaceVariant0d7_KjU());
        colorScheme.m1146setSurfaceTint8_81llA$material3_release(colorScheme2.m1117getSurfaceTint0d7_KjU());
        colorScheme.m1126setInverseSurface8_81llA$material3_release(colorScheme2.m1097getInverseSurface0d7_KjU());
        colorScheme.m1124setInverseOnSurface8_81llA$material3_release(colorScheme2.m1095getInverseOnSurface0d7_KjU());
        colorScheme.m1122setError8_81llA$material3_release(colorScheme2.m1093getError0d7_KjU());
        colorScheme.m1128setOnError8_81llA$material3_release(colorScheme2.m1099getOnError0d7_KjU());
        colorScheme.m1123setErrorContainer8_81llA$material3_release(colorScheme2.m1094getErrorContainer0d7_KjU());
        colorScheme.m1129setOnErrorContainer8_81llA$material3_release(colorScheme2.m1100getOnErrorContainer0d7_KjU());
        colorScheme.m1138setOutline8_81llA$material3_release(colorScheme2.m1109getOutline0d7_KjU());
        colorScheme.m1139setOutlineVariant8_81llA$material3_release(colorScheme2.m1110getOutlineVariant0d7_KjU());
        colorScheme.m1142setScrim8_81llA$material3_release(colorScheme2.m1113getScrim0d7_KjU());
    }
}
