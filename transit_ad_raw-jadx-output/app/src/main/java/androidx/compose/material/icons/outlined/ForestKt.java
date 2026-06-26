package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Forest.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_forest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forest", "Landroidx/compose/material/icons/Icons$Outlined;", "getForest", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Forest", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = d.a(24.0f, 18.0f, -3.86f, -6.0f, 22.0f);
        pathBuilderA.lineTo(15.0f, 2.0f);
        pathBuilderA.lineToRelative(-3.0f, 4.29f);
        pathBuilderA.lineTo(9.0f, 2.0f);
        pathBuilderA.lineTo(2.0f, 12.0f);
        a.y(pathBuilderA, 1.86f, 0.0f, 18.0f, 7.0f);
        androidx.browser.browseractions.a.l(pathBuilderA, 4.0f, 4.0f, -4.0f, 2.0f);
        a.u(pathBuilderA, 4.0f, 4.0f, -4.0f, 24.0f);
        pathBuilderA.moveTo(15.0f, 5.49f);
        pathBuilderA.lineTo(18.16f, 10.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderA, -1.68f, 3.86f, 6.0f, -3.62f);
        pathBuilderA.lineToRelative(-2.57f, -4.0f);
        pathBuilderA.horizontalLineTo(16.0f);
        s.r(pathBuilderA, -2.78f, -3.97f, 15.0f, 5.49f);
        pathBuilderA.moveTo(3.66f, 16.0f);
        pathBuilderA.lineToRelative(3.86f, -6.0f);
        pathBuilderA.horizontalLineTo(5.84f);
        pathBuilderA.lineTo(9.0f, 5.49f);
        pathBuilderA.lineTo(12.16f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.p(pathBuilderA, -1.68f, 3.86f, 6.0f, 3.66f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
