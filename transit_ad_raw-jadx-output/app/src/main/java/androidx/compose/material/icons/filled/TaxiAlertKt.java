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

/* JADX INFO: compiled from: TaxiAlert.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_taxiAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TaxiAlert", "Landroidx/compose/material/icons/Icons$Filled;", "getTaxiAlert", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TaxiAlertKt {
    private static ImageVector _taxiAlert;

    public static final ImageVector getTaxiAlert(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _taxiAlert;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TaxiAlert", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(23.0f, 8.0f);
        pathBuilderD.arcTo(7.0f, 7.0f, 0.0f, false, false, 9.68f, 5.0f);
        pathBuilderD.lineTo(7.0f, 5.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.lineTo(4.5f, 7.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.42f, 1.01f);
        pathBuilderD.lineTo(1.0f, 14.0f);
        pathBuilderD.verticalLineToRelative(8.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -1.0f, 12.0f, 1.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-7.68f);
        pathBuilderD.arcTo(7.01f, 7.01f, 0.0f, false, false, 23.0f, 8.0f);
        androidx.compose.animation.a.j(pathBuilderD, 4.5f, 8.5f, 4.53f);
        pathBuilderD.arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.08f, 4.5f);
        androidx.compose.animation.a.A(pathBuilderD, 3.0f, 13.0f, 1.5f, -4.5f);
        pathBuilderD.moveTo(4.5f, 18.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.5f, 18.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilderD.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        a.y(pathBuilderD, 18.43f, 12.37f, -0.21f, 0.11f);
        pathBuilderD.lineToRelative(-0.18f, 0.09f);
        pathBuilderD.arcToRelative(4.97f, 4.97f, 0.0f, false, true, -0.42f, 0.16f);
        pathBuilderD.lineToRelative(-0.22f, 0.07f);
        pathBuilderD.lineToRelative(-0.23f, 0.06f);
        pathBuilderD.lineToRelative(-0.2f, 0.05f);
        pathBuilderD.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.94f, -4.41f);
        pathBuilderD.arcTo(4.07f, 4.07f, 0.0f, false, true, 11.0f, 8.0f);
        pathBuilderD.lineToRelative(0.02f, -0.47f);
        pathBuilderD.lineToRelative(0.02f, -0.17f);
        pathBuilderD.lineToRelative(0.04f, -0.28f);
        pathBuilderD.lineToRelative(0.04f, -0.21f);
        pathBuilderD.lineToRelative(0.05f, -0.21f);
        pathBuilderD.lineToRelative(0.07f, -0.24f);
        pathBuilderD.lineToRelative(0.05f, -0.13f);
        pathBuilderD.arcToRelative(4.99f, 4.99f, 0.0f, false, true, 9.69f, 1.7f);
        pathBuilderD.arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.55f, 4.38f);
        b.r(pathBuilderD, 15.0f, 4.0f, 2.0f, 5.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderD, -2.0f, 15.0f, 10.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderD, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taxiAlert = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
