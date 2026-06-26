package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: _4kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__4kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_4kPlus", "Landroidx/compose/material/icons/Icons$Rounded;", "get_4kPlus", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _4kPlusKt {
    private static ImageVector __4kPlus;

    public static final ImageVector get_4kPlus(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = __4kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._4kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(19.0f, 3.0f, 5.0f);
        pathBuilderB.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        a.q(pathBuilderB, 10.25f, 13.5f, 10.0f, 0.75f);
        pathBuilderB.curveTo(10.0f, 14.66f, 9.66f, 15.0f, 9.25f, 15.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderB.verticalLineTo(13.5f);
        pathBuilderB.horizontalLineToRelative(-2.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineTo(9.75f);
        pathBuilderB.curveTo(5.5f, 9.34f, 5.84f, 9.0f, 6.25f, 9.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveTo(6.66f, 9.0f, 7.0f, 9.34f, 7.0f, 9.75f);
        h.w(pathBuilderB, 12.0f, 1.5f, 9.75f);
        pathBuilderB.curveTo(8.5f, 9.34f, 8.84f, 9.0f, 9.25f, 9.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveTo(9.66f, 9.0f, 10.0f, 9.34f, 10.0f, 9.75f);
        pathBuilderB.verticalLineTo(12.0f);
        pathBuilderB.horizontalLineToRelative(0.25f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(11.0f, 13.16f, 10.66f, 13.5f, 10.25f, 13.5f);
        androidx.compose.animation.a.t(pathBuilderB, 15.09f, 15.0f, 15.09f, 15.0f);
        pathBuilderB.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        pathBuilderB.lineTo(13.0f, 12.75f);
        pathBuilderB.verticalLineToRelative(1.55f);
        pathBuilderB.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        pathBuilderB.horizontalLineTo(12.2f);
        pathBuilderB.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        pathBuilderB.verticalLineTo(9.7f);
        pathBuilderB.curveToRelative(0.0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f);
        pathBuilderB.horizontalLineToRelative(0.09f);
        pathBuilderB.curveTo(12.69f, 9.0f, 13.0f, 9.31f, 13.0f, 9.7f);
        pathBuilderB.verticalLineToRelative(1.55f);
        pathBuilderB.lineToRelative(1.54f, -1.98f);
        pathBuilderB.curveTo(14.67f, 9.1f, 14.88f, 9.0f, 15.09f, 9.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        pathBuilderB.lineTo(14.25f, 12.0f);
        pathBuilderB.lineToRelative(1.41f, 1.88f);
        pathBuilderB.curveTo(16.0f, 14.34f, 15.67f, 15.0f, 15.09f, 15.0f);
        b.r(pathBuilderB, 18.5f, 12.5f, -1.0f, 1.0f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderB.verticalLineToRelative(-1.0f);
        pathBuilderB.horizontalLineToRelative(-1.0f);
        pathBuilderB.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderB.horizontalLineToRelative(1.0f);
        pathBuilderB.verticalLineToRelative(-1.0f);
        pathBuilderB.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderB.verticalLineToRelative(1.0f);
        pathBuilderB.horizontalLineToRelative(1.0f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(19.0f, 12.28f, 18.78f, 12.5f, 18.5f, 12.5f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
