package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: Superscript.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_superscript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Superscript", "Landroidx/compose/material/icons/Icons$Outlined;", "getSuperscript", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SuperscriptKt {
    private static ImageVector _superscript;

    public static final ImageVector getSuperscript(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _superscript;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Superscript", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(22.0f, 7.0f, -2.0f, 1.0f, 3.0f);
        s.l(pathBuilderF, 1.0f, -4.0f, 7.0f);
        pathBuilderF.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        androidx.appcompat.view.menu.a.A(pathBuilderF, 2.0f, 5.0f, -3.0f, 4.0f);
        pathBuilderF.horizontalLineToRelative(3.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderF.verticalLineToRelative(1.0f);
        pathBuilderF.curveTo(23.0f, 6.55f, 22.55f, 7.0f, 22.0f, 7.0f);
        androidx.compose.animation.a.j(pathBuilderF, 5.88f, 20.0f, 2.66f);
        pathBuilderF.lineToRelative(3.4f, -5.42f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderF, 0.12f, 3.4f, 5.42f, 2.66f);
        pathBuilderF.lineToRelative(-4.65f, -7.27f);
        pathBuilderF.lineTo(17.81f, 6.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderF, -2.68f, -3.07f, 4.99f, -0.12f);
        pathBuilderF.lineTo(8.85f, 6.0f);
        pathBuilderF.horizontalLineTo(6.19f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderF, 4.32f, 6.73f, 5.88f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _superscript = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
