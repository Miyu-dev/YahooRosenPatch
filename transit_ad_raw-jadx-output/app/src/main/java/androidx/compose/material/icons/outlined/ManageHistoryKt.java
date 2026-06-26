package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.compose.animation.a;
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
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ManageHistory.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_manageHistory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ManageHistory", "Landroidx/compose/material/icons/Icons$Outlined;", "getManageHistory", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ManageHistoryKt {
    private static ImageVector _manageHistory;

    public static final ImageVector getManageHistory(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _manageHistory;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ManageHistory", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.69f, 18.37f, 1.14f, -1.0f);
        pathBuilderA.lineToRelative(-1.0f, -1.73f);
        pathBuilderA.lineToRelative(-1.45f, 0.49f);
        pathBuilderA.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilderA.lineTo(20.0f, 14.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.lineToRelative(-0.3f, 1.49f);
        pathBuilderA.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilderA.lineToRelative(-1.45f, -0.49f);
        pathBuilderA.lineToRelative(-1.0f, 1.73f);
        pathBuilderA.lineToRelative(1.14f, 1.0f);
        pathBuilderA.curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f);
        pathBuilderA.lineToRelative(-1.14f, 1.0f);
        pathBuilderA.lineToRelative(1.0f, 1.73f);
        pathBuilderA.lineToRelative(1.45f, -0.49f);
        pathBuilderA.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilderA.lineTo(18.0f, 24.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.lineToRelative(0.3f, -1.49f);
        pathBuilderA.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilderA.lineToRelative(1.45f, 0.49f);
        pathBuilderA.lineToRelative(1.0f, -1.73f);
        pathBuilderA.lineToRelative(-1.14f, -1.0f);
        pathBuilderA.curveTo(22.77f, 19.13f, 22.77f, 18.87f, 22.69f, 18.37f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.0f, 21.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderA.reflectiveCurveTo(20.1f, 21.0f, 19.0f, 21.0f);
        a.n(pathBuilderA, 11.0f, 7.0f, 5.41f);
        pathBuilderA.lineToRelative(2.36f, 2.36f);
        pathBuilderA.lineToRelative(1.04f, -1.79f);
        j.h(pathBuilderA, 13.0f, 11.59f, 7.0f, 11.0f);
        pathBuilderA.moveTo(21.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilderA.curveTo(9.17f, 3.0f, 6.65f, 4.32f, 5.0f, 6.36f);
        b.x(pathBuilderA, 4.0f, 3.0f, 6.0f, 6.0f);
        pathBuilderA.verticalLineTo(8.0f);
        pathBuilderA.horizontalLineTo(6.26f);
        pathBuilderA.curveTo(7.53f, 6.19f, 9.63f, 5.0f, 12.0f, 5.0f);
        pathBuilderA.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        b.w(pathBuilderA, 21.0f, 10.86f, 18.91f);
        pathBuilderA.curveTo(7.87f, 18.42f, 5.51f, 16.01f, 5.08f, 13.0f);
        pathBuilderA.horizontalLineTo(3.06f);
        pathBuilderA.curveToRelative(0.5f, 4.5f, 4.31f, 8.0f, 8.94f, 8.0f);
        pathBuilderA.curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.07f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 10.86f, 18.91f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageHistory = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
