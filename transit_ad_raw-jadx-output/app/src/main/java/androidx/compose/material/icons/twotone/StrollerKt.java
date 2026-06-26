package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Stroller.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stroller", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Stroller", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStroller", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StrollerKt {
    private static ImageVector _stroller;

    public static final ImageVector getStroller(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _stroller;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Stroller", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.0f, 5.0f);
        pathBuilderD.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilderD.lineTo(9.49f, 6.66f);
        pathBuilderD.lineToRelative(-1.4f, -1.4f);
        pathBuilderD.curveTo(8.71f, 5.09f, 9.35f, 5.0f, 10.0f, 5.0f);
        androidx.appcompat.app.m.t(pathBuilderD, 15.0f, 8.66f, 15.0f, 9.6f);
        pathBuilderD.lineTo(15.0f, 8.66f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(10.0f, 5.0f);
        pathBuilderD2.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilderD2.lineTo(9.49f, 6.66f);
        pathBuilderD2.lineToRelative(-1.4f, -1.4f);
        pathBuilderD2.curveTo(8.71f, 5.09f, 9.35f, 5.0f, 10.0f, 5.0f);
        androidx.appcompat.app.m.t(pathBuilderD2, 15.0f, 8.66f, 15.0f, 9.6f);
        pathBuilderD2.lineTo(15.0f, 8.66f);
        pathBuilderD2.moveTo(18.65f, 3.0f);
        pathBuilderD2.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilderD2.lineToRelative(-8.8f, 10.32f);
        pathBuilderD2.curveTo(6.12f, 16.0f, 6.58f, 17.0f, 7.43f, 17.0f);
        pathBuilderD2.horizontalLineTo(15.0f);
        pathBuilderD2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD2.verticalLineTo(6.27f);
        pathBuilderD2.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilderD2.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        h.w(pathBuilderD2, 7.0f, 2.0f, 6.48f);
        pathBuilderD2.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 18.65f, 3.0f, 10.0f, 3.0f);
        pathBuilderD2.curveTo(8.03f, 3.0f, 6.21f, 3.64f, 4.72f, 4.72f);
        pathBuilderD2.lineToRelative(4.89f, 4.89f);
        pathBuilderD2.lineToRelative(4.7f, -5.51f);
        pathBuilderD2.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 10.0f, 3.0f, 16.0f, 18.0f);
        pathBuilderD2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD2.reflectiveCurveTo(17.1f, 18.0f, 16.0f, 18.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 16.0f, 18.0f, 6.0f, 18.0f);
        pathBuilderD2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD2.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD2, 6.0f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stroller = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
