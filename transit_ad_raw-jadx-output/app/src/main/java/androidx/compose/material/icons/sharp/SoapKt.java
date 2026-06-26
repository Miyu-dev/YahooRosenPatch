package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Soap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_soap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Soap", "Landroidx/compose/material/icons/Icons$Sharp;", "getSoap", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SoapKt {
    private static ImageVector _soap;

    public static final ImageVector getSoap(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Soap", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.25f, 6.0f);
        pathBuilderD.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        pathBuilderD.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        pathBuilderD.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        pathBuilderD.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        pathBuilderD.moveTo(14.25f, 4.5f);
        pathBuilderD.curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f);
        pathBuilderD.reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f);
        pathBuilderD.reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f);
        pathBuilderD.reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 14.25f, 4.5f, 20.0f, 5.5f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderD.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        pathBuilderD.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        pathBuilderD.moveTo(20.0f, 4.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 20.0f, 4.0f, 18.0f, 2.5f);
        pathBuilderD.curveTo(18.0f, 3.33f, 17.33f, 4.0f, 16.5f, 4.0f);
        pathBuilderD.curveTo(15.67f, 4.0f, 15.0f, 3.33f, 15.0f, 2.5f);
        pathBuilderD.reflectiveCurveTo(15.67f, 1.0f, 16.5f, 1.0f);
        pathBuilderD.curveTo(17.33f, 1.0f, 18.0f, 1.67f, 18.0f, 2.5f);
        h.B(pathBuilderD, 1.0f, 12.68f, 23.0f, 18.0f);
        a.l(pathBuilderD, -2.5f, -7.0f, -1.0f, 9.0f);
        s.y(pathBuilderD, 17.0f, -9.0f, -1.0f, 10.0f);
        b.x(pathBuilderD, -2.5f, 12.0f, -1.0f, 8.0f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.horizontalLineTo(8.86f);
        pathBuilderD.lineToRelative(1.88f, -3.3f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 9.12f, 5.0f, 1.0f, 12.68f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
