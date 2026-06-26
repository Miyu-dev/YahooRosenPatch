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

/* JADX INFO: compiled from: Unsubscribe.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_unsubscribe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Unsubscribe", "Landroidx/compose/material/icons/Icons$Rounded;", "getUnsubscribe", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UnsubscribeKt {
    private static ImageVector _unsubscribe;

    public static final ImageVector getUnsubscribe(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _unsubscribe;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Unsubscribe", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.5f, 11.5f);
        pathBuilderD.curveToRelative(0.92f, 0.0f, 1.75f, 0.26f, 2.49f, 0.69f);
        pathBuilderD.lineTo(20.99f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        pathBuilderD.lineTo(5.0f, 3.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(8.55f);
        pathBuilderD.curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f);
        pathBuilderD.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.89f, 10.05f);
        pathBuilderD.curveToRelative(-0.56f, 0.28f, -1.23f, 0.28f, -1.79f, 0.0f);
        pathBuilderD.lineToRelative(-5.61f, -2.8f);
        pathBuilderD.curveToRelative(-0.3f, -0.15f, -0.49f, -0.46f, -0.49f, -0.8f);
        pathBuilderD.curveToRelative(0.0f, -0.66f, 0.7f, -1.1f, 1.29f, -0.8f);
        pathBuilderD.lineTo(12.0f, 8.5f);
        pathBuilderD.lineToRelative(5.71f, -2.85f);
        pathBuilderD.curveToRelative(0.59f, -0.3f, 1.29f, 0.13f, 1.29f, 0.8f);
        pathBuilderD.curveToRelative(0.0f, 0.34f, -0.19f, 0.65f, -0.49f, 0.8f);
        android.support.v4.media.a.t(pathBuilderD, -5.62f, 2.8f, 18.5f, 13.0f);
        pathBuilderD.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilderD.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.5f, 16.5f);
        pathBuilderD.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderD.horizontalLineToRelative(-3.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unsubscribe = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
