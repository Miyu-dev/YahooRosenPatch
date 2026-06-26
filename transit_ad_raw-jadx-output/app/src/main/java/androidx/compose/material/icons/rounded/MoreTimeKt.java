package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: MoreTime.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_moreTime", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MoreTime", "Landroidx/compose/material/icons/Icons$Rounded;", "getMoreTime", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MoreTimeKt {
    private static ImageVector _moreTime;

    public static final ImageVector getMoreTime(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _moreTime;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MoreTime", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.75f, 8.0f);
        pathBuilderD.curveTo(10.34f, 8.0f, 10.0f, 8.34f, 10.0f, 8.75f);
        pathBuilderD.verticalLineToRelative(4.69f);
        pathBuilderD.curveToRelative(0.0f, 0.35f, 0.18f, 0.67f, 0.47f, 0.85f);
        pathBuilderD.lineToRelative(3.64f, 2.24f);
        pathBuilderD.curveToRelative(0.33f, 0.2f, 0.76f, 0.11f, 0.97f, -0.21f);
        pathBuilderD.curveToRelative(0.23f, -0.34f, 0.12f, -0.8f, -0.23f, -1.01f);
        pathBuilderD.lineTo(11.5f, 13.3f);
        pathBuilderD.verticalLineTo(8.75f);
        pathBuilderD.curveTo(11.5f, 8.34f, 11.16f, 8.0f, 10.75f, 8.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(17.92f, 12.0f);
        pathBuilderD2.curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        pathBuilderD2.curveToRelative(0.0f, 3.9f, -3.1f, 7.0f, -7.0f, 7.0f);
        pathBuilderD2.reflectiveCurveToRelative(-7.0f, -3.1f, -7.0f, -7.0f);
        pathBuilderD2.curveToRelative(0.0f, -3.9f, 3.1f, -7.0f, 7.0f, -7.0f);
        pathBuilderD2.curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f);
        pathBuilderD2.verticalLineTo(4.23f);
        pathBuilderD2.curveTo(12.36f, 4.08f, 11.69f, 4.0f, 11.0f, 4.0f);
        pathBuilderD2.curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f);
        pathBuilderD2.reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f);
        pathBuilderD2.reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.06f, -1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderD2, 17.92f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(22.0f, 5.0f, -2.0f, 3.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderT.verticalLineToRelative(2.0f);
        pathBuilderT.horizontalLineToRelative(-2.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderT.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderT.horizontalLineToRelative(2.0f);
        pathBuilderT.verticalLineToRelative(2.0f);
        pathBuilderT.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderT.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderT.verticalLineTo(7.0f);
        pathBuilderT.horizontalLineToRelative(2.0f);
        pathBuilderT.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderT.curveTo(23.0f, 5.45f, 22.55f, 5.0f, 22.0f, 5.0f);
        pathBuilderT.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderT.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moreTime = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
