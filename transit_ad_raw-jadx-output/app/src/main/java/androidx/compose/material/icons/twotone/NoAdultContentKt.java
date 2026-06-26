package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: NoAdultContent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noAdultContent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoAdultContent", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoAdultContent", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoAdultContentKt {
    private static ImageVector _noAdultContent;

    public static final ImageVector getNoAdultContent(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _noAdultContent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoAdultContent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.85f, 0.63f, -3.54f, 1.69f, -4.9f);
        pathBuilderD.lineTo(7.59f, 9.0f);
        pathBuilderD.horizontalLineToRelative(2.83f);
        pathBuilderD.lineTo(7.1f, 5.69f);
        pathBuilderD.curveTo(8.46f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilderD.lineToRelative(-1.9f, -1.9f);
        pathBuilderD.horizontalLineToRelative(-2.83f);
        pathBuilderD.lineToRelative(3.31f, 3.31f);
        pathBuilderD.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.25f, 14.0f, -1.5f, -2.0f);
        pathBuilderA.lineToRelative(1.5f, -2.0f);
        pathBuilderA.lineToRelative(-1.5f, 0.0f);
        pathBuilderA.lineToRelative(-0.75f, 1.0f);
        pathBuilderA.lineToRelative(-0.75f, -1.0f);
        pathBuilderA.lineToRelative(-1.5f, 0.0f);
        pathBuilderA.lineToRelative(1.5f, 2.0f);
        pathBuilderA.lineToRelative(-1.5f, 2.0f);
        pathBuilderA.lineToRelative(1.5f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 0.75f, -1.0f, 0.75f, 1.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(8.0f, 10.0f, -0.75f, 1.0f);
        pathBuilderA2.lineToRelative(-0.75f, -1.0f);
        pathBuilderA2.lineToRelative(-1.5f, 0.0f);
        pathBuilderA2.lineToRelative(1.5f, 2.0f);
        pathBuilderA2.lineToRelative(-1.5f, 2.0f);
        pathBuilderA2.lineToRelative(1.5f, 0.0f);
        pathBuilderA2.lineToRelative(0.75f, -1.0f);
        pathBuilderA2.lineToRelative(0.75f, 1.0f);
        pathBuilderA2.lineToRelative(1.5f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, -1.5f, -2.0f, 1.5f, -2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = b.a(16.0f, 14.0f, 0.75f, -1.0f);
        pathBuilderA3.lineToRelative(0.75f, 1.0f);
        pathBuilderA3.lineToRelative(1.5f, 0.0f);
        pathBuilderA3.lineToRelative(-1.5f, -2.0f);
        pathBuilderA3.lineToRelative(1.5f, -2.0f);
        pathBuilderA3.lineToRelative(-1.5f, 0.0f);
        pathBuilderA3.lineToRelative(-0.75f, 1.0f);
        pathBuilderA3.lineToRelative(-0.75f, -1.0f);
        pathBuilderA3.lineToRelative(-1.5f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA3, 1.5f, 2.0f, -1.5f, 2.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noAdultContent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
