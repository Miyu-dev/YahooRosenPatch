package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: OpenInNewOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_openInNewOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OpenInNewOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getOpenInNewOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OpenInNewOffKt {
    private static ImageVector _openInNewOff;

    public static final ImageVector getOpenInNewOff(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _openInNewOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.OpenInNewOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(16.79f, 5.8f, 14.0f, 3.0f, 7.0f);
        pathBuilderL.verticalLineToRelative(7.0f);
        pathBuilderL.lineToRelative(-2.79f, -2.8f);
        pathBuilderL.lineToRelative(-4.09f, 4.09f);
        s.r(pathBuilderL, -1.41f, -1.41f, 16.79f, 5.8f);
        pathBuilderL.moveTo(19.0f, 12.0f);
        androidx.browser.browseractions.a.z(pathBuilderL, 4.17f, 2.0f, 2.0f, 12.0f);
        b.w(pathBuilderL, 19.0f, 19.78f, 22.61f);
        v.A(pathBuilderL, 18.17f, 21.0f, 3.0f, 5.83f);
        pathBuilderL.lineTo(1.39f, 4.22f);
        pathBuilderL.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderL, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderL.moveTo(16.17f, 19.0f);
        pathBuilderL.lineToRelative(-4.88f, -4.88f);
        pathBuilderL.lineTo(9.7f, 15.71f);
        pathBuilderL.lineTo(8.29f, 14.3f);
        pathBuilderL.lineToRelative(1.59f, -1.59f);
        j.h(pathBuilderL, 5.0f, 7.83f, 19.0f, 16.17f);
        android.support.v4.media.a.B(pathBuilderL, 7.83f, 5.0f, 12.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.k(pathBuilderL, 5.83f, 7.83f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openInNewOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
