package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: PhotoFilter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_photoFilter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoFilter", "Landroidx/compose/material/icons/Icons$Sharp;", "getPhotoFilter", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhotoFilterKt {
    private static ImageVector _photoFilter;

    public static final ImageVector getPhotoFilter(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _photoFilter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhotoFilter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(19.0f, 10.0f, 9.0f, 4.98f, 19.0f);
        pathBuilderU.lineTo(4.98f, 5.0f);
        pathBuilderU.horizontalLineToRelative(9.0f);
        pathBuilderU.lineTo(13.98f, 3.0f);
        b.s(pathBuilderU, 3.0f, 3.0f, 18.0f, 18.0f);
        h.m(pathBuilderU, 21.0f, 10.0f, -2.0f);
        pathBuilderU.moveTo(17.0f, 10.0f);
        pathBuilderU.lineToRelative(0.94f, -2.06f);
        pathBuilderU.lineTo(20.0f, 7.0f);
        pathBuilderU.lineToRelative(-2.06f, -0.94f);
        pathBuilderU.lineTo(17.0f, 4.0f);
        pathBuilderU.lineToRelative(-0.94f, 2.06f);
        pathBuilderU.lineTo(14.0f, 7.0f);
        s.r(pathBuilderU, 2.06f, 0.94f, 17.0f, 10.0f);
        pathBuilderU.moveTo(13.25f, 10.75f);
        pathBuilderU.lineTo(12.0f, 8.0f);
        pathBuilderU.lineToRelative(-1.25f, 2.75f);
        pathBuilderU.lineTo(8.0f, 12.0f);
        pathBuilderU.lineToRelative(2.75f, 1.25f);
        pathBuilderU.lineTo(12.0f, 16.0f);
        pathBuilderU.lineToRelative(1.25f, -2.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.s(pathBuilderU, 16.0f, 12.0f, -2.75f, -1.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoFilter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
