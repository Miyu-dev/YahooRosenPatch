package androidx.compose.material.icons.filled;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: CleaningServices.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cleaningServices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CleaningServices", "Landroidx/compose/material/icons/Icons$Filled;", "getCleaningServices", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CleaningServicesKt {
    private static ImageVector _cleaningServices;

    public static final ImageVector getCleaningServices(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _cleaningServices;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CleaningServices", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(16.0f, 11.0f, -1.0f, 3.0f);
        pathBuilderT.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderT.horizontalLineToRelative(-2.0f);
        pathBuilderT.curveTo(9.9f, 1.0f, 9.0f, 1.9f, 9.0f, 3.0f);
        pathBuilderT.verticalLineToRelative(8.0f);
        pathBuilderT.horizontalLineTo(8.0f);
        pathBuilderT.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        a.m(pathBuilderT, 7.0f, 18.0f, -7.0f);
        pathBuilderT.curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f);
        androidx.compose.animation.b.r(pathBuilderT, 19.0f, 21.0f, -2.0f, -3.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        a.m(pathBuilderT, 3.0f, -2.0f, -3.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        v.z(pathBuilderT, 3.0f, 9.0f, -3.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        v.z(pathBuilderT, 3.0f, 5.0f, -5.0f);
        pathBuilderT.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilderT.horizontalLineToRelative(8.0f);
        pathBuilderT.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderT, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cleaningServices = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
