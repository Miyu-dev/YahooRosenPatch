package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SettingsInputComponent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsInputComponent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsInputComponent", "Landroidx/compose/material/icons/Icons$Outlined;", "getSettingsInputComponent", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsInputComponentKt {
    private static ImageVector _settingsInputComponent;

    public static final ImageVector getSettingsInputComponent(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _settingsInputComponent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsInputComponent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(5.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        v.y(pathBuilderD, 4.0f, 1.0f, 6.0f, 10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        androidx.compose.animation.a.o(pathBuilderD, 3.0f, 23.0f, 2.0f, -4.18f);
        pathBuilderD.curveTo(6.16f, 18.4f, 7.0f, 17.3f, 7.0f, 16.0f);
        pathBuilderD.lineTo(7.0f, 6.0f);
        android.support.v4.media.a.C(pathBuilderD, 5.0f, 6.0f, 5.0f, 2.0f);
        pathBuilderD.moveTo(4.0f, 17.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -2.0f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        androidx.compose.animation.a.t(pathBuilderD, 3.0f, 12.0f, 3.0f, 8.0f);
        androidx.appcompat.app.m.C(pathBuilderD, 2.0f, 4.0f, 3.0f, 12.0f);
        pathBuilderD.moveTo(13.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        v.y(pathBuilderD, 4.0f, 9.0f, 6.0f, 10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        androidx.compose.animation.a.o(pathBuilderD, 11.0f, 23.0f, 2.0f, -4.18f);
        pathBuilderD.curveToRelative(1.16f, -0.42f, 2.0f, -1.52f, 2.0f, -2.82f);
        pathBuilderD.lineTo(15.0f, 6.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderD, -2.0f, 13.0f, 2.0f);
        pathBuilderD.moveTo(12.0f, 17.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -2.0f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        androidx.compose.animation.a.t(pathBuilderD, 11.0f, 12.0f, 11.0f, 8.0f);
        b.t(pathBuilderD, 2.0f, 4.0f, -2.0f);
        pathBuilderD.moveTo(21.0f, 6.0f);
        pathBuilderD.lineTo(21.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        android.support.v4.media.a.m(pathBuilderD, 4.0f, -2.0f, 10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        androidx.compose.animation.a.o(pathBuilderD, 19.0f, 23.0f, 2.0f, -4.18f);
        pathBuilderD.curveToRelative(1.16f, -0.42f, 2.0f, -1.52f, 2.0f, -2.82f);
        h.m(pathBuilderD, 23.0f, 6.0f, -2.0f);
        pathBuilderD.moveTo(20.0f, 17.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -2.0f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        androidx.compose.animation.a.t(pathBuilderD, 19.0f, 12.0f, 19.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(pathBuilderD, 2.0f, 4.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputComponent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
