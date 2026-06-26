package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    private static final float D = 0.20689656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(String str, int i2) {
        super(str, ColorModel.INSTANCE.m3201getLabxdoWZVw(), i2, null);
        kotlin.jvm.internal.m.h(str, HintConstants.AUTOFILL_HINT_NAME);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        kotlin.jvm.internal.m.h(v, "v");
        float f = v[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f2 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f3 = v[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f4 = v[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f2 > A ? (float) Math.pow(f2, 0.33333334f) : (f2 * B) + C;
        float fPow2 = f3 > A ? (float) Math.pow(f3, 0.33333334f) : (f3 * B) + C;
        float fPow3 = f4 > A ? (float) Math.pow(f4, 0.33333334f) : (f4 * B) + C;
        v[0] = a.l.h((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v[1] = a.l.h((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v[2] = a.l.h((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float fH = (a.l.h(v0, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fH2 = (a.l.h(v0, -128.0f, 128.0f) * 0.002f) + fH;
        float f = fH2 > D ? fH2 * fH2 * fH2 : (fH2 - C) * 0.12841855f;
        float f2 = fH > D ? fH * fH * fH : (fH - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (((long) Float.floatToIntBits(f * illuminant.getD50Xyz$ui_graphics_release()[0])) << 32) | (((long) Float.floatToIntBits(f2 * illuminant.getD50Xyz$ui_graphics_release()[1])) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        kotlin.jvm.internal.m.h(v, "v");
        v[0] = a.l.h(v[0], 0.0f, 100.0f);
        v[1] = a.l.h(v[1], -128.0f, 128.0f);
        float fH = a.l.h(v[2], -128.0f, 128.0f);
        v[2] = fH;
        float f = (v[0] + 16.0f) / 116.0f;
        float f2 = (v[1] * 0.002f) + f;
        float f3 = f - (fH * 0.005f);
        float f4 = f2 > D ? f2 * f2 * f2 : (f2 - C) * 0.12841855f;
        float f5 = f > D ? f * f * f : (f - C) * 0.12841855f;
        float f6 = f3 > D ? f3 * f3 * f3 : (f3 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v[0] = f4 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v[1] = f5 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v[2] = f6 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        float fH = ((a.l.h(v0, 0.0f, 100.0f) + 16.0f) / 116.0f) - (a.l.h(v2, -128.0f, 128.0f) * 0.005f);
        return (fH > D ? fH * fH * fH : 0.12841855f * (fH - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo3205xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a2, ColorSpace colorSpace) {
        kotlin.jvm.internal.m.h(colorSpace, "colorSpace");
        Illuminant illuminant = Illuminant.INSTANCE;
        float f = x / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f2 = y / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f3 = z / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f > A ? (float) Math.pow(f, 0.33333334f) : (f * B) + C;
        float fPow2 = f2 > A ? (float) Math.pow(f2, 0.33333334f) : (f2 * B) + C;
        return ColorKt.Color(a.l.h((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), a.l.h((fPow - fPow2) * 500.0f, -128.0f, 128.0f), a.l.h((fPow2 - (f3 > A ? (float) Math.pow(f3, 0.33333334f) : (f3 * B) + C)) * 200.0f, -128.0f, 128.0f), a2, colorSpace);
    }
}
