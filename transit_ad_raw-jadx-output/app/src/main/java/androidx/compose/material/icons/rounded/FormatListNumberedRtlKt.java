package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import android.support.v4.media.a;
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

/* JADX INFO: compiled from: FormatListNumberedRtl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatListNumberedRtl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatListNumberedRtl", "Landroidx/compose/material/icons/Icons$Rounded;", "getFormatListNumberedRtl", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatListNumberedRtlKt {
    private static ImageVector _formatListNumberedRtl;

    public static final ImageVector getFormatListNumberedRtl(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _formatListNumberedRtl;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatListNumberedRtl", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(20.5f, 16.0f, -2.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.s(pathBuilderB, 20.0f, 17.0f, 0.5f, -0.5f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        a.s(pathBuilderB, 0.5f, 0.5f, -1.5f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderB.verticalLineToRelative(-3.0f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        androidx.compose.animation.b.r(pathBuilderB, 18.5f, 5.0f, 0.5f, 2.5f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderB.verticalLineToRelative(-3.0f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.horizontalLineToRelative(-1.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        androidx.compose.animation.a.n(pathBuilderB, 21.0f, 10.72f, -0.22f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.horizontalLineToRelative(-2.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderB.horizontalLineToRelative(1.3f);
        pathBuilderB.lineToRelative(-1.68f, 1.96f);
        pathBuilderB.curveToRelative(-0.08f, 0.09f, -0.12f, 0.21f, -0.12f, 0.32f);
        pathBuilderB.verticalLineToRelative(0.22f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderB.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.horizontalLineToRelative(-1.3f);
        pathBuilderB.lineToRelative(1.68f, -1.96f);
        pathBuilderB.curveToRelative(0.08f, -0.09f, 0.12f, -0.21f, 0.12f, -0.32f);
        androidx.compose.animation.a.t(pathBuilderB, 15.0f, 5.0f, 3.0f, 5.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        androidx.compose.animation.a.t(pathBuilderB, 15.0f, 17.0f, 3.0f, 17.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        androidx.compose.animation.a.t(pathBuilderB, 15.0f, 11.0f, 3.0f, 11.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderB, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListNumberedRtl = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
