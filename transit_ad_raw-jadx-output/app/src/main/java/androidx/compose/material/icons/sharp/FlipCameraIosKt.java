package androidx.compose.material.icons.sharp;

import a.b;
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

/* JADX INFO: compiled from: FlipCameraIos.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flipCameraIos", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FlipCameraIos", "Landroidx/compose/material/icons/Icons$Sharp;", "getFlipCameraIos", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FlipCameraIosKt {
    private static ImageVector _flipCameraIos;

    public static final ImageVector getFlipCameraIos(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _flipCameraIos;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FlipCameraIos", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderX = a.x(16.83f, 5.0f, 15.0f, 3.0f, 9.0f);
        h.n(pathBuilderX, 7.17f, 5.0f, 2.0f, 16.0f);
        b.w(pathBuilderX, 20.0f, 5.0f, 16.83f);
        pathBuilderX.moveTo(12.0f, 18.0f);
        pathBuilderX.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilderX.horizontalLineTo(5.0f);
        pathBuilderX.lineToRelative(2.5f, -2.5f);
        pathBuilderX.lineTo(10.0f, 13.0f);
        pathBuilderX.horizontalLineTo(8.0f);
        pathBuilderX.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderX.curveToRelative(0.58f, 0.0f, 1.13f, -0.13f, 1.62f, -0.35f);
        pathBuilderX.lineToRelative(0.74f, 0.74f);
        pathBuilderX.curveTo(13.65f, 17.76f, 12.86f, 18.0f, 12.0f, 18.0f);
        androidx.compose.animation.a.t(pathBuilderX, 16.5f, 15.5f, 14.0f, 13.0f);
        pathBuilderX.horizontalLineToRelative(2.0f);
        pathBuilderX.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderX.curveToRelative(-0.58f, 0.0f, -1.13f, 0.13f, -1.62f, 0.35f);
        pathBuilderX.lineTo(9.64f, 8.62f);
        pathBuilderX.curveTo(10.35f, 8.24f, 11.14f, 8.0f, 12.0f, 8.0f);
        pathBuilderX.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.r(pathBuilderX, 2.0f, 16.5f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flipCameraIos = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
