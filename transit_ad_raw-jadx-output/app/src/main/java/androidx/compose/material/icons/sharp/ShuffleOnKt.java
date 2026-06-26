package androidx.compose.material.icons.sharp;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ShuffleOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shuffleOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShuffleOn", "Landroidx/compose/material/icons/Icons$Sharp;", "getShuffleOn", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShuffleOnKt {
    private static ImageVector _shuffleOn;

    public static final ImageVector getShuffleOn(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _shuffleOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ShuffleOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(1.0f, 1.0f, 22.0f, 22.0f, 1.0f);
        b.w(pathBuilderV, 1.0f, 5.41f, 4.0f);
        pathBuilderV.lineToRelative(5.18f, 5.17f);
        pathBuilderV.lineToRelative(-1.42f, 1.41f);
        a.C(pathBuilderV, 4.0f, 5.41f, 5.41f, 4.0f);
        pathBuilderV.moveTo(20.0f, 20.0f);
        pathBuilderV.horizontalLineToRelative(-5.5f);
        pathBuilderV.lineToRelative(2.05f, -2.05f);
        pathBuilderV.lineToRelative(-3.13f, -3.13f);
        pathBuilderV.lineToRelative(1.41f, -1.41f);
        pathBuilderV.lineToRelative(3.13f, 3.13f);
        h.y(pathBuilderV, 20.0f, 14.5f, 20.0f);
        pathBuilderV.moveTo(20.0f, 9.5f);
        pathBuilderV.lineToRelative(-2.04f, -2.04f);
        pathBuilderV.lineTo(5.41f, 20.0f);
        pathBuilderV.lineTo(4.0f, 18.59f);
        pathBuilderV.lineTo(16.54f, 6.04f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.e(pathBuilderV, 14.5f, 4.0f, 20.0f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shuffleOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
