package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SatelliteAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_satelliteAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SatelliteAlt", "Landroidx/compose/material/icons/Icons$Filled;", "getSatelliteAlt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SatelliteAltKt {
    private static ImageVector _satelliteAlt;

    public static final ImageVector getSatelliteAlt(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _satelliteAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SatelliteAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.44f, 0.59f, -3.18f, 3.18f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.lineToRelative(-0.71f, 0.71f);
        pathBuilderA.lineTo(11.55f, 7.3f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderA.lineTo(7.3f, 8.72f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.lineToRelative(-0.71f, 0.71f);
        pathBuilderA.lineTo(6.6f, 12.25f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderA.lineToRelative(-3.18f, 3.18f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderA.lineToRelative(3.18f, -3.18f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineToRelative(-1.24f, -1.24f);
        pathBuilderA.lineToRelative(0.71f, -0.71f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineTo(13.84f, 9.6f);
        pathBuilderA.lineToRelative(0.71f, -0.71f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderA.lineToRelative(3.18f, -3.18f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineToRelative(-3.54f, -3.54f);
        pathBuilderA.curveTo(17.48f, -0.2f, 16.22f, -0.2f, 15.44f, 0.59f);
        a.y(pathBuilderA, 6.6f, 19.32f, -1.06f, 1.06f);
        pathBuilderA.lineTo(2.0f, 16.85f);
        s.r(pathBuilderA, 1.06f, -1.06f, 6.6f, 19.32f);
        pathBuilderA.moveTo(8.72f, 17.2f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(-3.54f, -3.54f);
        s.r(pathBuilderA, 1.06f, -1.06f, 8.72f, 17.2f);
        pathBuilderA.moveTo(18.26f, 7.66f);
        pathBuilderA.lineTo(17.2f, 8.72f);
        pathBuilderA.lineToRelative(-3.54f, -3.54f);
        s.r(pathBuilderA, 1.06f, -1.06f, 18.26f, 7.66f);
        pathBuilderA.moveTo(20.38f, 5.54f);
        pathBuilderA.lineTo(19.32f, 6.6f);
        pathBuilderA.lineToRelative(-3.54f, -3.54f);
        android.support.v4.media.a.C(pathBuilderA, 16.85f, 2.0f, 20.38f, 5.54f);
        pathBuilderA.moveTo(14.0f, 21.0f);
        pathBuilderA.lineToRelative(0.0f, 2.0f);
        pathBuilderA.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.curveTo(21.0f, 17.87f, 17.87f, 21.0f, 14.0f, 21.0f);
        a.y(pathBuilderA, 14.0f, 17.0f, 0.0f, 2.0f);
        pathBuilderA.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.curveTo(17.0f, 15.66f, 15.66f, 17.0f, 14.0f, 17.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satelliteAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
