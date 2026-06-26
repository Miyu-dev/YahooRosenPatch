package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: PhoneBluetoothSpeaker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneBluetoothSpeaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneBluetoothSpeaker", "Landroidx/compose/material/icons/Icons$Filled;", "getPhoneBluetoothSpeaker", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhoneBluetoothSpeaker", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.71f, 9.5f, 17.0f, 7.21f);
        pathBuilderA.lineTo(17.0f, 11.0f);
        pathBuilderA.horizontalLineToRelative(0.5f);
        pathBuilderA.lineToRelative(2.85f, -2.85f);
        pathBuilderA.lineTo(18.21f, 6.0f);
        pathBuilderA.lineToRelative(2.15f, -2.15f);
        pathBuilderA.lineTo(17.5f, 1.0f);
        pathBuilderA.lineTo(17.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(3.79f);
        pathBuilderA.lineTo(14.71f, 2.5f);
        pathBuilderA.lineToRelative(-0.71f, 0.71f);
        pathBuilderA.lineTo(16.79f, 6.0f);
        a.A(pathBuilderA, 14.0f, 8.79f, 0.71f, 0.71f);
        pathBuilderA.moveTo(18.0f, 2.91f);
        pathBuilderA.lineToRelative(0.94f, 0.94f);
        s.r(pathBuilderA, -0.94f, 0.94f, 18.0f, 2.91f);
        pathBuilderA.moveTo(18.0f, 7.21f);
        pathBuilderA.lineToRelative(0.94f, 0.94f);
        s.r(pathBuilderA, -0.94f, 0.94f, 18.0f, 7.21f);
        pathBuilderA.moveTo(20.0f, 15.5f);
        pathBuilderA.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        pathBuilderA.curveToRelative(-0.35f, -0.11f, -0.74f, -0.03f, -1.02f, 0.24f);
        pathBuilderA.lineToRelative(-2.2f, 2.2f);
        pathBuilderA.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilderA.lineToRelative(2.2f, -2.21f);
        pathBuilderA.curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f);
        pathBuilderA.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.lineTo(4.0f, 3.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-3.5f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
