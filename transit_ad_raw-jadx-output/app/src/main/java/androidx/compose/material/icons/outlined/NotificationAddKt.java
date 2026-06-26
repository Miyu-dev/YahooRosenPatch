package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: NotificationAdd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notificationAdd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NotificationAdd", "Landroidx/compose/material/icons/Icons$Outlined;", "getNotificationAdd", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NotificationAddKt {
    private static ImageVector _notificationAdd;

    public static final ImageVector getNotificationAdd(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _notificationAdd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotificationAdd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderR = a.r(16.0f, 14.0f, 3.0f, 8.0f, -7.0f);
        pathBuilderR.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderR.curveToRelative(0.85f, 0.0f, 1.64f, 0.26f, 2.28f, 0.72f);
        pathBuilderR.lineToRelative(1.43f, -1.43f);
        pathBuilderR.curveToRelative(-0.64f, -0.51f, -1.39f, -0.88f, -2.21f, -1.09f);
        pathBuilderR.verticalLineTo(3.5f);
        pathBuilderR.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        pathBuilderR.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderR.verticalLineToRelative(0.7f);
        pathBuilderR.curveTo(7.91f, 4.86f, 6.0f, 7.21f, 6.0f, 10.0f);
        b.x(pathBuilderR, 7.0f, 4.0f, 2.0f, 16.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderR, -2.0f, -2.0f, -3.0f, 16.0f);
        pathBuilderR.moveTo(12.0f, 22.0f);
        pathBuilderR.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderR.horizontalLineToRelative(-4.0f);
        pathBuilderR.curveTo(10.0f, 21.1f, 10.9f, 22.0f, 12.0f, 22.0f);
        androidx.compose.animation.a.k(pathBuilderR, 24.0f, 8.0f, -3.0f, 5.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderR, -2.0f, 3.0f, -3.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderR, 3.0f, 3.0f, 2.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderR, 3.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationAdd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
