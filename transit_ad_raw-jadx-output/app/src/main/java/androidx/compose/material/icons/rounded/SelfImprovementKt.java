package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SelfImprovement.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_selfImprovement", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SelfImprovement", "Landroidx/compose/material/icons/Icons$Rounded;", "getSelfImprovement", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SelfImprovementKt {
    private static ImageVector _selfImprovement;

    public static final ImageVector getSelfImprovement(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _selfImprovement;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SelfImprovement", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 6.0f, -2.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.0f, 14.94f, 21.0f, 14.94f);
        pathBuilderA.curveToRelative(0.0f, -0.5f, -0.36f, -0.93f, -0.85f, -0.98f);
        pathBuilderA.curveToRelative(-1.88f, -0.21f, -3.49f, -1.13f, -4.75f, -2.63f);
        pathBuilderA.lineToRelative(-1.34f, -1.6f);
        pathBuilderA.curveTo(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f);
        pathBuilderA.horizontalLineToRelative(-1.05f);
        pathBuilderA.curveToRelative(-0.59f, 0.0f, -1.15f, 0.26f, -1.53f, 0.72f);
        pathBuilderA.lineToRelative(-1.34f, 1.6f);
        pathBuilderA.curveToRelative(-1.25f, 1.5f, -2.87f, 2.42f, -4.75f, 2.63f);
        pathBuilderA.curveTo(3.36f, 14.01f, 3.0f, 14.44f, 3.0f, 14.94f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.6f, 0.53f, 1.07f, 1.13f, 1.0f);
        pathBuilderA.curveToRelative(2.3f, -0.27f, 4.32f, -1.39f, 5.87f, -3.19f);
        pathBuilderA.verticalLineTo(15.0f);
        pathBuilderA.lineToRelative(-3.76f, 1.5f);
        pathBuilderA.curveToRelative(-0.65f, 0.26f, -1.16f, 0.83f, -1.23f, 1.53f);
        pathBuilderA.curveTo(4.91f, 19.1f, 5.74f, 20.0f, 6.79f, 20.0f);
        pathBuilderA.horizontalLineTo(9.0f);
        pathBuilderA.verticalLineToRelative(-0.5f);
        pathBuilderA.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderA.horizontalLineToRelative(3.0f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderA.reflectiveCurveTo(14.78f, 18.0f, 14.5f, 18.0f);
        pathBuilderA.horizontalLineToRelative(-3.0f);
        pathBuilderA.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderA.verticalLineTo(20.0f);
        pathBuilderA.lineToRelative(7.1f, 0.0f);
        pathBuilderA.curveToRelative(0.85f, 0.0f, 1.65f, -0.54f, 1.85f, -1.37f);
        pathBuilderA.curveToRelative(0.21f, -0.89f, -0.27f, -1.76f, -1.08f, -2.08f);
        pathBuilderA.lineTo(14.0f, 15.0f);
        pathBuilderA.verticalLineToRelative(-2.25f);
        pathBuilderA.curveToRelative(1.56f, 1.8f, 3.57f, 2.91f, 5.87f, 3.19f);
        pathBuilderA.curveTo(20.47f, 16.0f, 21.0f, 15.54f, 21.0f, 14.94f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _selfImprovement = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
