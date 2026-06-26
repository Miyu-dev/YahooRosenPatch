package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: AutoFixHigh.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoFixHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixHigh", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutoFixHigh", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoFixHighKt {
    private static ImageVector _autoFixHigh;

    public static final ImageVector getAutoFixHigh(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _autoFixHigh;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoFixHigh", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.45f, 6.0f, 0.49f, -1.06f);
        pathBuilderA.lineTo(22.0f, 4.45f);
        pathBuilderA.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA.lineToRelative(-1.06f, -0.49f);
        pathBuilderA.lineTo(20.45f, 2.0f);
        pathBuilderA.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilderA.lineToRelative(-0.49f, 1.06f);
        pathBuilderA.lineTo(18.0f, 3.55f);
        pathBuilderA.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA.lineToRelative(1.06f, 0.49f);
        pathBuilderA.lineTo(19.55f, 6.0f);
        pathBuilderA.curveTo(19.72f, 6.39f, 20.28f, 6.39f, 20.45f, 6.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(8.95f, 6.0f, 0.49f, -1.06f);
        pathBuilderA2.lineToRelative(1.06f, -0.49f);
        pathBuilderA2.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA2.lineTo(9.44f, 3.06f);
        pathBuilderA2.lineTo(8.95f, 2.0f);
        pathBuilderA2.curveTo(8.78f, 1.61f, 8.22f, 1.61f, 8.05f, 2.0f);
        pathBuilderA2.lineTo(7.56f, 3.06f);
        pathBuilderA2.lineTo(6.5f, 3.55f);
        pathBuilderA2.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA2.lineToRelative(1.06f, 0.49f);
        pathBuilderA2.lineTo(8.05f, 6.0f);
        pathBuilderA2.curveTo(8.22f, 6.39f, 8.78f, 6.39f, 8.95f, 6.0f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = b.a(19.55f, 13.5f, -0.49f, 1.06f);
        pathBuilderA3.lineTo(18.0f, 15.05f);
        pathBuilderA3.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA3.lineToRelative(1.06f, 0.49f);
        pathBuilderA3.lineToRelative(0.49f, 1.06f);
        pathBuilderA3.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilderA3.lineToRelative(0.49f, -1.06f);
        pathBuilderA3.lineTo(22.0f, 15.95f);
        pathBuilderA3.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA3.lineToRelative(-1.06f, -0.49f);
        pathBuilderA3.lineToRelative(-0.49f, -1.06f);
        pathBuilderA3.curveTo(20.28f, 13.11f, 19.72f, 13.11f, 19.55f, 13.5f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA4 = b.a(17.71f, 9.12f, -2.83f, -2.83f);
        pathBuilderA4.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA4.lineTo(2.29f, 17.46f);
        pathBuilderA4.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA4.lineToRelative(2.83f, 2.83f);
        pathBuilderA4.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA4.lineToRelative(11.17f, -11.17f);
        pathBuilderA4.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        a.y(pathBuilderA4, 14.21f, 11.21f, -1.41f, -1.41f);
        pathBuilderA4.lineToRelative(1.38f, -1.38f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA4, 1.41f, 1.41f, 14.21f, 11.21f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixHigh = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
