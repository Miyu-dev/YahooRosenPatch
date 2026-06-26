package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LocalShipping.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localShipping", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalShipping", "Landroidx/compose/material/icons/Icons$Outlined;", "getLocalShipping", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalShippingKt {
    private static ImageVector _localShipping;

    public static final ImageVector getLocalShipping(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _localShipping;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalShipping", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(20.0f, 8.0f, -3.0f, 17.0f, 4.0f);
        pathBuilderC.lineTo(3.0f, 4.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(11.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderC.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderC.horizontalLineToRelative(6.0f);
        pathBuilderC.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderC.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        d.g(pathBuilderC, 2.0f, -5.0f, -3.0f, -4.0f);
        pathBuilderC.moveTo(19.5f, 9.5f);
        pathBuilderC.lineToRelative(1.96f, 2.5f);
        pathBuilderC.lineTo(17.0f, 12.0f);
        h.m(pathBuilderC, 17.0f, 9.5f, 2.5f);
        pathBuilderC.moveTo(6.0f, 18.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(8.22f, 15.0f);
        pathBuilderC.curveToRelative(-0.55f, -0.61f, -1.33f, -1.0f, -2.22f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        pathBuilderC.lineTo(3.0f, 15.0f);
        a.o(pathBuilderC, 3.0f, 6.0f, 12.0f, 9.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderC, 8.22f, 15.0f, 18.0f, 18.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderC, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localShipping = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
