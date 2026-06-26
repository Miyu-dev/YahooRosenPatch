package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: RollerSkating.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rollerSkating", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RollerSkating", "Landroidx/compose/material/icons/Icons$Outlined;", "getRollerSkating", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RollerSkatingKt {
    private static ImageVector _rollerSkating;

    public static final ImageVector getRollerSkating(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _rollerSkating;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RollerSkating", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.79f, -1.19f, -3.34f, -2.91f, -3.82f);
        pathBuilderD.lineToRelative(-2.62f, -0.74f);
        pathBuilderD.curveTo(13.62f, 7.19f, 13.0f, 6.39f, 13.0f, 5.5f);
        b.x(pathBuilderD, 1.0f, 4.0f, 15.0f, 16.0f);
        androidx.compose.animation.a.y(pathBuilderD, 12.0f, 18.0f, 14.0f, 6.0f);
        v.C(pathBuilderD, 3.0f, 5.0f, 1.0f, 9.5f);
        pathBuilderD.curveTo(9.22f, 4.0f, 9.0f, 4.22f, 9.0f, 4.5f);
        pathBuilderD.curveTo(9.0f, 4.78f, 9.22f, 5.0f, 9.5f, 5.0f);
        s.C(pathBuilderD, 11.0f, 0.1f, 1.0f, 9.5f);
        pathBuilderD.curveTo(9.22f, 6.0f, 9.0f, 6.22f, 9.0f, 6.5f);
        pathBuilderD.curveTo(9.0f, 6.78f, 9.22f, 7.0f, 9.5f, 7.0f);
        pathBuilderD.horizontalLineToRelative(1.81f);
        pathBuilderD.curveToRelative(0.45f, 1.12f, 1.4f, 2.01f, 2.6f, 2.36f);
        pathBuilderD.lineToRelative(2.62f, 0.73f);
        pathBuilderD.curveTo(17.4f, 10.33f, 18.0f, 11.1f, 18.0f, 12.0f);
        android.support.v4.media.a.y(pathBuilderD, 14.0f, 5.0f, 17.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(6.66f, 17.0f, 5.0f, 17.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.0f, 21.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveTo(6.0f, 20.55f, 5.55f, 21.0f, 5.0f, 21.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 17.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(20.66f, 17.0f, 19.0f, 17.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 21.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveTo(20.0f, 20.55f, 19.55f, 21.0f, 19.0f, 21.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 17.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(13.66f, 17.0f, 12.0f, 17.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 21.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveTo(13.0f, 20.55f, 12.55f, 21.0f, 12.0f, 21.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rollerSkating = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
