package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ImageNotSupported.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_imageNotSupported", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ImageNotSupported", "Landroidx/compose/material/icons/Icons$TwoTone;", "getImageNotSupported", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ImageNotSupported", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(7.83f, 5.0f, 19.0f, 11.17f);
        a.z(pathBuilderF, 7.83f, 5.0f, 16.17f, 19.0f);
        pathBuilderF.lineToRelative(-2.0f, -2.0f);
        pathBuilderF.horizontalLineTo(6.0f);
        pathBuilderF.lineToRelative(3.0f, -4.0f);
        pathBuilderF.lineToRelative(2.0f, 2.72f);
        pathBuilderF.lineToRelative(0.84f, -1.05f);
        pathBuilderF.lineTo(5.0f, 7.83f);
        pathBuilderF.verticalLineTo(19.0f);
        pathBuilderF.horizontalLineTo(16.17f);
        pathBuilderF.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderF.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(5.83f, 3.0f, 19.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        androidx.browser.browseractions.a.z(pathBuilderB, 13.17f, -2.0f, -2.0f, 5.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderB, 7.83f, 5.83f, 3.0f);
        pathBuilderB.moveTo(20.49f, 23.31f);
        pathBuilderB.lineTo(18.17f, 21.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.83f);
        pathBuilderB.lineTo(0.69f, 3.51f);
        pathBuilderB.lineTo(2.1f, 2.1f);
        pathBuilderB.lineToRelative(1.49f, 1.49f);
        pathBuilderB.lineTo(5.0f, 5.0f);
        pathBuilderB.lineToRelative(8.11f, 8.11f);
        pathBuilderB.lineToRelative(2.69f, 2.69f);
        pathBuilderB.lineTo(19.0f, 19.0f);
        pathBuilderB.lineToRelative(1.41f, 1.41f);
        s.r(pathBuilderB, 1.49f, 1.49f, 20.49f, 23.31f);
        pathBuilderB.moveTo(16.17f, 19.0f);
        pathBuilderB.lineToRelative(-2.0f, -2.0f);
        pathBuilderB.horizontalLineTo(6.0f);
        pathBuilderB.lineToRelative(3.0f, -4.0f);
        pathBuilderB.lineToRelative(2.0f, 2.72f);
        pathBuilderB.lineToRelative(0.84f, -1.05f);
        pathBuilderB.lineTo(5.0f, 7.83f);
        pathBuilderB.verticalLineTo(19.0f);
        pathBuilderB.horizontalLineTo(16.17f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
