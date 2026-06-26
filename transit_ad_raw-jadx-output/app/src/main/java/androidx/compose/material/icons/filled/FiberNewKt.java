package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FiberNew.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fiberNew", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberNew", "Landroidx/compose/material/icons/Icons$Filled;", "getFiberNew", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FiberNew", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 4.0f, 4.0f);
        pathBuilderB.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        pathBuilderB.lineTo(2.0f, 18.0f);
        pathBuilderB.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveTo(22.0f, 4.89f, 21.11f, 4.0f, 20.0f, 4.0f);
        a.k(pathBuilderB, 8.5f, 15.0f, 7.3f);
        e.f(pathBuilderB, -2.55f, -3.5f, 15.0f, 3.5f);
        androidx.appcompat.app.m.u(pathBuilderB, 9.0f, 1.25f, 2.5f, 3.5f);
        b.z(pathBuilderB, 9.0f, 8.5f, 15.0f);
        a.b.z(pathBuilderB, 13.5f, 10.26f, 11.0f, 1.12f);
        androidx.appcompat.app.m.x(pathBuilderB, 2.5f, 1.26f, 11.0f, 1.11f);
        androidx.appcompat.view.menu.a.A(pathBuilderB, 2.5f, 15.0f, -4.0f, 9.0f);
        a.b.m(pathBuilderB, 4.0f, 10.26f, 20.5f, 14.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(-4.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        s.y(pathBuilderB, 9.0f, 1.25f, 4.51f, 1.13f);
        s.y(pathBuilderB, 9.99f, 1.25f, 3.51f, 1.12f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.q(pathBuilderB, 9.0f, 1.25f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
