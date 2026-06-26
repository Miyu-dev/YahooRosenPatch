package androidx.compose.material.icons.twotone;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LayersClear.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_layersClear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LayersClear", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLayersClear", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LayersClear", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 13.47f, 0.67f, -0.53f);
        s.r(pathBuilderA, -5.02f, -5.02f, 6.26f, 9.0f);
        pathBuilderA.moveTo(12.0f, 4.53f);
        pathBuilderA.lineToRelative(-1.17f, 0.91f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 5.02f, 5.03f, 17.74f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(12.0f, 4.53f, 17.74f, 9.0f);
        pathBuilderA2.lineToRelative(-1.89f, 1.47f);
        pathBuilderA2.lineToRelative(1.43f, 1.42f);
        pathBuilderA2.lineTo(21.0f, 9.0f);
        pathBuilderA2.lineToRelative(-9.0f, -7.0f);
        a.n(pathBuilderA2, -2.59f, 2.02f, 1.42f, 1.42f);
        pathBuilderA2.moveTo(21.0f, 14.07f);
        pathBuilderA2.lineToRelative(-1.63f, -1.27f);
        a.n(pathBuilderA2, -0.67f, 0.52f, 1.43f, 1.43f);
        pathBuilderA2.moveTo(3.41f, 0.86f);
        pathBuilderA2.lineTo(2.0f, 2.27f);
        pathBuilderA2.lineToRelative(4.22f, 4.22f);
        pathBuilderA2.lineTo(3.0f, 9.0f);
        pathBuilderA2.lineToRelative(9.0f, 7.0f);
        pathBuilderA2.lineToRelative(2.1f, -1.63f);
        pathBuilderA2.lineToRelative(1.42f, 1.42f);
        pathBuilderA2.lineToRelative(-3.53f, 2.75f);
        pathBuilderA2.lineToRelative(-7.37f, -5.73f);
        pathBuilderA2.lineTo(3.0f, 14.07f);
        pathBuilderA2.lineToRelative(9.0f, 7.0f);
        pathBuilderA2.lineToRelative(4.95f, -3.85f);
        pathBuilderA2.lineTo(20.73f, 21.0f);
        s.r(pathBuilderA2, 1.41f, -1.41f, 3.41f, 0.86f);
        pathBuilderA2.moveTo(12.0f, 13.47f);
        pathBuilderA2.lineTo(6.26f, 9.0f);
        pathBuilderA2.lineToRelative(1.39f, -1.08f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, 5.02f, 5.02f, -0.67f, 0.53f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
