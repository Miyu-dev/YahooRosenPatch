package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: NotificationsOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notificationsOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NotificationsOff", "Landroidx/compose/material/icons/Icons$Filled;", "getNotificationsOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NotificationsOffKt {
    private static ImageVector _notificationsOff;

    public static final ImageVector getNotificationsOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _notificationsOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NotificationsOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 18.69f, 7.84f, 6.14f);
        pathBuilderA.lineTo(5.27f, 3.49f);
        pathBuilderA.lineTo(4.0f, 4.76f);
        pathBuilderA.lineToRelative(2.8f, 2.8f);
        pathBuilderA.verticalLineToRelative(0.01f);
        pathBuilderA.curveToRelative(-0.52f, 0.99f, -0.8f, 2.16f, -0.8f, 3.42f);
        a.q(pathBuilderA, 5.0f, -2.0f, 2.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(13.73f);
        pathBuilderA.lineToRelative(2.0f, 2.0f);
        a.A(pathBuilderA, 21.0f, 19.72f, -1.0f, -1.03f);
        pathBuilderA.moveTo(12.0f, 22.0f);
        pathBuilderA.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderA.horizontalLineToRelative(-4.0f);
        pathBuilderA.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        a.t(pathBuilderA, 18.0f, 14.68f, 18.0f, 11.0f);
        pathBuilderA.curveToRelative(0.0f, -3.08f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilderA.lineTo(13.5f, 4.0f);
        pathBuilderA.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderA.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderA.verticalLineToRelative(0.68f);
        pathBuilderA.curveToRelative(-0.15f, 0.03f, -0.29f, 0.08f, -0.42f, 0.12f);
        pathBuilderA.curveToRelative(-0.1f, 0.03f, -0.2f, 0.07f, -0.3f, 0.11f);
        pathBuilderA.horizontalLineToRelative(-0.01f);
        pathBuilderA.curveToRelative(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.01f);
        pathBuilderA.curveToRelative(-0.23f, 0.09f, -0.46f, 0.2f, -0.68f, 0.31f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.01f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderA, 18.0f, 14.68f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
