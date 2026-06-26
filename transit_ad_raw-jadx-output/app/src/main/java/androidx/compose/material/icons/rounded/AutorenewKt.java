package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Autorenew.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autorenew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Autorenew", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutorenew", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutorenewKt {
    private static ImageVector _autorenew;

    public static final ImageVector getAutorenew(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _autorenew;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Autorenew", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(12.0f, 6.0f, 1.79f);
        pathBuilderE.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderE.lineToRelative(2.79f, -2.79f);
        pathBuilderE.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilderE.lineToRelative(-2.79f, -2.79f);
        pathBuilderE.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        pathBuilderE.lineTo(12.0f, 4.0f);
        pathBuilderE.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderE.curveToRelative(0.0f, 1.04f, 0.2f, 2.04f, 0.57f, 2.95f);
        pathBuilderE.curveToRelative(0.27f, 0.67f, 1.13f, 0.85f, 1.64f, 0.34f);
        pathBuilderE.curveToRelative(0.27f, -0.27f, 0.38f, -0.68f, 0.23f, -1.04f);
        pathBuilderE.curveTo(6.15f, 13.56f, 6.0f, 12.79f, 6.0f, 12.0f);
        pathBuilderE.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(17.79f, 8.71f);
        pathBuilderE.curveToRelative(-0.27f, 0.27f, -0.38f, 0.69f, -0.23f, 1.04f);
        pathBuilderE.curveToRelative(0.28f, 0.7f, 0.44f, 1.46f, 0.44f, 2.25f);
        pathBuilderE.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilderE.verticalLineToRelative(-1.79f);
        pathBuilderE.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderE.lineToRelative(-2.79f, 2.79f);
        pathBuilderE.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderE.lineToRelative(2.79f, 2.79f);
        pathBuilderE.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        pathBuilderE.lineTo(12.0f, 20.0f);
        pathBuilderE.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilderE.curveToRelative(0.0f, -1.04f, -0.2f, -2.04f, -0.57f, -2.95f);
        pathBuilderE.curveToRelative(-0.27f, -0.67f, -1.13f, -0.85f, -1.64f, -0.34f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autorenew = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
