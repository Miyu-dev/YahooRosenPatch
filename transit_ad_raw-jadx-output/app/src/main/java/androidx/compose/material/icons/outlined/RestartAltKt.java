package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: RestartAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_restartAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RestartAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getRestartAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RestartAltKt {
    private static ImageVector _restartAlt;

    public static final ImageVector getRestartAlt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _restartAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RestartAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
        pathBuilderD.lineTo(6.34f, 7.34f);
        pathBuilderD.curveTo(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        pathBuilderD.verticalLineToRelative(-2.02f);
        pathBuilderD.curveTo(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilderD.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
        pathBuilderD.lineToRelative(1.09f, -1.09f);
        pathBuilderD.lineTo(11.5f, 2.5f);
        pathBuilderD.lineTo(8.0f, 6.0f);
        pathBuilderD.lineToRelative(3.5f, 3.5f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineToRelative(-1.08f, -1.08f);
        pathBuilderD.curveTo(11.89f, 7.01f, 11.95f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        pathBuilderD.verticalLineToRelative(2.02f);
        pathBuilderD.curveTo(16.95f, 20.44f, 20.0f, 17.08f, 20.0f, 13.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restartAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
