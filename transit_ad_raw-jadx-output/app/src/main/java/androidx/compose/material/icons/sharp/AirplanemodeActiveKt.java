package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: AirplanemodeActive.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airplanemodeActive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirplanemodeActive", "Landroidx/compose/material/icons/Icons$Sharp;", "getAirplanemodeActive", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirplanemodeActiveKt {
    private static ImageVector _airplanemodeActive;

    public static final ImageVector getAirplanemodeActive(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _airplanemodeActive;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirplanemodeActive", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(22.0f, 16.0f, -2.0f, -8.5f, -5.0f);
        pathBuilderB.verticalLineTo(3.5f);
        pathBuilderB.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        pathBuilderB.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.lineTo(2.0f, 14.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.lineToRelative(8.5f, -2.5f);
        pathBuilderB.verticalLineTo(19.0f);
        pathBuilderB.lineTo(8.0f, 20.5f);
        pathBuilderB.lineTo(8.0f, 22.0f);
        pathBuilderB.lineToRelative(4.0f, -1.0f);
        pathBuilderB.lineToRelative(4.0f, 1.0f);
        pathBuilderB.lineToRelative(0.0f, -1.5f);
        pathBuilderB.lineTo(13.5f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderB, -5.5f, 22.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplanemodeActive = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
