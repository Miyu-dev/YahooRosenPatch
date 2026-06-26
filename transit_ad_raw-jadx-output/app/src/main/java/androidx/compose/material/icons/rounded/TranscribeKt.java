package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Transcribe.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_transcribe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Transcribe", "Landroidx/compose/material/icons/Icons$Rounded;", "getTranscribe", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TranscribeKt {
    private static ImageVector _transcribe;

    public static final ImageVector getTranscribe(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _transcribe;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Transcribe", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.54f, 10.28f);
        pathBuilderD.curveToRelative(-0.34f, -0.82f, -0.34f, -1.72f, 0.0f, -2.54f);
        pathBuilderD.curveToRelative(0.19f, -0.45f, 0.1f, -0.96f, -0.24f, -1.3f);
        pathBuilderD.lineToRelative(-0.1f, -0.1f);
        pathBuilderD.curveToRelative(-0.56f, -0.56f, -1.51f, -0.44f, -1.88f, 0.26f);
        pathBuilderD.curveToRelative(-0.8f, 1.48f, -0.79f, 3.24f, 0.03f, 4.79f);
        pathBuilderD.curveToRelative(0.37f, 0.69f, 1.31f, 0.83f, 1.86f, 0.27f);
        pathBuilderD.lineToRelative(0.1f, -0.1f);
        pathBuilderD.curveTo(22.65f, 11.23f, 22.73f, 10.72f, 22.54f, 10.28f);
        androidx.compose.animation.a.t(pathBuilderD, 18.82f, 15.11f, 18.82f, 15.11f);
        pathBuilderD.curveToRelative(0.4f, -0.4f, 0.46f, -1.02f, 0.13f, -1.48f);
        pathBuilderD.curveToRelative(-1.97f, -2.73f, -1.96f, -6.39f, 0.01f, -9.23f);
        pathBuilderD.curveToRelative(0.32f, -0.47f, 0.26f, -1.1f, -0.14f, -1.5f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.5f, -0.5f, -1.34f, -0.46f, -1.78f, 0.1f);
        pathBuilderD.curveToRelative(-2.73f, 3.54f, -2.73f, 8.36f, 0.02f, 12.0f);
        pathBuilderD.curveTo(17.49f, 15.56f, 18.33f, 15.61f, 18.82f, 15.11f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.0f, 13.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderD.reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f);
        pathBuilderD.curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.39f, 15.56f);
        pathBuilderD.curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f);
        pathBuilderD.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilderD.curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f);
        pathBuilderD.lineTo(1.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.lineToRelative(0.0f, -1.78f);
        pathBuilderD.curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transcribe = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
