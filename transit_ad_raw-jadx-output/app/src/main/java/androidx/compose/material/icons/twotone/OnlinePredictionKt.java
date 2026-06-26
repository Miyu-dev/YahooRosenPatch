package androidx.compose.material.icons.twotone;

import a.b;
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

/* JADX INFO: compiled from: OnlinePrediction.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_onlinePrediction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OnlinePrediction", "Landroidx/compose/material/icons/Icons$TwoTone;", "getOnlinePrediction", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OnlinePredictionKt {
    private static ImageVector _onlinePrediction;

    public static final ImageVector getOnlinePrediction(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _onlinePrediction;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.OnlinePrediction", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.5f, 11.5f);
        pathBuilderD.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilderD.curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f);
        androidx.compose.animation.a.k(pathBuilderD, 13.0f, 17.5f, -2.0f, 19.0f);
        b.m(pathBuilderD, 2.0f, 17.5f, 22.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f);
        pathBuilderD.lineToRelative(-1.06f, 1.06f);
        pathBuilderD.curveTo(19.55f, 7.53f, 20.5f, 9.66f, 20.5f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.34f, -0.95f, 4.47f, -2.49f, 6.01f);
        pathBuilderD.lineToRelative(1.06f, 1.06f);
        pathBuilderD.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(3.5f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.34f, 0.95f, -4.47f, 2.49f, -6.01f);
        pathBuilderD.lineTo(4.93f, 4.93f);
        pathBuilderD.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        pathBuilderD.curveTo(4.45f, 16.47f, 3.5f, 14.34f, 3.5f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.5f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.52f, -0.62f, 2.89f, -1.61f, 3.89f);
        pathBuilderD.lineToRelative(1.06f, 1.06f);
        pathBuilderD.curveTo(18.22f, 15.68f, 19.0f, 13.93f, 19.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.93f, -0.78f, -3.68f, -2.05f, -4.95f);
        pathBuilderD.lineToRelative(-1.06f, 1.06f);
        pathBuilderD.curveTo(16.88f, 9.11f, 17.5f, 10.48f, 17.5f, 12.0f);
        a.y(pathBuilderD, 7.05f, 16.95f, 1.06f, -1.06f);
        pathBuilderD.curveToRelative(-1.0f, -1.0f, -1.61f, -2.37f, -1.61f, -3.89f);
        pathBuilderD.curveToRelative(0.0f, -1.52f, 0.62f, -2.89f, 1.61f, -3.89f);
        pathBuilderD.lineTo(7.05f, 7.05f);
        pathBuilderD.curveTo(5.78f, 8.32f, 5.0f, 10.07f, 5.0f, 12.0f);
        pathBuilderD.curveTo(5.0f, 13.93f, 5.78f, 15.68f, 7.05f, 16.95f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _onlinePrediction = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
