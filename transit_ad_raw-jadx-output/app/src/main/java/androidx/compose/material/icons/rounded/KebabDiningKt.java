package androidx.compose.material.icons.rounded;

import a.b;
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
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KebabDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_kebabDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KebabDining", "Landroidx/compose/material/icons/Icons$Rounded;", "getKebabDining", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KebabDiningKt {
    private static ImageVector _kebabDining;

    public static final ImageVector getKebabDining(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _kebabDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KebabDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.75f, 13.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineToRelative(3.25f);
        pathBuilder.curveTo(7.75f, 22.66f, 7.41f, 23.0f, 7.0f, 23.0f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.12f, 19.0f, 3.0f, 17.88f, 3.0f, 16.5f);
        pathBuilder.curveTo(3.0f, 15.12f, 4.12f, 14.0f, 5.5f, 14.0f);
        v.t(pathBuilder, 0.75f, -1.0f, 4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        g.f(pathBuilder, 2.25f, 7.0f, 5.5f);
        pathBuilder.curveTo(4.12f, 7.0f, 3.0f, 5.88f, 3.0f, 4.5f);
        pathBuilder.curveTo(3.0f, 3.12f, 4.12f, 2.0f, 5.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineTo(1.75f);
        pathBuilder.curveTo(6.25f, 1.34f, 6.59f, 1.0f, 7.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(9.88f, 2.0f, 11.0f, 3.12f, 11.0f, 4.5f);
        pathBuilder.curveTo(11.0f, 5.88f, 9.88f, 7.0f, 8.5f, 7.0f);
        b.r(pathBuilder, 7.75f, 1.0f, 10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.r(pathBuilder, 7.75f, 17.75f, 13.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.horizontalLineToRelative(-0.75f);
        pathBuilder.verticalLineToRelative(3.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        v.t(pathBuilder, 0.75f, -1.0f, 14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        g.f(pathBuilder, 2.25f, 7.0f, 15.5f);
        pathBuilder.curveTo(14.12f, 7.0f, 13.0f, 5.88f, 13.0f, 4.5f);
        pathBuilder.curveTo(13.0f, 3.12f, 14.12f, 2.0f, 15.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineTo(1.75f);
        pathBuilder.curveTo(16.25f, 1.34f, 16.59f, 1.0f, 17.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.curveTo(19.88f, 2.0f, 21.0f, 3.12f, 21.0f, 4.5f);
        pathBuilder.curveTo(21.0f, 5.88f, 19.88f, 7.0f, 18.5f, 7.0f);
        v.t(pathBuilder, -0.75f, 1.0f, 20.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilder, 17.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kebabDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
