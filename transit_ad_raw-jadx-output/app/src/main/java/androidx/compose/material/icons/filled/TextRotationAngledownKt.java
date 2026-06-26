package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: TextRotationAngledown.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_textRotationAngledown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotationAngledown", "Landroidx/compose/material/icons/Icons$Filled;", "getTextRotationAngledown", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextRotationAngledownKt {
    private static ImageVector _textRotationAngledown;

    public static final ImageVector getTextRotationAngledown(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _textRotationAngledown;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotationAngledown", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.4f, 4.91f, -1.06f, -1.06f);
        pathBuilderA.lineTo(7.2f, 8.27f);
        pathBuilderA.lineToRelative(1.48f, 1.48f);
        pathBuilderA.lineToRelative(2.19f, -0.92f);
        pathBuilderA.lineToRelative(3.54f, 3.54f);
        pathBuilderA.lineToRelative(-0.92f, 2.19f);
        s.r(pathBuilderA, 1.48f, 1.48f, 19.4f, 4.91f);
        pathBuilderA.moveTo(12.59f, 8.01f);
        pathBuilderA.lineToRelative(4.87f, -2.23f);
        a.n(pathBuilderA, -2.23f, 4.87f, -2.64f, -2.64f);
        pathBuilderA.moveTo(14.27f, 21.0f);
        pathBuilderA.verticalLineToRelative(-4.24f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineToRelative(-8.84f, -8.84f);
        pathBuilderA.lineToRelative(-1.42f, 1.42f);
        pathBuilderA.lineToRelative(8.84f, 8.84f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderA, 10.03f, 21.0f, 4.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngledown = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
