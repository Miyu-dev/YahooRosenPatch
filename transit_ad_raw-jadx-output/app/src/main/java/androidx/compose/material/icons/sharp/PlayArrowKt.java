package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PlayArrow.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayArrow", "Landroidx/compose/material/icons/Icons$Sharp;", "getPlayArrow", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PlayArrowKt {
    private static ImageVector _playArrow;

    public static final ImageVector getPlayArrow(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(new ImageVector.Builder("Sharp.PlayArrow", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null), b.h(b.b(8.0f, 5.0f, 14.0f, 11.0f, -7.0f), 8.0f, 5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.INSTANCE.m3141getButtKaPHkGw(), StrokeJoin.INSTANCE.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
