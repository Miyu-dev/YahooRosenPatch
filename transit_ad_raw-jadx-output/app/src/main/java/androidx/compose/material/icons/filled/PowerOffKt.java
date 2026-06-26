package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: PowerOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_powerOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PowerOff", "Landroidx/compose/material/icons/Icons$Filled;", "getPowerOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PowerOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.0f, 14.49f, 18.0f, 9.0f);
        pathBuilderA.curveToRelative(0.0f, -1.0f, -1.01f, -2.01f, -2.0f, -2.0f);
        a.o(pathBuilderA, 16.0f, 3.0f, -2.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(-4.0f);
        pathBuilderA.lineTo(10.0f, 3.0f);
        pathBuilderA.lineTo(8.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(2.48f);
        android.support.v4.media.a.n(pathBuilderA, 9.51f, 9.5f, 0.49f, -0.49f);
        pathBuilderA.moveTo(16.24f, 16.26f);
        pathBuilderA.lineTo(7.2f, 7.2f);
        pathBuilderA.lineToRelative(-0.01f, 0.01f);
        pathBuilderA.lineTo(3.98f, 4.0f);
        pathBuilderA.lineTo(2.71f, 5.25f);
        pathBuilderA.lineToRelative(3.36f, 3.36f);
        pathBuilderA.curveTo(6.04f, 8.74f, 6.0f, 8.87f, 6.0f, 9.0f);
        v.y(pathBuilderA, 5.48f, 9.5f, 18.0f, 3.0f);
        s.s(pathBuilderA, 5.0f, -3.0f, 0.48f, -0.48f);
        pathBuilderA.lineTo(19.45f, 22.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 1.26f, -1.28f, -4.47f, -4.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
