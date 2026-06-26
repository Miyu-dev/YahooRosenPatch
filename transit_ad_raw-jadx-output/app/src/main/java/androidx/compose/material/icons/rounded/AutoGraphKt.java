package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: AutoGraph.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoGraph", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoGraph", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutoGraph", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoGraphKt {
    private static ImageVector _autoGraph;

    public static final ImageVector getAutoGraph(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _autoGraph;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoGraph", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.06f, 9.94f, 13.0f, 9.45f);
        pathBuilderA.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA.lineToRelative(1.06f, -0.49f);
        pathBuilderA.lineTo(14.55f, 7.0f);
        pathBuilderA.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilderA.lineToRelative(0.49f, 1.06f);
        pathBuilderA.lineTo(17.0f, 8.55f);
        pathBuilderA.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA.lineToRelative(-1.06f, 0.49f);
        pathBuilderA.lineTo(15.45f, 11.0f);
        pathBuilderA.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        a.z(pathBuilderA, 14.06f, 9.94f, 4.45f, 13.0f);
        pathBuilderA.lineToRelative(0.49f, -1.06f);
        pathBuilderA.lineTo(6.0f, 11.45f);
        pathBuilderA.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA.lineToRelative(-1.06f, -0.49f);
        pathBuilderA.lineTo(4.45f, 9.0f);
        pathBuilderA.curveTo(4.28f, 8.61f, 3.72f, 8.61f, 3.55f, 9.0f);
        pathBuilderA.lineToRelative(-0.49f, 1.06f);
        pathBuilderA.lineTo(2.0f, 10.55f);
        pathBuilderA.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA.lineToRelative(1.06f, 0.49f);
        pathBuilderA.lineTo(3.55f, 13.0f);
        pathBuilderA.curveTo(3.72f, 13.39f, 4.28f, 13.39f, 4.45f, 13.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 8.96f, 7.99f, 0.63f, -1.4f);
        pathBuilderA.lineToRelative(1.4f, -0.63f);
        pathBuilderA.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA.lineToRelative(-1.4f, -0.63f);
        pathBuilderA.lineToRelative(-0.63f, -1.4f);
        pathBuilderA.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilderA.lineToRelative(-0.63f, 1.4f);
        pathBuilderA.lineToRelative(-1.4f, 0.63f);
        pathBuilderA.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA.lineToRelative(1.4f, 0.63f);
        pathBuilderA.lineToRelative(0.63f, 1.4f);
        pathBuilderA.curveTo(8.22f, 8.38f, 8.78f, 8.38f, 8.96f, 7.99f);
        pathBuilderA.close();
        pathBuilderA.moveTo(22.34f, 8.27f);
        pathBuilderA.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        pathBuilderA.lineToRelative(-6.39f, 7.18f);
        pathBuilderA.lineToRelative(-3.29f, -3.29f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineToRelative(-6.04f, 6.05f);
        pathBuilderA.curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f);
        pathBuilderA.curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0.0f);
        pathBuilderA.lineToRelative(5.25f, -5.26f);
        pathBuilderA.lineToRelative(3.25f, 3.25f);
        pathBuilderA.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        pathBuilderA.lineToRelative(7.17f, -8.07f);
        pathBuilderA.curveTo(22.73f, 9.24f, 22.71f, 8.64f, 22.34f, 8.27f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoGraph = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
