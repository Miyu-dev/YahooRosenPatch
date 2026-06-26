package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Hexagon.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hexagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hexagon", "Landroidx/compose/material/icons/Icons$Rounded;", "getHexagon", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hexagon", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(16.05f, 3.0f, 7.95f);
        pathBuilderB.curveTo(7.24f, 3.0f, 6.58f, 3.38f, 6.22f, 4.0f);
        pathBuilderB.lineToRelative(-4.04f, 7.0f);
        pathBuilderB.curveToRelative(-0.36f, 0.62f, -0.36f, 1.38f, 0.0f, 2.0f);
        pathBuilderB.lineToRelative(4.04f, 7.0f);
        pathBuilderB.curveToRelative(0.36f, 0.62f, 1.02f, 1.0f, 1.73f, 1.0f);
        pathBuilderB.horizontalLineToRelative(8.09f);
        pathBuilderB.curveToRelative(0.71f, 0.0f, 1.37f, -0.38f, 1.73f, -1.0f);
        pathBuilderB.lineToRelative(4.04f, -7.0f);
        pathBuilderB.curveToRelative(0.36f, -0.62f, 0.36f, -1.38f, 0.0f, -2.0f);
        pathBuilderB.lineToRelative(-4.04f, -7.0f);
        pathBuilderB.curveTo(17.42f, 3.38f, 16.76f, 3.0f, 16.05f, 3.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hexagon = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
