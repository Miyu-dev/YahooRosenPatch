package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SettingsApplications.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsApplications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsApplications", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsApplications", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsApplications", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 12.0f, -2.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = s.b(19.0f, 3.0f, 5.0f);
        pathBuilderB2.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderB2.verticalLineToRelative(14.0f);
        pathBuilderB2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderB2.horizontalLineToRelative(14.0f);
        pathBuilderB2.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB2.verticalLineTo(5.0f);
        pathBuilderB2.curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f);
        pathBuilderB2.close();
        pathBuilderB2.moveTo(15.75f, 12.0f);
        pathBuilderB2.curveToRelative(0.0f, 0.22f, -0.03f, 0.42f, -0.06f, 0.63f);
        pathBuilderB2.lineToRelative(0.84f, 0.73f);
        pathBuilderB2.curveToRelative(0.18f, 0.16f, 0.22f, 0.42f, 0.1f, 0.63f);
        pathBuilderB2.lineToRelative(-0.59f, 1.02f);
        pathBuilderB2.curveToRelative(-0.12f, 0.21f, -0.37f, 0.3f, -0.59f, 0.22f);
        pathBuilderB2.lineToRelative(-1.06f, -0.36f);
        pathBuilderB2.curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f);
        pathBuilderB2.lineToRelative(-0.22f, 1.09f);
        pathBuilderB2.curveToRelative(-0.05f, 0.23f, -0.25f, 0.4f, -0.49f, 0.4f);
        pathBuilderB2.horizontalLineToRelative(-1.18f);
        pathBuilderB2.curveToRelative(-0.24f, 0.0f, -0.44f, -0.17f, -0.49f, -0.4f);
        pathBuilderB2.lineToRelative(-0.22f, -1.09f);
        pathBuilderB2.curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f);
        pathBuilderB2.lineToRelative(-1.06f, 0.36f);
        pathBuilderB2.curveToRelative(-0.23f, 0.08f, -0.47f, -0.02f, -0.59f, -0.22f);
        pathBuilderB2.lineToRelative(-0.59f, -1.02f);
        pathBuilderB2.curveToRelative(-0.12f, -0.21f, -0.08f, -0.47f, 0.1f, -0.63f);
        pathBuilderB2.lineToRelative(0.84f, -0.73f);
        pathBuilderB2.curveTo(8.28f, 12.42f, 8.25f, 12.22f, 8.25f, 12.0f);
        pathBuilderB2.reflectiveCurveToRelative(0.03f, -0.42f, 0.06f, -0.63f);
        pathBuilderB2.lineToRelative(-0.84f, -0.73f);
        pathBuilderB2.curveToRelative(-0.18f, -0.16f, -0.22f, -0.42f, -0.1f, -0.63f);
        pathBuilderB2.lineToRelative(0.59f, -1.02f);
        pathBuilderB2.curveToRelative(0.12f, -0.21f, 0.37f, -0.3f, 0.59f, -0.22f);
        pathBuilderB2.lineToRelative(1.06f, 0.36f);
        pathBuilderB2.curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f);
        pathBuilderB2.lineToRelative(0.22f, -1.09f);
        pathBuilderB2.curveTo(10.97f, 7.17f, 11.17f, 7.0f, 11.41f, 7.0f);
        pathBuilderB2.horizontalLineToRelative(1.18f);
        pathBuilderB2.curveToRelative(0.24f, 0.0f, 0.44f, 0.17f, 0.49f, 0.4f);
        pathBuilderB2.lineToRelative(0.22f, 1.09f);
        pathBuilderB2.curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f);
        pathBuilderB2.lineToRelative(1.06f, -0.36f);
        pathBuilderB2.curveToRelative(0.23f, -0.08f, 0.47f, 0.02f, 0.59f, 0.22f);
        pathBuilderB2.lineToRelative(0.59f, 1.02f);
        pathBuilderB2.curveToRelative(0.12f, 0.21f, 0.08f, 0.47f, -0.1f, 0.63f);
        pathBuilderB2.lineToRelative(-0.84f, 0.73f);
        pathBuilderB2.curveTo(15.72f, 11.58f, 15.75f, 11.78f, 15.75f, 12.0f);
        pathBuilderB2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
