package androidx.compose.material.icons.filled;

import a.b;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Tram.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tram", "Landroidx/compose/material/icons/Icons$Filled;", "getTram", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tram", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.0f, 16.94f, 19.0f, 8.5f);
        pathBuilderA.curveToRelative(0.0f, -2.79f, -2.61f, -3.4f, -6.01f, -3.49f);
        pathBuilderA.lineToRelative(0.76f, -1.51f);
        pathBuilderA.lineTo(17.0f, 3.5f);
        pathBuilderA.lineTo(17.0f, 2.0f);
        b.s(pathBuilderA, 7.0f, 2.0f, 1.5f, 4.75f);
        pathBuilderA.lineToRelative(-0.76f, 1.52f);
        pathBuilderA.curveTo(7.86f, 5.11f, 5.0f, 5.73f, 5.0f, 8.5f);
        pathBuilderA.verticalLineToRelative(8.44f);
        pathBuilderA.curveToRelative(0.0f, 1.45f, 1.19f, 2.66f, 2.59f, 2.97f);
        b.s(pathBuilderA, 6.0f, 21.5f, 0.5f, 2.23f);
        pathBuilderA.lineToRelative(2.0f, -2.0f);
        pathBuilderA.lineTo(14.0f, 20.0f);
        a.C(pathBuilderA, 2.0f, 2.0f, 2.0f, -0.5f);
        pathBuilderA.lineTo(16.5f, 20.0f);
        pathBuilderA.horizontalLineToRelative(-0.08f);
        pathBuilderA.curveToRelative(1.69f, 0.0f, 2.58f, -1.37f, 2.58f, -3.06f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 18.5f);
        pathBuilderA.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderA.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderA.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderA.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        androidx.compose.animation.a.t(pathBuilderA, 17.0f, 14.0f, 7.0f, 14.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderA, 7.0f, 9.0f, 10.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tram = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
