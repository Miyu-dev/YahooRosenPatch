package androidx.compose.material.icons.outlined;

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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NotificationsActive.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notificationsActive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NotificationsActive", "Landroidx/compose/material/icons/Icons$Outlined;", "getNotificationsActive", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NotificationsActiveKt {
    private static ImageVector _notificationsActive;

    public static final ImageVector getNotificationsActive(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _notificationsActive;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotificationsActive", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 22.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.compose.animation.a.n(pathBuilderD, 18.0f, 16.0f, -5.0f);
        pathBuilderD.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        pathBuilderD.lineTo(13.5f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderD.verticalLineToRelative(0.68f);
        pathBuilderD.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        androidx.compose.animation.a.q(pathBuilderD, 5.0f, -2.0f, 2.0f, 1.0f);
        d.g(pathBuilderD, 16.0f, -1.0f, -2.0f, -2.0f);
        pathBuilderD.moveTo(16.0f, 17.0f);
        pathBuilderD.lineTo(8.0f, 17.0f);
        pathBuilderD.verticalLineToRelative(-6.0f);
        pathBuilderD.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        pathBuilderD.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        android.support.v4.media.a.v(pathBuilderD, 6.0f, 7.58f, 4.08f);
        pathBuilderD.lineTo(6.15f, 2.65f);
        pathBuilderD.curveTo(3.75f, 4.48f, 2.17f, 7.3f, 2.03f, 10.5f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.15f, -2.65f, 1.51f, -4.97f, 3.55f, -6.42f);
        androidx.compose.animation.a.j(pathBuilderD, 19.97f, 10.5f, 2.0f);
        pathBuilderD.curveToRelative(-0.15f, -3.2f, -1.73f, -6.02f, -4.12f, -7.85f);
        pathBuilderD.lineToRelative(-1.42f, 1.43f);
        pathBuilderD.curveToRelative(2.02f, 1.45f, 3.39f, 3.77f, 3.54f, 6.42f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsActive = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
