package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AppSettingsAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appSettingsAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppSettingsAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppSettingsAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AppSettingsAltKt {
    private static ImageVector _appSettingsAlt;

    public static final ImageVector getAppSettingsAlt(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AppSettingsAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderG = androidx.appcompat.app.m.g(17.0f, 18.0f, 7.0f, 6.0f, 10.0f);
        s.l(pathBuilderG, 1.0f, 2.0f, 3.0f);
        pathBuilderG.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderG.lineTo(7.0f, 1.01f);
        pathBuilderG.curveTo(5.9f, 1.01f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilderG.verticalLineToRelative(18.0f);
        pathBuilderG.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderG.horizontalLineToRelative(10.0f);
        pathBuilderG.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.h(pathBuilderG, -4.0f, -2.0f, 18.0f);
        pathBuilderG.moveTo(21.0f, 12.0f);
        pathBuilderG.curveToRelative(0.0f, -0.13f, -0.02f, -0.26f, -0.04f, -0.39f);
        pathBuilderG.lineToRelative(0.64f, -0.48f);
        pathBuilderG.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilderG.lineToRelative(-0.57f, -0.96f);
        pathBuilderG.curveToRelative(-0.13f, -0.21f, -0.39f, -0.3f, -0.62f, -0.2f);
        pathBuilderG.lineToRelative(-0.72f, 0.3f);
        pathBuilderG.curveToRelative(-0.2f, -0.15f, -0.42f, -0.29f, -0.65f, -0.39f);
        pathBuilderG.lineToRelative(-0.1f, -0.77f);
        pathBuilderG.curveToRelative(-0.03f, -0.25f, -0.24f, -0.43f, -0.49f, -0.44f);
        pathBuilderG.lineToRelative(-1.12f, -0.02f);
        pathBuilderG.curveToRelative(-0.26f, 0.0f, -0.47f, 0.18f, -0.5f, 0.44f);
        pathBuilderG.lineToRelative(-0.1f, 0.79f);
        pathBuilderG.curveToRelative(-0.24f, 0.1f, -0.45f, 0.23f, -0.65f, 0.39f);
        pathBuilderG.lineToRelative(-0.72f, -0.3f);
        pathBuilderG.curveToRelative(-0.23f, -0.1f, -0.5f, -0.01f, -0.62f, 0.2f);
        pathBuilderG.lineToRelative(-0.57f, 0.96f);
        pathBuilderG.curveToRelative(-0.13f, 0.22f, -0.08f, 0.5f, 0.13f, 0.66f);
        pathBuilderG.lineToRelative(0.64f, 0.48f);
        pathBuilderG.curveTo(15.02f, 11.74f, 15.0f, 11.87f, 15.0f, 12.0f);
        pathBuilderG.curveToRelative(0.0f, 0.13f, 0.02f, 0.25f, 0.04f, 0.37f);
        pathBuilderG.lineToRelative(-0.64f, 0.49f);
        pathBuilderG.curveToRelative(-0.2f, 0.15f, -0.26f, 0.43f, -0.13f, 0.65f);
        pathBuilderG.lineToRelative(0.56f, 0.97f);
        pathBuilderG.curveToRelative(0.13f, 0.22f, 0.39f, 0.31f, 0.63f, 0.21f);
        pathBuilderG.lineToRelative(0.73f, -0.31f);
        pathBuilderG.curveToRelative(0.2f, 0.16f, 0.42f, 0.3f, 0.67f, 0.4f);
        pathBuilderG.lineToRelative(0.1f, 0.77f);
        pathBuilderG.curveToRelative(0.03f, 0.25f, 0.24f, 0.44f, 0.5f, 0.44f);
        pathBuilderG.horizontalLineToRelative(1.12f);
        pathBuilderG.curveToRelative(0.25f, 0.0f, 0.46f, -0.19f, 0.5f, -0.44f);
        pathBuilderG.lineToRelative(0.1f, -0.77f);
        pathBuilderG.curveToRelative(0.24f, -0.1f, 0.46f, -0.24f, 0.67f, -0.4f);
        pathBuilderG.lineToRelative(0.73f, 0.31f);
        pathBuilderG.curveToRelative(0.23f, 0.1f, 0.5f, 0.01f, 0.63f, -0.21f);
        pathBuilderG.lineToRelative(0.56f, -0.97f);
        pathBuilderG.curveToRelative(0.13f, -0.22f, 0.07f, -0.5f, -0.13f, -0.65f);
        pathBuilderG.lineToRelative(-0.64f, -0.49f);
        pathBuilderG.curveTo(20.98f, 12.25f, 21.0f, 12.13f, 21.0f, 12.0f);
        pathBuilderG.close();
        pathBuilderG.moveTo(18.0f, 13.5f);
        pathBuilderG.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderG.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderG.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderG, 18.83f, 13.5f, 18.0f, 13.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appSettingsAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
