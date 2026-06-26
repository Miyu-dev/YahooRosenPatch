package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: SafetyDivider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_safetyDivider", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SafetyDivider", "Landroidx/compose/material/icons/Icons$Rounded;", "getSafetyDivider", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SafetyDividerKt {
    private static ImageVector _safetyDivider;

    public static final ImageVector getSafetyDivider(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _safetyDivider;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SafetyDivider", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(11.0f, 5.0f, 2.0f, 14.0f, -2.0f);
        android.support.v4.media.a.y(pathBuilderF, 5.0f, 5.0f, 12.0f);
        pathBuilderF.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderF.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderF.curveTo(3.0f, 11.1f, 3.9f, 12.0f, 5.0f, 12.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(7.78f, 13.58f);
        pathBuilderF.curveTo(6.93f, 13.21f, 5.99f, 13.0f, 5.0f, 13.0f);
        pathBuilderF.reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilderF.curveTo(1.48f, 13.9f, 1.0f, 14.62f, 1.0f, 15.43f);
        pathBuilderF.lineTo(1.0f, 16.0f);
        pathBuilderF.horizontalLineToRelative(8.0f);
        pathBuilderF.lineToRelative(0.0f, -0.57f);
        pathBuilderF.curveTo(9.0f, 14.62f, 8.52f, 13.9f, 7.78f, 13.58f);
        pathBuilderF.close();
        pathBuilderF.moveTo(19.0f, 12.0f);
        pathBuilderF.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderF.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderF.curveTo(17.0f, 11.1f, 17.9f, 12.0f, 19.0f, 12.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(21.78f, 13.58f);
        pathBuilderF.curveTo(20.93f, 13.21f, 19.99f, 13.0f, 19.0f, 13.0f);
        pathBuilderF.reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilderF.curveTo(15.48f, 13.9f, 15.0f, 14.62f, 15.0f, 15.43f);
        pathBuilderF.lineTo(15.0f, 16.0f);
        pathBuilderF.horizontalLineToRelative(8.0f);
        pathBuilderF.lineToRelative(0.0f, -0.57f);
        pathBuilderF.curveTo(23.0f, 14.62f, 22.52f, 13.9f, 21.78f, 13.58f);
        pathBuilderF.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderF.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _safetyDivider = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
