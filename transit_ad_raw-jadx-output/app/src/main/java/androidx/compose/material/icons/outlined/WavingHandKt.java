package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: WavingHand.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wavingHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WavingHand", "Landroidx/compose/material/icons/Icons$Outlined;", "getWavingHand", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WavingHand", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.03f, 4.95f, 3.49f, 8.49f);
        pathBuilderA.curveToRelative(-3.32f, 3.32f, -3.32f, 8.7f, 0.0f, 12.02f);
        pathBuilderA.reflectiveCurveToRelative(8.7f, 3.32f, 12.02f, 0.0f);
        pathBuilderA.lineToRelative(6.01f, -6.01f);
        pathBuilderA.curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f);
        pathBuilderA.curveToRelative(-0.12f, -0.12f, -0.25f, -0.23f, -0.39f, -0.32f);
        pathBuilderA.lineToRelative(0.39f, -0.39f);
        pathBuilderA.curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f);
        pathBuilderA.curveToRelative(-0.16f, -0.16f, -0.35f, -0.3f, -0.54f, -0.41f);
        pathBuilderA.curveToRelative(0.4f, -0.92f, 0.23f, -2.02f, -0.52f, -2.77f);
        pathBuilderA.curveToRelative(-0.87f, -0.87f, -2.22f, -0.96f, -3.2f, -0.28f);
        pathBuilderA.curveToRelative(-0.1f, -0.15f, -0.21f, -0.29f, -0.34f, -0.42f);
        pathBuilderA.curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.54f, 0.0f);
        pathBuilderA.lineToRelative(-2.51f, 2.51f);
        pathBuilderA.curveToRelative(-0.09f, -0.14f, -0.2f, -0.27f, -0.32f, -0.39f);
        pathBuilderA.curveTo(9.58f, 3.98f, 8.0f, 3.98f, 7.03f, 4.95f);
        pathBuilderA.close();
        pathBuilderA.moveTo(8.44f, 6.37f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderA.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderA.lineToRelative(-3.18f, 3.18f);
        pathBuilderA.curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0.0f, 4.24f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.curveToRelative(1.45f, -1.45f, 1.82f, -3.57f, 1.12f, -5.36f);
        pathBuilderA.lineToRelative(6.3f, -6.3f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderA.reflectiveCurveToRelative(0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderA.lineToRelative(-4.6f, 4.6f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(6.01f, -6.01f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderA.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderA.lineToRelative(-6.01f, 6.01f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(4.95f, -4.95f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderA.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderA.lineToRelative(-5.66f, 5.66f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(3.54f, -3.54f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderA.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderA.lineTo(14.1f, 19.1f);
        pathBuilderA.curveToRelative(-2.54f, 2.54f, -6.65f, 2.54f, -9.19f, 0.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.54f, -6.65f, 0.0f, -9.19f);
        a.z(pathBuilderA, 8.44f, 6.37f, 23.0f, 17.0f);
        pathBuilderA.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilderA.verticalLineToRelative(-1.5f);
        pathBuilderA.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        androidx.compose.animation.b.w(pathBuilderA, 23.0f, 1.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderA.verticalLineToRelative(1.5f);
        pathBuilderA.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderA, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
