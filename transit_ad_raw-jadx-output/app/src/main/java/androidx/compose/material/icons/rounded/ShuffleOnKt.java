package androidx.compose.material.icons.rounded;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ShuffleOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shuffleOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShuffleOn", "Landroidx/compose/material/icons/Icons$Rounded;", "getShuffleOn", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShuffleOnKt {
    private static ImageVector _shuffleOn;

    public static final ImageVector getShuffleOn(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _shuffleOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShuffleOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 1.0f, 3.0f);
        pathBuilderB.curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f);
        pathBuilderB.verticalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(3.0f);
        pathBuilderB.curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(4.3f, 4.7f);
        pathBuilderB.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderB.lineToRelative(4.47f, 4.47f);
        pathBuilderB.lineToRelative(-1.42f, 1.4f);
        pathBuilderB.lineTo(4.3f, 6.11f);
        pathBuilderB.curveTo(3.91f, 5.72f, 3.91f, 5.09f, 4.3f, 4.7f);
        pathBuilderB.close();
        pathBuilderB.moveTo(19.59f, 19.5f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderB.horizontalLineTo(15.3f);
        pathBuilderB.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.36f, -0.85f);
        pathBuilderB.lineToRelative(1.2f, -1.2f);
        pathBuilderB.lineToRelative(-3.13f, -3.13f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.lineToRelative(3.13f, 3.14f);
        pathBuilderB.lineToRelative(1.19f, -1.19f);
        pathBuilderB.curveToRelative(0.31f, -0.32f, 0.85f, -0.1f, 0.85f, 0.35f);
        a.y(pathBuilderB, 19.5f, 19.59f, 8.29f);
        pathBuilderB.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f);
        pathBuilderB.lineToRelative(-1.19f, -1.19f);
        pathBuilderB.lineTo(5.7f, 19.29f);
        pathBuilderB.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderB.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderB.lineTo(16.13f, 6.04f);
        pathBuilderB.lineToRelative(-1.19f, -1.19f);
        pathBuilderB.curveTo(14.63f, 4.54f, 14.85f, 4.0f, 15.3f, 4.0f);
        pathBuilderB.horizontalLineToRelative(3.79f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderB, 8.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shuffleOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
