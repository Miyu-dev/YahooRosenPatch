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

/* JADX INFO: compiled from: RailwayAlert.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_railwayAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RailwayAlert", "Landroidx/compose/material/icons/Icons$Filled;", "getRailwayAlert", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RailwayAlertKt {
    private static ImageVector _railwayAlert;

    public static final ImageVector getRailwayAlert(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _railwayAlert;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RailwayAlert", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(23.0f, 8.0f);
        pathBuilderD.arcToRelative(7.0f, 7.0f, 0.0f, false, false, -11.95f, -4.95f);
        pathBuilderD.arcTo(33.8f, 33.8f, 0.0f, false, false, 9.0f, 3.0f);
        pathBuilderD.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(10.5f);
        pathBuilderD.arcTo(3.5f, 3.5f, 0.0f, false, false, 4.5f, 21.0f);
        b.s(pathBuilderD, 3.0f, 22.5f, 0.5f, 12.0f);
        pathBuilderD.verticalLineToRelative(-0.5f);
        pathBuilderD.lineTo(13.5f, 21.0f);
        pathBuilderD.arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f);
        pathBuilderD.verticalLineToRelative(-2.58f);
        pathBuilderD.arcTo(7.0f, 7.0f, 0.0f, false, false, 23.0f, 8.0f);
        androidx.compose.animation.a.t(pathBuilderD, 3.0f, 12.0f, 3.0f, 7.0f);
        pathBuilderD.horizontalLineToRelative(6.08f);
        pathBuilderD.arcToRelative(6.96f, 6.96f, 0.0f, false, false, 1.18f, 5.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 3.0f, 12.0f, 9.0f, 19.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        a.y(pathBuilderD, 16.71f, 12.94f, -0.2f, 0.03f);
        pathBuilderD.lineTo(16.0f, 13.0f);
        pathBuilderD.lineToRelative(-0.47f, -0.02f);
        pathBuilderD.lineToRelative(-0.16f, -0.02f);
        pathBuilderD.lineToRelative(-0.29f, -0.04f);
        pathBuilderD.lineToRelative(-0.2f, -0.04f);
        pathBuilderD.lineToRelative(-0.22f, -0.06f);
        pathBuilderD.arcToRelative(1.55f, 1.55f, 0.0f, false, true, -0.23f, -0.07f);
        pathBuilderD.lineToRelative(-0.13f, -0.05f);
        pathBuilderD.arcTo(4.99f, 4.99f, 0.0f, false, true, 11.1f, 7.0f);
        pathBuilderD.curveToRelative(0.04f, -0.19f, 0.09f, -0.37f, 0.15f, -0.54f);
        pathBuilderD.lineToRelative(0.05f, -0.14f);
        pathBuilderD.lineToRelative(0.15f, -0.38f);
        pathBuilderD.lineToRelative(0.07f, -0.15f);
        pathBuilderD.lineToRelative(0.2f, -0.36f);
        pathBuilderD.lineToRelative(0.07f, -0.12f);
        pathBuilderD.lineToRelative(0.3f, -0.42f);
        pathBuilderD.lineToRelative(0.02f, -0.02f);
        pathBuilderD.curveToRelative(0.24f, -0.3f, 0.52f, -0.57f, 0.82f, -0.81f);
        pathBuilderD.lineToRelative(0.01f, -0.01f);
        pathBuilderD.lineToRelative(0.46f, -0.32f);
        pathBuilderD.lineToRelative(0.03f, -0.02f);
        pathBuilderD.arcTo(5.25f, 5.25f, 0.0f, false, true, 16.0f, 3.0f);
        pathBuilderD.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.71f, 9.94f);
        androidx.compose.animation.b.r(pathBuilderD, 15.0f, 4.0f, 2.0f, 5.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderD, -2.0f, 15.0f, 10.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderD, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _railwayAlert = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
