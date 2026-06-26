package androidx.compose.material.icons.outlined;

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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stopScreenShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StopScreenShare", "Landroidx/compose/material/icons/Icons$Outlined;", "getStopScreenShare", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.StopScreenShare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.79f, 18.0f, 2.0f, 2.0f);
        a.k(pathBuilderA, 24.0f, 20.0f, -2.0f, -2.21f);
        pathBuilderA.moveTo(1.11f, 2.98f);
        pathBuilderA.lineToRelative(1.55f, 1.56f);
        pathBuilderA.curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f);
        pathBuilderA.lineTo(2.0f, 16.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        a.b.s(pathBuilderA, 0.0f, 18.0f, 2.0f, 18.13f);
        pathBuilderA.lineToRelative(2.71f, 2.71f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.C(pathBuilderA, 2.52f, 1.57f, 1.11f, 2.98f);
        pathBuilderA.moveTo(4.0f, 6.02f);
        pathBuilderA.horizontalLineToRelative(0.13f);
        pathBuilderA.lineToRelative(4.95f, 4.93f);
        pathBuilderA.curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f);
        pathBuilderA.curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f);
        pathBuilderA.lineToRelative(3.46f, 3.48f);
        b.k(pathBuilderA, 4.0f, 16.02f, -10.0f);
        pathBuilderA.moveTo(20.0f, 6.02f);
        pathBuilderA.verticalLineToRelative(10.19f);
        pathBuilderA.lineToRelative(1.3f, 1.3f);
        pathBuilderA.curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f);
        pathBuilderA.verticalLineToRelative(-10.0f);
        pathBuilderA.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.lineTo(7.8f, 4.02f);
        s.r(pathBuilderA, 2.0f, 2.0f, 20.0f, 6.02f);
        pathBuilderA.moveTo(12.93f, 9.15f);
        pathBuilderA.lineToRelative(2.79f, 2.78f);
        pathBuilderA.lineToRelative(1.28f, -1.2f);
        pathBuilderA.lineTo(13.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.m(pathBuilderA, 2.13f, -0.07f, 0.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
