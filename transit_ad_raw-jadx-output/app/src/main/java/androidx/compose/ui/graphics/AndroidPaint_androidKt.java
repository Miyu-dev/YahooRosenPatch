package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\b\u0010\u0004\u001a\u00020\u0002H\u0000\u001a%\u0010\u000b\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000e\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u000f*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u0012*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u0012H\u0000\u001a\u001a\u0010\u0016\u001a\u00020\u0015*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001a\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001d\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u001bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\n\u001a\u001a\u0010\u001e\u001a\u00020\u001b*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0010\u0010 \u001a\u00020\u000f*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010!\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0000\u001a\u001a\u0010#\u001a\u00020\"*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u001f\u001a%\u0010%\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\n\u001a\u001a\u0010'\u001a\u00020&*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001f\u001a%\u0010)\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020&H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\n\u001a\u0010\u0010*\u001a\u00020\u000f*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010+\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0000\u001a\u001a\u0010-\u001a\u00020,*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u001f\u001a%\u0010/\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020,H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010\n\u001a \u00102\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u000e\u0010\r\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0000\u001a\u001a\u00104\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\r\u001a\u0004\u0018\u000103H\u0000*\n\u00105\"\u00020\u00022\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "Landroid/graphics/Paint;", "toComposePaint", "makeNativePaint", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "Lkotlin/j;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "setNativeColorFilter", "", "getNativeAlpha", "setNativeAlpha", "", "getNativeAntiAlias", "setNativeAntiAlias", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStyle", "(Landroid/graphics/Paint;)I", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidPaint_androidKt {

    /* JADX INFO: compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m2915getNonefv9h1I() : FilterQuality.INSTANCE.m2913getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i2 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StrokeCap.INSTANCE.m3141getButtKaPHkGw() : StrokeCap.INSTANCE.m3143getSquareKaPHkGw() : StrokeCap.INSTANCE.m3142getRoundKaPHkGw() : StrokeCap.INSTANCE.m3141getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StrokeJoin.INSTANCE.m3152getMiterLxFBmk8() : StrokeJoin.INSTANCE.m3153getRoundLxFBmk8() : StrokeJoin.INSTANCE.m3151getBevelLxFBmk8() : StrokeJoin.INSTANCE.m3152getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m3060getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m3059getFillTiuSbCo();
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f) {
        m.h(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint, boolean z) {
        m.h(paint, "<this>");
        paint.setAntiAlias(z);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m2711setNativeBlendModeGB0RdKg(android.graphics.Paint paint, int i2) {
        m.h(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m3191setBlendModeGB0RdKg(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m2678toPorterDuffModes9anfk8(i2)));
        }
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m2712setNativeColor4WTKRHQ(android.graphics.Paint paint, long j) {
        m.h(paint, "$this$setNativeColor");
        paint.setColor(ColorKt.m2872toArgb8_81llA(j));
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, ColorFilter colorFilter) {
        m.h(paint, "<this>");
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m2713setNativeFilterQuality50PEsBU(android.graphics.Paint paint, int i2) {
        m.h(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!FilterQuality.m2908equalsimpl0(i2, FilterQuality.INSTANCE.m2915getNonefv9h1I()));
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, PathEffect pathEffect) {
        m.h(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(android.graphics.Paint paint, Shader shader) {
        m.h(paint, "<this>");
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m2714setNativeStrokeCapCSYIeUk(android.graphics.Paint paint, int i2) {
        m.h(paint, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        paint.setStrokeCap(StrokeCap.m3137equalsimpl0(i2, companion.m3143getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m3137equalsimpl0(i2, companion.m3142getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m3137equalsimpl0(i2, companion.m3141getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m2715setNativeStrokeJoinkLtJ_vA(android.graphics.Paint paint, int i2) {
        m.h(paint, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        paint.setStrokeJoin(StrokeJoin.m3147equalsimpl0(i2, companion.m3152getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m3147equalsimpl0(i2, companion.m3151getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m3147equalsimpl0(i2, companion.m3153getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f) {
        m.h(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f) {
        m.h(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m2716setNativeStyle5YerkU(android.graphics.Paint paint, int i2) {
        m.h(paint, "$this$setNativeStyle");
        paint.setStyle(PaintingStyle.m3055equalsimpl0(i2, PaintingStyle.INSTANCE.m3060getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final Paint toComposePaint(android.graphics.Paint paint) {
        m.h(paint, "<this>");
        return new AndroidPaint(paint);
    }
}
