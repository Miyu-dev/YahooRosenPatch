package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: PermContactCalendar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_permContactCalendar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PermContactCalendar", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPermContactCalendar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PermContactCalendarKt {
    private static ImageVector _permContactCalendar;

    public static final ImageVector getPermContactCalendar(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _permContactCalendar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PermContactCalendar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(16.0f, 5.0f, 5.0f, 5.0f, 14.0f);
        h.C(pathBuilderB, 14.0f, 19.0f, 5.0f, -3.0f);
        pathBuilderB.moveTo(12.0f, 6.0f);
        pathBuilderB.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilderB.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        androidx.compose.animation.a.t(pathBuilderB, 18.0f, 18.0f, 6.0f, 18.0f);
        pathBuilderB.verticalLineToRelative(-1.53f);
        pathBuilderB.curveToRelative(0.0f, -2.5f, 3.97f, -3.58f, 6.0f, -3.58f);
        pathBuilderB.reflectiveCurveToRelative(6.0f, 1.08f, 6.0f, 3.58f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 18.0f, 18.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(20.84f, 4.22f);
        pathBuilderD.curveToRelative(-0.05f, -0.12f, -0.11f, -0.23f, -0.18f, -0.34f);
        pathBuilderD.curveToRelative(-0.14f, -0.21f, -0.33f, -0.4f, -0.54f, -0.54f);
        pathBuilderD.curveToRelative(-0.11f, -0.07f, -0.22f, -0.13f, -0.34f, -0.18f);
        pathBuilderD.curveToRelative(-0.24f, -0.1f, -0.5f, -0.16f, -0.78f, -0.16f);
        androidx.appcompat.view.menu.a.y(pathBuilderD, -1.0f, 18.0f, 1.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.lineTo(8.0f, 3.0f);
        pathBuilderD.lineTo(8.0f, 1.0f);
        pathBuilderD.lineTo(6.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.lineTo(5.0f, 3.0f);
        pathBuilderD.curveToRelative(-0.42f, 0.0f, -0.8f, 0.13f, -1.12f, 0.34f);
        pathBuilderD.curveToRelative(-0.21f, 0.14f, -0.4f, 0.33f, -0.54f, 0.54f);
        pathBuilderD.curveToRelative(-0.07f, 0.11f, -0.13f, 0.22f, -0.18f, 0.34f);
        pathBuilderD.curveToRelative(-0.1f, 0.24f, -0.16f, 0.5f, -0.16f, 0.78f);
        pathBuilderD.verticalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.54f, -0.06f, 0.78f, -0.16f);
        pathBuilderD.curveToRelative(0.12f, -0.05f, 0.23f, -0.11f, 0.34f, -0.18f);
        pathBuilderD.curveToRelative(0.21f, -0.14f, 0.4f, -0.33f, 0.54f, -0.54f);
        pathBuilderD.curveToRelative(0.21f, -0.32f, 0.34f, -0.71f, 0.34f, -1.12f);
        pathBuilderD.lineTo(21.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.06f, -0.54f, -0.16f, -0.78f);
        androidx.compose.animation.a.t(pathBuilderD, 19.0f, 19.0f, 5.0f, 19.0f);
        s.w(pathBuilderD, 5.0f, 5.0f, 14.0f, 14.0f);
        pathBuilderD.moveTo(12.0f, 12.88f);
        pathBuilderD.curveToRelative(-2.03f, 0.0f, -6.0f, 1.08f, -6.0f, 3.58f);
        androidx.compose.animation.a.o(pathBuilderD, 6.0f, 18.0f, 12.0f, -1.53f);
        pathBuilderD.curveToRelative(0.0f, -2.51f, -3.97f, -3.59f, -6.0f, -3.59f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.31f, 16.0f);
        pathBuilderD.curveToRelative(0.69f, -0.56f, 2.38f, -1.12f, 3.69f, -1.12f);
        pathBuilderD.reflectiveCurveToRelative(3.01f, 0.56f, 3.69f, 1.12f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 8.31f, 16.0f, 12.0f, 12.0f);
        pathBuilderD.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 8.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, 0.45f, -1.0f, 1.0f, -1.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permContactCalendar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
