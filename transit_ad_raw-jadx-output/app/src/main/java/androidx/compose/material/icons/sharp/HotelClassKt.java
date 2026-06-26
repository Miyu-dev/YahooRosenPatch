package androidx.compose.material.icons.sharp;

import a6.h;
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

/* JADX INFO: compiled from: HotelClass.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hotelClass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HotelClass", "Landroidx/compose/material/icons/Icons$Sharp;", "getHotelClass", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HotelClass", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderS = h.s(8.58f, 10.0f, 1.0f, 6.17f, 4.41f);
        pathBuilderS.lineTo(4.83f, 22.0f);
        pathBuilderS.lineTo(11.0f, 17.31f);
        pathBuilderS.lineTo(17.18f, 22.0f);
        pathBuilderS.lineToRelative(-2.35f, -7.59f);
        pathBuilderS.lineTo(21.0f, 10.0f);
        pathBuilderS.horizontalLineToRelative(-7.58f);
        a.C(pathBuilderS, 11.0f, 2.0f, 8.58f, 10.0f);
        pathBuilderS.moveTo(21.36f, 22.0f);
        pathBuilderS.lineToRelative(-1.86f, -6.01f);
        pathBuilderS.lineTo(23.68f, 13.0f);
        pathBuilderS.horizontalLineToRelative(-3.44f);
        pathBuilderS.lineToRelative(-3.08f, 2.2f);
        s.r(pathBuilderS, 1.46f, 4.72f, 21.36f, 22.0f);
        pathBuilderS.moveTo(17.0f, 8.0f);
        pathBuilderS.lineToRelative(-1.82f, -6.0f);
        pathBuilderS.lineToRelative(-1.04f, 3.45f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.j(pathBuilderS, 14.91f, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
