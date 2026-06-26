package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: SetMeal.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_setMeal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SetMeal", "Landroidx/compose/material/icons/Icons$Rounded;", "getSetMeal", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SetMealKt {
    private static ImageVector _setMeal;

    public static final ImageVector getSetMeal(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _setMeal;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SetMeal", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.3f, 17.6f, 3.83f, 18.46f);
        pathBuilderA.curveToRelative(-0.41f, 0.02f, -0.77f, -0.3f, -0.79f, -0.71f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(-0.02f, -0.41f, 0.3f, -0.77f, 0.71f, -0.79f);
        pathBuilderA.lineToRelative(16.48f, -0.86f);
        pathBuilderA.curveToRelative(0.41f, -0.02f, 0.77f, 0.3f, 0.79f, 0.71f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(21.04f, 17.22f, 20.72f, 17.58f, 20.3f, 17.6f);
        a.k(pathBuilderA, 20.25f, 19.48f, 3.75f);
        pathBuilderA.curveTo(3.34f, 19.48f, 3.0f, 19.82f, 3.0f, 20.23f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderA.horizontalLineToRelative(16.5f);
        pathBuilderA.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(21.0f, 19.82f, 20.66f, 19.48f, 20.25f, 19.48f);
        androidx.compose.animation.a.n(pathBuilderA, 22.0f, 5.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.verticalLineTo(5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.12f, 6.09f);
        pathBuilderA.curveToRelative(-1.25f, 0.27f, -2.19f, 1.11f, -2.33f, 2.14f);
        pathBuilderA.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        pathBuilderA.curveToRelative(-3.44f, 0.0f, -5.48f, 1.63f, -6.31f, 2.49f);
        pathBuilderA.curveToRelative(-0.28f, 0.29f, -0.28f, 0.74f, 0.0f, 1.03f);
        pathBuilderA.curveToRelative(0.83f, 0.86f, 2.87f, 2.49f, 6.31f, 2.49f);
        pathBuilderA.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        pathBuilderA.curveToRelative(0.14f, 1.02f, 1.08f, 1.86f, 2.33f, 2.14f);
        pathBuilderA.curveToRelative(0.46f, 0.1f, 0.88f, -0.28f, 0.88f, -0.74f);
        pathBuilderA.verticalLineTo(6.84f);
        pathBuilderA.curveTo(20.0f, 6.37f, 19.57f, 5.99f, 19.12f, 6.09f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _setMeal = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
