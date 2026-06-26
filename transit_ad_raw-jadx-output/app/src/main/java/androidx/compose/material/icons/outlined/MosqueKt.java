package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Mosque.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mosque", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Mosque", "Landroidx/compose/material/icons/Icons$Outlined;", "getMosque", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Mosque", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(24.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        v.r(pathBuilderD, 13.0f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.95f, -0.66f, -1.74f, -1.55f, -1.94f);
        pathBuilderD.curveTo(17.79f, 8.48f, 18.0f, 7.81f, 18.0f, 7.09f);
        pathBuilderD.curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f);
        pathBuilderD.lineTo(12.0f, 1.0f);
        pathBuilderD.lineTo(7.74f, 3.84f);
        pathBuilderD.curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f);
        pathBuilderD.curveToRelative(0.0f, 0.72f, 0.21f, 1.39f, 0.55f, 1.96f);
        pathBuilderD.curveTo(5.66f, 9.26f, 5.0f, 10.05f, 5.0f, 11.0f);
        i.c(pathBuilderD, 2.0f, 3.0f, 8.72f);
        pathBuilderD.curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        v.r(pathBuilderD, 21.0f, 10.0f, -4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        s.l(pathBuilderD, 4.0f, 10.0f, 8.72f);
        pathBuilderD.curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f);
        androidx.compose.animation.a.t(pathBuilderD, 8.85f, 5.5f, 12.0f, 3.4f);
        pathBuilderD.lineToRelative(3.15f, 2.1f);
        pathBuilderD.curveTo(15.68f, 5.86f, 16.0f, 6.45f, 16.0f, 7.09f);
        pathBuilderD.curveTo(16.0f, 8.14f, 15.14f, 9.0f, 14.09f, 9.0f);
        pathBuilderD.horizontalLineTo(9.91f);
        pathBuilderD.curveTo(8.86f, 9.0f, 8.0f, 8.14f, 8.0f, 7.09f);
        pathBuilderD.curveTo(8.0f, 6.45f, 8.32f, 5.86f, 8.85f, 5.5f);
        b.r(pathBuilderD, 21.0f, 19.0f, -6.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        a.b.x(pathBuilderD, 2.0f, 3.0f, -4.0f, 4.0f);
        a.l(pathBuilderD, -4.0f, 10.0f, 4.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mosque = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
