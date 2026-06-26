package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: AddAlert.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddAlert", "Landroidx/compose/material/icons/Icons$Filled;", "getAddAlert", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddAlertKt {
    private static ImageVector _addAlert;

    public static final ImageVector getAddAlert(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _addAlert;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddAlert", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.01f, 21.01f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f);
        pathBuilderD.reflectiveCurveToRelative(1.99f, -0.89f, 1.99f, -1.99f);
        b.q(pathBuilderD, -3.98f, 18.88f, 16.82f);
        pathBuilderD.lineTo(18.88f, 11.0f);
        pathBuilderD.curveToRelative(0.0f, -3.25f, -2.25f, -5.97f, -5.29f, -6.69f);
        pathBuilderD.verticalLineToRelative(-0.72f);
        pathBuilderD.curveTo(13.59f, 2.71f, 12.88f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.59f, 0.71f, -1.59f, 1.59f);
        pathBuilderD.verticalLineToRelative(0.72f);
        pathBuilderD.curveTo(7.37f, 5.03f, 5.12f, 7.75f, 5.12f, 11.0f);
        pathBuilderD.verticalLineToRelative(5.82f);
        pathBuilderD.lineTo(3.0f, 18.94f);
        androidx.compose.animation.a.o(pathBuilderD, 3.0f, 20.0f, 18.0f, -1.06f);
        android.support.v4.media.a.t(pathBuilderD, -2.12f, -2.12f, 16.0f, 13.01f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, -3.0f, 3.0f, -2.0f, -3.0f);
        pathBuilderD.lineTo(8.0f, 13.01f);
        pathBuilderD.lineTo(8.0f, 11.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderD, 3.0f, 11.0f, 8.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.j(pathBuilderD, 3.0f, 3.0f, 2.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlert = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
