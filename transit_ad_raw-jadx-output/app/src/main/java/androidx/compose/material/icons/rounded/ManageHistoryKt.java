package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: ManageHistory.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_manageHistory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageHistory", "Landroidx/compose/material/icons/Icons$Rounded;", "getManageHistory", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ManageHistoryKt {
    private static ImageVector _manageHistory;

    public static final ImageVector getManageHistory(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _manageHistory;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ManageHistory", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.75f, 19.0f);
        pathBuilderD.curveToRelative(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f);
        pathBuilderD.lineToRelative(0.84f, -0.73f);
        pathBuilderD.curveToRelative(0.18f, -0.16f, 0.22f, -0.42f, 0.1f, -0.63f);
        pathBuilderD.lineToRelative(-0.59f, -1.02f);
        pathBuilderD.curveToRelative(-0.12f, -0.21f, -0.37f, -0.3f, -0.59f, -0.22f);
        pathBuilderD.lineToRelative(-1.06f, 0.36f);
        pathBuilderD.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilderD.lineToRelative(-0.22f, -1.09f);
        pathBuilderD.curveToRelative(-0.05f, -0.23f, -0.25f, -0.4f, -0.49f, -0.4f);
        pathBuilderD.horizontalLineToRelative(-1.18f);
        pathBuilderD.curveToRelative(-0.24f, 0.0f, -0.44f, 0.17f, -0.49f, 0.4f);
        pathBuilderD.lineToRelative(-0.22f, 1.09f);
        pathBuilderD.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilderD.lineToRelative(-1.06f, -0.36f);
        pathBuilderD.curveToRelative(-0.23f, -0.08f, -0.47f, 0.02f, -0.59f, 0.22f);
        pathBuilderD.lineToRelative(-0.59f, 1.02f);
        pathBuilderD.curveToRelative(-0.12f, 0.21f, -0.08f, 0.47f, 0.1f, 0.63f);
        pathBuilderD.lineToRelative(0.84f, 0.73f);
        pathBuilderD.curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f);
        pathBuilderD.reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f);
        pathBuilderD.lineToRelative(-0.84f, 0.73f);
        pathBuilderD.curveToRelative(-0.18f, 0.16f, -0.22f, 0.42f, -0.1f, 0.63f);
        pathBuilderD.lineToRelative(0.59f, 1.02f);
        pathBuilderD.curveToRelative(0.12f, 0.21f, 0.37f, 0.3f, 0.59f, 0.22f);
        pathBuilderD.lineToRelative(1.06f, -0.36f);
        pathBuilderD.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilderD.lineToRelative(0.22f, 1.09f);
        pathBuilderD.curveToRelative(0.05f, 0.23f, 0.25f, 0.4f, 0.49f, 0.4f);
        pathBuilderD.horizontalLineToRelative(1.18f);
        pathBuilderD.curveToRelative(0.24f, 0.0f, 0.44f, -0.17f, 0.49f, -0.4f);
        pathBuilderD.lineToRelative(0.22f, -1.09f);
        pathBuilderD.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilderD.lineToRelative(1.06f, 0.36f);
        pathBuilderD.curveToRelative(0.23f, 0.08f, 0.47f, -0.02f, 0.59f, -0.22f);
        pathBuilderD.lineToRelative(0.59f, -1.02f);
        pathBuilderD.curveToRelative(0.12f, -0.21f, 0.08f, -0.47f, -0.1f, -0.63f);
        pathBuilderD.lineToRelative(-0.84f, -0.73f);
        pathBuilderD.curveTo(22.72f, 19.42f, 22.75f, 19.22f, 22.75f, 19.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 21.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(20.1f, 21.0f, 19.0f, 21.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 7.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        pathBuilderD.lineToRelative(2.07f, 2.07f);
        pathBuilderD.lineToRelative(1.04f, -1.79f);
        pathBuilderD.lineTo(13.0f, 11.59f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveTo(13.0f, 7.45f, 12.55f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.26f, 13.0f);
        pathBuilderD.curveToRelative(-0.65f, 0.0f, -1.14f, 0.61f, -0.98f, 1.24f);
        pathBuilderD.curveTo(4.28f, 18.13f, 7.8f, 21.0f, 12.0f, 21.0f);
        pathBuilderD.curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.07f, 0.0f);
        pathBuilderD.lineToRelative(-1.21f, -2.09f);
        pathBuilderD.curveToRelative(-2.75f, -0.45f, -4.96f, -2.51f, -5.64f, -5.18f);
        pathBuilderD.curveTo(5.11f, 13.29f, 4.71f, 13.0f, 4.26f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.0f, 10.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineTo(5.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.36f);
        pathBuilderD.curveTo(6.65f, 4.32f, 9.17f, 3.0f, 12.0f, 3.0f);
        pathBuilderD.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        pathBuilderD.curveTo(9.63f, 5.0f, 7.53f, 6.19f, 6.26f, 8.0f);
        pathBuilderD.horizontalLineTo(8.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderD, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageHistory = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
