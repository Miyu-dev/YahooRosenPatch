package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: Keyboard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Keyboard", "Landroidx/compose/material/icons/Icons$Outlined;", "getKeyboard", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyboardKt {
    private static ImageVector _keyboard;

    public static final ImageVector getKeyboard(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _keyboard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Keyboard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(20.0f, 7.0f, 10.0f, 4.0f, 17.0f);
        pathBuilderU.lineTo(4.0f, 7.0f);
        pathBuilderU.horizontalLineToRelative(16.0f);
        pathBuilderU.moveToRelative(0.0f, -2.0f);
        pathBuilderU.lineTo(4.0f, 5.0f);
        pathBuilderU.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderU.lineTo(2.0f, 17.0f);
        pathBuilderU.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderU.horizontalLineToRelative(16.0f);
        pathBuilderU.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderU.lineTo(22.0f, 7.0f);
        pathBuilderU.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.r(pathBuilderU, 11.0f, 8.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderU, -2.0f, 11.0f, 11.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderU, 2.0f, -2.0f, 8.0f, 8.0f);
        androidx.appcompat.app.m.C(pathBuilderU, 2.0f, 2.0f, 8.0f, 10.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 8.0f, 11.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderU, 8.0f, 13.0f, 5.0f, 11.0f);
        androidx.appcompat.app.m.C(pathBuilderU, 2.0f, 2.0f, 5.0f, 13.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 5.0f, 8.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderU, 5.0f, 10.0f, 8.0f, 14.0f);
        androidx.appcompat.app.m.C(pathBuilderU, 8.0f, 2.0f, 8.0f, 16.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 14.0f, 11.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderU, -2.0f, 14.0f, 8.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderU, 2.0f, -2.0f, 17.0f, 11.0f);
        b.t(pathBuilderU, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderU, 17.0f, 8.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.c(pathBuilderU, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
