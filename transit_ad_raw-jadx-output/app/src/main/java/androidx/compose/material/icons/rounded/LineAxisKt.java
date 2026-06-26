package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LineAxis.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lineAxis", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LineAxis", "Landroidx/compose/material/icons/Icons$Rounded;", "getLineAxis", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LineAxisKt {
    private static ImageVector _lineAxis;

    public static final ImageVector getLineAxis(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _lineAxis;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LineAxis", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.34f, 6.77f, 21.34f, 6.77f);
        pathBuilderA.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        pathBuilderA.lineToRelative(-3.33f, 3.74f);
        pathBuilderA.lineToRelative(-5.65f, -5.24f);
        pathBuilderA.curveTo(10.12f, 4.58f, 8.9f, 4.6f, 8.14f, 5.36f);
        pathBuilderA.lineTo(2.7f, 10.81f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineToRelative(0.09f, 0.09f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(5.44f, -5.45f);
        pathBuilderA.lineToRelative(5.59f, 5.19f);
        pathBuilderA.lineToRelative(-1.73f, 1.95f);
        pathBuilderA.lineToRelative(-2.58f, -2.58f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderA.lineTo(2.7f, 16.8f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineTo(2.8f, 18.3f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(5.3f, -5.3f);
        pathBuilderA.lineToRelative(2.5f, 2.5f);
        pathBuilderA.curveToRelative(0.81f, 0.81f, 2.14f, 0.77f, 2.91f, -0.09f);
        pathBuilderA.lineToRelative(1.78f, -2.01f);
        pathBuilderA.lineToRelative(3.19f, 2.96f);
        pathBuilderA.curveToRelative(0.39f, 0.36f, 1.0f, 0.35f, 1.38f, -0.03f);
        pathBuilderA.lineToRelative(0.01f, -0.01f);
        pathBuilderA.curveToRelative(0.4f, -0.4f, 0.39f, -1.05f, -0.03f, -1.43f);
        pathBuilderA.lineToRelative(-3.22f, -2.99f);
        pathBuilderA.lineToRelative(3.35f, -3.77f);
        pathBuilderA.curveTo(21.73f, 7.74f, 21.71f, 7.14f, 21.34f, 6.77f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lineAxis = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
