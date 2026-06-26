package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FiberDvr.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberDvr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberDvr", "Landroidx/compose/material/icons/Icons$Filled;", "getFiberDvr", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FiberDvr", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(17.5f, 10.5f, 2.0f, 1.0f, -2.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderF, 10.5f, 4.5f, 10.5f, 2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderF, 3.0f, -2.0f, 10.5f);
        pathBuilderF.moveTo(21.0f, 3.0f);
        pathBuilderF.horizontalLineTo(3.0f);
        pathBuilderF.curveTo(1.89f, 3.0f, 1.0f, 3.89f, 1.0f, 5.0f);
        pathBuilderF.verticalLineToRelative(14.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(18.0f);
        pathBuilderF.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderF.verticalLineTo(5.0f);
        pathBuilderF.curveTo(23.0f, 3.89f, 22.11f, 3.0f, 21.0f, 3.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(8.0f, 13.5f);
        pathBuilderF.curveTo(8.0f, 14.35f, 7.35f, 15.0f, 6.5f, 15.0f);
        c.a.i(pathBuilderF, 3.0f, 9.0f, 3.5f);
        pathBuilderF.curveTo(7.35f, 9.0f, 8.0f, 9.65f, 8.0f, 10.5f);
        androidx.appcompat.view.menu.a.B(pathBuilderF, 13.5f, 12.62f, 15.0f, -1.5f);
        pathBuilderF.lineTo(9.37f, 9.0f);
        pathBuilderF.horizontalLineToRelative(1.5f);
        pathBuilderF.lineToRelative(1.0f, 3.43f);
        pathBuilderF.lineToRelative(1.0f, -3.43f);
        androidx.appcompat.view.menu.a.s(pathBuilderF, 1.5f, 12.62f, 15.0f);
        pathBuilderF.moveTo(21.0f, 11.5f);
        pathBuilderF.curveToRelative(0.0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f);
        pathBuilderF.lineTo(21.0f, 15.0f);
        androidx.compose.animation.a.C(pathBuilderF, -1.5f, -0.85f, -2.0f, 17.5f);
        j.f(pathBuilderF, 2.0f, 16.0f, 9.0f, 3.5f);
        pathBuilderF.curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderF, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
