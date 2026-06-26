package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: KeyboardCommandKey.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardCommandKey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardCommandKey", "Landroidx/compose/material/icons/Icons$TwoTone;", "getKeyboardCommandKey", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyboardCommandKeyKt {
    private static ImageVector _keyboardCommandKey;

    public static final ImageVector getKeyboardCommandKey(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _keyboardCommandKey;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.KeyboardCommandKey", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.5f, 3.0f);
        pathBuilderD.curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        h.w(pathBuilderD, 8.0f, -4.0f, 6.5f);
        pathBuilderD.curveTo(10.0f, 4.57f, 8.43f, 3.0f, 6.5f, 3.0f);
        pathBuilderD.reflectiveCurveTo(3.0f, 4.57f, 3.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(4.57f, 10.0f, 6.5f, 10.0f);
        b.r(pathBuilderD, 8.0f, 4.0f, 6.5f);
        pathBuilderD.curveTo(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f);
        pathBuilderD.reflectiveCurveTo(4.57f, 21.0f, 6.5f, 21.0f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        v.r(pathBuilderD, 16.0f, 4.0f, 1.5f);
        pathBuilderD.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveTo(19.43f, 14.0f, 17.5f, 14.0f);
        androidx.compose.animation.a.s(pathBuilderD, 16.0f, -4.0f, 1.5f);
        pathBuilderD.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveTo(19.43f, 3.0f, 17.5f, 3.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 17.5f, 3.0f, 16.0f, 8.0f);
        pathBuilderD.verticalLineTo(6.5f);
        pathBuilderD.curveTo(16.0f, 5.67f, 16.67f, 5.0f, 17.5f, 5.0f);
        pathBuilderD.reflectiveCurveTo(19.0f, 5.67f, 19.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(18.33f, 8.0f, 17.5f, 8.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 16.0f, 16.0f, 8.0f);
        pathBuilderD.moveTo(6.5f, 8.0f);
        pathBuilderD.curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f);
        pathBuilderD.reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.horizontalLineTo(6.5f);
        pathBuilderD.lineTo(6.5f, 8.0f);
        pathBuilderD.close();
        b.y(pathBuilderD, 10.0f, 14.0f, -4.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.horizontalLineTo(10.0f);
        pathBuilderD.lineTo(10.0f, 14.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.5f, 19.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.verticalLineTo(16.0f);
        pathBuilderD.horizontalLineToRelative(1.5f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(18.33f, 19.0f, 17.5f, 19.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 17.5f, 19.0f, 6.5f, 19.0f);
        pathBuilderD.curveTo(5.67f, 19.0f, 5.0f, 18.33f, 5.0f, 17.5f);
        pathBuilderD.reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f);
        pathBuilderD.horizontalLineTo(8.0f);
        pathBuilderD.verticalLineToRelative(1.5f);
        pathBuilderD.curveTo(8.0f, 18.33f, 7.33f, 19.0f, 6.5f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderD, 6.5f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardCommandKey = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
