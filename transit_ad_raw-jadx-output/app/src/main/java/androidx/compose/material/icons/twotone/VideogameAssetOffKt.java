package androidx.compose.material.icons.twotone;

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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VideogameAssetOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_videogameAssetOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VideogameAssetOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVideogameAssetOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VideogameAssetOffKt {
    private static ImageVector _videogameAssetOff;

    public static final ImageVector getVideogameAssetOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _videogameAssetOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VideogameAssetOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = d.a(10.83f, 8.0f, 8.0f, 8.0f, 20.0f);
        a.o(pathBuilderA, 8.0f, 10.83f, 17.5f, 12.0f);
        pathBuilderA.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderA.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilderA.reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f);
        pathBuilderA.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 13.17f, 16.0f, -3.0f, -3.0f);
        s.B(pathBuilderA, 9.0f, 2.0f, 7.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.i(pathBuilderA, 5.0f, -2.0f, 2.0f, 9.83f);
        h.n(pathBuilderA, 5.17f, 8.0f, 4.0f, 8.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderA, 13.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(17.5f, 9.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        pathBuilderD.reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f);
        pathBuilderD.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        androidx.browser.browseractions.a.q(pathBuilderD, 10.83f, 8.0f, 20.0f, 8.0f);
        pathBuilderD.horizontalLineToRelative(-1.17f);
        pathBuilderD.lineToRelative(1.87f, 1.87f);
        pathBuilderD.curveTo(21.45f, 17.58f, 22.0f, 16.85f, 22.0f, 16.0f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 8.83f, 10.83f, 8.0f);
        pathBuilderD.moveTo(19.78f, 22.61f);
        pathBuilderD.lineTo(15.17f, 18.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveToRelative(0.0f, -0.85f, 0.55f, -1.58f, 1.3f, -1.87f);
        pathBuilderD.lineTo(1.39f, 4.22f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderD, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderD.moveTo(13.17f, 16.0f);
        androidx.compose.animation.a.r(pathBuilderD, -3.0f, -3.0f, 9.0f, 2.0f);
        s.B(pathBuilderD, 7.0f, -2.0f, 5.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.verticalLineTo(9.83f);
        pathBuilderD.lineTo(5.17f, 8.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.verticalLineToRelative(8.0f);
        pathBuilderD.horizontalLineTo(13.17f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videogameAssetOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
