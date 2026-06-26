package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Biotech.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_biotech", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Biotech", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBiotech", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BiotechKt {
    private static ImageVector _biotech;

    public static final ImageVector getBiotech(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _biotech;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Biotech", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(11.925f, 4.861f, 0.94f, -0.342f), 1.71f, 4.699f, -0.94f, 0.342f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(10.5f, 8.0f, -1.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(7.0f, 19.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        android.support.v4.media.a.s(pathBuilderD, -4.0f, -2.0f, 3.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-8.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.47f, -2.57f);
        pathBuilderD.curveToRelative(0.41f, 0.59f, 1.06f, 1.0f, 1.83f, 1.06f);
        pathBuilderD.curveToRelative(0.7f, 0.06f, 1.36f, -0.19f, 1.85f, -0.62f);
        pathBuilderD.lineToRelative(0.59f, 1.61f);
        pathBuilderD.lineToRelative(0.94f, -0.34f);
        pathBuilderD.lineToRelative(0.34f, 0.94f);
        pathBuilderD.lineToRelative(1.88f, -0.68f);
        pathBuilderD.lineToRelative(-0.34f, -0.94f);
        pathBuilderD.lineToRelative(0.94f, -0.34f);
        pathBuilderD.lineTo(13.76f, 2.6f);
        pathBuilderD.lineToRelative(-0.94f, 0.34f);
        pathBuilderD.lineTo(12.48f, 2.0f);
        pathBuilderD.lineTo(10.6f, 2.68f);
        pathBuilderD.lineToRelative(0.34f, 0.94f);
        pathBuilderD.lineTo(10.0f, 3.97f);
        pathBuilderD.lineToRelative(0.56f, 1.55f);
        pathBuilderD.curveTo(9.39f, 5.48f, 8.37f, 6.27f, 8.08f, 7.38f);
        pathBuilderD.curveTo(6.27f, 8.14f, 5.0f, 9.92f, 5.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        h.z(pathBuilderD, 2.0f, 7.0f, 12.86f, 4.52f);
        pathBuilderD.lineToRelative(1.71f, 4.7f);
        pathBuilderD.lineToRelative(-0.94f, 0.34f);
        s.r(pathBuilderD, -1.71f, -4.7f, 12.86f, 4.52f);
        pathBuilderD.moveTo(10.5f, 7.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveTo(9.5f, 7.45f, 9.95f, 7.0f, 10.5f, 7.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _biotech = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
