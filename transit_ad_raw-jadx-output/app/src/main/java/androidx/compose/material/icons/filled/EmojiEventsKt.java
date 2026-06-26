package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EmojiEvents.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emojiEvents", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiEvents", "Landroidx/compose/material/icons/Icons$Filled;", "getEmojiEvents", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmojiEventsKt {
    private static ImageVector _emojiEvents;

    public static final ImageVector getEmojiEvents(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _emojiEvents;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EmojiEvents", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(19.0f, 5.0f, -2.0f, 3.0f, 7.0f);
        pathBuilderQ.verticalLineToRelative(2.0f);
        pathBuilderQ.horizontalLineTo(5.0f);
        pathBuilderQ.curveTo(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        pathBuilderQ.verticalLineToRelative(1.0f);
        pathBuilderQ.curveToRelative(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        pathBuilderQ.curveToRelative(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        b.x(pathBuilderQ, 19.0f, 7.0f, 2.0f, 10.0f);
        a.m(pathBuilderQ, -2.0f, -4.0f, -3.1f);
        pathBuilderQ.curveToRelative(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        pathBuilderQ.curveTo(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        pathBuilderQ.verticalLineTo(7.0f);
        pathBuilderQ.curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        h.B(pathBuilderQ, 5.0f, 8.0f, 7.0f, 2.0f);
        pathBuilderQ.verticalLineToRelative(3.82f);
        pathBuilderQ.curveTo(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        pathBuilderQ.close();
        pathBuilderQ.moveTo(19.0f, 8.0f);
        pathBuilderQ.curveToRelative(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.q(pathBuilderQ, 7.0f, 2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEvents = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
