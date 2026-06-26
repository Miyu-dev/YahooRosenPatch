package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: ElectricCar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricCar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricCar", "Landroidx/compose/material/icons/Icons$Rounded;", "getElectricCar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricCarKt {
    private static ImageVector _electricCar;

    public static final ImageVector getElectricCar(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _electricCar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ElectricCar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.92f, 2.01f);
        pathBuilderD.curveTo(18.72f, 1.42f, 18.16f, 1.0f, 17.5f, 1.0f);
        pathBuilderD.horizontalLineToRelative(-11.0f);
        pathBuilderD.curveTo(5.84f, 1.0f, 5.29f, 1.42f, 5.08f, 2.01f);
        pathBuilderD.lineTo(3.11f, 7.68f);
        pathBuilderD.curveTo(3.04f, 7.89f, 3.0f, 8.11f, 3.0f, 8.34f);
        pathBuilderD.verticalLineToRelative(7.16f);
        pathBuilderD.curveTo(3.0f, 16.33f, 3.67f, 17.0f, 4.5f, 17.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(5.33f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        v.r(pathBuilderD, 15.0f, 12.0f, 0.5f);
        pathBuilderD.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.verticalLineTo(8.34f);
        pathBuilderD.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 18.92f, 2.01f, 6.5f, 12.0f);
        pathBuilderD.curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f);
        pathBuilderD.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        pathBuilderD.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        pathBuilderD.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.5f, 12.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilderD.reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f);
        pathBuilderD.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        a.y(pathBuilderD, 5.0f, 7.0f, 1.27f, -3.82f);
        pathBuilderD.curveTo(6.41f, 2.78f, 6.79f, 2.5f, 7.22f, 2.5f);
        pathBuilderD.horizontalLineToRelative(9.56f);
        pathBuilderD.curveToRelative(0.43f, 0.0f, 0.81f, 0.28f, 0.95f, 0.68f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderD, 19.0f, 7.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.0f, 20.0f, 4.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(6.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, -4.0f, 0.0f, 0.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricCar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
