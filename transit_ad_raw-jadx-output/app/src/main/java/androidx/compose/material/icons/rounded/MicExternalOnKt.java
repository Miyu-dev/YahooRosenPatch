package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: MicExternalOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_micExternalOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MicExternalOn", "Landroidx/compose/material/icons/Icons$Rounded;", "getMicExternalOn", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MicExternalOnKt {
    private static ImageVector _micExternalOn;

    public static final ImageVector getMicExternalOn(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _micExternalOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MicExternalOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(9.22f, 7.0f, 4.78f);
        pathBuilderB.curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderB.curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(16.24f, 2.01f);
        pathBuilderB.curveTo(18.32f, 2.13f, 20.0f, 4.08f, 20.0f, 6.16f);
        pathBuilderB.lineTo(20.0f, 21.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.lineToRelative(0.0f, -14.91f);
        pathBuilderB.curveToRelative(0.0f, -0.96f, -0.64f, -1.86f, -1.58f, -2.05f);
        pathBuilderB.curveTo(15.14f, 3.78f, 14.0f, 4.76f, 14.0f, 6.0f);
        pathBuilderB.lineToRelative(0.0f, 11.84f);
        pathBuilderB.curveToRelative(0.0f, 2.08f, -1.68f, 4.03f, -3.76f, 4.15f);
        pathBuilderB.curveTo(7.92f, 22.13f, 6.0f, 20.29f, 6.0f, 18.0f);
        pathBuilderB.horizontalLineTo(5.45f);
        pathBuilderB.curveToRelative(-0.26f, 0.0f, -0.47f, -0.19f, -0.5f, -0.45f);
        pathBuilderB.lineTo(4.11f, 9.1f);
        pathBuilderB.curveTo(4.05f, 8.51f, 4.51f, 8.0f, 5.1f, 8.0f);
        pathBuilderB.horizontalLineTo(8.9f);
        pathBuilderB.curveToRelative(0.59f, 0.0f, 1.05f, 0.51f, 1.0f, 1.1f);
        pathBuilderB.lineToRelative(-0.85f, 8.45f);
        pathBuilderB.curveTo(9.02f, 17.81f, 8.8f, 18.0f, 8.55f, 18.0f);
        pathBuilderB.horizontalLineTo(8.0f);
        pathBuilderB.curveToRelative(0.0f, 1.24f, 1.14f, 2.22f, 2.42f, 1.96f);
        pathBuilderB.curveToRelative(0.94f, -0.19f, 1.58f, -1.09f, 1.58f, -2.05f);
        pathBuilderB.lineTo(12.0f, 6.0f);
        pathBuilderB.curveTo(12.0f, 3.71f, 13.92f, 1.87f, 16.24f, 2.01f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micExternalOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
