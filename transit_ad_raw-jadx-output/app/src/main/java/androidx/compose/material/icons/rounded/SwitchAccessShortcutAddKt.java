package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: SwitchAccessShortcutAdd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_switchAccessShortcutAdd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwitchAccessShortcutAdd", "Landroidx/compose/material/icons/Icons$Rounded;", "getSwitchAccessShortcutAdd", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwitchAccessShortcutAddKt {
    private static ImageVector _switchAccessShortcutAdd;

    public static final ImageVector getSwitchAccessShortcutAdd(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _switchAccessShortcutAdd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchAccessShortcutAdd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.0f, 18.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-1.0f);
        pathBuilderD.verticalLineToRelative(-1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.horizontalLineToRelative(-1.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.curveTo(20.0f, 17.55f, 20.45f, 18.0f, 21.0f, 18.0f);
        androidx.compose.animation.a.t(pathBuilderD, 7.06f, 8.94f, 5.0f, 8.0f);
        pathBuilderD.lineToRelative(2.06f, -0.94f);
        pathBuilderD.lineTo(8.0f, 5.0f);
        pathBuilderD.lineToRelative(0.94f, 2.06f);
        pathBuilderD.lineTo(11.0f, 8.0f);
        pathBuilderD.lineTo(8.94f, 8.94f);
        android.support.v4.media.a.C(pathBuilderD, 8.0f, 11.0f, 7.06f, 8.94f);
        pathBuilderD.moveTo(8.0f, 21.0f);
        pathBuilderD.lineToRelative(0.94f, -2.06f);
        pathBuilderD.lineTo(11.0f, 18.0f);
        pathBuilderD.lineToRelative(-2.06f, -0.94f);
        pathBuilderD.lineTo(8.0f, 15.0f);
        pathBuilderD.lineToRelative(-0.94f, 2.06f);
        pathBuilderD.lineTo(5.0f, 18.0f);
        s.r(pathBuilderD, 2.06f, 0.94f, 8.0f, 21.0f);
        pathBuilderD.moveTo(4.37f, 12.37f);
        pathBuilderD.lineTo(3.0f, 13.0f);
        pathBuilderD.lineToRelative(1.37f, 0.63f);
        pathBuilderD.lineTo(5.0f, 15.0f);
        pathBuilderD.lineToRelative(0.63f, -1.37f);
        pathBuilderD.lineTo(7.0f, 13.0f);
        pathBuilderD.lineToRelative(-1.37f, -0.63f);
        android.support.v4.media.a.C(pathBuilderD, 5.0f, 11.0f, 4.37f, 12.37f);
        pathBuilderD.moveTo(19.0f, 20.41f);
        pathBuilderD.curveToRelative(0.0f, 0.78f, -0.84f, 1.25f, -1.51f, 0.86f);
        pathBuilderD.curveTo(14.21f, 19.36f, 12.0f, 15.79f, 12.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f);
        pathBuilderD.lineToRelative(-1.9f, -1.9f);
        pathBuilderD.curveTo(12.54f, 2.54f, 12.76f, 2.0f, 13.21f, 2.0f);
        pathBuilderD.horizontalLineToRelative(5.29f);
        pathBuilderD.curveTo(18.78f, 2.0f, 19.0f, 2.22f, 19.0f, 2.5f);
        pathBuilderD.verticalLineToRelative(5.29f);
        pathBuilderD.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        pathBuilderD.lineToRelative(-1.97f, -1.97f);
        pathBuilderD.curveTo(14.84f, 7.82f, 14.0f, 9.88f, 14.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 3.13f, 1.86f, 6.01f, 4.51f, 7.55f);
        pathBuilderD.curveTo(18.81f, 19.73f, 19.0f, 20.06f, 19.0f, 20.41f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcutAdd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
