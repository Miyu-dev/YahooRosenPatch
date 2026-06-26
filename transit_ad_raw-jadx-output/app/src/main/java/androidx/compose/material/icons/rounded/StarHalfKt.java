package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: StarHalf.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_starHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StarHalf", "Landroidx/compose/material/icons/Icons$Rounded;", "getStarHalf", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StarHalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _starHalf;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarHalf", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.65f, 9.04f, -4.84f, -0.42f);
        pathBuilderA.lineToRelative(-1.89f, -4.45f);
        pathBuilderA.curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        pathBuilderA.lineTo(9.19f, 8.63f);
        pathBuilderA.lineToRelative(-4.83f, 0.41f);
        pathBuilderA.curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        pathBuilderA.lineToRelative(3.67f, 3.18f);
        pathBuilderA.lineToRelative(-1.1f, 4.72f);
        pathBuilderA.curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        pathBuilderA.lineToRelative(4.15f, -2.5f);
        pathBuilderA.lineToRelative(4.15f, 2.51f);
        pathBuilderA.curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        pathBuilderA.lineToRelative(-1.1f, -4.73f);
        pathBuilderA.lineToRelative(3.67f, -3.18f);
        pathBuilderA.curveToRelative(0.67f, -0.58f, 0.32f, -1.68f, -0.56f, -1.75f);
        h.A(pathBuilderA, 12.0f, 15.4f, 6.1f);
        pathBuilderA.lineToRelative(1.71f, 4.04f);
        pathBuilderA.lineToRelative(4.38f, 0.38f);
        pathBuilderA.lineToRelative(-3.32f, 2.88f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.0f, 4.28f, 12.0f, 15.4f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starHalf = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
