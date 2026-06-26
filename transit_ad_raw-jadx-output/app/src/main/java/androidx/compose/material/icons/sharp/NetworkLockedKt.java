package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: NetworkLocked.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_networkLocked", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NetworkLocked", "Landroidx/compose/material/icons/Icons$Sharp;", "getNetworkLocked", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NetworkLockedKt {
    private static ImageVector _networkLocked;

    public static final ImageVector getNetworkLocked(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _networkLocked;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NetworkLocked", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(22.0f, 16.0f, -0.36f);
        pathBuilderE.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        pathBuilderE.curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f);
        a.l(pathBuilderE, 0.5f, -1.0f, 6.0f, 7.0f);
        androidx.appcompat.app.m.y(pathBuilderE, -6.0f, -1.0f, 21.0f, 16.0f);
        pathBuilderE.horizontalLineToRelative(-3.0f);
        pathBuilderE.verticalLineToRelative(-0.5f);
        pathBuilderE.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderE.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        android.support.v4.media.a.v(pathBuilderE, 0.5f, 19.5f, 11.0f);
        pathBuilderE.curveToRelative(0.15f, 0.0f, 0.3f, 0.01f, 0.46f, 0.02f);
        pathBuilderE.curveToRelative(0.01f, 0.0f, 0.03f, 0.01f, 0.04f, 0.01f);
        pathBuilderE.lineTo(20.0f, 1.0f);
        androidx.compose.animation.a.o(pathBuilderE, 1.0f, 20.0f, 13.0f, -6.0f);
        pathBuilderE.horizontalLineToRelative(1.26f);
        pathBuilderE.curveToRelative(0.22f, -0.63f, 0.58f, -1.2f, 1.06f, -1.68f);
        pathBuilderE.curveToRelative(0.85f, -0.85f, 1.98f, -1.32f, 3.18f, -1.32f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkLocked = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
