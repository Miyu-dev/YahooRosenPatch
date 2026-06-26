package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.c;
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Sanitizer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sanitizer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sanitizer", "Landroidx/compose/material/icons/Icons$Filled;", "getSanitizer", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SanitizerKt {
    private static ImageVector _sanitizer;

    public static final ImageVector getSanitizer(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _sanitizer;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Sanitizer", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.5f, 6.5f);
        pathBuilderD.curveTo(15.5f, 5.66f, 17.0f, 4.0f, 17.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 1.66f, 1.5f, 2.5f);
        pathBuilderD.curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f);
        pathBuilderD.reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.5f, 15.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderD.curveToRelative(0.0f, -1.67f, -2.5f, -4.5f, -2.5f, -4.5f);
        pathBuilderD.reflectiveCurveTo(17.0f, 10.83f, 17.0f, 12.5f);
        pathBuilderD.curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f);
        b.r(pathBuilderD, 13.0f, 14.0f, -2.0f, -2.0f);
        s.B(pathBuilderD, 9.0f, 2.0f, 7.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 2.0f, 2.0f, 2.0f, -2.0f);
        a.b.m(pathBuilderD, 2.0f, 14.0f, 16.0f, 12.0f);
        i.c(pathBuilderD, 10.0f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        c.g(pathBuilderD, 4.0f, 7.0f, 2.0f, 6.0f);
        pathBuilderD.curveToRelative(1.13f, 0.0f, 2.15f, 0.39f, 2.99f, 1.01f);
        pathBuilderD.lineToRelative(-1.43f, 1.43f);
        pathBuilderD.curveTo(14.1f, 4.17f, 13.57f, 4.0f, 13.0f, 4.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.verticalLineToRelative(2.09f);
        pathBuilderD.curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sanitizer = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
