package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ElectricRickshaw.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricRickshaw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricRickshaw", "Landroidx/compose/material/icons/Icons$Rounded;", "getElectricRickshaw", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricRickshawKt {
    private static ImageVector _electricRickshaw;

    public static final ImageVector getElectricRickshaw(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _electricRickshaw;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ElectricRickshaw", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
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
        a.w(pathBuilderN, 18.4f, 9.0f, 16.0f, 6.12f);
        androidx.appcompat.view.menu.a.z(pathBuilderN, 18.4f, 9.0f, 4.0f, 5.0f);
        android.support.v4.media.a.z(pathBuilderN, 3.0f, 4.0f, 3.0f, 6.0f);
        pathBuilderN.curveTo(3.0f, 5.45f, 3.45f, 5.0f, 4.0f, 5.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(6.0f, 15.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.reflectiveCurveTo(6.55f, 15.0f, 6.0f, 15.0f);
        androidx.appcompat.app.m.n(pathBuilderN, 9.0f, 13.0f, -2.0f, 2.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.a.i(pathBuilderN, 9.0f, 5.0f, 4.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        h.z(pathBuilderN, 7.0f, 9.0f, 20.0f, 15.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderN, 20.55f, 15.0f, 20.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.0f, 20.0f, 4.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(6.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, -4.0f, 0.0f, 0.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricRickshaw = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
