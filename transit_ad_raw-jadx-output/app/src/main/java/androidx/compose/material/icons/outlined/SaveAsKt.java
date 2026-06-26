package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: SaveAs.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_saveAs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SaveAs", "Landroidx/compose/material/icons/Icons$Outlined;", "getSaveAs", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SaveAsKt {
    private static ImageVector _saveAs;

    public static final ImageVector getSaveAs(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _saveAs;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SaveAs", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = b.u(21.0f, 12.4f, 7.0f, -4.0f, -4.0f);
        pathBuilderU.horizontalLineTo(5.0f);
        pathBuilderU.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderU.verticalLineToRelative(14.0f);
        pathBuilderU.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        a.C(pathBuilderU, 7.4f, 2.0f, -2.0f, 5.0f);
        pathBuilderU.verticalLineTo(5.0f);
        pathBuilderU.horizontalLineToRelative(11.17f);
        pathBuilderU.lineTo(19.0f, 7.83f);
        h.q(pathBuilderU, 6.57f, 21.0f, 12.4f);
        pathBuilderU.moveTo(15.0f, 15.0f);
        pathBuilderU.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilderU.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderU.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderU.reflectiveCurveTo(15.0f, 13.34f, 15.0f, 15.0f);
        androidx.compose.animation.b.r(pathBuilderU, 6.0f, 6.0f, 9.0f, 4.0f);
        b.B(pathBuilderU, 6.0f, 6.0f, 19.99f, 16.25f);
        pathBuilderU.lineToRelative(1.77f, 1.77f);
        h.n(pathBuilderU, 16.77f, 23.0f, 15.0f, -1.77f);
        androidx.appcompat.view.menu.a.z(pathBuilderU, 19.99f, 16.25f, 23.25f, 16.51f);
        pathBuilderU.lineToRelative(-0.85f, 0.85f);
        pathBuilderU.lineToRelative(-1.77f, -1.77f);
        pathBuilderU.lineToRelative(0.85f, -0.85f);
        pathBuilderU.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilderU.lineToRelative(1.06f, 1.06f);
        pathBuilderU.curveTo(23.45f, 16.0f, 23.45f, 16.32f, 23.25f, 16.51f);
        pathBuilderU.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderU.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _saveAs = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
