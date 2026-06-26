package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Groups.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_groups", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Groups", "Landroidx/compose/material/icons/Icons$Outlined;", "getGroups", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GroupsKt {
    private static ImageVector _groups;

    public static final ImageVector getGroups(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _groups;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Groups", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.0f, 13.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.curveTo(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.13f, 14.1f);
        pathBuilderD.curveTo(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
        pathBuilderD.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilderD.curveTo(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
        android.support.v4.media.a.A(pathBuilderD, 18.0f, 4.5f, 0.0f, -1.61f);
        pathBuilderD.curveTo(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.0f, 13.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.curveTo(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(24.0f, 16.43f);
        pathBuilderD.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        pathBuilderD.curveTo(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
        pathBuilderD.curveToRelative(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
        pathBuilderD.verticalLineTo(18.0f);
        pathBuilderD.lineToRelative(4.5f, 0.0f);
        pathBuilderD.verticalLineTo(16.43f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.24f, 13.65f);
        pathBuilderD.curveToRelative(-1.17f, -0.52f, -2.61f, -0.9f, -4.24f, -0.9f);
        pathBuilderD.curveToRelative(-1.63f, 0.0f, -3.07f, 0.39f, -4.24f, 0.9f);
        pathBuilderD.curveTo(6.68f, 14.13f, 6.0f, 15.21f, 6.0f, 16.39f);
        v.r(pathBuilderD, 18.0f, 12.0f, -1.61f);
        pathBuilderD.curveTo(18.0f, 15.21f, 17.32f, 14.13f, 16.24f, 13.65f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.07f, 16.0f);
        pathBuilderD.curveToRelative(0.09f, -0.23f, 0.13f, -0.39f, 0.91f, -0.69f);
        pathBuilderD.curveToRelative(0.97f, -0.38f, 1.99f, -0.56f, 3.02f, -0.56f);
        pathBuilderD.reflectiveCurveToRelative(2.05f, 0.18f, 3.02f, 0.56f);
        pathBuilderD.curveToRelative(0.77f, 0.3f, 0.81f, 0.46f, 0.91f, 0.69f);
        b.w(pathBuilderD, 8.07f, 12.0f, 8.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveTo(11.45f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.moveTo(12.0f, 6.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.curveTo(15.0f, 7.34f, 13.66f, 6.0f, 12.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 12.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groups = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
