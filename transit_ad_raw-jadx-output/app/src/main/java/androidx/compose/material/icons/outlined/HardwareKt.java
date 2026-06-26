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

/* JADX INFO: compiled from: Hardware.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hardware", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hardware", "Landroidx/compose/material/icons/Icons$Outlined;", "getHardware", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HardwareKt {
    private static ImageVector _hardware;

    public static final ImageVector getHardware(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _hardware;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hardware", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(18.0f, 3.0f, -3.0f, 3.0f, 3.0f);
        pathBuilderW.horizontalLineTo(9.0f);
        pathBuilderW.curveTo(6.24f, 3.0f, 4.0f, 5.24f, 4.0f, 8.0f);
        pathBuilderW.horizontalLineToRelative(5.0f);
        pathBuilderW.verticalLineToRelative(12.0f);
        pathBuilderW.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderW.horizontalLineToRelative(4.0f);
        pathBuilderW.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderW.verticalLineTo(8.0f);
        pathBuilderW.lineToRelative(3.0f, 3.0f);
        pathBuilderW.horizontalLineToRelative(2.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderW, 3.0f, 18.0f, 13.0f, 19.0f);
        androidx.compose.animation.a.B(pathBuilderW, -2.0f, -6.0f, 2.0f, 19.0f);
        androidx.appcompat.app.m.t(pathBuilderW, 11.0f, 11.0f, 6.0f, 6.77f);
        pathBuilderW.curveTo(7.32f, 5.39f, 8.11f, 5.0f, 9.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, d.c(pathBuilderW, 4.0f, 6.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hardware = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
