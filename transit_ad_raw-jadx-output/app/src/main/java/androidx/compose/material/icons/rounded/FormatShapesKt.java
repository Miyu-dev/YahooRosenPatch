package androidx.compose.material.icons.rounded;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: FormatShapes.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatShapes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatShapes", "Landroidx/compose/material/icons/Icons$Rounded;", "getFormatShapes", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatShapesKt {
    private static ImageVector _formatShapes;

    public static final ImageVector getFormatShapes(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _formatShapes;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatShapes", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(23.0f, 6.0f, 23.0f, 2.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.lineTo(7.0f, 3.0f);
        pathBuilderA.lineTo(7.0f, 2.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.lineTo(2.0f, 1.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.w(pathBuilderA, 1.0f, 10.0f, 2.0f, 17.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.m(pathBuilderA, -1.0f, 10.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-4.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -1.0f, 21.0f, 7.0f, 1.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        androidx.compose.animation.b.r(pathBuilderA, 3.0f, 3.0f, 2.0f, 2.0f);
        a.C(pathBuilderA, 3.0f, 5.0f, 3.0f, 3.0f);
        pathBuilderA.moveTo(5.0f, 21.0f);
        b.s(pathBuilderA, 3.0f, 21.0f, -2.0f, 2.0f);
        a.v(pathBuilderA, 2.0f, 17.0f, 19.0f);
        pathBuilderA.lineTo(7.0f, 19.0f);
        pathBuilderA.verticalLineToRelative(-1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.lineTo(5.0f, 17.0f);
        pathBuilderA.lineTo(5.0f, 7.0f);
        pathBuilderA.horizontalLineToRelative(1.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        androidx.compose.animation.a.o(pathBuilderA, 7.0f, 5.0f, 10.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.s(pathBuilderA, 1.0f, 10.0f, -1.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderA, 1.0f, 21.0f, 21.0f, -2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderA, -2.0f, 2.0f, 2.0f);
        pathBuilderA.moveTo(19.0f, 5.0f);
        androidx.compose.animation.a.o(pathBuilderA, 19.0f, 3.0f, 2.0f, 2.0f);
        androidx.compose.animation.b.q(pathBuilderA, -2.0f, 12.94f, 7.65f);
        pathBuilderA.curveToRelative(-0.15f, -0.39f, -0.53f, -0.65f, -0.95f, -0.65f);
        pathBuilderA.curveToRelative(-0.42f, 0.0f, -0.8f, 0.26f, -0.94f, 0.65f);
        pathBuilderA.lineToRelative(-2.77f, 7.33f);
        pathBuilderA.curveToRelative(-0.19f, 0.49f, 0.17f, 1.02f, 0.7f, 1.02f);
        pathBuilderA.curveToRelative(0.32f, 0.0f, 0.6f, -0.2f, 0.71f, -0.5f);
        pathBuilderA.lineToRelative(0.55f, -1.5f);
        pathBuilderA.horizontalLineToRelative(3.49f);
        pathBuilderA.lineToRelative(0.56f, 1.51f);
        pathBuilderA.curveToRelative(0.11f, 0.29f, 0.39f, 0.49f, 0.71f, 0.49f);
        pathBuilderA.horizontalLineToRelative(0.01f);
        pathBuilderA.curveToRelative(0.53f, 0.0f, 0.89f, -0.53f, 0.71f, -1.02f);
        a.t(pathBuilderA, -2.78f, -7.33f, 10.69f, 12.74f);
        pathBuilderA.lineTo(12.0f, 8.91f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.h(pathBuilderA, 1.3f, 3.83f, -2.61f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatShapes = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
