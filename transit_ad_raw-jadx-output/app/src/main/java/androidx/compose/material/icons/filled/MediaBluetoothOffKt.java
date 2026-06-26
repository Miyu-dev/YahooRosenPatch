package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: MediaBluetoothOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mediaBluetoothOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MediaBluetoothOff", "Landroidx/compose/material/icons/Icons$Filled;", "getMediaBluetoothOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MediaBluetoothOffKt {
    private static ImageVector _mediaBluetoothOff;

    public static final ImageVector getMediaBluetoothOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _mediaBluetoothOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MediaBluetoothOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(9.0f, 6.17f, 3.0f, 6.0f, 4.0f);
        androidx.appcompat.app.m.C(pathBuilderC, -4.0f, 1.17f, 9.0f, 6.17f);
        pathBuilderC.moveTo(19.42f, 15.0f);
        pathBuilderC.lineTo(22.0f, 17.57f);
        pathBuilderC.lineToRelative(-0.8f, 0.8f);
        pathBuilderC.lineToRelative(-6.78f, -6.78f);
        pathBuilderC.lineToRelative(0.8f, -0.8f);
        s.D(pathBuilderC, 2.75f, 2.75f, 9.0f, 0.6f);
        a.C(pathBuilderC, 22.0f, 12.43f, 19.42f, 15.0f);
        pathBuilderC.moveTo(19.17f, 13.55f);
        pathBuilderC.lineToRelative(1.13f, -1.13f);
        c.a.g(pathBuilderC, -1.13f, -1.13f, 13.55f);
        pathBuilderC.moveTo(21.19f, 21.19f);
        pathBuilderC.lineToRelative(-1.41f, 1.41f);
        pathBuilderC.lineToRelative(-3.98f, -3.98f);
        pathBuilderC.lineToRelative(-0.58f, 0.58f);
        pathBuilderC.lineToRelative(-0.85f, -0.85f);
        pathBuilderC.lineToRelative(0.58f, -0.58f);
        pathBuilderC.lineTo(11.0f, 13.83f);
        pathBuilderC.verticalLineTo(17.0f);
        pathBuilderC.curveToRelative(0.0f, 2.21f, -1.78f, 4.0f, -3.99f, 4.0f);
        pathBuilderC.reflectiveCurveTo(3.0f, 19.21f, 3.0f, 17.0f);
        pathBuilderC.reflectiveCurveToRelative(1.79f, -4.0f, 4.01f, -4.0f);
        pathBuilderC.curveToRelative(0.73f, 0.0f, 1.41f, 0.21f, 2.0f, 0.55f);
        pathBuilderC.verticalLineToRelative(-1.72f);
        pathBuilderC.lineTo(1.39f, 4.22f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderC, 2.8f, 2.81f, 21.19f, 21.19f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
