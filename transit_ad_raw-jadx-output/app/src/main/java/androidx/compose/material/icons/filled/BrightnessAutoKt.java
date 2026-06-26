package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
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

/* JADX INFO: compiled from: BrightnessAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightnessAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrightnessAuto", "Landroidx/compose/material/icons/Icons$Filled;", "getBrightnessAuto", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrightnessAutoKt {
    private static ImageVector _brightnessAuto;

    public static final ImageVector getBrightnessAuto(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _brightnessAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BrightnessAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(10.85f, 12.65f, 2.3f, 12.0f, 9.0f);
        a.t(pathBuilderC, -1.15f, 3.65f, 20.0f, 8.69f);
        pathBuilderC.verticalLineTo(4.0f);
        pathBuilderC.horizontalLineToRelative(-4.69f);
        pathBuilderC.lineTo(12.0f, 0.69f);
        h.n(pathBuilderC, 8.69f, 4.0f, 4.0f, 4.69f);
        pathBuilderC.lineTo(0.69f, 12.0f);
        androidx.appcompat.app.m.r(pathBuilderC, 4.0f, 15.31f, 20.0f, 4.69f);
        pathBuilderC.lineTo(12.0f, 23.31f);
        h.n(pathBuilderC, 15.31f, 20.0f, 20.0f, -4.69f);
        a.C(pathBuilderC, 23.31f, 12.0f, 20.0f, 8.69f);
        pathBuilderC.moveTo(14.3f, 16.0f);
        pathBuilderC.lineToRelative(-0.7f, -2.0f);
        androidx.compose.animation.a.C(pathBuilderC, -3.2f, -0.7f, 2.0f, 7.8f);
        pathBuilderC.lineTo(11.0f, 7.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineToRelative(3.2f, 9.0f);
        pathBuilderC.horizontalLineToRelative(-1.9f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
