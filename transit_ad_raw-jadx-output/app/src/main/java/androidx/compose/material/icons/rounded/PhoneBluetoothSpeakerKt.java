package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: PhoneBluetoothSpeaker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneBluetoothSpeaker", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneBluetoothSpeaker", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhoneBluetoothSpeaker", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneBluetoothSpeaker", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.23f, 15.26f, -2.54f, -0.29f);
        pathBuilderA.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilderA.lineToRelative(-1.84f, 1.84f);
        pathBuilderA.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilderA.lineToRelative(1.85f, -1.85f);
        pathBuilderA.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        pathBuilderA.lineToRelative(-0.29f, -2.52f);
        pathBuilderA.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        pathBuilderA.lineTo(5.03f, 3.01f);
        pathBuilderA.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilderA.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilderA.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilderA.verticalLineToRelative(-1.73f);
        pathBuilderA.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        a.y(pathBuilderA, 16.79f, 6.01f, -2.45f, 2.45f);
        pathBuilderA.curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f);
        pathBuilderA.curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f);
        pathBuilderA.lineTo(17.0f, 7.23f);
        pathBuilderA.verticalLineToRelative(3.15f);
        pathBuilderA.curveToRelative(0.0f, 0.2f, 0.12f, 0.39f, 0.31f, 0.47f);
        pathBuilderA.curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.19f, 0.04f);
        pathBuilderA.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.36f, -0.15f);
        pathBuilderA.lineToRelative(2.18f, -2.18f);
        pathBuilderA.curveToRelative(0.2f, -0.2f, 0.2f, -0.52f, 0.0f, -0.71f);
        pathBuilderA.lineToRelative(-1.83f, -1.83f);
        pathBuilderA.lineToRelative(1.83f, -1.83f);
        pathBuilderA.curveToRelative(0.09f, -0.09f, 0.15f, -0.22f, 0.15f, -0.36f);
        pathBuilderA.reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.36f);
        pathBuilderA.lineToRelative(-2.18f, -2.18f);
        pathBuilderA.curveToRelative(-0.14f, -0.14f, -0.36f, -0.19f, -0.55f, -0.11f);
        pathBuilderA.curveToRelative(-0.19f, 0.08f, -0.31f, 0.26f, -0.31f, 0.46f);
        pathBuilderA.verticalLineToRelative(3.15f);
        pathBuilderA.lineToRelative(-1.95f, -1.95f);
        pathBuilderA.curveToRelative(-0.2f, -0.2f, -0.52f, -0.2f, -0.71f, 0.0f);
        pathBuilderA.curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f);
        android.support.v4.media.a.t(pathBuilderA, 2.45f, 2.46f, 18.01f, 2.86f);
        pathBuilderA.lineToRelative(0.96f, 0.96f);
        s.r(pathBuilderA, -0.96f, 0.96f, 18.01f, 2.86f);
        pathBuilderA.moveTo(18.01f, 7.23f);
        pathBuilderA.lineToRelative(0.96f, 0.96f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, -0.96f, 0.96f, 18.01f, 7.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
