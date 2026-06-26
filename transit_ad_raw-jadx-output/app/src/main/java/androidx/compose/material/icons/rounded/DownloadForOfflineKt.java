package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: DownloadForOffline.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_downloadForOffline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DownloadForOffline", "Landroidx/compose/material/icons/Icons$Rounded;", "getDownloadForOffline", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DownloadForOfflineKt {
    private static ImageVector _downloadForOffline;

    public static final ImageVector getDownloadForOffline(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _downloadForOffline;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DownloadForOffline", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f);
        h.A(pathBuilderD, 11.0f, 10.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.horizontalLineToRelative(1.79f);
        pathBuilderD.curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f);
        pathBuilderD.lineToRelative(-2.79f, 2.79f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        pathBuilderD.lineToRelative(-2.79f, -2.79f);
        pathBuilderD.curveTo(8.54f, 10.54f, 8.76f, 10.0f, 9.21f, 10.0f);
        h.r(pathBuilderD, 11.0f, 16.0f, 17.0f, 8.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveTo(17.0f, 16.55f, 16.55f, 17.0f, 16.0f, 17.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downloadForOffline = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
