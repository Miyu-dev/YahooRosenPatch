package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: FormatShapes.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatShapes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatShapes", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFormatShapes", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatShapesKt {
    private static ImageVector _formatShapes;

    public static final ImageVector getFormatShapes(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _formatShapes;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatShapes", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(3.0f, 3.0f, 2.0f, 2.0f);
        a.z(pathBuilderO, 3.0f, 5.0f, 19.0f, 19.0f);
        androidx.compose.animation.b.t(pathBuilderO, 2.0f, 2.0f, -2.0f);
        a.x(pathBuilderO, 19.0f, 3.0f, 2.0f, 2.0f);
        a.w(pathBuilderO, -2.0f, 3.0f, 19.0f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderO, 2.0f, 3.0f, 21.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = b.p(11.29f, 7.0f, -3.4f, 9.0f, 1.62f);
        pathBuilderP.lineToRelative(0.73f, -2.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderP, 3.49f, 0.74f, 2.0f, 1.63f);
        v.x(pathBuilderP, -3.41f, -9.0f, -1.4f);
        pathBuilderP.moveTo(10.69f, 12.74f);
        pathBuilderP.lineTo(12.0f, 8.91f);
        v.x(pathBuilderP, 1.3f, 3.83f, -2.61f);
        pathBuilderP.moveTo(17.0f, 3.0f);
        pathBuilderP.lineTo(7.0f, 3.0f);
        pathBuilderP.lineTo(7.0f, 1.0f);
        b.s(pathBuilderP, 1.0f, 1.0f, 6.0f, 2.0f);
        v.y(pathBuilderP, 10.0f, 1.0f, 17.0f, 6.0f);
        a.t(pathBuilderP, 6.0f, -2.0f, 10.0f, 2.0f);
        android.support.v4.media.a.s(pathBuilderP, 6.0f, -6.0f, -2.0f);
        pathBuilderP.lineTo(21.0f, 7.0f);
        a.y(pathBuilderP, 2.0f, 23.0f, 1.0f, -6.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderP, 2.0f, 3.0f, 3.0f, 2.0f);
        pathBuilderP.verticalLineToRelative(2.0f);
        android.support.v4.media.a.C(pathBuilderP, 3.0f, 5.0f, 3.0f, 3.0f);
        pathBuilderP.moveTo(5.0f, 21.0f);
        b.s(pathBuilderP, 3.0f, 21.0f, -2.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderP, 2.0f, 21.0f, 21.0f, -2.0f);
        a.n(pathBuilderP, -2.0f, 2.0f, 2.0f);
        a.x(pathBuilderP, 19.0f, 3.0f, 2.0f, 2.0f);
        a.s(pathBuilderP, -2.0f, 19.0f, 3.0f);
        a.x(pathBuilderP, 19.0f, 17.0f, -2.0f, 2.0f);
        pathBuilderP.lineTo(7.0f, 19.0f);
        pathBuilderP.verticalLineToRelative(-2.0f);
        pathBuilderP.lineTo(5.0f, 17.0f);
        pathBuilderP.lineTo(5.0f, 7.0f);
        a.y(pathBuilderP, 2.0f, 7.0f, 5.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.j(pathBuilderP, 2.0f, 2.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatShapes = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
