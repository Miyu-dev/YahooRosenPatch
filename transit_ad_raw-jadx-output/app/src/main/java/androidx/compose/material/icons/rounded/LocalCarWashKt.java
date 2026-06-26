package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: LocalCarWash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localCarWash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalCarWash", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalCarWash", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalCarWashKt {
    private static ImageVector _localCarWash;

    public static final ImageVector getLocalCarWash(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _localCarWash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalCarWash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.0f, 5.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.curveToRelative(0.0f, -0.66f, -0.66f, -1.64f, -1.11f, -2.22f);
        pathBuilderD.curveToRelative(-0.2f, -0.26f, -0.59f, -0.26f, -0.79f, 0.0f);
        pathBuilderD.curveToRelative(-0.44f, 0.58f, -1.1f, 1.56f, -1.1f, 2.22f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 5.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.curveToRelative(0.0f, -0.66f, -0.66f, -1.64f, -1.11f, -2.22f);
        pathBuilderD.curveToRelative(-0.2f, -0.26f, -0.59f, -0.26f, -0.79f, 0.0f);
        pathBuilderD.curveToRelative(-0.44f, 0.58f, -1.1f, 1.56f, -1.1f, 2.22f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.0f, 5.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.curveToRelative(0.0f, -0.66f, -0.66f, -1.64f, -1.11f, -2.22f);
        pathBuilderD.curveToRelative(-0.2f, -0.26f, -0.59f, -0.26f, -0.79f, 0.0f);
        pathBuilderD.curveToRelative(-0.44f, 0.58f, -1.1f, 1.56f, -1.1f, 2.22f);
        pathBuilderD.curveTo(5.5f, 4.33f, 6.17f, 5.0f, 7.0f, 5.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.92f, 8.01f);
        pathBuilderD.curveTo(18.72f, 7.42f, 18.16f, 7.0f, 17.5f, 7.0f);
        pathBuilderD.horizontalLineToRelative(-11.0f);
        pathBuilderD.curveToRelative(-0.66f, 0.0f, -1.21f, 0.42f, -1.42f, 1.01f);
        pathBuilderD.lineToRelative(-1.97f, 5.67f);
        pathBuilderD.curveToRelative(-0.07f, 0.21f, -0.11f, 0.43f, -0.11f, 0.66f);
        pathBuilderD.verticalLineToRelative(7.16f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(6.0f, 22.33f, 6.0f, 21.5f);
        androidx.compose.animation.a.o(pathBuilderD, 6.0f, 21.0f, 12.0f, 0.5f);
        pathBuilderD.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.verticalLineToRelative(-7.16f);
        pathBuilderD.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        android.support.v4.media.a.t(pathBuilderD, -1.97f, -5.67f, 6.5f, 18.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(5.67f, 15.0f, 6.5f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(7.33f, 18.0f, 6.5f, 18.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.5f, 18.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        a.y(pathBuilderD, 5.0f, 13.0f, 1.27f, -3.82f);
        pathBuilderD.curveToRelative(0.14f, -0.4f, 0.52f, -0.68f, 0.95f, -0.68f);
        pathBuilderD.horizontalLineToRelative(9.56f);
        pathBuilderD.curveToRelative(0.43f, 0.0f, 0.81f, 0.28f, 0.95f, 0.68f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 19.0f, 13.0f, 5.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localCarWash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
