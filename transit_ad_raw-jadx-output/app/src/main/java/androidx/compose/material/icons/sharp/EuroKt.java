package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: Euro.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_euro", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Euro", "Landroidx/compose/material/icons/Icons$Sharp;", "getEuro", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EuroKt {
    private static ImageVector _euro;

    public static final ImageVector getEuro(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _euro;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Euro", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.0f, 18.5f);
        pathBuilderD.curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f);
        s.C(pathBuilderD, 15.0f, 1.0f, -2.0f, 8.58f);
        pathBuilderD.curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f);
        s.C(pathBuilderD, 15.0f, 1.0f, -2.0f, 9.24f);
        pathBuilderD.curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f);
        pathBuilderD.curveToRelative(1.61f, 0.0f, 3.09f, 0.59f, 4.23f, 1.57f);
        pathBuilderD.lineTo(21.0f, 5.3f);
        pathBuilderD.curveTo(19.41f, 3.87f, 17.3f, 3.0f, 15.0f, 3.0f);
        pathBuilderD.curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f);
        s.u(pathBuilderD, 3.0f, -1.0f, 2.0f, 4.06f);
        pathBuilderD.curveTo(6.02f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f);
        s.u(pathBuilderD, 3.0f, -1.0f, 2.0f, 4.52f);
        pathBuilderD.curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f);
        pathBuilderD.curveToRelative(2.31f, 0.0f, 4.41f, -0.87f, 6.0f, -2.3f);
        pathBuilderD.lineToRelative(-1.78f, -1.77f);
        pathBuilderD.curveTo(18.09f, 17.91f, 16.62f, 18.5f, 15.0f, 18.5f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _euro = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
