package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Groups.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_groups", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Groups", "Landroidx/compose/material/icons/Icons$Filled;", "getGroups", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GroupsKt {
    private static ImageVector _groups;

    public static final ImageVector getGroups(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _groups;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Groups", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 12.75f);
        pathBuilderD.curveToRelative(1.63f, 0.0f, 3.07f, 0.39f, 4.24f, 0.9f);
        pathBuilderD.curveToRelative(1.08f, 0.48f, 1.76f, 1.56f, 1.76f, 2.73f);
        pathBuilderD.lineTo(18.0f, 18.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.lineToRelative(0.0f, -1.61f);
        pathBuilderD.curveToRelative(0.0f, -1.18f, 0.68f, -2.26f, 1.76f, -2.73f);
        pathBuilderD.curveTo(8.93f, 13.14f, 10.37f, 12.75f, 12.0f, 12.75f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.0f, 13.0f);
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
        pathBuilderD.moveTo(12.0f, 6.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderD.curveTo(9.0f, 7.34f, 10.34f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groups = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
