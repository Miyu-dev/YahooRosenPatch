package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Fort.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fort", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fort", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFort", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FortKt {
    private static ImageVector _fort;

    public static final ImageVector getFort(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _fort;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Fort", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(19.0f, 8.17f, 20.17f, 7.0f, -4.34f);
        androidx.browser.browseractions.a.D(pathBuilderL, 17.0f, 8.17f, 12.0f, 7.0f);
        pathBuilderL.verticalLineTo(8.17f);
        pathBuilderL.lineTo(8.17f, 7.0f);
        pathBuilderL.horizontalLineTo(3.83f);
        pathBuilderL.lineTo(5.0f, 8.17f);
        androidx.browser.browseractions.a.z(pathBuilderL, 7.66f, -2.0f, 2.0f, 19.0f);
        pathBuilderL.horizontalLineToRelative(5.0f);
        pathBuilderL.verticalLineToRelative(-1.0f);
        pathBuilderL.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderL.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        android.support.v4.media.a.m(pathBuilderL, 1.0f, 5.0f, -1.17f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.l(pathBuilderL, -2.0f, -2.0f, 8.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(23.0f, 7.0f, 3.0f, -2.0f, 2.0f);
        androidx.appcompat.app.m.w(pathBuilderC, -2.0f, 3.0f, -2.0f, 2.0f);
        androidx.appcompat.app.m.w(pathBuilderC, -2.0f, 3.0f, -2.0f, 4.0f);
        b.h(pathBuilderC, 2.0f, 2.0f, 1.0f, 9.0f);
        pathBuilderC.verticalLineTo(9.0f);
        pathBuilderC.lineToRelative(2.0f, -2.0f);
        pathBuilderC.verticalLineTo(3.0f);
        b.e(pathBuilderC, 9.0f, 2.0f, 7.0f, 3.0f);
        b.e(pathBuilderC, 5.0f, 2.0f, 3.0f, 3.0f);
        androidx.compose.animation.a.z(pathBuilderC, 1.0f, 4.0f, 2.0f, 2.0f);
        androidx.compose.animation.a.q(pathBuilderC, 6.0f, -2.0f, 2.0f, 4.0f);
        pathBuilderC.horizontalLineToRelative(9.0f);
        pathBuilderC.verticalLineToRelative(-3.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderC.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        android.support.v4.media.a.m(pathBuilderC, 3.0f, 9.0f, -4.0f);
        pathBuilderC.lineToRelative(-2.0f, -2.0f);
        h.u(pathBuilderC, 9.0f, 23.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 21.0f, 19.0f, -5.0f, -1.0f);
        pathBuilderC.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderC.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        v.z(pathBuilderC, 1.0f, 3.0f, -1.17f);
        pathBuilderC.lineToRelative(2.0f, -2.0f);
        pathBuilderC.verticalLineTo(8.17f);
        pathBuilderC.lineTo(3.83f, 7.0f);
        pathBuilderC.horizontalLineToRelative(4.34f);
        androidx.appcompat.app.m.r(pathBuilderC, 7.0f, 8.17f, 12.0f, 10.0f);
        pathBuilderC.verticalLineTo(8.17f);
        pathBuilderC.lineTo(15.83f, 7.0f);
        pathBuilderC.horizontalLineToRelative(4.34f);
        pathBuilderC.lineTo(19.0f, 8.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.d(pathBuilderC, 7.66f, 2.0f, 2.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fort = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
