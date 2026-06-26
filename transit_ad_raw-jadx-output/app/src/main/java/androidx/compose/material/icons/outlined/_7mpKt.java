package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _7mp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__7mp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_7mp", "Landroidx/compose/material/icons/Icons$Outlined;", "get_7mp", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _7mpKt {
    private static ImageVector __7mp;

    public static final ImageVector get_7mp(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = __7mp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined._7mp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(7.5f, 14.0f, 1.0f, 3.0f, 10.0f);
        a.l(pathBuilderI, -3.0f, 1.0f, 4.5f, 1.5f);
        pathBuilderI.verticalLineToRelative(-5.0f);
        pathBuilderI.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderI.horizontalLineTo(7.0f);
        pathBuilderI.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderI, 5.0f, 1.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderG = androidx.appcompat.app.m.g(13.5f, 18.5f, 15.0f, 17.0f, 2.0f);
        pathBuilderG.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderG.verticalLineToRelative(-2.5f);
        pathBuilderG.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.m(pathBuilderG, -3.5f, 18.5f, 15.0f, 14.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.i(pathBuilderG, 1.5f, 1.5f, 15.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(19.0f, 3.0f, 5.0f);
        pathBuilderB.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderB, 19.0f, 19.0f, 5.0f, 5.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 14.0f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderS = h.s(11.25f, 11.5f, 13.0f, 1.46f, -4.71f);
        pathBuilderS.curveToRelative(0.19f, -0.64f, -0.29f, -1.29f, -0.96f, -1.29f);
        c.a.i(pathBuilderS, 10.0f, 7.0f, 2.62f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderS, 11.25f, 11.5f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __7mp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
