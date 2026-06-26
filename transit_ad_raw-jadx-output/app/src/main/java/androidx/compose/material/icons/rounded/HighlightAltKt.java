package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HighlightAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_highlightAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HighlightAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getHighlightAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HighlightAltKt {
    private static ImageVector _highlightAlt;

    public static final ImageVector getHighlightAlt(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _highlightAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HighlightAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(17.0f, 5.0f, -2.0f, 3.0f, 2.0f);
        a.B(pathBuilderV, 5.0f, 19.0f, 9.0f, 2.0f);
        a.v(pathBuilderV, 7.0f, -2.0f, 9.0f);
        a.x(pathBuilderV, 19.0f, 13.0f, 2.0f, -2.0f);
        b.m(pathBuilderV, -2.0f, 13.0f, 11.0f, 21.0f);
        androidx.compose.animation.a.B(pathBuilderV, 2.0f, -2.0f, -2.0f, 21.0f);
        androidx.browser.browseractions.a.A(pathBuilderV, 7.0f, 5.0f, 2.0f, 3.0f);
        b.B(pathBuilderV, 7.0f, 5.0f, 3.0f, 17.0f);
        s.A(pathBuilderV, 2.0f, -2.0f, 3.0f, 17.0f);
        android.support.v4.media.a.D(pathBuilderV, 5.0f, 21.0f, -2.0f, 3.0f);
        pathBuilderV.curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f);
        androidx.appcompat.app.m.n(pathBuilderV, 19.0f, 3.0f, 2.0f, 2.0f);
        pathBuilderV.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.compose.animation.a.k(pathBuilderV, 11.0f, 5.0f, 2.0f, 3.0f);
        b.m(pathBuilderV, -2.0f, 5.0f, 3.0f, 9.0f);
        k.d(pathBuilderV, 2.0f, 7.0f, 3.0f, 9.0f);
        a.x(pathBuilderV, 7.0f, 21.0f, 2.0f, -2.0f);
        b.B(pathBuilderV, 7.0f, 21.0f, 3.0f, 13.0f);
        s.A(pathBuilderV, 2.0f, -2.0f, 3.0f, 13.0f);
        androidx.browser.browseractions.a.A(pathBuilderV, 3.0f, 5.0f, 2.0f, 3.0f);
        pathBuilderV.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        androidx.browser.browseractions.a.y(pathBuilderV, 18.71f, 17.29f, 1.44f, -1.44f);
        pathBuilderV.curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilderV.horizontalLineTo(16.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderV.verticalLineToRelative(3.79f);
        pathBuilderV.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderV.lineToRelative(1.44f, -1.44f);
        pathBuilderV.lineToRelative(2.0f, 2.0f);
        pathBuilderV.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderV.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderV, 18.71f, 17.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlightAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
