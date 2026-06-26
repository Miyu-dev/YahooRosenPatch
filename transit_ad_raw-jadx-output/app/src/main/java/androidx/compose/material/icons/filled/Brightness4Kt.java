package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Brightness4.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightness4", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness4", "Landroidx/compose/material/icons/Icons$Filled;", "getBrightness4", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Brightness4Kt {
    private static ImageVector _brightness4;

    public static final ImageVector getBrightness4(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Brightness4", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(20.0f, 8.69f, 4.0f, -4.69f);
        pathBuilderO.lineTo(12.0f, 0.69f);
        h.n(pathBuilderO, 8.69f, 4.0f, 4.0f, 4.69f);
        pathBuilderO.lineTo(0.69f, 12.0f);
        androidx.appcompat.app.m.r(pathBuilderO, 4.0f, 15.31f, 20.0f, 4.69f);
        pathBuilderO.lineTo(12.0f, 23.31f);
        h.n(pathBuilderO, 15.31f, 20.0f, 20.0f, -4.69f);
        a.C(pathBuilderO, 23.31f, 12.0f, 20.0f, 8.69f);
        pathBuilderO.moveTo(12.0f, 18.0f);
        pathBuilderO.curveToRelative(-0.89f, 0.0f, -1.74f, -0.2f, -2.5f, -0.55f);
        pathBuilderO.curveTo(11.56f, 16.5f, 13.0f, 14.42f, 13.0f, 12.0f);
        pathBuilderO.reflectiveCurveToRelative(-1.44f, -4.5f, -3.5f, -5.45f);
        pathBuilderO.curveTo(10.26f, 6.2f, 11.11f, 6.0f, 12.0f, 6.0f);
        pathBuilderO.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderO, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
