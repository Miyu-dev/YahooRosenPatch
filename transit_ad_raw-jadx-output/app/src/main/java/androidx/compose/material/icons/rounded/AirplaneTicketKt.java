package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: AirplaneTicket.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airplaneTicket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirplaneTicket", "Landroidx/compose/material/icons/Icons$Rounded;", "getAirplaneTicket", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirplaneTicketKt {
    private static ImageVector _airplaneTicket;

    public static final ImageVector getAirplaneTicket(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _airplaneTicket;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirplaneTicket", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.19f, 4.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveTo(22.0f, 4.9f, 21.19f, 4.0f, 20.19f, 4.0f);
        a.y(pathBuilderB, 17.73f, 13.3f, -8.49f, 2.26f);
        pathBuilderB.curveToRelative(-0.22f, 0.06f, -0.45f, -0.04f, -0.56f, -0.23f);
        pathBuilderB.lineToRelative(-1.12f, -1.95f);
        pathBuilderB.curveToRelative(-0.18f, -0.3f, -0.01f, -0.69f, 0.32f, -0.78f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.16f, -0.04f, 0.34f, -0.01f, 0.47f, 0.1f);
        pathBuilderB.lineToRelative(1.05f, 0.82f);
        pathBuilderB.lineToRelative(2.39f, -0.64f);
        pathBuilderB.lineTo(9.9f, 9.6f);
        pathBuilderB.curveToRelative(-0.26f, -0.44f, -0.02f, -1.01f, 0.47f, -1.15f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.26f, -0.07f, 0.54f, 0.0f, 0.74f, 0.18f);
        pathBuilderB.lineToRelative(3.69f, 3.44f);
        pathBuilderB.lineToRelative(2.44f, -0.65f);
        pathBuilderB.curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f);
        pathBuilderB.curveTo(18.55f, 12.62f, 18.25f, 13.15f, 17.73f, 13.3f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplaneTicket = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
