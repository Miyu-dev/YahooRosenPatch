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

/* JADX INFO: compiled from: ZoomOutMap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_zoomOutMap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ZoomOutMap", "Landroidx/compose/material/icons/Icons$Rounded;", "getZoomOutMap", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ZoomOutMapKt {
    private static ImageVector _zoomOutMap;

    public static final ImageVector getZoomOutMap(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _zoomOutMap;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ZoomOutMap", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.85f, 3.85f, 17.3f, 5.3f);
        pathBuilderA.lineToRelative(-2.18f, 2.16f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilderA.lineTo(18.7f, 6.7f);
        pathBuilderA.lineToRelative(1.45f, 1.45f);
        pathBuilderA.curveTo(20.46f, 8.46f, 21.0f, 8.24f, 21.0f, 7.79f);
        pathBuilderA.verticalLineTo(3.5f);
        pathBuilderA.curveTo(21.0f, 3.22f, 20.78f, 3.0f, 20.5f, 3.0f);
        pathBuilderA.horizontalLineToRelative(-4.29f);
        pathBuilderA.curveTo(15.76f, 3.0f, 15.54f, 3.54f, 15.85f, 3.85f);
        a.t(pathBuilderA, 3.85f, 8.15f, 5.3f, 6.7f);
        pathBuilderA.lineToRelative(2.16f, 2.18f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilderA.lineTo(6.7f, 5.3f);
        pathBuilderA.lineToRelative(1.45f, -1.45f);
        pathBuilderA.curveTo(8.46f, 3.54f, 8.24f, 3.0f, 7.79f, 3.0f);
        pathBuilderA.horizontalLineTo(3.5f);
        pathBuilderA.curveTo(3.22f, 3.0f, 3.0f, 3.22f, 3.0f, 3.5f);
        pathBuilderA.verticalLineToRelative(4.29f);
        pathBuilderA.curveTo(3.0f, 8.24f, 3.54f, 8.46f, 3.85f, 8.15f);
        a.t(pathBuilderA, 8.15f, 20.15f, 6.7f, 18.7f);
        pathBuilderA.lineToRelative(2.18f, -2.16f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.lineTo(5.3f, 17.3f);
        pathBuilderA.lineToRelative(-1.45f, -1.45f);
        pathBuilderA.curveTo(3.54f, 15.54f, 3.0f, 15.76f, 3.0f, 16.21f);
        pathBuilderA.verticalLineToRelative(4.29f);
        pathBuilderA.curveTo(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f);
        pathBuilderA.horizontalLineToRelative(4.29f);
        pathBuilderA.curveTo(8.24f, 21.0f, 8.46f, 20.46f, 8.15f, 20.15f);
        a.t(pathBuilderA, 20.15f, 15.85f, 18.7f, 17.3f);
        pathBuilderA.lineToRelative(-2.16f, -2.18f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilderA.lineToRelative(2.18f, 2.16f);
        pathBuilderA.lineToRelative(-1.45f, 1.45f);
        pathBuilderA.curveTo(15.54f, 20.46f, 15.76f, 21.0f, 16.21f, 21.0f);
        pathBuilderA.horizontalLineToRelative(4.29f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderA.verticalLineToRelative(-4.29f);
        pathBuilderA.curveTo(21.0f, 15.76f, 20.46f, 15.54f, 20.15f, 15.85f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _zoomOutMap = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
