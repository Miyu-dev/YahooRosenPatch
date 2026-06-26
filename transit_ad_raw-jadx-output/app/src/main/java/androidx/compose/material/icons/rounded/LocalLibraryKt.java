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

/* JADX INFO: compiled from: LocalLibrary.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localLibrary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalLibrary", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalLibrary", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalLibrary", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 11.55f);
        pathBuilderD.curveToRelative(-1.82f, -1.7f, -4.12f, -2.89f, -6.68f, -3.35f);
        pathBuilderD.curveTo(4.11f, 7.99f, 3.0f, 8.95f, 3.0f, 10.18f);
        pathBuilderD.verticalLineToRelative(6.24f);
        pathBuilderD.curveToRelative(0.0f, 1.68f, 0.72f, 2.56f, 1.71f, 2.69f);
        pathBuilderD.curveToRelative(2.5f, 0.32f, 4.77f, 1.35f, 6.63f, 2.87f);
        pathBuilderD.curveToRelative(0.35f, 0.29f, 0.92f, 0.32f, 1.27f, 0.04f);
        pathBuilderD.curveToRelative(1.87f, -1.53f, 4.16f, -2.58f, 6.68f, -2.9f);
        pathBuilderD.curveToRelative(0.94f, -0.13f, 1.71f, -1.06f, 1.71f, -2.02f);
        pathBuilderD.verticalLineToRelative(-6.92f);
        pathBuilderD.curveToRelative(0.0f, -1.23f, -1.11f, -2.19f, -2.32f, -1.98f);
        pathBuilderD.curveToRelative(-2.56f, 0.46f, -4.86f, 1.65f, -6.68f, 3.35f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 8.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, 1.34f, 3.0f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
