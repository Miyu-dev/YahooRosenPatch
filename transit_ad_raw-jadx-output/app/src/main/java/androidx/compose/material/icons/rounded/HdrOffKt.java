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

/* JADX INFO: compiled from: HdrOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrOffKt {
    private static ImageVector _hdrOff;

    public static final ImageVector getHdrOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hdrOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(17.5f, 14.25f, 17.5f, 13.0f, 1.1f);
        pathBuilderL.lineToRelative(0.72f, 1.59f);
        pathBuilderL.curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f);
        pathBuilderL.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.96f);
        pathBuilderL.lineToRelative(-0.49f, -1.14f);
        pathBuilderL.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilderL.verticalLineToRelative(-1.0f);
        pathBuilderL.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderL.lineTo(17.0f, 9.0f);
        pathBuilderL.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderL.verticalLineToRelative(3.9f);
        pathBuilderL.lineToRelative(1.04f, 1.04f);
        pathBuilderL.curveToRelative(0.27f, -0.11f, 0.46f, -0.38f, 0.46f, -0.69f);
        b.r(pathBuilderL, 17.5f, 10.5f, 2.0f, 1.0f);
        a.z(pathBuilderL, -2.0f, -1.0f, 13.0f, 10.5f);
        androidx.compose.animation.a.q(pathBuilderL, 0.4f, 1.5f, 1.5f, -1.9f);
        pathBuilderL.curveToRelative(0.0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f);
        pathBuilderL.horizontalLineToRelative(-1.9f);
        pathBuilderL.lineToRelative(1.5f, 1.5f);
        pathBuilderL.horizontalLineToRelative(0.4f);
        pathBuilderL.close();
        pathBuilderL.moveTo(21.03f, 21.03f);
        pathBuilderL.lineToRelative(-18.0f, -18.0f);
        pathBuilderL.curveToRelative(-0.29f, -0.29f, -0.76f, -0.29f, -1.05f, 0.0f);
        pathBuilderL.curveToRelative(-0.29f, 0.29f, -0.29f, 0.76f, 0.0f, 1.05f);
        pathBuilderL.lineToRelative(4.98f, 4.98f);
        pathBuilderL.curveToRelative(-0.27f, 0.11f, -0.46f, 0.38f, -0.46f, 0.69f);
        pathBuilderL.lineTo(6.5f, 11.0f);
        pathBuilderL.horizontalLineToRelative(-2.0f);
        pathBuilderL.lineTo(4.5f, 9.75f);
        pathBuilderL.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderL.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        pathBuilderL.verticalLineToRelative(4.5f);
        pathBuilderL.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderL.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        androidx.compose.animation.a.o(pathBuilderL, 4.5f, 12.5f, 2.0f, 1.75f);
        pathBuilderL.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderL.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderL.lineTo(8.0f, 10.1f);
        pathBuilderL.lineToRelative(1.5f, 1.5f);
        pathBuilderL.verticalLineToRelative(2.9f);
        pathBuilderL.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderL.horizontalLineToRelative(2.5f);
        pathBuilderL.curveToRelative(0.12f, 0.0f, 0.24f, -0.01f, 0.36f, -0.04f);
        pathBuilderL.lineToRelative(7.11f, 7.11f);
        pathBuilderL.curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.05f, 0.0f);
        pathBuilderL.curveToRelative(0.29f, -0.28f, 0.29f, -0.75f, 0.01f, -1.04f);
        pathBuilderL.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderL.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
