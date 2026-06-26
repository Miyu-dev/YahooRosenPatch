package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: FormatColorFill.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatColorFill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatColorFill", "Landroidx/compose/material/icons/Icons$Sharp;", "getFormatColorFill", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatColorFillKt {
    private static ImageVector _formatColorFill;

    public static final ImageVector getFormatColorFill(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _formatColorFill;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatColorFill", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.0f, 17.62f, 17.62f, 10.0f);
        pathBuilderA.lineToRelative(-10.0f, -10.0f);
        pathBuilderA.lineTo(6.21f, 1.41f);
        pathBuilderA.lineToRelative(2.38f, 2.38f);
        a.C(pathBuilderA, 2.38f, 10.0f, 10.0f, 17.62f);
        pathBuilderA.moveTo(10.0f, 5.21f);
        pathBuilderA.lineTo(14.79f, 10.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.k(pathBuilderA, 5.21f, 10.0f, 5.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(19.0f, 17.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.33f, -2.0f, -3.5f, -2.0f, -3.5f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 2.17f, -2.0f, 3.5f);
        pathBuilderD.curveTo(17.0f, 16.1f, 17.9f, 17.0f, 19.0f, 17.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(2.0f, 20.0f, 20.0f, 4.0f, -20.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorFill = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
