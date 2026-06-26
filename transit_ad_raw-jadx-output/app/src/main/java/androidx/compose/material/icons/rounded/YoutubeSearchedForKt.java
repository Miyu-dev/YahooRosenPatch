package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: YoutubeSearchedFor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_youtubeSearchedFor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "YoutubeSearchedFor", "Landroidx/compose/material/icons/Icons$Rounded;", "getYoutubeSearchedFor", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class YoutubeSearchedForKt {
    private static ImageVector _youtubeSearchedFor;

    public static final ImageVector getYoutubeSearchedFor(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _youtubeSearchedFor;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.YoutubeSearchedFor", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(17.01f, 14.0f, -0.8f, -0.27f, -0.27f);
        pathBuilderA.curveToRelative(1.15f, -1.34f, 1.76f, -3.14f, 1.51f, -5.09f);
        pathBuilderA.curveTo(17.11f, 6.0f, 15.1f, 3.78f, 12.5f, 3.18f);
        pathBuilderA.curveTo(8.26f, 2.2f, 4.51f, 5.53f, 4.51f, 9.5f);
        pathBuilderA.horizontalLineToRelative(-2.1f);
        pathBuilderA.curveToRelative(-0.47f, 0.0f, -0.68f, 0.59f, -0.31f, 0.89f);
        pathBuilderA.lineToRelative(3.4f, 2.75f);
        pathBuilderA.curveToRelative(0.19f, 0.2f, 0.51f, 0.21f, 0.71f, 0.01f);
        pathBuilderA.lineToRelative(2.9f, -2.79f);
        pathBuilderA.curveToRelative(0.32f, -0.31f, 0.1f, -0.86f, -0.35f, -0.86f);
        pathBuilderA.horizontalLineTo(6.51f);
        pathBuilderA.curveToRelative(0.0f, -2.49f, 2.0f, -4.48f, 4.46f, -4.5f);
        pathBuilderA.curveToRelative(2.44f, -0.02f, 4.54f, 2.05f, 4.54f, 4.49f);
        pathBuilderA.curveToRelative(0.0f, 2.48f, -2.02f, 4.51f, -4.5f, 4.51f);
        pathBuilderA.curveToRelative(-0.45f, 0.0f, -0.89f, -0.07f, -1.3f, -0.19f);
        pathBuilderA.curveToRelative(-0.34f, -0.1f, -0.71f, 0.0f, -0.96f, 0.26f);
        pathBuilderA.curveToRelative(-0.53f, 0.53f, -0.32f, 1.45f, 0.39f, 1.66f);
        pathBuilderA.curveToRelative(0.59f, 0.17f, 1.22f, 0.27f, 1.87f, 0.27f);
        pathBuilderA.curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f);
        pathBuilderA.lineToRelative(0.27f, 0.27f);
        pathBuilderA.verticalLineToRelative(0.79f);
        pathBuilderA.lineToRelative(4.27f, 4.25f);
        pathBuilderA.curveToRelative(0.41f, 0.41f, 1.07f, 0.41f, 1.48f, 0.0f);
        pathBuilderA.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 17.01f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _youtubeSearchedFor = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
