package androidx.compose.material.icons.sharp;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LayersClear.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_layersClear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LayersClear", "Landroidx/compose/material/icons/Icons$Sharp;", "getLayersClear", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LayersClear", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.0f, 9.0f, -9.0f, -7.0f);
        a.n(pathBuilderA, -2.59f, 2.02f, 7.87f, 7.87f);
        pathBuilderA.moveTo(21.0f, 14.07f);
        pathBuilderA.lineToRelative(-1.63f, -1.27f);
        a.n(pathBuilderA, -0.67f, 0.52f, 1.43f, 1.43f);
        pathBuilderA.moveTo(3.41f, 0.86f);
        pathBuilderA.lineTo(2.0f, 2.27f);
        pathBuilderA.lineToRelative(4.22f, 4.22f);
        pathBuilderA.lineTo(3.0f, 9.0f);
        pathBuilderA.lineToRelative(9.0f, 7.0f);
        pathBuilderA.lineToRelative(2.1f, -1.63f);
        pathBuilderA.lineToRelative(1.42f, 1.42f);
        pathBuilderA.lineToRelative(-3.53f, 2.75f);
        pathBuilderA.lineToRelative(-7.37f, -5.73f);
        pathBuilderA.lineTo(3.0f, 14.07f);
        pathBuilderA.lineToRelative(9.0f, 7.0f);
        pathBuilderA.lineToRelative(4.95f, -3.85f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderA, 20.73f, 21.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
