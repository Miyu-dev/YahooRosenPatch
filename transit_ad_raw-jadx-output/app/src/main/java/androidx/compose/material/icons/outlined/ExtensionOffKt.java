package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: ExtensionOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_extensionOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ExtensionOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getExtensionOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ExtensionOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(1.39f, 4.22f, 1.62f, 1.62f);
        pathBuilderA.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.01f, 0.16f);
        pathBuilderA.verticalLineToRelative(3.8f);
        pathBuilderA.curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f);
        pathBuilderA.curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f);
        pathBuilderA.verticalLineTo(19.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(3.8f);
        pathBuilderA.curveToRelative(0.0f, -2.71f, 2.16f, -3.0f, 2.7f, -3.0f);
        pathBuilderA.curveToRelative(0.54f, 0.0f, 2.7f, 0.29f, 2.7f, 3.0f);
        pathBuilderA.horizontalLineTo(18.0f);
        pathBuilderA.curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f);
        pathBuilderA.lineToRelative(1.61f, 1.61f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        a.C(pathBuilderA, 2.81f, 2.81f, 1.39f, 4.22f);
        pathBuilderA.moveTo(11.5f, 16.0f);
        pathBuilderA.curveToRelative(-1.5f, 0.0f, -3.57f, 0.83f, -4.37f, 3.0f);
        pathBuilderA.horizontalLineTo(5.0f);
        pathBuilderA.verticalLineToRelative(-2.13f);
        pathBuilderA.curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f);
        pathBuilderA.curveToRelative(0.0f, -0.69f, -0.18f, -1.5f, -0.58f, -2.25f);
        pathBuilderA.lineToRelative(6.33f, 6.33f);
        pathBuilderA.curveTo(13.0f, 16.18f, 12.19f, 16.0f, 11.5f, 16.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 8.83f, 6.0f, -2.0f, -2.0f);
        pathBuilderA.horizontalLineTo(9.0f);
        pathBuilderA.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderA.reflectiveCurveTo(14.0f, 2.62f, 14.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderA.reflectiveCurveTo(21.38f, 15.0f, 20.0f, 15.0f);
        androidx.browser.browseractions.a.z(pathBuilderA, 2.17f, -2.0f, -2.0f, 13.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderA.reflectiveCurveTo(20.28f, 12.0f, 20.0f, 12.0f);
        androidx.appcompat.view.menu.a.A(pathBuilderA, -2.0f, 6.0f, -6.0f, 4.0f);
        pathBuilderA.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderA.reflectiveCurveTo(11.0f, 3.72f, 11.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.m(pathBuilderA, 2.0f, 8.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
