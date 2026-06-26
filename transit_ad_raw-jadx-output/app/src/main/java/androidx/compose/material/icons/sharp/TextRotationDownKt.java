package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: TextRotationDown.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_textRotationDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotationDown", "Landroidx/compose/material/icons/Icons$Sharp;", "getTextRotationDown", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TextRotationDown", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(6.0f, 20.0f, 3.0f, -3.0f);
        pathBuilderA.lineTo(7.0f, 17.0f);
        pathBuilderA.lineTo(7.0f, 4.0f);
        pathBuilderA.lineTo(5.0f, 4.0f);
        pathBuilderA.verticalLineToRelative(13.0f);
        a.A(pathBuilderA, 3.0f, 17.0f, 3.0f, 3.0f);
        pathBuilderA.moveTo(12.2f, 8.5f);
        a.q(pathBuilderA, 5.0f, -2.2f, 0.9f, 2.1f);
        pathBuilderA.lineToRelative(11.0f, -4.75f);
        v.y(pathBuilderA, -1.5f, 10.0f, 5.5f, 2.1f);
        android.support.v4.media.a.t(pathBuilderA, 2.2f, 0.9f, 19.02f, 11.0f);
        pathBuilderA.lineTo(14.0f, 12.87f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 14.0f, 9.13f, 19.02f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationDown = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
