package androidx.compose.material.icons.rounded;

import android.support.v4.media.a;
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

/* JADX INFO: compiled from: StopScreenShare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Rounded;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StopScreenShare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(23.0f, 18.0f, -1.2f, 1.79f, 1.79f);
        pathBuilderA.curveToRelative(0.24f, -0.18f, 0.41f, -0.46f, 0.41f, -0.79f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(3.23f, 2.28f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineToRelative(0.84f, 0.86f);
        pathBuilderA.reflectiveCurveToRelative(-0.66f, 0.57f, -0.66f, 1.47f);
        pathBuilderA.curveTo(2.0f, 6.92f, 2.0f, 16.0f, 2.0f, 16.0f);
        pathBuilderA.lineToRelative(0.01f, 0.01f);
        pathBuilderA.curveToRelative(0.0f, 1.09f, 0.88f, 1.98f, 1.97f, 1.99f);
        pathBuilderA.lineTo(1.0f, 18.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(17.13f);
        pathBuilderA.lineToRelative(2.0f, 2.0f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 3.23f, 2.28f, 7.0f, 15.0f);
        pathBuilderA.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        pathBuilderA.lineToRelative(1.59f, 1.59f);
        pathBuilderA.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        androidx.compose.animation.a.n(pathBuilderA, 13.0f, 9.13f, -0.98f);
        pathBuilderA.curveToRelative(0.0f, -0.44f, 0.52f, -0.66f, 0.84f, -0.37f);
        pathBuilderA.lineTo(15.0f, 8.87f);
        pathBuilderA.lineToRelative(1.61f, 1.5f);
        pathBuilderA.curveToRelative(0.21f, 0.2f, 0.21f, 0.53f, 0.0f, 0.73f);
        pathBuilderA.lineToRelative(-0.89f, 0.83f);
        pathBuilderA.lineToRelative(5.58f, 5.58f);
        pathBuilderA.curveToRelative(0.43f, -0.37f, 0.7f, -0.9f, 0.7f, -1.51f);
        pathBuilderA.lineTo(22.0f, 6.0f);
        pathBuilderA.curveToRelative(0.0f, -1.09f, -0.89f, -1.98f, -1.98f, -1.98f);
        pathBuilderA.lineTo(7.8f, 4.02f);
        pathBuilderA.lineToRelative(5.14f, 5.13f);
        pathBuilderA.curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.02f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
