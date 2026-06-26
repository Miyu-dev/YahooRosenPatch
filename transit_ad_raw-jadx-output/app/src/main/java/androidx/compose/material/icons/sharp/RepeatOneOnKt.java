package androidx.compose.material.icons.sharp;

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
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RepeatOneOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_repeatOneOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RepeatOneOn", "Landroidx/compose/material/icons/Icons$Sharp;", "getRepeatOneOn", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RepeatOneOnKt {
    private static ImageVector _repeatOneOn;

    public static final ImageVector getRepeatOneOn(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _repeatOneOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RepeatOneOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 1.0f, 3.0f);
        pathBuilderB.curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f);
        pathBuilderB.verticalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(3.0f);
        pathBuilderB.curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f);
        a.q(pathBuilderB, 19.0f, 19.0f, 7.0f, 3.0f);
        pathBuilderB.lineToRelative(-4.0f, -4.0f);
        v.u(pathBuilderB, 4.0f, -4.0f, 3.0f, 10.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderB, -4.0f, 2.0f, 19.0f);
        h.D(pathBuilderB, 10.0f, 10.5f, 9.0f, 3.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderB, 6.0f, -1.5f, -4.5f, 10.0f);
        androidx.appcompat.app.m.t(pathBuilderB, 17.0f, 10.0f, 7.0f, 7.0f);
        j.f(pathBuilderB, 4.0f, 5.0f, 5.0f, 12.0f);
        pathBuilderB.verticalLineTo(2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderB, 4.0f, 4.0f, 17.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repeatOneOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
