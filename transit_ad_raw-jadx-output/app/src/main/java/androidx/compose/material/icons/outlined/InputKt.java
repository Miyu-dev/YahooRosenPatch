package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Input.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_input", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Input", "Landroidx/compose/material/icons/Icons$Outlined;", "getInput", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class InputKt {
    private static ImageVector _input;

    public static final ImageVector getInput(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _input;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Input", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 3.01f, 3.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.C(pathBuilderB, 9.0f, 2.0f, 4.99f, 18.0f);
        c.a.h(pathBuilderB, 14.03f, 3.0f, 15.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(4.01f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
        pathBuilderB.verticalLineToRelative(-14.0f);
        pathBuilderB.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.browser.browseractions.a.y(pathBuilderB, 11.0f, 16.0f, 4.0f, -4.0f);
        b.h(pathBuilderB, -4.0f, -4.0f, 3.0f, 1.0f);
        a.n(pathBuilderB, 2.0f, 10.0f, 3.0f);
        pathBuilderB.moveTo(21.0f, 3.01f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.C(pathBuilderB, 9.0f, 2.0f, 4.99f, 18.0f);
        c.a.h(pathBuilderB, 14.03f, 3.0f, 15.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(4.01f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
        pathBuilderB.verticalLineToRelative(-14.0f);
        pathBuilderB.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.browser.browseractions.a.y(pathBuilderB, 11.0f, 16.0f, 4.0f, -4.0f);
        b.h(pathBuilderB, -4.0f, -4.0f, 3.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.j(pathBuilderB, 2.0f, 10.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _input = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
