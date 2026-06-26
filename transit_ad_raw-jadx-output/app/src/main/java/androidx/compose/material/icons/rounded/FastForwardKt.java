package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: FastForward.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fastForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FastForward", "Landroidx/compose/material/icons/Icons$Rounded;", "getFastForward", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FastForwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FastForward", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(5.58f, 16.89f, 5.77f, -4.07f);
        pathBuilderA.curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f);
        pathBuilderA.lineTo(5.58f, 7.11f);
        pathBuilderA.curveTo(4.91f, 6.65f, 4.0f, 7.12f, 4.0f, 7.93f);
        pathBuilderA.verticalLineToRelative(8.14f);
        pathBuilderA.curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f);
        a.n(pathBuilderA, 13.0f, 7.93f, 8.14f);
        pathBuilderA.curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f);
        pathBuilderA.lineToRelative(5.77f, -4.07f);
        pathBuilderA.curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f);
        pathBuilderA.lineToRelative(-5.77f, -4.07f);
        pathBuilderA.curveToRelative(-0.67f, -0.47f, -1.58f, 0.0f, -1.58f, 0.81f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastForward = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
