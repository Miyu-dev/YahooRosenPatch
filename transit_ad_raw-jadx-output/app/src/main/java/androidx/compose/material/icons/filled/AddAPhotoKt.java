package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addAPhoto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddAPhoto", "Landroidx/compose/material/icons/Icons$Filled;", "getAddAPhoto", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddAPhotoKt {
    private static ImageVector _addAPhoto;

    public static final ImageVector getAddAPhoto(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _addAPhoto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddAPhoto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(3.0f, 4.0f, 1.0f, 2.0f, 3.0f);
        androidx.appcompat.app.m.x(pathBuilderC, 3.0f, 2.0f, 5.0f, 3.0f);
        a.x(pathBuilderC, 3.0f, 6.0f, 0.0f, 4.0f);
        v.s(pathBuilderC, 3.0f, 6.0f, 10.0f, 7.0f);
        v.m(pathBuilderC, 3.0f, 4.0f, 7.0f);
        pathBuilderC.lineToRelative(1.83f, 2.0f);
        pathBuilderC.horizontalLineTo(21.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderC.horizontalLineTo(5.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderC, 10.0f, 6.0f, 13.0f, 19.0f);
        pathBuilderC.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderC.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderC.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderC.reflectiveCurveTo(10.24f, 19.0f, 13.0f, 19.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(9.8f, 14.0f);
        pathBuilderC.curveToRelative(0.0f, 1.77f, 1.43f, 3.2f, 3.2f, 3.2f);
        pathBuilderC.reflectiveCurveToRelative(3.2f, -1.43f, 3.2f, -3.2f);
        pathBuilderC.reflectiveCurveToRelative(-1.43f, -3.2f, -3.2f, -3.2f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderC, 9.8f, 12.23f, 9.8f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAPhoto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
