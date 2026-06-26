package androidx.compose.material.icons.filled;

import a6.h;
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

/* JADX INFO: compiled from: Transgender.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_transgender", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Transgender", "Landroidx/compose/material/icons/Icons$Filled;", "getTransgender", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TransgenderKt {
    private static ImageVector _transgender;

    public static final ImageVector getTransgender(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _transgender;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Transgender", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 8.0f);
        pathBuilderD.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilderD.reflectiveCurveTo(13.93f, 15.0f, 12.0f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilderD.reflectiveCurveTo(10.07f, 8.0f, 12.0f, 8.0f);
        a.y(pathBuilderD, 16.53f, 8.38f, 3.97f, -3.96f);
        androidx.appcompat.view.menu.a.C(pathBuilderD, 7.0f, 2.0f, 1.0f, -6.0f);
        a.t(pathBuilderD, 2.0f, 2.58f, -3.97f, 3.97f);
        pathBuilderD.curveTo(14.23f, 6.36f, 13.16f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.curveToRelative(-1.16f, 0.0f, -2.23f, 0.36f, -3.11f, 0.97f);
        pathBuilderD.lineTo(8.24f, 6.32f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineTo(8.24f, 3.49f);
        pathBuilderD.lineTo(6.82f, 4.9f);
        v.A(pathBuilderD, 4.92f, 3.0f, 7.5f, 1.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderD, -6.0f, 6.0f, 2.0f, 4.42f);
        pathBuilderD.lineToRelative(1.91f, 1.9f);
        pathBuilderD.lineTo(3.99f, 7.74f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineToRelative(0.65f, 0.65f);
        pathBuilderD.curveTo(6.86f, 9.27f, 6.5f, 10.34f, 6.5f, 11.5f);
        pathBuilderD.curveToRelative(0.0f, 2.7f, 1.94f, 4.94f, 4.5f, 5.41f);
        h.n(pathBuilderD, 11.0f, 19.0f, 9.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 2.0f, 2.0f, 2.0f, -2.0f);
        android.support.v4.media.a.s(pathBuilderD, 2.0f, -2.0f, -2.0f);
        pathBuilderD.lineToRelative(0.0f, -2.09f);
        pathBuilderD.curveToRelative(2.56f, -0.47f, 4.5f, -2.71f, 4.5f, -5.41f);
        pathBuilderD.curveTo(17.5f, 10.34f, 17.14f, 9.27f, 16.53f, 8.38f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transgender = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
