package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: GasMeter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gasMeter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GasMeter", "Landroidx/compose/material/icons/Icons$Filled;", "getGasMeter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GasMeterKt {
    private static ImageVector _gasMeter;

    public static final ImageVector getGasMeter(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _gasMeter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GasMeter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(16.0f, 4.0f, -1.0f, 2.0f, -2.0f);
        s.m(pathBuilderV, 2.0f, -2.0f, 2.0f, 9.0f);
        pathBuilderV.verticalLineToRelative(2.0f);
        pathBuilderV.horizontalLineTo(8.0f);
        pathBuilderV.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilderV.verticalLineToRelative(10.0f);
        pathBuilderV.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderV.horizontalLineToRelative(8.0f);
        pathBuilderV.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderV.verticalLineTo(8.0f);
        pathBuilderV.curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(12.0f, 18.0f);
        pathBuilderV.curveToRelative(-1.38f, 0.0f, -2.5f, -1.1f, -2.5f, -2.46f);
        pathBuilderV.curveToRelative(0.0f, -1.09f, 0.43f, -1.39f, 2.5f, -3.79f);
        pathBuilderV.curveToRelative(2.05f, 2.38f, 2.5f, 2.7f, 2.5f, 3.79f);
        pathBuilderV.curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f);
        a.w(pathBuilderV, 16.0f, 10.0f, 8.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderV, 8.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gasMeter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
