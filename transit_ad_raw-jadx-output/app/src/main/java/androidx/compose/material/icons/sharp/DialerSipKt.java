package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: DialerSip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dialerSip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DialerSip", "Landroidx/compose/material/icons/Icons$Sharp;", "getDialerSip", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DialerSipKt {
    private static ImageVector _dialerSip;

    public static final ImageVector getDialerSip(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _dialerSip;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DialerSip", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = a.v(16.0f, 3.0f, 1.0f, 5.0f, -1.0f);
        pathBuilderV.moveTo(15.0f, 5.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderV, -2.0f, 13.0f, 4.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderV, 15.0f, 3.0f, -3.0f, 3.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderV, 2.0f, 1.0f, -2.0f, 1.0f);
        pathBuilderV.horizontalLineToRelative(3.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(18.0f, 3.0f);
        pathBuilderV.verticalLineToRelative(5.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderV, 1.0f, 19.0f, 6.0f, 2.0f);
        h.m(pathBuilderV, 21.0f, 3.0f, -3.0f);
        pathBuilderV.moveTo(20.0f, 5.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderV, -1.0f, 19.0f, 4.0f, 1.0f);
        android.support.v4.media.a.v(pathBuilderV, 1.0f, 21.0f, 15.46f);
        pathBuilderV.lineToRelative(-5.27f, -0.61f);
        pathBuilderV.lineToRelative(-2.52f, 2.52f);
        pathBuilderV.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilderV.lineToRelative(2.53f, -2.53f);
        pathBuilderV.lineTo(8.54f, 3.0f);
        pathBuilderV.lineTo(3.03f, 3.0f);
        pathBuilderV.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderV, -5.51f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dialerSip = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
