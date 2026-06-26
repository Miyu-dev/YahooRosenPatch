package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Pin.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pin", "Landroidx/compose/material/icons/Icons$Sharp;", "getPin", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PinKt {
    private static ImageVector _pin;

    public static final ImageVector getPin(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _pin;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Pin", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(22.0f, 4.0f, 2.0f, 16.0f, 20.0f);
        a.y(pathBuilderO, 4.0f, 7.64f, 15.0f, 6.49f);
        pathBuilderO.verticalLineToRelative(-4.5f);
        pathBuilderO.lineToRelative(-0.9f, 0.66f);
        pathBuilderO.lineToRelative(-0.58f, -0.89f);
        pathBuilderO.lineTo(6.77f, 9.0f);
        pathBuilderO.horizontalLineToRelative(0.87f);
        pathBuilderO.verticalLineTo(15.0f);
        pathBuilderO.close();
        b.z(pathBuilderO, 13.5f, 15.0f, 9.61f, -1.02f);
        pathBuilderO.curveToRelative(1.07f, -1.07f, 1.77f, -1.77f, 2.13f, -2.15f);
        pathBuilderO.curveToRelative(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f);
        pathBuilderO.curveToRelative(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f);
        pathBuilderO.curveToRelative(-0.52f, 0.0f, -0.8f, 0.39f, -0.9f, 0.72f);
        pathBuilderO.lineToRelative(-1.01f, -0.42f);
        pathBuilderO.curveToRelative(0.01f, -0.02f, 0.18f, -0.76f, 1.0f, -1.15f);
        pathBuilderO.curveToRelative(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f);
        pathBuilderO.curveToRelative(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f);
        pathBuilderO.curveToRelative(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f);
        pathBuilderO.curveToRelative(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f);
        pathBuilderO.lineToRelative(0.03f, 0.05f);
        pathBuilderO.horizontalLineToRelative(2.37f);
        pathBuilderO.verticalLineTo(15.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(18.75f, 14.15f);
        pathBuilderO.curveTo(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f);
        pathBuilderO.curveToRelative(-0.04f, 0.0f, -1.6f, 0.08f, -2.05f, -1.51f);
        pathBuilderO.lineToRelative(1.03f, -0.41f);
        pathBuilderO.curveToRelative(0.03f, 0.1f, 0.19f, 0.86f, 1.02f, 0.86f);
        pathBuilderO.curveToRelative(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f);
        android.support.v4.media.a.s(pathBuilderO, -0.5f, -1.0f, 0.46f);
        pathBuilderO.curveToRelative(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f);
        pathBuilderO.curveToRelative(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f);
        pathBuilderO.curveToRelative(-0.5f, 0.0f, -0.74f, 0.32f, -0.85f, 0.64f);
        pathBuilderO.lineToRelative(-0.99f, -0.41f);
        pathBuilderO.curveTo(15.2f, 9.9f, 15.68f, 9.0f, 16.94f, 9.0f);
        pathBuilderO.curveToRelative(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f);
        pathBuilderO.curveToRelative(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f);
        pathBuilderO.curveToRelative(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f);
        pathBuilderO.verticalLineToRelative(0.07f);
        pathBuilderO.curveToRelative(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f);
        pathBuilderO.curveTo(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pin = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
