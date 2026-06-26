package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: RingVolume.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ringVolume", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RingVolume", "Landroidx/compose/material/icons/Icons$Rounded;", "getRingVolume", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RingVolume", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(11.98f, 7.0f, 0.03f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.98f);
        pathBuilderB.lineTo(13.0f, 2.98f);
        pathBuilderB.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        pathBuilderB.horizontalLineToRelative(-0.03f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f);
        pathBuilderB.verticalLineToRelative(3.03f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.98f, 0.99f);
        pathBuilderB.close();
        pathBuilderB.moveTo(16.9f, 9.11f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilderB.curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f);
        pathBuilderB.curveToRelative(0.39f, -0.38f, 0.39f, -1.01f, 0.0f, -1.39f);
        pathBuilderB.curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f);
        pathBuilderB.lineTo(16.89f, 7.7f);
        pathBuilderB.curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f);
        a.t(pathBuilderB, 0.01f, 0.02f, 5.71f, 9.1f);
        pathBuilderB.curveToRelative(0.38f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilderB.curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f);
        pathBuilderB.lineTo(4.96f, 5.54f);
        pathBuilderB.curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f);
        pathBuilderB.lineToRelative(-0.02f, 0.01f);
        pathBuilderB.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilderB.curveToRelative(0.63f, 0.62f, 1.54f, 1.53f, 2.16f, 2.16f);
        pathBuilderB.close();
        pathBuilderB.moveTo(23.29f, 16.23f);
        pathBuilderB.curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0.0f);
        pathBuilderB.curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f);
        pathBuilderB.lineToRelative(1.22f, 1.22f);
        pathBuilderB.curveToRelative(0.72f, 0.72f, 1.86f, 0.78f, 2.66f, 0.15f);
        pathBuilderB.lineToRelative(2.0f, -1.59f);
        pathBuilderB.curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f);
        pathBuilderB.verticalLineToRelative(-2.6f);
        pathBuilderB.curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0.0f);
        pathBuilderB.verticalLineToRelative(2.61f);
        pathBuilderB.curveToRelative(0.0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f);
        pathBuilderB.lineToRelative(1.99f, 1.58f);
        pathBuilderB.curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f);
        pathBuilderB.lineToRelative(1.22f, -1.22f);
        pathBuilderB.curveToRelative(0.79f, -0.8f, 0.79f, -2.13f, -0.06f, -2.88f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
