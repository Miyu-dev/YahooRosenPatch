package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emojiEvents", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiEvents", "Landroidx/compose/material/icons/Icons$Rounded;", "getEmojiEvents", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmojiEventsKt {
    private static ImageVector _emojiEvents;

    public static final ImageVector getEmojiEvents(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _emojiEvents;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiEvents", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(19.0f, 5.0f, -2.0f, 4.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.horizontalLineTo(8.0f);
        pathBuilderT.curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        pathBuilderT.verticalLineToRelative(1.0f);
        pathBuilderT.horizontalLineTo(5.0f);
        pathBuilderT.curveTo(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        pathBuilderT.verticalLineToRelative(1.0f);
        pathBuilderT.curveToRelative(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        pathBuilderT.curveToRelative(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        pathBuilderT.verticalLineTo(19.0f);
        pathBuilderT.horizontalLineTo(8.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderT.horizontalLineToRelative(8.0f);
        pathBuilderT.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.horizontalLineToRelative(-3.0f);
        pathBuilderT.verticalLineToRelative(-3.1f);
        pathBuilderT.curveToRelative(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        pathBuilderT.curveTo(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        pathBuilderT.verticalLineTo(7.0f);
        pathBuilderT.curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        h.B(pathBuilderT, 5.0f, 8.0f, 7.0f, 2.0f);
        pathBuilderT.verticalLineToRelative(3.82f);
        pathBuilderT.curveTo(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        pathBuilderT.close();
        pathBuilderT.moveTo(19.0f, 8.0f);
        pathBuilderT.curveToRelative(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.q(pathBuilderT, 7.0f, 2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEvents = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
