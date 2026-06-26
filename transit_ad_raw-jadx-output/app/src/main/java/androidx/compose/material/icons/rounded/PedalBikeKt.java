package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: PedalBike.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pedalBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PedalBike", "Landroidx/compose/material/icons/Icons$Rounded;", "getPedalBike", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PedalBikeKt {
    private static ImageVector _pedalBike;

    public static final ImageVector getPedalBike(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _pedalBike;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PedalBike", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.18f, 10.0f, -1.7f, -4.68f);
        pathBuilderA.curveTo(16.19f, 4.53f, 15.44f, 4.0f, 14.6f, 4.0f);
        pathBuilderA.horizontalLineTo(13.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.B(pathBuilderA, 1.6f, 1.46f, 4.0f, -4.81f);
        pathBuilderA.lineToRelative(-0.36f, -1.0f);
        pathBuilderA.horizontalLineToRelative(0.09f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineTo(8.0f);
        pathBuilderA.curveTo(7.45f, 7.0f, 7.0f, 7.45f, 7.0f, 8.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        androidx.compose.animation.a.C(pathBuilderA, 0.75f, 1.82f, 5.0f, 9.9f);
        pathBuilderA.curveToRelative(-0.44f, -2.23f, -2.31f, -3.88f, -4.65f, -3.99f);
        pathBuilderA.curveTo(2.45f, 9.87f, 0.0f, 12.2f, 0.0f, 15.0f);
        pathBuilderA.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilderA.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilderA.horizontalLineToRelative(4.2f);
        pathBuilderA.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilderA.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        pathBuilderA.curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        b.w(pathBuilderA, 18.18f, 7.82f, 16.0f);
        pathBuilderA.curveToRelative(-0.42f, 1.23f, -1.6f, 2.08f, -3.02f, 1.99f);
        pathBuilderA.curveTo(3.31f, 17.9f, 2.07f, 16.64f, 2.0f, 15.14f);
        pathBuilderA.curveTo(1.93f, 13.39f, 3.27f, 12.0f, 5.0f, 12.0f);
        pathBuilderA.curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.v(pathBuilderA, 7.82f, 14.1f, 14.0f, -1.4f);
        pathBuilderA.lineToRelative(-0.73f, -2.0f);
        pathBuilderA.horizontalLineTo(15.0f);
        pathBuilderA.curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.88f, 18.0f);
        pathBuilderA.curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f);
        pathBuilderA.curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f);
        pathBuilderA.lineToRelative(0.62f, 1.7f);
        pathBuilderA.curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f);
        pathBuilderA.lineToRelative(-0.63f, -1.73f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, -0.01f);
        pathBuilderA.curveToRelative(1.72f, -0.04f, 3.08f, 1.29f, 3.08f, 3.0f);
        pathBuilderA.curveTo(22.0f, 16.72f, 20.62f, 18.06f, 18.88f, 18.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pedalBike = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
