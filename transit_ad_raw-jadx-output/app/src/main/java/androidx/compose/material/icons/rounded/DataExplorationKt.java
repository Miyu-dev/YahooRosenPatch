package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: DataExploration.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dataExploration", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DataExploration", "Landroidx/compose/material/icons/Icons$Rounded;", "getDataExploration", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DataExplorationKt {
    private static ImageVector _dataExploration;

    public static final ImageVector getDataExploration(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _dataExploration;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DataExploration", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.33f, 0.26f, 2.61f, 0.74f, 3.77f);
        pathBuilderD.lineToRelative(4.61f, -4.62f);
        pathBuilderD.curveToRelative(0.37f, -0.37f, 0.95f, -0.39f, 1.35f, -0.06f);
        pathBuilderD.lineToRelative(2.6f, 2.19f);
        pathBuilderD.lineTo(14.58f, 10.0f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-0.58f);
        pathBuilderD.lineToRelative(-3.94f, 3.93f);
        pathBuilderD.curveToRelative(-0.37f, 0.37f, -0.96f, 0.39f, -1.35f, 0.05f);
        pathBuilderD.lineToRelative(-2.59f, -2.19f);
        pathBuilderD.lineToRelative(-4.4f, 4.4f);
        pathBuilderD.curveTo(5.52f, 20.26f, 8.56f, 22.0f, 12.0f, 22.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        android.support.v4.media.a.y(pathBuilderD, 12.0f, 19.5f, 20.5f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 20.05f, 20.5f, 19.5f, 20.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataExploration = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
