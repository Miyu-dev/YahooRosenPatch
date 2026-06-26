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

/* JADX INFO: compiled from: Looks.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_looks", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Looks", "Landroidx/compose/material/icons/Icons$Rounded;", "getLooks", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LooksKt {
    private static ImageVector _looks;

    public static final ImageVector getLooks(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _looks;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Looks", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 10.0f);
        pathBuilderD.curveToRelative(-3.47f, 0.0f, -6.36f, 2.54f, -6.91f, 5.86f);
        pathBuilderD.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        pathBuilderD.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilderD.curveTo(7.48f, 13.79f, 9.53f, 12.0f, 12.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f);
        pathBuilderD.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        pathBuilderD.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.14f);
        pathBuilderD.curveTo(18.36f, 12.54f, 15.47f, 10.0f, 12.0f, 10.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 6.0f);
        pathBuilderD.curveTo(6.3f, 6.0f, 1.61f, 10.34f, 1.05f, 15.9f);
        pathBuilderD.curveToRelative(-0.05f, 0.59f, 0.41f, 1.1f, 1.01f, 1.1f);
        pathBuilderD.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        pathBuilderD.curveTo(3.49f, 11.57f, 7.34f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.51f, 3.57f, 8.96f, 8.12f);
        pathBuilderD.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        pathBuilderD.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        pathBuilderD.curveTo(22.39f, 10.34f, 17.7f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _looks = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
