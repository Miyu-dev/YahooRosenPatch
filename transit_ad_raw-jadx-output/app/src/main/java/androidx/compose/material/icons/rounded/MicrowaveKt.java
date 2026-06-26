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

/* JADX INFO: compiled from: Microwave.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_microwave", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Microwave", "Landroidx/compose/material/icons/Icons$Rounded;", "getMicrowave", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MicrowaveKt {
    private static ImageVector _microwave;

    public static final ImageVector getMicrowave(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _microwave;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Microwave", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(6.15f, 9.97f, 6.15f, 9.97f);
        pathBuilderA.curveTo(5.69f, 9.51f, 5.77f, 8.73f, 6.33f, 8.4f);
        pathBuilderA.curveTo(6.73f, 8.18f, 7.21f, 8.0f, 7.75f, 8.0f);
        pathBuilderA.curveToRelative(0.8f, 0.0f, 1.39f, 0.39f, 1.81f, 0.67f);
        pathBuilderA.curveTo(9.87f, 8.88f, 10.07f, 9.0f, 10.25f, 9.0f);
        pathBuilderA.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.39f, -0.12f);
        pathBuilderA.curveToRelative(0.39f, -0.22f, 0.88f, -0.16f, 1.2f, 0.16f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.46f, 0.46f, 0.38f, 1.24f, -0.18f, 1.56f);
        pathBuilderA.curveToRelative(-0.39f, 0.23f, -0.87f, 0.4f, -1.41f, 0.4f);
        pathBuilderA.curveToRelative(-0.79f, 0.0f, -1.37f, -0.38f, -1.79f, -0.66f);
        pathBuilderA.curveTo(8.13f, 10.12f, 7.94f, 10.0f, 7.75f, 10.0f);
        pathBuilderA.curveToRelative(-0.13f, 0.0f, -0.26f, 0.05f, -0.39f, 0.12f);
        pathBuilderA.curveTo(6.96f, 10.35f, 6.47f, 10.28f, 6.15f, 9.97f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.75f, 15.0f);
        pathBuilderA.curveToRelative(0.19f, 0.0f, 0.38f, 0.12f, 0.71f, 0.34f);
        pathBuilderA.curveToRelative(0.42f, 0.28f, 1.0f, 0.66f, 1.79f, 0.66f);
        pathBuilderA.curveToRelative(0.54f, 0.0f, 1.02f, -0.17f, 1.41f, -0.4f);
        pathBuilderA.curveToRelative(0.56f, -0.32f, 0.64f, -1.1f, 0.18f, -1.56f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(-0.32f, -0.32f, -0.81f, -0.38f, -1.2f, -0.16f);
        pathBuilderA.curveTo(10.51f, 13.95f, 10.38f, 14.0f, 10.25f, 14.0f);
        pathBuilderA.curveToRelative(-0.18f, 0.0f, -0.38f, -0.12f, -0.69f, -0.33f);
        pathBuilderA.curveTo(9.14f, 13.39f, 8.55f, 13.0f, 7.75f, 13.0f);
        pathBuilderA.curveToRelative(-0.54f, 0.0f, -1.02f, 0.18f, -1.42f, 0.4f);
        pathBuilderA.curveToRelative(-0.56f, 0.33f, -0.64f, 1.11f, -0.18f, 1.56f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.32f, 0.32f, 0.81f, 0.38f, 1.2f, 0.16f);
        pathBuilderA.curveTo(7.49f, 15.05f, 7.62f, 15.0f, 7.75f, 15.0f);
        a.n(pathBuilderA, 22.0f, 6.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.verticalLineTo(6.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f);
        androidx.browser.browseractions.a.q(pathBuilderA, 14.0f, 6.0f, 4.0f, 12.0f);
        b.m(pathBuilderA, 10.0f, 6.0f, 19.0f, 16.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.curveTo(18.55f, 13.0f, 19.0f, 12.55f, 19.0f, 12.0f);
        androidx.compose.animation.b.r(pathBuilderA, 19.0f, 7.0f, -2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderA, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _microwave = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
