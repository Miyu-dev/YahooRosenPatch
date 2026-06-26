package androidx.compose.material.icons.outlined;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: AirlineSeatLegroomExtra.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatLegroomExtra", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatLegroomExtra", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirlineSeatLegroomExtra", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineSeatLegroomExtraKt {
    private static ImageVector _airlineSeatLegroomExtra;

    public static final ImageVector getAirlineSeatLegroomExtra(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _airlineSeatLegroomExtra;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirlineSeatLegroomExtra", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.0f, 12.0f, 4.0f, 3.0f);
        pathBuilderA.lineTo(2.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(9.0f);
        pathBuilderA.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        a.w(pathBuilderA, 6.0f, -2.0f, 7.0f, 15.0f);
        pathBuilderA.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(22.83f, 17.24f);
        pathBuilderA.curveToRelative(-0.38f, -0.72f, -1.29f, -0.97f, -2.03f, -0.63f);
        pathBuilderA.lineToRelative(-1.09f, 0.5f);
        pathBuilderA.lineToRelative(-3.41f, -6.98f);
        pathBuilderA.curveTo(15.96f, 9.45f, 15.27f, 9.0f, 14.51f, 9.0f);
        pathBuilderA.lineTo(11.0f, 9.0f);
        pathBuilderA.lineTo(11.0f, 3.0f);
        pathBuilderA.lineTo(5.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.horizontalLineToRelative(7.0f);
        pathBuilderA.lineToRelative(3.41f, 7.0f);
        pathBuilderA.lineToRelative(3.72f, -1.7f);
        pathBuilderA.curveToRelative(0.77f, -0.36f, 1.1f, -1.3f, 0.7f, -2.06f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatLegroomExtra = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
