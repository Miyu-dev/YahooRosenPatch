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

/* JADX INFO: compiled from: History.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_history", "Landroidx/compose/ui/graphics/vector/ImageVector;", "History", "Landroidx/compose/material/icons/Icons$Rounded;", "getHistory", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HistoryKt {
    private static ImageVector _history;

    public static final ImageVector getHistory(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _history;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.History", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.26f, 3.0f);
        pathBuilderD.curveTo(8.17f, 2.86f, 4.0f, 6.95f, 4.0f, 12.0f);
        pathBuilderD.lineTo(2.21f, 12.0f);
        pathBuilderD.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilderD.lineToRelative(2.79f, 2.8f);
        pathBuilderD.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderD.lineToRelative(2.79f, -2.8f);
        pathBuilderD.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilderD.lineTo(6.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -3.9f, 3.18f, -7.05f, 7.1f, -7.0f);
        pathBuilderD.curveToRelative(3.72f, 0.05f, 6.85f, 3.18f, 6.9f, 6.9f);
        pathBuilderD.curveToRelative(0.05f, 3.91f, -3.1f, 7.1f, -7.0f, 7.1f);
        pathBuilderD.curveToRelative(-1.61f, 0.0f, -3.1f, -0.55f, -4.28f, -1.48f);
        pathBuilderD.curveToRelative(-0.4f, -0.31f, -0.96f, -0.28f, -1.32f, 0.08f);
        pathBuilderD.curveToRelative(-0.42f, 0.42f, -0.39f, 1.13f, 0.08f, 1.49f);
        pathBuilderD.curveTo(9.0f, 20.29f, 10.91f, 21.0f, 13.0f, 21.0f);
        pathBuilderD.curveToRelative(5.05f, 0.0f, 9.14f, -4.17f, 9.0f, -9.26f);
        pathBuilderD.curveToRelative(-0.13f, -4.69f, -4.05f, -8.61f, -8.74f, -8.74f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.75f, 8.0f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilderD.verticalLineToRelative(3.68f);
        pathBuilderD.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        pathBuilderD.lineToRelative(3.12f, 1.85f);
        pathBuilderD.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        pathBuilderD.curveToRelative(0.21f, -0.36f, 0.09f, -0.82f, -0.26f, -1.03f);
        pathBuilderD.lineToRelative(-2.88f, -1.71f);
        pathBuilderD.verticalLineToRelative(-3.4f);
        pathBuilderD.curveToRelative(0.0f, -0.4f, -0.34f, -0.74f, -0.75f, -0.74f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _history = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
