package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: BluetoothConnected.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bluetoothConnected", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothConnected", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBluetoothConnected", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BluetoothConnectedKt {
    private static ImageVector _bluetoothConnected;

    public static final ImageVector getBluetoothConnected(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _bluetoothConnected;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothConnected", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.0f, 12.0f, -2.0f, -2.0f);
        pathBuilderA.lineToRelative(-2.0f, 2.0f);
        a.n(pathBuilderA, 2.0f, 2.0f, 2.0f, -2.0f);
        pathBuilderA.moveTo(17.71f, 7.71f);
        androidx.compose.animation.a.o(pathBuilderA, 12.0f, 2.0f, -1.0f, 7.59f);
        pathBuilderA.lineTo(6.41f, 5.0f);
        pathBuilderA.lineTo(5.0f, 6.41f);
        pathBuilderA.lineTo(10.59f, 12.0f);
        pathBuilderA.lineTo(5.0f, 17.59f);
        pathBuilderA.lineTo(6.41f, 19.0f);
        pathBuilderA.lineTo(11.0f, 14.41f);
        pathBuilderA.lineTo(11.0f, 22.0f);
        pathBuilderA.horizontalLineToRelative(1.0f);
        pathBuilderA.lineToRelative(5.71f, -5.71f);
        a.n(pathBuilderA, -4.3f, -4.29f, 4.3f, -4.29f);
        pathBuilderA.moveTo(13.0f, 5.83f);
        pathBuilderA.lineToRelative(1.88f, 1.88f);
        a.C(pathBuilderA, 13.0f, 9.59f, 13.0f, 5.83f);
        pathBuilderA.moveTo(14.88f, 16.29f);
        pathBuilderA.lineTo(13.0f, 18.17f);
        v.v(pathBuilderA, -3.76f, 1.88f, 1.88f);
        pathBuilderA.moveTo(19.0f, 10.0f);
        pathBuilderA.lineToRelative(-2.0f, 2.0f);
        pathBuilderA.lineToRelative(2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 2.0f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothConnected = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
