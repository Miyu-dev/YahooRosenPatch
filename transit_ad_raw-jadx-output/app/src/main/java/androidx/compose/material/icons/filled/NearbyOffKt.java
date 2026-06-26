package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: NearbyOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearbyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearbyOff", "Landroidx/compose/material/icons/Icons$Filled;", "getNearbyOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NearbyOffKt {
    private static ImageVector _nearbyOff;

    public static final ImageVector getNearbyOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _nearbyOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NearbyOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.41f, 13.42f, 18.83f, 16.0f);
        pathBuilderA.lineToRelative(-1.81f, -1.81f);
        pathBuilderA.lineTo(19.2f, 12.0f);
        pathBuilderA.lineTo(12.0f, 4.8f);
        pathBuilderA.lineTo(9.81f, 6.99f);
        pathBuilderA.lineTo(8.0f, 5.17f);
        pathBuilderA.lineToRelative(2.58f, -2.58f);
        pathBuilderA.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderA.lineToRelative(8.0f, 8.0f);
        pathBuilderA.curveTo(22.2f, 11.37f, 22.2f, 12.63f, 21.41f, 13.42f);
        a.y(pathBuilderA, 21.19f, 21.19f, -1.41f, 1.41f);
        pathBuilderA.lineTo(16.0f, 18.83f);
        pathBuilderA.lineToRelative(-2.58f, 2.58f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderA.lineToRelative(-8.0f, -8.0f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineTo(5.17f, 8.0f);
        pathBuilderA.lineTo(1.39f, 4.22f);
        android.support.v4.media.a.C(pathBuilderA, 2.8f, 2.81f, 21.19f, 21.19f);
        pathBuilderA.moveTo(14.19f, 17.02f);
        pathBuilderA.lineToRelative(-1.39f, -1.39f);
        pathBuilderA.lineToRelative(-0.8f, 0.8f);
        pathBuilderA.lineTo(7.58f, 12.0f);
        pathBuilderA.lineToRelative(0.8f, -0.8f);
        pathBuilderA.lineToRelative(-1.4f, -1.39f);
        pathBuilderA.lineTo(4.8f, 12.0f);
        s.r(pathBuilderA, 7.2f, 7.2f, 14.19f, 17.02f);
        pathBuilderA.moveTo(16.42f, 12.0f);
        pathBuilderA.lineTo(12.0f, 7.58f);
        pathBuilderA.lineToRelative(-0.8f, 0.8f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 4.42f, 4.42f, 16.42f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
