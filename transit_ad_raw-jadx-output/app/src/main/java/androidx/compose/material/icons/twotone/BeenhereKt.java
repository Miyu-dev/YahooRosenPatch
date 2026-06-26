package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: Beenhere.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_beenhere", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Beenhere", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBeenhere", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BeenhereKt {
    private static ImageVector _beenhere;

    public static final ImageVector getBeenhere(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _beenhere;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Beenhere", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(19.0f, 3.0f, 5.0f, 3.0f, 12.93f);
        pathBuilderB.lineToRelative(7.0f, 4.66f);
        s.r(pathBuilderB, 7.0f, -4.67f, 19.0f, 3.0f);
        pathBuilderB.moveTo(10.0f, 16.0f);
        pathBuilderB.lineToRelative(-4.0f, -4.0f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.lineToRelative(2.58f, 2.58f);
        pathBuilderB.lineToRelative(6.59f, -6.59f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderB, 18.0f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(19.0f, 1.0f, 5.0f, 1.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.lineTo(3.0f, 15.93f);
        pathBuilderA.curveToRelative(0.0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f);
        pathBuilderA.lineTo(12.0f, 23.0f);
        pathBuilderA.lineToRelative(8.11f, -5.41f);
        pathBuilderA.curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f);
        pathBuilderA.lineTo(21.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 12.0f, 20.6f, -7.0f, -4.66f);
        androidx.compose.animation.a.o(pathBuilderA, 5.0f, 3.0f, 14.0f, 12.93f);
        android.support.v4.media.a.t(pathBuilderA, -7.0f, 4.67f, 9.99f, 13.18f);
        pathBuilderA.lineToRelative(-2.58f, -2.59f);
        pathBuilderA.lineTo(6.0f, 12.0f);
        pathBuilderA.lineToRelative(4.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 8.0f, -8.0f, -1.42f, -1.42f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beenhere = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
