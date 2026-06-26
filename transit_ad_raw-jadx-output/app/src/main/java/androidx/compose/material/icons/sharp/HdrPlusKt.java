package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HdrPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrPlus", "Landroidx/compose/material/icons/Icons$Sharp;", "getHdrPlus", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrPlusKt {
    private static ImageVector _hdrPlus;

    public static final ImageVector getHdrPlus(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _hdrPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HdrPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(8.5f, 14.5f, 2.0f, 1.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(14.5f, 7.5f, 1.5f, 3.0f, -1.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        a.y(pathBuilderD, 12.0f, 17.0f, -0.86f, -0.01f);
        pathBuilderD.lineTo(12.0f, 19.0f);
        androidx.compose.animation.a.C(pathBuilderD, -1.5f, -0.9f, -2.0f, 8.5f);
        b.x(pathBuilderD, 2.0f, 7.0f, -6.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 1.5f);
        androidx.appcompat.view.menu.a.B(pathBuilderD, 17.0f, 12.0f, 12.0f, -1.5f);
        f.g(pathBuilderD, 9.5f, -2.0f, 12.0f, 7.0f);
        s.y(pathBuilderD, 6.0f, 1.5f, 2.0f, 2.0f);
        androidx.compose.animation.b.z(pathBuilderD, 6.0f, 12.0f, 12.0f);
        b.z(pathBuilderD, 17.5f, 16.0f, 16.0f, 1.5f);
        b.C(pathBuilderD, -1.5f, 16.0f, 13.0f, -1.5f);
        b.C(pathBuilderD, 1.5f, 13.0f, 16.0f, 1.49f);
        b.m(pathBuilderD, 1.5f, 16.0f, 17.5f, 10.5f);
        pathBuilderD.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        v.m(pathBuilderD, -3.0f, 6.0f, 3.0f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 10.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
