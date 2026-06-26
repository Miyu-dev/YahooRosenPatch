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

/* JADX INFO: compiled from: TableBar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tableBar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TableBar", "Landroidx/compose/material/icons/Icons$Outlined;", "getTableBar", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TableBarKt {
    private static ImageVector _tableBar;

    public static final ImageVector getTableBar(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _tableBar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TableBar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.0f, 7.5f);
        pathBuilderD.curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f);
        pathBuilderD.curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f);
        pathBuilderD.verticalLineTo(15.0f);
        pathBuilderD.horizontalLineTo(9.35f);
        pathBuilderD.curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f);
        pathBuilderD.lineTo(6.0f, 20.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderD, 2.0f, 1.2f, -3.0f, 5.6f);
        pathBuilderD.lineToRelative(1.2f, 3.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.lineToRelative(-1.5f, -3.74f);
        pathBuilderD.curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f);
        pathBuilderD.horizontalLineTo(13.0f);
        pathBuilderD.verticalLineToRelative(-4.02f);
        pathBuilderD.curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 6.0f);
        pathBuilderD.curveToRelative(4.05f, 0.0f, 6.74f, 0.86f, 7.72f, 1.5f);
        pathBuilderD.curveTo(18.74f, 8.14f, 16.05f, 9.0f, 12.0f, 9.0f);
        pathBuilderD.reflectiveCurveTo(5.26f, 8.14f, 4.28f, 7.5f);
        pathBuilderD.curveTo(5.26f, 6.86f, 7.95f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableBar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
