package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: BrightnessMedium.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightnessMedium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrightnessMedium", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBrightnessMedium", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrightnessMediumKt {
    private static ImageVector _brightnessMedium;

    public static final ImageVector getBrightnessMedium(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _brightnessMedium;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BrightnessMedium", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(18.0f, 9.52f, 6.0f, -3.52f);
        pathBuilderO.lineTo(12.0f, 3.52f);
        h.n(pathBuilderO, 9.52f, 6.0f, 6.0f, 3.52f);
        pathBuilderO.lineTo(3.52f, 12.0f);
        androidx.appcompat.app.m.r(pathBuilderO, 6.0f, 14.48f, 18.0f, 3.52f);
        pathBuilderO.lineTo(12.0f, 20.48f);
        h.n(pathBuilderO, 14.48f, 18.0f, 18.0f, -3.52f);
        a.C(pathBuilderO, 20.48f, 12.0f, 18.0f, 9.52f);
        pathBuilderO.moveTo(12.0f, 18.0f);
        pathBuilderO.verticalLineTo(6.0f);
        pathBuilderO.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderO, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = androidx.appcompat.graphics.drawable.a.l(20.0f, 8.69f, 20.0f, 4.0f, -4.69f);
        pathBuilderL.lineTo(12.0f, 0.69f);
        pathBuilderL.lineTo(8.69f, 4.0f);
        pathBuilderL.lineTo(4.0f, 4.0f);
        pathBuilderL.verticalLineToRelative(4.69f);
        pathBuilderL.lineTo(0.69f, 12.0f);
        pathBuilderL.lineTo(4.0f, 15.31f);
        pathBuilderL.lineTo(4.0f, 20.0f);
        pathBuilderL.horizontalLineToRelative(4.69f);
        pathBuilderL.lineTo(12.0f, 23.31f);
        pathBuilderL.lineTo(15.31f, 20.0f);
        pathBuilderL.lineTo(20.0f, 20.0f);
        pathBuilderL.verticalLineToRelative(-4.69f);
        a.C(pathBuilderL, 23.31f, 12.0f, 20.0f, 8.69f);
        pathBuilderL.moveTo(18.0f, 14.48f);
        pathBuilderL.lineTo(18.0f, 18.0f);
        pathBuilderL.horizontalLineToRelative(-3.52f);
        pathBuilderL.lineTo(12.0f, 20.48f);
        pathBuilderL.lineTo(9.52f, 18.0f);
        pathBuilderL.lineTo(6.0f, 18.0f);
        pathBuilderL.verticalLineToRelative(-3.52f);
        pathBuilderL.lineTo(3.52f, 12.0f);
        pathBuilderL.lineTo(6.0f, 9.52f);
        pathBuilderL.lineTo(6.0f, 6.0f);
        pathBuilderL.horizontalLineToRelative(3.52f);
        pathBuilderL.lineTo(12.0f, 3.52f);
        pathBuilderL.lineTo(14.48f, 6.0f);
        pathBuilderL.lineTo(18.0f, 6.0f);
        pathBuilderL.verticalLineToRelative(3.52f);
        a.C(pathBuilderL, 20.48f, 12.0f, 18.0f, 14.48f);
        pathBuilderL.moveTo(12.0f, 6.0f);
        pathBuilderL.verticalLineToRelative(12.0f);
        pathBuilderL.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderL, -2.69f, -6.0f, -6.0f, -6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessMedium = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
