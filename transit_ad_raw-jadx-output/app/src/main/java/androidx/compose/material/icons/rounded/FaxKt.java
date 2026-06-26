package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: Fax.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fax", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fax", "Landroidx/compose/material/icons/Icons$Rounded;", "getFax", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FaxKt {
    private static ImageVector _fax;

    public static final ImageVector getFax(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fax;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fax", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(19.0f, 9.0f, -1.0f, 6.0f);
        pathBuilderT.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderT.horizontalLineToRelative(-6.0f);
        pathBuilderT.curveTo(8.9f, 4.0f, 8.0f, 4.9f, 8.0f, 6.0f);
        pathBuilderT.verticalLineToRelative(14.0f);
        pathBuilderT.horizontalLineToRelative(12.0f);
        pathBuilderT.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderT.verticalLineToRelative(-6.0f);
        pathBuilderT.curveTo(22.0f, 10.34f, 20.66f, 9.0f, 19.0f, 9.0f);
        androidx.compose.animation.b.r(pathBuilderT, 10.0f, 6.0f, 6.0f, 3.0f);
        b.m(pathBuilderT, -6.0f, 6.0f, 14.0f, 17.0f);
        a.B(pathBuilderT, -4.0f, -5.0f, 4.0f, 17.0f);
        pathBuilderT.moveTo(16.0f, 17.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.curveTo(17.0f, 16.55f, 16.55f, 17.0f, 16.0f, 17.0f);
        pathBuilderT.close();
        pathBuilderT.moveTo(16.0f, 14.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.curveTo(17.0f, 13.55f, 16.55f, 14.0f, 16.0f, 14.0f);
        pathBuilderT.close();
        pathBuilderT.moveTo(19.0f, 17.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.curveTo(20.0f, 16.55f, 19.55f, 17.0f, 19.0f, 17.0f);
        pathBuilderT.close();
        pathBuilderT.moveTo(19.0f, 14.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.curveTo(20.0f, 13.55f, 19.55f, 14.0f, 19.0f, 14.0f);
        pathBuilderT.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderT.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(4.5f, 8.0f);
        pathBuilderD.curveTo(3.12f, 8.0f, 2.0f, 9.12f, 2.0f, 10.5f);
        pathBuilderD.verticalLineToRelative(8.0f);
        pathBuilderD.curveTo(2.0f, 19.88f, 3.12f, 21.0f, 4.5f, 21.0f);
        pathBuilderD.reflectiveCurveTo(7.0f, 19.88f, 7.0f, 18.5f);
        pathBuilderD.verticalLineToRelative(-8.0f);
        pathBuilderD.curveTo(7.0f, 9.12f, 5.88f, 8.0f, 4.5f, 8.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fax = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
