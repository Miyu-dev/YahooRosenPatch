package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Agriculture.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_agriculture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Agriculture", "Landroidx/compose/material/icons/Icons$Outlined;", "getAgriculture", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AgricultureKt {
    private static ImageVector _agriculture;

    public static final ImageVector getAgriculture(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _agriculture;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Agriculture", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(4.0f, 9.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveTo(3.45f, 7.0f, 3.0f, 7.45f, 3.0f, 8.0f);
        pathBuilderB.curveTo(3.0f, 8.55f, 3.45f, 9.0f, 4.0f, 9.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(22.0f, 14.06f, 8.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderN.horizontalLineToRelative(-6.29f);
        pathBuilderN.lineToRelative(-1.06f, -1.06f);
        pathBuilderN.lineToRelative(1.41f, -1.41f);
        pathBuilderN.lineToRelative(-0.71f, -0.71f);
        pathBuilderN.lineTo(9.82f, 6.35f);
        pathBuilderN.lineToRelative(0.71f, 0.71f);
        pathBuilderN.lineToRelative(1.41f, -1.41f);
        pathBuilderN.lineTo(13.0f, 6.71f);
        pathBuilderN.verticalLineTo(9.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderN.horizontalLineTo(8.96f);
        pathBuilderN.curveToRelative(-0.22f, -0.16f, -0.45f, -0.3f, -0.69f, -0.43f);
        pathBuilderN.lineToRelative(-0.4f, 0.89f);
        pathBuilderN.lineToRelative(-0.46f, -0.21f);
        pathBuilderN.lineToRelative(0.4f, -0.9f);
        pathBuilderN.curveTo(7.26f, 10.13f, 6.64f, 10.0f, 6.0f, 10.0f);
        pathBuilderN.curveToRelative(-0.53f, 0.0f, -1.04f, 0.11f, -1.52f, 0.26f);
        pathBuilderN.lineToRelative(0.34f, 0.91f);
        pathBuilderN.lineToRelative(-0.47f, 0.18f);
        pathBuilderN.lineTo(4.0f, 10.42f);
        pathBuilderN.curveToRelative(-1.06f, 0.46f, -1.91f, 1.28f, -2.43f, 2.31f);
        pathBuilderN.lineToRelative(0.89f, 0.4f);
        pathBuilderN.lineToRelative(-0.21f, 0.46f);
        pathBuilderN.lineToRelative(-0.9f, -0.4f);
        pathBuilderN.curveTo(1.13f, 13.74f, 1.0f, 14.36f, 1.0f, 15.0f);
        pathBuilderN.curveToRelative(0.0f, 0.53f, 0.11f, 1.04f, 0.26f, 1.52f);
        pathBuilderN.lineToRelative(0.91f, -0.34f);
        pathBuilderN.lineToRelative(0.18f, 0.47f);
        pathBuilderN.lineTo(1.42f, 17.0f);
        pathBuilderN.curveToRelative(0.46f, 1.06f, 1.28f, 1.91f, 2.31f, 2.43f);
        pathBuilderN.lineToRelative(0.4f, -0.89f);
        pathBuilderN.lineToRelative(0.46f, 0.21f);
        pathBuilderN.lineToRelative(-0.4f, 0.9f);
        pathBuilderN.curveTo(4.74f, 19.87f, 5.36f, 20.0f, 6.0f, 20.0f);
        pathBuilderN.curveToRelative(0.53f, 0.0f, 1.04f, -0.11f, 1.52f, -0.26f);
        pathBuilderN.lineToRelative(-0.34f, -0.91f);
        pathBuilderN.lineToRelative(0.47f, -0.18f);
        pathBuilderN.lineTo(8.0f, 19.58f);
        pathBuilderN.curveToRelative(1.06f, -0.46f, 1.91f, -1.28f, 2.43f, -2.31f);
        pathBuilderN.lineToRelative(-0.89f, -0.4f);
        pathBuilderN.lineToRelative(0.21f, -0.46f);
        pathBuilderN.lineToRelative(0.9f, 0.4f);
        pathBuilderN.curveToRelative(0.1f, -0.26f, 0.18f, -0.54f, 0.24f, -0.82f);
        pathBuilderN.horizontalLineToRelative(5.16f);
        pathBuilderN.curveTo(16.03f, 16.16f, 16.0f, 16.33f, 16.0f, 16.5f);
        pathBuilderN.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilderN.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderN.curveTo(23.0f, 15.55f, 22.62f, 14.69f, 22.0f, 14.06f);
        pathBuilderN.close();
        pathBuilderN.moveTo(6.0f, 18.0f);
        pathBuilderN.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderN.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderN.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderN.reflectiveCurveTo(7.66f, 18.0f, 6.0f, 18.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(10.87f, 14.0f);
        pathBuilderN.curveToRelative(-0.04f, -0.18f, -0.08f, -0.35f, -0.13f, -0.52f);
        pathBuilderN.lineToRelative(-0.91f, 0.34f);
        pathBuilderN.lineToRelative(-0.18f, -0.47f);
        pathBuilderN.lineTo(10.58f, 13.0f);
        pathBuilderN.curveToRelative(0.0f, 0.0f, 0.42f, 0.0f, 0.42f, 0.0f);
        pathBuilderN.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        v.r(pathBuilderN, 8.0f, 5.0f, 5.05f);
        pathBuilderN.curveTo(19.84f, 13.03f, 19.67f, 13.0f, 19.5f, 13.0f);
        pathBuilderN.curveToRelative(-0.95f, 0.0f, -1.81f, 0.38f, -2.44f, 1.0f);
        b.w(pathBuilderN, 10.87f, 19.5f, 18.0f);
        pathBuilderN.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderN.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderN.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderN, 20.33f, 18.0f, 19.5f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _agriculture = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
