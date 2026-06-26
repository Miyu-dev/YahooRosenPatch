package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AppSettingsAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appSettingsAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppSettingsAlt", "Landroidx/compose/material/icons/Icons$Filled;", "getAppSettingsAlt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AppSettingsAltKt {
    private static ImageVector _appSettingsAlt;

    public static final ImageVector getAppSettingsAlt(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AppSettingsAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = androidx.appcompat.app.m.o(21.81f, 12.74f, -0.82f, -0.63f, -0.22f);
        pathBuilderO.lineToRelative(0.8f, -0.63f);
        pathBuilderO.curveToRelative(0.16f, -0.12f, 0.2f, -0.34f, 0.1f, -0.51f);
        pathBuilderO.lineToRelative(-0.85f, -1.48f);
        pathBuilderO.curveToRelative(-0.07f, -0.13f, -0.21f, -0.2f, -0.35f, -0.2f);
        pathBuilderO.curveToRelative(-0.05f, 0.0f, -0.1f, 0.01f, -0.15f, 0.03f);
        pathBuilderO.lineToRelative(-0.95f, 0.38f);
        pathBuilderO.curveToRelative(-0.08f, -0.05f, -0.11f, -0.07f, -0.19f, -0.11f);
        pathBuilderO.lineToRelative(-0.15f, -1.01f);
        pathBuilderO.curveToRelative(-0.03f, -0.21f, -0.2f, -0.36f, -0.4f, -0.36f);
        pathBuilderO.horizontalLineToRelative(-1.71f);
        pathBuilderO.curveToRelative(-0.2f, 0.0f, -0.37f, 0.15f, -0.4f, 0.34f);
        pathBuilderO.lineToRelative(-0.14f, 1.01f);
        pathBuilderO.curveToRelative(-0.03f, 0.02f, -0.07f, 0.03f, -0.1f, 0.05f);
        pathBuilderO.lineToRelative(-0.09f, 0.06f);
        pathBuilderO.lineToRelative(-0.95f, -0.38f);
        pathBuilderO.curveToRelative(-0.05f, -0.02f, -0.1f, -0.03f, -0.15f, -0.03f);
        pathBuilderO.curveToRelative(-0.14f, 0.0f, -0.27f, 0.07f, -0.35f, 0.2f);
        pathBuilderO.lineToRelative(-0.85f, 1.48f);
        pathBuilderO.curveToRelative(-0.1f, 0.17f, -0.06f, 0.39f, 0.1f, 0.51f);
        pathBuilderO.lineToRelative(0.8f, 0.63f);
        pathBuilderO.verticalLineToRelative(0.23f);
        pathBuilderO.lineToRelative(-0.8f, 0.63f);
        pathBuilderO.curveToRelative(-0.16f, 0.12f, -0.2f, 0.34f, -0.1f, 0.51f);
        pathBuilderO.lineToRelative(0.85f, 1.48f);
        pathBuilderO.curveToRelative(0.07f, 0.13f, 0.21f, 0.2f, 0.35f, 0.2f);
        pathBuilderO.curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.15f, -0.03f);
        pathBuilderO.lineToRelative(0.95f, -0.37f);
        pathBuilderO.curveToRelative(0.08f, 0.05f, 0.12f, 0.07f, 0.2f, 0.11f);
        pathBuilderO.lineToRelative(0.15f, 1.01f);
        pathBuilderO.curveToRelative(0.03f, 0.2f, 0.2f, 0.34f, 0.4f, 0.34f);
        pathBuilderO.horizontalLineToRelative(1.71f);
        pathBuilderO.curveToRelative(0.2f, 0.0f, 0.37f, -0.15f, 0.4f, -0.34f);
        pathBuilderO.lineToRelative(0.15f, -1.01f);
        pathBuilderO.curveToRelative(0.03f, -0.02f, 0.07f, -0.03f, 0.1f, -0.05f);
        pathBuilderO.lineToRelative(0.09f, -0.06f);
        pathBuilderO.lineToRelative(0.95f, 0.38f);
        pathBuilderO.curveToRelative(0.05f, 0.02f, 0.1f, 0.03f, 0.15f, 0.03f);
        pathBuilderO.curveToRelative(0.14f, 0.0f, 0.27f, -0.07f, 0.35f, -0.2f);
        pathBuilderO.lineToRelative(0.85f, -1.48f);
        pathBuilderO.curveToRelative(0.1f, -0.17f, 0.06f, -0.39f, -0.1f, -0.51f);
        pathBuilderO.close();
        pathBuilderO.moveTo(18.0f, 13.5f);
        pathBuilderO.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderO.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderO.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderO.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        b.r(pathBuilderO, 17.0f, 17.0f, 2.0f, 4.0f);
        pathBuilderO.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderO.horizontalLineTo(7.0f);
        pathBuilderO.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderO.verticalLineTo(3.0f);
        pathBuilderO.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderO.horizontalLineToRelative(10.0f);
        pathBuilderO.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        s.m(pathBuilderO, 4.0f, -2.0f, 6.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.j(pathBuilderO, 12.0f, 10.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appSettingsAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
