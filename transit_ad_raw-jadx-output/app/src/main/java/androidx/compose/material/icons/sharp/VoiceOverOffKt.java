package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VoiceOverOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_voiceOverOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VoiceOverOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getVoiceOverOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VoiceOverOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.76f, 5.36f, -1.68f, 1.69f);
        pathBuilderA.curveToRelative(0.8f, 1.13f, 0.83f, 2.58f, 0.09f, 3.74f);
        pathBuilderA.lineToRelative(1.7f, 1.7f);
        pathBuilderA.curveToRelative(1.9f, -2.02f, 1.87f, -4.98f, -0.11f, -7.13f);
        a.y(pathBuilderA, 20.07f, 2.0f, -1.63f, 1.63f);
        pathBuilderA.curveToRelative(2.72f, 2.97f, 2.76f, 7.39f, 0.14f, 10.56f);
        pathBuilderA.lineToRelative(1.64f, 1.64f);
        pathBuilderA.curveToRelative(3.74f, -3.89f, 3.71f, -9.84f, -0.15f, -13.83f);
        a.y(pathBuilderA, 9.43f, 5.04f, 3.53f, 3.53f);
        pathBuilderA.curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f);
        androidx.compose.animation.a.t(pathBuilderA, 4.41f, 2.86f, 3.0f, 4.27f);
        pathBuilderA.lineToRelative(2.62f, 2.62f);
        pathBuilderA.curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f);
        pathBuilderA.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderA.curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f);
        pathBuilderA.lineToRelative(4.4f, 4.4f);
        pathBuilderA.curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f);
        pathBuilderA.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        android.support.v4.media.a.m(pathBuilderA, 2.0f, 16.0f, -2.0f);
        pathBuilderA.curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f);
        pathBuilderA.lineTo(19.73f, 21.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.41f, -1.41f, 4.41f, 2.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voiceOverOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
