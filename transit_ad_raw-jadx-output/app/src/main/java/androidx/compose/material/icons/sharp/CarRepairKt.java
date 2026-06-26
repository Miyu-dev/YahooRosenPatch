package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: CarRepair.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_carRepair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRepair", "Landroidx/compose/material/icons/Icons$Sharp;", "getCarRepair", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CarRepairKt {
    private static ImageVector _carRepair;

    public static final ImageVector getCarRepair(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _carRepair;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CarRepair", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(4.0f, 17.01f, 19.0f, 7.0f, 3.0f);
        a.t(pathBuilderC, 2.0f, -3.0f, 7.0f, -1.99f);
        h.v(pathBuilderC, 4.0f, 7.0f, 14.0f, 10.0f);
        s.l(pathBuilderC, 2.0f, 2.0f, 8.69f);
        pathBuilderC.lineTo(17.11f, 3.0f);
        pathBuilderC.horizontalLineTo(6.89f);
        pathBuilderC.lineTo(5.0f, 8.69f);
        pathBuilderC.verticalLineTo(16.0f);
        b.m(pathBuilderC, 2.0f, 14.0f, 9.0f, 11.5f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.reflectiveCurveTo(9.55f, 11.5f, 9.0f, 11.5f);
        pathBuilderC.close();
        pathBuilderC.moveTo(15.0f, 11.5f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.reflectiveCurveTo(15.55f, 11.5f, 15.0f, 11.5f);
        androidx.compose.animation.a.j(pathBuilderC, 8.33f, 5.0f, 7.34f);
        pathBuilderC.lineToRelative(0.66f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.k(pathBuilderC, 7.67f, 8.33f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRepair = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
