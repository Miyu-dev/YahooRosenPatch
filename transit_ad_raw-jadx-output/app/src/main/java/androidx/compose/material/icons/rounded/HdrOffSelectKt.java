package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: HdrOffSelect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOffSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOffSelect", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrOffSelect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrOffSelectKt {
    private static ImageVector _hdrOffSelect;

    public static final ImageVector getHdrOffSelect(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hdrOffSelect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrOffSelect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(18.0f, 18.5f, -1.0f);
        pathBuilderE.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.horizontalLineTo(14.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(4.31f);
        pathBuilderE.curveToRelative(0.0f, 0.38f, 0.31f, 0.69f, 0.69f, 0.69f);
        pathBuilderE.horizontalLineToRelative(0.11f);
        pathBuilderE.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        androidx.appcompat.app.m.u(pathBuilderE, 20.0f, 1.1f, 0.72f, 1.59f);
        pathBuilderE.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        pathBuilderE.horizontalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilderE.lineTo(17.1f, 19.9f);
        pathBuilderE.curveTo(17.6f, 19.6f, 18.0f, 19.1f, 18.0f, 18.5f);
        b.r(pathBuilderE, 16.5f, 18.5f, -2.0f, -1.0f);
        a.b.m(pathBuilderE, 2.0f, 18.5f, 3.5f, 18.0f);
        pathBuilderE.horizontalLineToRelative(-2.0f);
        pathBuilderE.verticalLineToRelative(-1.25f);
        pathBuilderE.curveTo(1.5f, 16.34f, 1.16f, 16.0f, 0.75f, 16.0f);
        pathBuilderE.horizontalLineToRelative(0.0f);
        pathBuilderE.curveTo(0.34f, 16.0f, 0.0f, 16.34f, 0.0f, 16.75f);
        pathBuilderE.verticalLineToRelative(4.5f);
        pathBuilderE.curveTo(0.0f, 21.66f, 0.34f, 22.0f, 0.75f, 22.0f);
        pathBuilderE.horizontalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        v.r(pathBuilderE, 19.5f, 2.0f, 1.75f);
        pathBuilderE.curveTo(3.5f, 21.66f, 3.84f, 22.0f, 4.25f, 22.0f);
        pathBuilderE.horizontalLineToRelative(0.0f);
        pathBuilderE.curveTo(4.66f, 22.0f, 5.0f, 21.66f, 5.0f, 21.25f);
        pathBuilderE.verticalLineToRelative(-4.5f);
        pathBuilderE.curveTo(5.0f, 16.34f, 4.66f, 16.0f, 4.25f, 16.0f);
        pathBuilderE.horizontalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        a.y(pathBuilderE, 18.0f, 10.0f, 16.0f, 7.5f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderE.horizontalLineTo(10.0f);
        pathBuilderE.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderE.verticalLineToRelative(-3.0f);
        pathBuilderE.curveTo(11.5f, 16.67f, 10.82f, 16.0f, 10.0f, 16.0f);
        androidx.browser.browseractions.a.q(pathBuilderE, 10.0f, 20.5f, 8.0f, -3.0f);
        a.b.m(pathBuilderE, 2.0f, 20.5f, 23.25f, 20.0f);
        pathBuilderE.horizontalLineTo(22.0f);
        pathBuilderE.verticalLineToRelative(1.25f);
        pathBuilderE.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderE.lineToRelative(0.0f, 0.0f);
        pathBuilderE.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderE.verticalLineTo(20.0f);
        pathBuilderE.horizontalLineToRelative(-1.25f);
        pathBuilderE.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderE.lineToRelative(0.0f, 0.0f);
        pathBuilderE.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderE.horizontalLineToRelative(1.25f);
        pathBuilderE.verticalLineToRelative(-1.25f);
        pathBuilderE.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderE.lineToRelative(0.0f, 0.0f);
        pathBuilderE.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderE.verticalLineToRelative(1.25f);
        pathBuilderE.horizontalLineToRelative(1.25f);
        pathBuilderE.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderE.lineToRelative(0.0f, 0.0f);
        pathBuilderE.curveTo(24.0f, 19.66f, 23.66f, 20.0f, 23.25f, 20.0f);
        a.t(pathBuilderE, 10.98f, 4.15f, 9.42f, 2.59f);
        pathBuilderE.curveToRelative(5.1f, -2.42f, 10.41f, 2.89f, 7.99f, 7.99f);
        pathBuilderE.lineToRelative(-1.56f, -1.56f);
        pathBuilderE.curveTo(16.66f, 6.06f, 13.94f, 3.34f, 10.98f, 4.15f);
        a.t(pathBuilderE, 5.63f, 3.05f, 5.63f, 3.05f);
        pathBuilderE.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderE.lineToRelative(0.96f, 0.96f);
        pathBuilderE.curveToRelative(-2.42f, 5.1f, 2.88f, 10.41f, 7.99f, 7.99f);
        pathBuilderE.lineToRelative(0.95f, 0.95f);
        pathBuilderE.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderE.lineToRelative(0.0f, 0.0f);
        pathBuilderE.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderE.lineToRelative(-9.9f, -9.91f);
        pathBuilderE.curveTo(6.66f, 2.66f, 6.02f, 2.66f, 5.63f, 3.05f);
        androidx.browser.browseractions.a.y(pathBuilderE, 8.15f, 6.98f, 4.87f, 4.87f);
        pathBuilderE.curveTo(10.06f, 12.66f, 7.34f, 9.94f, 8.15f, 6.98f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOffSelect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
