package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: _30fpsSelect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__30fpsSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_30fpsSelect", "Landroidx/compose/material/icons/Icons$Filled;", "get_30fpsSelect", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _30fpsSelectKt {
    private static ImageVector __30fpsSelect;

    public static final ImageVector get_30fpsSelect(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = __30fpsSelect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._30fpsSelect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = a.p(4.0f, 4.0f, 2.0f, 5.0f, 2.0f);
        a.B(pathBuilderP, 5.0f, 2.0f, 4.0f, 2.0f);
        androidx.compose.animation.a.s(pathBuilderP, 4.0f, 2.0f, 5.0f);
        pathBuilderP.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderP.verticalLineToRelative(-1.5f);
        pathBuilderP.curveTo(11.0f, 9.67f, 10.83f, 9.0f, 10.0f, 9.0f);
        pathBuilderP.curveToRelative(0.83f, 0.0f, 1.0f, -0.67f, 1.0f, -1.5f);
        pathBuilderP.verticalLineTo(6.0f);
        pathBuilderP.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.w(pathBuilderP, 4.0f, 18.0f, 4.0f);
        pathBuilderP.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderP.verticalLineToRelative(6.0f);
        pathBuilderP.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderP.horizontalLineToRelative(-3.0f);
        pathBuilderP.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderP.verticalLineTo(6.0f);
        pathBuilderP.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        h.v(pathBuilderP, 18.0f, 18.0f, 6.0f, -3.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderP, 6.0f, 3.0f, 6.0f);
        a.b.z(pathBuilderP, 5.0f, 22.0f, 3.0f, -5.0f);
        a.b.m(pathBuilderP, 2.0f, 22.0f, 9.0f, 22.0f);
        v.B(pathBuilderP, 7.0f, -5.0f, 2.0f, 22.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderP, 13.0f, 22.0f, -2.0f, -5.0f);
        a.b.m(pathBuilderP, 2.0f, 22.0f, 21.0f, 22.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderP, -6.0f, -5.0f, 6.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __30fpsSelect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
