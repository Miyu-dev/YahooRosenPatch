package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: FormatListNumberedRtl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatListNumberedRtl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatListNumberedRtl", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFormatListNumberedRtl", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatListNumberedRtlKt {
    private static ImageVector _formatListNumberedRtl;

    public static final ImageVector getFormatListNumberedRtl(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _formatListNumberedRtl;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatListNumberedRtl", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(2.0f, 11.0f, 14.0f, 2.0f);
        a.z(pathBuilderO, 2.0f, 13.0f, 18.0f, 17.0f);
        a.t(pathBuilderO, 2.0f, 0.5f, -1.0f, 1.0f);
        a.t(pathBuilderO, 1.0f, 0.5f, -2.0f, 1.0f);
        androidx.compose.animation.b.t(pathBuilderO, 3.0f, -4.0f, -3.0f);
        pathBuilderO.moveTo(18.0f, 11.0f);
        pathBuilderO.horizontalLineToRelative(1.8f);
        pathBuilderO.lineTo(18.0f, 13.1f);
        pathBuilderO.verticalLineToRelative(0.9f);
        android.support.v4.media.a.s(pathBuilderO, 3.0f, -1.0f, -1.8f);
        pathBuilderO.lineToRelative(1.8f, -2.1f);
        h.m(pathBuilderO, 21.0f, 10.0f, -3.0f);
        pathBuilderO.moveTo(20.0f, 8.0f);
        androidx.compose.animation.a.o(pathBuilderO, 20.0f, 4.0f, -2.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderO, 1.0f, 3.0f, 2.0f, 17.0f);
        androidx.appcompat.app.m.C(pathBuilderO, 14.0f, 2.0f, 2.0f, 19.0f);
        a.x(pathBuilderO, 2.0f, 5.0f, 14.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderO, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListNumberedRtl = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
