package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.e;
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FontDownloadOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fontDownloadOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FontDownloadOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFontDownloadOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FontDownloadOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(10.35f, 7.52f, 10.92f, 6.0f, 2.14f);
        pathBuilderL.lineToRelative(2.55f, 6.79f);
        androidx.browser.browseractions.a.D(pathBuilderL, 20.0f, 17.17f, 4.0f, 6.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderL, 10.35f, 7.52f, 12.58f, 9.75f);
        pathBuilderL.lineToRelative(-0.54f, -1.52f);
        pathBuilderL.horizontalLineToRelative(-0.1f);
        s.r(pathBuilderL, -0.23f, 0.66f, 12.58f, 9.75f);
        pathBuilderL.moveTo(17.17f, 20.0f);
        pathBuilderL.lineToRelative(-5.07f, -5.07f);
        e.g(pathBuilderL, 9.58f, 8.49f, 18.0f, 6.41f);
        pathBuilderL.lineToRelative(2.39f, -6.37f);
        pathBuilderL.lineTo(4.0f, 6.83f);
        pathBuilderL.verticalLineTo(20.0f);
        pathBuilderL.horizontalLineTo(17.17f);
        pathBuilderL.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderL.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(4.83f, 2.0f, 20.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        androidx.browser.browseractions.a.z(pathBuilderB, 15.17f, -2.0f, -2.0f, 4.0f);
        a.t(pathBuilderB, 6.83f, 4.83f, 2.0f);
        pathBuilderB.moveTo(10.92f, 6.0f);
        pathBuilderB.lineToRelative(-0.57f, 1.52f);
        pathBuilderB.lineToRelative(1.36f, 1.36f);
        pathBuilderB.lineToRelative(0.23f, -0.66f);
        pathBuilderB.horizontalLineToRelative(0.1f);
        pathBuilderB.lineToRelative(0.54f, 1.52f);
        pathBuilderB.lineToRelative(3.04f, 3.04f);
        i.b(pathBuilderB, 13.07f, 6.0f, 10.92f);
        pathBuilderB.moveTo(20.49f, 23.31f);
        pathBuilderB.lineTo(19.17f, 22.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.83f);
        pathBuilderB.lineTo(0.69f, 3.51f);
        pathBuilderB.lineTo(2.1f, 2.1f);
        s.r(pathBuilderB, 19.8f, 19.8f, 20.49f, 23.31f);
        pathBuilderB.moveTo(17.17f, 20.0f);
        pathBuilderB.lineToRelative(-5.07f, -5.07f);
        e.g(pathBuilderB, 9.58f, 8.49f, 18.0f, 6.41f);
        pathBuilderB.lineToRelative(2.39f, -6.37f);
        pathBuilderB.lineTo(4.0f, 6.83f);
        pathBuilderB.verticalLineTo(20.0f);
        pathBuilderB.horizontalLineTo(17.17f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
