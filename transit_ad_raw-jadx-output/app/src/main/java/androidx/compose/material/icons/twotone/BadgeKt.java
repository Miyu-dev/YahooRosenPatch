package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_badge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Badge", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBadge", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BadgeKt {
    private static ImageVector _badge;

    public static final ImageVector getBadge(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _badge;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Badge", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(14.0f, 13.5f, 4.0f, 12.0f, -4.0f);
        a.B(pathBuilderV, 13.5f, 14.0f, 16.5f, 4.0f);
        a.v(pathBuilderV, 15.0f, -4.0f, 16.5f);
        androidx.browser.browseractions.a.A(pathBuilderV, 20.0f, 7.0f, -5.0f, 4.0f);
        pathBuilderV.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderV.horizontalLineToRelative(-2.0f);
        pathBuilderV.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        pathBuilderV.verticalLineToRelative(3.0f);
        pathBuilderV.horizontalLineTo(4.0f);
        pathBuilderV.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        pathBuilderV.verticalLineToRelative(11.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderV.horizontalLineToRelative(16.0f);
        pathBuilderV.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.verticalLineTo(9.0f);
        pathBuilderV.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        b.r(pathBuilderV, 11.0f, 4.0f, 2.0f, 5.0f);
        a.b.m(pathBuilderV, -2.0f, 4.0f, 20.0f, 20.0f);
        c.a.i(pathBuilderV, 4.0f, 9.0f, 5.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderV.horizontalLineToRelative(2.0f);
        pathBuilderV.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.b.m(pathBuilderV, 5.0f, 20.0f, 9.0f, 15.0f);
        pathBuilderV.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderV.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderV.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderV.curveTo(7.5f, 14.33f, 8.17f, 15.0f, 9.0f, 15.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(11.08f, 16.18f);
        pathBuilderV.curveTo(10.44f, 15.9f, 9.74f, 15.75f, 9.0f, 15.75f);
        pathBuilderV.reflectiveCurveToRelative(-1.44f, 0.15f, -2.08f, 0.43f);
        pathBuilderV.curveTo(6.36f, 16.42f, 6.0f, 16.96f, 6.0f, 17.57f);
        v.r(pathBuilderV, 18.0f, 6.0f, -0.43f);
        pathBuilderV.curveTo(12.0f, 16.96f, 11.64f, 16.42f, 11.08f, 16.18f);
        pathBuilderV.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderV.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(13.0f, 11.0f, -2.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.i(pathBuilderB, 4.0f, 11.0f, 16.0f, 9.0f);
        pathBuilderB.horizontalLineToRelative(-5.0f);
        pathBuilderB.curveTo(15.0f, 10.1f, 14.1f, 11.0f, 13.0f, 11.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(9.0f, 12.0f);
        pathBuilderB.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderB.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderB.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderB.curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f);
        androidx.browser.browseractions.a.q(pathBuilderB, 12.0f, 18.0f, 6.0f, -0.43f);
        pathBuilderB.curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f);
        pathBuilderB.curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f);
        pathBuilderB.reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f);
        pathBuilderB.curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f);
        a.B(pathBuilderB, 18.0f, 18.0f, 16.5f, -4.0f);
        a.v(pathBuilderB, 15.0f, 4.0f, 16.5f);
        androidx.browser.browseractions.a.A(pathBuilderB, 18.0f, 13.5f, -4.0f, 12.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 4.0f, 13.5f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _badge = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
