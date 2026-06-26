package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: RestartAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_restartAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RestartAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getRestartAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RestartAltKt {
    private static ImageVector _restartAlt;

    public static final ImageVector getRestartAlt(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _restartAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RestartAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(12.0f, 5.0f, 3.21f);
        pathBuilderN.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderN.lineTo(8.35f, 5.65f);
        pathBuilderN.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderN.lineToRelative(2.79f, 2.79f);
        pathBuilderN.curveTo(11.46f, 9.46f, 12.0f, 9.24f, 12.0f, 8.79f);
        pathBuilderN.verticalLineTo(7.0f);
        pathBuilderN.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilderN.curveToRelative(0.0f, 2.72f, -1.83f, 5.02f, -4.31f, 5.75f);
        pathBuilderN.curveTo(13.27f, 18.87f, 13.0f, 19.27f, 13.0f, 19.7f);
        pathBuilderN.verticalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.0f, 0.65f, 0.62f, 1.16f, 1.25f, 0.97f);
        pathBuilderN.curveTo(17.57f, 19.7f, 20.0f, 16.64f, 20.0f, 13.0f);
        pathBuilderN.curveTo(20.0f, 8.58f, 16.42f, 5.0f, 12.0f, 5.0f);
        pathBuilderN.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -1.34f, 0.44f, -2.58f, 1.19f, -3.59f);
        pathBuilderD.curveToRelative(0.3f, -0.4f, 0.26f, -0.95f, -0.09f, -1.31f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(6.68f, 7.68f, 5.96f, 7.72f, 5.6f, 8.2f);
        pathBuilderD.curveTo(4.6f, 9.54f, 4.0f, 11.2f, 4.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 3.64f, 2.43f, 6.7f, 5.75f, 7.67f);
        pathBuilderD.curveTo(10.38f, 20.86f, 11.0f, 20.35f, 11.0f, 19.7f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.43f, -0.27f, -0.83f, -0.69f, -0.95f);
        pathBuilderD.curveTo(7.83f, 18.02f, 6.0f, 15.72f, 6.0f, 13.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restartAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
