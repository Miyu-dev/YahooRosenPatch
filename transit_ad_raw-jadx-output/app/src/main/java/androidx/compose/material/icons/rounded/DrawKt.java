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

/* JADX INFO: compiled from: Draw.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_draw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Draw", "Landroidx/compose/material/icons/Icons$Rounded;", "getDraw", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DrawKt {
    private static ImageVector _draw;

    public static final ImageVector getDraw(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _draw;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Draw", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.85f, 10.39f, 1.06f, -1.06f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineTo(18.5f, 5.09f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        s.r(pathBuilderA, -1.06f, 1.06f, 18.85f, 10.39f);
        pathBuilderA.moveTo(13.19f, 7.56f);
        pathBuilderA.lineToRelative(-9.05f, 9.05f);
        pathBuilderA.curveTo(4.05f, 16.7f, 4.0f, 16.83f, 4.0f, 16.96f);
        pathBuilderA.verticalLineToRelative(3.54f);
        pathBuilderA.curveTo(4.0f, 20.78f, 4.22f, 21.0f, 4.5f, 21.0f);
        pathBuilderA.horizontalLineToRelative(3.54f);
        pathBuilderA.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        s.r(pathBuilderA, 9.05f, -9.05f, 13.19f, 7.56f);
        pathBuilderA.moveTo(19.0f, 17.5f);
        pathBuilderA.curveToRelative(0.0f, 2.19f, -2.54f, 3.5f, -5.0f, 3.5f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.curveToRelative(1.54f, 0.0f, 3.0f, -0.73f, 3.0f, -1.5f);
        pathBuilderA.curveToRelative(0.0f, -0.47f, -0.48f, -0.87f, -1.23f, -1.2f);
        pathBuilderA.lineToRelative(1.48f, -1.48f);
        pathBuilderA.curveTo(18.32f, 15.45f, 19.0f, 16.29f, 19.0f, 17.5f);
        pathBuilderA.close();
        pathBuilderA.moveTo(4.58f, 13.35f);
        pathBuilderA.curveTo(3.61f, 12.79f, 3.0f, 12.06f, 3.0f, 11.0f);
        pathBuilderA.curveToRelative(0.0f, -1.8f, 1.89f, -2.63f, 3.56f, -3.36f);
        pathBuilderA.curveTo(7.59f, 7.18f, 9.0f, 6.56f, 9.0f, 6.0f);
        pathBuilderA.curveToRelative(0.0f, -0.41f, -0.78f, -1.0f, -2.0f, -1.0f);
        pathBuilderA.curveTo(5.74f, 5.0f, 5.2f, 5.61f, 5.17f, 5.64f);
        pathBuilderA.curveTo(4.82f, 6.05f, 4.19f, 6.1f, 3.77f, 5.76f);
        pathBuilderA.curveTo(3.36f, 5.42f, 3.28f, 4.81f, 3.62f, 4.38f);
        pathBuilderA.curveTo(3.73f, 4.24f, 4.76f, 3.0f, 7.0f, 3.0f);
        pathBuilderA.curveToRelative(2.24f, 0.0f, 4.0f, 1.32f, 4.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, 1.87f, -1.93f, 2.72f, -3.64f, 3.47f);
        pathBuilderA.curveTo(6.42f, 9.88f, 5.0f, 10.5f, 5.0f, 11.0f);
        pathBuilderA.curveToRelative(0.0f, 0.31f, 0.43f, 0.6f, 1.07f, 0.86f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 4.58f, 13.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _draw = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
