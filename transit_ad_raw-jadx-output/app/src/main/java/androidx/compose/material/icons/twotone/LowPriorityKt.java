package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: LowPriority.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lowPriority", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LowPriority", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLowPriority", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LowPriorityKt {
    private static ImageVector _lowPriority;

    public static final ImageVector getLowPriority(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _lowPriority;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LowPriority", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(14.0f, 5.0f, 8.0f, 2.0f, -8.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderF, 14.0f, 5.0f, 14.0f, 10.5f);
        b.A(pathBuilderF, 8.0f, 2.0f, -8.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 14.0f, 16.0f, 8.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderF, -8.0f, -2.0f, 2.0f, 11.5f);
        pathBuilderF.curveTo(2.0f, 15.08f, 4.92f, 18.0f, 8.5f, 18.0f);
        pathBuilderF.lineTo(9.0f, 18.0f);
        pathBuilderF.verticalLineToRelative(2.0f);
        pathBuilderF.lineToRelative(3.0f, -3.0f);
        v.u(pathBuilderF, -3.0f, -3.0f, 2.0f, -0.5f);
        pathBuilderF.curveTo(6.02f, 16.0f, 4.0f, 13.98f, 4.0f, 11.5f);
        pathBuilderF.reflectiveCurveTo(6.02f, 7.0f, 8.5f, 7.0f);
        pathBuilderF.lineTo(12.0f, 7.0f);
        pathBuilderF.lineTo(12.0f, 5.0f);
        pathBuilderF.lineTo(8.5f, 5.0f);
        pathBuilderF.curveTo(4.92f, 5.0f, 2.0f, 7.92f, 2.0f, 11.5f);
        pathBuilderF.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderF.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lowPriority = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
