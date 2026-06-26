package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: Celebration.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_celebration", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Celebration", "Landroidx/compose/material/icons/Icons$Outlined;", "getCelebration", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CelebrationKt {
    private static ImageVector _celebration;

    public static final ImageVector getCelebration(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _celebration;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Celebration", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(2.0f, 22.0f, 14.0f, -5.0f);
        a.C(pathBuilderA, 7.0f, 8.0f, 2.0f, 22.0f);
        pathBuilderA.moveTo(12.35f, 16.18f);
        pathBuilderA.lineTo(5.3f, 18.7f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 2.52f, -7.05f, 12.35f, 16.18f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(14.53f, 12.53f, 5.59f, -5.59f);
        pathBuilderA2.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderA2.lineToRelative(0.59f, 0.59f);
        pathBuilderA2.lineToRelative(1.06f, -1.06f);
        pathBuilderA2.lineToRelative(-0.59f, -0.59f);
        pathBuilderA2.curveToRelative(-1.07f, -1.07f, -2.82f, -1.07f, -3.89f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA2, -5.59f, 5.59f, 14.53f, 12.53f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = a.b.a(10.06f, 6.88f, 9.47f, 7.47f);
        pathBuilderA3.lineToRelative(1.06f, 1.06f);
        pathBuilderA3.lineToRelative(0.59f, -0.59f);
        pathBuilderA3.curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0.0f, -3.89f);
        pathBuilderA3.lineToRelative(-0.59f, -0.59f);
        pathBuilderA3.lineTo(9.47f, 4.53f);
        pathBuilderA3.lineToRelative(0.59f, 0.59f);
        pathBuilderA3.curveTo(10.54f, 5.6f, 10.54f, 6.4f, 10.06f, 6.88f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA4 = b.a(17.06f, 11.88f, -1.59f, 1.59f);
        pathBuilderA4.lineToRelative(1.06f, 1.06f);
        pathBuilderA4.lineToRelative(1.59f, -1.59f);
        pathBuilderA4.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderA4.lineToRelative(1.61f, 1.61f);
        pathBuilderA4.lineToRelative(1.06f, -1.06f);
        pathBuilderA4.lineToRelative(-1.61f, -1.61f);
        pathBuilderA4.curveTo(19.87f, 10.81f, 18.13f, 10.81f, 17.06f, 11.88f);
        pathBuilderA4.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA5 = b.a(15.06f, 5.88f, -3.59f, 3.59f);
        pathBuilderA5.lineToRelative(1.06f, 1.06f);
        pathBuilderA5.lineToRelative(3.59f, -3.59f);
        pathBuilderA5.curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0.0f, -3.89f);
        pathBuilderA5.lineToRelative(-1.59f, -1.59f);
        pathBuilderA5.lineToRelative(-1.06f, 1.06f);
        pathBuilderA5.lineToRelative(1.59f, 1.59f);
        pathBuilderA5.curveTo(15.54f, 4.6f, 15.54f, 5.4f, 15.06f, 5.88f);
        pathBuilderA5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _celebration = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
