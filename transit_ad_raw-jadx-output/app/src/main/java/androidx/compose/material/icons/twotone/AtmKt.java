package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Atm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_atm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Atm", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAtm", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AtmKt {
    private static ImageVector _atm;

    public static final ImageVector getAtm(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _atm;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Atm", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(3.5f, 13.5f, 2.0f, 5.5f, 15.0f);
        pathBuilderC.lineTo(7.0f, 15.0f);
        pathBuilderC.verticalLineToRelative(-5.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(3.0f, 9.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.n(pathBuilderC, 5.0f, 1.5f, -1.5f);
        pathBuilderC.moveTo(3.5f, 10.5f);
        a.y(pathBuilderC, 2.0f, 5.5f, 12.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderC, -1.5f, 17.0f, 10.5f, 1.0f);
        androidx.compose.animation.a.o(pathBuilderC, 18.0f, 14.0f, 1.5f, -3.51f);
        pathBuilderC.horizontalLineToRelative(1.0f);
        pathBuilderC.lineTo(20.5f, 15.0f);
        pathBuilderC.lineTo(22.0f, 15.0f);
        pathBuilderC.verticalLineToRelative(-5.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.horizontalLineToRelative(-4.5f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        androidx.browser.browseractions.a.v(pathBuilderC, 5.0f, 17.0f, 15.0f, -4.5f);
        a.x(pathBuilderC, 10.25f, 15.0f, 1.5f, -4.5f);
        pathBuilderC.lineTo(14.0f, 10.5f);
        pathBuilderC.lineTo(14.0f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.j(pathBuilderC, 8.0f, 9.0f, 1.5f, 2.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _atm = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
