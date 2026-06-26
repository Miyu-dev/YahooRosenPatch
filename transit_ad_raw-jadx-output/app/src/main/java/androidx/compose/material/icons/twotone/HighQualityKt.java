package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: HighQuality.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_highQuality", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HighQuality", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHighQuality", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HighQualityKt {
    private static ImageVector _highQuality;

    public static final ImageVector getHighQuality(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _highQuality;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HighQuality", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(19.0f, 6.0f, 5.0f, 6.0f, 12.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 14.0f, 19.0f, 6.0f);
        pathBuilderB.moveTo(11.0f, 15.0f);
        b.s(pathBuilderB, 9.5f, 15.0f, -2.0f, -2.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.lineTo(6.0f, 15.0f);
        androidx.compose.animation.a.o(pathBuilderB, 6.0f, 9.0f, 1.5f, 2.5f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.lineTo(9.5f, 9.0f);
        androidx.compose.animation.b.k(pathBuilderB, 11.0f, 9.0f, 6.0f);
        pathBuilderB.moveTo(18.0f, 14.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        android.support.v4.media.a.s(pathBuilderB, -0.75f, 1.5f, -1.5f);
        pathBuilderB.lineTo(14.75f, 15.0f);
        pathBuilderB.lineTo(14.0f, 15.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(-4.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(3.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.A(pathBuilderB, 4.0f, 14.5f, 10.5f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderB, 3.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(3.0f, 6.0f, 12.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(14.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.lineTo(21.0f, 6.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE.lineTo(5.0f, 4.0f);
        pathBuilderE.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        androidx.compose.animation.b.r(pathBuilderE, 5.0f, 6.0f, 14.0f, 12.0f);
        android.support.v4.media.a.C(pathBuilderE, 5.0f, 18.0f, 5.0f, 6.0f);
        pathBuilderE.moveTo(9.5f, 11.5f);
        pathBuilderE.horizontalLineToRelative(-2.0f);
        pathBuilderE.lineTo(7.5f, 9.0f);
        b.s(pathBuilderE, 6.0f, 9.0f, 6.0f, 1.5f);
        android.support.v4.media.a.m(pathBuilderE, -2.0f, 2.0f, 2.0f);
        pathBuilderE.lineTo(11.0f, 15.0f);
        android.support.v4.media.a.C(pathBuilderE, 11.0f, 9.0f, 9.5f, 9.0f);
        pathBuilderE.moveTo(17.0f, 9.0f);
        pathBuilderE.horizontalLineToRelative(-3.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        android.support.v4.media.a.s(pathBuilderE, 0.75f, 1.5f, 1.5f);
        pathBuilderE.lineTo(16.25f, 15.0f);
        pathBuilderE.lineTo(17.0f, 15.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderE.verticalLineToRelative(-4.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        androidx.compose.animation.b.r(pathBuilderE, 16.5f, 13.5f, -2.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderE, 2.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highQuality = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
