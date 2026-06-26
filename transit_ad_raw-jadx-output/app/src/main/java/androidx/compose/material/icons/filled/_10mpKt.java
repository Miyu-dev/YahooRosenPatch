package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: _10mp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__10mp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_10mp", "Landroidx/compose/material/icons/Icons$Filled;", "get_10mp", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _10mpKt {
    private static ImageVector __10mp;

    public static final ImageVector get_10mp(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = __10mp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._10mp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(13.5f, 7.0f, 15.0f, 7.0f, 3.0f);
        b.q(pathBuilderB, -1.5f, 19.0f, 3.0f);
        pathBuilderB.lineTo(5.0f, 3.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.lineTo(21.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.j(pathBuilderB, 12.0f, 18.5f, -1.5f);
        androidx.compose.animation.a.o(pathBuilderB, 10.5f, 14.0f, -1.0f, 3.0f);
        pathBuilderB.lineTo(8.0f, 17.0f);
        v.y(pathBuilderB, -3.0f, 7.0f, 14.0f, 4.5f);
        pathBuilderB.lineTo(5.5f, 18.5f);
        pathBuilderB.verticalLineToRelative(-5.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.lineTo(11.0f, 12.5f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        android.support.v4.media.a.v(pathBuilderB, 5.0f, 15.5f, 18.5f);
        a.b.s(pathBuilderB, 14.0f, 18.5f, -6.0f, 3.5f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.lineTo(18.5f, 16.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.z(pathBuilderB, -2.0f, 1.5f, 10.0f, 5.5f);
        pathBuilderB.verticalLineToRelative(6.0f);
        pathBuilderB.lineTo(8.5f, 11.5f);
        pathBuilderB.lineTo(8.5f, 7.0f);
        pathBuilderB.lineTo(7.0f, 7.0f);
        h.m(pathBuilderB, 7.0f, 5.5f, 3.0f);
        pathBuilderB.moveTo(16.5f, 10.5f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.lineTo(13.0f, 11.5f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(-4.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderB.horizontalLineToRelative(2.5f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        android.support.v4.media.a.v(pathBuilderB, 4.0f, 15.5f, 14.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.j(pathBuilderB, 17.0f, 14.0f, 1.5f, -1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __10mp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
