package androidx.compose.material.icons.rounded;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: FiberPin.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberPin", "Landroidx/compose/material/icons/Icons$Rounded;", "getFiberPin", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberPin", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 4.0f, 4.0f, 4.0f);
        pathBuilderA.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilderA.lineTo(2.0f, 18.0f);
        pathBuilderA.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderA.lineTo(22.0f, 6.0f);
        pathBuilderA.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(9.0f, 11.5f);
        pathBuilderA.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.verticalLineToRelative(1.25f);
        pathBuilderA.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderA.reflectiveCurveTo(4.0f, 14.66f, 4.0f, 14.25f);
        pathBuilderA.lineTo(4.0f, 10.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(2.5f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        a.v(pathBuilderA, 1.0f, 12.5f, 14.25f);
        pathBuilderA.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderA.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderA.verticalLineToRelative(-4.5f);
        pathBuilderA.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderA.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        a.v(pathBuilderA, 4.5f, 20.0f, 14.21f);
        pathBuilderA.curveToRelative(0.0f, 0.44f, -0.35f, 0.79f, -0.79f, 0.79f);
        pathBuilderA.curveToRelative(-0.25f, 0.0f, -0.49f, -0.12f, -0.64f, -0.33f);
        pathBuilderA.lineToRelative(-2.31f, -3.17f);
        pathBuilderA.verticalLineToRelative(2.88f);
        pathBuilderA.curveToRelative(0.0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilderA.horizontalLineToRelative(-0.01f);
        pathBuilderA.curveToRelative(-0.35f, 0.0f, -0.63f, -0.28f, -0.63f, -0.62f);
        pathBuilderA.lineTo(15.0f, 9.83f);
        pathBuilderA.curveToRelative(0.0f, -0.46f, 0.37f, -0.83f, 0.83f, -0.83f);
        pathBuilderA.curveToRelative(0.27f, 0.0f, 0.52f, 0.13f, 0.67f, 0.35f);
        pathBuilderA.lineToRelative(2.25f, 3.15f);
        pathBuilderA.lineTo(18.75f, 9.62f);
        pathBuilderA.curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilderA.horizontalLineToRelative(0.01f);
        pathBuilderA.curveToRelative(0.34f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderA, 4.59f, 5.5f, 10.5f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderA, 1.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
