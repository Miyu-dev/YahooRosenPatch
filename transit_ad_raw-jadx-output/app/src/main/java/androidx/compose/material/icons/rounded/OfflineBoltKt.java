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

/* JADX INFO: compiled from: OfflineBolt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_offlineBolt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OfflineBolt", "Landroidx/compose/material/icons/Icons$Rounded;", "getOfflineBolt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OfflineBolt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.02f);
        pathBuilderD.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilderD.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilderD.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilderD.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        androidx.compose.animation.a.n(pathBuilderD, 11.48f, 17.88f, -4.14f);
        pathBuilderD.lineTo(8.82f, 13.74f);
        pathBuilderD.curveToRelative(-0.37f, 0.0f, -0.62f, -0.4f, -0.44f, -0.73f);
        pathBuilderD.lineToRelative(3.68f, -7.17f);
        pathBuilderD.curveToRelative(0.23f, -0.47f, 0.94f, -0.3f, 0.94f, 0.23f);
        pathBuilderD.verticalLineToRelative(4.19f);
        pathBuilderD.horizontalLineToRelative(2.54f);
        pathBuilderD.curveToRelative(0.37f, 0.0f, 0.61f, 0.39f, 0.45f, 0.72f);
        pathBuilderD.lineToRelative(-3.56f, 7.12f);
        pathBuilderD.curveToRelative(-0.24f, 0.48f, -0.95f, 0.31f, -0.95f, -0.22f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
