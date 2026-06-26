package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: SignalWifiBad.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signalWifiBad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignalWifiBad", "Landroidx/compose/material/icons/Icons$Filled;", "getSignalWifiBad", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignalWifiBadKt {
    private static ImageVector _signalWifiBad;

    public static final ImageVector getSignalWifiBad(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _signalWifiBad;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SignalWifiBad", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(24.0f, 8.98f);
        pathBuilderD.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        b.s(pathBuilderD, 12.0f, 21.0f, -9.0f, 8.99f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 24.0f, 8.98f, 19.59f, 14.0f);
        pathBuilderD.lineToRelative(-2.09f, 2.09f);
        pathBuilderD.lineTo(15.41f, 14.0f);
        pathBuilderD.lineTo(14.0f, 15.41f);
        pathBuilderD.lineToRelative(2.09f, 2.09f);
        pathBuilderD.lineTo(14.0f, 19.59f);
        pathBuilderD.lineTo(15.41f, 21.0f);
        pathBuilderD.lineToRelative(2.09f, -2.08f);
        pathBuilderD.lineTo(19.59f, 21.0f);
        pathBuilderD.lineTo(21.0f, 19.59f);
        pathBuilderD.lineToRelative(-2.08f, -2.09f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 21.0f, 15.41f, 19.59f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiBad = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
