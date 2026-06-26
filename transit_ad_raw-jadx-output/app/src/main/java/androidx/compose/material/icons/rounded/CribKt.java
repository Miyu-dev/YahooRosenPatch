package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Crib.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_crib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Crib", "Landroidx/compose/material/icons/Icons$Rounded;", "getCrib", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Crib", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.32f, 18.32f);
        pathBuilderD.curveToRelative(-0.36f, -0.36f, -0.92f, -0.4f, -1.31f, -0.08f);
        pathBuilderD.curveToRelative(-0.32f, 0.25f, -0.65f, 0.48f, -1.0f, 0.69f);
        pathBuilderD.verticalLineTo(16.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-6.0f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineTo(8.0f);
        pathBuilderD.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilderD.verticalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.verticalLineToRelative(2.93f);
        pathBuilderD.curveToRelative(-0.35f, -0.2f, -0.69f, -0.43f, -1.0f, -0.69f);
        pathBuilderD.curveToRelative(-0.39f, -0.32f, -0.96f, -0.27f, -1.31f, 0.08f);
        pathBuilderD.curveToRelative(-0.42f, 0.42f, -0.39f, 1.12f, 0.08f, 1.5f);
        pathBuilderD.curveTo(7.47f, 21.18f, 9.64f, 22.0f, 12.0f, 22.0f);
        pathBuilderD.curveToRelative(2.36f, 0.0f, 4.53f, -0.82f, 6.24f, -2.18f);
        pathBuilderD.curveTo(18.71f, 19.44f, 18.74f, 18.74f, 18.32f, 18.32f);
        pathBuilderD.close();
        pathBuilderD.moveTo(14.0f, 19.75f);
        pathBuilderD.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.q(pathBuilderD, 16.0f, 4.0f, 19.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
