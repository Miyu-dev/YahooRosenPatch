package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: AlignVerticalTop.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_alignVerticalTop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlignVerticalTop", "Landroidx/compose/material/icons/Icons$Rounded;", "getAlignVerticalTop", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AlignVerticalTopKt {
    private static ImageVector _alignVerticalTop;

    public static final ImageVector getAlignVerticalTop(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _alignVerticalTop;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignVerticalTop", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.0f, 3.0f, 22.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(3.0f);
        pathBuilderA.curveTo(2.45f, 4.0f, 2.0f, 3.55f, 2.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(18.0f);
        pathBuilderA.curveTo(21.55f, 2.0f, 22.0f, 2.45f, 22.0f, 3.0f);
        a.t(pathBuilderA, 8.5f, 22.0f, 8.5f, 22.0f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderA.verticalLineToRelative(-13.0f);
        pathBuilderA.curveTo(10.0f, 6.67f, 9.33f, 6.0f, 8.5f, 6.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveTo(7.67f, 6.0f, 7.0f, 6.67f, 7.0f, 7.5f);
        pathBuilderA.verticalLineToRelative(13.0f);
        pathBuilderA.curveTo(7.0f, 21.33f, 7.67f, 22.0f, 8.5f, 22.0f);
        a.t(pathBuilderA, 15.5f, 16.0f, 15.5f, 16.0f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderA.verticalLineToRelative(-7.0f);
        pathBuilderA.curveTo(17.0f, 6.67f, 16.33f, 6.0f, 15.5f, 6.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveTo(14.67f, 6.0f, 14.0f, 6.67f, 14.0f, 7.5f);
        pathBuilderA.verticalLineToRelative(7.0f);
        pathBuilderA.curveTo(14.0f, 15.33f, 14.67f, 16.0f, 15.5f, 16.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignVerticalTop = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
