package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Kitesurfing.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_kitesurfing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kitesurfing", "Landroidx/compose/material/icons/Icons$Outlined;", "getKitesurfing", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KitesurfingKt {
    private static ImageVector _kitesurfing;

    public static final ImageVector getKitesurfing(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _kitesurfing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Kitesurfing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 4.1f, 6.0f, 3.0f);
        androidx.compose.animation.a.j(pathBuilderD, 20.06f, 1.0f, -2.12f);
        pathBuilderD.lineTo(15.5f, 3.44f);
        s.r(pathBuilderD, 1.06f, 1.06f, 20.06f, 1.0f);
        b.y(pathBuilderD, 22.0f, 23.0f, -2.0f, -1.0f);
        pathBuilderD.curveToRelative(-1.04f, 0.0f, -2.08f, -0.35f, -3.0f, -1.0f);
        pathBuilderD.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilderD.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.91f, 0.65f, -1.96f, 1.0f, -3.0f, 1.0f);
        s.u(pathBuilderD, 2.0f, 0.0f, 2.0f, 1.0f);
        pathBuilderD.curveToRelative(1.03f, 0.0f, 2.05f, -0.25f, 3.0f, -0.75f);
        pathBuilderD.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilderD.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        androidx.compose.animation.b.w(pathBuilderD, 22.0f, 21.0f, 13.28f);
        pathBuilderD.curveToRelative(0.0f, 1.44f, -2.19f, 3.62f, -5.04f, 5.58f);
        pathBuilderD.curveTo(15.65f, 18.95f, 15.33f, 19.0f, 15.0f, 19.0f);
        pathBuilderD.curveToRelative(-1.2f, 0.0f, -2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilderD.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilderD.curveToRelative(-0.94f, 0.0f, -1.81f, -0.41f, -2.49f, -0.99f);
        pathBuilderD.curveToRelative(0.46f, -0.39f, 0.96f, -0.78f, 1.49f, -1.17f);
        pathBuilderD.lineToRelative(-1.55f, -2.97f);
        pathBuilderD.curveTo(6.15f, 13.3f, 6.0f, 12.64f, 6.0f, 12.0f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.63f, -0.56f, 3.54f, -1.46f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        pathBuilderD.curveTo(14.68f, 7.21f, 12.93f, 8.0f, 11.0f, 8.0f);
        s.u(pathBuilderD, 9.6f, 0.0f, 3.5f, 2.8f);
        pathBuilderD.lineToRelative(1.69f, 1.88f);
        pathBuilderD.curveToRelative(1.95f, -0.84f, 3.77f, -1.38f, 5.06f, -1.38f);
        pathBuilderD.curveTo(19.99f, 12.0f, 21.0f, 12.25f, 21.0f, 13.28f);
        a.y(pathBuilderD, 12.2f, 14.27f, -0.7f, -0.77f);
        pathBuilderD.lineTo(9.0f, 13.6f);
        pathBuilderD.lineToRelative(0.83f, 2.01f);
        pathBuilderD.curveTo(10.42f, 15.23f, 11.64f, 14.55f, 12.2f, 14.27f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kitesurfing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
