package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: _9kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__9kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_9kPlus", "Landroidx/compose/material/icons/Icons$Rounded;", "get_9kPlus", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _9kPlusKt {
    private static ImageVector __9kPlus;

    public static final ImageVector get_9kPlus(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = __9kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._9kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(7.5f, 10.0f, 1.0f, 1.5f, -1.0f);
        androidx.compose.animation.a.y(pathBuilderF, 10.0f, 19.0f, 3.0f, 5.0f);
        pathBuilderF.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderF.verticalLineToRelative(14.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(14.0f);
        pathBuilderF.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderF.verticalLineTo(5.0f);
        pathBuilderF.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(10.0f, 14.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderF.horizontalLineTo(6.75f);
        pathBuilderF.curveTo(6.34f, 15.0f, 6.0f, 14.66f, 6.0f, 14.25f);
        pathBuilderF.verticalLineToRelative(0.0f);
        pathBuilderF.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        b.r(pathBuilderF, 8.5f, -1.0f, 7.0f);
        pathBuilderF.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderF.verticalLineTo(10.0f);
        pathBuilderF.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderF.horizontalLineToRelative(2.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        android.support.v4.media.a.y(pathBuilderF, 14.0f, 14.59f, 15.0f);
        pathBuilderF.lineTo(14.59f, 15.0f);
        pathBuilderF.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        pathBuilderF.lineToRelative(-1.54f, -1.98f);
        pathBuilderF.verticalLineToRelative(1.55f);
        pathBuilderF.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        pathBuilderF.horizontalLineTo(11.7f);
        pathBuilderF.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        pathBuilderF.verticalLineTo(9.7f);
        pathBuilderF.curveTo(11.0f, 9.31f, 11.31f, 9.0f, 11.7f, 9.0f);
        pathBuilderF.horizontalLineToRelative(0.09f);
        pathBuilderF.curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        pathBuilderF.verticalLineToRelative(1.55f);
        pathBuilderF.lineToRelative(1.54f, -1.98f);
        pathBuilderF.curveTo(14.17f, 9.1f, 14.38f, 9.0f, 14.59f, 9.0f);
        pathBuilderF.horizontalLineToRelative(0.0f);
        pathBuilderF.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        pathBuilderF.lineTo(13.75f, 12.0f);
        pathBuilderF.lineToRelative(1.41f, 1.88f);
        pathBuilderF.curveTo(15.5f, 14.34f, 15.17f, 15.0f, 14.59f, 15.0f);
        androidx.compose.animation.b.r(pathBuilderF, 18.5f, 12.5f, -1.0f, 1.0f);
        pathBuilderF.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderF.lineToRelative(0.0f, 0.0f);
        pathBuilderF.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderF.verticalLineToRelative(-1.0f);
        pathBuilderF.horizontalLineToRelative(-1.0f);
        pathBuilderF.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderF.verticalLineToRelative(0.0f);
        pathBuilderF.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderF.horizontalLineToRelative(1.0f);
        pathBuilderF.verticalLineToRelative(-1.0f);
        pathBuilderF.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderF.lineToRelative(0.0f, 0.0f);
        pathBuilderF.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderF.verticalLineToRelative(1.0f);
        pathBuilderF.horizontalLineToRelative(1.0f);
        pathBuilderF.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderF.verticalLineToRelative(0.0f);
        pathBuilderF.curveTo(19.0f, 12.28f, 18.78f, 12.5f, 18.5f, 12.5f);
        pathBuilderF.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderF.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __9kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
