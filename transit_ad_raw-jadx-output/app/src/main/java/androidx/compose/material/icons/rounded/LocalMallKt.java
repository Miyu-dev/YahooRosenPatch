package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LocalMall.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localMall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalMall", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalMall", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalMallKt {
    private static ImageVector _localMall;

    public static final ImageVector getLocalMall(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _localMall;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalMall", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(19.0f, 6.0f, -2.0f);
        pathBuilderB.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderB.reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f);
        pathBuilderB.lineTo(5.0f, 6.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.lineTo(21.0f, 8.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 3.0f);
        pathBuilderB.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderB.lineTo(9.0f, 6.0f);
        pathBuilderB.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 13.0f);
        pathBuilderB.curveToRelative(-2.33f, 0.0f, -4.29f, -1.59f, -4.84f, -3.75f);
        pathBuilderB.curveToRelative(-0.17f, -0.63f, 0.32f, -1.25f, 0.97f, -1.25f);
        pathBuilderB.curveToRelative(0.47f, 0.0f, 0.85f, 0.34f, 0.98f, 0.8f);
        pathBuilderB.curveToRelative(0.35f, 1.27f, 1.51f, 2.2f, 2.89f, 2.2f);
        pathBuilderB.reflectiveCurveToRelative(2.54f, -0.93f, 2.89f, -2.2f);
        pathBuilderB.curveToRelative(0.13f, -0.46f, 0.51f, -0.8f, 0.98f, -0.8f);
        pathBuilderB.curveToRelative(0.65f, 0.0f, 1.13f, 0.62f, 0.97f, 1.25f);
        pathBuilderB.curveTo(16.29f, 11.41f, 14.33f, 13.0f, 12.0f, 13.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localMall = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
