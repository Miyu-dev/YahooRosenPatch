package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Recycling.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_recycling", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Recycling", "Landroidx/compose/material/icons/Icons$Rounded;", "getRecycling", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RecyclingKt {
    private static ImageVector _recycling;

    public static final ImageVector getRecycling(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _recycling;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Recycling", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.2f, 7.41f);
        pathBuilderD.curveTo(5.97f, 7.27f, 5.89f, 6.96f, 6.03f, 6.73f);
        pathBuilderD.lineTo(7.2f, 4.78f);
        pathBuilderD.lineToRelative(1.03f, -1.71f);
        pathBuilderD.curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0.0f);
        pathBuilderD.lineToRelative(1.48f, 2.46f);
        pathBuilderD.lineToRelative(-1.23f, 2.06f);
        pathBuilderD.lineToRelative(-0.72f, 1.2f);
        pathBuilderD.curveTo(9.32f, 9.02f, 9.01f, 9.1f, 8.77f, 8.96f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 6.2f, 7.41f, 21.72f, 12.97f);
        pathBuilderD.lineToRelative(-1.34f, -2.24f);
        pathBuilderD.curveToRelative(-0.14f, -0.23f, -0.44f, -0.31f, -0.68f, -0.18f);
        pathBuilderD.lineToRelative(-2.6f, 1.5f);
        pathBuilderD.curveToRelative(-0.24f, 0.14f, -0.32f, 0.45f, -0.18f, 0.69f);
        pathBuilderD.lineTo(18.87f, 16.0f);
        pathBuilderD.lineToRelative(1.09f, 0.0f);
        pathBuilderD.curveToRelative(0.61f, 0.0f, 1.2f, -0.26f, 1.59f, -0.73f);
        pathBuilderD.curveTo(21.85f, 14.9f, 22.0f, 14.45f, 22.0f, 14.0f);
        pathBuilderD.curveTo(22.0f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f);
        androidx.compose.animation.a.j(pathBuilderD, 16.0f, 21.0f, 1.5f);
        pathBuilderD.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        h.n(pathBuilderD, 20.74f, 17.0f, 16.0f, -0.79f);
        pathBuilderD.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderD.lineToRelative(-2.79f, 2.79f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.lineToRelative(2.79f, 2.79f);
        pathBuilderD.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        androidx.compose.animation.a.y(pathBuilderD, 21.0f, 9.5f, 17.0f, 5.7f);
        pathBuilderD.lineToRelative(-0.84f, 1.41f);
        pathBuilderD.curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(5.08f, 20.63f, 5.67f, 21.0f, 6.32f, 21.0f);
        pathBuilderD.horizontalLineTo(9.5f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveTo(10.0f, 17.22f, 9.78f, 17.0f, 9.5f, 17.0f);
        a.y(pathBuilderD, 6.12f, 14.35f, 0.7f, 0.42f);
        pathBuilderD.curveToRelative(0.38f, 0.23f, 0.85f, -0.12f, 0.74f, -0.55f);
        pathBuilderD.lineTo(6.6f, 10.38f);
        pathBuilderD.curveTo(6.54f, 10.12f, 6.27f, 9.95f, 6.0f, 10.02f);
        pathBuilderD.lineToRelative(-3.83f, 0.96f);
        pathBuilderD.curveToRelative(-0.43f, 0.11f, -0.52f, 0.68f, -0.14f, 0.91f);
        pathBuilderD.lineToRelative(0.66f, 0.4f);
        pathBuilderD.lineToRelative(-0.41f, 0.69f);
        pathBuilderD.curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f);
        s.r(pathBuilderD, 1.63f, 3.26f, 6.12f, 14.35f);
        pathBuilderD.moveTo(17.02f, 5.14f);
        pathBuilderD.lineToRelative(-1.3f, -2.17f);
        pathBuilderD.curveTo(15.35f, 2.37f, 14.7f, 2.0f, 14.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(-3.53f);
        pathBuilderD.lineToRelative(3.12f, 5.2f);
        pathBuilderD.lineTo(12.9f, 7.61f);
        pathBuilderD.curveToRelative(-0.38f, 0.23f, -0.3f, 0.81f, 0.14f, 0.91f);
        pathBuilderD.lineToRelative(3.83f, 0.96f);
        pathBuilderD.curveToRelative(0.27f, 0.07f, 0.54f, -0.1f, 0.61f, -0.36f);
        pathBuilderD.lineToRelative(0.96f, -3.83f);
        pathBuilderD.curveToRelative(0.11f, -0.43f, -0.36f, -0.78f, -0.74f, -0.55f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 17.02f, 5.14f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recycling = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
