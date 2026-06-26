package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hotelClass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HotelClass", "Landroidx/compose/material/icons/Icons$Rounded;", "getHotelClass", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HotelClass", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(8.58f, 10.0f, 2.56f);
        pathBuilderB.curveToRelative(-0.49f, 0.0f, -0.69f, 0.62f, -0.29f, 0.91f);
        pathBuilderB.lineToRelative(4.91f, 3.51f);
        pathBuilderB.lineToRelative(-1.89f, 6.1f);
        pathBuilderB.curveToRelative(-0.14f, 0.46f, 0.39f, 0.84f, 0.78f, 0.55f);
        pathBuilderB.lineTo(11.0f, 17.31f);
        pathBuilderB.lineToRelative(4.93f, 3.75f);
        pathBuilderB.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        pathBuilderB.lineToRelative(-1.89f, -6.1f);
        pathBuilderB.lineToRelative(4.91f, -3.51f);
        pathBuilderB.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        pathBuilderB.horizontalLineToRelative(-6.02f);
        pathBuilderB.lineToRelative(-1.95f, -6.42f);
        pathBuilderB.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        a.z(pathBuilderB, 8.58f, 10.0f, 20.9f, 20.51f);
        pathBuilderB.lineToRelative(-1.4f, -4.52f);
        pathBuilderB.lineToRelative(2.91f, -2.08f);
        pathBuilderB.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        pathBuilderB.horizontalLineToRelative(-1.88f);
        pathBuilderB.lineToRelative(-3.08f, 2.2f);
        pathBuilderB.lineToRelative(1.46f, 4.72f);
        pathBuilderB.lineToRelative(1.5f, 1.14f);
        pathBuilderB.curveTo(20.51f, 21.35f, 21.04f, 20.97f, 20.9f, 20.51f);
        androidx.browser.browseractions.a.y(pathBuilderB, 17.0f, 8.0f, -1.34f, -4.42f);
        pathBuilderB.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        pathBuilderB.lineToRelative(-0.57f, 1.87f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.j(pathBuilderB, 14.91f, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
