package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Apartment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_apartment", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Apartment", "Landroidx/compose/material/icons/Icons$Rounded;", "getApartment", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ApartmentKt {
    private static ImageVector _apartment;

    public static final ImageVector getApartment(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _apartment;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Apartment", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(17.0f, 11.0f, 5.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderN.horizontalLineTo(9.0f);
        pathBuilderN.curveTo(7.9f, 3.0f, 7.0f, 3.9f, 7.0f, 5.0f);
        pathBuilderN.verticalLineToRelative(2.0f);
        pathBuilderN.horizontalLineTo(5.0f);
        pathBuilderN.curveTo(3.9f, 7.0f, 3.0f, 7.9f, 3.0f, 9.0f);
        pathBuilderN.verticalLineToRelative(10.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderN.horizontalLineToRelative(5.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.m(pathBuilderN, -3.0f, 2.0f, 3.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(5.0f);
        pathBuilderN.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderN.verticalLineToRelative(-6.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.r(pathBuilderN, 17.0f, 7.0f, 19.0f, 5.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderN, -2.0f, 2.0f, 19.0f);
        b.z(pathBuilderN, 7.0f, 15.0f, 5.0f, -2.0f);
        b.m(pathBuilderN, 2.0f, 15.0f, 7.0f, 11.0f);
        h.x(pathBuilderN, 5.0f, 9.0f, 2.0f, 11.0f);
        b.z(pathBuilderN, 11.0f, 15.0f, 9.0f, -2.0f);
        b.m(pathBuilderN, 2.0f, 15.0f, 11.0f, 11.0f);
        h.x(pathBuilderN, 9.0f, 9.0f, 2.0f, 11.0f);
        a.B(pathBuilderN, 11.0f, 7.0f, 9.0f, 5.0f);
        b.m(pathBuilderN, 2.0f, 7.0f, 15.0f, 15.0f);
        androidx.compose.animation.a.B(pathBuilderN, -2.0f, -2.0f, 2.0f, 15.0f);
        androidx.browser.browseractions.a.A(pathBuilderN, 15.0f, 11.0f, -2.0f, 9.0f);
        b.m(pathBuilderN, 2.0f, 11.0f, 15.0f, 7.0f);
        v.w(pathBuilderN, -2.0f, 5.0f, 2.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderN, 19.0f, 19.0f, -2.0f, -2.0f);
        b.m(pathBuilderN, 2.0f, 19.0f, 19.0f, 15.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderN, -2.0f, -2.0f, 2.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _apartment = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
