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

/* JADX INFO: compiled from: NotificationsPaused.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notificationsPaused", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NotificationsPaused", "Landroidx/compose/material/icons/Icons$Rounded;", "getNotificationsPaused", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NotificationsPausedKt {
    private static ImageVector _notificationsPaused;

    public static final ImageVector getNotificationsPaused(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _notificationsPaused;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationsPaused", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 22.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        androidx.compose.animation.a.t(pathBuilderD, 19.29f, 17.29f, 18.0f, 16.0f);
        pathBuilderD.verticalLineToRelative(-5.0f);
        pathBuilderD.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilderD.lineTo(13.5f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderD.verticalLineToRelative(0.68f);
        pathBuilderD.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilderD.verticalLineToRelative(5.0f);
        pathBuilderD.lineToRelative(-1.29f, 1.29f);
        pathBuilderD.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilderD.horizontalLineToRelative(13.17f);
        pathBuilderD.curveToRelative(0.9f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        pathBuilderD.close();
        pathBuilderD.moveTo(14.5f, 9.33f);
        pathBuilderD.curveToRelative(0.0f, 0.31f, -0.11f, 0.6f, -0.3f, 0.84f);
        pathBuilderD.lineToRelative(-2.5f, 3.03f);
        pathBuilderD.horizontalLineToRelative(1.9f);
        pathBuilderD.curveToRelative(0.5f, 0.0f, 0.9f, 0.4f, 0.9f, 0.9f);
        pathBuilderD.reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f);
        pathBuilderD.horizontalLineToRelative(-2.78f);
        pathBuilderD.curveToRelative(-0.73f, 0.0f, -1.32f, -0.59f, -1.32f, -1.32f);
        pathBuilderD.verticalLineToRelative(-0.01f);
        pathBuilderD.curveToRelative(0.0f, -0.31f, 0.11f, -0.6f, 0.3f, -0.84f);
        pathBuilderD.lineToRelative(2.5f, -3.03f);
        pathBuilderD.horizontalLineToRelative(-1.9f);
        pathBuilderD.curveToRelative(-0.5f, 0.0f, -0.9f, -0.4f, -0.9f, -0.9f);
        pathBuilderD.reflectiveCurveToRelative(0.4f, -0.9f, 0.9f, -0.9f);
        pathBuilderD.horizontalLineToRelative(2.78f);
        pathBuilderD.curveToRelative(0.73f, 0.0f, 1.32f, 0.59f, 1.32f, 1.33f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsPaused = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
