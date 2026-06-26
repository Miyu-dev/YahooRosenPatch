package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Pool.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pool", "Landroidx/compose/material/icons/Icons$Outlined;", "getPool", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PoolKt {
    private static ImageVector _pool;

    public static final ImageVector getPool(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _pool;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pool", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.0f, 8.0f, -3.25f, 3.25f);
        pathBuilderA.curveToRelative(0.31f, 0.12f, 0.56f, 0.27f, 0.77f, 0.39f);
        pathBuilderA.curveToRelative(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f);
        pathBuilderA.reflectiveCurveToRelative(0.78f, -0.13f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f);
        pathBuilderA.reflectiveCurveToRelative(1.73f, 0.37f, 2.18f, 0.64f);
        pathBuilderA.curveToRelative(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, -0.13f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.12f, -0.07f, 0.26f, -0.15f, 0.41f, -0.23f);
        pathBuilderA.lineTo(10.48f, 5.0f);
        pathBuilderA.curveTo(8.93f, 3.45f, 7.5f, 2.99f, 5.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(2.5f);
        pathBuilderA.curveToRelative(1.82f, -0.01f, 2.89f, 0.39f, 4.0f, 1.5f);
        a.t(pathBuilderA, 1.0f, 1.0f, 22.0f, 16.5f);
        pathBuilderA.horizontalLineToRelative(-0.02f);
        pathBuilderA.horizontalLineToRelative(0.02f);
        pathBuilderA.close();
        pathBuilderA.moveTo(5.35f, 15.5f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilderA.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilderA.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilderA.reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f);
        pathBuilderA.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.45f, 0.27f, 1.06f, 0.63f, 2.16f, 0.64f);
        pathBuilderA.verticalLineToRelative(-2.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilderA.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilderA.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilderA.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilderA.reflectiveCurveToRelative(-0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilderA.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilderA.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilderA.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilderA.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilderA.reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilderA.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilderA.verticalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(1.11f, 0.0f, 1.73f, -0.37f, 2.2f, -0.64f);
        pathBuilderA.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.67f, 18.0f);
        pathBuilderA.curveToRelative(-1.11f, 0.0f, -1.73f, 0.37f, -2.18f, 0.64f);
        pathBuilderA.curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -0.78f, -0.14f, -1.15f, -0.36f);
        pathBuilderA.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilderA.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilderA.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilderA.reflectiveCurveToRelative(-0.78f, -0.13f, -1.15f, -0.36f);
        pathBuilderA.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilderA.reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f);
        pathBuilderA.curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        pathBuilderA.verticalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(1.11f, 0.0f, 1.73f, -0.37f, 2.19f, -0.64f);
        pathBuilderA.curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, 0.13f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilderA.reflectiveCurveToRelative(1.73f, -0.37f, 2.19f, -0.64f);
        pathBuilderA.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilderA.reflectiveCurveToRelative(1.72f, -0.37f, 2.18f, -0.64f);
        pathBuilderA.curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 0.78f, 0.14f, 1.15f, 0.36f);
        pathBuilderA.curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        pathBuilderA.verticalLineToRelative(-2.0f);
        pathBuilderA.curveToRelative(-0.56f, 0.0f, -0.78f, -0.13f, -1.15f, -0.36f);
        pathBuilderA.curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(16.5f, 5.5f, -2.5f, 0.0f);
        pathBuilderB.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilderB.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pool = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
