package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: SmokingRooms.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_smokingRooms", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SmokingRooms", "Landroidx/compose/material/icons/Icons$Filled;", "getSmokingRooms", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SmokingRoomsKt {
    private static ImageVector _smokingRooms;

    public static final ImageVector getSmokingRooms(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _smokingRooms;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SmokingRooms", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(2.0f, 16.0f, 15.0f, 3.0f);
        a.z(pathBuilderO, 2.0f, 19.0f, 20.5f, 16.0f);
        c.a.k(pathBuilderO, 22.0f, 16.0f, 3.0f, -1.5f);
        a.x(pathBuilderO, 18.0f, 16.0f, 1.5f, 3.0f);
        a.z(pathBuilderO, 18.0f, 19.0f, 18.85f, 7.73f);
        pathBuilderO.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilderO.curveTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f);
        pathBuilderO.verticalLineToRelative(1.5f);
        pathBuilderO.curveToRelative(1.02f, 0.0f, 1.85f, 0.83f, 1.85f, 1.85f);
        pathBuilderO.reflectiveCurveTo(17.52f, 7.2f, 16.5f, 7.2f);
        pathBuilderO.verticalLineToRelative(1.5f);
        pathBuilderO.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        pathBuilderO.lineTo(20.5f, 15.0f);
        pathBuilderO.lineTo(22.0f, 15.0f);
        pathBuilderO.verticalLineToRelative(-2.24f);
        pathBuilderO.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        androidx.compose.animation.a.t(pathBuilderO, 16.03f, 10.2f, 14.5f, 10.2f);
        pathBuilderO.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        pathBuilderO.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        pathBuilderO.verticalLineToRelative(-1.5f);
        pathBuilderO.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        pathBuilderO.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        pathBuilderO.horizontalLineToRelative(1.53f);
        pathBuilderO.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        androidx.compose.animation.a.o(pathBuilderO, 18.0f, 15.0f, 1.5f, -1.64f);
        pathBuilderO.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokingRooms = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
