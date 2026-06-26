package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: Forest.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_forest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forest", "Landroidx/compose/material/icons/Icons$TwoTone;", "getForest", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Forest", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.48f, 10.0f, 1.68f, 0.0f);
        pathBuilderA.lineToRelative(-3.16f, -4.51f);
        pathBuilderA.lineToRelative(-1.78f, 2.54f);
        pathBuilderA.lineToRelative(2.78f, 3.97f);
        pathBuilderA.lineToRelative(-1.86f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 2.57f, 4.0f, 3.63f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(12.16f, 10.0f, -3.16f, -4.51f);
        pathBuilderA2.lineToRelative(-3.16f, 4.51f);
        pathBuilderA2.lineToRelative(1.68f, 0.0f);
        pathBuilderA2.lineToRelative(-3.86f, 6.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA2, 10.68f, 0.0f, -3.86f, -6.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = c.b.a(20.14f, 12.0f, 22.0f, 15.0f, 2.0f);
        pathBuilderA3.lineToRelative(-3.0f, 4.29f);
        pathBuilderA3.lineTo(9.0f, 2.0f);
        pathBuilderA3.lineTo(2.0f, 12.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA3, 1.86f, 0.0f, 18.0f, 7.0f);
        androidx.browser.browseractions.a.l(pathBuilderA3, 4.0f, 4.0f, -4.0f, 2.0f);
        androidx.browser.browseractions.a.l(pathBuilderA3, 4.0f, 4.0f, -4.0f, 7.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA3, 20.14f, 12.0f, 3.66f, 16.0f);
        pathBuilderA3.lineToRelative(3.86f, -6.0f);
        pathBuilderA3.horizontalLineTo(5.84f);
        pathBuilderA3.lineTo(9.0f, 5.49f);
        pathBuilderA3.lineTo(12.16f, 10.0f);
        b.A(pathBuilderA3, -1.68f, 3.86f, 6.0f, 3.66f);
        pathBuilderA3.moveTo(16.71f, 16.0f);
        pathBuilderA3.lineToRelative(-2.57f, -4.0f);
        pathBuilderA3.horizontalLineTo(16.0f);
        pathBuilderA3.lineToRelative(-2.78f, -3.97f);
        pathBuilderA3.lineTo(15.0f, 5.49f);
        pathBuilderA3.lineTo(18.16f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.p(pathBuilderA3, -1.68f, 3.86f, 6.0f, 16.71f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
