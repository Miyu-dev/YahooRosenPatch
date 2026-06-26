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

/* JADX INFO: compiled from: NotListedLocation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notListedLocation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NotListedLocation", "Landroidx/compose/material/icons/Icons$Sharp;", "getNotListedLocation", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NotListedLocationKt {
    private static ImageVector _notListedLocation;

    public static final ImageVector getNotListedLocation(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _notListedLocation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NotListedLocation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.01f, 16.0f);
        pathBuilderD.arcToRelative(0.99f, 0.99f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilderD.arcToRelative(0.99f, 0.99f, 0.0f, false, false, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilderD.curveToRelative(-0.2f, 0.19f, -0.3f, 0.43f, -0.3f, 0.7f);
        pathBuilderD.reflectiveCurveToRelative(0.1f, 0.51f, 0.29f, 0.71f);
        pathBuilderD.curveToRelative(0.2f, 0.2f, 0.44f, 0.3f, 0.72f, 0.3f);
        androidx.compose.animation.a.t(pathBuilderD, 11.13f, 12.34f, 11.13f, 13.0f);
        pathBuilderD.horizontalLineToRelative(1.85f);
        pathBuilderD.verticalLineToRelative(-0.42f);
        pathBuilderD.curveToRelative(0.0f, -0.33f, 0.06f, -0.6f, 0.18f, -0.81f);
        pathBuilderD.curveToRelative(0.12f, -0.21f, 0.33f, -0.47f, 0.65f, -0.77f);
        pathBuilderD.curveToRelative(0.4f, -0.38f, 0.68f, -0.75f, 0.89f, -1.09f);
        pathBuilderD.curveToRelative(0.19f, -0.35f, 0.3f, -0.76f, 0.3f, -1.25f);
        pathBuilderD.reflectiveCurveToRelative(-0.13f, -0.94f, -0.39f, -1.35f);
        pathBuilderD.arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.05f, -0.96f);
        pathBuilderD.curveTo(13.11f, 6.12f, 12.58f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.curveToRelative(-0.78f, 0.0f, -1.51f, 0.32f, -2.03f, 0.79f);
        pathBuilderD.curveTo(9.46f, 7.27f, 9.0f, 7.99f, 9.0f, 9.0f);
        pathBuilderD.horizontalLineToRelative(1.68f);
        pathBuilderD.curveToRelative(0.0f, -0.52f, 0.19f, -0.77f, 0.4f, -0.98f);
        pathBuilderD.curveToRelative(0.21f, -0.2f, 0.58f, -0.3f, 0.96f, -0.3f);
        pathBuilderD.curveToRelative(0.35f, 0.0f, 0.64f, 0.1f, 0.85f, 0.3f);
        pathBuilderD.curveToRelative(0.21f, 0.2f, 0.32f, 0.45f, 0.32f, 0.74f);
        pathBuilderD.curveToRelative(0.0f, 0.24f, -0.06f, 0.46f, -0.19f, 0.64f);
        pathBuilderD.curveToRelative(-0.13f, 0.19f, -0.33f, 0.41f, -0.61f, 0.66f);
        pathBuilderD.curveToRelative(-0.48f, 0.42f, -0.81f, 0.79f, -1.0f, 1.12f);
        pathBuilderD.curveToRelative(-0.19f, 0.33f, -0.28f, 0.71f, -0.28f, 1.16f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 2.0f);
        pathBuilderD.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        pathBuilderD.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilderD.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilderD.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notListedLocation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
