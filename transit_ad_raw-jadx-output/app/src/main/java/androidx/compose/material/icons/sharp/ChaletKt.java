package androidx.compose.material.icons.sharp;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$Sharp;", "getChalet", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Chalet", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.0f, 7.5f, 7.5f, 7.5f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        androidx.appcompat.app.m.r(pathBuilderA, 15.0f, 15.33f, 20.0f, -4.0f);
        androidx.appcompat.app.m.z(pathBuilderA, -5.0f, 9.0f, 5.0f, 5.0f);
        pathBuilderA.verticalLineToRelative(-4.67f);
        pathBuilderA.lineToRelative(-1.09f, 1.09f);
        a.C(pathBuilderA, 2.5f, 15.0f, 10.0f, 7.5f);
        pathBuilderA.moveTo(22.0f, 6.5f);
        pathBuilderA.horizontalLineToRelative(-1.19f);
        pathBuilderA.lineToRelative(0.75f, -0.75f);
        pathBuilderA.lineToRelative(-0.71f, -0.71f);
        v.A(pathBuilderA, 19.39f, 6.5f, 18.5f, 5.61f);
        pathBuilderA.lineToRelative(1.45f, -1.45f);
        pathBuilderA.lineToRelative(-0.71f, -0.71f);
        androidx.appcompat.app.m.r(pathBuilderA, 18.5f, 4.19f, 3.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(1.19f);
        pathBuilderA.lineToRelative(-0.75f, -0.75f);
        pathBuilderA.lineToRelative(-0.71f, 0.71f);
        s.D(pathBuilderA, 1.45f, 1.45f, 6.5f, -0.89f);
        pathBuilderA.lineToRelative(-1.45f, -1.45f);
        pathBuilderA.lineToRelative(-0.71f, 0.71f);
        androidx.compose.animation.a.r(pathBuilderA, 0.75f, 0.75f, 14.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(1.19f);
        pathBuilderA.lineToRelative(-0.75f, 0.75f);
        pathBuilderA.lineToRelative(0.71f, 0.71f);
        androidx.browser.browseractions.a.C(pathBuilderA, 1.45f, -1.45f, 0.89f, 0.89f);
        pathBuilderA.lineToRelative(-1.45f, 1.45f);
        pathBuilderA.lineToRelative(0.71f, 0.71f);
        s.D(pathBuilderA, 0.75f, -0.75f, 11.0f, 1.0f);
        pathBuilderA.verticalLineTo(9.81f);
        pathBuilderA.lineToRelative(0.75f, 0.75f);
        pathBuilderA.lineToRelative(0.71f, -0.71f);
        androidx.appcompat.app.m.r(pathBuilderA, 18.5f, 8.39f, 7.5f, 0.89f);
        pathBuilderA.lineToRelative(1.45f, 1.45f);
        pathBuilderA.lineToRelative(0.71f, -0.71f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.e(pathBuilderA, 20.81f, 7.5f, 22.0f, 6.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
