package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: SignLanguage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signLanguage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignLanguage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSignLanguage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignLanguageKt {
    private static ImageVector _signLanguage;

    public static final ImageVector getSignLanguage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _signLanguage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SignLanguage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(14.0f, 13.2f, 15.0f, -2.0f, 7.0f);
        pathBuilderC.horizontalLineToRelative(4.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.verticalLineToRelative(-4.53f);
        pathBuilderC.curveToRelative(0.0f, -0.27f, -0.11f, -0.54f, -0.31f, -0.73f);
        a.z(pathBuilderC, 14.0f, 13.2f, 15.38f, 9.0f);
        pathBuilderC.lineToRelative(1.93f, -1.87f);
        pathBuilderC.lineToRelative(1.38f, 1.45f);
        pathBuilderC.lineTo(20.0f, 7.34f);
        pathBuilderC.verticalLineToRelative(3.7f);
        pathBuilderC.curveToRelative(0.0f, 0.28f, -0.11f, 0.54f, -0.31f, 0.73f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderC, -0.7f, 0.66f, 15.38f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.49f, 13.0f, -0.93f, -1.86f);
        pathBuilderA.curveToRelative(-0.37f, -0.74f, -0.07f, -1.64f, 0.67f, -2.01f);
        pathBuilderA.lineTo(12.49f, 9.0f);
        pathBuilderA.lineToRelative(5.73f, 5.46f);
        pathBuilderA.curveToRelative(0.5f, 0.47f, 0.78f, 1.13f, 0.78f, 1.81f);
        pathBuilderA.verticalLineToRelative(5.23f);
        pathBuilderA.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilderA.horizontalLineToRelative(-11.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        a.b.r(pathBuilderA, 10.0f, -1.0f, 4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.t(pathBuilderA, 6.0f, -1.0f, 3.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.t(pathBuilderA, 7.0f, -1.0f, 4.5f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.s(pathBuilderA, 12.49f, 14.0f, 13.2f, 15.0f);
        android.support.v4.media.a.s(pathBuilderA, -2.0f, 7.0f, 4.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-4.53f);
        pathBuilderA.curveToRelative(0.0f, -0.27f, -0.11f, -0.54f, -0.31f, -0.73f);
        a.z(pathBuilderA, 14.0f, 13.2f, 11.78f, 7.12f);
        pathBuilderA.curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f);
        pathBuilderA.lineToRelative(-2.7f, -2.85f);
        pathBuilderA.curveToRelative(-0.38f, -0.4f, -0.36f, -1.03f, 0.04f, -1.41f);
        pathBuilderA.curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f);
        a.z(pathBuilderA, 11.78f, 7.12f, 9.64f, 9.21f);
        pathBuilderA.curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11.0f);
        pathBuilderA.horizontalLineTo(8.58f);
        pathBuilderA.lineTo(6.31f, 8.61f);
        pathBuilderA.curveTo(5.93f, 8.21f, 5.94f, 7.58f, 6.35f, 7.2f);
        pathBuilderA.curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f);
        a.z(pathBuilderA, 9.64f, 9.21f, 20.33f, 13.91f);
        pathBuilderA.lineToRelative(0.88f, -0.83f);
        pathBuilderA.curveToRelative(0.5f, -0.47f, 0.79f, -1.13f, 0.79f, -1.82f);
        pathBuilderA.verticalLineTo(3.35f);
        pathBuilderA.lineToRelative(-0.27f, -0.1f);
        pathBuilderA.curveToRelative(-0.78f, -0.28f, -1.64f, 0.12f, -1.92f, 0.9f);
        pathBuilderA.lineTo(19.1f, 6.11f);
        pathBuilderA.lineToRelative(-5.5f, -5.8f);
        pathBuilderA.curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f);
        pathBuilderA.curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f);
        pathBuilderA.lineToRelative(3.79f, 3.99f);
        pathBuilderA.lineToRelative(-0.73f, 0.69f);
        pathBuilderA.lineToRelative(-4.82f, -5.08f);
        pathBuilderA.curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f);
        pathBuilderA.curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f);
        pathBuilderA.lineToRelative(3.78f, 3.98f);
        pathBuilderA.lineTo(15.38f, 9.0f);
        pathBuilderA.lineToRelative(1.93f, -1.87f);
        pathBuilderA.lineToRelative(1.38f, 1.45f);
        pathBuilderA.lineTo(20.0f, 7.34f);
        pathBuilderA.verticalLineToRelative(3.7f);
        pathBuilderA.curveToRelative(0.0f, 0.28f, -0.11f, 0.54f, -0.31f, 0.73f);
        pathBuilderA.lineToRelative(-0.7f, 0.66f);
        pathBuilderA.lineToRelative(0.61f, 0.58f);
        pathBuilderA.curveTo(19.89f, 13.28f, 20.13f, 13.58f, 20.33f, 13.91f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signLanguage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
