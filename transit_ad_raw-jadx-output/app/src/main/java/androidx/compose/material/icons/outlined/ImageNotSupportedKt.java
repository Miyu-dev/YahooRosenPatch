package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ImageNotSupported.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_imageNotSupported", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ImageNotSupported", "Landroidx/compose/material/icons/Icons$Outlined;", "getImageNotSupported", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ImageNotSupported", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.9f, 21.9f, -6.1f, -6.1f);
        pathBuilderA.lineToRelative(-2.69f, -2.69f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.lineTo(5.0f, 5.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.lineTo(3.59f, 3.59f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.lineTo(2.1f, 2.1f);
        pathBuilderA.lineTo(0.69f, 3.51f);
        pathBuilderA.lineTo(3.0f, 5.83f);
        pathBuilderA.verticalLineTo(19.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(13.17f);
        s.r(pathBuilderA, 2.31f, 2.31f, 21.9f, 21.9f);
        pathBuilderA.moveTo(5.0f, 19.0f);
        pathBuilderA.verticalLineTo(7.83f);
        pathBuilderA.lineToRelative(6.84f, 6.84f);
        pathBuilderA.lineTo(11.0f, 15.72f);
        pathBuilderA.lineTo(9.0f, 13.0f);
        pathBuilderA.lineToRelative(-3.0f, 4.0f);
        b.A(pathBuilderA, 8.17f, 2.0f, 2.0f, 5.0f);
        pathBuilderA.moveTo(7.83f, 5.0f);
        pathBuilderA.lineToRelative(-2.0f, -2.0f);
        pathBuilderA.horizontalLineTo(19.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a.z(pathBuilderA, 13.17f, -2.0f, -2.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderA, 7.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
