package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Brightness5.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightness5", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness5", "Landroidx/compose/material/icons/Icons$Outlined;", "getBrightness5", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Brightness5Kt {
    private static ImageVector _brightness5;

    public static final ImageVector getBrightness5(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _brightness5;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Brightness5", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(20.0f, 8.69f, 20.0f, 4.0f, -4.69f);
        pathBuilderL.lineTo(12.0f, 0.69f);
        pathBuilderL.lineTo(8.69f, 4.0f);
        pathBuilderL.lineTo(4.0f, 4.0f);
        pathBuilderL.verticalLineToRelative(4.69f);
        pathBuilderL.lineTo(0.69f, 12.0f);
        pathBuilderL.lineTo(4.0f, 15.31f);
        pathBuilderL.lineTo(4.0f, 20.0f);
        pathBuilderL.horizontalLineToRelative(4.69f);
        pathBuilderL.lineTo(12.0f, 23.31f);
        pathBuilderL.lineTo(15.31f, 20.0f);
        pathBuilderL.lineTo(20.0f, 20.0f);
        pathBuilderL.verticalLineToRelative(-4.69f);
        android.support.v4.media.a.C(pathBuilderL, 23.31f, 12.0f, 20.0f, 8.69f);
        pathBuilderL.moveTo(18.0f, 14.48f);
        pathBuilderL.lineTo(18.0f, 18.0f);
        pathBuilderL.horizontalLineToRelative(-3.52f);
        pathBuilderL.lineTo(12.0f, 20.48f);
        pathBuilderL.lineTo(9.52f, 18.0f);
        pathBuilderL.lineTo(6.0f, 18.0f);
        pathBuilderL.verticalLineToRelative(-3.52f);
        pathBuilderL.lineTo(3.52f, 12.0f);
        pathBuilderL.lineTo(6.0f, 9.52f);
        pathBuilderL.lineTo(6.0f, 6.0f);
        pathBuilderL.horizontalLineToRelative(3.52f);
        pathBuilderL.lineTo(12.0f, 3.52f);
        pathBuilderL.lineTo(14.48f, 6.0f);
        pathBuilderL.lineTo(18.0f, 6.0f);
        pathBuilderL.verticalLineToRelative(3.52f);
        android.support.v4.media.a.C(pathBuilderL, 20.48f, 12.0f, 18.0f, 14.48f);
        pathBuilderL.moveTo(12.0f, 6.5f);
        pathBuilderL.curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f);
        pathBuilderL.reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f);
        pathBuilderL.reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f);
        pathBuilderL.reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f);
        pathBuilderL.close();
        pathBuilderL.moveTo(12.0f, 15.5f);
        pathBuilderL.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilderL.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilderL.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderL, -1.57f, 3.5f, -3.5f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness5 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
