package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: BusAlert.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_busAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BusAlert", "Landroidx/compose/material/icons/Icons$Filled;", "getBusAlert", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BusAlertKt {
    private static ImageVector _busAlert;

    public static final ImageVector getBusAlert(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _busAlert;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BusAlert", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.0f, 1.0f);
        pathBuilderD.arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.78f, 3.05f);
        pathBuilderD.lineToRelative(0.02f, -0.03f);
        pathBuilderD.curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f);
        pathBuilderD.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        pathBuilderD.lineTo(2.0f, 22.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -1.0f, 8.0f, 1.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-1.78f);
        pathBuilderD.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        pathBuilderD.verticalLineToRelative(-3.08f);
        pathBuilderD.arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 1.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.5f, 19.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        androidx.compose.animation.a.t(pathBuilderD, 3.0f, 13.0f, 3.0f, 8.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(0.0f, 1.96f, 0.81f, 3.73f, 2.11f, 5.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 3.0f, 13.0f, 13.5f, 19.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.0f, 13.0f);
        pathBuilderD.arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f);
        pathBuilderD.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f);
        b.r(pathBuilderD, 15.0f, 4.0f, 2.0f, 5.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderD, -2.0f, 15.0f, 10.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderD, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _busAlert = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
