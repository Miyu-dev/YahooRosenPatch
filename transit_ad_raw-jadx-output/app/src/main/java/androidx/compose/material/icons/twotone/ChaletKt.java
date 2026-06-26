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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Chalet.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$TwoTone;", "getChalet", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Chalet", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.0f, 18.0f, -2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -3.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 3.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -4.67f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 3.0f, -3.0f, 3.0f, 3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(17.5f, 15.0f, 10.0f, 7.5f);
        pathBuilderA2.lineTo(2.5f, 15.0f);
        pathBuilderA2.lineToRelative(1.41f, 1.41f);
        androidx.appcompat.app.m.r(pathBuilderA2, 5.0f, 15.33f, 20.0f, 10.0f);
        pathBuilderA2.verticalLineToRelative(-4.67f);
        s.r(pathBuilderA2, 1.09f, 1.09f, 17.5f, 15.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA2, 13.0f, 18.0f, -2.0f, -3.0f);
        s.B(pathBuilderA2, 9.0f, 3.0f, 7.0f, -4.67f);
        pathBuilderA2.lineToRelative(3.0f, -3.0f);
        c.a.g(pathBuilderA2, 3.0f, 3.0f, 18.0f);
        pathBuilderA2.moveTo(22.0f, 7.5f);
        pathBuilderA2.horizontalLineToRelative(-1.19f);
        pathBuilderA2.lineToRelative(0.75f, 0.75f);
        pathBuilderA2.lineToRelative(-0.71f, 0.71f);
        h.n(pathBuilderA2, 19.39f, 7.5f, 18.5f, 0.89f);
        pathBuilderA2.lineToRelative(1.45f, 1.45f);
        pathBuilderA2.lineToRelative(-0.71f, 0.71f);
        androidx.appcompat.app.m.r(pathBuilderA2, 18.5f, 9.81f, 11.0f, -1.0f);
        pathBuilderA2.verticalLineTo(9.81f);
        pathBuilderA2.lineToRelative(-0.75f, 0.75f);
        pathBuilderA2.lineToRelative(-0.71f, -0.71f);
        s.D(pathBuilderA2, 1.45f, -1.45f, 7.5f, -0.89f);
        pathBuilderA2.lineToRelative(-1.45f, 1.45f);
        pathBuilderA2.lineToRelative(-0.71f, -0.71f);
        androidx.compose.animation.a.r(pathBuilderA2, 0.75f, -0.75f, 14.0f, -1.0f);
        pathBuilderA2.horizontalLineToRelative(1.19f);
        pathBuilderA2.lineToRelative(-0.75f, -0.75f);
        pathBuilderA2.lineToRelative(0.71f, -0.71f);
        androidx.appcompat.view.menu.a.D(pathBuilderA2, 1.45f, 1.45f, 0.89f, 5.61f);
        pathBuilderA2.lineToRelative(-1.45f, -1.45f);
        pathBuilderA2.lineToRelative(0.71f, -0.71f);
        s.D(pathBuilderA2, 0.75f, 0.75f, 3.0f, 1.0f);
        pathBuilderA2.verticalLineToRelative(1.19f);
        pathBuilderA2.lineToRelative(0.75f, -0.75f);
        pathBuilderA2.lineToRelative(0.71f, 0.71f);
        androidx.appcompat.app.m.r(pathBuilderA2, 18.5f, 5.61f, 6.5f, 0.89f);
        pathBuilderA2.lineToRelative(1.45f, -1.45f);
        pathBuilderA2.lineToRelative(0.71f, 0.71f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.e(pathBuilderA2, 20.81f, 6.5f, 22.0f, 7.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
