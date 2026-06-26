package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: SmokeFree.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_smokeFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SmokeFree", "Landroidx/compose/material/icons/Icons$Rounded;", "getSmokeFree", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SmokeFreeKt {
    private static ImageVector _smokeFree;

    public static final ImageVector getSmokeFree(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _smokeFree;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SmokeFree", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(20.5f, 13.0f, 22.0f, 13.0f, 3.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderB, -1.5f, 18.0f, 13.0f, 1.5f);
        h.q(pathBuilderB, 3.0f, 18.0f, 16.0f);
        pathBuilderB.moveTo(17.0f, 14.5f);
        pathBuilderB.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderB.horizontalLineToRelative(-0.84f);
        pathBuilderB.lineToRelative(2.18f, 2.18f);
        pathBuilderB.curveToRelative(0.1f, -0.21f, 0.16f, -0.44f, 0.16f, -0.68f);
        androidx.compose.animation.a.t(pathBuilderB, 18.96f, 2.35f, 19.0f, 2.35f);
        b.q(pathBuilderB, -0.04f, 18.85f, 4.73f);
        pathBuilderB.curveToRelative(0.38f, -0.38f, 0.67f, -0.84f, 0.84f, -1.35f);
        pathBuilderB.curveToRelative(0.16f, -0.5f, -0.19f, -1.01f, -0.71f, -1.02f);
        pathBuilderB.curveToRelative(-0.34f, 0.01f, -0.61f, 0.25f, -0.72f, 0.58f);
        pathBuilderB.curveToRelative(-0.18f, 0.55f, -0.62f, 0.99f, -1.17f, 1.17f);
        pathBuilderB.curveToRelative(-0.34f, 0.11f, -0.59f, 0.39f, -0.59f, 0.74f);
        pathBuilderB.lineTo(16.5f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f);
        pathBuilderB.curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f);
        pathBuilderB.verticalLineToRelative(1.48f);
        pathBuilderB.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderB.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderB.lineTo(22.0f, 9.76f);
        pathBuilderB.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        androidx.compose.animation.a.j(pathBuilderB, 14.61f, 8.65f, 1.42f);
        pathBuilderB.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilderB.verticalLineToRelative(0.55f);
        pathBuilderB.curveToRelative(0.0f, 0.41f, 0.33f, 0.75f, 0.75f, 0.75f);
        pathBuilderB.horizontalLineToRelative(0.01f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f);
        pathBuilderB.verticalLineToRelative(-0.89f);
        pathBuilderB.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilderB.horizontalLineToRelative(-1.3f);
        pathBuilderB.curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f);
        pathBuilderB.curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f);
        pathBuilderB.curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f);
        pathBuilderB.curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f);
        pathBuilderB.curveToRelative(-1.42f, 0.41f, -2.45f, 1.73f, -2.42f, 3.28f);
        pathBuilderB.curveToRelative(0.02f, 1.85f, 1.61f, 3.29f, 3.45f, 3.29f);
        pathBuilderB.close();
        pathBuilderB.moveTo(4.12f, 5.29f);
        pathBuilderB.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderB.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderB.lineTo(9.0f, 13.0f);
        pathBuilderB.lineTo(3.5f, 13.0f);
        pathBuilderB.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderB.reflectiveCurveTo(2.67f, 16.0f, 3.5f, 16.0f);
        pathBuilderB.lineTo(12.0f, 16.0f);
        pathBuilderB.lineToRelative(6.29f, 6.29f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderB.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 4.12f, 5.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokeFree = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
