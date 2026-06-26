package androidx.compose.material.icons.rounded;

import a6.h;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_factory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Factory", "Landroidx/compose/material/icons/Icons$Rounded;", "getFactory", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Factory", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(14.0f, 10.0f, 8.48f);
        pathBuilderN.curveToRelative(0.0f, -0.71f, -0.71f, -1.19f, -1.37f, -0.93f);
        pathBuilderN.lineTo(9.0f, 9.0f);
        pathBuilderN.verticalLineTo(8.52f);
        pathBuilderN.curveTo(9.0f, 7.8f, 8.27f, 7.31f, 7.61f, 7.6f);
        pathBuilderN.lineTo(3.21f, 9.48f);
        pathBuilderN.curveTo(2.48f, 9.8f, 2.0f, 10.52f, 2.0f, 11.32f);
        pathBuilderN.verticalLineTo(20.0f);
        pathBuilderN.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderN.horizontalLineToRelative(16.0f);
        pathBuilderN.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.o(pathBuilderN, 10.0f, 14.0f, 9.0f, 17.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-2.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        android.support.v4.media.a.y(pathBuilderN, 17.0f, 13.0f, 17.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-2.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        android.support.v4.media.a.y(pathBuilderN, 17.0f, 17.0f, 17.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-2.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderN, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(20.12f, 2.0f, -1.23f);
        pathBuilderB.curveToRelative(-0.51f, 0.0f, -0.93f, 0.38f, -0.99f, 0.88f);
        pathBuilderB.lineTo(17.2f, 8.5f);
        pathBuilderB.horizontalLineToRelative(4.6f);
        pathBuilderB.lineToRelative(-0.69f, -5.62f);
        pathBuilderB.curveTo(21.05f, 2.38f, 20.62f, 2.0f, 20.12f, 2.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factory = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
