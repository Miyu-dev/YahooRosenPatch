package androidx.compose.material.icons.outlined;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KebabDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_kebabDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KebabDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getKebabDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KebabDiningKt {
    private static ImageVector _kebabDining;

    public static final ImageVector getKebabDining(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _kebabDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.KebabDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(17.75f, 7.0f, 0.75f);
        pathBuilderB.curveTo(19.88f, 7.0f, 21.0f, 5.88f, 21.0f, 4.5f);
        pathBuilderB.curveTo(21.0f, 3.12f, 19.88f, 2.0f, 18.5f, 2.0f);
        androidx.appcompat.app.m.w(pathBuilderB, -0.75f, 1.0f, -1.5f, 1.0f);
        pathBuilderB.horizontalLineTo(15.5f);
        pathBuilderB.curveTo(14.12f, 2.0f, 13.0f, 3.12f, 13.0f, 4.5f);
        pathBuilderB.curveTo(13.0f, 5.88f, 14.12f, 7.0f, 15.5f, 7.0f);
        androidx.appcompat.app.m.x(pathBuilderB, 0.75f, 1.0f, 13.0f, 5.0f);
        v.t(pathBuilderB, 3.25f, 1.0f, 15.5f);
        pathBuilderB.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilderB.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        a.t(pathBuilderB, 0.75f, 4.0f, 1.5f, -4.0f);
        pathBuilderB.horizontalLineToRelative(0.75f);
        pathBuilderB.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderB.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        android.support.v4.media.a.z(pathBuilderB, -0.75f, -1.0f, 21.0f, 8.0f);
        b.m(pathBuilderB, -3.25f, 7.0f, 15.5f, 5.0f);
        pathBuilderB.curveTo(15.22f, 5.0f, 15.0f, 4.78f, 15.0f, 4.5f);
        pathBuilderB.reflectiveCurveTo(15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilderB.horizontalLineToRelative(3.0f);
        pathBuilderB.curveTo(18.78f, 4.0f, 19.0f, 4.22f, 19.0f, 4.5f);
        pathBuilderB.reflectiveCurveTo(18.78f, 5.0f, 18.5f, 5.0f);
        androidx.compose.animation.b.w(pathBuilderB, 15.5f, 18.5f, 16.0f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderB.reflectiveCurveTo(18.78f, 17.0f, 18.5f, 17.0f);
        pathBuilderB.horizontalLineToRelative(-3.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        androidx.browser.browseractions.a.r(pathBuilderB, 18.5f, 19.0f, 10.0f, 1.0f);
        s.q(pathBuilderB, -4.0f, -1.0f, 19.0f);
        pathBuilderB.moveTo(7.75f, 7.0f);
        pathBuilderB.horizontalLineTo(8.5f);
        pathBuilderB.curveTo(9.88f, 7.0f, 11.0f, 5.88f, 11.0f, 4.5f);
        pathBuilderB.curveTo(11.0f, 3.12f, 9.88f, 2.0f, 8.5f, 2.0f);
        s.t(pathBuilderB, 7.75f, 1.0f, -1.5f, 1.0f);
        pathBuilderB.horizontalLineTo(5.5f);
        pathBuilderB.curveTo(4.12f, 2.0f, 3.0f, 3.12f, 3.0f, 4.5f);
        pathBuilderB.curveTo(3.0f, 5.88f, 4.12f, 7.0f, 5.5f, 7.0f);
        androidx.appcompat.app.m.x(pathBuilderB, 0.75f, 1.0f, 3.0f, 5.0f);
        v.t(pathBuilderB, 3.25f, 1.0f, 5.5f);
        pathBuilderB.curveTo(4.12f, 14.0f, 3.0f, 15.12f, 3.0f, 16.5f);
        pathBuilderB.curveTo(3.0f, 17.88f, 4.12f, 19.0f, 5.5f, 19.0f);
        a.t(pathBuilderB, 0.75f, 4.0f, 1.5f, -4.0f);
        pathBuilderB.horizontalLineTo(8.5f);
        pathBuilderB.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderB.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        c.b.e(pathBuilderB, 7.75f, -1.0f, 11.0f, 8.0f);
        b.B(pathBuilderB, 7.75f, 7.0f, 5.5f, 5.0f);
        pathBuilderB.curveTo(5.22f, 5.0f, 5.0f, 4.78f, 5.0f, 4.5f);
        pathBuilderB.reflectiveCurveTo(5.22f, 4.0f, 5.5f, 4.0f);
        pathBuilderB.horizontalLineToRelative(3.0f);
        pathBuilderB.curveTo(8.78f, 4.0f, 9.0f, 4.22f, 9.0f, 4.5f);
        pathBuilderB.reflectiveCurveTo(8.78f, 5.0f, 8.5f, 5.0f);
        androidx.compose.animation.b.w(pathBuilderB, 5.5f, 8.5f, 16.0f);
        pathBuilderB.curveTo(8.78f, 16.0f, 9.0f, 16.22f, 9.0f, 16.5f);
        pathBuilderB.reflectiveCurveTo(8.78f, 17.0f, 8.5f, 17.0f);
        pathBuilderB.horizontalLineToRelative(-3.0f);
        pathBuilderB.curveTo(5.22f, 17.0f, 5.0f, 16.78f, 5.0f, 16.5f);
        pathBuilderB.reflectiveCurveTo(5.22f, 16.0f, 5.5f, 16.0f);
        androidx.browser.browseractions.a.r(pathBuilderB, 8.5f, 9.0f, 10.0f, 1.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.verticalLineToRelative(-1.0f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kebabDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
