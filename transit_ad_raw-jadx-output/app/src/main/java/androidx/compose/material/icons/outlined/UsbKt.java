package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Usb.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_usb", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Usb", "Landroidx/compose/material/icons/Icons$Outlined;", "getUsb", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UsbKt {
    private static ImageVector _usb;

    public static final ImageVector getUsb(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _usb;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Usb", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = a.p(15.0f, 7.0f, 4.0f, 1.0f, 2.0f);
        v.m(pathBuilderP, -3.0f, 5.0f, 2.0f);
        pathBuilderP.lineToRelative(-3.0f, -4.0f);
        a.C(pathBuilderP, -3.0f, 4.0f, 2.0f, 8.0f);
        pathBuilderP.horizontalLineTo(8.0f);
        pathBuilderP.verticalLineToRelative(-2.07f);
        pathBuilderP.curveToRelative(0.7f, -0.37f, 1.2f, -1.08f, 1.2f, -1.93f);
        pathBuilderP.curveToRelative(0.0f, -1.21f, -0.99f, -2.2f, -2.2f, -2.2f);
        pathBuilderP.reflectiveCurveTo(4.8f, 7.79f, 4.8f, 9.0f);
        pathBuilderP.curveToRelative(0.0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f);
        pathBuilderP.verticalLineTo(13.0f);
        pathBuilderP.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderP.horizontalLineToRelative(3.0f);
        pathBuilderP.verticalLineToRelative(3.05f);
        pathBuilderP.curveToRelative(-0.71f, 0.37f, -1.2f, 1.1f, -1.2f, 1.95f);
        pathBuilderP.curveToRelative(0.0f, 1.22f, 0.99f, 2.2f, 2.2f, 2.2f);
        pathBuilderP.reflectiveCurveToRelative(2.2f, -0.98f, 2.2f, -2.2f);
        pathBuilderP.curveToRelative(0.0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f);
        pathBuilderP.verticalLineTo(15.0f);
        pathBuilderP.horizontalLineToRelative(3.0f);
        pathBuilderP.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderP.verticalLineToRelative(-2.0f);
        pathBuilderP.horizontalLineToRelative(1.0f);
        pathBuilderP.verticalLineTo(7.0f);
        pathBuilderP.horizontalLineToRelative(-4.0f);
        pathBuilderP.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderP.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usb = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
