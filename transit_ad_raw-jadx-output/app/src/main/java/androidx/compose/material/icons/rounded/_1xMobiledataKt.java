package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: _1xMobiledata.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__1xMobiledata", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_1xMobiledata", "Landroidx/compose/material/icons/Icons$Rounded;", "get_1xMobiledata", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _1xMobiledataKt {
    private static ImageVector __1xMobiledata;

    public static final ImageVector get_1xMobiledata(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = __1xMobiledata;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._1xMobiledata", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(5.0f, 7.0f, 2.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(8.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.curveTo(4.45f, 9.0f, 4.0f, 8.55f, 4.0f, 8.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(4.0f, 7.45f, 4.45f, 7.0f, 5.0f, 7.0f);
        a.y(pathBuilderB, 15.83f, 11.72f, 1.92f, -3.21f);
        pathBuilderB.curveTo(18.15f, 7.85f, 17.67f, 7.0f, 16.9f, 7.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.35f, 0.0f, -0.68f, 0.18f, -0.86f, 0.49f);
        pathBuilderB.lineToRelative(-1.37f, 2.28f);
        pathBuilderB.lineToRelative(-1.38f, -2.29f);
        pathBuilderB.curveTo(13.11f, 7.18f, 12.79f, 7.0f, 12.44f, 7.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.78f, 0.0f, -1.26f, 0.85f, -0.86f, 1.51f);
        pathBuilderB.lineToRelative(1.92f, 3.21f);
        pathBuilderB.lineToRelative(-2.26f, 3.77f);
        pathBuilderB.curveToRelative(-0.4f, 0.67f, 0.08f, 1.51f, 0.86f, 1.51f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.35f, 0.0f, 0.68f, -0.18f, 0.86f, -0.49f);
        pathBuilderB.lineToRelative(1.71f, -2.85f);
        pathBuilderB.lineToRelative(1.71f, 2.85f);
        pathBuilderB.curveToRelative(0.18f, 0.3f, 0.51f, 0.49f, 0.86f, 0.49f);
        pathBuilderB.horizontalLineToRelative(0.01f);
        pathBuilderB.curveToRelative(0.78f, 0.0f, 1.26f, -0.85f, 0.86f, -1.51f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 15.83f, 11.72f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1xMobiledata = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
