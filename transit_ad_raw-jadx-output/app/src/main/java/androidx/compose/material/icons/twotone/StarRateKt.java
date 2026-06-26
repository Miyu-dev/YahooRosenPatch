package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: StarRate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_starRate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StarRate", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStarRate", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StarRateKt {
    private static ImageVector _starRate;

    public static final ImageVector getStarRate(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _starRate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.StarRate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.94f, 12.0f, -0.94f, -3.11f);
        pathBuilderA.lineToRelative(-0.94f, 3.11f);
        pathBuilderA.lineToRelative(-2.82f, 0.0f);
        pathBuilderA.lineToRelative(2.27f, 1.62f);
        pathBuilderA.lineToRelative(-0.93f, 3.01f);
        pathBuilderA.lineToRelative(2.42f, -1.84f);
        pathBuilderA.lineToRelative(2.42f, 1.84f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, -0.93f, -3.01f, 2.27f, -1.62f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(22.0f, 10.0f, -7.58f, 12.0f, 2.0f);
        pathBuilderC.lineToRelative(-2.42f, 8.0f);
        pathBuilderC.horizontalLineTo(2.0f);
        pathBuilderC.lineToRelative(6.17f, 4.41f);
        pathBuilderC.lineTo(5.83f, 22.0f);
        pathBuilderC.lineTo(12.0f, 17.31f);
        pathBuilderC.lineTo(18.17f, 22.0f);
        s.r(pathBuilderC, -2.35f, -7.59f, 22.0f, 10.0f);
        pathBuilderC.moveTo(14.42f, 16.63f);
        pathBuilderC.lineTo(12.0f, 14.79f);
        pathBuilderC.lineToRelative(-2.42f, 1.84f);
        pathBuilderC.lineToRelative(0.93f, -3.01f);
        pathBuilderC.lineTo(8.24f, 12.0f);
        pathBuilderC.horizontalLineToRelative(2.82f);
        pathBuilderC.lineTo(12.0f, 8.89f);
        pathBuilderC.lineTo(12.94f, 12.0f);
        pathBuilderC.horizontalLineToRelative(2.82f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderC, -2.27f, 1.62f, 14.42f, 16.63f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starRate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
