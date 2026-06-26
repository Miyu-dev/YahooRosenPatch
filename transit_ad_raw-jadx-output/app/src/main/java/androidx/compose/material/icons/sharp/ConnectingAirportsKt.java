package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: ConnectingAirports.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_connectingAirports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectingAirports", "Landroidx/compose/material/icons/Icons$Sharp;", "getConnectingAirports", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ConnectingAirportsKt {
    private static ImageVector _connectingAirports;

    public static final ImageVector getConnectingAirports(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _connectingAirports;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ConnectingAirports", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = b.p(15.4f, 17.0f, 1.3f, 4.4f, -1.1f);
        pathBuilderP.lineTo(13.0f, 17.0f);
        pathBuilderP.horizontalLineToRelative(-3.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        a.B(pathBuilderP, 3.0f, 2.6f, -4.4f, 1.1f);
        pathBuilderP.lineTo(15.4f, 15.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderP, 2.85f, 19.0f, 14.0f, 1.0f);
        pathBuilderP.lineToRelative(-0.6f, 2.0f);
        pathBuilderP.lineToRelative(0.6f, 2.0f);
        androidx.compose.animation.b.A(pathBuilderP, -1.0f, -0.75f, -1.0f, 15.4f);
        pathBuilderP.moveTo(5.75f, 7.0f);
        pathBuilderP.lineTo(5.0f, 6.0f);
        pathBuilderP.horizontalLineTo(4.0f);
        pathBuilderP.lineToRelative(0.6f, 2.0f);
        pathBuilderP.lineTo(4.0f, 10.0f);
        androidx.compose.animation.a.C(pathBuilderP, 1.0f, 0.75f, -1.0f, 8.6f);
        pathBuilderP.lineToRelative(-1.3f, 4.4f);
        androidx.appcompat.view.menu.a.y(pathBuilderP, 1.1f, 11.0f, 9.0f, 3.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderP.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        androidx.appcompat.app.m.D(pathBuilderP, -3.0f, 8.4f, 2.6f, 7.3f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.j(pathBuilderP, 8.6f, 7.0f, 5.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectingAirports = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
