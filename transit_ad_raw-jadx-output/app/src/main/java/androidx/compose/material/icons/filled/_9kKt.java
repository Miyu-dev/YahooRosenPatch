package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: _9k.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__9k", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_9k", "Landroidx/compose/material/icons/Icons$Filled;", "get_9k", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _9kKt {
    private static ImageVector __9k;

    public static final ImageVector get_9k(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = __9k;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._9k", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(8.0f, 10.0f, 1.5f, 1.5f);
        a.z(pathBuilderO, 8.0f, 11.5f, 19.0f, 3.0f);
        pathBuilderO.lineTo(5.0f, 3.0f);
        pathBuilderO.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderO.verticalLineToRelative(14.0f);
        pathBuilderO.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderO.horizontalLineToRelative(14.0f);
        pathBuilderO.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderO.lineTo(21.0f, 5.0f);
        pathBuilderO.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderO.close();
        pathBuilderO.moveTo(11.0f, 14.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.s(pathBuilderO, 6.5f, 15.0f, -1.5f, 3.0f);
        pathBuilderO.verticalLineToRelative(-1.0f);
        pathBuilderO.horizontalLineToRelative(-2.0f);
        pathBuilderO.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderO.lineTo(6.5f, 10.0f);
        pathBuilderO.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderO.lineTo(10.0f, 9.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderO, 4.0f, 18.0f, 15.0f, -1.75f);
        pathBuilderO.lineToRelative(-1.75f, -2.25f);
        pathBuilderO.lineTo(14.5f, 15.0f);
        pathBuilderO.lineTo(13.0f, 15.0f);
        androidx.compose.animation.a.o(pathBuilderO, 13.0f, 9.0f, 1.5f, 2.25f);
        pathBuilderO.lineTo(16.25f, 9.0f);
        pathBuilderO.lineTo(18.0f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderO, -2.25f, 3.0f, 18.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __9k = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
