package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.c;
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FireExtinguisher.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fireExtinguisher", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FireExtinguisher", "Landroidx/compose/material/icons/Icons$Sharp;", "getFireExtinguisher", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FireExtinguisherKt {
    private static ImageVector _fireExtinguisher;

    public static final ImageVector getFireExtinguisher(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _fireExtinguisher;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FireExtinguisher", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(7.0f, 19.0f, 10.0f, 3.0f, 7.0f);
        a.B(pathBuilderI, 19.0f, 7.0f, 18.0f, 10.0f);
        d.f(pathBuilderI, -5.0f, 7.0f, 18.0f);
        pathBuilderI.moveTo(17.0f, 3.0f);
        pathBuilderI.verticalLineToRelative(6.0f);
        pathBuilderI.lineToRelative(-3.15f, -0.66f);
        pathBuilderI.curveToRelative(-0.01f, 0.0f, -0.01f, 0.01f, -0.02f, 0.02f);
        pathBuilderI.curveToRelative(1.55f, 0.62f, 2.72f, 1.98f, 3.07f, 3.64f);
        pathBuilderI.horizontalLineTo(7.1f);
        pathBuilderI.curveToRelative(0.34f, -1.66f, 1.52f, -3.02f, 3.07f, -3.64f);
        pathBuilderI.curveToRelative(-0.33f, -0.26f, -0.6f, -0.58f, -0.8f, -0.95f);
        pathBuilderI.lineTo(5.0f, 6.5f);
        pathBuilderI.verticalLineToRelative(-1.0f);
        pathBuilderI.lineToRelative(4.37f, -0.91f);
        pathBuilderI.curveTo(9.87f, 3.65f, 10.86f, 3.0f, 12.0f, 3.0f);
        pathBuilderI.curveToRelative(0.7f, 0.0f, 1.34f, 0.25f, 1.85f, 0.66f);
        a.z(pathBuilderI, 17.0f, 3.0f, 13.0f, 6.0f);
        pathBuilderI.curveToRelative(-0.03f, -0.59f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderI.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderI.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderI, 13.0f, 6.55f, 13.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireExtinguisher = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
