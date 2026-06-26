package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: SingleBed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_singleBed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SingleBed", "Landroidx/compose/material/icons/Icons$Rounded;", "getSingleBed", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SingleBedKt {
    private static ImageVector _singleBed;

    public static final ImageVector getSingleBed(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _singleBed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SingleBed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(18.0f, 10.0f, 7.0f);
        pathBuilderN.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderN.horizontalLineTo(8.0f);
        pathBuilderN.curveTo(6.9f, 5.0f, 6.0f, 5.9f, 6.0f, 7.0f);
        pathBuilderN.verticalLineToRelative(3.0f);
        pathBuilderN.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.t(pathBuilderN, 5.0f, 1.33f, 0.51f, 1.53f);
        pathBuilderN.curveTo(5.94f, 18.81f, 6.2f, 19.0f, 6.5f, 19.0f);
        pathBuilderN.horizontalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f);
        pathBuilderN.lineTo(7.67f, 17.0f);
        pathBuilderN.horizontalLineToRelative(8.67f);
        pathBuilderN.lineToRelative(0.51f, 1.53f);
        pathBuilderN.curveTo(16.94f, 18.81f, 17.2f, 19.0f, 17.5f, 19.0f);
        pathBuilderN.lineToRelative(0.0f, 0.0f);
        pathBuilderN.curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f);
        h.n(pathBuilderN, 18.67f, 17.0f, 20.0f, -5.0f);
        pathBuilderN.curveTo(20.0f, 10.9f, 19.1f, 10.0f, 18.0f, 10.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderN, 11.0f, 10.0f, 8.0f, 8.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.m(pathBuilderN, 2.0f, 10.0f, 16.0f, 10.0f);
        v.m(pathBuilderN, -3.0f, 7.0f, 2.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderN, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _singleBed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
