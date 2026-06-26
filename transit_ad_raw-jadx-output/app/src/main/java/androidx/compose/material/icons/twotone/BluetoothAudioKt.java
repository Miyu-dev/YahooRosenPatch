package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: BluetoothAudio.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bluetoothAudio", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothAudio", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBluetoothAudio", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BluetoothAudioKt {
    private static ImageVector _bluetoothAudio;

    public static final ImageVector getBluetoothAudio(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _bluetoothAudio;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothAudio", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.24f, 12.01f, 2.32f, 2.32f);
        pathBuilderA.curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
        pathBuilderA.reflectiveCurveToRelative(-0.16f, -1.59f, -0.43f, -2.31f);
        a.t(pathBuilderA, -2.33f, 2.32f, 19.53f, 6.71f);
        pathBuilderA.lineToRelative(-1.26f, 1.26f);
        pathBuilderA.curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
        pathBuilderA.reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f);
        pathBuilderA.lineToRelative(1.2f, 1.2f);
        pathBuilderA.curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
        pathBuilderA.curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
        androidx.compose.animation.a.t(pathBuilderA, 15.71f, 7.71f, 10.0f, 2.0f);
        pathBuilderA.lineTo(9.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(7.59f);
        pathBuilderA.lineTo(4.41f, 5.0f);
        pathBuilderA.lineTo(3.0f, 6.41f);
        pathBuilderA.lineTo(8.59f, 12.0f);
        pathBuilderA.lineTo(3.0f, 17.59f);
        pathBuilderA.lineTo(4.41f, 19.0f);
        pathBuilderA.lineTo(9.0f, 14.41f);
        pathBuilderA.lineTo(9.0f, 22.0f);
        pathBuilderA.horizontalLineToRelative(1.0f);
        pathBuilderA.lineToRelative(5.71f, -5.71f);
        a.n(pathBuilderA, -4.3f, -4.29f, 4.3f, -4.29f);
        pathBuilderA.moveTo(11.0f, 5.83f);
        pathBuilderA.lineToRelative(1.88f, 1.88f);
        a.C(pathBuilderA, 11.0f, 9.59f, 11.0f, 5.83f);
        pathBuilderA.moveTo(12.88f, 16.29f);
        pathBuilderA.lineTo(11.0f, 18.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.m(pathBuilderA, -3.76f, 1.88f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothAudio = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
