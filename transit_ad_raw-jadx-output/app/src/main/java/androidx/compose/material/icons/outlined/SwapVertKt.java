package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SwapVert.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swapVert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwapVert", "Landroidx/compose/material/icons/Icons$Outlined;", "getSwapVert", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwapVertKt {
    private static ImageVector _swapVert;

    public static final ImageVector getSwapVert(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _swapVert;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwapVert", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(16.0f, 17.01f, 16.0f, 10.0f, -2.0f);
        androidx.browser.browseractions.a.x(pathBuilderL, 7.01f, -3.0f, 15.0f, 21.0f);
        v.x(pathBuilderL, 4.0f, -3.99f, -3.0f);
        pathBuilderL.moveTo(9.0f, 3.0f);
        pathBuilderL.lineTo(5.0f, 6.99f);
        androidx.appcompat.view.menu.a.y(pathBuilderL, 3.0f, 8.0f, 14.0f, 2.0f);
        pathBuilderL.lineTo(10.0f, 6.99f);
        androidx.appcompat.view.menu.a.s(pathBuilderL, 3.0f, 9.0f, 3.0f);
        pathBuilderL.moveTo(16.0f, 17.01f);
        androidx.compose.animation.a.o(pathBuilderL, 16.0f, 10.0f, -2.0f, 7.01f);
        pathBuilderL.horizontalLineToRelative(-3.0f);
        pathBuilderL.lineTo(15.0f, 21.0f);
        v.x(pathBuilderL, 4.0f, -3.99f, -3.0f);
        pathBuilderL.moveTo(9.0f, 3.0f);
        pathBuilderL.lineTo(5.0f, 6.99f);
        androidx.appcompat.view.menu.a.y(pathBuilderL, 3.0f, 8.0f, 14.0f, 2.0f);
        pathBuilderL.lineTo(10.0f, 6.99f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.r(pathBuilderL, 3.0f, 9.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapVert = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
