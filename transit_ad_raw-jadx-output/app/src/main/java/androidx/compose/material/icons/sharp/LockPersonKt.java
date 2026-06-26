package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LockPerson.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lockPerson", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LockPerson", "Landroidx/compose/material/icons/Icons$Sharp;", "getLockPerson", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LockPersonKt {
    private static ImageVector _lockPerson;

    public static final ImageVector getLockPerson(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _lockPerson;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LockPerson", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.43f, 11.18f);
        pathBuilderD.curveToRelative(1.26f, -0.29f, 2.47f, -0.21f, 3.57f, 0.12f);
        h.w(pathBuilderD, 8.0f, -3.0f, 6.22f);
        pathBuilderD.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        pathBuilderD.curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f);
        b.x(pathBuilderD, 2.0f, 4.0f, 14.0f, 8.26f);
        pathBuilderD.curveToRelative(-1.01f, -1.45f, -1.5f, -3.3f, -1.15f, -5.27f);
        pathBuilderD.curveTo(11.6f, 14.0f, 13.74f, 11.79f, 16.43f, 11.18f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.9f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        pathBuilderD.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.d(pathBuilderD, 2.0f, 8.9f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(18.0f, 13.0f);
        pathBuilderD2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderD2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD2.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(18.0f, 15.0f);
        pathBuilderD2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD2.reflectiveCurveTo(18.83f, 18.0f, 18.0f, 18.0f);
        pathBuilderD2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD2.reflectiveCurveTo(17.17f, 15.0f, 18.0f, 15.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(18.0f, 21.0f);
        pathBuilderD2.curveToRelative(-1.03f, 0.0f, -1.94f, -0.52f, -2.48f, -1.32f);
        pathBuilderD2.curveTo(16.25f, 19.26f, 17.09f, 19.0f, 18.0f, 19.0f);
        pathBuilderD2.reflectiveCurveToRelative(1.75f, 0.26f, 2.48f, 0.68f);
        pathBuilderD2.curveTo(19.94f, 20.48f, 19.03f, 21.0f, 18.0f, 21.0f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockPerson = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
