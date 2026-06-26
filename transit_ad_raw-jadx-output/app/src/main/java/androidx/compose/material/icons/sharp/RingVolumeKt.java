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

/* JADX INFO: compiled from: RingVolume.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ringVolume", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RingVolume", "Landroidx/compose/material/icons/Icons$Sharp;", "getRingVolume", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RingVolume", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.16f, 6.26f, -1.41f, -1.41f);
        pathBuilderA.lineToRelative(-3.56f, 3.55f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f);
        b.r(pathBuilderA, 11.0f, 2.0f, 2.0f, 5.0f);
        b.q(pathBuilderA, -2.0f, 6.4f, 9.81f);
        pathBuilderA.lineTo(7.81f, 8.4f);
        pathBuilderA.lineTo(4.26f, 4.84f);
        pathBuilderA.lineTo(2.84f, 6.26f);
        pathBuilderA.curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f);
        a.y(pathBuilderA, 0.0f, 17.39f, 3.68f, 3.68f);
        pathBuilderA.lineToRelative(3.92f, -3.11f);
        pathBuilderA.verticalLineToRelative(-3.37f);
        pathBuilderA.curveToRelative(2.85f, -0.93f, 5.94f, -0.93f, 8.8f, 0.0f);
        pathBuilderA.verticalLineToRelative(3.38f);
        pathBuilderA.lineToRelative(3.91f, 3.1f);
        pathBuilderA.lineTo(24.0f, 17.39f);
        pathBuilderA.curveToRelative(-6.41f, -7.19f, -17.59f, -7.19f, -24.0f, 0.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
