package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Abc.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_abc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Abc", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAbc", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AbcKt {
    private static ImageVector _abc;

    public static final ImageVector getAbc(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _abc;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Abc", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(21.0f, 11.0f, -1.5f, -0.5f, -2.0f);
        s.m(pathBuilderF, 3.0f, 2.0f, 13.0f, 21.0f);
        pathBuilderF.verticalLineToRelative(1.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderF.horizontalLineToRelative(-3.0f);
        pathBuilderF.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderF.verticalLineToRelative(-4.0f);
        pathBuilderF.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderF.horizontalLineToRelative(3.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.l(pathBuilderF, 11.0f, 8.0f, 10.0f, 5.0f);
        androidx.appcompat.graphics.drawable.a.i(pathBuilderF, 6.5f, -1.5f, -2.0f, 15.0f);
        pathBuilderF.horizontalLineTo(3.0f);
        pathBuilderF.verticalLineToRelative(-5.0f);
        pathBuilderF.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderF.horizontalLineToRelative(3.0f);
        pathBuilderF.curveTo(7.55f, 9.0f, 8.0f, 9.45f, 8.0f, 10.0f);
        androidx.compose.animation.a.k(pathBuilderF, 6.5f, 10.5f, -2.0f, 12.0f);
        a.b.m(pathBuilderF, 2.0f, 10.5f, 13.5f, 12.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderF.verticalLineToRelative(1.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        v.m(pathBuilderF, -4.0f, 9.0f, 4.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderF.verticalLineToRelative(1.0f);
        pathBuilderF.curveTo(14.5f, 11.55f, 14.05f, 12.0f, 13.5f, 12.0f);
        androidx.appcompat.app.m.n(pathBuilderF, 11.0f, 10.5f, 0.75f, 2.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderF, 10.5f, 11.0f, 13.0f, 12.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderF, -2.0f, 0.75f, 2.0f, 12.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _abc = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
