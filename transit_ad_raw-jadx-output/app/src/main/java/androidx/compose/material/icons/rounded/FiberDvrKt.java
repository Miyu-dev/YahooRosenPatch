package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: FiberDvr.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberDvr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberDvr", "Landroidx/compose/material/icons/Icons$Rounded;", "getFiberDvr", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberDvr", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = a.v(4.5f, 10.5f, 2.0f, 3.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 17.5f, 10.5f, 2.0f, 1.0f);
        b.q(pathBuilderV, -2.0f, 21.0f, 3.0f);
        pathBuilderV.lineTo(3.0f, 3.0f);
        pathBuilderV.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilderV.verticalLineToRelative(14.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderV.horizontalLineToRelative(18.0f);
        pathBuilderV.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.lineTo(23.0f, 5.0f);
        pathBuilderV.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(8.0f, 13.5f);
        pathBuilderV.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderV.horizontalLineToRelative(-3.0f);
        pathBuilderV.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderV.verticalLineToRelative(-5.0f);
        pathBuilderV.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderV.horizontalLineToRelative(3.0f);
        pathBuilderV.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        android.support.v4.media.a.v(pathBuilderV, 3.0f, 14.1f, 9.92f);
        pathBuilderV.lineToRelative(-1.27f, 4.36f);
        pathBuilderV.curveToRelative(-0.12f, 0.43f, -0.52f, 0.72f, -0.96f, 0.72f);
        pathBuilderV.reflectiveCurveToRelative(-0.84f, -0.29f, -0.96f, -0.72f);
        pathBuilderV.lineTo(9.64f, 9.92f);
        pathBuilderV.curveToRelative(-0.14f, -0.46f, 0.21f, -0.92f, 0.69f, -0.92f);
        pathBuilderV.curveToRelative(0.32f, 0.0f, 0.6f, 0.21f, 0.69f, 0.52f);
        pathBuilderV.lineToRelative(0.85f, 2.91f);
        pathBuilderV.lineToRelative(0.85f, -2.91f);
        pathBuilderV.curveToRelative(0.09f, -0.31f, 0.37f, -0.52f, 0.69f, -0.52f);
        pathBuilderV.curveToRelative(0.48f, 0.0f, 0.83f, 0.46f, 0.69f, 0.92f);
        pathBuilderV.close();
        pathBuilderV.moveTo(21.0f, 11.5f);
        pathBuilderV.curveToRelative(0.0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f);
        pathBuilderV.lineToRelative(0.63f, 1.48f);
        pathBuilderV.curveToRelative(0.19f, 0.45f, -0.14f, 0.96f, -0.63f, 0.96f);
        pathBuilderV.curveToRelative(-0.28f, 0.0f, -0.53f, -0.16f, -0.63f, -0.42f);
        pathBuilderV.lineTo(18.65f, 13.0f);
        pathBuilderV.lineTo(17.5f, 13.0f);
        pathBuilderV.verticalLineToRelative(1.31f);
        pathBuilderV.curveToRelative(0.0f, 0.38f, -0.31f, 0.69f, -0.69f, 0.69f);
        pathBuilderV.horizontalLineToRelative(-0.12f);
        pathBuilderV.curveToRelative(-0.38f, 0.0f, -0.69f, -0.31f, -0.69f, -0.69f);
        pathBuilderV.lineTo(16.0f, 9.64f);
        pathBuilderV.curveToRelative(0.0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f);
        pathBuilderV.horizontalLineToRelative(2.86f);
        pathBuilderV.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderV, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
