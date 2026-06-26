package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Discount.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_discount", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Discount", "Landroidx/compose/material/icons/Icons$Outlined;", "getDiscount", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DiscountKt {
    private static ImageVector _discount;

    public static final ImageVector getDiscount(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _discount;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Discount", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(12.79f, 21.0f, 3.0f, 11.21f, 2.0f);
        pathBuilderB.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        pathBuilderB.lineToRelative(7.79f, 7.79f);
        pathBuilderB.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderB.lineToRelative(6.21f, -6.21f);
        pathBuilderB.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 12.79f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(11.38f, 17.41f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.9f, 0.59f, 1.41f, 0.59f);
        pathBuilderD.curveToRelative(0.51f, 0.0f, 1.02f, -0.2f, 1.41f, -0.59f);
        pathBuilderD.lineToRelative(6.21f, -6.21f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderD.lineToRelative(-7.79f, -7.79f);
        pathBuilderD.curveTo(12.25f, 0.21f, 11.74f, 0.0f, 11.21f, 0.0f);
        pathBuilderD.horizontalLineTo(5.0f);
        pathBuilderD.curveTo(3.9f, 0.0f, 3.0f, 0.9f, 3.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(6.21f);
        pathBuilderD.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 11.38f, 17.41f, 5.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(6.21f);
        pathBuilderD.lineTo(19.0f, 9.79f);
        pathBuilderD.lineTo(12.79f, 16.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.i(pathBuilderD, 5.0f, 8.21f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(7.25f, 4.25f, -1.25f, 0.0f);
        pathBuilderB2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilderB2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _discount = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
