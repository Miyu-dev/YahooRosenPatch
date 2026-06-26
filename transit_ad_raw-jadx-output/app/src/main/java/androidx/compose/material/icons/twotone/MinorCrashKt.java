package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: MinorCrash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_minorCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MinorCrash", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMinorCrash", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MinorCrashKt {
    private static ImageVector _minorCrash;

    public static final ImageVector getMinorCrash(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _minorCrash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MinorCrash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = a.p(5.0f, 15.0f, 5.0f, 14.0f, -5.0f);
        b.w(pathBuilderP, 5.0f, 7.5f, 19.0f);
        pathBuilderP.curveTo(6.67f, 19.0f, 6.0f, 18.33f, 6.0f, 17.5f);
        pathBuilderP.reflectiveCurveTo(6.67f, 16.0f, 7.5f, 16.0f);
        pathBuilderP.reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f);
        pathBuilderP.reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f);
        pathBuilderP.close();
        pathBuilderP.moveTo(16.5f, 19.0f);
        pathBuilderP.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderP.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderP.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderP, 17.33f, 19.0f, 16.5f, 19.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(9.41f, 5.0f, 8.0f, 6.41f);
        pathBuilderA.lineToRelative(-3.0f, -3.0f);
        android.support.v4.media.a.C(pathBuilderA, 6.41f, 2.0f, 9.41f, 5.0f);
        pathBuilderA.moveTo(19.0f, 3.41f);
        pathBuilderA.lineTo(17.59f, 2.0f);
        pathBuilderA.lineToRelative(-3.0f, 3.0f);
        android.support.v4.media.a.C(pathBuilderA, 16.0f, 6.41f, 19.0f, 3.41f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 13.0f, 0.0f, -2.0f, 5.0f);
        a.b.m(pathBuilderA, 2.0f, 0.0f, 21.0f, 15.0f);
        pathBuilderA.verticalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(-1.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.z(pathBuilderA, -1.0f, 6.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-8.0f);
        pathBuilderA.lineToRelative(2.08f, -5.99f);
        pathBuilderA.curveTo(5.29f, 8.42f, 5.84f, 8.0f, 6.5f, 8.0f);
        pathBuilderA.horizontalLineToRelative(11.0f);
        pathBuilderA.curveToRelative(0.66f, 0.0f, 1.22f, 0.42f, 1.42f, 1.01f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 21.0f, 15.0f, 5.81f, 13.0f);
        androidx.compose.animation.a.C(pathBuilderA, 12.38f, -1.04f, -3.0f, 6.85f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 5.81f, 13.0f, 19.0f, 15.0f);
        v.B(pathBuilderA, 5.0f, 5.0f, 14.0f, 15.0f);
        pathBuilderA.moveTo(7.5f, 19.0f);
        pathBuilderA.curveTo(8.33f, 19.0f, 9.0f, 18.33f, 9.0f, 17.5f);
        pathBuilderA.reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f);
        pathBuilderA.reflectiveCurveTo(6.0f, 16.67f, 6.0f, 17.5f);
        pathBuilderA.reflectiveCurveTo(6.67f, 19.0f, 7.5f, 19.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(16.5f, 19.0f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderA.reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f);
        pathBuilderA.reflectiveCurveTo(15.0f, 16.67f, 15.0f, 17.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 15.67f, 19.0f, 16.5f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _minorCrash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
