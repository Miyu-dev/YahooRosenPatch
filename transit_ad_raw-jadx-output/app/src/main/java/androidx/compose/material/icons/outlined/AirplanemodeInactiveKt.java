package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: AirplanemodeInactive.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airplanemodeInactive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirplanemodeInactive", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirplanemodeInactive", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirplanemodeInactiveKt {
    private static ImageVector _airplanemodeInactive;

    public static final ImageVector getAirplanemodeInactive(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _airplanemodeInactive;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirplanemodeInactive", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(10.5f, 7.67f, 3.5f);
        pathBuilderN.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        pathBuilderN.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        a.A(pathBuilderN, 9.0f, 8.5f, 5.0f, 2.0f);
        s.r(pathBuilderN, -4.49f, -1.32f, 10.5f, 7.67f);
        pathBuilderN.moveTo(19.78f, 22.61f);
        pathBuilderN.lineToRelative(1.41f, -1.41f);
        pathBuilderN.lineTo(13.5f, 13.5f);
        pathBuilderN.lineTo(9.56f, 9.56f);
        pathBuilderN.lineTo(2.81f, 2.81f);
        pathBuilderN.lineTo(1.39f, 4.22f);
        pathBuilderN.lineToRelative(6.38f, 6.38f);
        pathBuilderN.lineTo(2.0f, 14.0f);
        androidx.browser.browseractions.a.z(pathBuilderN, 2.0f, 8.5f, -2.5f, 19.0f);
        pathBuilderN.lineTo(8.0f, 20.5f);
        pathBuilderN.lineTo(8.0f, 22.0f);
        pathBuilderN.lineToRelative(4.0f, -1.0f);
        pathBuilderN.lineToRelative(4.0f, 1.0f);
        pathBuilderN.lineToRelative(0.0f, -1.5f);
        pathBuilderN.lineTo(13.5f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.i(pathBuilderN, -2.67f, 19.78f, 22.61f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplanemodeInactive = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
