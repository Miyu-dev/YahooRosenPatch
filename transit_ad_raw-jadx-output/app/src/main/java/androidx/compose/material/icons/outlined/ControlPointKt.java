package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ControlPoint.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_controlPoint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ControlPoint", "Landroidx/compose/material/icons/Icons$Outlined;", "getControlPoint", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ControlPointKt {
    private static ImageVector _controlPoint;

    public static final ImageVector getControlPoint(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _controlPoint;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ControlPoint", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(13.0f, 7.0f, -2.0f, 4.0f);
        b.s(pathBuilderO, 7.0f, 11.0f, 2.0f, 4.0f);
        a.l(pathBuilderO, 4.0f, 2.0f, -4.0f, 4.0f);
        s.x(pathBuilderO, -2.0f, -4.0f, 13.0f, 7.0f);
        pathBuilderO.moveTo(12.0f, 2.0f);
        pathBuilderO.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        pathBuilderO.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        pathBuilderO.reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f);
        pathBuilderO.reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(12.0f, 20.0f);
        pathBuilderO.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderO.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderO.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderO, -3.59f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlPoint = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
