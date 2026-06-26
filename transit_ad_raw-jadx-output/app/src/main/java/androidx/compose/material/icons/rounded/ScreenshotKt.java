package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Screenshot.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenshot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Screenshot", "Landroidx/compose/material/icons/Icons$Rounded;", "getScreenshot", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenshotKt {
    private static ImageVector _screenshot;

    public static final ImageVector getScreenshot(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _screenshot;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Screenshot", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.0f, 1.01f, 7.0f, 1.0f);
        pathBuilderA.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(18.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(10.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineTo(3.0f);
        pathBuilderA.curveTo(19.0f, 1.9f, 18.1f, 1.01f, 17.0f, 1.01f);
        a.w(pathBuilderA, 17.0f, 18.0f, 7.0f, 6.0f);
        b.m(pathBuilderA, 10.0f, 18.0f, 9.5f, 8.5f);
        pathBuilderA.horizontalLineToRelative(1.75f);
        pathBuilderA.curveTo(11.66f, 8.5f, 12.0f, 8.16f, 12.0f, 7.75f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(12.0f, 7.34f, 11.66f, 7.0f, 11.25f, 7.0f);
        pathBuilderA.horizontalLineToRelative(-2.5f);
        pathBuilderA.curveTo(8.34f, 7.0f, 8.0f, 7.34f, 8.0f, 7.75f);
        pathBuilderA.verticalLineToRelative(2.5f);
        pathBuilderA.curveTo(8.0f, 10.66f, 8.34f, 11.0f, 8.75f, 11.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        androidx.appcompat.view.menu.a.B(pathBuilderA, 8.5f, 12.75f, 17.0f, 2.5f);
        pathBuilderA.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderA.verticalLineToRelative(-2.5f);
        pathBuilderA.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilderA.verticalLineToRelative(1.75f);
        pathBuilderA.horizontalLineToRelative(-1.75f);
        pathBuilderA.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(12.0f, 16.66f, 12.34f, 17.0f, 12.75f, 17.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenshot = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
