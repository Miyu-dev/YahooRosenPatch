package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearbyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearbyOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getNearbyOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NearbyOffKt {
    private static ImageVector _nearbyOff;

    public static final ImageVector getNearbyOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _nearbyOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NearbyOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        a.t(pathBuilderA, 20.48f, 21.9f, 20.48f, 21.9f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderA.lineTo(16.0f, 18.83f);
        pathBuilderA.lineToRelative(-2.58f, 2.58f);
        pathBuilderA.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderA.lineToRelative(-8.0f, -8.0f);
        pathBuilderA.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderA.lineTo(5.17f, 8.0f);
        pathBuilderA.lineTo(2.1f, 4.93f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(16.98f, 16.97f);
        pathBuilderA.curveTo(20.87f, 20.87f, 20.87f, 21.51f, 20.48f, 21.9f);
        androidx.browser.browseractions.a.y(pathBuilderA, 14.19f, 17.02f, -1.39f, -1.39f);
        pathBuilderA.lineToRelative(-0.09f, 0.09f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        pathBuilderA.lineToRelative(-3.01f, -3.01f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.lineToRelative(0.09f, -0.09f);
        pathBuilderA.lineToRelative(-1.4f, -1.39f);
        pathBuilderA.lineTo(4.8f, 12.0f);
        s.r(pathBuilderA, 7.2f, 7.2f, 14.19f, 17.02f);
        pathBuilderA.moveTo(15.71f, 11.29f);
        pathBuilderA.lineToRelative(-3.01f, -3.01f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineTo(11.2f, 8.38f);
        pathBuilderA.lineToRelative(4.42f, 4.42f);
        pathBuilderA.lineToRelative(0.09f, -0.09f);
        pathBuilderA.curveTo(16.1f, 12.32f, 16.1f, 11.68f, 15.71f, 11.29f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
