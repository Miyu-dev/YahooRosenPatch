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

/* JADX INFO: compiled from: CastConnected.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_castConnected", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CastConnected", "Landroidx/compose/material/icons/Icons$Filled;", "getCastConnected", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CastConnectedKt {
    private static ImageVector _castConnected;

    public static final ImageVector getCastConnected(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _castConnected;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CastConnected", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(1.0f, 18.0f, 3.0f, 3.0f);
        pathBuilderE.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        androidx.compose.animation.a.n(pathBuilderE, 1.0f, 14.0f, 2.0f);
        pathBuilderE.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilderE.horizontalLineToRelative(2.0f);
        pathBuilderE.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        androidx.compose.animation.a.t(pathBuilderE, 19.0f, 7.0f, 5.0f, 7.0f);
        pathBuilderE.verticalLineToRelative(1.63f);
        pathBuilderE.curveToRelative(3.96f, 1.28f, 7.09f, 4.41f, 8.37f, 8.37f);
        android.support.v4.media.a.C(pathBuilderE, 19.0f, 17.0f, 19.0f, 7.0f);
        pathBuilderE.moveTo(1.0f, 10.0f);
        pathBuilderE.verticalLineToRelative(2.0f);
        pathBuilderE.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        pathBuilderE.horizontalLineToRelative(2.0f);
        pathBuilderE.curveToRelative(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        androidx.compose.animation.a.t(pathBuilderE, 21.0f, 3.0f, 3.0f, 3.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.x(pathBuilderE, 3.0f, 2.0f, 3.0f, 5.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderE, 18.0f, 14.0f, -7.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(7.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.lineTo(23.0f, 5.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castConnected = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
