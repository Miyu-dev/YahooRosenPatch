package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.b;
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Dangerous.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dangerous", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dangerous", "Landroidx/compose/material/icons/Icons$Outlined;", "getDangerous", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Dangerous", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.73f, 3.0f, 8.27f, 3.0f, 8.27f);
        f.d(pathBuilderA, 7.46f, 8.27f, 21.0f, 7.46f);
        pathBuilderA.lineTo(21.0f, 15.73f);
        h.u(pathBuilderA, 8.27f, 15.73f, 3.0f);
        pathBuilderA.moveTo(19.0f, 14.9f);
        pathBuilderA.lineTo(14.9f, 19.0f);
        pathBuilderA.horizontalLineTo(9.1f);
        pathBuilderA.lineTo(5.0f, 14.9f);
        pathBuilderA.verticalLineTo(9.1f);
        pathBuilderA.lineTo(9.1f, 5.0f);
        pathBuilderA.horizontalLineToRelative(5.8f);
        pathBuilderA.lineTo(19.0f, 9.1f);
        pathBuilderA.verticalLineTo(14.9f);
        pathBuilderA.close();
        pathBuilderA.moveTo(14.83f, 7.76f);
        pathBuilderA.lineTo(12.0f, 10.59f);
        pathBuilderA.lineTo(9.17f, 7.76f);
        pathBuilderA.lineTo(7.76f, 9.17f);
        pathBuilderA.lineTo(10.59f, 12.0f);
        pathBuilderA.lineToRelative(-2.83f, 2.83f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineTo(12.0f, 13.41f);
        pathBuilderA.lineToRelative(2.83f, 2.83f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        pathBuilderA.lineTo(13.41f, 12.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 2.83f, -2.83f, 14.83f, 7.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
