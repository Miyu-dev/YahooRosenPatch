package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SettingsEthernet.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsEthernet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsEthernet", "Landroidx/compose/material/icons/Icons$Sharp;", "getSettingsEthernet", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsEthernetKt {
    private static ImageVector _settingsEthernet;

    public static final ImageVector getSettingsEthernet(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _settingsEthernet;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsEthernet", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.77f, 6.76f, 6.23f, 5.48f);
        pathBuilderA.lineTo(0.82f, 12.0f);
        pathBuilderA.lineToRelative(5.41f, 6.52f);
        pathBuilderA.lineToRelative(1.54f, -1.28f);
        a.A(pathBuilderA, 3.42f, 12.0f, 4.35f, -5.24f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 7.0f, 13.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderA, 7.0f, 11.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 17.0f, 11.0f, -2.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderA, 2.0f, -2.0f, 11.0f, 13.0f);
        b.A(pathBuilderA, 2.0f, -2.0f, -2.0f, 2.0f);
        pathBuilderA.moveTo(17.77f, 5.48f);
        pathBuilderA.lineToRelative(-1.54f, 1.28f);
        pathBuilderA.lineTo(20.58f, 12.0f);
        pathBuilderA.lineToRelative(-4.35f, 5.24f);
        pathBuilderA.lineToRelative(1.54f, 1.28f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.s(pathBuilderA, 23.18f, 12.0f, -5.41f, -6.52f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsEthernet = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
