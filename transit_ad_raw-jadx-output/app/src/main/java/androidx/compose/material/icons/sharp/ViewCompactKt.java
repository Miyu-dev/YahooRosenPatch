package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.v;
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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ViewCompact.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_viewCompact", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewCompact", "Landroidx/compose/material/icons/Icons$Sharp;", "getViewCompact", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ViewCompactKt {
    private static ImageVector _viewCompact;

    public static final ImageVector getViewCompact(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _viewCompact;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ViewCompact", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(4.0f, 18.0f, 2.5f, -2.5f, 4.0f);
        a.B(pathBuilderI, 18.0f, 4.0f, 13.25f, 2.5f);
        d.f(pathBuilderI, -2.5f, 4.0f, 13.25f);
        androidx.browser.browseractions.a.A(pathBuilderI, 4.0f, 8.5f, 2.5f, 6.0f);
        b.B(pathBuilderI, 4.0f, 8.5f, 17.5f, 6.0f);
        pathBuilderI.verticalLineToRelative(2.5f);
        pathBuilderI.horizontalLineTo(20.0f);
        pathBuilderI.verticalLineTo(6.0f);
        pathBuilderI.horizontalLineTo(17.5f);
        pathBuilderI.close();
        androidx.browser.browseractions.a.A(pathBuilderI, 13.0f, 8.5f, 2.5f, 6.0f);
        b.B(pathBuilderI, 13.0f, 8.5f, 17.5f, 18.0f);
        v.B(pathBuilderI, 20.0f, -2.5f, -2.5f, 18.0f);
        b.z(pathBuilderI, 17.5f, 13.25f, 20.0f, -2.5f);
        b.m(pathBuilderI, -2.5f, 13.25f, 8.5f, 18.0f);
        pathBuilderI.horizontalLineTo(11.0f);
        pathBuilderI.verticalLineToRelative(-2.5f);
        pathBuilderI.horizontalLineTo(8.5f);
        pathBuilderI.verticalLineTo(18.0f);
        pathBuilderI.close();
        a.x(pathBuilderI, 13.0f, 18.0f, 2.5f, -2.5f);
        b.B(pathBuilderI, 13.0f, 18.0f, 8.5f, 8.5f);
        pathBuilderI.horizontalLineTo(11.0f);
        pathBuilderI.verticalLineTo(6.0f);
        pathBuilderI.horizontalLineTo(8.5f);
        pathBuilderI.verticalLineTo(8.5f);
        pathBuilderI.close();
        a.x(pathBuilderI, 13.0f, 13.25f, 2.5f, -2.5f);
        b.B(pathBuilderI, 13.0f, 13.25f, 8.5f, 13.25f);
        pathBuilderI.horizontalLineTo(11.0f);
        pathBuilderI.verticalLineToRelative(-2.5f);
        pathBuilderI.horizontalLineTo(8.5f);
        pathBuilderI.verticalLineTo(13.25f);
        pathBuilderI.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderI.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewCompact = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
