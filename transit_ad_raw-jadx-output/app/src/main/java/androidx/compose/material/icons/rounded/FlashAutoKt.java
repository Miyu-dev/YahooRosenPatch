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

/* JADX INFO: compiled from: FlashAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flashAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlashAuto", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlashAuto", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FlashAutoKt {
    private static ImageVector _flashAuto;

    public static final ImageVector getFlashAuto(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _flashAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlashAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(3.0f, 3.0f, 10.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderE.horizontalLineToRelative(2.0f);
        pathBuilderE.verticalLineToRelative(7.15f);
        pathBuilderE.curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f);
        pathBuilderE.lineToRelative(5.19f, -8.9f);
        pathBuilderE.curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f);
        pathBuilderE.lineTo(9.0f, 11.0f);
        pathBuilderE.lineToRelative(3.38f, -7.59f);
        pathBuilderE.curveToRelative(0.29f, -0.67f, -0.2f, -1.41f, -0.92f, -1.41f);
        pathBuilderE.lineTo(4.0f, 2.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(18.0f, 2.0f);
        pathBuilderE.curveToRelative(-0.6f, 0.0f, -1.13f, 0.38f, -1.34f, 0.94f);
        pathBuilderE.lineTo(14.22f, 9.8f);
        pathBuilderE.curveToRelative(-0.2f, 0.59f, 0.23f, 1.2f, 0.85f, 1.2f);
        pathBuilderE.curveToRelative(0.38f, 0.0f, 0.72f, -0.24f, 0.84f, -0.6f);
        pathBuilderE.lineTo(16.4f, 9.0f);
        pathBuilderE.horizontalLineToRelative(3.2f);
        pathBuilderE.lineToRelative(0.49f, 1.4f);
        pathBuilderE.curveToRelative(0.13f, 0.36f, 0.46f, 0.6f, 0.84f, 0.6f);
        pathBuilderE.curveToRelative(0.62f, 0.0f, 1.05f, -0.61f, 0.84f, -1.19f);
        pathBuilderE.lineToRelative(-2.44f, -6.86f);
        pathBuilderE.curveTo(19.13f, 2.38f, 18.6f, 2.0f, 18.0f, 2.0f);
        a.t(pathBuilderE, 16.85f, 7.65f, 18.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.h(pathBuilderE, 1.15f, 3.65f, -2.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
