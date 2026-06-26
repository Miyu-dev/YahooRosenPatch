package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: PhonelinkSetup.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phonelinkSetup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkSetup", "Landroidx/compose/material/icons/Icons$Outlined;", "getPhonelinkSetup", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhonelinkSetupKt {
    private static ImageVector _phonelinkSetup;

    public static final ImageVector getPhonelinkSetup(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _phonelinkSetup;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhonelinkSetup", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(7.0f, 3.0f, 3.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderE, 9.0f, 4.0f, 10.0f, 16.0f);
        pathBuilderE.lineTo(9.0f, 20.0f);
        v.y(pathBuilderE, -2.0f, 7.0f, 18.0f, 3.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(10.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.lineTo(21.0f, 3.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE.lineTo(9.0f, 1.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(9.5f, 15.5f);
        pathBuilderE.curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f);
        pathBuilderE.lineToRelative(-0.02f, 0.03f);
        pathBuilderE.lineToRelative(1.01f, 0.39f);
        pathBuilderE.curveToRelative(0.23f, 0.09f, 0.49f, 0.0f, 0.61f, -0.22f);
        pathBuilderE.lineToRelative(0.84f, -1.46f);
        pathBuilderE.curveToRelative(0.12f, -0.21f, 0.07f, -0.49f, -0.12f, -0.64f);
        pathBuilderE.lineToRelative(-0.85f, -0.68f);
        pathBuilderE.lineToRelative(-0.02f, 0.03f);
        pathBuilderE.curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f);
        pathBuilderE.reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f);
        pathBuilderE.lineToRelative(0.02f, 0.03f);
        pathBuilderE.lineToRelative(0.85f, -0.68f);
        pathBuilderE.curveToRelative(0.19f, -0.15f, 0.24f, -0.43f, 0.12f, -0.64f);
        pathBuilderE.lineToRelative(-0.84f, -1.46f);
        pathBuilderE.curveToRelative(-0.12f, -0.21f, -0.38f, -0.31f, -0.61f, -0.22f);
        pathBuilderE.lineToRelative(-1.01f, 0.39f);
        pathBuilderE.lineToRelative(0.02f, 0.03f);
        pathBuilderE.curveToRelative(-0.25f, -0.17f, -0.51f, -0.34f, -0.8f, -0.46f);
        pathBuilderE.lineToRelative(-0.17f, -1.08f);
        pathBuilderE.curveTo(9.3f, 7.18f, 9.09f, 7.0f, 8.84f, 7.0f);
        pathBuilderE.lineTo(7.16f, 7.0f);
        pathBuilderE.curveToRelative(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        pathBuilderE.lineTo(6.5f, 8.5f);
        pathBuilderE.curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f);
        pathBuilderE.lineToRelative(0.02f, -0.03f);
        pathBuilderE.lineToRelative(-1.02f, -0.39f);
        pathBuilderE.curveToRelative(-0.23f, -0.09f, -0.49f, 0.0f, -0.61f, 0.22f);
        pathBuilderE.lineToRelative(-0.84f, 1.46f);
        pathBuilderE.curveToRelative(-0.12f, 0.21f, -0.07f, 0.49f, 0.12f, 0.64f);
        pathBuilderE.lineToRelative(0.85f, 0.68f);
        pathBuilderE.lineToRelative(0.02f, -0.03f);
        pathBuilderE.curveToRelative(-0.02f, 0.15f, -0.05f, 0.31f, -0.05f, 0.47f);
        pathBuilderE.reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f);
        pathBuilderE.lineToRelative(-0.02f, -0.03f);
        pathBuilderE.lineToRelative(-0.85f, 0.68f);
        pathBuilderE.curveToRelative(-0.19f, 0.15f, -0.24f, 0.43f, -0.12f, 0.64f);
        pathBuilderE.lineToRelative(0.84f, 1.46f);
        pathBuilderE.curveToRelative(0.12f, 0.21f, 0.38f, 0.31f, 0.61f, 0.22f);
        pathBuilderE.lineToRelative(1.01f, -0.39f);
        pathBuilderE.lineToRelative(-0.01f, -0.04f);
        pathBuilderE.curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f);
        pathBuilderE.lineToRelative(0.17f, 1.07f);
        pathBuilderE.curveToRelative(0.03f, 0.25f, 0.24f, 0.43f, 0.49f, 0.43f);
        pathBuilderE.horizontalLineToRelative(1.68f);
        pathBuilderE.curveToRelative(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        android.support.v4.media.a.t(pathBuilderE, 0.17f, -1.08f, 6.0f, 12.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderE.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderE.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderE, -2.0f, -0.9f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkSetup = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
