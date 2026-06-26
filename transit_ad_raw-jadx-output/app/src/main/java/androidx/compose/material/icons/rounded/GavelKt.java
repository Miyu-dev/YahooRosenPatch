package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Gavel.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gavel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Gavel", "Landroidx/compose/material/icons/Icons$Rounded;", "getGavel", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GavelKt {
    private static ImageVector _gavel;

    public static final ImageVector getGavel(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _gavel;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gavel", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(2.0f, 21.0f, 10.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.lineTo(2.0f, 23.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.y(pathBuilderB, 5.24f, 8.07f, 2.83f, -2.83f);
        pathBuilderB.lineTo(20.8f, 17.97f);
        pathBuilderB.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderB.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderB, 5.24f, 8.07f, 13.73f, 2.41f);
        pathBuilderB.lineToRelative(2.83f, 2.83f);
        pathBuilderB.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderB.lineToRelative(-1.42f, 1.42f);
        pathBuilderB.lineToRelative(-5.65f, -5.66f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.curveToRelative(0.78f, -0.79f, 2.05f, -0.79f, 2.83f, -0.01f);
        a.y(pathBuilderB, 3.83f, 9.48f, 5.66f, 5.66f);
        pathBuilderB.lineToRelative(-1.41f, 1.41f);
        pathBuilderB.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderB.lineToRelative(-2.83f, -2.83f);
        pathBuilderB.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderB, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gavel = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
