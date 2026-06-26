package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Motorcycle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_motorcycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Motorcycle", "Landroidx/compose/material/icons/Icons$Filled;", "getMotorcycle", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Motorcycle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.5f, 10.0f);
        pathBuilderD.curveToRelative(-0.03f, 0.0f, -0.05f, 0.01f, -0.08f, 0.01f);
        pathBuilderD.lineTo(13.41f, 6.0f);
        b.s(pathBuilderD, 9.0f, 6.0f, 2.0f, 3.59f);
        pathBuilderD.lineToRelative(2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(-8.1f);
        pathBuilderD.curveTo(4.01f, 10.0f, 2.0f, 12.02f, 2.0f, 14.5f);
        pathBuilderD.curveTo(2.0f, 16.99f, 4.01f, 19.0f, 6.5f, 19.0f);
        pathBuilderD.curveToRelative(2.22f, 0.0f, 4.06f, -1.62f, 4.42f, -3.73f);
        pathBuilderD.lineTo(13.04f, 14.0f);
        pathBuilderD.curveToRelative(-0.02f, 0.17f, -0.04f, 0.33f, -0.04f, 0.5f);
        pathBuilderD.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.5f, 4.5f);
        pathBuilderD.reflectiveCurveToRelative(4.5f, -2.01f, 4.5f, -4.5f);
        pathBuilderD.reflectiveCurveToRelative(-2.01f, -4.5f, -4.5f, -4.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.84f, 15.26f);
        pathBuilderD.curveTo(8.52f, 16.27f, 7.58f, 17.0f, 6.47f, 17.0f);
        pathBuilderD.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderD.reflectiveCurveTo(5.09f, 12.0f, 6.47f, 12.0f);
        pathBuilderD.curveToRelative(1.12f, 0.0f, 2.05f, 0.74f, 2.37f, 1.75f);
        pathBuilderD.lineTo(6.0f, 13.75f);
        v.v(pathBuilderD, 1.5f, 2.84f, 0.01f);
        pathBuilderD.moveTo(17.47f, 17.0f);
        pathBuilderD.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderD.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderD.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -1.12f, 2.5f, -2.5f, 2.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
