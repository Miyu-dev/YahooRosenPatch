package androidx.compose.material.icons.sharp;

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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Cottage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cottage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cottage", "Landroidx/compose/material/icons/Icons$Sharp;", "getCottage", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CottageKt {
    private static ImageVector _cottage;

    public static final ImageVector getCottage(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _cottage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Cottage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = c.c(12.0f, 3.0f, 6.0f, 7.58f, 6.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.verticalLineToRelative(3.11f);
        pathBuilderC.lineTo(1.0f, 11.4f);
        pathBuilderC.lineToRelative(1.21f, 1.59f);
        androidx.appcompat.app.m.r(pathBuilderC, 4.0f, 11.62f, 21.0f, 7.0f);
        a.l(pathBuilderC, -6.0f, 2.0f, 6.0f, 7.0f);
        pathBuilderC.verticalLineToRelative(-9.38f);
        pathBuilderC.lineToRelative(1.79f, 1.36f);
        android.support.v4.media.a.C(pathBuilderC, 23.0f, 11.4f, 12.0f, 3.0f);
        pathBuilderC.moveTo(10.0f, 1.0f);
        pathBuilderC.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilderC.curveTo(6.45f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderC, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cottage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
