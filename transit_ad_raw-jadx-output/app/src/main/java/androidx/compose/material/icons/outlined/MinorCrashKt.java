package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MinorCrash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_minorCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MinorCrash", "Landroidx/compose/material/icons/Icons$Outlined;", "getMinorCrash", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MinorCrashKt {
    private static ImageVector _minorCrash;

    public static final ImageVector getMinorCrash(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _minorCrash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MinorCrash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.92f, 9.01f);
        pathBuilderD.curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f);
        pathBuilderD.horizontalLineToRelative(-11.0f);
        pathBuilderD.curveTo(5.84f, 8.0f, 5.29f, 8.42f, 5.08f, 9.01f);
        pathBuilderD.lineTo(3.0f, 15.0f);
        pathBuilderD.verticalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -1.0f, 12.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.q(pathBuilderD, -8.0f, 18.92f, 9.01f);
        pathBuilderD.moveTo(6.85f, 10.0f);
        androidx.compose.animation.a.C(pathBuilderD, 10.29f, 1.04f, 3.0f, 5.81f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 6.85f, 10.0f, 19.0f, 20.0f);
        v.B(pathBuilderD, 5.0f, -5.0f, 14.0f, 20.0f);
        pathBuilderD.moveTo(6.0f, 17.5f);
        pathBuilderD.curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f);
        pathBuilderD.reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.0f, 17.5f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f);
        pathBuilderD.reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f);
        androidx.compose.animation.a.t(pathBuilderD, 9.41f, 5.0f, 8.0f, 6.41f);
        pathBuilderD.lineToRelative(-3.0f, -3.0f);
        android.support.v4.media.a.C(pathBuilderD, 6.41f, 2.0f, 9.41f, 5.0f);
        pathBuilderD.moveTo(16.0f, 6.41f);
        pathBuilderD.lineTo(14.59f, 5.0f);
        pathBuilderD.lineToRelative(3.0f, -3.0f);
        android.support.v4.media.a.C(pathBuilderD, 19.0f, 3.41f, 16.0f, 6.41f);
        a.A(pathBuilderD, 13.0f, 5.0f, -2.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderD, 2.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _minorCrash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
