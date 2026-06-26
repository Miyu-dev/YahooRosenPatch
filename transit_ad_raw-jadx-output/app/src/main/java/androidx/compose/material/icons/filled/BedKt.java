package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Bed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Bed", "Landroidx/compose/material/icons/Icons$Filled;", "getBed", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BedKt {
    private static ImageVector _bed;

    public static final ImageVector getBed(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _bed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Bed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(21.0f, 10.78f, 8.0f);
        pathBuilderN.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderN.horizontalLineToRelative(-4.0f);
        pathBuilderN.curveToRelative(-0.77f, 0.0f, -1.47f, 0.3f, -2.0f, 0.78f);
        pathBuilderN.curveTo(11.47f, 5.3f, 10.77f, 5.0f, 10.0f, 5.0f);
        pathBuilderN.horizontalLineTo(6.0f);
        pathBuilderN.curveTo(4.35f, 5.0f, 3.0f, 6.35f, 3.0f, 8.0f);
        pathBuilderN.verticalLineToRelative(2.78f);
        pathBuilderN.curveTo(2.39f, 11.33f, 2.0f, 12.12f, 2.0f, 13.0f);
        a.l(pathBuilderN, 6.0f, 2.0f, -2.0f, 16.0f);
        android.support.v4.media.a.m(pathBuilderN, 2.0f, 2.0f, -6.0f);
        pathBuilderN.curveTo(22.0f, 12.12f, 21.61f, 11.33f, 21.0f, 10.78f);
        androidx.compose.animation.a.j(pathBuilderN, 14.0f, 7.0f, 4.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        s.l(pathBuilderN, 2.0f, -6.0f, 8.0f);
        pathBuilderN.curveTo(13.0f, 7.45f, 13.45f, 7.0f, 14.0f, 7.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(5.0f, 8.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(4.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.d(pathBuilderN, 2.0f, 5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
