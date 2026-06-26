package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: CleanHands.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cleanHands", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CleanHands", "Landroidx/compose/material/icons/Icons$Rounded;", "getCleanHands", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CleanHandsKt {
    private static ImageVector _cleanHands;

    public static final ImageVector getCleanHands(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _cleanHands;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CleanHands", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.99f, 7.0f, 1.37f, -0.63f);
        pathBuilderA.lineTo(16.99f, 5.0f);
        pathBuilderA.lineToRelative(0.63f, 1.37f);
        pathBuilderA.lineTo(18.99f, 7.0f);
        pathBuilderA.lineToRelative(-1.37f, 0.63f);
        pathBuilderA.lineTo(16.99f, 9.0f);
        s.r(pathBuilderA, -0.63f, -1.37f, 14.99f, 7.0f);
        pathBuilderA.moveTo(20.0f, 14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.curveToRelative(0.0f, -0.78f, -0.99f, -2.44f, -1.58f, -3.36f);
        pathBuilderA.curveToRelative(-0.2f, -0.31f, -0.64f, -0.31f, -0.84f, 0.0f);
        pathBuilderA.curveTo(18.99f, 9.56f, 18.0f, 11.22f, 18.0f, 12.0f);
        pathBuilderA.curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f);
        a.t(pathBuilderA, 9.24f, 9.5f, 15.0f, 11.65f);
        pathBuilderA.verticalLineTo(11.0f);
        pathBuilderA.curveToRelative(0.0f, -2.42f, -1.72f, -4.44f, -4.0f, -4.9f);
        pathBuilderA.verticalLineTo(4.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(0.35f, 0.0f, 0.68f, 0.06f, 1.0f, 0.18f);
        pathBuilderA.curveToRelative(0.37f, 0.13f, 0.78f, 0.05f, 1.05f, -0.22f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.51f, -0.51f, 0.34f, -1.39f, -0.33f, -1.64f);
        pathBuilderA.curveTo(14.19f, 2.11f, 13.61f, 2.0f, 13.0f, 2.0f);
        pathBuilderA.horizontalLineTo(8.5f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(9.0f);
        pathBuilderA.verticalLineToRelative(2.11f);
        pathBuilderA.curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f);
        b.w(pathBuilderA, 9.24f, 3.0f, 11.0f);
        pathBuilderA.lineTo(3.0f, 11.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(7.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineToRelative(-7.0f);
        pathBuilderA.curveTo(5.0f, 11.9f, 4.1f, 11.0f, 3.0f, 11.0f);
        a.j(pathBuilderA, 19.99f, 17.0f, -6.83f);
        pathBuilderA.curveToRelative(-0.11f, 0.0f, -0.22f, -0.02f, -0.33f, -0.06f);
        pathBuilderA.lineToRelative(-1.47f, -0.51f);
        pathBuilderA.curveToRelative(-0.26f, -0.09f, -0.39f, -0.37f, -0.3f, -0.63f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.09f, -0.26f, 0.38f, -0.4f, 0.64f, -0.3f);
        pathBuilderA.lineToRelative(1.12f, 0.43f);
        pathBuilderA.curveToRelative(0.11f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f);
        pathBuilderA.horizontalLineToRelative(2.63f);
        pathBuilderA.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        pathBuilderA.lineTo(9.3f, 11.13f);
        pathBuilderA.curveTo(9.08f, 11.04f, 8.84f, 11.0f, 8.6f, 11.0f);
        a.z(pathBuilderA, 7.0f, 9.02f, 6.37f, 1.81f);
        pathBuilderA.curveToRelative(0.41f, 0.12f, 0.85f, 0.1f, 1.25f, -0.05f);
        pathBuilderA.lineTo(22.0f, 19.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(22.0f, 17.89f, 21.1f, 17.0f, 19.99f, 17.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cleanHands = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
