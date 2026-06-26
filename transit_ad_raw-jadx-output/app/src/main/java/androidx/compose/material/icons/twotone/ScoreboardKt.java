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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scoreboard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_scoreboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Scoreboard", "Landroidx/compose/material/icons/Icons$TwoTone;", "getScoreboard", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScoreboardKt {
    private static ImageVector _scoreboard;

    public static final ImageVector getScoreboard(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _scoreboard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Scoreboard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(17.5f, 13.5f, 16.0f, -3.0f, 1.5f);
        b.l(pathBuilderO, 13.5f, 12.75f, 6.0f, 1.5f);
        a.b.C(pathBuilderO, -1.5f, 6.0f, 4.0f, 12.0f);
        a.u(pathBuilderO, 7.25f, -1.5f, 1.5f, 18.0f);
        e.e(pathBuilderO, 20.0f, 6.0f, 12.75f);
        pathBuilderO.moveTo(9.5f, 11.5f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.u(pathBuilderO, -2.0f, 1.0f, 3.0f, 15.0f);
        pathBuilderO.horizontalLineTo(5.0f);
        pathBuilderO.verticalLineToRelative(-2.5f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        android.support.v4.media.a.z(pathBuilderO, 2.0f, -1.0f, 5.0f, 9.0f);
        pathBuilderO.horizontalLineToRelative(3.5f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderO, 11.5f, 12.75f, 14.5f, -1.5f);
        androidx.appcompat.view.menu.a.v(pathBuilderO, 13.0f, 1.5f, 14.5f);
        androidx.browser.browseractions.a.A(pathBuilderO, 12.75f, 11.0f, -1.5f, 9.5f);
        a.b.m(pathBuilderO, 1.5f, 11.0f, 19.0f, 14.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(-2.5f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderO.verticalLineToRelative(-4.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderO.horizontalLineTo(18.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderO, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(18.0f, 9.0f, -2.5f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineTo(18.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(-4.0f);
        pathBuilderB.curveTo(19.0f, 9.45f, 18.55f, 9.0f, 18.0f, 9.0f);
        androidx.browser.browseractions.a.q(pathBuilderB, 17.5f, 13.5f, 16.0f, -3.0f);
        a.b.m(pathBuilderB, 1.5f, 13.5f, 9.5f, 15.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.verticalLineToRelative(-2.5f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        android.support.v4.media.a.z(pathBuilderB, 2.0f, -1.0f, 5.0f, 9.0f);
        pathBuilderB.horizontalLineToRelative(3.5f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(1.5f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        androidx.compose.animation.a.B(pathBuilderB, -2.0f, 1.0f, 3.0f, 15.0f);
        androidx.browser.browseractions.a.A(pathBuilderB, 12.75f, 11.0f, -1.5f, 9.5f);
        a.b.m(pathBuilderB, 1.5f, 11.0f, 12.75f, 14.5f);
        v.w(pathBuilderB, -1.5f, 13.0f, 1.5f, 14.5f);
        pathBuilderB.moveTo(22.0f, 6.0f);
        pathBuilderB.verticalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        androidx.appcompat.app.m.w(pathBuilderB, 3.0f, 2.0f, 2.0f, 2.0f);
        androidx.appcompat.app.m.w(pathBuilderB, 6.0f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(3.0f);
        pathBuilderB.curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f);
        h.B(pathBuilderB, 20.0f, 18.0f, 6.0f, -7.25f);
        s.m(pathBuilderB, 1.5f, -1.5f, 6.0f, 4.0f);
        androidx.browser.browseractions.a.l(pathBuilderB, 12.0f, 7.25f, -1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderB, 18.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scoreboard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
