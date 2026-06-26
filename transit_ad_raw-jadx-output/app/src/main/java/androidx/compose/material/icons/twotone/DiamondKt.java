package androidx.compose.material.icons.twotone;

import a6.h;
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

/* JADX INFO: compiled from: Diamond.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_diamond", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Diamond", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDiamond", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DiamondKt {
    private static ImageVector _diamond;

    public static final ImageVector getDiamond(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _diamond;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Diamond", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(8.88f, 5.0f, -2.64f, 0.0f), -1.5f, 3.0f, 2.64f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(19.26f, 8.0f, -1.5f, -3.0f), -2.64f, 0.0f, 1.5f, 3.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(b.a(11.0f, 16.68f, 0.0f, -6.68f), -5.56f, 0.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(b.a(13.0f, 16.68f, 5.56f, -6.68f), -5.56f, 0.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(12.88f, 5.0f, -1.76f, 0.0f), -1.5f, 3.0f, 4.76f, 0.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = c.b.a(19.0f, 3.0f, 5.0f, 2.0f, 9.0f);
        pathBuilderA.lineToRelative(10.0f, 12.0f);
        android.support.v4.media.a.C(pathBuilderA, 22.0f, 9.0f, 19.0f, 3.0f);
        pathBuilderA.moveTo(17.76f, 5.0f);
        pathBuilderA.lineToRelative(1.5f, 3.0f);
        b.A(pathBuilderA, -2.65f, -1.5f, -3.0f, 17.76f);
        pathBuilderA.moveTo(6.24f, 5.0f);
        androidx.compose.animation.a.C(pathBuilderA, 2.65f, -1.5f, 3.0f, 4.74f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 6.24f, 5.0f, 11.0f, 16.68f);
        pathBuilderA.lineTo(5.44f, 10.0f);
        pathBuilderA.horizontalLineTo(11.0f);
        pathBuilderA.verticalLineTo(16.68f);
        pathBuilderA.close();
        pathBuilderA.moveTo(9.62f, 8.0f);
        pathBuilderA.lineToRelative(1.5f, -3.0f);
        b.A(pathBuilderA, 1.76f, 1.5f, 3.0f, 9.62f);
        h.D(pathBuilderA, 13.0f, 16.68f, 10.0f, 5.56f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 13.0f, 16.68f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _diamond = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
