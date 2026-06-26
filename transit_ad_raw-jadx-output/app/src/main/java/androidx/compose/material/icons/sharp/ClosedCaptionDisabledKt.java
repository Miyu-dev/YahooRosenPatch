package androidx.compose.material.icons.sharp;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ClosedCaptionDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_closedCaptionDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ClosedCaptionDisabled", "Landroidx/compose/material/icons/Icons$Sharp;", "getClosedCaptionDisabled", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ClosedCaptionDisabledKt {
    private static ImageVector _closedCaptionDisabled;

    public static final ImageVector getClosedCaptionDisabled(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ClosedCaptionDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(6.83f, 4.0f, 21.0f, 14.17f);
        h.n(pathBuilderF, 17.83f, 15.0f, 18.0f, -2.0f);
        a.s(pathBuilderF, -1.5f, 0.5f, -0.17f);
        s.D(pathBuilderF, -1.83f, -1.83f, 10.5f, 2.0f);
        c.g(pathBuilderF, 11.0f, 18.0f, 9.0f, -5.0f);
        h.q(pathBuilderF, 1.17f, 6.83f, 4.0f);
        pathBuilderF.moveTo(19.78f, 22.61f);
        v.A(pathBuilderF, 17.17f, 20.0f, 3.0f, 5.83f);
        pathBuilderF.lineTo(1.39f, 4.22f);
        pathBuilderF.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderF, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderF.moveTo(11.0f, 13.83f);
        h.n(pathBuilderF, 10.17f, 13.0f, 9.5f, 0.5f);
        a.s(pathBuilderF, -2.0f, -3.0f, 0.17f);
        h.n(pathBuilderF, 6.17f, 9.0f, 6.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderF, 5.0f, 13.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
