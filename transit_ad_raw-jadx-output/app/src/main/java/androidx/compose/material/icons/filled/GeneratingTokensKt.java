package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: GeneratingTokens.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_generatingTokens", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GeneratingTokens", "Landroidx/compose/material/icons/Icons$Filled;", "getGeneratingTokens", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GeneratingTokensKt {
    private static ImageVector _generatingTokens;

    public static final ImageVector getGeneratingTokens(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _generatingTokens;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GeneratingTokens", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.0f, 4.0f);
        pathBuilderD.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilderD.curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f);
        b.r(pathBuilderD, 12.0f, 10.5f, -2.0f, 5.0f);
        c.b.e(pathBuilderD, 8.0f, -5.0f, 6.0f, 9.0f);
        a.b.m(pathBuilderD, 6.0f, 10.5f, 20.25f, 3.75f);
        pathBuilderD.lineTo(23.0f, 5.0f);
        pathBuilderD.lineToRelative(-2.75f, 1.25f);
        pathBuilderD.lineTo(19.0f, 9.0f);
        pathBuilderD.lineToRelative(-1.25f, -2.75f);
        pathBuilderD.lineTo(15.0f, 5.0f);
        pathBuilderD.lineToRelative(2.75f, -1.25f);
        android.support.v4.media.a.C(pathBuilderD, 19.0f, 1.0f, 20.25f, 3.75f);
        pathBuilderD.moveTo(20.25f, 17.75f);
        pathBuilderD.lineTo(23.0f, 19.0f);
        pathBuilderD.lineToRelative(-2.75f, 1.25f);
        pathBuilderD.lineTo(19.0f, 23.0f);
        pathBuilderD.lineToRelative(-1.25f, -2.75f);
        pathBuilderD.lineTo(15.0f, 19.0f);
        pathBuilderD.lineToRelative(2.75f, -1.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 19.0f, 15.0f, 20.25f, 17.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _generatingTokens = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
