package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SettingsInputComponent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsInputComponent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsInputComponent", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSettingsInputComponent", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsInputComponentKt {
    private static ImageVector _settingsInputComponent;

    public static final ImageVector getSettingsInputComponent(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _settingsInputComponent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SettingsInputComponent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderD, -2.0f, -2.0f, 2.0f);
        pathBuilderD.moveTo(3.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.v(pathBuilderD, -2.0f, 3.0f, 14.0f, 2.0f);
        pathBuilderD.moveTo(19.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.j(pathBuilderD, -2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(5.0f, 2.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        v.y(pathBuilderD2, 4.0f, 1.0f, 6.0f, 10.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        androidx.compose.animation.a.o(pathBuilderD2, 3.0f, 23.0f, 2.0f, -4.18f);
        pathBuilderD2.curveTo(6.16f, 18.4f, 7.0f, 17.3f, 7.0f, 16.0f);
        pathBuilderD2.lineTo(7.0f, 6.0f);
        android.support.v4.media.a.C(pathBuilderD2, 5.0f, 6.0f, 5.0f, 2.0f);
        pathBuilderD2.moveTo(5.0f, 16.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderD2, -2.0f, 2.0f, 2.0f);
        pathBuilderD2.moveTo(5.0f, 12.0f);
        pathBuilderD2.lineTo(3.0f, 12.0f);
        s.w(pathBuilderD2, 3.0f, 8.0f, 2.0f, 4.0f);
        pathBuilderD2.moveTo(13.0f, 2.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        v.y(pathBuilderD2, 4.0f, 9.0f, 6.0f, 10.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        androidx.compose.animation.a.o(pathBuilderD2, 11.0f, 23.0f, 2.0f, -4.18f);
        pathBuilderD2.curveToRelative(1.16f, -0.42f, 2.0f, -1.52f, 2.0f, -2.82f);
        pathBuilderD2.lineTo(15.0f, 6.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderD2, -2.0f, 13.0f, 2.0f);
        pathBuilderD2.moveTo(13.0f, 16.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderD2, -2.0f, 2.0f, 2.0f);
        pathBuilderD2.moveTo(13.0f, 12.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderD2, -2.0f, 11.0f, 8.0f, 2.0f);
        android.support.v4.media.a.v(pathBuilderD2, 4.0f, 21.0f, 6.0f);
        pathBuilderD2.lineTo(21.0f, 2.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        android.support.v4.media.a.m(pathBuilderD2, 4.0f, -2.0f, 10.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        androidx.compose.animation.a.o(pathBuilderD2, 19.0f, 23.0f, 2.0f, -4.18f);
        pathBuilderD2.curveToRelative(1.16f, -0.42f, 2.0f, -1.52f, 2.0f, -2.82f);
        h.m(pathBuilderD2, 23.0f, 6.0f, -2.0f);
        pathBuilderD2.moveTo(21.0f, 16.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderD2, -2.0f, 2.0f, 2.0f);
        pathBuilderD2.moveTo(21.0f, 12.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderD2, -2.0f, 19.0f, 8.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderD2, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputComponent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
