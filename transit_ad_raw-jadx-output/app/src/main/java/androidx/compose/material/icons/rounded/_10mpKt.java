package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: _10mp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__10mp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_10mp", "Landroidx/compose/material/icons/Icons$Rounded;", "get_10mp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _10mpKt {
    private static ImageVector __10mp;

    public static final ImageVector get_10mp(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = __10mp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._10mp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(13.5f, 7.0f, 15.0f, 3.0f, -1.5f);
        a.y(pathBuilderO, 7.0f, 19.0f, 3.0f, 5.0f);
        pathBuilderO.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderO.verticalLineToRelative(14.0f);
        pathBuilderO.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderO.horizontalLineToRelative(14.0f);
        pathBuilderO.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderO.verticalLineTo(5.0f);
        pathBuilderO.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        a.t(pathBuilderO, 11.75f, 18.5f, 11.75f, 18.5f);
        pathBuilderO.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        v.r(pathBuilderO, 14.0f, -1.0f, 2.25f);
        pathBuilderO.curveTo(10.0f, 16.66f, 9.66f, 17.0f, 9.25f, 17.0f);
        pathBuilderO.horizontalLineToRelative(0.0f);
        pathBuilderO.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        v.r(pathBuilderO, 14.0f, -1.0f, 3.75f);
        pathBuilderO.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderO.horizontalLineToRelative(0.0f);
        pathBuilderO.curveTo(6.34f, 18.5f, 6.0f, 18.16f, 6.0f, 17.75f);
        pathBuilderO.verticalLineTo(13.5f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderO.horizontalLineToRelative(4.5f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderO.verticalLineToRelative(4.25f);
        pathBuilderO.curveTo(12.5f, 18.16f, 12.16f, 18.5f, 11.75f, 18.5f);
        a.t(pathBuilderO, 14.25f, 18.5f, 14.25f, 18.5f);
        pathBuilderO.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderO.verticalLineTo(13.5f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderO.horizontalLineTo(17.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderO.verticalLineTo(16.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(-2.0f);
        pathBuilderO.verticalLineToRelative(0.75f);
        pathBuilderO.curveTo(15.0f, 18.16f, 14.66f, 18.5f, 14.25f, 18.5f);
        a.n(pathBuilderO, 10.0f, 6.5f, 4.25f);
        pathBuilderO.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderO.horizontalLineToRelative(0.0f);
        pathBuilderO.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderO.verticalLineTo(7.0f);
        pathBuilderO.horizontalLineTo(7.75f);
        pathBuilderO.curveTo(7.34f, 7.0f, 7.0f, 6.66f, 7.0f, 6.25f);
        pathBuilderO.verticalLineToRelative(0.0f);
        pathBuilderO.curveTo(7.0f, 5.84f, 7.34f, 5.5f, 7.75f, 5.5f);
        pathBuilderO.horizontalLineTo(9.0f);
        pathBuilderO.curveTo(9.55f, 5.5f, 10.0f, 5.95f, 10.0f, 6.5f);
        pathBuilderO.close();
        pathBuilderO.moveTo(16.5f, 10.5f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderO.horizontalLineTo(13.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderO.verticalLineToRelative(-4.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderO.horizontalLineToRelative(2.5f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderO, 10.5f, 15.0f, 14.0f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.d(pathBuilderO, 1.5f, 15.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __10mp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
