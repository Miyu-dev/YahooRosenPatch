package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: DoubleArrow.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doubleArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoubleArrow", "Landroidx/compose/material/icons/Icons$Rounded;", "getDoubleArrow", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DoubleArrowKt {
    private static ImageVector _doubleArrow;

    public static final ImageVector getDoubleArrow(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _doubleArrow;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoubleArrow", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.08f, 11.42f, -4.04f, -5.65f);
        pathBuilderA.curveTo(15.7f, 5.29f, 15.15f, 5.0f, 14.56f, 5.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-1.49f, 0.0f, -2.35f, 1.68f, -1.49f, 2.89f);
        pathBuilderA.lineTo(16.0f, 12.0f);
        pathBuilderA.lineToRelative(-2.93f, 4.11f);
        pathBuilderA.curveToRelative(-0.87f, 1.21f, 0.0f, 2.89f, 1.49f, 2.89f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        pathBuilderA.lineToRelative(4.04f, -5.65f);
        pathBuilderA.curveTo(20.33f, 12.23f, 20.33f, 11.77f, 20.08f, 11.42f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(13.08f, 11.42f, 9.05f, 5.77f);
        pathBuilderA2.curveTo(8.7f, 5.29f, 8.15f, 5.0f, 7.56f, 5.0f);
        pathBuilderA2.horizontalLineToRelative(0.0f);
        pathBuilderA2.curveTo(6.07f, 5.0f, 5.2f, 6.68f, 6.07f, 7.89f);
        pathBuilderA2.lineTo(9.0f, 12.0f);
        pathBuilderA2.lineToRelative(-2.93f, 4.11f);
        pathBuilderA2.curveTo(5.2f, 17.32f, 6.07f, 19.0f, 7.56f, 19.0f);
        pathBuilderA2.horizontalLineToRelative(0.0f);
        pathBuilderA2.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        pathBuilderA2.lineToRelative(4.04f, -5.65f);
        pathBuilderA2.curveTo(13.33f, 12.23f, 13.33f, 11.77f, 13.08f, 11.42f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doubleArrow = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
