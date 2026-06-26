package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Museum.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_museum", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Museum", "Landroidx/compose/material/icons/Icons$Rounded;", "getMuseum", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MuseumKt {
    private static ImageVector _museum;

    public static final ImageVector getMuseum(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _museum;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Museum", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.5f, 11.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD.verticalLineTo(9.26f);
        pathBuilderD.curveToRelative(0.0f, -0.16f, -0.08f, -0.32f, -0.21f, -0.41f);
        pathBuilderD.lineTo(12.57f, 2.4f);
        pathBuilderD.curveToRelative(-0.34f, -0.24f, -0.8f, -0.24f, -1.15f, 0.0f);
        pathBuilderD.lineTo(2.21f, 8.85f);
        pathBuilderD.curveTo(2.08f, 8.94f, 2.0f, 9.1f, 2.0f, 9.26f);
        pathBuilderD.verticalLineToRelative(1.24f);
        pathBuilderD.curveTo(2.0f, 10.78f, 2.22f, 11.0f, 2.5f, 11.0f);
        b.r(pathBuilderD, 4.0f, 9.0f, 3.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(18.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        s.q(pathBuilderD, -1.0f, -9.0f, 21.5f);
        pathBuilderD.moveTo(16.0f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.lineToRelative(-1.17f, 1.75f);
        pathBuilderD.curveToRelative(-0.4f, 0.59f, -1.27f, 0.59f, -1.66f, 0.0f);
        pathBuilderD.lineTo(10.0f, 14.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-4.7f);
        pathBuilderD.curveTo(8.0f, 11.58f, 8.58f, 11.0f, 9.3f, 11.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.43f, 0.0f, 0.84f, 0.22f, 1.08f, 0.58f);
        pathBuilderD.lineTo(12.0f, 14.0f);
        pathBuilderD.lineToRelative(1.61f, -2.42f);
        pathBuilderD.curveTo(13.86f, 11.22f, 14.26f, 11.0f, 14.7f, 11.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.72f, 0.0f, 1.3f, 0.58f, 1.3f, 1.3f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _museum = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
