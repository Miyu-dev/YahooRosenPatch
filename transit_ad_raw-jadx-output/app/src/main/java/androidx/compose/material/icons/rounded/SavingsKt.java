package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: Savings.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_savings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Savings", "Landroidx/compose/material/icons/Icons$Rounded;", "getSavings", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SavingsKt {
    private static ImageVector _savings;

    public static final ImageVector getSavings(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Savings", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.83f, 7.5f, -2.27f, -2.27f);
        pathBuilderA.curveToRelative(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f);
        pathBuilderA.curveToRelative(0.11f, -0.26f, 0.15f, -0.56f, 0.09f, -0.87f);
        pathBuilderA.curveTo(17.84f, 2.49f, 17.14f, 1.99f, 16.4f, 2.0f);
        pathBuilderA.curveToRelative(-1.59f, 0.03f, -3.0f, 0.81f, -3.9f, 2.0f);
        pathBuilderA.lineToRelative(-5.0f, 0.0f);
        pathBuilderA.curveTo(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f);
        pathBuilderA.curveToRelative(0.0f, 2.25f, 1.37f, 7.48f, 2.08f, 10.04f);
        pathBuilderA.curveTo(4.32f, 20.4f, 5.11f, 21.0f, 6.01f, 21.0f);
        pathBuilderA.lineTo(8.0f, 21.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.m(pathBuilderA, 0.0f, 2.0f, 0.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.lineToRelative(2.01f, 0.0f);
        pathBuilderA.curveToRelative(0.88f, 0.0f, 1.66f, -0.58f, 1.92f, -1.43f);
        pathBuilderA.lineToRelative(1.25f, -4.16f);
        pathBuilderA.lineToRelative(2.14f, -0.72f);
        pathBuilderA.curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f);
        pathBuilderA.verticalLineTo(8.5f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.r(pathBuilderA, 19.83f, 12.0f, 9.0f, 9.0f);
        pathBuilderA.curveTo(8.45f, 9.0f, 8.0f, 8.55f, 8.0f, 8.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(3.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(13.0f, 8.55f, 12.55f, 9.0f, 12.0f, 9.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(16.0f, 11.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.curveTo(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savings = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
