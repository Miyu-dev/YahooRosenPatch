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

/* JADX INFO: compiled from: Hail.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hail", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hail", "Landroidx/compose/material/icons/Icons$Filled;", "getHail", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HailKt {
    private static ImageVector _hail;

    public static final ImageVector getHail(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _hail;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Hail", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.r(pathBuilderD, 17.0f, 2.0f, 2.0f, 0.4f);
        pathBuilderD.curveToRelative(-0.1f, 2.2f, -0.8f, 3.9f, -2.3f, 5.1f);
        pathBuilderD.curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f);
        androidx.compose.animation.a.o(pathBuilderD, 15.0f, 22.0f, -2.0f, -6.0f);
        android.support.v4.media.a.w(pathBuilderD, -2.0f, 6.0f, 9.0f, 22.0f);
        pathBuilderD.lineTo(9.0f, 10.1f);
        pathBuilderD.curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f);
        pathBuilderD.curveToRelative(-0.9f, 0.7f, -1.39f, 1.6f, -1.4f, 3.1f);
        v.y(pathBuilderD, 0.5f, 5.0f, 14.0f, -0.5f);
        pathBuilderD.curveToRelative(0.0f, -2.0f, 0.71f, -3.59f, 2.11f, -4.79f);
        pathBuilderD.curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f);
        pathBuilderD.curveTo(16.48f, 5.14f, 17.0f, 4.0f, 17.0f, 2.5f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 17.0f, 2.0f, 4.0f, 16.0f);
        android.support.v4.media.a.w(pathBuilderD, 3.0f, 6.0f, 4.0f, 22.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderD, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hail = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
