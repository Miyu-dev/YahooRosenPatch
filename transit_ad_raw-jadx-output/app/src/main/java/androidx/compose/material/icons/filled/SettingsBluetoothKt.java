package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: SettingsBluetooth.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsBluetooth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsBluetooth", "Landroidx/compose/material/icons/Icons$Filled;", "getSettingsBluetooth", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsBluetoothKt {
    private static ImageVector _settingsBluetooth;

    public static final ImageVector getSettingsBluetooth(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _settingsBluetooth;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsBluetooth", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(11.0f, 24.0f, 2.0f, -2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, 2.0f, 7.0f, 24.0f, 2.0f);
        a.v(pathBuilderF, -2.0f, 7.0f, 22.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 15.0f, 24.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderF, -2.0f, 2.0f, 17.71f, 5.71f);
        androidx.compose.animation.a.o(pathBuilderF, 12.0f, 0.0f, -1.0f, 7.59f);
        pathBuilderF.lineTo(6.41f, 3.0f);
        pathBuilderF.lineTo(5.0f, 4.41f);
        pathBuilderF.lineTo(10.59f, 10.0f);
        pathBuilderF.lineTo(5.0f, 15.59f);
        pathBuilderF.lineTo(6.41f, 17.0f);
        pathBuilderF.lineTo(11.0f, 12.41f);
        pathBuilderF.lineTo(11.0f, 20.0f);
        pathBuilderF.horizontalLineToRelative(1.0f);
        pathBuilderF.lineToRelative(5.71f, -5.71f);
        android.support.v4.media.a.n(pathBuilderF, -4.3f, -4.29f, 4.3f, -4.29f);
        pathBuilderF.moveTo(13.0f, 3.83f);
        pathBuilderF.lineToRelative(1.88f, 1.88f);
        android.support.v4.media.a.C(pathBuilderF, 13.0f, 7.59f, 13.0f, 3.83f);
        pathBuilderF.moveTo(14.88f, 14.29f);
        pathBuilderF.lineTo(13.0f, 16.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.m(pathBuilderF, -3.76f, 1.88f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBluetooth = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
