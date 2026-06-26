package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: PhotoSizeSelectLarge.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_photoSizeSelectLarge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoSizeSelectLarge", "Landroidx/compose/material/icons/Icons$Filled;", "getPhotoSizeSelectLarge", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhotoSizeSelectLargeKt {
    private static ImageVector _photoSizeSelectLarge;

    public static final ImageVector getPhotoSizeSelectLarge(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _photoSizeSelectLarge;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhotoSizeSelectLarge", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(21.0f, 15.0f, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, -2.0f, 21.0f, 11.0f, 2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderF, 2.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 23.0f, 19.0f, -2.0f, 2.0f);
        pathBuilderF.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        b.r(pathBuilderF, 13.0f, 3.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderF, -2.0f, 13.0f, 3.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 21.0f, 7.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderF, -2.0f, 21.0f, 7.0f);
        a.b.y(pathBuilderF, 21.0f, 3.0f, 2.0f, 2.0f);
        pathBuilderF.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        b.r(pathBuilderF, 1.0f, 7.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderF, 1.0f, 9.0f, 1.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 17.0f, 3.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderF, -2.0f, 17.0f, 3.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 17.0f, 19.0f, 2.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderF, -2.0f, -2.0f, 3.0f, 3.0f);
        pathBuilderF.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderF, 2.0f, 3.0f, 3.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 9.0f, 3.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderF, 9.0f, 5.0f, 9.0f, 3.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 5.0f, 3.0f, 2.0f, 2.0f);
        android.support.v4.media.a.C(pathBuilderF, 5.0f, 5.0f, 5.0f, 3.0f);
        pathBuilderF.moveTo(1.0f, 11.0f);
        pathBuilderF.verticalLineToRelative(8.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(12.0f);
        android.support.v4.media.a.C(pathBuilderF, 15.0f, 11.0f, 1.0f, 11.0f);
        pathBuilderF.moveTo(3.0f, 19.0f);
        pathBuilderF.lineToRelative(2.5f, -3.21f);
        pathBuilderF.lineToRelative(1.79f, 2.15f);
        pathBuilderF.lineToRelative(2.5f, -3.22f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderF, 13.0f, 19.0f, 3.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectLarge = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
