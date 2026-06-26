package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: SettingsRemote.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsRemote", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsRemote", "Landroidx/compose/material/icons/Icons$Sharp;", "getSettingsRemote", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsRemoteKt {
    private static ImageVector _settingsRemote;

    public static final ImageVector getSettingsRemote(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _settingsRemote;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsRemote", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(16.0f, 9.0f, 8.0f, 9.0f, 14.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 8.0f, 16.0f, 9.0f);
        pathBuilderB.moveTo(12.0f, 15.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderB.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        androidx.browser.browseractions.a.y(pathBuilderB, 7.05f, 6.05f, 1.41f, 1.41f);
        pathBuilderB.curveTo(9.37f, 6.56f, 10.62f, 6.0f, 12.0f, 6.0f);
        pathBuilderB.reflectiveCurveToRelative(2.63f, 0.56f, 3.54f, 1.46f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.curveTo(15.68f, 4.78f, 13.93f, 4.0f, 12.0f, 4.0f);
        pathBuilderB.reflectiveCurveToRelative(-3.68f, 0.78f, -4.95f, 2.05f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 0.0f);
        pathBuilderB.curveTo(8.96f, 0.0f, 6.21f, 1.23f, 4.22f, 3.22f);
        pathBuilderB.lineToRelative(1.41f, 1.41f);
        pathBuilderB.curveTo(7.26f, 3.01f, 9.51f, 2.0f, 12.0f, 2.0f);
        pathBuilderB.reflectiveCurveToRelative(4.74f, 1.01f, 6.36f, 2.64f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.curveTo(17.79f, 1.23f, 15.04f, 0.0f, 12.0f, 0.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsRemote = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
