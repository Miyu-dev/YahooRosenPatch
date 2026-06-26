package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoTransfer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noTransfer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoTransfer", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoTransfer", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoTransferKt {
    private static ImageVector _noTransfer;

    public static final ImageVector getNoTransfer(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noTransfer;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoTransfer", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.5f, 13.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(9.33f, 16.0f, 8.5f, 16.0f);
        pathBuilderD.reflectiveCurveTo(7.0f, 15.33f, 7.0f, 14.5f);
        pathBuilderD.reflectiveCurveTo(7.67f, 13.0f, 8.5f, 13.0f);
        a.y(pathBuilderD, 19.78f, 22.61f, -1.64f, -1.64f);
        pathBuilderD.curveTo(18.09f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f);
        pathBuilderD.horizontalLineToRelative(-1.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.z(pathBuilderD, -1.0f, 8.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-1.78f);
        pathBuilderD.curveTo(4.39f, 17.67f, 4.0f, 16.88f, 4.0f, 16.0f);
        pathBuilderD.verticalLineTo(6.83f);
        pathBuilderD.lineTo(1.39f, 4.22f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderD, 18.38f, 18.38f, 19.78f, 22.61f);
        h.D(pathBuilderD, 6.0f, 8.83f, 10.0f, 1.17f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 6.0f, 8.83f, 14.17f, 17.0f);
        androidx.compose.animation.a.r(pathBuilderD, -5.0f, -5.0f, 6.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.37f, 0.21f, 0.62f, 0.34f, 0.73f);
        i.b(pathBuilderD, 6.63f, 17.0f, 14.17f);
        pathBuilderD.moveTo(12.0f, 4.0f);
        pathBuilderD.curveToRelative(3.69f, 0.0f, 5.11f, 0.46f, 5.66f, 0.99f);
        s.C(pathBuilderD, 7.82f, 2.0f, 2.0f, 18.0f);
        androidx.appcompat.app.m.u(pathBuilderD, 10.0f, -5.17f, 2.0f, 2.0f);
        androidx.compose.animation.a.z(pathBuilderD, 18.0f, 3.17f, 1.81f, 1.81f);
        pathBuilderD.curveTo(19.92f, 16.67f, 20.0f, 16.35f, 20.0f, 16.0f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        pathBuilderD.curveTo(9.48f, 2.0f, 7.24f, 2.16f, 5.78f, 2.95f);
        pathBuilderD.lineToRelative(1.53f, 1.53f);
        pathBuilderD.curveTo(8.17f, 4.2f, 9.6f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noTransfer = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
