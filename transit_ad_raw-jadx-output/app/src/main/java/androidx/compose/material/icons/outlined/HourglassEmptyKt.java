package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: HourglassEmpty.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hourglassEmpty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HourglassEmpty", "Landroidx/compose/material/icons/Icons$Outlined;", "getHourglassEmpty", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HourglassEmptyKt {
    private static ImageVector _hourglassEmpty;

    public static final ImageVector getHourglassEmpty(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _hourglassEmpty;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HourglassEmpty", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(6.0f, 2.0f, 6.0f, 0.01f);
        pathBuilderE.lineTo(6.0f, 8.01f);
        pathBuilderE.lineTo(10.0f, 12.0f);
        pathBuilderE.lineToRelative(-4.0f, 4.0f);
        pathBuilderE.lineToRelative(0.01f, 0.01f);
        pathBuilderE.lineTo(6.0f, 16.01f);
        androidx.compose.animation.a.o(pathBuilderE, 6.0f, 22.0f, 12.0f, -5.99f);
        pathBuilderE.horizontalLineToRelative(-0.01f);
        pathBuilderE.lineTo(18.0f, 16.0f);
        pathBuilderE.lineToRelative(-4.0f, -4.0f);
        pathBuilderE.lineToRelative(4.0f, -3.99f);
        pathBuilderE.lineToRelative(-0.01f, -0.01f);
        pathBuilderE.lineTo(18.0f, 8.0f);
        android.support.v4.media.a.C(pathBuilderE, 18.0f, 2.0f, 6.0f, 2.0f);
        pathBuilderE.moveTo(16.0f, 16.5f);
        pathBuilderE.lineTo(16.0f, 20.0f);
        pathBuilderE.lineTo(8.0f, 20.0f);
        pathBuilderE.verticalLineToRelative(-3.5f);
        android.support.v4.media.a.n(pathBuilderE, 4.0f, -4.0f, 4.0f, 4.0f);
        pathBuilderE.moveTo(12.0f, 11.5f);
        pathBuilderE.lineToRelative(-4.0f, -4.0f);
        androidx.compose.animation.a.o(pathBuilderE, 8.0f, 4.0f, 8.0f, 3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderE, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassEmpty = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
