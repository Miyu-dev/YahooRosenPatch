package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: Preview.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_preview", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Preview", "Landroidx/compose/material/icons/Icons$Sharp;", "getPreview", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PreviewKt {
    private static ImageVector _preview;

    public static final ImageVector getPreview(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _preview;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Preview", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(3.0f, 3.0f, 18.0f, 18.0f, 3.0f);
        h.r(pathBuilderV, 3.0f, 19.0f, 19.0f, 5.0f);
        a.v(pathBuilderV, 7.0f, 14.0f, 19.0f);
        pathBuilderV.moveTo(13.5f, 13.0f);
        pathBuilderV.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderV.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderV.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderV.reflectiveCurveTo(13.5f, 12.17f, 13.5f, 13.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(12.0f, 9.0f);
        pathBuilderV.curveToRelative(-2.73f, 0.0f, -5.06f, 1.66f, -6.0f, 4.0f);
        pathBuilderV.curveToRelative(0.94f, 2.34f, 3.27f, 4.0f, 6.0f, 4.0f);
        pathBuilderV.reflectiveCurveToRelative(5.06f, -1.66f, 6.0f, -4.0f);
        pathBuilderV.curveTo(17.06f, 10.66f, 14.73f, 9.0f, 12.0f, 9.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(12.0f, 15.5f);
        pathBuilderV.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderV.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderV.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderV.curveTo(14.5f, 14.38f, 13.38f, 15.5f, 12.0f, 15.5f);
        pathBuilderV.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderV.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _preview = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
