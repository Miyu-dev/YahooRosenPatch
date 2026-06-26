package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HighlightAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_highlightAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HighlightAlt", "Landroidx/compose/material/icons/Icons$Filled;", "getHighlightAlt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HighlightAltKt {
    private static ImageVector _highlightAlt;

    public static final ImageVector getHighlightAlt(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _highlightAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HighlightAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(17.0f, 5.0f, -2.0f, 15.0f, 3.0f);
        a.z(pathBuilderC, 2.0f, 2.0f, 15.0f, 21.0f);
        android.support.v4.media.a.w(pathBuilderC, 2.0f, -2.59f, 19.59f, 21.0f);
        pathBuilderC.lineTo(21.0f, 19.59f);
        pathBuilderC.lineTo(18.41f, 17.0f);
        b.s(pathBuilderC, 21.0f, 17.0f, -2.0f, -6.0f);
        a.A(pathBuilderC, 6.0f, 19.0f, 9.0f, 2.0f);
        s.w(pathBuilderC, 21.0f, 7.0f, -2.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 19.0f, 13.0f, 2.0f, -2.0f);
        a.z(pathBuilderC, -2.0f, 2.0f, 11.0f, 21.0f);
        b.A(pathBuilderC, 2.0f, -2.0f, -2.0f, 2.0f);
        pathBuilderC.moveTo(7.0f, 5.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineTo(9.0f, 3.0f);
        androidx.compose.animation.b.k(pathBuilderC, 7.0f, 3.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 3.0f, 17.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderC, 3.0f, 15.0f, 2.0f);
        pathBuilderC.moveTo(5.0f, 21.0f);
        pathBuilderC.verticalLineToRelative(-2.0f);
        pathBuilderC.lineTo(3.0f, 19.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.appcompat.app.m.n(pathBuilderC, 19.0f, 3.0f, 2.0f, 2.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.j(pathBuilderC, 11.0f, 5.0f, 2.0f);
        s.w(pathBuilderC, 13.0f, 3.0f, -2.0f, 2.0f);
        pathBuilderC.moveTo(3.0f, 9.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineTo(5.0f, 7.0f);
        androidx.compose.animation.b.k(pathBuilderC, 3.0f, 7.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 7.0f, 21.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderC, 7.0f, 19.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 3.0f, 13.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderC, 3.0f, 11.0f, 2.0f);
        pathBuilderC.moveTo(3.0f, 5.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineTo(5.0f, 3.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlightAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
