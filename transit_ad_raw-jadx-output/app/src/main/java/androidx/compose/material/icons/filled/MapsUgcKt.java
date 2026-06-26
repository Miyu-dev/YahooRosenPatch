package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MapsUgc.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mapsUgc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MapsUgc", "Landroidx/compose/material/icons/Icons$Filled;", "getMapsUgc", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MapsUgcKt {
    private static ImageVector _mapsUgc;

    public static final ImageVector getMapsUgc(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _mapsUgc;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MapsUgc", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iM3071getEvenOddRgk1Os = PathFillType.INSTANCE.m3071getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f);
        pathBuilderD.lineTo(1.0f, 23.0f);
        pathBuilderD.lineToRelative(6.71f, -1.97f);
        pathBuilderD.curveTo(9.02f, 21.64f, 10.46f, 22.0f, 12.0f, 22.0f);
        pathBuilderD.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.r(pathBuilderD, 16.0f, 13.0f, -3.0f, 3.0f);
        androidx.appcompat.app.m.x(pathBuilderD, -2.0f, -3.0f, 8.0f, -2.0f);
        androidx.appcompat.app.m.w(pathBuilderD, 3.0f, 8.0f, 2.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderD, 3.0f, 13.0f), iM3071getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mapsUgc = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
