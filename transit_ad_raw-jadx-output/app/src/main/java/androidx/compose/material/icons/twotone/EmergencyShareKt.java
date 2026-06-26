package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: EmergencyShare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergencyShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmergencyShare", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEmergencyShare", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmergencyShareKt {
    private static ImageVector _emergencyShare;

    public static final ImageVector getEmergencyShare(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _emergencyShare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmergencyShare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 11.0f);
        pathBuilderD.curveToRelative(-1.94f, 0.0f, -4.0f, 1.45f, -4.0f, 4.15f);
        pathBuilderD.curveToRelative(0.0f, 0.94f, 0.55f, 2.93f, 4.0f, 6.17f);
        pathBuilderD.curveToRelative(3.45f, -3.24f, 4.0f, -5.23f, 4.0f, -6.17f);
        pathBuilderD.curveTo(16.0f, 12.45f, 13.94f, 11.0f, 12.0f, 11.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 16.5f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 12.83f, 16.5f, 12.0f, 16.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 4.0f);
        pathBuilderD2.curveToRelative(1.93f, 0.0f, 3.68f, 0.78f, 4.95f, 2.05f);
        pathBuilderD2.lineToRelative(-1.41f, 1.41f);
        pathBuilderD2.curveTo(14.63f, 6.56f, 13.38f, 6.0f, 12.0f, 6.0f);
        pathBuilderD2.reflectiveCurveTo(9.37f, 6.56f, 8.46f, 7.46f);
        pathBuilderD2.lineTo(7.05f, 6.05f);
        pathBuilderD2.curveTo(8.32f, 4.78f, 10.07f, 4.0f, 12.0f, 4.0f);
        a.y(pathBuilderD2, 19.78f, 3.23f, -1.41f, 1.41f);
        pathBuilderD2.curveTo(16.74f, 3.01f, 14.49f, 2.0f, 12.01f, 2.0f);
        pathBuilderD2.reflectiveCurveTo(7.27f, 3.01f, 5.64f, 4.63f);
        pathBuilderD2.lineTo(4.22f, 3.22f);
        pathBuilderD2.curveTo(6.22f, 1.23f, 8.97f, 0.0f, 12.01f, 0.0f);
        pathBuilderD2.reflectiveCurveTo(17.79f, 1.23f, 19.78f, 3.23f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(12.0f, 11.0f);
        pathBuilderD2.curveToRelative(1.94f, 0.0f, 4.0f, 1.45f, 4.0f, 4.15f);
        pathBuilderD2.curveToRelative(0.0f, 0.94f, -0.55f, 2.93f, -4.0f, 6.17f);
        pathBuilderD2.curveToRelative(-3.45f, -3.24f, -4.0f, -5.23f, -4.0f, -6.17f);
        pathBuilderD2.curveTo(8.0f, 12.45f, 10.06f, 11.0f, 12.0f, 11.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(12.0f, 9.0f);
        pathBuilderD2.curveToRelative(-3.15f, 0.0f, -6.0f, 2.41f, -6.0f, 6.15f);
        pathBuilderD2.curveToRelative(0.0f, 2.49f, 2.0f, 5.44f, 6.0f, 8.85f);
        pathBuilderD2.curveToRelative(4.0f, -3.41f, 6.0f, -6.36f, 6.0f, -8.85f);
        pathBuilderD2.curveTo(18.0f, 11.41f, 15.15f, 9.0f, 12.0f, 9.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(13.5f, 15.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderD2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderD2.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD2.curveTo(12.83f, 16.5f, 13.5f, 15.83f, 13.5f, 15.0f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyShare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
