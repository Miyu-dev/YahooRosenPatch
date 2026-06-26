package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: EmergencyRecording.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergencyRecording", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyRecording", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmergencyRecording", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmergencyRecording", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(18.0f, 10.48f, 6.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderN.horizontalLineTo(4.0f);
        pathBuilderN.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilderN.verticalLineToRelative(12.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderN.horizontalLineToRelative(12.0f);
        pathBuilderN.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderN.verticalLineToRelative(-4.48f);
        pathBuilderN.lineToRelative(3.15f, 3.13f);
        pathBuilderN.curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f);
        pathBuilderN.verticalLineTo(7.7f);
        pathBuilderN.curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f);
        a.z(pathBuilderN, 18.0f, 10.48f, 14.5f, 14.6f);
        pathBuilderN.curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f);
        pathBuilderN.lineTo(11.0f, 13.73f);
        pathBuilderN.verticalLineTo(16.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-2.27f);
        pathBuilderN.lineToRelative(-2.13f, 1.23f);
        pathBuilderN.curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.37f);
        pathBuilderN.curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f);
        pathBuilderN.lineTo(8.0f, 12.0f);
        pathBuilderN.lineToRelative(-2.13f, -1.23f);
        pathBuilderN.curveTo(5.39f, 10.49f, 5.22f, 9.88f, 5.5f, 9.4f);
        pathBuilderN.curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f);
        pathBuilderN.lineTo(9.0f, 10.27f);
        pathBuilderN.verticalLineTo(8.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(2.27f);
        pathBuilderN.lineToRelative(2.13f, -1.23f);
        pathBuilderN.curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f);
        pathBuilderN.curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f);
        pathBuilderN.lineTo(12.0f, 12.0f);
        pathBuilderN.lineToRelative(2.13f, 1.23f);
        pathBuilderN.curveTo(14.61f, 13.51f, 14.78f, 14.12f, 14.5f, 14.6f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyRecording = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
