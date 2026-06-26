package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: IceSkating.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_iceSkating", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IceSkating", "Landroidx/compose/material/icons/Icons$Filled;", "getIceSkating", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class IceSkatingKt {
    private static ImageVector _iceSkating;

    public static final ImageVector getIceSkating(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _iceSkating;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.IceSkating", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.0f, 8.5f);
        pathBuilderD.curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f);
        androidx.appcompat.app.m.D(pathBuilderD, 2.52f, 11.0f, 7.0f, 8.5f);
        pathBuilderD.curveTo(8.22f, 7.0f, 8.0f, 6.78f, 8.0f, 6.5f);
        pathBuilderD.curveTo(8.0f, 6.22f, 8.22f, 6.0f, 8.5f, 6.0f);
        androidx.compose.animation.a.v(pathBuilderD, 11.0f, 3.0f, 3.0f, 15.0f);
        androidx.appcompat.app.m.x(pathBuilderD, 3.0f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        android.support.v4.media.a.s(pathBuilderD, -2.0f, -2.0f, 3.0f);
        pathBuilderD.lineToRelative(0.0f, -2.88f);
        pathBuilderD.curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f);
        pathBuilderD.lineToRelative(-2.7f, -0.67f);
        pathBuilderD.curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9.0f);
        pathBuilderD.horizontalLineTo(8.5f);
        pathBuilderD.curveTo(8.22f, 9.0f, 8.0f, 8.78f, 8.0f, 8.5f);
        a.q(pathBuilderD, 14.0f, 20.0f, 8.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderD, 6.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iceSkating = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
