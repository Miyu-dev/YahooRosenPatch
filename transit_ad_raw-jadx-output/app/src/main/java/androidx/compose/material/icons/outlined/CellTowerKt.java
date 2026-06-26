package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: CellTower.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellTower", "Landroidx/compose/material/icons/Icons$Outlined;", "getCellTower", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CellTowerKt {
    private static ImageVector _cellTower;

    public static final ImageVector getCellTower(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CellTower", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.3f, 14.7f, 1.2f, -1.2f);
        pathBuilderA.curveToRelative(-1.0f, -1.0f, -1.5f, -2.3f, -1.5f, -3.5f);
        pathBuilderA.curveToRelative(0.0f, -1.3f, 0.5f, -2.6f, 1.5f, -3.5f);
        pathBuilderA.lineTo(7.3f, 5.3f);
        pathBuilderA.curveToRelative(-1.3f, 1.3f, -2.0f, 3.0f, -2.0f, 4.7f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 6.0f, 13.4f, 7.3f, 14.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(19.1f, 2.9f, -1.2f, 1.2f);
        pathBuilderA2.curveToRelative(1.6f, 1.6f, 2.4f, 3.8f, 2.4f, 5.9f);
        pathBuilderA2.curveToRelative(0.0f, 2.1f, -0.8f, 4.3f, -2.4f, 5.9f);
        pathBuilderA2.lineToRelative(1.2f, 1.2f);
        pathBuilderA2.curveToRelative(2.0f, -2.0f, 2.9f, -4.5f, 2.9f, -7.1f);
        pathBuilderA2.curveTo(22.0f, 7.4f, 21.0f, 4.9f, 19.1f, 2.9f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = a.b.a(6.1f, 4.1f, 4.9f, 2.9f);
        pathBuilderA3.curveTo(3.0f, 4.9f, 2.0f, 7.4f, 2.0f, 10.0f);
        pathBuilderA3.curveToRelative(0.0f, 2.6f, 1.0f, 5.1f, 2.9f, 7.1f);
        pathBuilderA3.lineToRelative(1.2f, -1.2f);
        pathBuilderA3.curveToRelative(-1.6f, -1.6f, -2.4f, -3.8f, -2.4f, -5.9f);
        pathBuilderA3.curveTo(3.7f, 7.9f, 4.5f, 5.7f, 6.1f, 4.1f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.7f, 14.7f);
        pathBuilderD.curveToRelative(1.3f, -1.3f, 2.0f, -3.0f, 2.0f, -4.7f);
        pathBuilderD.curveToRelative(-0.1f, -1.7f, -0.7f, -3.4f, -2.0f, -4.7f);
        pathBuilderD.lineToRelative(-1.2f, 1.2f);
        pathBuilderD.curveToRelative(1.0f, 1.0f, 1.5f, 2.3f, 1.5f, 3.5f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, -0.5f, 2.6f, -1.5f, 3.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 16.7f, 14.7f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(14.5f, 10.0f);
        pathBuilderD2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD2.reflectiveCurveTo(9.5f, 8.62f, 9.5f, 10.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.76f, 0.34f, 1.42f, 0.87f, 1.88f);
        pathBuilderD2.lineTo(7.0f, 22.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderD2, 2.0f, 0.67f, -2.0f, 4.67f);
        pathBuilderD2.lineTo(15.0f, 22.0f);
        pathBuilderD2.horizontalLineToRelative(2.0f);
        pathBuilderD2.lineToRelative(-3.37f, -10.12f);
        pathBuilderD2.curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
        androidx.compose.animation.a.t(pathBuilderD2, 10.33f, 18.0f, 12.0f, 13.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.k(pathBuilderD2, 1.67f, 5.0f, 10.33f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellTower = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
