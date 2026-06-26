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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Gradient.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gradient", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Gradient", "Landroidx/compose/material/icons/Icons$Rounded;", "getGradient", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GradientKt {
    private static ImageVector _gradient;

    public static final ImageVector getGradient(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _gradient;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gradient", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(11.0f, 9.0f, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderF, 11.0f, 9.0f, 9.0f, 11.0f);
        android.support.v4.media.a.w(pathBuilderF, 2.0f, 2.0f, 9.0f, 13.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, -2.0f, 13.0f, 11.0f, 2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderF, 2.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 15.0f, 9.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderF, -2.0f, 15.0f, 9.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 7.0f, 9.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderF, 7.0f, 11.0f, 7.0f, 9.0f);
        pathBuilderF.moveTo(19.0f, 3.0f);
        pathBuilderF.lineTo(5.0f, 3.0f);
        pathBuilderF.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderF.verticalLineToRelative(14.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(14.0f);
        pathBuilderF.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderF.lineTo(21.0f, 5.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderF, 9.0f, 18.0f, 7.0f, 18.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderF, -2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 13.0f, 18.0f, -2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderF, 2.0f, 2.0f, 17.0f, 18.0f);
        b.A(pathBuilderF, -2.0f, -2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 19.0f, 11.0f, -2.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderF, 2.0f, 2.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderF, -2.0f, 2.0f, -2.0f, -2.0f);
        android.support.v4.media.a.w(pathBuilderF, -2.0f, 2.0f, 9.0f, 15.0f);
        v.y(pathBuilderF, -2.0f, 7.0f, 13.0f, 2.0f);
        b.s(pathBuilderF, 5.0f, 15.0f, -2.0f, 2.0f);
        pathBuilderF.verticalLineToRelative(-2.0f);
        pathBuilderF.lineTo(5.0f, 11.0f);
        pathBuilderF.lineTo(5.0f, 6.0f);
        pathBuilderF.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderF.horizontalLineToRelative(12.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderF, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gradient = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
