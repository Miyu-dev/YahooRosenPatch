package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: RecentActors.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_recentActors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RecentActors", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRecentActors", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RecentActorsKt {
    private static ImageVector _recentActors;

    public static final ImageVector getRecentActors(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _recentActors;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RecentActors", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(13.0f, 7.0f, 3.0f, 7.0f, 10.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 10.0f, 13.0f, 7.0f);
        pathBuilderB.moveTo(8.0f, 8.0f);
        pathBuilderB.curveToRelative(1.07f, 0.0f, 1.95f, 0.87f, 1.95f, 1.95f);
        pathBuilderB.curveToRelative(0.0f, 1.07f, -0.87f, 1.95f, -1.95f, 1.95f);
        pathBuilderB.reflectiveCurveToRelative(-1.95f, -0.87f, -1.95f, -1.95f);
        pathBuilderB.reflectiveCurveTo(6.93f, 8.0f, 8.0f, 8.0f);
        androidx.compose.animation.a.t(pathBuilderB, 11.89f, 16.0f, 4.11f, 16.0f);
        pathBuilderB.verticalLineToRelative(-0.65f);
        pathBuilderB.curveToRelative(0.0f, -1.3f, 2.59f, -1.95f, 3.89f, -1.95f);
        pathBuilderB.reflectiveCurveToRelative(3.89f, 0.65f, 3.89f, 1.95f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 11.89f, 16.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = a.v(21.0f, 5.0f, 2.0f, 14.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 17.0f, 5.0f, 2.0f, 14.0f);
        b.q(pathBuilderV, -2.0f, 14.0f, 19.0f);
        pathBuilderV.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderV.lineTo(15.0f, 6.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.lineTo(2.0f, 5.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderV.verticalLineToRelative(12.0f);
        pathBuilderV.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderV, 12.0f, 3.0f, 7.0f, 10.0f);
        pathBuilderV.verticalLineToRelative(10.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderV, 3.0f, 17.0f, 3.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(8.0f, 9.94f, -1.95f, 0.0f);
        pathBuilderB2.arcToRelative(1.95f, 1.95f, 0.0f, true, true, 3.9f, 0.0f);
        pathBuilderB2.arcToRelative(1.95f, 1.95f, 0.0f, true, true, -3.9f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(8.0f, 13.4f);
        pathBuilderD.curveToRelative(-1.3f, 0.0f, -3.89f, 0.65f, -3.89f, 1.95f);
        v.r(pathBuilderD, 16.0f, 7.78f, -0.65f);
        pathBuilderD.curveToRelative(0.0f, -1.3f, -2.59f, -1.95f, -3.89f, -1.95f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recentActors = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
