package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Satellite.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_satellite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Satellite", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSatellite", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SatelliteKt {
    private static ImageVector _satellite;

    public static final ImageVector getSatellite(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _satellite;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Satellite", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(5.0f, 19.0f, 14.0f, 19.0f, 5.0f);
        b.k(pathBuilderC, 5.0f, 5.0f, 14.0f);
        pathBuilderC.moveTo(6.0f, 6.0f);
        pathBuilderC.horizontalLineToRelative(2.57f);
        pathBuilderC.curveToRelative(0.0f, 1.42f, -1.15f, 2.58f, -2.57f, 2.58f);
        a.z(pathBuilderC, 6.0f, 6.0f, 6.0f, 10.29f);
        pathBuilderC.curveToRelative(2.37f, 0.0f, 4.28f, -1.93f, 4.28f, -4.29f);
        pathBuilderC.lineTo(12.0f, 6.0f);
        pathBuilderC.curveToRelative(0.0f, 3.31f, -2.68f, 6.0f, -6.0f, 6.0f);
        android.support.v4.media.a.v(pathBuilderC, -1.71f, 9.0f, 13.15f);
        pathBuilderC.lineToRelative(2.14f, 2.58f);
        pathBuilderC.lineToRelative(3.0f, -3.86f);
        pathBuilderC.lineTo(18.0f, 17.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderC, 6.0f, 17.0f, 3.0f, -3.85f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(21.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA, 19.0f, 19.0f, 5.0f, 19.0f);
        s.w(pathBuilderA, 5.0f, 5.0f, 14.0f, 14.0f);
        pathBuilderA.moveTo(8.57f, 6.0f);
        pathBuilderA.lineTo(6.0f, 6.0f);
        pathBuilderA.verticalLineToRelative(2.58f);
        pathBuilderA.curveToRelative(1.42f, 0.0f, 2.57f, -1.16f, 2.57f, -2.58f);
        androidx.compose.animation.a.j(pathBuilderA, 12.0f, 6.0f, -1.72f);
        pathBuilderA.curveToRelative(0.0f, 2.36f, -1.91f, 4.29f, -4.28f, 4.29f);
        pathBuilderA.lineTo(6.0f, 12.0f);
        pathBuilderA.curveToRelative(3.32f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 14.14f, 11.86f, -3.0f, 3.87f);
        pathBuilderA.lineTo(9.0f, 13.15f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderA, 6.0f, 17.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satellite = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
