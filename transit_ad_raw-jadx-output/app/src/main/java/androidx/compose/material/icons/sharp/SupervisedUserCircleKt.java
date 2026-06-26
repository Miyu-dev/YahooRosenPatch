package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: SupervisedUserCircle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_supervisedUserCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SupervisedUserCircle", "Landroidx/compose/material/icons/Icons$Sharp;", "getSupervisedUserCircle", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SupervisedUserCircleKt {
    private static ImageVector _supervisedUserCircle;

    public static final ImageVector getSupervisedUserCircle(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _supervisedUserCircle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SupervisedUserCircle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.61f, 8.34f);
        pathBuilderD.curveToRelative(1.07f, 0.0f, 1.93f, 0.86f, 1.93f, 1.93f);
        pathBuilderD.reflectiveCurveToRelative(-0.86f, 1.93f, -1.93f, 1.93f);
        pathBuilderD.reflectiveCurveToRelative(-1.93f, -0.86f, -1.93f, -1.93f);
        pathBuilderD.curveToRelative(-0.01f, -1.07f, 0.86f, -1.93f, 1.93f, -1.93f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.61f, 6.76f);
        pathBuilderD.curveToRelative(1.3f, 0.0f, 2.36f, 1.06f, 2.36f, 2.36f);
        pathBuilderD.reflectiveCurveToRelative(-1.06f, 2.36f, -2.36f, 2.36f);
        pathBuilderD.reflectiveCurveToRelative(-2.36f, -1.06f, -2.36f, -2.36f);
        pathBuilderD.curveToRelative(0.0f, -1.31f, 1.05f, -2.36f, 2.36f, -2.36f);
        androidx.compose.animation.a.n(pathBuilderD, 9.61f, 15.89f, 3.75f);
        pathBuilderD.curveToRelative(-2.4f, -0.75f, -4.3f, -2.6f, -5.14f, -4.96f);
        pathBuilderD.curveToRelative(1.05f, -1.12f, 3.67f, -1.69f, 5.14f, -1.69f);
        pathBuilderD.curveToRelative(0.53f, 0.0f, 1.2f, 0.08f, 1.9f, 0.22f);
        pathBuilderD.curveToRelative(-1.64f, 0.87f, -1.9f, 2.02f, -1.9f, 2.68f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-0.27f, 0.0f, -0.53f, -0.01f, -0.79f, -0.04f);
        pathBuilderD.verticalLineToRelative(-4.07f);
        pathBuilderD.curveToRelative(0.0f, -1.42f, 2.94f, -2.13f, 4.4f, -2.13f);
        pathBuilderD.curveToRelative(1.07f, 0.0f, 2.92f, 0.39f, 3.84f, 1.15f);
        pathBuilderD.curveTo(18.28f, 17.88f, 15.39f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisedUserCircle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
