package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ElectricRickshaw.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricRickshaw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricRickshaw", "Landroidx/compose/material/icons/Icons$TwoTone;", "getElectricRickshaw", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricRickshawKt {
    private static ImageVector _electricRickshaw;

    public static final ImageVector getElectricRickshaw(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _electricRickshaw;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ElectricRickshaw", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(3.0f, 13.0f, 0.17f);
        pathBuilderB.curveTo(3.58f, 11.84f, 4.7f, 11.0f, 6.0f, 11.0f);
        pathBuilderB.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        pathBuilderB.verticalLineTo(10.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.verticalLineTo(13.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(19.0f, 11.0f, -3.0f, 2.0f, 1.17f);
        pathBuilderF.curveToRelative(0.3f, -0.85f, 0.98f, -1.53f, 1.83f, -1.83f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderF, 11.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(21.0f, 11.18f, 9.72f);
        pathBuilderN.curveToRelative(0.0f, -0.47f, -0.16f, -0.92f, -0.46f, -1.28f);
        pathBuilderN.lineTo(16.6f, 3.72f);
        pathBuilderN.curveTo(16.22f, 3.26f, 15.66f, 3.0f, 15.06f, 3.0f);
        pathBuilderN.horizontalLineTo(3.0f);
        pathBuilderN.curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
        pathBuilderN.verticalLineToRelative(8.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderN.horizontalLineToRelative(0.18f);
        pathBuilderN.curveTo(3.6f, 16.16f, 4.7f, 17.0f, 6.0f, 17.0f);
        pathBuilderN.reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilderN.horizontalLineToRelative(8.37f);
        pathBuilderN.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilderN.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderN.curveTo(23.0f, 12.7f, 22.16f, 11.6f, 21.0f, 11.18f);
        pathBuilderN.close();
        pathBuilderN.moveTo(6.0f, 15.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.reflectiveCurveTo(6.55f, 15.0f, 6.0f, 15.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(7.0f, 11.17f);
        pathBuilderN.curveTo(6.69f, 11.06f, 6.35f, 11.0f, 6.0f, 11.0f);
        pathBuilderN.curveToRelative(-1.3f, 0.0f, -2.42f, 0.84f, -2.83f, 2.0f);
        v.B(pathBuilderN, 3.0f, -3.0f, 4.0f, 11.17f);
        android.support.v4.media.a.B(pathBuilderN, 7.0f, 8.0f, 3.0f, 5.0f);
        b.m(pathBuilderN, 4.0f, 8.0f, 14.0f, 13.0f);
        androidx.appcompat.graphics.drawable.a.i(pathBuilderN, 9.0f, -3.0f, 3.0f, 8.0f);
        h.x(pathBuilderN, 9.0f, 5.0f, 5.0f, 13.0f);
        pathBuilderN.moveTo(16.0f, 6.12f);
        pathBuilderN.lineTo(18.4f, 9.0f);
        pathBuilderN.horizontalLineTo(16.0f);
        pathBuilderN.verticalLineTo(6.12f);
        pathBuilderN.close();
        b.z(pathBuilderN, 17.17f, 13.0f, 16.0f, -2.0f);
        pathBuilderN.horizontalLineToRelative(3.0f);
        pathBuilderN.verticalLineToRelative(0.17f);
        pathBuilderN.curveTo(18.15f, 11.47f, 17.47f, 12.15f, 17.17f, 13.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(20.0f, 15.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderN, 20.55f, 15.0f, 20.0f, 15.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = androidx.compose.animation.b.a(7.0f, 20.0f, 4.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(6.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, -4.0f, 0.0f, 0.0f, 2.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricRickshaw = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
