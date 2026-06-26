package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: Http.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_http", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Http", "Landroidx/compose/material/icons/Icons$Rounded;", "getHttp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HttpKt {
    private static ImageVector _http;

    public static final ImageVector getHttp(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _http;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Http", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(4.5f, 11.0f, -2.0f, 2.5f, 9.75f);
        pathBuilderC.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderC.reflectiveCurveTo(1.0f, 9.34f, 1.0f, 9.75f);
        pathBuilderC.verticalLineToRelative(4.5f);
        pathBuilderC.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        a.o(pathBuilderC, 2.5f, 12.5f, 2.0f, 1.75f);
        pathBuilderC.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderC.verticalLineToRelative(-4.5f);
        pathBuilderC.curveTo(6.0f, 9.34f, 5.66f, 9.0f, 5.25f, 9.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        androidx.appcompat.view.menu.a.z(pathBuilderC, 4.5f, 11.0f, 7.75f, 10.5f);
        pathBuilderC.horizontalLineToRelative(0.75f);
        pathBuilderC.verticalLineToRelative(3.75f);
        pathBuilderC.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderC.lineTo(10.0f, 10.5f);
        pathBuilderC.horizontalLineToRelative(0.75f);
        pathBuilderC.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderC.reflectiveCurveTo(11.16f, 9.0f, 10.75f, 9.0f);
        pathBuilderC.horizontalLineToRelative(-3.0f);
        pathBuilderC.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        a.t(pathBuilderC, 13.25f, 10.5f, 14.0f, 10.5f);
        pathBuilderC.verticalLineToRelative(3.75f);
        pathBuilderC.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderC.lineTo(15.5f, 10.5f);
        pathBuilderC.horizontalLineToRelative(0.75f);
        pathBuilderC.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderC.reflectiveCurveTo(16.66f, 9.0f, 16.25f, 9.0f);
        pathBuilderC.horizontalLineToRelative(-3.0f);
        pathBuilderC.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        a.t(pathBuilderC, 21.5f, 9.0f, 19.0f, 9.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.verticalLineToRelative(4.25f);
        pathBuilderC.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderC.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderC.lineTo(19.5f, 13.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.curveToRelative(0.83f, 0.0f, 1.5f, -0.68f, 1.5f, -1.5f);
        pathBuilderC.verticalLineToRelative(-1.0f);
        pathBuilderC.curveToRelative(0.0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.r(pathBuilderC, 21.5f, 11.5f, -2.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderC, 2.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _http = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
