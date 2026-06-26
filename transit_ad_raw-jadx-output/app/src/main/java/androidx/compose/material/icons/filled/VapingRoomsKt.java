package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: VapingRooms.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vapingRooms", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapingRooms", "Landroidx/compose/material/icons/Icons$Filled;", "getVapingRooms", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VapingRoomsKt {
    private static ImageVector _vapingRooms;

    public static final ImageVector getVapingRooms(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _vapingRooms;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VapingRooms", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(2.0f, 16.5f, 1.0f);
        pathBuilderB.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        pathBuilderB.verticalLineToRelative(3.0f);
        pathBuilderB.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        b.B(pathBuilderB, 2.0f, 16.5f, 22.0f, 16.0f);
        pathBuilderB.verticalLineToRelative(3.0f);
        pathBuilderB.horizontalLineTo(8.0f);
        pathBuilderB.verticalLineToRelative(-3.0f);
        pathBuilderB.horizontalLineTo(22.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(11.0f, 17.5f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderB.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        h.B(pathBuilderB, 22.0f, 12.76f, 15.0f, -1.5f);
        pathBuilderB.verticalLineToRelative(-2.23f);
        pathBuilderB.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        pathBuilderB.verticalLineTo(7.2f);
        pathBuilderB.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        pathBuilderB.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        pathBuilderB.verticalLineTo(2.0f);
        pathBuilderB.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        pathBuilderB.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        pathBuilderB.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        androidx.appcompat.app.m.A(pathBuilderB, 19.5f, 13.36f, 15.0f, 18.0f);
        pathBuilderB.verticalLineToRelative(-1.3f);
        pathBuilderB.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        pathBuilderB.horizontalLineTo(14.5f);
        pathBuilderB.curveToRelative(-1.85f, 0.0f, -3.35f, -1.5f, -3.35f, -3.35f);
        pathBuilderB.reflectiveCurveToRelative(1.5f, -3.35f, 3.35f, -3.35f);
        pathBuilderB.verticalLineToRelative(1.5f);
        pathBuilderB.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        pathBuilderB.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        pathBuilderB.horizontalLineToRelative(1.53f);
        pathBuilderB.curveTo(17.9f, 10.2f, 19.5f, 11.55f, 19.5f, 13.36f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapingRooms = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
