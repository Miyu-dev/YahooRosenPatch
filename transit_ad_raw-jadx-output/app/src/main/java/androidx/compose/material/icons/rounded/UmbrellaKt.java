package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: Umbrella.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Umbrella", "Landroidx/compose/material/icons/Icons$Rounded;", "getUmbrella", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Umbrella", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.12f, 6.28f, 14.5f, 6.92f);
        pathBuilderA.lineTo(13.0f, 5.77f);
        pathBuilderA.verticalLineTo(3.88f);
        pathBuilderA.verticalLineTo(3.4f);
        pathBuilderA.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilderA.curveToRelative(0.23f, 0.0f, 0.43f, 0.16f, 0.49f, 0.36f);
        pathBuilderA.curveTo(14.1f, 3.7f, 14.49f, 4.0f, 14.94f, 4.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.05f, -0.3f);
        pathBuilderA.curveTo(15.59f, 1.72f, 14.63f, 1.0f, 13.5f, 1.0f);
        pathBuilderA.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilderA.verticalLineToRelative(0.48f);
        pathBuilderA.verticalLineToRelative(1.89f);
        pathBuilderA.lineTo(9.5f, 6.92f);
        pathBuilderA.lineTo(6.88f, 6.28f);
        pathBuilderA.curveTo(6.5f, 6.19f, 6.16f, 6.55f, 6.28f, 6.92f);
        pathBuilderA.lineToRelative(4.77f, 14.39f);
        pathBuilderA.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilderA.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        pathBuilderA.lineToRelative(4.77f, -14.39f);
        pathBuilderA.curveTo(17.84f, 6.55f, 17.5f, 6.19f, 17.12f, 6.28f);
        a.t(pathBuilderA, 11.0f, 14.8f, 9.03f, 8.86f);
        pathBuilderA.lineToRelative(0.92f, 0.23f);
        pathBuilderA.lineToRelative(0.76f, -0.58f);
        h.y(pathBuilderA, 11.0f, 8.29f, 14.8f);
        pathBuilderA.moveTo(13.0f, 14.8f);
        pathBuilderA.verticalLineTo(8.29f);
        pathBuilderA.lineToRelative(0.28f, 0.22f);
        pathBuilderA.lineToRelative(0.76f, 0.58f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 0.92f, -0.23f, 13.0f, 14.8f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
