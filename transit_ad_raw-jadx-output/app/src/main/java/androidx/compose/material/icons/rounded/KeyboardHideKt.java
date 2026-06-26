package androidx.compose.material.icons.rounded;

import a.b;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyboardHide.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardHide", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardHide", "Landroidx/compose/material/icons/Icons$Rounded;", "getKeyboardHide", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyboardHideKt {
    private static ImageVector _keyboardHide;

    public static final ImageVector getKeyboardHide(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _keyboardHide;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardHide", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 3.0f, 4.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.lineTo(2.0f, 15.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(22.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.b.r(pathBuilderA, 11.0f, 6.0f, 2.0f, 2.0f);
        a.s(pathBuilderA, -2.0f, 11.0f, 6.0f);
        a.x(pathBuilderA, 11.0f, 9.0f, 2.0f, 2.0f);
        a.s(pathBuilderA, -2.0f, 11.0f, 9.0f);
        a.x(pathBuilderA, 8.0f, 6.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderA, 8.0f, 8.0f, 8.0f, 6.0f);
        a.x(pathBuilderA, 8.0f, 9.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderA, 8.0f, 11.0f, 8.0f, 9.0f);
        pathBuilderA.moveTo(7.0f, 11.0f);
        pathBuilderA.lineTo(5.0f, 11.0f);
        s.w(pathBuilderA, 5.0f, 9.0f, 2.0f, 2.0f);
        pathBuilderA.moveTo(7.0f, 8.0f);
        pathBuilderA.lineTo(5.0f, 8.0f);
        s.w(pathBuilderA, 5.0f, 6.0f, 2.0f, 2.0f);
        pathBuilderA.moveTo(15.0f, 15.0f);
        pathBuilderA.lineTo(9.0f, 15.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(6.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        androidx.compose.animation.a.j(pathBuilderA, 16.0f, 11.0f, -2.0f);
        s.w(pathBuilderA, 14.0f, 9.0f, 2.0f, 2.0f);
        pathBuilderA.moveTo(16.0f, 8.0f);
        a.y(pathBuilderA, -2.0f, 14.0f, 6.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderA, 2.0f, 19.0f, 11.0f, -2.0f);
        s.w(pathBuilderA, 17.0f, 9.0f, 2.0f, 2.0f);
        pathBuilderA.moveTo(19.0f, 8.0f);
        a.y(pathBuilderA, -2.0f, 17.0f, 6.0f, 2.0f);
        android.support.v4.media.a.v(pathBuilderA, 2.0f, 12.35f, 22.65f);
        pathBuilderA.lineToRelative(2.79f, -2.79f);
        pathBuilderA.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilderA.lineTo(9.21f, 19.01f);
        pathBuilderA.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilderA.lineToRelative(2.79f, 2.79f);
        pathBuilderA.curveToRelative(0.19f, 0.19f, 0.51f, 0.19f, 0.7f, 0.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardHide = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
