package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Cyclone.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cyclone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cyclone", "Landroidx/compose/material/icons/Icons$Rounded;", "getCyclone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CycloneKt {
    private static ImageVector _cyclone;

    public static final ImageVector getCyclone(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _cyclone;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cyclone", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 8.0f);
        pathBuilderD.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 14.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.0f, 6.11f, 22.0f, 6.11f);
        pathBuilderA.curveToRelative(0.0f, -0.46f, -0.3f, -0.86f, -0.74f, -0.97f);
        pathBuilderA.curveTo(19.23f, 4.6f, 16.03f, 4.0f, 12.0f, 4.0f);
        pathBuilderA.curveTo(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f);
        pathBuilderA.curveToRelative(0.1f, -0.65f, 0.28f, -1.69f, 0.62f, -2.96f);
        pathBuilderA.curveTo(7.25f, 2.64f, 6.78f, 2.0f, 6.11f, 2.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveTo(5.66f, 2.0f, 5.26f, 2.3f, 5.14f, 2.74f);
        pathBuilderA.curveTo(4.6f, 4.77f, 4.0f, 7.97f, 4.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f);
        pathBuilderA.curveToRelative(-0.65f, -0.1f, -1.69f, -0.28f, -2.96f, -0.62f);
        pathBuilderA.curveTo(2.64f, 16.75f, 2.0f, 17.22f, 2.0f, 17.89f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f);
        pathBuilderA.curveTo(4.77f, 19.4f, 7.97f, 20.0f, 12.0f, 20.0f);
        pathBuilderA.curveToRelative(2.15f, 0.0f, 4.11f, -0.86f, 5.54f, -2.24f);
        pathBuilderA.curveToRelative(-0.1f, 0.65f, -0.28f, 1.69f, -0.62f, 2.96f);
        pathBuilderA.curveToRelative(-0.17f, 0.64f, 0.3f, 1.28f, 0.97f, 1.28f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.46f, 0.0f, 0.86f, -0.3f, 0.97f, -0.74f);
        pathBuilderA.curveTo(19.4f, 19.23f, 20.0f, 16.03f, 20.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f);
        pathBuilderA.curveToRelative(0.65f, 0.1f, 1.69f, 0.28f, 2.96f, 0.62f);
        pathBuilderA.curveTo(21.36f, 7.25f, 22.0f, 6.78f, 22.0f, 6.11f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 18.0f);
        pathBuilderA.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 15.31f, 18.0f, 12.0f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cyclone = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
