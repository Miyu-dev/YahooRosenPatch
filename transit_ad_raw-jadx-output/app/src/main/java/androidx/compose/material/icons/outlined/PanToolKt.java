package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: PanTool.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panTool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanTool", "Landroidx/compose/material/icons/Icons$Outlined;", "getPanTool", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanTool", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(18.0f, 24.0f, -6.55f);
        pathBuilderB.curveToRelative(-1.08f, 0.0f, -2.14f, -0.45f, -2.89f, -1.23f);
        pathBuilderB.lineToRelative(-7.3f, -7.61f);
        pathBuilderB.lineToRelative(2.07f, -1.83f);
        pathBuilderB.curveToRelative(0.62f, -0.55f, 1.53f, -0.66f, 2.26f, -0.27f);
        pathBuilderB.lineTo(8.0f, 14.34f);
        pathBuilderB.verticalLineTo(4.79f);
        pathBuilderB.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderB.curveToRelative(0.17f, 0.0f, 0.34f, 0.02f, 0.51f, 0.05f);
        pathBuilderB.curveToRelative(0.09f, -1.3f, 1.17f, -2.33f, 2.49f, -2.33f);
        pathBuilderB.curveToRelative(0.86f, 0.0f, 1.61f, 0.43f, 2.06f, 1.09f);
        pathBuilderB.curveToRelative(0.29f, -0.12f, 0.61f, -0.18f, 0.94f, -0.18f);
        pathBuilderB.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderB.verticalLineToRelative(0.28f);
        pathBuilderB.curveToRelative(0.16f, -0.03f, 0.33f, -0.05f, 0.5f, -0.05f);
        pathBuilderB.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderB.verticalLineTo(20.0f);
        pathBuilderB.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        a.y(pathBuilderB, 4.14f, 15.28f, 5.86f, 6.1f);
        pathBuilderB.curveToRelative(0.38f, 0.39f, 0.9f, 0.62f, 1.44f, 0.62f);
        pathBuilderB.horizontalLineTo(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.15f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        h.w(pathBuilderB, 12.0f, -2.0f, 3.42f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        h.w(pathBuilderB, 12.0f, -2.0f, 2.51f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        h.w(pathBuilderB, 12.0f, -2.0f, 4.79f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.reflectiveCurveToRelative(-0.5f, 0.23f, -0.5f, 0.5f);
        pathBuilderB.verticalLineToRelative(12.87f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderB, -5.35f, -2.83f, -0.51f, 0.45f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
