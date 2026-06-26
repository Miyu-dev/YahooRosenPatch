package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_handshake", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Handshake", "Landroidx/compose/material/icons/Icons$Outlined;", "getHandshake", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Handshake", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.22f, 19.85f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilderD.curveToRelative(-0.18f, -0.18f, -0.21f, -0.5f, 0.0f, -0.71f);
        pathBuilderD.lineToRelative(3.39f, -3.39f);
        pathBuilderD.lineToRelative(-1.41f, -1.41f);
        pathBuilderD.lineToRelative(-3.39f, 3.39f);
        pathBuilderD.curveToRelative(-0.19f, 0.2f, -0.51f, 0.19f, -0.71f, 0.0f);
        pathBuilderD.curveToRelative(-0.21f, -0.21f, -0.18f, -0.53f, 0.0f, -0.71f);
        pathBuilderD.lineToRelative(3.39f, -3.39f);
        pathBuilderD.lineToRelative(-1.41f, -1.41f);
        pathBuilderD.lineToRelative(-3.39f, 3.39f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilderD.curveToRelative(-0.19f, -0.19f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilderD.lineToRelative(3.39f, -3.39f);
        pathBuilderD.lineTo(9.24f, 10.1f);
        pathBuilderD.lineToRelative(-3.39f, 3.39f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0.0f);
        pathBuilderD.curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilderD.lineTo(9.52f, 8.4f);
        pathBuilderD.lineToRelative(1.87f, 1.86f);
        pathBuilderD.curveToRelative(0.95f, 0.95f, 2.59f, 0.94f, 3.54f, 0.0f);
        pathBuilderD.curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0.0f, -3.54f);
        pathBuilderD.lineToRelative(-1.86f, -1.86f);
        pathBuilderD.lineToRelative(0.28f, -0.28f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderD.lineToRelative(4.24f, 4.24f);
        pathBuilderD.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 12.22f, 19.85f, 21.83f, 13.07f);
        pathBuilderD.curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0.0f, -5.66f);
        pathBuilderD.lineToRelative(-4.24f, -4.24f);
        pathBuilderD.curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0.0f);
        pathBuilderD.lineToRelative(-0.28f, 0.28f);
        pathBuilderD.lineToRelative(-0.28f, -0.28f);
        pathBuilderD.curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0.0f);
        pathBuilderD.lineTo(2.17f, 6.71f);
        pathBuilderD.curveToRelative(-1.42f, 1.42f, -1.55f, 3.63f, -0.4f, 5.19f);
        pathBuilderD.lineToRelative(1.45f, -1.45f);
        pathBuilderD.curveTo(2.83f, 9.7f, 2.96f, 8.75f, 3.59f, 8.12f);
        pathBuilderD.lineToRelative(3.54f, -3.54f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderD.lineToRelative(3.56f, 3.56f);
        pathBuilderD.curveToRelative(0.18f, 0.18f, 0.21f, 0.5f, 0.0f, 0.71f);
        pathBuilderD.curveToRelative(-0.21f, 0.21f, -0.53f, 0.18f, -0.71f, 0.0f);
        pathBuilderD.lineTo(9.52f, 5.57f);
        pathBuilderD.lineToRelative(-5.8f, 5.79f);
        pathBuilderD.curveToRelative(-0.98f, 0.97f, -0.98f, 2.56f, 0.0f, 3.54f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.89f, 0.63f, 1.42f, 0.7f);
        pathBuilderD.curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f);
        pathBuilderD.curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f);
        pathBuilderD.curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f);
        pathBuilderD.curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f);
        pathBuilderD.curveToRelative(0.07f, 0.54f, 0.31f, 1.03f, 0.7f, 1.42f);
        pathBuilderD.curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f);
        pathBuilderD.curveToRelative(0.67f, 0.0f, 1.3f, -0.26f, 1.77f, -0.73f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 21.83f, 13.07f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
