package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: PhotoAlbum.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_photoAlbum", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoAlbum", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhotoAlbum", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhotoAlbumKt {
    private static ImageVector _photoAlbum;

    public static final ImageVector getPhotoAlbum(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _photoAlbum;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhotoAlbum", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(16.0f, 4.0f, 7.0f, -2.5f, -1.5f);
        a.D(pathBuilderB, 11.0f, 11.0f, 4.0f, 6.0f);
        androidx.appcompat.graphics.drawable.a.q(pathBuilderB, 16.0f, 12.0f, 4.0f, 16.0f);
        pathBuilderB.moveTo(7.0f, 18.0f);
        pathBuilderB.lineToRelative(2.38f, -3.17f);
        pathBuilderB.lineTo(11.0f, 17.0f);
        pathBuilderB.lineToRelative(2.62f, -3.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderB, 17.0f, 18.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = s.b(18.0f, 2.0f, 6.0f);
        pathBuilderB2.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilderB2.verticalLineToRelative(16.0f);
        pathBuilderB2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB2.horizontalLineToRelative(12.0f);
        pathBuilderB2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB2.verticalLineTo(4.0f);
        pathBuilderB2.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderB2, 18.0f, 20.0f, 6.0f, 4.0f);
        s.s(pathBuilderB2, 5.0f, 7.0f, 2.5f, -1.5f);
        androidx.appcompat.app.m.r(pathBuilderB2, 16.0f, 11.0f, 4.0f, 2.0f);
        android.support.v4.media.a.y(pathBuilderB2, 20.0f, 13.62f, 13.5f);
        pathBuilderB2.lineTo(17.0f, 18.0f);
        pathBuilderB2.horizontalLineTo(7.0f);
        pathBuilderB2.lineToRelative(2.38f, -3.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB2, 11.0f, 17.0f, 13.62f, 13.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoAlbum = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
