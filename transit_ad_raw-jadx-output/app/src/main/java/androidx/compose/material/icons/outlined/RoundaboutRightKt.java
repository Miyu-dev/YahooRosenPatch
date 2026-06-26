package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: RoundaboutRight.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_roundaboutRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RoundaboutRight", "Landroidx/compose/material/icons/Icons$Outlined;", "getRoundaboutRight", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RoundaboutRightKt {
    private static ImageVector _roundaboutRight;

    public static final ImageVector getRoundaboutRight(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _roundaboutRight;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RoundaboutRight", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.92f, 8.0f);
        pathBuilderD.curveTo(13.44f, 5.16f, 10.97f, 3.0f, 8.0f, 3.0f);
        pathBuilderD.curveTo(4.69f, 3.0f, 2.0f, 5.69f, 2.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, 2.97f, 2.16f, 5.44f, 5.0f, 5.92f);
        pathBuilderD.lineTo(7.0f, 21.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.lineToRelative(0.0f, -6.09f);
        pathBuilderD.curveToRelative(0.0f, -0.98f, -0.71f, -1.8f, -1.67f, -1.97f);
        pathBuilderD.curveTo(5.44f, 12.63f, 4.0f, 10.98f, 4.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderD.curveToRelative(1.98f, 0.0f, 3.63f, 1.44f, 3.94f, 3.33f);
        pathBuilderD.curveTo(12.11f, 9.29f, 12.93f, 10.0f, 13.91f, 10.0f);
        pathBuilderD.lineToRelative(4.26f, 0.0f);
        pathBuilderD.lineToRelative(-1.59f, 1.59f);
        pathBuilderD.lineTo(18.0f, 13.0f);
        pathBuilderD.lineToRelative(4.0f, -4.0f);
        pathBuilderD.lineToRelative(-4.0f, -4.0f);
        pathBuilderD.lineToRelative(-1.41f, 1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 18.17f, 8.0f, 13.92f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roundaboutRight = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
