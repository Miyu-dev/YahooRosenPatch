package androidx.compose.material.icons.outlined;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SwitchAccessShortcutAdd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_switchAccessShortcutAdd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwitchAccessShortcutAdd", "Landroidx/compose/material/icons/Icons$Outlined;", "getSwitchAccessShortcutAdd", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwitchAccessShortcutAddKt {
    private static ImageVector _switchAccessShortcutAdd;

    public static final ImageVector getSwitchAccessShortcutAdd(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _switchAccessShortcutAdd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwitchAccessShortcutAdd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.06f, 8.94f, 5.0f, 8.0f);
        pathBuilderA.lineToRelative(2.06f, -0.94f);
        pathBuilderA.lineTo(8.0f, 5.0f);
        pathBuilderA.lineToRelative(0.94f, 2.06f);
        pathBuilderA.lineTo(11.0f, 8.0f);
        pathBuilderA.lineTo(8.94f, 8.94f);
        a.C(pathBuilderA, 8.0f, 11.0f, 7.06f, 8.94f);
        pathBuilderA.moveTo(8.0f, 21.0f);
        pathBuilderA.lineToRelative(0.94f, -2.06f);
        pathBuilderA.lineTo(11.0f, 18.0f);
        pathBuilderA.lineToRelative(-2.06f, -0.94f);
        pathBuilderA.lineTo(8.0f, 15.0f);
        pathBuilderA.lineToRelative(-0.94f, 2.06f);
        pathBuilderA.lineTo(5.0f, 18.0f);
        s.r(pathBuilderA, 2.06f, 0.94f, 8.0f, 21.0f);
        pathBuilderA.moveTo(4.37f, 12.37f);
        pathBuilderA.lineTo(3.0f, 13.0f);
        pathBuilderA.lineToRelative(1.37f, 0.63f);
        pathBuilderA.lineTo(5.0f, 15.0f);
        pathBuilderA.lineToRelative(0.63f, -1.37f);
        pathBuilderA.lineTo(7.0f, 13.0f);
        pathBuilderA.lineToRelative(-1.37f, -0.63f);
        a.C(pathBuilderA, 5.0f, 11.0f, 4.37f, 12.37f);
        pathBuilderA.moveTo(12.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -3.09f, 1.38f, -5.94f, 3.44f, -8.0f);
        androidx.appcompat.app.m.r(pathBuilderA, 12.0f, 4.0f, 2.0f, 7.0f);
        androidx.browser.browseractions.a.t(pathBuilderA, 7.0f, -2.0f, 0.0f, -3.72f);
        pathBuilderA.curveToRelative(-1.8f, 1.74f, -3.0f, 4.2f, -3.0f, 6.72f);
        pathBuilderA.curveToRelative(0.0f, 3.32f, 2.1f, 6.36f, 5.0f, 7.82f);
        pathBuilderA.lineTo(19.0f, 22.0f);
        pathBuilderA.curveTo(14.91f, 20.41f, 12.0f, 16.35f, 12.0f, 12.0f);
        androidx.compose.animation.b.r(pathBuilderA, 24.0f, 14.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderA, -2.0f, 2.0f, -2.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderA, 2.0f, 2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderA, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcutAdd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
