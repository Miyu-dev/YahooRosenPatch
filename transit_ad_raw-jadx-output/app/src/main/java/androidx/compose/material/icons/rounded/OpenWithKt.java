package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: OpenWith.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_openWith", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OpenWith", "Landroidx/compose/material/icons/Icons$Rounded;", "getOpenWith", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OpenWithKt {
    private static ImageVector _openWith;

    public static final ImageVector getOpenWith(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _openWith;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OpenWith", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(10.5f, 9.0f, 3.0f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderB.lineTo(14.0f, 6.0f);
        pathBuilderB.horizontalLineToRelative(1.79f);
        pathBuilderB.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilderB.lineToRelative(-3.79f, -3.79f);
        pathBuilderB.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilderB.lineTo(7.85f, 5.15f);
        pathBuilderB.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        pathBuilderB.lineTo(10.0f, 6.0f);
        pathBuilderB.verticalLineToRelative(2.5f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        a.t(pathBuilderB, 8.5f, 10.0f, 6.0f, 10.0f);
        pathBuilderB.lineTo(6.0f, 8.21f);
        pathBuilderB.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderB.lineToRelative(-3.79f, 3.79f);
        pathBuilderB.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderB.lineToRelative(3.79f, 3.79f);
        pathBuilderB.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        pathBuilderB.lineTo(6.0f, 14.0f);
        pathBuilderB.horizontalLineToRelative(2.5f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderB.verticalLineToRelative(-3.0f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        androidx.browser.browseractions.a.y(pathBuilderB, 22.65f, 11.65f, -3.79f, -3.79f);
        pathBuilderB.curveToRelative(-0.32f, -0.32f, -0.86f, -0.1f, -0.86f, 0.35f);
        pathBuilderB.lineTo(18.0f, 10.0f);
        pathBuilderB.horizontalLineToRelative(-2.5f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.verticalLineToRelative(3.0f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderB.lineTo(18.0f, 14.0f);
        pathBuilderB.verticalLineToRelative(1.79f);
        pathBuilderB.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderB.lineToRelative(3.79f, -3.79f);
        pathBuilderB.curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f);
        a.j(pathBuilderB, 13.5f, 15.0f, -3.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderB.lineTo(10.0f, 18.0f);
        pathBuilderB.lineTo(8.21f, 18.0f);
        pathBuilderB.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilderB.lineToRelative(3.79f, 3.79f);
        pathBuilderB.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderB.lineToRelative(3.79f, -3.79f);
        pathBuilderB.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilderB.lineTo(14.0f, 18.0f);
        pathBuilderB.verticalLineToRelative(-2.5f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openWith = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
