package androidx.compose.material.icons.sharp;

import a.b;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FiberDvr.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberDvr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberDvr", "Landroidx/compose/material/icons/Icons$Sharp;", "getFiberDvr", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberDvr", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(17.5f, 10.5f, 2.0f, 1.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, -1.0f, 4.5f, 10.5f, 2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderF, 3.0f, -2.0f, -3.0f);
        pathBuilderF.moveTo(23.0f, 3.0f);
        b.s(pathBuilderF, 1.0f, 3.0f, 18.0f, 22.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderF, 23.0f, 3.0f, 8.0f, 13.5f);
        pathBuilderF.curveToRelative(0.0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f);
        pathBuilderF.lineTo(3.0f, 15.0f);
        pathBuilderF.lineTo(3.0f, 9.0f);
        pathBuilderF.horizontalLineToRelative(3.5f);
        pathBuilderF.curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, 3.0f, 12.62f, 15.0f, -1.5f);
        pathBuilderF.lineTo(9.37f, 9.0f);
        pathBuilderF.horizontalLineToRelative(1.5f);
        pathBuilderF.lineToRelative(1.0f, 3.43f);
        pathBuilderF.lineToRelative(1.0f, -3.43f);
        androidx.compose.animation.b.C(pathBuilderF, 1.5f, -1.75f, 6.0f);
        pathBuilderF.moveTo(21.0f, 12.9f);
        androidx.appcompat.view.menu.a.y(pathBuilderF, -0.9f, 21.0f, 15.0f, -1.5f);
        pathBuilderF.lineToRelative(-0.85f, -2.0f);
        pathBuilderF.lineTo(17.5f, 13.0f);
        pathBuilderF.verticalLineToRelative(2.0f);
        pathBuilderF.lineTo(16.0f, 15.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderF, 16.0f, 9.0f, 5.0f, 3.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
