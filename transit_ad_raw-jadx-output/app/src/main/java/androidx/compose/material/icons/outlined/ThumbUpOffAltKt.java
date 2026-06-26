package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: ThumbUpOffAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbUpOffAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbUpOffAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getThumbUpOffAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThumbUpOffAltKt {
    private static ImageVector _thumbUpOffAlt;

    public static final ImageVector getThumbUpOffAlt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _thumbUpOffAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbUpOffAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(9.0f, 21.0f, 9.0f);
        pathBuilderB.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        pathBuilderB.lineToRelative(3.02f, -7.05f);
        pathBuilderB.curveTo(22.95f, 12.5f, 23.0f, 12.26f, 23.0f, 12.0f);
        pathBuilderB.verticalLineToRelative(-2.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.horizontalLineToRelative(-6.31f);
        pathBuilderB.lineToRelative(0.95f, -4.57f);
        pathBuilderB.lineToRelative(0.03f, -0.32f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        pathBuilderB.lineTo(14.17f, 1.0f);
        pathBuilderB.lineTo(7.58f, 7.59f);
        pathBuilderB.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        pathBuilderB.verticalLineToRelative(10.0f);
        pathBuilderB.curveTo(7.0f, 20.1f, 7.9f, 21.0f, 9.0f, 21.0f);
        a.y(pathBuilderB, 9.0f, 9.0f, 4.34f, -4.34f);
        androidx.compose.animation.a.o(pathBuilderB, 12.0f, 10.0f, 9.0f, 2.0f);
        pathBuilderB.lineToRelative(-3.0f, 7.0f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.close();
        androidx.appcompat.view.menu.a.x(pathBuilderB, 1.0f, 9.0f, 4.0f, 12.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderB, 1.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpOffAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
