package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DesignServices.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_designServices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DesignServices", "Landroidx/compose/material/icons/Icons$Outlined;", "getDesignServices", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DesignServices", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.97f, 7.27f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineToRelative(-2.83f, -2.83f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-4.49f, 4.49f);
        pathBuilderD.lineTo(8.35f, 3.63f);
        pathBuilderD.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderD.lineToRelative(-1.9f, 1.9f);
        pathBuilderD.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderD.lineToRelative(3.89f, 3.89f);
        androidx.appcompat.app.m.r(pathBuilderD, 3.0f, 16.76f, 21.0f, 4.24f);
        pathBuilderD.lineToRelative(4.52f, -4.52f);
        pathBuilderD.lineToRelative(3.89f, 3.89f);
        pathBuilderD.curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0.0f);
        pathBuilderD.lineToRelative(1.9f, -1.9f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        s.r(pathBuilderD, -3.89f, -3.89f, 20.97f, 7.27f);
        pathBuilderD.moveTo(5.04f, 6.94f);
        pathBuilderD.lineToRelative(1.89f, -1.9f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilderD.lineToRelative(1.27f, 1.27f);
        pathBuilderD.lineTo(7.02f, 7.5f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        pathBuilderD.lineToRelative(1.19f, -1.19f);
        pathBuilderD.lineToRelative(1.2f, 1.2f);
        s.r(pathBuilderD, -1.9f, 1.9f, 5.04f, 6.94f);
        pathBuilderD.moveTo(16.27f, 14.38f);
        pathBuilderD.lineToRelative(-1.19f, 1.19f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        pathBuilderD.lineToRelative(1.19f, -1.19f);
        pathBuilderD.lineToRelative(1.27f, 1.27f);
        pathBuilderD.lineToRelative(-1.9f, 1.9f);
        pathBuilderD.lineToRelative(-3.89f, -3.89f);
        s.r(pathBuilderD, 1.9f, -1.9f, 16.27f, 14.38f);
        b.z(pathBuilderD, 6.41f, 19.0f, 5.0f, -1.41f);
        pathBuilderD.lineToRelative(9.61f, -9.61f);
        pathBuilderD.lineToRelative(1.3f, 1.3f);
        s.r(pathBuilderD, 0.11f, 0.11f, 6.41f, 19.0f);
        pathBuilderD.moveTo(16.02f, 6.56f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, -1.41f, 1.41f, 16.02f, 6.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
