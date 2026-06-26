package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Dangerous.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dangerous", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dangerous", "Landroidx/compose/material/icons/Icons$Rounded;", "getDangerous", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Dangerous", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(14.9f, 3.0f, 9.1f);
        pathBuilderB.curveTo(8.57f, 3.0f, 8.06f, 3.21f, 7.68f, 3.59f);
        pathBuilderB.lineToRelative(-4.1f, 4.1f);
        pathBuilderB.curveTo(3.21f, 8.06f, 3.0f, 8.57f, 3.0f, 9.1f);
        pathBuilderB.verticalLineToRelative(5.8f);
        pathBuilderB.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        pathBuilderB.lineToRelative(4.1f, 4.1f);
        pathBuilderB.curveTo(8.06f, 20.79f, 8.57f, 21.0f, 9.1f, 21.0f);
        pathBuilderB.horizontalLineToRelative(5.8f);
        pathBuilderB.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        pathBuilderB.lineToRelative(4.1f, -4.1f);
        pathBuilderB.curveTo(20.79f, 15.94f, 21.0f, 15.43f, 21.0f, 14.9f);
        pathBuilderB.verticalLineTo(9.1f);
        pathBuilderB.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        pathBuilderB.lineToRelative(-4.1f, -4.1f);
        pathBuilderB.curveTo(15.94f, 3.21f, 15.43f, 3.0f, 14.9f, 3.0f);
        a.t(pathBuilderB, 15.54f, 15.54f, 15.54f, 15.54f);
        pathBuilderB.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderB.lineTo(12.0f, 13.41f);
        pathBuilderB.lineToRelative(-2.12f, 2.12f);
        pathBuilderB.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderB.lineTo(10.59f, 12.0f);
        pathBuilderB.lineTo(8.46f, 9.88f);
        pathBuilderB.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderB.lineTo(12.0f, 10.59f);
        pathBuilderB.lineToRelative(2.12f, -2.12f);
        pathBuilderB.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderB.lineTo(13.41f, 12.0f);
        pathBuilderB.lineToRelative(2.12f, 2.12f);
        pathBuilderB.curveTo(15.93f, 14.51f, 15.93f, 15.15f, 15.54f, 15.54f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
