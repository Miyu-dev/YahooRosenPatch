package androidx.compose.material.icons.rounded;

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
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Newspaper.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_newspaper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Newspaper", "Landroidx/compose/material/icons/Icons$Rounded;", "getNewspaper", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NewspaperKt {
    private static ImageVector _newspaper;

    public static final ImageVector getNewspaper(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _newspaper;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Newspaper", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.15f, 3.85f, -0.82f, 0.82f);
        pathBuilderA.lineToRelative(-0.95f, -0.96f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.lineTo(17.0f, 4.67f);
        pathBuilderA.lineToRelative(-0.96f, -0.96f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.lineToRelative(-0.95f, 0.96f);
        pathBuilderA.lineToRelative(-0.96f, -0.96f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineToRelative(-0.96f, 0.96f);
        pathBuilderA.lineTo(9.38f, 3.71f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.lineTo(7.0f, 4.67f);
        pathBuilderA.lineTo(6.04f, 3.71f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilderA.lineTo(3.67f, 4.67f);
        pathBuilderA.lineTo(2.85f, 3.85f);
        pathBuilderA.curveTo(2.54f, 3.54f, 2.0f, 3.76f, 2.0f, 4.21f);
        pathBuilderA.verticalLineTo(19.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.lineToRelative(16.0f, 0.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineTo(4.21f);
        pathBuilderA.curveTo(22.0f, 3.76f, 21.46f, 3.54f, 21.15f, 3.85f);
        a.q(pathBuilderA, 11.0f, 19.0f, 4.0f, -6.0f);
        a.b.m(pathBuilderA, 7.0f, 19.0f, 20.0f, 19.0f);
        androidx.compose.animation.a.B(pathBuilderA, -7.0f, -2.0f, 7.0f, 19.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 20.0f, 15.0f, -7.0f, -2.0f);
        a.b.m(pathBuilderA, 7.0f, 15.0f, 20.0f, 11.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, g.e(pathBuilderA, 4.0f, 8.0f, 16.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newspaper = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
