package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HdrOffSelect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOffSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOffSelect", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHdrOffSelect", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrOffSelectKt {
    private static ImageVector _hdrOffSelect;

    public static final ImageVector getHdrOffSelect(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _hdrOffSelect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HdrOffSelect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(18.0f, 18.5f, -1.0f);
        pathBuilderE.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        a.B(pathBuilderE, 13.0f, 6.0f, 1.5f, -2.0f);
        androidx.compose.animation.a.C(pathBuilderE, 1.1f, 0.9f, 2.0f, 18.0f);
        pathBuilderE.lineToRelative(-0.9f, -2.1f);
        pathBuilderE.curveTo(17.6f, 19.6f, 18.0f, 19.1f, 18.0f, 18.5f);
        b.r(pathBuilderE, 16.5f, 18.5f, -2.0f, -1.0f);
        a.b.m(pathBuilderE, 2.0f, 18.5f, 3.5f, 18.0f);
        androidx.appcompat.app.m.x(pathBuilderE, -2.0f, -2.0f, 0.0f, 6.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderE, 1.5f, -2.5f, 2.0f, 22.0f);
        pathBuilderE.horizontalLineTo(5.0f);
        pathBuilderE.verticalLineToRelative(-6.0f);
        pathBuilderE.horizontalLineTo(3.5f);
        pathBuilderE.verticalLineTo(18.0f);
        pathBuilderE.close();
        a.b.z(pathBuilderE, 10.0f, 16.0f, 6.5f, 6.0f);
        pathBuilderE.horizontalLineTo(10.0f);
        pathBuilderE.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        pathBuilderE.verticalLineToRelative(-3.0f);
        pathBuilderE.curveTo(11.5f, 16.7f, 10.8f, 16.0f, 10.0f, 16.0f);
        a.q(pathBuilderE, 10.0f, 20.5f, 8.0f, -3.0f);
        a.b.m(pathBuilderE, 2.0f, 20.5f, 24.0f, 20.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderE, -2.0f, 2.0f, -1.5f, -2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderE, -2.0f, -1.5f, 2.0f, -2.0f);
        v.B(pathBuilderE, 22.0f, 2.0f, 2.0f, 20.0f);
        pathBuilderE.moveTo(10.98f, 4.15f);
        pathBuilderE.lineTo(9.42f, 2.59f);
        pathBuilderE.curveToRelative(5.1f, -2.42f, 10.41f, 2.89f, 7.99f, 7.99f);
        pathBuilderE.lineToRelative(-1.56f, -1.56f);
        pathBuilderE.curveTo(16.66f, 6.06f, 13.94f, 3.34f, 10.98f, 4.15f);
        androidx.compose.animation.a.t(pathBuilderE, 6.34f, 2.34f, 4.93f, 3.76f);
        pathBuilderE.lineToRelative(1.66f, 1.66f);
        pathBuilderE.curveToRelative(-2.42f, 5.1f, 2.89f, 10.41f, 7.99f, 7.99f);
        pathBuilderE.lineToRelative(1.66f, 1.66f);
        s.r(pathBuilderE, 1.41f, -1.41f, 6.34f, 2.34f);
        pathBuilderE.moveTo(8.15f, 6.98f);
        pathBuilderE.lineToRelative(4.87f, 4.87f);
        pathBuilderE.curveTo(10.06f, 12.66f, 7.34f, 9.94f, 8.15f, 6.98f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOffSelect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
