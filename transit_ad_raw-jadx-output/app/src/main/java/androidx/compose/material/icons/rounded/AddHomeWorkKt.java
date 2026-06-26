package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: AddHomeWork.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addHomeWork", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddHomeWork", "Landroidx/compose/material/icons/Icons$Rounded;", "getAddHomeWork", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddHomeWorkKt {
    private static ImageVector _addHomeWork;

    public static final ImageVector getAddHomeWork(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _addHomeWork;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddHomeWork", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.96f, 11.7f);
        pathBuilderD.curveToRelative(-0.09f, -0.52f, -0.36f, -0.99f, -0.8f, -1.3f);
        pathBuilderD.lineToRelative(-5.0f, -3.57f);
        pathBuilderD.curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f);
        pathBuilderD.lineToRelative(-5.0f, 3.57f);
        pathBuilderD.curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f);
        pathBuilderD.verticalLineTo(19.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 3.0f, -6.0f, 4.0f, 6.0f);
        pathBuilderD.horizontalLineToRelative(1.68f);
        pathBuilderD.curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f);
        pathBuilderD.curveTo(11.0f, 15.22f, 12.62f, 12.83f, 14.96f, 11.7f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(23.0f, 13.11f, 4.97f);
        pathBuilderN.curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f);
        pathBuilderN.horizontalLineToRelative(-9.06f);
        pathBuilderN.curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f);
        pathBuilderN.lineToRelative(0.02f, 0.05f);
        pathBuilderN.curveToRelative(0.1f, 0.06f, 0.21f, 0.11f, 0.3f, 0.18f);
        pathBuilderN.lineToRelative(5.0f, 3.57f);
        pathBuilderN.curveToRelative(0.79f, 0.56f, 1.34f, 1.4f, 1.56f, 2.32f);
        pathBuilderN.curveTo(17.25f, 11.04f, 17.62f, 11.0f, 18.0f, 11.0f);
        pathBuilderN.curveTo(19.96f, 11.0f, 21.73f, 11.81f, 23.0f, 13.11f);
        b.r(pathBuilderN, 17.0f, 7.0f, 2.0f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderN, -2.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(23.0f, 18.0f);
        pathBuilderD2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderD2.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderD2.reflectiveCurveTo(23.0f, 20.76f, 23.0f, 18.0f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderD2, 17.5f, 21.0f, -2.5f, 15.0f);
        b.u(pathBuilderD2, -1.0f, 2.5f, 15.0f, 1.0f);
        a.b.x(pathBuilderD2, 2.5f, 21.0f, 1.0f, -2.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderD2, 21.0f, 17.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addHomeWork = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
