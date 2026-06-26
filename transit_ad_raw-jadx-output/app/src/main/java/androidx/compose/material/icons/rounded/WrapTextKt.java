package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: WrapText.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wrapText", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WrapText", "Landroidx/compose/material/icons/Icons$Rounded;", "getWrapText", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WrapTextKt {
    private static ImageVector _wrapText;

    public static final ImageVector getWrapText(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _wrapText;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WrapText", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(5.0f, 7.0f, 14.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderB.lineTo(5.0f, 5.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.t(pathBuilderB, 16.83f, 11.0f, 5.0f, 11.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(12.13f);
        pathBuilderB.curveToRelative(1.0f, 0.0f, 1.93f, 0.67f, 2.09f, 1.66f);
        pathBuilderB.curveToRelative(0.21f, 1.25f, -0.76f, 2.34f, -1.97f, 2.34f);
        pathBuilderB.lineTo(15.0f, 17.0f);
        pathBuilderB.verticalLineToRelative(-0.79f);
        pathBuilderB.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderB.lineToRelative(-1.79f, 1.79f);
        pathBuilderB.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderB.lineToRelative(1.79f, 1.79f);
        pathBuilderB.curveToRelative(0.32f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f);
        pathBuilderB.lineTo(15.0f, 19.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(2.34f, 0.0f, 4.21f, -2.01f, 3.98f, -4.39f);
        pathBuilderB.curveToRelative(-0.2f, -2.08f, -2.06f, -3.61f, -4.15f, -3.61f);
        a.t(pathBuilderB, 9.0f, 17.0f, 5.0f, 17.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderB, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wrapText = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
