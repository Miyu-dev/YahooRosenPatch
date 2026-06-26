package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: _8k.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__8k", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_8k", "Landroidx/compose/material/icons/Icons$Filled;", "get_8k", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _8kKt {
    private static ImageVector __8k;

    public static final ImageVector get_8k(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = __8k;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._8k", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(8.0f, 12.5f, 1.5f, 9.5f, 14.0f);
        a.z(pathBuilderC, 8.0f, 14.0f, 8.0f, 10.0f);
        androidx.appcompat.app.m.C(pathBuilderC, 1.5f, 1.5f, 8.0f, 11.5f);
        pathBuilderC.moveTo(19.0f, 3.0f);
        pathBuilderC.lineTo(5.0f, 3.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(14.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(14.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.lineTo(21.0f, 5.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(11.0f, 14.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderC.lineTo(7.5f, 15.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.verticalLineToRelative(-4.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.lineTo(10.0f, 9.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderC, 4.0f, 18.0f, 15.0f, -1.75f);
        pathBuilderC.lineToRelative(-1.75f, -2.25f);
        pathBuilderC.lineTo(14.5f, 15.0f);
        pathBuilderC.lineTo(13.0f, 15.0f);
        androidx.compose.animation.a.o(pathBuilderC, 13.0f, 9.0f, 1.5f, 2.25f);
        pathBuilderC.lineTo(16.25f, 9.0f);
        pathBuilderC.lineTo(18.0f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderC, -2.25f, 3.0f, 18.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __8k = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
