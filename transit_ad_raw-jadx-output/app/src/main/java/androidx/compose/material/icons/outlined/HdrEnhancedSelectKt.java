package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HdrEnhancedSelect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrEnhancedSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrEnhancedSelect", "Landroidx/compose/material/icons/Icons$Outlined;", "getHdrEnhancedSelect", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrEnhancedSelectKt {
    private static ImageVector _hdrEnhancedSelect;

    public static final ImageVector getHdrEnhancedSelect(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _hdrEnhancedSelect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrEnhancedSelect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilderD.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderD.reflectiveCurveTo(8.69f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 4.0f);
        pathBuilderD.curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.reflectiveCurveTo(14.21f, 4.0f, 12.0f, 4.0f);
        androidx.compose.animation.a.k(pathBuilderD, 13.0f, 11.0f, -2.0f, 9.0f);
        pathBuilderD.horizontalLineTo(9.0f);
        pathBuilderD.verticalLineTo(7.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.verticalLineTo(5.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 2.0f, 2.0f, 2.0f, 2.0f);
        b.m(pathBuilderD, -2.0f, 11.0f, 24.0f, 20.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, -2.0f, 2.0f, -1.5f, -2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, -2.0f, -1.5f, 2.0f, -2.0f);
        v.B(pathBuilderD, 22.0f, 2.0f, 2.0f, 20.0f);
        pathBuilderD.moveTo(18.0f, 18.5f);
        pathBuilderD.curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f);
        pathBuilderD.lineTo(18.0f, 22.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderD, -1.5f, -0.9f, -2.0f, -1.1f);
        b.x(pathBuilderD, 2.0f, 13.0f, -6.0f, 3.5f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        androidx.compose.animation.b.l(pathBuilderD, 18.5f, 16.5f, 18.5f, -1.0f);
        s.q(pathBuilderD, -2.0f, 1.0f, 16.5f);
        android.support.v4.media.a.D(pathBuilderD, 3.5f, 18.0f, -2.0f, 5.0f);
        b.x(pathBuilderD, 6.0f, 3.5f, -2.5f, -2.0f);
        androidx.compose.animation.b.x(pathBuilderD, 22.0f, 0.0f, -6.0f, 1.5f);
        h.z(pathBuilderD, 2.0f, 3.5f, 10.0f, 16.0f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        androidx.compose.animation.a.w(pathBuilderD, 6.5f, -6.0f, 10.0f);
        android.support.v4.media.a.D(pathBuilderD, 10.0f, 20.5f, -3.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.m(pathBuilderD, 3.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrEnhancedSelect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
