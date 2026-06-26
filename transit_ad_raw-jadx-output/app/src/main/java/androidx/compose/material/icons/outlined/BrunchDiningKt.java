package androidx.compose.material.icons.outlined;

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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BrunchDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brunchDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrunchDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getBrunchDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrunchDiningKt {
    private static ImageVector _brunchDining;

    public static final ImageVector getBrunchDining(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _brunchDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BrunchDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(2.0f, 21.5f);
        pathBuilderD.curveTo(2.0f, 21.78f, 2.22f, 22.0f, 2.49f, 22.0f);
        pathBuilderD.horizontalLineToRelative(13.02f);
        pathBuilderD.curveToRelative(0.27f, 0.0f, 0.49f, -0.22f, 0.49f, -0.5f);
        pathBuilderD.verticalLineTo(20.0f);
        pathBuilderD.horizontalLineTo(2.0f);
        pathBuilderD.verticalLineTo(21.5f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = e.b(15.5f, 16.0f, 11.0f, -2.0f, 7.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.horizontalLineTo(2.5f);
        pathBuilderB.curveTo(2.22f, 16.0f, 2.0f, 16.22f, 2.0f, 16.5f);
        v.r(pathBuilderB, 18.0f, 14.0f, -1.5f);
        pathBuilderB.curveTo(16.0f, 16.22f, 15.78f, 16.0f, 15.5f, 16.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(20.47f, 15.45f);
        pathBuilderD2.curveToRelative(0.99f, -1.07f, 1.53f, -2.48f, 1.53f, -3.94f);
        v.r(pathBuilderD2, 2.0f, -6.0f, 9.47f);
        pathBuilderD2.curveToRelative(0.0f, 1.48f, 0.58f, 2.92f, 1.6f, 4.0f);
        s.D(pathBuilderD2, 0.4f, 0.42f, 22.0f, 4.0f);
        android.support.v4.media.a.m(pathBuilderD2, -2.0f, -2.0f, -4.03f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 20.47f, 15.45f, 18.0f, 4.0f);
        androidx.compose.animation.a.B(pathBuilderD2, 2.0f, 4.0f, -2.0f, 4.0f);
        pathBuilderD2.moveTo(19.03f, 14.07f);
        pathBuilderD2.curveToRelative(-0.65f, -0.71f, -1.03f, -1.65f, -1.03f, -2.6f);
        v.r(pathBuilderD2, 10.0f, 2.0f, 1.51f);
        pathBuilderD2.curveTo(20.0f, 12.46f, 19.66f, 13.36f, 19.03f, 14.07f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brunchDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
