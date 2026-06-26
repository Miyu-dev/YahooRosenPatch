package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: MonitorHeart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_monitorHeart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MonitorHeart", "Landroidx/compose/material/icons/Icons$Sharp;", "getMonitorHeart", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MonitorHeartKt {
    private static ImageVector _monitorHeart;

    public static final ImageVector getMonitorHeart(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _monitorHeart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MonitorHeart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.11f, 12.45f, 14.0f, 10.24f);
        pathBuilderA.lineToRelative(-3.11f, 6.21f);
        pathBuilderA.curveTo(10.73f, 16.79f, 10.38f, 17.0f, 10.0f, 17.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.73f, -0.21f, -0.89f, -0.55f);
        h.n(pathBuilderA, 7.38f, 13.0f, 2.0f, 7.0f);
        a.s(pathBuilderA, 20.0f, -7.0f, -6.0f);
        pathBuilderA.curveTo(15.62f, 13.0f, 15.27f, 12.79f, 15.11f, 12.45f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(22.0f, 4.0f, 2.0f, 7.0f, 6.0f);
        pathBuilderO.curveToRelative(0.38f, 0.0f, 0.73f, 0.21f, 0.89f, 0.55f);
        pathBuilderO.lineTo(10.0f, 13.76f);
        pathBuilderO.lineToRelative(3.11f, -6.21f);
        pathBuilderO.curveToRelative(0.37f, -0.74f, 1.42f, -0.74f, 1.79f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.e(pathBuilderO, 16.62f, 11.0f, 22.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitorHeart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
