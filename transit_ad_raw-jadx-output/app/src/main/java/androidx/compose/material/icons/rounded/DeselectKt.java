package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Deselect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_deselect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Deselect", "Landroidx/compose/material/icons/Icons$Rounded;", "getDeselect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeselectKt {
    private static ImageVector _deselect;

    public static final ImageVector getDeselect(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _deselect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Deselect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(3.0f, 13.0f, 2.0f, -2.0f, 3.0f);
        a.B(pathBuilderI, 13.0f, 7.0f, 21.0f, 2.0f);
        d.f(pathBuilderI, -2.0f, 7.0f, 21.0f);
        a.x(pathBuilderI, 13.0f, 3.0f, -2.0f, 2.0f);
        b.m(pathBuilderI, 2.0f, 3.0f, 19.0f, 3.0f);
        pathBuilderI.verticalLineToRelative(2.0f);
        pathBuilderI.horizontalLineToRelative(2.0f);
        pathBuilderI.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderI, 5.0f, 21.0f, -2.0f, 3.0f);
        pathBuilderI.curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f);
        androidx.compose.animation.b.r(pathBuilderI, 3.0f, 17.0f, 2.0f, -2.0f);
        b.B(pathBuilderI, 3.0f, 17.0f, 11.0f, 21.0f);
        androidx.compose.animation.a.B(pathBuilderI, 2.0f, -2.0f, -2.0f, 21.0f);
        a.x(pathBuilderI, 19.0f, 13.0f, 2.0f, -2.0f);
        b.m(pathBuilderI, -2.0f, 13.0f, 19.0f, 9.0f);
        v.w(pathBuilderI, 2.0f, 7.0f, -2.0f, 9.0f);
        androidx.browser.browseractions.a.A(pathBuilderI, 15.0f, 5.0f, 2.0f, 3.0f);
        b.m(pathBuilderI, -2.0f, 5.0f, 7.83f, 5.0f);
        androidx.appcompat.app.m.r(pathBuilderI, 7.0f, 4.17f, 3.0f, 2.0f);
        h.z(pathBuilderI, 2.0f, 7.83f, 19.83f, 17.0f);
        androidx.appcompat.app.m.r(pathBuilderI, 19.0f, 16.17f, 15.0f, 2.0f);
        h.z(pathBuilderI, 2.0f, 19.83f, 9.0f, 15.0f);
        pathBuilderI.verticalLineToRelative(-3.17f);
        pathBuilderI.lineTo(12.17f, 15.0f);
        pathBuilderI.horizontalLineTo(9.0f);
        pathBuilderI.close();
        pathBuilderI.moveTo(2.1f, 3.51f);
        pathBuilderI.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        h.n(pathBuilderI, 4.17f, 7.0f, 3.0f, 2.0f);
        b.D(pathBuilderI, 2.0f, 7.83f, 2.0f, 2.0f);
        pathBuilderI.verticalLineTo(16.0f);
        pathBuilderI.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        androidx.compose.animation.a.C(pathBuilderI, 6.17f, 2.0f, 2.0f, 15.0f);
        android.support.v4.media.a.m(pathBuilderI, 2.0f, 2.0f, -1.17f);
        pathBuilderI.lineToRelative(2.07f, 2.07f);
        pathBuilderI.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderI.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderI.lineTo(3.51f, 3.51f);
        pathBuilderI.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        pathBuilderI.close();
        pathBuilderI.moveTo(17.0f, 8.0f);
        pathBuilderI.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        s.C(pathBuilderI, 9.83f, 2.0f, 2.0f, 15.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.b.d(pathBuilderI, 3.17f, 2.0f, 2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deselect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
