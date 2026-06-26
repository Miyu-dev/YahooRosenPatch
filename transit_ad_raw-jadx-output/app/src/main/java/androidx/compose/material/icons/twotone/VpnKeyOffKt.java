package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: VpnKeyOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vpnKeyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VpnKeyOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVpnKeyOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VpnKeyOffKt {
    private static ImageVector _vpnKeyOff;

    public static final ImageVector getVpnKeyOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _vpnKeyOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VpnKeyOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(17.0f, 14.17f, 13.0f, -1.17f);
        a.r(pathBuilderO, -2.0f, -2.0f, 21.0f, 2.0f);
        androidx.appcompat.app.m.C(pathBuilderO, -2.0f, 3.0f, 17.0f, 14.17f);
        pathBuilderO.moveTo(7.0f, 16.0f);
        pathBuilderO.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderO.curveToRelative(0.0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f);
        pathBuilderO.lineToRelative(1.71f, 1.71f);
        pathBuilderO.curveTo(7.12f, 10.0f, 7.06f, 10.0f, 7.0f, 10.0f);
        pathBuilderO.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderO.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderO.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderO.curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, -0.01f, -0.18f);
        pathBuilderO.lineToRelative(1.74f, 1.74f);
        pathBuilderO.curveTo(10.22f, 14.48f, 9.14f, 16.0f, 7.0f, 16.0f);
        pathBuilderO.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(2.81f, 2.81f, 1.39f, 4.22f);
        pathBuilderA.lineToRelative(2.59f, 2.59f);
        pathBuilderA.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderA.curveToRelative(2.22f, 0.0f, 4.15f, -1.21f, 5.19f, -3.0f);
        pathBuilderA.lineToRelative(7.59f, 7.61f);
        s.r(pathBuilderA, 1.41f, -1.41f, 2.81f, 2.81f);
        pathBuilderA.moveTo(7.0f, 16.0f);
        pathBuilderA.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderA.curveToRelative(0.0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f);
        pathBuilderA.lineToRelative(1.71f, 1.71f);
        pathBuilderA.curveTo(7.12f, 10.0f, 7.06f, 10.0f, 7.0f, 10.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, -0.01f, -0.18f);
        pathBuilderA.lineToRelative(1.74f, 1.74f);
        pathBuilderA.curveTo(10.22f, 14.48f, 9.14f, 16.0f, 7.0f, 16.0f);
        h.B(pathBuilderA, 17.0f, 14.17f, 13.0f, -1.17f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 17.0f, 14.17f, 13.83f, 11.0f);
        androidx.browser.browseractions.a.B(pathBuilderA, 21.0f, 2.0f, -2.0f, 3.0f);
        v.u(pathBuilderA, 2.0f, 2.0f, -3.0f, 2.0f);
        pathBuilderA.verticalLineTo(9.0f);
        pathBuilderA.horizontalLineTo(11.83f);
        pathBuilderA.lineTo(13.83f, 11.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnKeyOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
