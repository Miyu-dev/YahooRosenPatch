package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AutoFixHigh.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoFixHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixHigh", "Landroidx/compose/material/icons/Icons$Outlined;", "getAutoFixHigh", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoFixHighKt {
    private static ImageVector _autoFixHigh;

    public static final ImageVector getAutoFixHigh(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _autoFixHigh;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AutoFixHigh", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 7.0f, 0.94f, -2.06f);
        pathBuilderA.lineToRelative(2.06f, -0.94f);
        pathBuilderA.lineToRelative(-2.06f, -0.94f);
        pathBuilderA.lineToRelative(-0.94f, -2.06f);
        pathBuilderA.lineToRelative(-0.94f, 2.06f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, -2.06f, 0.94f, 2.06f, 0.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(8.5f, 7.0f, 0.94f, -2.06f);
        pathBuilderA2.lineToRelative(2.06f, -0.94f);
        pathBuilderA2.lineToRelative(-2.06f, -0.94f);
        pathBuilderA2.lineToRelative(-0.94f, -2.06f);
        pathBuilderA2.lineToRelative(-0.94f, 2.06f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA2, -2.06f, 0.94f, 2.06f, 0.94f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = b.a(20.0f, 12.5f, -0.94f, 2.06f);
        pathBuilderA3.lineToRelative(-2.06f, 0.94f);
        pathBuilderA3.lineToRelative(2.06f, 0.94f);
        pathBuilderA3.lineToRelative(0.94f, 2.06f);
        pathBuilderA3.lineToRelative(0.94f, -2.06f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA3, 2.06f, -0.94f, -2.06f, -0.94f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA4 = b.a(17.71f, 9.12f, -2.83f, -2.83f);
        pathBuilderA4.curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f);
        pathBuilderA4.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilderA4.lineTo(2.29f, 17.46f);
        pathBuilderA4.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA4.lineToRelative(2.83f, 2.83f);
        pathBuilderA4.curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f);
        pathBuilderA4.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        pathBuilderA4.lineToRelative(11.17f, -11.17f);
        pathBuilderA4.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        androidx.browser.browseractions.a.y(pathBuilderA4, 14.17f, 8.42f, 1.41f, 1.41f);
        pathBuilderA4.lineTo(14.41f, 11.0f);
        android.support.v4.media.a.C(pathBuilderA4, 13.0f, 9.59f, 14.17f, 8.42f);
        pathBuilderA4.moveTo(5.83f, 19.59f);
        pathBuilderA4.lineToRelative(-1.41f, -1.41f);
        pathBuilderA4.lineTo(11.59f, 11.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA4, 13.0f, 12.41f, 5.83f, 19.59f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixHigh = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
