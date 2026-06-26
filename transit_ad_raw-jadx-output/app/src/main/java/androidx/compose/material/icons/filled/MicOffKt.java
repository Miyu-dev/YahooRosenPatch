package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: MicOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_micOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MicOff", "Landroidx/compose/material/icons/Icons$Filled;", "getMicOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MicOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(19.0f, 11.0f, -1.7f);
        pathBuilderB.curveToRelative(0.0f, 0.74f, -0.16f, 1.43f, -0.43f, 2.05f);
        pathBuilderB.lineToRelative(1.23f, 1.23f);
        pathBuilderB.curveToRelative(0.56f, -0.98f, 0.9f, -2.09f, 0.9f, -3.28f);
        pathBuilderB.close();
        pathBuilderB.moveTo(14.98f, 11.17f);
        pathBuilderB.curveToRelative(0.0f, -0.06f, 0.02f, -0.11f, 0.02f, -0.17f);
        pathBuilderB.lineTo(15.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderB.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        v.v(pathBuilderB, 0.18f, 5.98f, 5.99f);
        pathBuilderB.moveTo(4.27f, 3.0f);
        pathBuilderB.lineTo(3.0f, 4.27f);
        pathBuilderB.lineToRelative(6.01f, 6.01f);
        pathBuilderB.lineTo(9.01f, 11.0f);
        pathBuilderB.curveToRelative(0.0f, 1.66f, 1.33f, 3.0f, 2.99f, 3.0f);
        pathBuilderB.curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        pathBuilderB.lineToRelative(1.66f, 1.66f);
        pathBuilderB.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        pathBuilderB.curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
        pathBuilderB.lineTo(5.0f, 11.0f);
        pathBuilderB.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        a.o(pathBuilderB, 11.0f, 21.0f, 2.0f, -3.28f);
        pathBuilderB.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.54f, -0.9f);
        pathBuilderB.lineTo(19.73f, 21.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB, 21.0f, 19.73f, 4.27f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
