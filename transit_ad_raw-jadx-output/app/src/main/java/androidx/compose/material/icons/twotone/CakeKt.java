package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Cake.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cake", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCake", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Cake", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.53f, 14.92f, -1.08f, 1.07f);
        pathBuilderA.curveToRelative(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0.0f);
        pathBuilderA.lineToRelative(-1.07f, -1.07f);
        pathBuilderA.lineToRelative(-1.09f, 1.07f);
        pathBuilderA.curveToRelative(-0.64f, 0.64f, -1.5f, 1.0f, -2.4f, 1.01f);
        a.m(pathBuilderA, 3.0f, 14.0f, -3.0f);
        pathBuilderA.curveToRelative(-0.9f, -0.01f, -1.76f, -0.37f, -2.4f, -1.01f);
        a.t(pathBuilderA, -1.07f, -1.07f, 18.0f, 11.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(3.5f);
        pathBuilderA.curveToRelative(0.51f, -0.01f, 0.99f, -0.21f, 1.34f, -0.57f);
        pathBuilderA.lineToRelative(2.14f, -2.13f);
        pathBuilderA.lineToRelative(2.13f, 2.13f);
        pathBuilderA.curveToRelative(0.74f, 0.74f, 2.03f, 0.74f, 2.77f, 0.0f);
        pathBuilderA.lineToRelative(2.14f, -2.13f);
        pathBuilderA.lineToRelative(2.13f, 2.13f);
        pathBuilderA.curveToRelative(0.36f, 0.36f, 0.84f, 0.56f, 1.35f, 0.57f);
        pathBuilderA.verticalLineTo(12.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
        pathBuilderD.lineTo(12.0f, 0.0f);
        pathBuilderD.lineToRelative(-1.71f, 2.97f);
        pathBuilderD.curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.compose.animation.a.j(pathBuilderD, 18.0f, 9.0f, -5.0f);
        androidx.compose.animation.a.o(pathBuilderD, 13.0f, 7.0f, -2.0f, 2.0f);
        pathBuilderD.lineTo(6.0f, 9.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.verticalLineToRelative(9.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        androidx.compose.animation.a.t(pathBuilderD, 19.0f, 20.0f, 5.0f, 20.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveToRelative(0.9f, -0.01f, 1.76f, -0.37f, 2.4f, -1.01f);
        pathBuilderD.lineToRelative(1.09f, -1.07f);
        pathBuilderD.lineToRelative(1.07f, 1.07f);
        pathBuilderD.curveToRelative(1.31f, 1.31f, 3.59f, 1.3f, 4.89f, 0.0f);
        pathBuilderD.lineToRelative(1.08f, -1.07f);
        pathBuilderD.lineToRelative(1.07f, 1.07f);
        pathBuilderD.curveToRelative(0.64f, 0.64f, 1.5f, 1.0f, 2.4f, 1.01f);
        a.v(pathBuilderD, 3.0f, 19.0f, 15.5f);
        pathBuilderD.curveToRelative(-0.51f, -0.01f, -0.99f, -0.2f, -1.35f, -0.57f);
        pathBuilderD.lineToRelative(-2.13f, -2.13f);
        pathBuilderD.lineToRelative(-2.14f, 2.13f);
        pathBuilderD.curveToRelative(-0.74f, 0.74f, -2.03f, 0.74f, -2.77f, 0.0f);
        pathBuilderD.lineTo(8.48f, 12.8f);
        pathBuilderD.lineToRelative(-2.14f, 2.13f);
        pathBuilderD.curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.34f, 0.57f);
        pathBuilderD.lineTo(5.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(12.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderD, 3.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cake = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
