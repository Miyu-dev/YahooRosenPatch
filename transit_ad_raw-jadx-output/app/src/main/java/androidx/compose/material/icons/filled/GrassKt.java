package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Grass.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_grass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Grass", "Landroidx/compose/material/icons/Icons$Filled;", "getGrass", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GrassKt {
    private static ImageVector _grass;

    public static final ImageVector getGrass(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _grass;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Grass", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(12.0f, 20.0f, 2.0f, -2.0f, 5.75f);
        pathBuilderO.lineToRelative(0.0f, 0.0f);
        pathBuilderO.curveTo(7.02f, 15.19f, 4.81f, 12.99f, 2.0f, 12.26f);
        pathBuilderO.curveTo(2.64f, 12.1f, 3.31f, 12.0f, 4.0f, 12.0f);
        pathBuilderO.curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(22.0f, 12.26f);
        pathBuilderO.curveTo(21.36f, 12.1f, 20.69f, 12.0f, 20.0f, 12.0f);
        pathBuilderO.curveToRelative(-2.93f, 0.0f, -5.48f, 1.58f, -6.88f, 3.93f);
        pathBuilderO.curveToRelative(0.29f, 0.66f, 0.53f, 1.35f, 0.67f, 2.07f);
        pathBuilderO.curveToRelative(0.13f, 0.65f, 0.2f, 1.32f, 0.2f, 2.0f);
        pathBuilderO.horizontalLineToRelative(2.0f);
        pathBuilderO.horizontalLineToRelative(6.0f);
        pathBuilderO.verticalLineToRelative(-2.0f);
        pathBuilderO.horizontalLineToRelative(-5.75f);
        pathBuilderO.curveTo(16.98f, 15.19f, 19.19f, 12.99f, 22.0f, 12.26f);
        pathBuilderO.close();
        pathBuilderO.moveTo(15.64f, 11.02f);
        pathBuilderO.curveToRelative(0.78f, -2.09f, 2.23f, -3.84f, 4.09f, -5.0f);
        pathBuilderO.curveTo(15.44f, 6.16f, 12.0f, 9.67f, 12.0f, 14.0f);
        pathBuilderO.curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.02f);
        pathBuilderO.curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        pathBuilderO.close();
        pathBuilderO.moveTo(11.42f, 8.85f);
        pathBuilderO.curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4.0f);
        pathBuilderO.curveTo(8.14f, 5.86f, 9.0f, 8.18f, 9.0f, 10.71f);
        pathBuilderO.curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        pathBuilderO.curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        pathBuilderO.curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grass = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
