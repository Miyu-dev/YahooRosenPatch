package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: AlarmOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_alarmOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlarmOff", "Landroidx/compose/material/icons/Icons$Filled;", "getAlarmOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AlarmOffKt {
    private static ImageVector _alarmOff;

    public static final ImageVector getAlarmOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AlarmOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, 0.84f, -0.16f, 1.65f, -0.43f, 2.4f);
        pathBuilderD.lineToRelative(1.52f, 1.52f);
        pathBuilderD.curveToRelative(0.58f, -1.19f, 0.91f, -2.51f, 0.91f, -3.92f);
        pathBuilderD.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilderD.curveToRelative(-1.41f, 0.0f, -2.73f, 0.33f, -3.92f, 0.91f);
        pathBuilderD.lineTo(9.6f, 6.43f);
        pathBuilderD.curveTo(10.35f, 6.16f, 11.16f, 6.0f, 12.0f, 6.0f);
        a.y(pathBuilderD, 22.0f, 5.72f, -4.6f, -3.86f);
        pathBuilderD.lineToRelative(-1.29f, 1.53f);
        s.r(pathBuilderD, 4.6f, 3.86f, 22.0f, 5.72f);
        pathBuilderD.moveTo(2.92f, 2.29f);
        pathBuilderD.lineTo(1.65f, 3.57f);
        pathBuilderD.lineTo(2.98f, 4.9f);
        pathBuilderD.lineToRelative(-1.11f, 0.93f);
        pathBuilderD.lineToRelative(1.42f, 1.42f);
        pathBuilderD.lineToRelative(1.11f, -0.94f);
        pathBuilderD.lineToRelative(0.8f, 0.8f);
        pathBuilderD.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilderD.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        pathBuilderD.lineToRelative(2.2f, 2.2f);
        pathBuilderD.lineToRelative(1.27f, -1.27f);
        androidx.compose.animation.a.A(pathBuilderD, 3.89f, 3.27f, -0.97f, -0.98f);
        pathBuilderD.moveTo(16.47f, 18.39f);
        pathBuilderD.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilderD.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.61f, -4.47f);
        android.support.v4.media.a.t(pathBuilderD, 9.86f, 9.86f, 8.02f, 3.28f);
        pathBuilderD.lineTo(6.6f, 1.86f);
        pathBuilderD.lineToRelative(-0.86f, 0.71f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, 1.42f, 1.42f, 0.86f, -0.71f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
