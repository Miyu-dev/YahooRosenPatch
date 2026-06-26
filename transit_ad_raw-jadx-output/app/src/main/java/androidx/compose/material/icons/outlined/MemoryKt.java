package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Memory.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_memory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Memory", "Landroidx/compose/material/icons/Icons$Outlined;", "getMemory", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MemoryKt {
    private static ImageVector _memory;

    public static final ImageVector getMemory(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _memory;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Memory", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(15.0f, 9.0f, 9.0f, 9.0f, 6.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 6.0f, 15.0f, 9.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 13.0f, 13.0f, -2.0f, -2.0f);
        a.z(pathBuilderB, 2.0f, 2.0f, 21.0f, 11.0f);
        pathBuilderB.lineTo(21.0f, 9.0f);
        pathBuilderB.horizontalLineToRelative(-2.0f);
        pathBuilderB.lineTo(19.0f, 7.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderB, -2.0f, 15.0f, 3.0f, -2.0f);
        androidx.browser.browseractions.a.x(pathBuilderB, 2.0f, -2.0f, 11.0f, 3.0f);
        pathBuilderB.lineTo(9.0f, 3.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.lineTo(7.0f, 5.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        v.y(pathBuilderB, 2.0f, 3.0f, 9.0f, 2.0f);
        android.support.v4.media.a.w(pathBuilderB, 2.0f, 2.0f, 3.0f, 13.0f);
        android.support.v4.media.a.m(pathBuilderB, 2.0f, 2.0f, 2.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderB, 2.0f, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderB, 2.0f, 2.0f, 2.0f, -2.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        androidx.browser.browseractions.a.l(pathBuilderB, -2.0f, 2.0f, -2.0f, -2.0f);
        androidx.appcompat.app.m.y(pathBuilderB, -2.0f, 2.0f, 17.0f, 17.0f);
        pathBuilderB.lineTo(7.0f, 17.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderB, 7.0f, 7.0f, 10.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _memory = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
