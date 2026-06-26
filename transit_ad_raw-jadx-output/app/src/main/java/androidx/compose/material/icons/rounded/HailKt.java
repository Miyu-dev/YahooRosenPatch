package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Hail.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hail", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hail", "Landroidx/compose/material/icons/Icons$Rounded;", "getHail", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HailKt {
    private static ImageVector _hail;

    public static final ImageVector getHail(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hail;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hail", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f);
        androidx.compose.animation.a.t(pathBuilderD, 17.95f, 2.0f, 17.95f, 2.0f);
        pathBuilderD.curveToRelative(0.59f, 0.0f, 1.06f, 0.51f, 1.0f, 1.09f);
        pathBuilderD.curveTo(18.93f, 3.24f, 18.74f, 7.15f, 15.0f, 8.4f);
        pathBuilderD.verticalLineTo(21.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -5.0f, -2.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineTo(10.1f);
        pathBuilderD.curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f);
        pathBuilderD.curveToRelative(-0.46f, 0.36f, -1.17f, 0.87f, -1.36f, 2.67f);
        pathBuilderD.curveTo(6.99f, 13.59f, 6.57f, 14.0f, 6.04f, 14.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.58f, 0.0f, -1.05f, -0.49f, -1.0f, -1.07f);
        pathBuilderD.curveToRelative(0.13f, -1.6f, 0.62f, -2.98f, 2.07f, -4.22f);
        pathBuilderD.curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f);
        pathBuilderD.curveToRelative(0.43f, -0.34f, 1.28f, -0.99f, 1.48f, -3.02f);
        pathBuilderD.curveTo(17.01f, 2.4f, 17.43f, 2.0f, 17.95f, 2.0f);
        androidx.compose.animation.a.j(pathBuilderD, 5.0f, 16.0f, 1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineTo(5.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-4.0f);
        pathBuilderD.curveTo(4.0f, 16.45f, 4.45f, 16.0f, 5.0f, 16.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hail = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
