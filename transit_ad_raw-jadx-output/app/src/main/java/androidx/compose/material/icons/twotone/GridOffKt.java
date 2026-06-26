package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: GridOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gridOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GridOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getGridOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GridOffKt {
    private static ImageVector _gridOff;

    public static final ImageVector getGridOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _gridOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GridOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = a.p(20.0f, 14.0f, -4.0f, -4.0f, 2.89f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 17.11f, 14.0f, 10.0f, 12.55f);
        h.m(pathBuilderP, 10.0f, 14.0f, 1.45f);
        pathBuilderP.moveTo(14.0f, 10.0f);
        b.C(pathBuilderP, -0.89f, 0.89f, 0.89f);
        pathBuilderP.moveTo(19.11f, 16.0f);
        s.r(pathBuilderP, 0.89f, 0.89f, 20.0f, 16.0f);
        pathBuilderP.moveTo(8.0f, 4.0f);
        b.C(pathBuilderP, -0.89f, 0.89f, 0.89f);
        pathBuilderP.moveTo(14.0f, 8.0f);
        androidx.compose.animation.a.o(pathBuilderP, 14.0f, 4.0f, -4.0f, 2.89f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 11.11f, 8.0f, 16.0f, 4.0f);
        b.t(pathBuilderP, 4.0f, 4.0f, -4.0f);
        a.b.y(pathBuilderP, 10.0f, 16.0f, 4.0f, 4.0f);
        v.v(pathBuilderP, -3.45f, -0.55f, -0.55f);
        a.b.y(pathBuilderP, 4.0f, 10.0f, 4.0f, 4.0f);
        h.q(pathBuilderP, -3.45f, 7.45f, 10.0f);
        pathBuilderP.moveTo(16.0f, 20.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderP, 1.45f, 16.0f, 18.55f);
        androidx.appcompat.view.menu.a.x(pathBuilderP, 4.0f, 16.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 4.0f, 20.0f, 4.0f, 6.55f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderP, 4.0f, 8.0f, 1.45f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(8.0f, 4.0f, 0.89f, 2.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderB, 10.0f, 4.0f, 4.0f, 4.0f);
        pathBuilderB.horizontalLineToRelative(-2.89f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        pathBuilderB.lineTo(14.0f, 10.0f);
        pathBuilderB.verticalLineToRelative(0.89f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderB, 16.0f, 10.0f, 4.0f, 4.0f);
        pathBuilderB.horizontalLineToRelative(-2.89f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        pathBuilderB.lineTo(20.0f, 16.0f);
        pathBuilderB.verticalLineToRelative(0.89f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        pathBuilderB.lineTo(22.0f, 4.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.lineTo(5.11f, 2.0f);
        s.r(pathBuilderB, 2.0f, 2.0f, 8.0f, 4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 16.0f, 4.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, -4.0f, 16.0f, 4.0f);
        pathBuilderB.moveTo(1.41f, 1.14f);
        pathBuilderB.lineTo(0.0f, 2.55f);
        pathBuilderB.lineToRelative(2.0f, 2.0f);
        pathBuilderB.lineTo(2.0f, 20.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(15.45f);
        pathBuilderB.lineToRelative(2.01f, 2.01f);
        s.r(pathBuilderB, 1.41f, -1.41f, 1.41f, 1.14f);
        pathBuilderB.moveTo(10.0f, 12.55f);
        pathBuilderB.lineTo(11.45f, 14.0f);
        b.k(pathBuilderB, 10.0f, 14.0f, -1.45f);
        pathBuilderB.moveTo(4.0f, 6.55f);
        pathBuilderB.lineTo(5.45f, 8.0f);
        android.support.v4.media.a.C(pathBuilderB, 4.0f, 8.0f, 4.0f, 6.55f);
        pathBuilderB.moveTo(8.0f, 20.0f);
        a.b.s(pathBuilderB, 4.0f, 20.0f, -4.0f, 4.0f);
        android.support.v4.media.a.v(pathBuilderB, 4.0f, 8.0f, 14.0f);
        a.b.s(pathBuilderB, 4.0f, 14.0f, -4.0f, 3.45f);
        s.r(pathBuilderB, 0.55f, 0.55f, 8.0f, 14.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 14.0f, 20.0f, -4.0f, -4.0f);
        pathBuilderB.horizontalLineToRelative(3.45f);
        s.r(pathBuilderB, 0.55f, 0.55f, 14.0f, 20.0f);
        pathBuilderB.moveTo(16.0f, 20.0f);
        pathBuilderB.verticalLineToRelative(-1.45f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB, 17.45f, 20.0f, 16.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
