package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: CarRepair.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_carRepair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRepair", "Landroidx/compose/material/icons/Icons$Filled;", "getCarRepair", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CarRepairKt {
    private static ImageVector _carRepair;

    public static final ImageVector getCarRepair(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _carRepair;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarRepair", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.22f, 12.0f);
        pathBuilderD.curveToRelative(0.68f, 0.0f, 1.22f, -0.54f, 1.22f, -1.22f);
        pathBuilderD.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        pathBuilderD.reflectiveCurveTo(15.0f, 10.11f, 15.0f, 10.78f);
        pathBuilderD.curveTo(15.0f, 11.46f, 15.55f, 12.0f, 16.22f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.56f, 10.78f);
        pathBuilderD.curveToRelative(0.0f, 0.67f, 0.54f, 1.22f, 1.22f, 1.22f);
        pathBuilderD.reflectiveCurveTo(9.0f, 11.46f, 9.0f, 10.78f);
        pathBuilderD.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        pathBuilderD.reflectiveCurveTo(6.56f, 10.11f, 6.56f, 10.78f);
        androidx.compose.animation.a.t(pathBuilderD, 7.61f, 4.0f, 6.28f, 8.0f);
        b.A(pathBuilderD, 11.43f, -1.33f, -4.0f, 7.61f);
        pathBuilderD.moveTo(16.28f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.54f);
        pathBuilderD.curveToRelative(0.02f, 0.02f, 0.03f, 0.04f, 0.05f, 0.07f);
        pathBuilderD.curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f);
        pathBuilderD.curveTo(17.66f, 4.66f, 19.0f, 8.69f, 19.0f, 8.69f);
        pathBuilderD.verticalLineToRelative(6.5f);
        pathBuilderD.curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f);
        pathBuilderD.horizontalLineToRelative(-0.44f);
        pathBuilderD.curveTo(17.35f, 16.0f, 17.0f, 15.64f, 17.0f, 15.19f);
        androidx.appcompat.graphics.drawable.a.o(pathBuilderD, 14.0f, 7.0f, 1.19f);
        pathBuilderD.curveTo(7.0f, 15.64f, 6.65f, 16.0f, 6.22f, 16.0f);
        pathBuilderD.horizontalLineTo(5.78f);
        pathBuilderD.curveTo(5.35f, 16.0f, 5.0f, 15.64f, 5.0f, 15.19f);
        pathBuilderD.verticalLineToRelative(-6.5f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 1.34f, -4.02f, 1.55f, -4.69f);
        pathBuilderD.curveToRelative(0.05f, -0.16f, 0.12f, -0.28f, 0.19f, -0.4f);
        pathBuilderD.curveTo(6.77f, 3.58f, 6.78f, 3.56f, 6.8f, 3.54f);
        pathBuilderD.curveTo(7.18f, 3.01f, 7.72f, 3.0f, 7.72f, 3.0f);
        h.v(pathBuilderD, 16.28f, 4.0f, 17.01f, 16.0f);
        s.y(pathBuilderD, 19.0f, -7.0f, 3.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.d(pathBuilderD, -3.0f, 4.0f, 17.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRepair = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
