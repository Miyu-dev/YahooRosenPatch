package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: ReduceCapacity.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_reduceCapacity", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReduceCapacity", "Landroidx/compose/material/icons/Icons$Filled;", "getReduceCapacity", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ReduceCapacityKt {
    private static ImageVector _reduceCapacity;

    public static final ImageVector getReduceCapacity(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _reduceCapacity;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ReduceCapacity", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(16.0f, 5.1f, 16.0f, 4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.78f, 7.58f);
        pathBuilderD.curveTo(19.93f, 7.21f, 18.99f, 7.0f, 18.0f, 7.0f);
        pathBuilderD.curveToRelative(-0.67f, 0.0f, -1.31f, 0.1f, -1.92f, 0.28f);
        pathBuilderD.curveTo(16.66f, 7.83f, 17.0f, 8.6f, 17.0f, 9.43f);
        h.w(pathBuilderD, 10.0f, 5.0f, 9.43f);
        pathBuilderD.curveTo(22.0f, 8.62f, 21.52f, 7.9f, 20.78f, 7.58f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.0f, 6.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(7.1f, 2.0f, 6.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveTo(4.9f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.92f, 7.28f);
        pathBuilderD.curveTo(7.31f, 7.1f, 6.67f, 7.0f, 6.0f, 7.0f);
        pathBuilderD.curveTo(5.01f, 7.0f, 4.07f, 7.21f, 3.22f, 7.58f);
        pathBuilderD.curveTo(2.48f, 7.9f, 2.0f, 8.62f, 2.0f, 9.43f);
        h.w(pathBuilderD, 10.0f, 5.0f, 9.43f);
        pathBuilderD.curveTo(7.0f, 8.6f, 7.34f, 7.83f, 7.92f, 7.28f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(10.0f, 5.1f, 10.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderD, 16.0f, 10.0f, 8.0f, 9.43f);
        pathBuilderD.curveTo(8.0f, 8.62f, 8.48f, 7.9f, 9.22f, 7.58f);
        pathBuilderD.curveTo(10.07f, 7.21f, 11.01f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilderD.curveTo(15.52f, 7.9f, 16.0f, 8.62f, 16.0f, 9.43f);
        android.support.v4.media.a.y(pathBuilderD, 10.0f, 15.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(15.0f, 17.1f, 15.0f, 16.0f);
        b.r(pathBuilderD, 21.0f, 22.0f, -8.0f, -0.57f);
        pathBuilderD.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilderD.curveTo(15.07f, 19.21f, 16.01f, 19.0f, 17.0f, 19.0f);
        pathBuilderD.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilderD.curveTo(20.52f, 19.9f, 21.0f, 20.62f, 21.0f, 21.43f);
        android.support.v4.media.a.y(pathBuilderD, 22.0f, 5.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(5.0f, 17.1f, 5.0f, 16.0f);
        a.q(pathBuilderD, 11.0f, 22.0f, 3.0f, -0.57f);
        pathBuilderD.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilderD.curveTo(5.07f, 19.21f, 6.01f, 19.0f, 7.0f, 19.0f);
        pathBuilderD.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilderD.curveTo(10.52f, 19.9f, 11.0f, 20.62f, 11.0f, 21.43f);
        b.l(pathBuilderD, 22.0f, 12.75f, 13.0f, -2.0f);
        v.t(pathBuilderD, -1.5f, 2.0f, 9.0f);
        pathBuilderD.lineToRelative(3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.k(pathBuilderD, 3.0f, -3.0f, 12.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reduceCapacity = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
