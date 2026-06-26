package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: FiberPin.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberPin", "Landroidx/compose/material/icons/Icons$Outlined;", "getFiberPin", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FiberPin", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(11.0f, 15.0f, 1.5f, 12.5f, 9.0f);
        b.k(pathBuilderC, 11.0f, 9.0f, 6.0f);
        pathBuilderC.moveTo(18.75f, 9.0f);
        pathBuilderC.verticalLineToRelative(3.5f);
        pathBuilderC.lineTo(16.25f, 9.0f);
        a.b.s(pathBuilderC, 15.0f, 9.0f, 6.0f, 1.25f);
        pathBuilderC.verticalLineToRelative(-3.5f);
        pathBuilderC.lineTo(18.8f, 15.0f);
        pathBuilderC.lineTo(20.0f, 15.0f);
        h.m(pathBuilderC, 20.0f, 9.0f, -1.25f);
        pathBuilderC.moveTo(7.5f, 9.0f);
        a.b.s(pathBuilderC, 4.0f, 9.0f, 6.0f, 1.5f);
        pathBuilderC.verticalLineToRelative(-2.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.curveToRelative(0.85f, 0.0f, 1.5f, -0.65f, 1.5f, -1.5f);
        pathBuilderC.verticalLineToRelative(-1.0f);
        pathBuilderC.curveTo(9.0f, 9.65f, 8.35f, 9.0f, 7.5f, 9.0f);
        b.r(pathBuilderC, 7.5f, 11.5f, -2.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderC, 2.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
