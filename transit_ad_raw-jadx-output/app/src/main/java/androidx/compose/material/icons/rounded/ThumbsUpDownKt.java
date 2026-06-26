package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: ThumbsUpDown.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbsUpDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbsUpDown", "Landroidx/compose/material/icons/Icons$Rounded;", "getThumbsUpDown", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbsUpDown", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderS = h.s(10.06f, 5.0f, 5.82f, 0.66f, -3.18f);
        pathBuilderS.curveToRelative(0.08f, -0.37f, -0.04f, -0.75f, -0.3f, -1.02f);
        pathBuilderS.curveTo(5.74f, 0.36f, 5.03f, 0.36f, 4.6f, 0.8f);
        pathBuilderS.lineToRelative(-4.0f, 4.0f);
        pathBuilderS.curveToRelative(-0.39f, 0.37f, -0.6f, 0.88f, -0.6f, 1.41f);
        pathBuilderS.verticalLineTo(12.0f);
        pathBuilderS.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderS.horizontalLineToRelative(5.92f);
        pathBuilderS.curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        pathBuilderS.lineToRelative(2.14f, -5.0f);
        pathBuilderS.curveTo(12.46f, 6.47f, 11.49f, 5.0f, 10.06f, 5.0f);
        a.j(pathBuilderS, 22.0f, 10.0f, -5.92f);
        pathBuilderS.curveToRelative(-0.8f, 0.0f, -1.52f, 0.48f, -1.84f, 1.21f);
        pathBuilderS.lineToRelative(-2.14f, 5.0f);
        pathBuilderS.curveToRelative(-0.56f, 1.32f, 0.4f, 2.79f, 1.84f, 2.79f);
        pathBuilderS.horizontalLineToRelative(4.24f);
        pathBuilderS.lineToRelative(-0.66f, 3.18f);
        pathBuilderS.curveToRelative(-0.08f, 0.37f, 0.04f, 0.75f, 0.3f, 1.02f);
        pathBuilderS.curveToRelative(0.44f, 0.44f, 1.15f, 0.44f, 1.58f, 0.0f);
        pathBuilderS.lineToRelative(4.0f, -4.0f);
        pathBuilderS.curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f);
        pathBuilderS.verticalLineTo(12.0f);
        pathBuilderS.curveToRelative(0.01f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        pathBuilderS.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderS.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
