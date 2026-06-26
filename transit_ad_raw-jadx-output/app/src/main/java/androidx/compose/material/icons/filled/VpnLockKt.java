package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: VpnLock.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vpnLock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VpnLock", "Landroidx/compose/material/icons/Icons$Filled;", "getVpnLock", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VpnLockKt {
    private static ImageVector _vpnLock;

    public static final ImageVector getVpnLock(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _vpnLock;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VpnLock", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(22.0f, 4.0f, -0.5f);
        pathBuilderE.curveTo(22.0f, 2.12f, 20.88f, 1.0f, 19.5f, 1.0f);
        pathBuilderE.reflectiveCurveTo(17.0f, 2.12f, 17.0f, 3.5f);
        pathBuilderE.lineTo(17.0f, 4.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderE.horizontalLineToRelative(5.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderE.lineTo(23.0f, 5.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.r(pathBuilderE, 21.2f, 4.0f, -3.4f, -0.5f);
        pathBuilderE.curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        pathBuilderE.reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f);
        a.z(pathBuilderE, 21.2f, 4.0f, 18.92f, 12.0f);
        pathBuilderE.curveToRelative(0.04f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        pathBuilderE.curveToRelative(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        pathBuilderE.curveToRelative(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
        pathBuilderE.horizontalLineToRelative(-1.0f);
        pathBuilderE.verticalLineToRelative(-3.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.b.s(pathBuilderE, 7.0f, 13.0f, -2.0f, 2.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderE.lineTo(10.0f, 8.0f);
        pathBuilderE.horizontalLineToRelative(2.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.lineTo(14.0f, 3.46f);
        pathBuilderE.curveToRelative(-0.95f, -0.3f, -1.95f, -0.46f, -3.0f, -0.46f);
        pathBuilderE.curveTo(5.48f, 3.0f, 1.0f, 7.48f, 1.0f, 13.0f);
        pathBuilderE.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderE.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderE.curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.05f, -1.0f);
        b.q(pathBuilderE, -2.03f, 10.0f, 20.93f);
        pathBuilderE.curveToRelative(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        pathBuilderE.curveToRelative(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        pathBuilderE.lineTo(8.0f, 16.0f);
        pathBuilderE.verticalLineToRelative(1.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.h(pathBuilderE, 1.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnLock = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
