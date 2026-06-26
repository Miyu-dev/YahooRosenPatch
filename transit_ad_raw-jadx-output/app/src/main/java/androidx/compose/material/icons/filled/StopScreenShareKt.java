package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: StopScreenShare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Filled;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.StopScreenShare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.22f, 18.02f, 2.0f, 2.0f);
        a.k(pathBuilderA, 24.0f, 20.02f, -2.0f, -2.78f);
        pathBuilderA.moveTo(21.99f, 16.02f);
        pathBuilderA.lineToRelative(0.01f, -10.0f);
        pathBuilderA.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.lineTo(7.22f, 4.02f);
        pathBuilderA.lineToRelative(5.23f, 5.23f);
        pathBuilderA.curveToRelative(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f);
        pathBuilderA.lineTo(13.0f, 7.02f);
        pathBuilderA.lineToRelative(4.0f, 3.73f);
        pathBuilderA.lineToRelative(-1.58f, 1.47f);
        pathBuilderA.lineToRelative(5.54f, 5.54f);
        pathBuilderA.curveToRelative(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f);
        androidx.compose.animation.a.t(pathBuilderA, 2.39f, 1.73f, 1.11f, 3.0f);
        pathBuilderA.lineToRelative(1.54f, 1.54f);
        pathBuilderA.curveToRelative(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f);
        pathBuilderA.verticalLineToRelative(10.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        a.b.s(pathBuilderA, 0.0f, 18.02f, 2.0f, 18.13f);
        pathBuilderA.lineToRelative(2.71f, 2.71f);
        s.r(pathBuilderA, 1.27f, -1.27f, 2.39f, 1.73f);
        pathBuilderA.moveTo(7.0f, 15.02f);
        pathBuilderA.curveToRelative(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f);
        pathBuilderA.lineToRelative(1.59f, 1.59f);
        pathBuilderA.curveToRelative(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
