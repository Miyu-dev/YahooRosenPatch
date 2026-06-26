package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: TextRotationAngleup.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_textRotationAngleup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TextRotationAngleup", "Landroidx/compose/material/icons/Icons$Filled;", "getTextRotationAngleup", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextRotationAngleupKt {
    private static ImageVector _textRotationAngleup;

    public static final ImageVector getTextRotationAngleup(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotationAngleup", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.49f, 4.21f, 3.43f, 5.27f);
        pathBuilderA.lineTo(7.85f, 16.4f);
        pathBuilderA.lineToRelative(1.48f, -1.48f);
        pathBuilderA.lineToRelative(-0.92f, -2.19f);
        pathBuilderA.lineToRelative(3.54f, -3.54f);
        pathBuilderA.lineToRelative(2.19f, 0.92f);
        s.r(pathBuilderA, 1.48f, -1.48f, 4.49f, 4.21f);
        pathBuilderA.moveTo(7.58f, 11.01f);
        pathBuilderA.lineTo(5.36f, 6.14f);
        a.n(pathBuilderA, 4.87f, 2.23f, -2.65f, 2.64f);
        pathBuilderA.moveTo(20.57f, 9.33f);
        pathBuilderA.horizontalLineToRelative(-4.24f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(-8.84f, 8.84f);
        pathBuilderA.lineTo(10.32f, 21.0f);
        pathBuilderA.lineToRelative(8.84f, -8.84f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.41f, 1.41f, 20.57f, 9.33f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngleup = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
