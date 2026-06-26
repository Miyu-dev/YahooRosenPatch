package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: PhoneMissed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneMissed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneMissed", "Landroidx/compose/material/icons/Icons$Sharp;", "getPhoneMissed", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneMissed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(23.32f, 16.67f);
        pathBuilderD.curveToRelative(-2.95f, -2.79f, -6.93f, -4.51f, -11.31f, -4.51f);
        pathBuilderD.curveToRelative(-4.39f, 0.0f, -8.37f, 1.72f, -11.31f, 4.51f);
        pathBuilderD.lineToRelative(-0.69f, 0.69f);
        pathBuilderD.lineTo(3.65f, 21.0f);
        pathBuilderD.lineToRelative(3.93f, -2.72f);
        pathBuilderD.lineToRelative(-0.01f, -3.49f);
        pathBuilderD.curveToRelative(1.4f, -0.45f, 2.9f, -0.7f, 4.44f, -0.7f);
        pathBuilderD.curveToRelative(1.55f, 0.0f, 3.04f, 0.24f, 4.44f, 0.7f);
        pathBuilderD.lineToRelative(-0.01f, 3.49f);
        pathBuilderD.lineTo(20.37f, 21.0f);
        pathBuilderD.lineToRelative(3.64f, -3.64f);
        pathBuilderD.curveToRelative(0.0f, -0.01f, -0.52f, -0.52f, -0.69f, -0.69f);
        a.y(pathBuilderD, 7.0f, 6.43f, 4.94f, 4.94f);
        pathBuilderD.lineToRelative(7.07f, -7.07f);
        pathBuilderD.lineToRelative(-1.41f, -1.42f);
        pathBuilderD.lineToRelative(-5.66f, 5.66f);
        v.A(pathBuilderD, 8.4f, 5.0f, 11.0f, 3.0f);
        pathBuilderD.horizontalLineTo(5.0f);
        pathBuilderD.verticalLineToRelative(6.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
