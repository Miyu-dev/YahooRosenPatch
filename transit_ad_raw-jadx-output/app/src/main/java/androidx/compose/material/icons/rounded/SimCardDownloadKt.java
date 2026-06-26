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

/* JADX INFO: compiled from: SimCardDownload.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_simCardDownload", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SimCardDownload", "Landroidx/compose/material/icons/Icons$Rounded;", "getSimCardDownload", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SimCardDownloadKt {
    private static ImageVector _simCardDownload;

    public static final ImageVector getSimCardDownload(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _simCardDownload;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SimCardDownload", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(18.0f, 2.0f, -7.17f);
        pathBuilderB.curveTo(10.3f, 2.0f, 9.79f, 2.21f, 9.41f, 2.59f);
        pathBuilderB.lineTo(4.59f, 7.41f);
        pathBuilderB.curveTo(4.21f, 7.79f, 4.0f, 8.3f, 4.0f, 8.83f);
        pathBuilderB.verticalLineTo(20.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.0f);
        pathBuilderB.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        a.y(pathBuilderB, 11.65f, 16.65f, -2.79f, -2.79f);
        pathBuilderB.curveTo(8.54f, 13.54f, 8.76f, 13.0f, 9.21f, 13.0f);
        pathBuilderB.horizontalLineTo(11.0f);
        pathBuilderB.verticalLineToRelative(-2.99f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.44f, -0.99f, 0.99f, -1.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveTo(12.55f, 9.0f, 13.0f, 9.45f, 13.0f, 10.01f);
        pathBuilderB.verticalLineTo(13.0f);
        pathBuilderB.horizontalLineToRelative(1.79f);
        pathBuilderB.curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f);
        pathBuilderB.lineToRelative(-2.79f, 2.79f);
        pathBuilderB.curveTo(12.16f, 16.84f, 11.84f, 16.84f, 11.65f, 16.65f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCardDownload = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
