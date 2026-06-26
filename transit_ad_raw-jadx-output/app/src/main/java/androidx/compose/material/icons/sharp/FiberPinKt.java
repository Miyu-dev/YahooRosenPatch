package androidx.compose.material.icons.sharp;

import a.b;
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

/* JADX INFO: compiled from: FiberPin.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberPin", "Landroidx/compose/material/icons/Icons$Sharp;", "getFiberPin", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberPin", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(5.5f, 10.5f, 2.0f, 1.0f, -2.0f);
        android.support.v4.media.a.v(pathBuilderF, -1.0f, 22.0f, 4.0f);
        b.s(pathBuilderF, 2.0f, 4.0f, 16.0f, 20.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderF, 22.0f, 4.0f, 9.0f, 13.0f);
        pathBuilderF.lineTo(5.5f, 13.0f);
        pathBuilderF.verticalLineToRelative(2.0f);
        pathBuilderF.lineTo(4.0f, 15.0f);
        s.w(pathBuilderF, 4.0f, 9.0f, 5.0f, 4.0f);
        pathBuilderF.moveTo(12.5f, 15.0f);
        pathBuilderF.lineTo(11.0f, 15.0f);
        s.w(pathBuilderF, 11.0f, 9.0f, 1.5f, 6.0f);
        pathBuilderF.moveTo(20.0f, 15.0f);
        pathBuilderF.horizontalLineToRelative(-1.2f);
        pathBuilderF.lineToRelative(-2.55f, -3.5f);
        pathBuilderF.lineTo(16.25f, 15.0f);
        pathBuilderF.lineTo(15.0f, 15.0f);
        pathBuilderF.lineTo(15.0f, 9.0f);
        pathBuilderF.horizontalLineToRelative(1.25f);
        pathBuilderF.lineToRelative(2.5f, 3.5f);
        pathBuilderF.lineTo(18.75f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.a.e(pathBuilderF, 20.0f, 9.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
