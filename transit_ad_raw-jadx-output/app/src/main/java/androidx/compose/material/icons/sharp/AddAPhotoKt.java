package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: AddAPhoto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addAPhoto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddAPhoto", "Landroidx/compose/material/icons/Icons$Sharp;", "getAddAPhoto", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddAPhotoKt {
    private static ImageVector _addAPhoto;

    public static final ImageVector getAddAPhoto(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _addAPhoto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddAPhoto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(3.0f, 4.0f, 3.0f, 1.0f, 2.0f);
        android.support.v4.media.a.m(pathBuilderL, 3.0f, 3.0f, 2.0f);
        pathBuilderL.lineTo(5.0f, 6.0f);
        pathBuilderL.verticalLineToRelative(3.0f);
        pathBuilderL.lineTo(3.0f, 9.0f);
        pathBuilderL.lineTo(3.0f, 6.0f);
        pathBuilderL.lineTo(0.0f, 6.0f);
        h.m(pathBuilderL, 0.0f, 4.0f, 3.0f);
        pathBuilderL.moveTo(6.0f, 10.0f);
        pathBuilderL.lineTo(6.0f, 7.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderL, 3.0f, 9.0f, 4.0f, 7.0f);
        pathBuilderL.lineToRelative(1.83f, 2.0f);
        pathBuilderL.lineTo(23.0f, 6.0f);
        pathBuilderL.verticalLineToRelative(16.0f);
        pathBuilderL.lineTo(3.0f, 22.0f);
        h.m(pathBuilderL, 3.0f, 10.0f, 3.0f);
        pathBuilderL.moveTo(13.0f, 19.0f);
        pathBuilderL.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderL.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderL.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderL.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderL.close();
        pathBuilderL.moveTo(10.0f, 14.0f);
        pathBuilderL.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderL.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderL.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderL, -3.0f, 1.34f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAPhoto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
