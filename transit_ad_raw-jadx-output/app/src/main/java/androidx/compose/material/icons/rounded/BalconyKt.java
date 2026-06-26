package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Balcony.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_balcony", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Balcony", "Landroidx/compose/material/icons/Icons$Rounded;", "getBalcony", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BalconyKt {
    private static ImageVector _balcony;

    public static final ImageVector getBalcony(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _balcony;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Balcony", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(20.0f, 14.27f, 10.0f);
        pathBuilderN.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilderN.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderN.verticalLineToRelative(4.27f);
        pathBuilderN.curveTo(3.4f, 14.61f, 3.0f, 15.26f, 3.0f, 16.0f);
        pathBuilderN.verticalLineToRelative(4.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderN.horizontalLineToRelative(14.0f);
        pathBuilderN.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderN.verticalLineToRelative(-4.0f);
        pathBuilderN.curveTo(21.0f, 15.26f, 20.6f, 14.61f, 20.0f, 14.27f);
        a.q(pathBuilderN, 7.0f, 20.0f, 5.0f, -4.0f);
        b.m(pathBuilderN, 2.0f, 20.0f, 11.0f, 20.0f);
        v.B(pathBuilderN, 9.0f, -4.0f, 2.0f, 20.0f);
        b.z(pathBuilderN, 11.0f, 14.0f, 6.0f, -4.0f);
        pathBuilderN.curveToRelative(0.0f, -2.97f, 2.16f, -5.44f, 5.0f, -5.92f);
        android.support.v4.media.a.y(pathBuilderN, 14.0f, 13.0f, 4.08f);
        pathBuilderN.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.92f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderN, 4.0f, -5.0f, 4.08f);
        androidx.appcompat.view.menu.a.x(pathBuilderN, 15.0f, 20.0f, -2.0f, -4.0f);
        b.m(pathBuilderN, 2.0f, 20.0f, 19.0f, 20.0f);
        androidx.compose.animation.a.B(pathBuilderN, -2.0f, -4.0f, 2.0f, 20.0f);
        pathBuilderN.moveTo(8.0f, 11.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveTo(8.0f, 11.55f, 8.0f, 11.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(16.0f, 11.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderN, 16.0f, 10.45f, 16.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balcony = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
