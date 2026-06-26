package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: CallEnd.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_callEnd", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CallEnd", "Landroidx/compose/material/icons/Icons$Filled;", "getCallEnd", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CallEndKt {
    private static ImageVector _callEnd;

    public static final ImageVector getCallEnd(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _callEnd;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CallEnd", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 9.0f);
        pathBuilderD.curveToRelative(-1.6f, 0.0f, -3.15f, 0.25f, -4.6f, 0.72f);
        pathBuilderD.verticalLineToRelative(3.1f);
        pathBuilderD.curveToRelative(0.0f, 0.39f, -0.23f, 0.74f, -0.56f, 0.9f);
        pathBuilderD.curveToRelative(-0.98f, 0.49f, -1.87f, 1.12f, -2.66f, 1.85f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.43f, 0.28f, -0.7f, 0.28f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.53f, -0.11f, -0.71f, -0.29f);
        pathBuilderD.lineTo(0.29f, 13.08f);
        pathBuilderD.curveToRelative(-0.18f, -0.17f, -0.29f, -0.42f, -0.29f, -0.7f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f);
        pathBuilderD.curveTo(3.34f, 8.78f, 7.46f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(8.66f, 1.78f, 11.71f, 4.67f);
        pathBuilderD.curveToRelative(0.18f, 0.18f, 0.29f, 0.43f, 0.29f, 0.71f);
        pathBuilderD.curveToRelative(0.0f, 0.28f, -0.11f, 0.53f, -0.29f, 0.71f);
        pathBuilderD.lineToRelative(-2.48f, 2.48f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.43f, 0.29f, -0.71f, 0.29f);
        pathBuilderD.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.7f, -0.28f);
        pathBuilderD.curveToRelative(-0.79f, -0.74f, -1.69f, -1.36f, -2.67f, -1.85f);
        pathBuilderD.curveToRelative(-0.33f, -0.16f, -0.56f, -0.5f, -0.56f, -0.9f);
        pathBuilderD.verticalLineToRelative(-3.1f);
        pathBuilderD.curveTo(15.15f, 9.25f, 13.6f, 9.0f, 12.0f, 9.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callEnd = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
