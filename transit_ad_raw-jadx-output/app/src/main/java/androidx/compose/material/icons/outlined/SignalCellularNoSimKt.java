package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SignalCellularNoSim.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signalCellularNoSim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignalCellularNoSim", "Landroidx/compose/material/icons/Icons$Outlined;", "getSignalCellularNoSim", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignalCellularNoSimKt {
    private static ImageVector _signalCellularNoSim;

    public static final ImageVector getSignalCellularNoSim(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _signalCellularNoSim;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SignalCellularNoSim", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(10.83f, 5.0f, 17.0f, 5.0f, 9.11f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        pathBuilderB.lineTo(19.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.horizontalLineToRelative(-7.0f);
        pathBuilderB.lineTo(7.94f, 5.06f);
        s.r(pathBuilderB, 1.42f, 1.42f, 10.83f, 5.0f);
        pathBuilderB.moveTo(21.26f, 21.21f);
        pathBuilderB.lineTo(3.79f, 3.74f);
        pathBuilderB.lineTo(2.38f, 5.15f);
        pathBuilderB.lineTo(5.0f, 7.77f);
        pathBuilderB.lineTo(5.0f, 19.0f);
        pathBuilderB.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(11.23f);
        android.support.v4.media.a.n(pathBuilderB, 1.62f, 1.62f, 1.41f, -1.41f);
        pathBuilderB.moveTo(7.0f, 19.0f);
        pathBuilderB.lineTo(7.0f, 9.79f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB, 16.23f, 19.0f, 7.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularNoSim = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
