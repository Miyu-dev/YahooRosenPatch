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

/* JADX INFO: compiled from: Landscape.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_landscape", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landscape", "Landroidx/compose/material/icons/Icons$Rounded;", "getLandscape", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LandscapeKt {
    private static ImageVector _landscape;

    public static final ImageVector getLandscape(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _landscape;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Landscape", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.2f, 7.07f, 10.25f, 11.0f);
        pathBuilderA.lineToRelative(2.25f, 3.0f);
        pathBuilderA.curveToRelative(0.33f, 0.44f, 0.24f, 1.07f, -0.2f, 1.4f);
        pathBuilderA.curveToRelative(-0.44f, 0.33f, -1.07f, 0.25f, -1.4f, -0.2f);
        pathBuilderA.curveToRelative(-1.05f, -1.4f, -2.31f, -3.07f, -3.1f, -4.14f);
        pathBuilderA.curveToRelative(-0.4f, -0.53f, -1.2f, -0.53f, -1.6f, 0.0f);
        pathBuilderA.lineToRelative(-4.0f, 5.33f);
        pathBuilderA.curveToRelative(-0.49f, 0.67f, -0.02f, 1.61f, 0.8f, 1.61f);
        pathBuilderA.horizontalLineToRelative(18.0f);
        pathBuilderA.curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f);
        pathBuilderA.lineToRelative(-7.0f, -9.33f);
        pathBuilderA.curveToRelative(-0.4f, -0.54f, -1.2f, -0.54f, -1.6f, 0.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _landscape = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
