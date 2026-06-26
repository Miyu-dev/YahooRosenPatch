package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Anchor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_anchor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Anchor", "Landroidx/compose/material/icons/Icons$Rounded;", "getAnchor", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AnchorKt {
    private static ImageVector _anchor;

    public static final ImageVector getAnchor(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _anchor;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Anchor", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(13.0f, 9.0f, 7.82f);
        pathBuilderN.curveTo(14.16f, 7.4f, 15.0f, 6.3f, 15.0f, 5.0f);
        pathBuilderN.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderN.reflectiveCurveTo(9.0f, 3.35f, 9.0f, 5.0f);
        pathBuilderN.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        pathBuilderN.verticalLineTo(9.0f);
        pathBuilderN.horizontalLineTo(9.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(2.0f);
        pathBuilderN.verticalLineToRelative(8.92f);
        pathBuilderN.curveToRelative(-2.22f, -0.33f, -4.59f, -1.68f, -5.55f, -3.37f);
        pathBuilderN.lineToRelative(1.14f, -1.14f);
        pathBuilderN.curveToRelative(0.22f, -0.22f, 0.19f, -0.57f, -0.05f, -0.75f);
        pathBuilderN.lineTo(3.8f, 12.6f);
        pathBuilderN.curveTo(3.47f, 12.35f, 3.0f, 12.59f, 3.0f, 13.0f);
        pathBuilderN.verticalLineToRelative(2.0f);
        pathBuilderN.curveToRelative(0.0f, 3.88f, 4.92f, 7.0f, 9.0f, 7.0f);
        pathBuilderN.reflectiveCurveToRelative(9.0f, -3.12f, 9.0f, -7.0f);
        pathBuilderN.verticalLineToRelative(-2.0f);
        pathBuilderN.curveToRelative(0.0f, -0.41f, -0.47f, -0.65f, -0.8f, -0.4f);
        pathBuilderN.lineToRelative(-2.74f, 2.05f);
        pathBuilderN.curveToRelative(-0.24f, 0.18f, -0.27f, 0.54f, -0.05f, 0.75f);
        pathBuilderN.lineToRelative(1.14f, 1.14f);
        pathBuilderN.curveToRelative(-0.96f, 1.69f, -3.33f, 3.04f, -5.55f, 3.37f);
        pathBuilderN.verticalLineTo(11.0f);
        pathBuilderN.horizontalLineToRelative(2.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.w(pathBuilderN, 13.0f, 12.0f, 4.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderN, 11.45f, 4.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _anchor = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
