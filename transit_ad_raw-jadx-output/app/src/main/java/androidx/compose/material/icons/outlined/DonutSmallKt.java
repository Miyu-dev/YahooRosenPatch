package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: DonutSmall.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_donutSmall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DonutSmall", "Landroidx/compose/material/icons/Icons$Outlined;", "getDonutSmall", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DonutSmall", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(14.82f, 11.0f, 7.13f);
        pathBuilderB.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        pathBuilderB.verticalLineToRelative(7.13f);
        pathBuilderB.curveToRelative(0.85f, 0.31f, 1.51f, 0.97f, 1.82f, 1.82f);
        pathBuilderB.close();
        pathBuilderB.moveTo(15.0f, 4.58f);
        pathBuilderB.curveTo(17.0f, 5.4f, 18.6f, 7.0f, 19.42f, 9.0f);
        pathBuilderB.horizontalLineToRelative(-3.43f);
        pathBuilderB.curveToRelative(-0.28f, -0.37f, -0.62f, -0.71f, -0.99f, -0.99f);
        a.z(pathBuilderB, 15.0f, 4.58f, 2.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilderB.verticalLineToRelative(-7.13f);
        pathBuilderB.curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f);
        pathBuilderB.lineTo(11.0f, 2.05f);
        pathBuilderB.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        androidx.compose.animation.a.n(pathBuilderB, 9.0f, 4.58f, 3.44f);
        pathBuilderB.curveToRelative(-1.23f, 0.92f, -2.0f, 2.39f, -2.0f, 3.98f);
        pathBuilderB.curveToRelative(0.0f, 1.59f, 0.77f, 3.06f, 2.0f, 3.99f);
        pathBuilderB.verticalLineToRelative(3.44f);
        pathBuilderB.curveTo(6.04f, 18.24f, 4.0f, 15.35f, 4.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -3.35f, 2.04f, -6.24f, 5.0f, -7.42f);
        androidx.compose.animation.a.n(pathBuilderB, 13.0f, 14.82f, 7.13f);
        pathBuilderB.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        pathBuilderB.horizontalLineToRelative(-7.13f);
        pathBuilderB.curveToRelative(-0.31f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f);
        pathBuilderB.close();
        pathBuilderB.moveTo(15.0f, 15.99f);
        pathBuilderB.curveToRelative(0.37f, -0.28f, 0.71f, -0.61f, 0.99f, -0.99f);
        pathBuilderB.horizontalLineToRelative(3.43f);
        pathBuilderB.curveTo(18.6f, 17.0f, 17.0f, 18.6f, 15.0f, 19.42f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.h(pathBuilderB, -3.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
