package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: EarbudsBattery.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_earbudsBattery", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EarbudsBattery", "Landroidx/compose/material/icons/Icons$Sharp;", "getEarbudsBattery", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EarbudsBatteryKt {
    private static ImageVector _earbudsBattery;

    public static final ImageVector getEarbudsBattery(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _earbudsBattery;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EarbudsBattery", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 7.0f, 0.0f, -1.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 1.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 11.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 6.0f, 0.0f, 0.0f, -11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(5.38f, 16.5f, 5.38f, 16.5f);
        pathBuilderA2.curveToRelative(-1.04f, 0.0f, -1.88f, -0.84f, -1.88f, -1.87f);
        pathBuilderA2.verticalLineTo(10.0f);
        pathBuilderA2.horizontalLineTo(6.0f);
        pathBuilderA2.verticalLineTo(6.0f);
        pathBuilderA2.horizontalLineTo(4.0f);
        pathBuilderA2.curveTo(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f);
        pathBuilderA2.verticalLineToRelative(6.63f);
        pathBuilderA2.curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.37f, 18.0f);
        pathBuilderA2.horizontalLineToRelative(0.0f);
        pathBuilderA2.curveToRelative(1.86f, 0.0f, 3.37f, -1.51f, 3.37f, -3.37f);
        pathBuilderA2.verticalLineTo(9.37f);
        pathBuilderA2.curveToRelative(0.0f, -1.04f, 0.84f, -1.87f, 1.87f, -1.87f);
        pathBuilderA2.horizontalLineToRelative(0.0f);
        pathBuilderA2.curveToRelative(1.04f, 0.0f, 1.87f, 0.84f, 1.87f, 1.87f);
        b.x(pathBuilderA2, 14.0f, 10.0f, 4.0f, 2.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.verticalLineTo(9.37f);
        pathBuilderA2.curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.63f, 6.0f);
        pathBuilderA2.horizontalLineToRelative(0.0f);
        pathBuilderA2.curveTo(8.76f, 6.0f, 7.25f, 7.51f, 7.25f, 9.37f);
        pathBuilderA2.verticalLineToRelative(5.25f);
        pathBuilderA2.curveTo(7.25f, 15.66f, 6.41f, 16.5f, 5.38f, 16.5f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbudsBattery = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
