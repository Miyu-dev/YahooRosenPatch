package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Deck.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_deck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Deck", "Landroidx/compose/material/icons/Icons$Rounded;", "getDeck", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeckKt {
    private static ImageVector _deck;

    public static final ImageVector getDeck(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _deck;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Deck", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.41f, 9.0f);
        pathBuilderD.curveToRelative(0.49f, 0.0f, 0.69f, -0.63f, 0.29f, -0.91f);
        pathBuilderD.lineTo(13.15f, 2.8f);
        pathBuilderD.curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0.0f);
        pathBuilderD.lineTo(3.3f, 8.09f);
        pathBuilderD.curveTo(2.9f, 8.37f, 3.1f, 9.0f, 3.59f, 9.0f);
        pathBuilderD.horizontalLineTo(11.0f);
        pathBuilderD.verticalLineToRelative(12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderD, 9.0f, 20.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderS = h.s(8.0f, 16.0f, 4.9f, -0.57f, -3.02f);
        pathBuilderS.curveToRelative(-0.1f, -0.54f, -0.62f, -0.9f, -1.17f, -0.8f);
        pathBuilderS.curveToRelative(-0.54f, 0.1f, -0.9f, 0.62f, -0.8f, 1.17f);
        pathBuilderS.lineTo(3.0f, 16.74f);
        pathBuilderS.verticalLineTo(21.0f);
        pathBuilderS.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderS.horizontalLineToRelative(0.01f);
        pathBuilderS.curveToRelative(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -0.99f);
        h.n(pathBuilderS, 5.02f, 18.0f, 7.0f, 3.0f);
        pathBuilderS.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderS.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderS.verticalLineToRelative(-4.0f);
        pathBuilderS.curveTo(9.0f, 16.45f, 8.55f, 16.0f, 8.0f, 16.0f);
        pathBuilderS.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderS.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(20.84f, 12.18f);
        pathBuilderD2.curveToRelative(-0.54f, -0.1f, -1.06f, 0.26f, -1.17f, 0.8f);
        pathBuilderD2.lineTo(19.1f, 16.0f);
        pathBuilderD2.horizontalLineTo(16.0f);
        pathBuilderD2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD2.verticalLineToRelative(4.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD2.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.t(pathBuilderD2, -3.0f, 1.98f, 0.02f, 3.01f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f);
        pathBuilderD2.horizontalLineTo(20.0f);
        pathBuilderD2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD2.verticalLineToRelative(-4.26f);
        pathBuilderD2.lineToRelative(0.64f, -3.39f);
        pathBuilderD2.curveTo(21.74f, 12.81f, 21.38f, 12.28f, 20.84f, 12.18f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deck = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
