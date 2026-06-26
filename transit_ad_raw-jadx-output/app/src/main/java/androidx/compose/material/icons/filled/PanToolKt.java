package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: PanTool.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panTool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanTool", "Landroidx/compose/material/icons/Icons$Filled;", "getPanTool", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanTool", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(23.0f, 5.5f, 20.0f);
        pathBuilderN.curveToRelative(0.0f, 2.2f, -1.8f, 4.0f, -4.0f, 4.0f);
        pathBuilderN.horizontalLineToRelative(-7.3f);
        pathBuilderN.curveToRelative(-1.08f, 0.0f, -2.1f, -0.43f, -2.85f, -1.19f);
        pathBuilderN.lineTo(1.0f, 14.83f);
        pathBuilderN.curveToRelative(0.0f, 0.0f, 1.26f, -1.23f, 1.3f, -1.25f);
        pathBuilderN.curveToRelative(0.22f, -0.19f, 0.49f, -0.29f, 0.79f, -0.29f);
        pathBuilderN.curveToRelative(0.22f, 0.0f, 0.42f, 0.06f, 0.6f, 0.16f);
        pathBuilderN.curveTo(3.73f, 13.46f, 8.0f, 15.91f, 8.0f, 15.91f);
        pathBuilderN.verticalLineTo(4.0f);
        pathBuilderN.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderN.reflectiveCurveTo(11.0f, 3.17f, 11.0f, 4.0f);
        s.l(pathBuilderN, 7.0f, 1.0f, 1.5f);
        pathBuilderN.curveTo(12.0f, 0.67f, 12.67f, 0.0f, 13.5f, 0.0f);
        pathBuilderN.reflectiveCurveTo(15.0f, 0.67f, 15.0f, 1.5f);
        h.w(pathBuilderN, 11.0f, 1.0f, 2.5f);
        pathBuilderN.curveTo(16.0f, 1.67f, 16.67f, 1.0f, 17.5f, 1.0f);
        pathBuilderN.reflectiveCurveTo(19.0f, 1.67f, 19.0f, 2.5f);
        h.w(pathBuilderN, 11.0f, 1.0f, 5.5f);
        pathBuilderN.curveTo(20.0f, 4.67f, 20.67f, 4.0f, 21.5f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderN, 23.0f, 4.67f, 23.0f, 5.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
