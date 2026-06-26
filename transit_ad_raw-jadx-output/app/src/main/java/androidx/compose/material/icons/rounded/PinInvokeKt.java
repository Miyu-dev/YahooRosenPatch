package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: PinInvoke.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pinInvoke", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PinInvoke", "Landroidx/compose/material/icons/Icons$Rounded;", "getPinInvoke", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PinInvokeKt {
    private static ImageVector _pinInvoke;

    public static final ImageVector getPinInvoke(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _pinInvoke;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinInvoke", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(22.0f, 12.0f, 6.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderE.horizontalLineTo(4.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderE.verticalLineTo(6.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        a.C(pathBuilderE, 10.0f, 0.0f, 2.0f, 4.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderE, 12.0f, 16.0f, -6.0f, 22.0f);
        pathBuilderE.moveTo(22.0f, 7.0f);
        pathBuilderE.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderE.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderE.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderE.curveTo(20.66f, 10.0f, 22.0f, 8.66f, 22.0f, 7.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(9.34f, 15.66f);
        pathBuilderE.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderE.lineToRelative(2.12f, -2.12f);
        pathBuilderE.lineToRelative(1.27f, 1.27f);
        pathBuilderE.curveTo(14.46f, 15.12f, 15.0f, 14.9f, 15.0f, 14.45f);
        pathBuilderE.verticalLineTo(10.5f);
        pathBuilderE.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderE.horizontalLineToRelative(-3.95f);
        pathBuilderE.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilderE.lineToRelative(1.27f, 1.27f);
        pathBuilderE.lineToRelative(-2.12f, 2.12f);
        pathBuilderE.curveTo(8.95f, 14.63f, 8.95f, 15.27f, 9.34f, 15.66f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinInvoke = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
