package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: CloudSync.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cloudSync", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CloudSync", "Landroidx/compose/material/icons/Icons$Rounded;", "getCloudSync", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CloudSyncKt {
    private static ImageVector _cloudSync;

    public static final ImageVector getCloudSync(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _cloudSync;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CloudSync", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(24.0f, 17.48f);
        pathBuilderD.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilderD.lineTo(15.0f, 20.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.6f, 1.26f, -2.9f, 2.84f, -2.98f);
        pathBuilderD.curveTo(15.4f, 12.83f, 16.6f, 12.0f, 18.0f, 12.0f);
        pathBuilderD.curveToRelative(1.76f, 0.0f, 3.2f, 1.3f, 3.45f, 2.99f);
        pathBuilderD.curveToRelative(0.02f, 0.0f, 0.03f, -0.01f, 0.05f, -0.01f);
        pathBuilderD.curveTo(22.88f, 14.98f, 24.0f, 16.1f, 24.0f, 17.48f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 15.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.44f);
        pathBuilderD.curveToRelative(-1.22f, -1.1f, -2.0f, -2.67f, -2.0f, -4.44f);
        pathBuilderD.curveToRelative(0.0f, -2.38f, 1.39f, -4.43f, 3.4f, -5.4f);
        pathBuilderD.curveTo(9.77f, 6.42f, 10.0f, 6.04f, 10.0f, 5.63f);
        pathBuilderD.curveToRelative(0.0f, -0.71f, -0.73f, -1.18f, -1.37f, -0.88f);
        pathBuilderD.curveTo(5.89f, 6.03f, 4.0f, 8.79f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.4f, 1.06f, 4.54f, 2.73f, 6.0f);
        pathBuilderD.horizontalLineTo(5.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        android.support.v4.media.a.y(pathBuilderD, 15.0f, 19.0f, 6.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(7.56f);
        pathBuilderD.curveToRelative(0.98f, 0.89f, 1.68f, 2.08f, 1.92f, 3.44f);
        pathBuilderD.lineToRelative(2.02f, 0.0f);
        pathBuilderD.curveToRelative(-0.25f, -1.99f, -1.23f, -3.74f, -2.66f, -5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderD, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudSync = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
