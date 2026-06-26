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

/* JADX INFO: compiled from: HeatPump.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_heatPump", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeatPump", "Landroidx/compose/material/icons/Icons$Sharp;", "getHeatPump", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HeatPumpKt {
    private static ImageVector _heatPump;

    public static final ImageVector getHeatPump(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeatPump", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        a.y(pathBuilderO, 3.0f, 12.75f, 7.08f);
        pathBuilderO.curveToRelative(0.82f, 0.12f, 1.57f, 0.44f, 2.2f, 0.91f);
        c.a.g(pathBuilderO, -2.2f, 2.2f, 7.08f);
        pathBuilderO.moveTo(11.25f, 7.08f);
        pathBuilderO.verticalLineToRelative(3.11f);
        pathBuilderO.lineToRelative(-2.2f, -2.2f);
        pathBuilderO.curveTo(9.68f, 7.52f, 10.43f, 7.2f, 11.25f, 7.08f);
        androidx.browser.browseractions.a.y(pathBuilderO, 7.99f, 9.05f, 2.2f, 2.2f);
        pathBuilderO.horizontalLineTo(7.08f);
        pathBuilderO.curveTo(7.2f, 10.43f, 7.52f, 9.68f, 7.99f, 9.05f);
        androidx.compose.animation.a.j(pathBuilderO, 7.08f, 12.75f, 3.11f);
        pathBuilderO.lineToRelative(-2.2f, 2.2f);
        pathBuilderO.curveTo(7.52f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f);
        pathBuilderO.close();
        pathBuilderO.moveTo(11.25f, 16.92f);
        pathBuilderO.curveToRelative(-0.82f, -0.12f, -1.57f, -0.44f, -2.2f, -0.91f);
        c.a.g(pathBuilderO, 2.2f, -2.2f, 16.92f);
        pathBuilderO.moveTo(12.0f, 13.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderO.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderO.curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f);
        androidx.compose.animation.a.n(pathBuilderO, 12.75f, 16.92f, -3.11f);
        pathBuilderO.lineToRelative(2.2f, 2.2f);
        pathBuilderO.curveTo(14.32f, 16.48f, 13.57f, 16.8f, 12.75f, 16.92f);
        androidx.browser.browseractions.a.y(pathBuilderO, 16.01f, 14.95f, -2.2f, -2.2f);
        pathBuilderO.horizontalLineToRelative(3.11f);
        pathBuilderO.curveTo(16.8f, 13.57f, 16.48f, 14.32f, 16.01f, 14.95f);
        androidx.browser.browseractions.a.y(pathBuilderO, 13.81f, 11.25f, 2.2f, -2.2f);
        pathBuilderO.curveToRelative(0.47f, 0.64f, 0.79f, 1.39f, 0.91f, 2.2f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderO, 13.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heatPump = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
