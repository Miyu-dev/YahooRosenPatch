package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Pages.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pages", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pages", "Landroidx/compose/material/icons/Icons$Rounded;", "getPages", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PagesKt {
    private static ImageVector _pages;

    public static final ImageVector getPages(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _pages;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pages", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(3.0f, 5.0f, 6.0f, 5.0f);
        pathBuilderE.lineToRelative(-0.6f, -2.38f);
        pathBuilderE.curveToRelative(-0.18f, -0.74f, 0.48f, -1.4f, 1.22f, -1.22f);
        pathBuilderE.lineTo(11.0f, 8.0f);
        pathBuilderE.lineTo(11.0f, 3.0f);
        pathBuilderE.lineTo(5.0f, 3.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        androidx.compose.animation.a.t(pathBuilderE, 8.0f, 13.0f, 3.0f, 13.0f);
        pathBuilderE.verticalLineToRelative(6.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.s(pathBuilderE, 6.0f, -5.0f, -2.38f, 0.6f);
        pathBuilderE.curveToRelative(-0.73f, 0.18f, -1.4f, -0.48f, -1.21f, -1.21f);
        androidx.appcompat.view.menu.a.z(pathBuilderE, 8.0f, 13.0f, 15.38f, 16.6f);
        b.s(pathBuilderE, 13.0f, 16.0f, 5.0f, 6.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.t(pathBuilderE, -6.0f, -5.0f, 0.6f, 2.38f);
        pathBuilderE.curveToRelative(0.18f, 0.74f, -0.48f, 1.4f, -1.22f, 1.22f);
        androidx.compose.animation.b.r(pathBuilderE, 19.0f, 3.0f, -6.0f, 5.0f);
        pathBuilderE.lineToRelative(2.38f, -0.6f);
        pathBuilderE.curveToRelative(0.73f, -0.18f, 1.4f, 0.48f, 1.21f, 1.21f);
        pathBuilderE.lineTo(16.0f, 11.0f);
        pathBuilderE.horizontalLineToRelative(5.0f);
        pathBuilderE.lineTo(21.0f, 5.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pages = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
