package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyboardAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getKeyboardAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyboardAltKt {
    private static ImageVector _keyboardAlt;

    public static final ImageVector getKeyboardAlt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _keyboardAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.KeyboardAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 4.0f, 3.0f);
        pathBuilderB.curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
        pathBuilderB.verticalLineToRelative(13.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveTo(23.0f, 4.9f, 22.1f, 4.0f, 21.0f, 4.0f);
        a.w(pathBuilderB, 21.0f, 19.0f, 3.0f, 6.0f);
        b.m(pathBuilderB, 18.0f, 19.0f, 9.0f, 8.0f);
        s.A(pathBuilderB, 2.0f, 2.0f, 9.0f, 8.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 5.0f, 8.0f, 2.0f, 2.0f);
        b.B(pathBuilderB, 5.0f, 8.0f, 8.0f, 16.0f);
        s.A(pathBuilderB, 8.0f, 1.0f, 8.0f, 16.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 13.0f, 8.0f, 2.0f, 2.0f);
        b.m(pathBuilderB, -2.0f, 8.0f, 9.0f, 12.0f);
        s.A(pathBuilderB, 2.0f, 2.0f, 9.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 5.0f, 12.0f, 2.0f, 2.0f);
        b.B(pathBuilderB, 5.0f, 12.0f, 13.0f, 12.0f);
        androidx.compose.animation.a.B(pathBuilderB, 2.0f, 2.0f, -2.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 17.0f, 8.0f, 2.0f, 2.0f);
        b.m(pathBuilderB, -2.0f, 8.0f, 17.0f, 12.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderB, 2.0f, 2.0f, -2.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
