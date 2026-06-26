package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: BedroomBaby.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bedroomBaby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BedroomBaby", "Landroidx/compose/material/icons/Icons$Outlined;", "getBedroomBaby", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedroomBaby", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.94f, 14.04f);
        pathBuilderD.curveToRelative(-0.34f, 0.34f, -0.71f, 0.64f, -1.1f, 0.92f);
        androidx.appcompat.app.m.r(pathBuilderD, 16.0f, 13.5f, 11.0f, 1.0f);
        a.x(pathBuilderD, -1.0f, -5.62f, 9.65f, 7.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.lineToRelative(1.0f, 0.76f);
        pathBuilderD.lineTo(5.5f, 9.5f);
        pathBuilderD.lineToRelative(0.95f, 1.0f);
        pathBuilderD.lineTo(8.0f, 9.51f);
        pathBuilderD.verticalLineToRelative(3.99f);
        pathBuilderD.lineToRelative(-0.84f, 1.46f);
        pathBuilderD.curveToRelative(-0.39f, -0.27f, -0.76f, -0.58f, -1.1f, -0.92f);
        pathBuilderD.lineTo(5.0f, 15.1f);
        pathBuilderD.curveToRelative(1.87f, 1.87f, 4.36f, 2.9f, 7.0f, 2.9f);
        pathBuilderD.reflectiveCurveToRelative(5.13f, -1.03f, 7.0f, -2.9f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 17.94f, 14.04f, 8.45f, 15.71f);
        pathBuilderD.lineToRelative(0.03f, -0.06f);
        pathBuilderD.lineToRelative(0.81f, -1.41f);
        pathBuilderD.curveToRelative(1.74f, 0.65f, 3.66f, 0.65f, 5.4f, 0.0f);
        pathBuilderD.lineToRelative(0.81f, 1.41f);
        pathBuilderD.lineToRelative(0.03f, 0.06f);
        pathBuilderD.curveToRelative(-1.1f, 0.51f, -2.3f, 0.79f, -3.55f, 0.79f);
        pathBuilderD.reflectiveCurveTo(9.55f, 16.23f, 8.45f, 15.71f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderD, 20.0f, 4.0f, 16.0f, 4.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.horizontalLineTo(20.0f);
        pathBuilderD.moveTo(20.0f, 2.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomBaby = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
