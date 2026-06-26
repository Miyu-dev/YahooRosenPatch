package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: QrCodeScanner.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_qrCodeScanner", "Landroidx/compose/ui/graphics/vector/ImageVector;", "QrCodeScanner", "Landroidx/compose/material/icons/Icons$Rounded;", "getQrCodeScanner", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class QrCodeScannerKt {
    private static ImageVector _qrCodeScanner;

    public static final ImageVector getQrCodeScanner(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _qrCodeScanner;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QrCodeScanner", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = a.p(9.5f, 6.5f, 3.0f, -3.0f, -3.0f);
        h.f(pathBuilderP, 9.5f, 11.0f, 5.0f, 5.0f);
        s.l(pathBuilderP, 6.0f, 6.0f, 5.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 11.0f, 5.0f, 9.5f, 14.5f);
        c.a.j(pathBuilderP, 3.0f, -3.0f, -3.0f, 9.5f);
        b.z(pathBuilderP, 11.0f, 13.0f, 5.0f, 6.0f);
        a.s(pathBuilderP, 6.0f, 13.0f, 11.0f, 13.0f);
        b.y(pathBuilderP, 17.5f, 6.5f, 3.0f, -3.0f);
        pathBuilderP.verticalLineToRelative(-3.0f);
        pathBuilderP.horizontalLineTo(17.5f);
        pathBuilderP.moveTo(19.0f, 5.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderP, -6.0f, 6.0f, 6.0f, 5.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 19.0f, 5.0f, 13.0f, 13.0f);
        s.A(pathBuilderP, 1.5f, 1.5f, 13.0f, 13.0f);
        android.support.v4.media.a.B(pathBuilderP, 14.5f, 14.5f, 16.0f, 16.0f);
        b.m(pathBuilderP, -1.5f, 14.5f, 16.0f, 13.0f);
        s.A(pathBuilderP, 1.5f, 1.5f, 16.0f, 13.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderP, 13.0f, 16.0f, 1.5f, 1.5f);
        b.B(pathBuilderP, 13.0f, 16.0f, 14.5f, 17.5f);
        a6.h.x(pathBuilderP, 16.0f, 19.0f, -1.5f, 17.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderP, 16.0f, 16.0f, 1.5f, 1.5f);
        b.B(pathBuilderP, 16.0f, 16.0f, 17.5f, 14.5f);
        a6.h.x(pathBuilderP, 19.0f, 16.0f, -1.5f, 14.5f);
        android.support.v4.media.a.B(pathBuilderP, 17.5f, 17.5f, 19.0f, 19.0f);
        b.m(pathBuilderP, -1.5f, 17.5f, 21.0f, 7.0f);
        pathBuilderP.lineTo(21.0f, 7.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderP.verticalLineTo(4.0f);
        pathBuilderP.horizontalLineToRelative(-2.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderP.verticalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderP.horizontalLineToRelative(3.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderP.verticalLineToRelative(3.0f);
        pathBuilderP.curveTo(22.0f, 6.55f, 21.55f, 7.0f, 21.0f, 7.0f);
        androidx.compose.animation.a.n(pathBuilderP, 22.0f, 21.0f, -3.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderP.horizontalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderP.verticalLineToRelative(2.0f);
        pathBuilderP.horizontalLineToRelative(-2.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderP.verticalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderP.horizontalLineToRelative(3.0f);
        pathBuilderP.curveTo(21.55f, 22.0f, 22.0f, 21.55f, 22.0f, 21.0f);
        androidx.compose.animation.a.j(pathBuilderP, 3.0f, 22.0f, 3.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderP.verticalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderP.horizontalLineTo(4.0f);
        pathBuilderP.verticalLineToRelative(-2.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderP.horizontalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderP.verticalLineToRelative(3.0f);
        pathBuilderP.curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f);
        androidx.compose.animation.a.n(pathBuilderP, 2.0f, 3.0f, 3.0f);
        pathBuilderP.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderP.horizontalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderP.verticalLineTo(4.0f);
        pathBuilderP.horizontalLineToRelative(2.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderP.verticalLineToRelative(0.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderP.horizontalLineTo(3.0f);
        pathBuilderP.curveTo(2.45f, 2.0f, 2.0f, 2.45f, 2.0f, 3.0f);
        pathBuilderP.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderP.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _qrCodeScanner = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
