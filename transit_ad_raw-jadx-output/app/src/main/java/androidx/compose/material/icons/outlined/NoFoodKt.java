package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: NoFood.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noFood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFood", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoFood", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoFood", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(1.0f, 21.0f, 15.01f, 0.98f);
        pathBuilderO.curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f);
        pathBuilderO.horizontalLineTo(2.01f);
        pathBuilderO.curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f);
        a.y(pathBuilderO, 21.0f, 20.49f, 23.31f);
        androidx.browser.browseractions.a.D(pathBuilderO, 16.0f, 18.83f, 19.0f, 1.0f);
        androidx.browser.browseractions.a.t(pathBuilderO, -2.0f, 13.17f, -2.0f, -2.0f);
        pathBuilderO.horizontalLineTo(1.0f);
        pathBuilderO.curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f);
        pathBuilderO.lineToRelative(-5.7f, -5.7f);
        pathBuilderO.lineTo(2.1f, 2.1f);
        pathBuilderO.lineTo(13.0f, 13.0f);
        pathBuilderO.lineToRelative(2.0f, 2.0f);
        s.r(pathBuilderO, 6.9f, 6.9f, 20.49f, 23.31f);
        pathBuilderO.moveTo(10.17f, 13.0f);
        pathBuilderO.lineToRelative(-2.0f, -2.0f);
        pathBuilderO.curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f);
        h.v(pathBuilderO, 10.17f, 23.0f, 5.0f, -5.0f);
        s.y(pathBuilderO, 1.0f, -2.0f, 4.0f, -5.0f);
        pathBuilderO.lineToRelative(0.23f, 2.0f);
        pathBuilderO.horizontalLineToRelative(9.56f);
        pathBuilderO.lineToRelative(-1.0f, 9.97f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderO, 1.83f, 1.83f, 23.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
