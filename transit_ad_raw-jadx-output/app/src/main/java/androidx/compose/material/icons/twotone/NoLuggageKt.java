package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoLuggage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noLuggage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoLuggage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoLuggage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoLuggage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(16.17f, 19.0f, -3.42f, -3.42f, 18.0f);
        android.support.v4.media.a.w(pathBuilderW, -1.5f, -3.92f, 9.5f, 12.33f);
        androidx.appcompat.graphics.drawable.a.o(pathBuilderW, 18.0f, 8.0f, -7.17f);
        h.e(pathBuilderW, -1.0f, -1.0f, 19.0f, 16.17f);
        pathBuilderW.moveTo(17.0f, 8.0f);
        a.z(pathBuilderW, 6.17f, -1.0f, -1.0f, 9.0f);
        s.s(pathBuilderW, -1.5f, 2.67f, -1.75f, -1.75f);
        androidx.appcompat.app.m.u(pathBuilderW, 9.0f, -0.92f, -1.0f, -1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderW, 17.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW2 = a.w(16.0f, 13.17f, -1.5f, -1.5f, 9.0f);
        b.B(pathBuilderW2, 16.0f, 13.17f, 19.78f, 22.61f);
        pathBuilderW2.lineToRelative(-1.85f, -1.85f);
        pathBuilderW2.curveTo(17.65f, 20.91f, 17.34f, 21.0f, 17.0f, 21.0f);
        pathBuilderW2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderW2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderW2.horizontalLineTo(9.0f);
        pathBuilderW2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderW2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderW2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderW2.verticalLineTo(8.0f);
        pathBuilderW2.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        pathBuilderW2.lineTo(1.39f, 4.22f);
        pathBuilderW2.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderW2, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderW2.moveTo(16.17f, 19.0f);
        s.D(pathBuilderW2, -3.42f, -3.42f, 18.0f, -1.5f);
        pathBuilderW2.verticalLineToRelative(-3.92f);
        pathBuilderW2.lineTo(9.5f, 12.33f);
        pathBuilderW2.verticalLineTo(18.0f);
        androidx.compose.animation.a.z(pathBuilderW2, 8.0f, -7.17f, -1.0f, -1.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderW2, 19.0f, 16.17f, 12.75f, 9.0f);
        pathBuilderW2.horizontalLineToRelative(-0.92f);
        pathBuilderW2.lineToRelative(0.92f, 0.92f);
        pathBuilderW2.verticalLineTo(9.0f);
        pathBuilderW2.close();
        pathBuilderW2.moveTo(19.0f, 8.0f);
        a.z(pathBuilderW2, 8.17f, -2.0f, -2.0f, 8.0f);
        pathBuilderW2.horizontalLineToRelative(-6.17f);
        pathBuilderW2.lineTo(9.84f, 7.01f);
        pathBuilderW2.lineTo(9.0f, 6.17f);
        pathBuilderW2.verticalLineTo(6.0f);
        pathBuilderW2.verticalLineTo(3.0f);
        pathBuilderW2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderW2.horizontalLineToRelative(4.0f);
        pathBuilderW2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderW2.verticalLineToRelative(3.0f);
        pathBuilderW2.horizontalLineToRelative(2.0f);
        pathBuilderW2.curveTo(18.1f, 6.0f, 19.0f, 6.9f, 19.0f, 8.0f);
        androidx.compose.animation.a.k(pathBuilderW2, 10.5f, 6.0f, 3.0f, 3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderW2, -3.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
