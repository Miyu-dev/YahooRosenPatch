package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: SettingsVoice.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsVoice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsVoice", "Landroidx/compose/material/icons/Icons$Sharp;", "getSettingsVoice", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsVoiceKt {
    private static ImageVector _settingsVoice;

    public static final ImageVector getSettingsVoice(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _settingsVoice;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsVoice", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(7.0f, 24.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderO, 7.0f, 22.0f, 2.0f);
        pathBuilderO.moveTo(12.0f, 13.0f);
        pathBuilderO.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        pathBuilderO.lineTo(15.0f, 4.0f);
        pathBuilderO.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderO.reflectiveCurveTo(9.0f, 2.34f, 9.0f, 4.0f);
        pathBuilderO.verticalLineToRelative(6.0f);
        pathBuilderO.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        androidx.compose.animation.b.r(pathBuilderO, 11.0f, 24.0f, 2.0f, -2.0f);
        a.z(pathBuilderO, -2.0f, 2.0f, 15.0f, 24.0f);
        b.A(pathBuilderO, 2.0f, -2.0f, -2.0f, 2.0f);
        pathBuilderO.moveTo(19.0f, 10.0f);
        pathBuilderO.horizontalLineToRelative(-1.7f);
        pathBuilderO.curveToRelative(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
        pathBuilderO.reflectiveCurveTo(6.7f, 13.0f, 6.7f, 10.0f);
        pathBuilderO.lineTo(5.0f, 10.0f);
        pathBuilderO.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        androidx.compose.animation.a.o(pathBuilderO, 11.0f, 20.0f, 2.0f, -3.28f);
        pathBuilderO.curveToRelative(3.28f, -0.49f, 6.0f, -3.31f, 6.0f, -6.72f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsVoice = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
