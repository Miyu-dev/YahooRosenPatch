package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: PinEnd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pinEnd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PinEnd", "Landroidx/compose/material/icons/Icons$Rounded;", "getPinEnd", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PinEndKt {
    private static ImageVector _pinEnd;

    public static final ImageVector getPinEnd(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _pinEnd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinEnd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = v.c(20.0f, 12.0f, 6.0f, 4.0f, 12.0f);
        a.C(pathBuilderC, 10.0f, 0.0f, 2.0f, 4.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderC.verticalLineTo(6.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderC.horizontalLineToRelative(16.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        h.z(pathBuilderC, 6.0f, 20.0f, 19.0f, 14.0f);
        pathBuilderC.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderC.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderC.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderC.reflectiveCurveTo(20.66f, 14.0f, 19.0f, 14.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(14.66f, 13.66f);
        pathBuilderC.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderC.lineToRelative(-2.12f, -2.12f);
        pathBuilderC.lineToRelative(1.27f, -1.27f);
        pathBuilderC.curveTo(14.12f, 8.54f, 13.9f, 8.0f, 13.45f, 8.0f);
        pathBuilderC.horizontalLineTo(9.5f);
        pathBuilderC.curveTo(9.22f, 8.0f, 9.0f, 8.22f, 9.0f, 8.5f);
        pathBuilderC.verticalLineToRelative(3.95f);
        pathBuilderC.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderC.lineToRelative(1.27f, -1.27f);
        pathBuilderC.lineToRelative(2.12f, 2.12f);
        pathBuilderC.curveTo(13.63f, 14.05f, 14.27f, 14.05f, 14.66f, 13.66f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinEnd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
