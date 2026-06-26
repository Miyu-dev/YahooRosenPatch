package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: StopScreenShare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Sharp;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.StopScreenShare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.79f, 18.0f, 2.0f, 2.0f);
        b.k(pathBuilderA, 24.0f, 20.0f, -2.0f);
        pathBuilderA.moveTo(13.0f, 9.13f);
        pathBuilderA.lineTo(13.0f, 7.0f);
        pathBuilderA.lineToRelative(4.0f, 3.74f);
        pathBuilderA.lineToRelative(-1.28f, 1.19f);
        pathBuilderA.lineToRelative(5.18f, 5.18f);
        pathBuilderA.lineTo(22.0f, 16.0f);
        pathBuilderA.lineTo(22.0f, 4.02f);
        pathBuilderA.lineTo(7.8f, 4.02f);
        pathBuilderA.lineToRelative(5.13f, 5.13f);
        pathBuilderA.curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.07f, -0.02f);
        a.y(pathBuilderA, 1.11f, 2.98f, 0.89f, 0.9f);
        pathBuilderA.verticalLineToRelative(12.14f);
        pathBuilderA.lineToRelative(2.0f, 1.99f);
        a.b.s(pathBuilderA, 0.0f, 18.0f, 2.0f, 18.13f);
        pathBuilderA.lineToRelative(2.71f, 2.71f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.C(pathBuilderA, 2.52f, 1.57f, 1.11f, 2.98f);
        pathBuilderA.moveTo(9.08f, 10.95f);
        pathBuilderA.lineToRelative(1.59f, 1.59f);
        pathBuilderA.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        pathBuilderA.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
