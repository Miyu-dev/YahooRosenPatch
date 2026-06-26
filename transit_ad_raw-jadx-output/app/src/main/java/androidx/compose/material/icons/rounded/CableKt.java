package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Cable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cable", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cable", "Landroidx/compose/material/icons/Icons$Rounded;", "getCable", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CableKt {
    private static ImageVector _cable;

    public static final ImageVector getCable(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _cable;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cable", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(20.0f, 5.0f, 4.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(-2.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(1.0f);
        pathBuilderN.horizontalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(3.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(1.0f);
        pathBuilderN.lineToRelative(0.0f, 6.91f);
        pathBuilderN.curveToRelative(0.0f, 1.04f, -0.76f, 1.98f, -1.79f, 2.08f);
        pathBuilderN.curveTo(14.01f, 19.11f, 13.0f, 18.17f, 13.0f, 17.0f);
        pathBuilderN.lineToRelative(0.0f, -9.86f);
        pathBuilderN.curveToRelative(0.0f, -2.13f, -1.61f, -3.99f, -3.74f, -4.13f);
        pathBuilderN.curveTo(6.93f, 2.86f, 5.0f, 4.7f, 5.0f, 7.0f);
        pathBuilderN.verticalLineToRelative(7.0f);
        pathBuilderN.horizontalLineTo(4.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(3.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(0.0f);
        pathBuilderN.verticalLineToRelative(1.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(2.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-1.0f);
        pathBuilderN.horizontalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-3.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineTo(7.0f);
        pathBuilderN.lineToRelative(0.0f, -6.91f);
        pathBuilderN.curveToRelative(0.0f, -1.04f, 0.76f, -1.98f, 1.79f, -2.08f);
        pathBuilderN.curveTo(9.99f, 4.89f, 11.0f, 5.83f, 11.0f, 7.0f);
        pathBuilderN.lineToRelative(0.0f, 9.86f);
        pathBuilderN.curveToRelative(0.0f, 2.13f, 1.61f, 3.99f, 3.74f, 4.13f);
        pathBuilderN.curveTo(17.07f, 21.14f, 19.0f, 19.3f, 19.0f, 17.0f);
        pathBuilderN.verticalLineToRelative(-7.0f);
        pathBuilderN.horizontalLineToRelative(1.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineTo(6.0f);
        pathBuilderN.curveTo(21.0f, 5.45f, 20.55f, 5.0f, 20.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderN, 20.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cable = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
