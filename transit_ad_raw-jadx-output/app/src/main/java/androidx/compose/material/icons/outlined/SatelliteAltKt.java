package androidx.compose.material.icons.outlined;

import a6.h;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_satelliteAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SatelliteAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getSatelliteAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SatelliteAltKt {
    private static ImageVector _satelliteAlt;

    public static final ImageVector getSatelliteAlt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _satelliteAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SatelliteAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.0f, 14.0f, 2.0f, 0.0f);
        pathBuilderA.curveToRelative(0.0f, 4.97f, -4.03f, 9.0f, -9.0f, 9.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.curveTo(17.87f, 21.0f, 21.0f, 17.87f, 21.0f, 14.0f);
        a.y(pathBuilderA, 14.0f, 17.0f, 0.0f, 2.0f);
        pathBuilderA.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.curveTo(17.0f, 15.66f, 15.66f, 17.0f, 14.0f, 17.0f);
        a.y(pathBuilderA, 18.26f, 0.59f, 3.54f, 3.54f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderA.lineToRelative(-3.18f, 3.18f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderA.lineToRelative(-1.24f, -1.24f);
        pathBuilderA.lineTo(13.84f, 9.6f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderA.lineTo(9.6f, 13.84f);
        pathBuilderA.lineToRelative(-0.71f, 0.71f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderA.lineTo(6.95f, 21.8f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderA.lineToRelative(-3.54f, -3.54f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineToRelative(3.18f, -3.18f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.lineToRelative(0.71f, -0.71f);
        pathBuilderA.lineTo(7.3f, 11.55f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineTo(8.72f, 7.3f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderA.lineToRelative(1.24f, 1.24f);
        pathBuilderA.lineToRelative(0.71f, -0.71f);
        pathBuilderA.lineTo(12.25f, 6.6f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineToRelative(3.18f, -3.18f);
        pathBuilderA.curveTo(16.22f, -0.2f, 17.48f, -0.2f, 18.26f, 0.59f);
        androidx.compose.animation.a.t(pathBuilderA, 3.06f, 15.79f, 2.0f, 16.85f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        s.r(pathBuilderA, 1.06f, -1.06f, 3.06f, 15.79f);
        pathBuilderA.moveTo(5.18f, 13.67f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        s.r(pathBuilderA, 1.06f, -1.06f, 5.18f, 13.67f);
        pathBuilderA.moveTo(10.13f, 8.72f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        s.r(pathBuilderA, 1.41f, -1.41f, 10.13f, 8.72f);
        pathBuilderA.moveTo(14.73f, 4.12f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        s.r(pathBuilderA, 1.06f, -1.06f, 14.73f, 4.12f);
        pathBuilderA.moveTo(16.85f, 2.0f);
        pathBuilderA.lineToRelative(-1.06f, 1.06f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.06f, -1.06f, 16.85f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satelliteAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
