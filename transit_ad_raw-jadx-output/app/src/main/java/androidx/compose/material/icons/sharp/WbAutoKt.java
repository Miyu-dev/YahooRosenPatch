package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: WbAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbAuto", "Landroidx/compose/material/icons/Icons$Sharp;", "getWbAuto", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbAutoKt {
    private static ImageVector _wbAuto;

    public static final ImageVector getWbAuto(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _wbAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WbAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(6.85f, 12.65f, 2.3f, 8.0f, 9.0f);
        a.t(pathBuilderC, -1.15f, 3.65f, 22.0f, 7.0f);
        pathBuilderC.lineToRelative(-1.2f, 6.29f);
        pathBuilderC.lineTo(19.3f, 7.0f);
        pathBuilderC.horizontalLineToRelative(-1.6f);
        pathBuilderC.lineToRelative(-1.49f, 6.29f);
        pathBuilderC.lineTo(15.0f, 7.0f);
        pathBuilderC.horizontalLineToRelative(-0.76f);
        pathBuilderC.curveTo(12.77f, 5.17f, 10.53f, 4.0f, 8.0f, 4.0f);
        pathBuilderC.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderC.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilderC.curveToRelative(3.13f, 0.0f, 5.84f, -1.81f, 7.15f, -4.43f);
        pathBuilderC.lineToRelative(0.1f, 0.43f);
        pathBuilderC.lineTo(17.0f, 16.0f);
        pathBuilderC.lineToRelative(1.5f, -6.1f);
        pathBuilderC.lineTo(20.0f, 16.0f);
        pathBuilderC.horizontalLineToRelative(1.75f);
        s.r(pathBuilderC, 2.05f, -9.0f, 22.0f, 7.0f);
        pathBuilderC.moveTo(10.3f, 16.0f);
        pathBuilderC.lineToRelative(-0.7f, -2.0f);
        pathBuilderC.lineTo(6.4f, 14.0f);
        pathBuilderC.lineToRelative(-0.7f, 2.0f);
        pathBuilderC.lineTo(3.8f, 16.0f);
        pathBuilderC.lineTo(7.0f, 7.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineToRelative(3.2f, 9.0f);
        pathBuilderC.horizontalLineToRelative(-1.9f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
