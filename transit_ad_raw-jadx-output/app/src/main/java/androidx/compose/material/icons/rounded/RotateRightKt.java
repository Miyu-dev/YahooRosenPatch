package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: RotateRight.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotateRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateRight", "Landroidx/compose/material/icons/Icons$Rounded;", "getRotateRight", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RotateRightKt {
    private static ImageVector _rotateRight;

    public static final ImageVector getRotateRight(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rotateRight;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RotateRight", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.83f, 4.83f, 12.7f, 2.7f);
        pathBuilderA.curveToRelative(-0.62f, -0.62f, -1.7f, -0.18f, -1.7f, 0.71f);
        pathBuilderA.verticalLineToRelative(0.66f);
        pathBuilderA.curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 3.64f, 2.43f, 6.71f, 5.77f, 7.68f);
        pathBuilderA.curveToRelative(0.62f, 0.18f, 1.23f, -0.32f, 1.23f, -0.96f);
        pathBuilderA.verticalLineToRelative(-0.03f);
        pathBuilderA.curveToRelative(0.0f, -0.43f, -0.27f, -0.82f, -0.68f, -0.94f);
        pathBuilderA.curveTo(7.82f, 17.03f, 6.0f, 14.73f, 6.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        pathBuilderA.verticalLineToRelative(1.53f);
        pathBuilderA.curveToRelative(0.0f, 0.89f, 1.07f, 1.33f, 1.7f, 0.71f);
        pathBuilderA.lineToRelative(2.13f, -2.08f);
        pathBuilderA.curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.0f, -1.42f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.67f, 9.76f);
        pathBuilderA.curveToRelative(-0.16f, -0.55f, -0.38f, -1.08f, -0.66f, -1.59f);
        pathBuilderA.curveToRelative(-0.31f, -0.57f, -1.1f, -0.66f, -1.56f, -0.2f);
        pathBuilderA.lineToRelative(-0.01f, 0.01f);
        pathBuilderA.curveToRelative(-0.31f, 0.31f, -0.38f, 0.78f, -0.17f, 1.16f);
        pathBuilderA.curveToRelative(0.2f, 0.37f, 0.36f, 0.76f, 0.48f, 1.16f);
        pathBuilderA.curveToRelative(0.12f, 0.42f, 0.51f, 0.7f, 0.94f, 0.7f);
        pathBuilderA.horizontalLineToRelative(0.02f);
        pathBuilderA.curveToRelative(0.65f, 0.0f, 1.15f, -0.62f, 0.96f, -1.24f);
        a.n(pathBuilderA, 13.0f, 18.68f, 0.02f);
        pathBuilderA.curveToRelative(0.0f, 0.65f, 0.62f, 1.14f, 1.24f, 0.96f);
        pathBuilderA.curveToRelative(0.55f, -0.16f, 1.08f, -0.38f, 1.59f, -0.66f);
        pathBuilderA.curveToRelative(0.57f, -0.31f, 0.66f, -1.1f, 0.2f, -1.56f);
        pathBuilderA.lineToRelative(-0.02f, -0.02f);
        pathBuilderA.curveToRelative(-0.31f, -0.31f, -0.78f, -0.38f, -1.16f, -0.17f);
        pathBuilderA.curveToRelative(-0.37f, 0.21f, -0.76f, 0.37f, -1.16f, 0.49f);
        pathBuilderA.curveToRelative(-0.41f, 0.12f, -0.69f, 0.51f, -0.69f, 0.94f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.44f, 16.03f);
        pathBuilderA.curveToRelative(0.46f, 0.46f, 1.25f, 0.37f, 1.56f, -0.2f);
        pathBuilderA.curveToRelative(0.28f, -0.51f, 0.5f, -1.04f, 0.67f, -1.59f);
        pathBuilderA.curveToRelative(0.18f, -0.62f, -0.31f, -1.24f, -0.96f, -1.24f);
        pathBuilderA.horizontalLineToRelative(-0.02f);
        pathBuilderA.curveToRelative(-0.44f, 0.0f, -0.82f, 0.28f, -0.94f, 0.7f);
        pathBuilderA.curveToRelative(-0.12f, 0.4f, -0.28f, 0.79f, -0.48f, 1.17f);
        pathBuilderA.curveToRelative(-0.21f, 0.38f, -0.13f, 0.86f, 0.17f, 1.16f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateRight = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
