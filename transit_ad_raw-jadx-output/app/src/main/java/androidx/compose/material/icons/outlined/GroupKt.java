package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Group.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_group", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Group", "Landroidx/compose/material/icons/Icons$Outlined;", "getGroup", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GroupKt {
    private static ImageVector _group;

    public static final ImageVector getGroup(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _group;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Group", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.0f, 13.75f);
        pathBuilderD.curveToRelative(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        androidx.compose.animation.a.o(pathBuilderD, 2.0f, 19.0f, 14.0f, -1.75f);
        pathBuilderD.curveToRelative(0.0f, -2.33f, -4.66f, -3.5f, -7.0f, -3.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.34f, 17.0f);
        pathBuilderD.curveToRelative(0.84f, -0.58f, 2.87f, -1.25f, 4.66f, -1.25f);
        pathBuilderD.reflectiveCurveToRelative(3.82f, 0.67f, 4.66f, 1.25f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 4.34f, 17.0f, 9.0f, 12.0f);
        pathBuilderD.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveTo(10.93f, 5.0f, 9.0f, 5.0f);
        pathBuilderD.reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f);
        pathBuilderD.reflectiveCurveTo(7.07f, 12.0f, 9.0f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.0f, 7.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(9.83f, 10.0f, 9.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(8.17f, 7.0f, 9.0f, 7.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.04f, 13.81f);
        pathBuilderD.curveToRelative(1.16f, 0.84f, 1.96f, 1.96f, 1.96f, 3.44f);
        androidx.compose.animation.a.o(pathBuilderD, 18.0f, 19.0f, 4.0f, -1.75f);
        pathBuilderD.curveToRelative(0.0f, -2.02f, -3.5f, -3.17f, -5.96f, -3.44f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.0f, 12.0f);
        pathBuilderD.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveTo(16.93f, 5.0f, 15.0f, 5.0f);
        pathBuilderD.curveToRelative(-0.54f, 0.0f, -1.04f, 0.13f, -1.5f, 0.35f);
        pathBuilderD.curveToRelative(0.63f, 0.89f, 1.0f, 1.98f, 1.0f, 3.15f);
        pathBuilderD.reflectiveCurveToRelative(-0.37f, 2.26f, -1.0f, 3.15f);
        pathBuilderD.curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _group = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
