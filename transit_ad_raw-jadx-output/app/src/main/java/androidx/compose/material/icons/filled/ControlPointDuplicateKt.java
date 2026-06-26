package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: ControlPointDuplicate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_controlPointDuplicate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ControlPointDuplicate", "Landroidx/compose/material/icons/Icons$Filled;", "getControlPointDuplicate", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ControlPointDuplicateKt {
    private static ImageVector _controlPointDuplicate;

    public static final ImageVector getControlPointDuplicate(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _controlPointDuplicate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ControlPointDuplicate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(16.0f, 8.0f, -2.0f, 3.0f, -3.0f);
        a.l(pathBuilderF, 2.0f, 3.0f, 3.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.y(pathBuilderF, -3.0f, 3.0f, -2.0f, -3.0f);
        pathBuilderF.moveTo(2.0f, 12.0f);
        pathBuilderF.curveToRelative(0.0f, -2.79f, 1.64f, -5.2f, 4.01f, -6.32f);
        pathBuilderF.lineTo(6.01f, 3.52f);
        pathBuilderF.curveTo(2.52f, 4.76f, 0.0f, 8.09f, 0.0f, 12.0f);
        pathBuilderF.reflectiveCurveToRelative(2.52f, 7.24f, 6.01f, 8.48f);
        pathBuilderF.verticalLineToRelative(-2.16f);
        pathBuilderF.curveTo(3.64f, 17.2f, 2.0f, 14.79f, 2.0f, 12.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(15.0f, 3.0f);
        pathBuilderF.curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f);
        pathBuilderF.reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f);
        pathBuilderF.reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f);
        pathBuilderF.reflectiveCurveToRelative(-4.04f, -9.0f, -9.0f, -9.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(15.0f, 19.0f);
        pathBuilderF.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilderF.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilderF.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderF, -3.14f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlPointDuplicate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
