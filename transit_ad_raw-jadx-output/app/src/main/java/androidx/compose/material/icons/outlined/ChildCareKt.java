package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ChildCare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_childCare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChildCare", "Landroidx/compose/material/icons/Icons$Outlined;", "getChildCare", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChildCareKt {
    private static ImageVector _childCare;

    public static final ImageVector getChildCare(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _childCare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ChildCare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(14.5f, 10.5f, -1.25f, 0.0f);
        pathBuilderB.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilderB.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(9.5f, 10.5f, -1.25f, 0.0f);
        pathBuilderB2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilderB2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.94f, 11.34f);
        pathBuilderD.curveToRelative(-0.25f, -1.51f, -1.36f, -2.74f, -2.81f, -3.17f);
        pathBuilderD.curveToRelative(-0.53f, -1.12f, -1.28f, -2.1f, -2.19f, -2.91f);
        pathBuilderD.curveTo(16.36f, 3.85f, 14.28f, 3.0f, 12.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(-4.36f, 0.85f, -5.94f, 2.26f);
        pathBuilderD.curveToRelative(-0.92f, 0.81f, -1.67f, 1.8f, -2.19f, 2.91f);
        pathBuilderD.curveToRelative(-1.45f, 0.43f, -2.56f, 1.65f, -2.81f, 3.17f);
        pathBuilderD.curveToRelative(-0.04f, 0.21f, -0.06f, 0.43f, -0.06f, 0.66f);
        pathBuilderD.curveToRelative(0.0f, 0.23f, 0.02f, 0.45f, 0.06f, 0.66f);
        pathBuilderD.curveToRelative(0.25f, 1.51f, 1.36f, 2.74f, 2.81f, 3.17f);
        pathBuilderD.curveToRelative(0.52f, 1.11f, 1.27f, 2.09f, 2.17f, 2.89f);
        pathBuilderD.curveTo(7.62f, 20.14f, 9.71f, 21.0f, 12.0f, 21.0f);
        pathBuilderD.reflectiveCurveToRelative(4.38f, -0.86f, 5.97f, -2.28f);
        pathBuilderD.curveToRelative(0.9f, -0.8f, 1.65f, -1.79f, 2.17f, -2.89f);
        pathBuilderD.curveToRelative(1.44f, -0.43f, 2.55f, -1.65f, 2.8f, -3.17f);
        pathBuilderD.curveToRelative(0.04f, -0.21f, 0.06f, -0.43f, 0.06f, -0.66f);
        pathBuilderD.curveToRelative(0.0f, -0.23f, -0.02f, -0.45f, -0.06f, -0.66f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 14.0f);
        pathBuilderD.curveToRelative(-0.1f, 0.0f, -0.19f, -0.02f, -0.29f, -0.03f);
        pathBuilderD.curveToRelative(-0.2f, 0.67f, -0.49f, 1.29f, -0.86f, 1.86f);
        pathBuilderD.curveTo(16.6f, 17.74f, 14.45f, 19.0f, 12.0f, 19.0f);
        pathBuilderD.reflectiveCurveToRelative(-4.6f, -1.26f, -5.85f, -3.17f);
        pathBuilderD.curveToRelative(-0.37f, -0.57f, -0.66f, -1.19f, -0.86f, -1.86f);
        pathBuilderD.curveToRelative(-0.1f, 0.01f, -0.19f, 0.03f, -0.29f, 0.03f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.1f, 0.0f, 0.19f, 0.02f, 0.29f, 0.03f);
        pathBuilderD.curveToRelative(0.2f, -0.67f, 0.49f, -1.29f, 0.86f, -1.86f);
        pathBuilderD.curveTo(7.4f, 6.26f, 9.55f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(4.6f, 1.26f, 5.85f, 3.17f);
        pathBuilderD.curveToRelative(0.37f, 0.57f, 0.66f, 1.19f, 0.86f, 1.86f);
        pathBuilderD.curveToRelative(0.1f, -0.01f, 0.19f, -0.03f, 0.29f, -0.03f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 17.0f);
        pathBuilderD.curveToRelative(2.01f, 0.0f, 3.74f, -1.23f, 4.5f, -3.0f);
        pathBuilderD.horizontalLineToRelative(-9.0f);
        pathBuilderD.curveToRelative(0.76f, 1.77f, 2.49f, 3.0f, 4.5f, 3.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _childCare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
