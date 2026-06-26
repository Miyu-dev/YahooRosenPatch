package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Interests.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_interests", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Interests", "Landroidx/compose/material/icons/Icons$Outlined;", "getInterests", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class InterestsKt {
    private static ImageVector _interests;

    public static final ImageVector getInterests(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _interests;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Interests", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.02f, 13.0f);
        pathBuilderD.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.02f, 19.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(8.12f, 19.0f, 7.02f, 19.0f);
        androidx.appcompat.app.m.n(pathBuilderD, 13.0f, 13.0f, 8.0f, 8.0f);
        h.z(pathBuilderD, -8.0f, 13.0f, 19.0f, 19.0f);
        androidx.compose.animation.a.B(pathBuilderD, -4.0f, -4.0f, 4.0f, 19.0f);
        pathBuilderD.moveTo(7.0f, 2.0f);
        pathBuilderD.lineToRelative(-5.0f, 9.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderD, 10.0f, 7.0f, 2.0f);
        pathBuilderD.moveTo(7.0f, 6.12f);
        pathBuilderD.lineTo(8.6f, 9.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 5.4f, 7.0f, 6.12f);
        pathBuilderD.moveTo(19.25f, 2.5f);
        pathBuilderD.curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f);
        pathBuilderD.curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f);
        pathBuilderD.curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f);
        pathBuilderD.curveToRelative(0.0f, 2.0f, 2.42f, 3.42f, 5.0f, 5.75f);
        pathBuilderD.curveToRelative(2.58f, -2.33f, 5.0f, -3.75f, 5.0f, -5.75f);
        pathBuilderD.curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 8.35f);
        pathBuilderD.curveToRelative(-1.45f, -1.22f, -3.0f, -2.4f, -3.0f, -3.1f);
        pathBuilderD.curveToRelative(0.0f, -0.43f, 0.35f, -0.75f, 0.75f, -0.75f);
        pathBuilderD.curveToRelative(0.31f, 0.0f, 0.52f, 0.17f, 0.73f, 0.37f);
        pathBuilderD.lineTo(17.0f, 6.3f);
        pathBuilderD.lineToRelative(1.52f, -1.43f);
        pathBuilderD.curveToRelative(0.21f, -0.2f, 0.42f, -0.37f, 0.73f, -0.37f);
        pathBuilderD.curveToRelative(0.4f, 0.0f, 0.75f, 0.32f, 0.75f, 0.75f);
        pathBuilderD.curveTo(20.0f, 5.95f, 18.45f, 7.13f, 17.0f, 8.35f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interests = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
