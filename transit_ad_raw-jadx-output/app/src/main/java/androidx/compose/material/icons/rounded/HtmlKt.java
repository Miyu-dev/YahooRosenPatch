package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_html", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Html", "Landroidx/compose/material/icons/Icons$Rounded;", "getHtml", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HtmlKt {
    private static ImageVector _html;

    public static final ImageVector getHtml(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _html;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Html", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.0f, 15.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineTo(9.75f);
        pathBuilderD.curveTo(20.0f, 9.34f, 20.34f, 9.0f, 20.75f, 9.0f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderD.verticalLineToRelative(3.75f);
        pathBuilderD.horizontalLineToRelative(1.75f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        h.v(pathBuilderD, 21.0f, 16.0f, 10.49f, 1.0f);
        pathBuilderD.verticalLineToRelative(3.76f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineTo(13.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.25f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        v.r(pathBuilderD, 10.5f, 1.0f, 2.75f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.reflectiveCurveTo(16.0f, 13.66f, 16.0f, 13.25f);
        android.support.v4.media.a.y(pathBuilderD, 10.49f, 5.0f, 9.75f);
        pathBuilderD.curveTo(5.0f, 9.34f, 4.66f, 9.0f, 4.25f, 9.0f);
        pathBuilderD.reflectiveCurveTo(3.5f, 9.34f, 3.5f, 9.75f);
        h.w(pathBuilderD, 11.0f, -2.0f, 9.75f);
        pathBuilderD.curveTo(1.5f, 9.34f, 1.16f, 9.0f, 0.75f, 9.0f);
        pathBuilderD.reflectiveCurveTo(0.0f, 9.34f, 0.0f, 9.75f);
        pathBuilderD.verticalLineToRelative(4.5f);
        pathBuilderD.curveTo(0.0f, 14.66f, 0.34f, 15.0f, 0.75f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        v.r(pathBuilderD, 12.5f, 2.0f, 1.75f);
        pathBuilderD.curveTo(3.5f, 14.66f, 3.84f, 15.0f, 4.25f, 15.0f);
        pathBuilderD.reflectiveCurveTo(5.0f, 14.66f, 5.0f, 14.25f);
        android.support.v4.media.a.y(pathBuilderD, 9.75f, 10.25f, 10.5f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD.curveTo(11.0f, 9.34f, 10.66f, 9.0f, 10.25f, 9.0f);
        pathBuilderD.horizontalLineToRelative(-3.5f);
        pathBuilderD.curveTo(6.34f, 9.0f, 6.0f, 9.34f, 6.0f, 9.75f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.verticalLineToRelative(3.75f);
        pathBuilderD.curveTo(7.75f, 14.66f, 8.09f, 15.0f, 8.5f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderD, 10.5f, 10.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _html = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
