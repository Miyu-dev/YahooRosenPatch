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

/* JADX INFO: compiled from: TouchApp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_touchApp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TouchApp", "Landroidx/compose/material/icons/Icons$Filled;", "getTouchApp", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TouchApp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(9.0f, 11.24f, 7.5f);
        pathBuilderN.curveTo(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
        pathBuilderN.reflectiveCurveTo(14.0f, 6.12f, 14.0f, 7.5f);
        pathBuilderN.verticalLineToRelative(3.74f);
        pathBuilderN.curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        pathBuilderN.curveTo(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
        pathBuilderN.reflectiveCurveTo(7.0f, 5.01f, 7.0f, 7.5f);
        pathBuilderN.curveTo(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
        a.y(pathBuilderN, 18.84f, 15.87f, -4.54f, -2.26f);
        pathBuilderN.curveToRelative(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
        pathBuilderN.horizontalLineTo(13.0f);
        pathBuilderN.verticalLineToRelative(-6.0f);
        pathBuilderN.curveTo(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
        pathBuilderN.reflectiveCurveTo(10.0f, 6.67f, 10.0f, 7.5f);
        pathBuilderN.verticalLineToRelative(10.74f);
        pathBuilderN.curveToRelative(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
        pathBuilderN.curveToRelative(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f);
        pathBuilderN.lineToRelative(-0.79f, 0.8f);
        pathBuilderN.lineToRelative(4.94f, 4.94f);
        pathBuilderN.curveTo(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
        pathBuilderN.horizontalLineToRelative(6.79f);
        pathBuilderN.curveToRelative(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f);
        pathBuilderN.lineToRelative(0.75f, -5.27f);
        pathBuilderN.curveToRelative(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
        pathBuilderN.curveTo(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
