package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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
import c.d;
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FireTruck.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fireTruck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FireTruck", "Landroidx/compose/material/icons/Icons$Outlined;", "getFireTruck", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FireTruckKt {
    private static ImageVector _fireTruck;

    public static final ImageVector getFireTruck(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _fireTruck;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FireTruck", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.9f, 10.69f, -1.44f, -4.32f);
        pathBuilderA.curveTo(21.18f, 5.55f, 20.42f, 5.0f, 19.56f, 5.0f);
        pathBuilderA.horizontalLineTo(19.0f);
        pathBuilderA.verticalLineTo(4.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-1.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        v.z(pathBuilderA, 4.0f, 1.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(1.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderA.horizontalLineToRelative(3.0f);
        pathBuilderA.verticalLineToRelative(-6.68f);
        pathBuilderA.curveTo(23.0f, 11.11f, 22.97f, 10.9f, 22.9f, 10.69f);
        a.j(pathBuilderA, 14.0f, 7.0f, 5.56f);
        pathBuilderA.lineToRelative(1.33f, 4.0f);
        pathBuilderA.horizontalLineTo(14.0f);
        pathBuilderA.verticalLineTo(7.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.0f, 19.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveTo(7.55f, 19.0f, 7.0f, 19.0f);
        androidx.browser.browseractions.a.k(pathBuilderA, 12.0f, 16.0f, 9.22f);
        pathBuilderA.curveTo(8.67f, 15.39f, 7.89f, 15.0f, 7.0f, 15.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        v.B(pathBuilderA, 3.0f, -3.0f, 9.0f, 16.0f);
        pathBuilderA.moveTo(17.0f, 19.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveTo(17.55f, 19.0f, 17.0f, 19.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.22f, 16.0f);
        pathBuilderA.curveToRelative(-0.55f, -0.61f, -1.34f, -1.0f, -2.22f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        androidx.browser.browseractions.a.B(pathBuilderA, 14.0f, -3.0f, 7.0f, 3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderA, 19.22f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.browser.browseractions.a.f(11.0f, 8.5f, -1.0f, -2.0f, 1.0f);
        b.x(pathBuilderF, 5.0f, 1.0f, 1.5f, 1.0f);
        j.f(pathBuilderF, 2.0f, 1.0f, 10.0f, 10.0f);
        a.y(pathBuilderF, 8.5f, 8.5f, 8.5f, 6.75f);
        d.f(pathBuilderF, -2.0f, 8.5f, 8.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 3.5f, 6.5f, 1.75f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderF, 3.5f, 6.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireTruck = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
