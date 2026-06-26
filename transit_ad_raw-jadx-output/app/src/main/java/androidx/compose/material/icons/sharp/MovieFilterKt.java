package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: MovieFilter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_movieFilter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MovieFilter", "Landroidx/compose/material/icons/Icons$Sharp;", "getMovieFilter", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MovieFilterKt {
    private static ImageVector _movieFilter;

    public static final ImageVector getMovieFilter(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _movieFilter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MovieFilter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = b.p(18.0f, 4.0f, 2.0f, 3.0f, -3.0f);
        pathBuilderP.lineToRelative(-2.0f, -3.0f);
        a.B(pathBuilderP, -2.0f, 2.0f, 3.0f, -3.0f);
        pathBuilderP.lineToRelative(-2.0f, -3.0f);
        pathBuilderP.lineTo(8.0f, 4.0f);
        pathBuilderP.lineToRelative(2.0f, 3.0f);
        pathBuilderP.lineTo(7.0f, 7.0f);
        pathBuilderP.lineTo(5.0f, 4.0f);
        pathBuilderP.lineTo(4.0f, 4.0f);
        pathBuilderP.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderP.lineTo(2.0f, 18.0f);
        pathBuilderP.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderP.horizontalLineToRelative(16.0f);
        pathBuilderP.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.m(pathBuilderP, 22.0f, 4.0f, -4.0f);
        pathBuilderP.moveTo(11.25f, 15.25f);
        pathBuilderP.lineTo(10.0f, 18.0f);
        pathBuilderP.lineToRelative(-1.25f, -2.75f);
        pathBuilderP.lineTo(6.0f, 14.0f);
        pathBuilderP.lineToRelative(2.75f, -1.25f);
        pathBuilderP.lineTo(10.0f, 10.0f);
        pathBuilderP.lineToRelative(1.25f, 2.75f);
        androidx.compose.animation.a.A(pathBuilderP, 14.0f, 14.0f, -2.75f, 1.25f);
        pathBuilderP.moveTo(16.94f, 11.94f);
        pathBuilderP.lineTo(16.0f, 14.0f);
        pathBuilderP.lineToRelative(-0.94f, -2.06f);
        pathBuilderP.lineTo(13.0f, 11.0f);
        pathBuilderP.lineToRelative(2.06f, -0.94f);
        pathBuilderP.lineTo(16.0f, 8.0f);
        pathBuilderP.lineToRelative(0.94f, 2.06f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.s(pathBuilderP, 19.0f, 11.0f, -2.06f, 0.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _movieFilter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
