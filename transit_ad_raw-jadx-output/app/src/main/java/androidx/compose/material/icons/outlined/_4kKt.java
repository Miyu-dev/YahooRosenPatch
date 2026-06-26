package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: _4k.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__4k", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_4k", "Landroidx/compose/material/icons/Icons$Outlined;", "get_4k", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _4kKt {
    private static ImageVector __4k;

    public static final ImageVector get_4k(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = __4k;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined._4k", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(21.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        a.t(pathBuilderA, 19.0f, 19.0f, 5.0f, 19.0f);
        s.w(pathBuilderA, 5.0f, 5.0f, 14.0f, 14.0f);
        pathBuilderA.moveTo(9.5f, 15.0f);
        b.s(pathBuilderA, 11.0f, 15.0f, -1.49f, 1.0f);
        pathBuilderA.lineTo(12.0f, 12.0f);
        pathBuilderA.horizontalLineToRelative(-1.0f);
        pathBuilderA.lineTo(11.0f, 9.0f);
        pathBuilderA.lineTo(9.5f, 9.0f);
        pathBuilderA.verticalLineToRelative(3.0f);
        pathBuilderA.lineTo(8.0f, 12.0f);
        pathBuilderA.lineTo(8.0f, 9.0f);
        c.a.k(pathBuilderA, 6.5f, 9.0f, 4.5f, 3.0f);
        pathBuilderA.moveTo(18.2f, 15.0f);
        pathBuilderA.lineToRelative(-2.0f, -3.0f);
        pathBuilderA.lineToRelative(2.0f, -3.0f);
        pathBuilderA.horizontalLineToRelative(-1.7f);
        android.support.v4.media.a.n(pathBuilderA, -2.0f, 3.0f, 2.0f, 3.0f);
        pathBuilderA.moveTo(14.5f, 12.0f);
        pathBuilderA.lineTo(14.5f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.j(pathBuilderA, 13.0f, 9.0f, 6.0f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4k = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
