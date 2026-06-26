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

/* JADX INFO: compiled from: Superscript.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_superscript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Superscript", "Landroidx/compose/material/icons/Icons$Rounded;", "getSuperscript", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SuperscriptKt {
    private static ImageVector _superscript;

    public static final ImageVector getSuperscript(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _superscript;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Superscript", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.51f, 12.73f, 7.3f, 7.72f);
        pathBuilderA.curveTo(6.82f, 6.97f, 7.35f, 6.0f, 8.23f, 6.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.39f, 0.0f, 0.74f, 0.2f, 0.95f, 0.53f);
        pathBuilderA.lineToRelative(2.76f, 4.46f);
        pathBuilderA.horizontalLineToRelative(0.12f);
        pathBuilderA.lineToRelative(2.74f, -4.45f);
        pathBuilderA.curveTo(15.0f, 6.2f, 15.36f, 6.0f, 15.75f, 6.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.88f, 0.0f, 1.42f, 0.98f, 0.94f, 1.72f);
        pathBuilderA.lineToRelative(-3.23f, 5.0f);
        pathBuilderA.lineToRelative(3.55f, 5.55f);
        pathBuilderA.curveTo(17.5f, 19.02f, 16.96f, 20.0f, 16.08f, 20.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.38f, 0.0f, -0.74f, -0.2f, -0.95f, -0.52f);
        pathBuilderA.lineToRelative(-3.07f, -4.89f);
        pathBuilderA.horizontalLineToRelative(-0.12f);
        pathBuilderA.lineToRelative(-3.07f, 4.89f);
        pathBuilderA.curveTo(8.66f, 19.8f, 8.31f, 20.0f, 7.92f, 20.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.88f, 0.0f, -1.42f, -0.97f, -0.94f, -1.72f);
        a.z(pathBuilderA, 10.51f, 12.73f, 23.0f, 8.5f);
        pathBuilderA.lineTo(23.0f, 8.5f);
        pathBuilderA.curveTo(23.0f, 8.22f, 22.78f, 8.0f, 22.5f, 8.0f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        c.a.i(pathBuilderA, 20.0f, 7.0f, 2.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineTo(5.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-2.5f);
        pathBuilderA.curveTo(19.22f, 4.0f, 19.0f, 4.22f, 19.0f, 4.5f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(19.0f, 4.78f, 19.22f, 5.0f, 19.5f, 5.0f);
        androidx.compose.animation.a.s(pathBuilderA, 22.0f, 1.0f, -2.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(2.5f);
        pathBuilderA.curveTo(22.78f, 9.0f, 23.0f, 8.78f, 23.0f, 8.5f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _superscript = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
