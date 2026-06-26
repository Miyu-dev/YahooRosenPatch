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

/* JADX INFO: compiled from: ManageAccounts.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_manageAccounts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageAccounts", "Landroidx/compose/material/icons/Icons$Outlined;", "getManageAccounts", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ManageAccountsKt {
    private static ImageVector _manageAccounts;

    public static final ImageVector getManageAccounts(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _manageAccounts;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ManageAccounts", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(4.0f, 18.0f, -0.65f);
        pathBuilderE.curveToRelative(0.0f, -0.34f, 0.16f, -0.66f, 0.41f, -0.81f);
        pathBuilderE.curveTo(6.1f, 15.53f, 8.03f, 15.0f, 10.0f, 15.0f);
        pathBuilderE.curveToRelative(0.03f, 0.0f, 0.05f, 0.0f, 0.08f, 0.01f);
        pathBuilderE.curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.98f);
        pathBuilderE.curveTo(10.45f, 13.01f, 10.23f, 13.0f, 10.0f, 13.0f);
        pathBuilderE.curveToRelative(-2.42f, 0.0f, -4.68f, 0.67f, -6.61f, 1.82f);
        pathBuilderE.curveTo(2.51f, 15.34f, 2.0f, 16.32f, 2.0f, 17.35f);
        pathBuilderE.verticalLineTo(20.0f);
        pathBuilderE.horizontalLineToRelative(9.26f);
        pathBuilderE.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderE, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.0f, 12.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderD.curveTo(7.79f, 4.0f, 6.0f, 5.79f, 6.0f, 8.0f);
        pathBuilderD.reflectiveCurveTo(7.79f, 12.0f, 10.0f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 6.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 8.9f, 6.0f, 10.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(20.75f, 16.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f);
        pathBuilderD2.lineToRelative(1.14f, -1.01f);
        pathBuilderD2.lineToRelative(-1.0f, -1.73f);
        pathBuilderD2.lineToRelative(-1.45f, 0.49f);
        pathBuilderD2.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilderD2.lineTo(18.0f, 11.0f);
        pathBuilderD2.horizontalLineToRelative(-2.0f);
        pathBuilderD2.lineToRelative(-0.3f, 1.49f);
        pathBuilderD2.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilderD2.lineToRelative(-1.45f, -0.49f);
        pathBuilderD2.lineToRelative(-1.0f, 1.73f);
        pathBuilderD2.lineToRelative(1.14f, 1.01f);
        pathBuilderD2.curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f);
        pathBuilderD2.reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f);
        pathBuilderD2.lineToRelative(-1.14f, 1.01f);
        pathBuilderD2.lineToRelative(1.0f, 1.73f);
        pathBuilderD2.lineToRelative(1.45f, -0.49f);
        pathBuilderD2.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilderD2.lineTo(16.0f, 21.0f);
        pathBuilderD2.horizontalLineToRelative(2.0f);
        pathBuilderD2.lineToRelative(0.3f, -1.49f);
        pathBuilderD2.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilderD2.lineToRelative(1.45f, 0.49f);
        pathBuilderD2.lineToRelative(1.0f, -1.73f);
        pathBuilderD2.lineToRelative(-1.14f, -1.01f);
        pathBuilderD2.curveTo(20.72f, 16.42f, 20.75f, 16.22f, 20.75f, 16.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(17.0f, 18.0f);
        pathBuilderD2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD2, 18.1f, 18.0f, 17.0f, 18.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageAccounts = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
