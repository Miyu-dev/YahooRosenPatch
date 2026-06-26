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

/* JADX INFO: compiled from: Rowing.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rowing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rowing", "Landroidx/compose/material/icons/Icons$Rounded;", "getRowing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RowingKt {
    private static ImageVector _rowing;

    public static final ImageVector getRowing(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rowing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rowing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.75f, 18.25f);
        pathBuilderD.curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f);
        pathBuilderD.curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0.0f);
        pathBuilderD.lineTo(9.0f, 17.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        android.support.v4.media.a.n(pathBuilderD, -2.5f, -2.5f, -3.75f, 3.75f);
        pathBuilderD.moveTo(15.0f, 5.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        a.y(pathBuilderD, 20.29f, 20.3f, -2.0f, -2.01f);
        pathBuilderD.curveToRelative(-0.18f, -0.18f, -0.44f, -0.29f, -0.71f, -0.29f);
        pathBuilderD.lineTo(16.5f, 18.0f);
        pathBuilderD.lineToRelative(-6.29f, -6.29f);
        pathBuilderD.curveToRelative(0.79f, -0.33f, 1.66f, -0.87f, 2.29f, -1.39f);
        pathBuilderD.verticalLineToRelative(2.27f);
        pathBuilderD.lineToRelative(3.58f, 3.58f);
        pathBuilderD.curveToRelative(0.57f, -0.55f, 0.92f, -1.32f, 0.92f, -2.16f);
        pathBuilderD.lineTo(17.0f, 8.26f);
        pathBuilderD.curveTo(17.0f, 7.02f, 15.98f, 6.0f, 14.74f, 6.0f);
        pathBuilderD.horizontalLineToRelative(-0.02f);
        pathBuilderD.curveToRelative(-0.34f, 0.0f, -0.67f, 0.09f, -0.96f, 0.23f);
        pathBuilderD.curveToRelative(-0.26f, 0.12f, -0.5f, 0.29f, -0.69f, 0.5f);
        pathBuilderD.lineToRelative(-1.4f, 1.55f);
        pathBuilderD.curveTo(10.61f, 9.45f, 8.66f, 10.35f, 7.0f, 10.32f);
        pathBuilderD.curveToRelative(-0.6f, 0.0f, -1.08f, 0.48f, -1.08f, 1.08f);
        pathBuilderD.curveToRelative(0.0f, 0.6f, 0.48f, 1.08f, 1.08f, 1.08f);
        pathBuilderD.curveToRelative(0.31f, 0.0f, 0.61f, -0.03f, 0.9f, -0.07f);
        pathBuilderD.lineToRelative(7.11f, 7.09f);
        pathBuilderD.verticalLineToRelative(1.08f);
        pathBuilderD.curveToRelative(0.0f, 0.26f, 0.1f, 0.52f, 0.29f, 0.7f);
        pathBuilderD.lineToRelative(1.99f, 2.01f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilderD.lineToRelative(1.58f, -1.58f);
        pathBuilderD.curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rowing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
