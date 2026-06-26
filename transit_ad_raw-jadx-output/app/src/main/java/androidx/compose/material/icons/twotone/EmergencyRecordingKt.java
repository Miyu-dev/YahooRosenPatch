package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EmergencyRecording.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergencyRecording", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyRecording", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEmergencyRecording", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmergencyRecording", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(4.0f, 6.0f, 12.0f, 12.0f, 6.0f);
        b.w(pathBuilderV, 4.0f, 15.0f, 13.73f);
        pathBuilderV.lineToRelative(-1.0f, 1.73f);
        e.f(pathBuilderV, -3.0f, -1.73f, 17.0f, 9.0f);
        pathBuilderV.verticalLineToRelative(-3.27f);
        pathBuilderV.lineToRelative(-3.0f, 1.73f);
        pathBuilderV.lineToRelative(-1.0f, -1.73f);
        pathBuilderV.lineTo(8.0f, 12.0f);
        pathBuilderV.lineToRelative(-3.0f, -1.73f);
        pathBuilderV.lineToRelative(1.0f, -1.73f);
        s.D(pathBuilderV, 3.0f, 1.73f, 7.0f, 2.0f);
        pathBuilderV.verticalLineToRelative(3.27f);
        pathBuilderV.lineToRelative(3.0f, -1.73f);
        pathBuilderV.lineToRelative(1.0f, 1.73f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderV, 12.0f, 12.0f, 15.0f, 13.73f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(18.0f, 10.48f, 6.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderN.horizontalLineTo(4.0f);
        pathBuilderN.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilderN.verticalLineToRelative(12.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderN.horizontalLineToRelative(12.0f);
        pathBuilderN.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.q(pathBuilderN, -4.48f, 4.0f, 3.98f, -11.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderN, 18.0f, 10.48f, 16.0f, 18.0f);
        h.x(pathBuilderN, 4.0f, 6.0f, 12.0f, 18.0f);
        pathBuilderN.moveTo(12.0f, 12.0f);
        pathBuilderN.lineToRelative(3.0f, 1.73f);
        pathBuilderN.lineToRelative(-1.0f, 1.73f);
        e.f(pathBuilderN, -3.0f, -1.73f, 17.0f, 9.0f);
        pathBuilderN.verticalLineToRelative(-3.27f);
        pathBuilderN.lineToRelative(-3.0f, 1.73f);
        pathBuilderN.lineToRelative(-1.0f, -1.73f);
        pathBuilderN.lineTo(8.0f, 12.0f);
        pathBuilderN.lineToRelative(-3.0f, -1.73f);
        pathBuilderN.lineToRelative(1.0f, -1.73f);
        s.D(pathBuilderN, 3.0f, 1.73f, 7.0f, 2.0f);
        pathBuilderN.verticalLineToRelative(3.27f);
        pathBuilderN.lineToRelative(3.0f, -1.73f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderN, 1.0f, 1.73f, 12.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyRecording = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
