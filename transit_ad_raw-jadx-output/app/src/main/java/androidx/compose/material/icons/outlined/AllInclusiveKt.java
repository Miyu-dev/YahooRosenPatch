package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: AllInclusive.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_allInclusive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AllInclusive", "Landroidx/compose/material/icons/Icons$Outlined;", "getAllInclusive", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AllInclusiveKt {
    private static ImageVector _allInclusive;

    public static final ImageVector getAllInclusive(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _allInclusive;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AllInclusive", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.6f, 6.62f);
        pathBuilderD.curveToRelative(-1.44f, 0.0f, -2.8f, 0.56f, -3.77f, 1.53f);
        pathBuilderD.lineTo(7.8f, 14.39f);
        pathBuilderD.curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f);
        pathBuilderD.curveToRelative(-1.87f, 0.0f, -3.39f, -1.51f, -3.39f, -3.38f);
        pathBuilderD.reflectiveCurveTo(3.53f, 8.62f, 5.4f, 8.62f);
        pathBuilderD.curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        pathBuilderD.lineToRelative(1.13f, 1.0f);
        pathBuilderD.lineToRelative(1.51f, -1.34f);
        pathBuilderD.lineTo(9.22f, 8.2f);
        pathBuilderD.curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        pathBuilderD.curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f);
        pathBuilderD.curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        pathBuilderD.lineToRelative(7.03f, -6.24f);
        pathBuilderD.curveToRelative(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f);
        pathBuilderD.curveToRelative(1.87f, 0.0f, 3.39f, 1.51f, 3.39f, 3.38f);
        pathBuilderD.reflectiveCurveToRelative(-1.52f, 3.38f, -3.39f, 3.38f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        pathBuilderD.lineToRelative(-1.14f, -1.01f);
        pathBuilderD.lineToRelative(-1.51f, 1.34f);
        pathBuilderD.lineToRelative(1.27f, 1.12f);
        pathBuilderD.curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        pathBuilderD.curveToRelative(2.98f, 0.0f, 5.4f, -2.41f, 5.4f, -5.38f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -2.42f, -5.37f, -5.4f, -5.37f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInclusive = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
