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

/* JADX INFO: compiled from: Liquor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_liquor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Liquor", "Landroidx/compose/material/icons/Icons$Filled;", "getLiquor", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LiquorKt {
    private static ImageVector _liquor;

    public static final ImageVector getLiquor(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _liquor;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Liquor", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(3.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        b.x(pathBuilderD, 20.0f, 3.0f, 2.0f, 6.0f);
        v.z(pathBuilderD, -2.0f, 7.0f, -3.18f);
        pathBuilderD.curveTo(8.16f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f);
        b.z(pathBuilderD, 6.0f, 3.0f, 14.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 5.0f, 8.0f, 2.0f, 3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderD, 5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.63f, 8.54f, -0.95f, -0.32f);
        pathBuilderA.curveTo(19.28f, 8.09f, 19.0f, 7.71f, 19.0f, 7.28f);
        pathBuilderA.verticalLineTo(3.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-3.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(4.28f);
        pathBuilderA.curveToRelative(0.0f, 0.43f, -0.28f, 0.81f, -0.68f, 0.95f);
        pathBuilderA.lineToRelative(-0.95f, 0.32f);
        pathBuilderA.curveTo(11.55f, 8.82f, 11.0f, 9.58f, 11.0f, 10.44f);
        pathBuilderA.verticalLineTo(20.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(7.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineToRelative(-9.56f);
        pathBuilderA.curveTo(22.0f, 9.58f, 21.45f, 8.82f, 20.63f, 8.54f);
        b.r(pathBuilderA, 16.0f, 4.0f, 1.0f, 1.0f);
        a.b.m(pathBuilderA, -1.0f, 4.0f, 13.0f, 10.44f);
        pathBuilderA.lineToRelative(0.95f, -0.32f);
        pathBuilderA.curveTo(15.18f, 9.72f, 16.0f, 8.57f, 16.0f, 7.28f);
        v.r(pathBuilderA, 7.0f, 1.0f, 0.28f);
        pathBuilderA.curveToRelative(0.0f, 1.29f, 0.82f, 2.44f, 2.05f, 2.85f);
        androidx.appcompat.app.m.r(pathBuilderA, 20.0f, 10.44f, 12.0f, -7.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderA, 10.44f, 20.0f, 20.0f, -7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderA, -2.0f, 7.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liquor = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
