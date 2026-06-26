package androidx.compose.material.icons.sharp;

import a.b;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _123.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__123", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_123", "Landroidx/compose/material/icons/Icons$Sharp;", "get_123", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _123Kt {
    private static ImageVector __123;

    public static final ImageVector get_123(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = __123;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._123", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = e.b(7.0f, 15.0f, 5.5f, -4.5f, 4.0f);
        a.v(pathBuilderB, 9.0f, 3.0f, 15.0f);
        a.x(pathBuilderB, 13.5f, 13.5f, -3.0f, -1.0f);
        b.C(pathBuilderB, 3.0f, 9.0f, 9.0f, 1.5f);
        android.support.v4.media.a.z(pathBuilderB, 3.0f, 1.0f, 9.0f, 15.0f);
        b.m(pathBuilderB, 4.5f, 13.5f, 19.5f, 15.0f);
        androidx.compose.animation.b.x(pathBuilderB, 9.0f, 15.0f, 1.5f, 3.0f);
        androidx.browser.browseractions.a.l(pathBuilderB, 1.0f, -2.0f, 1.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(1.0f);
        pathBuilderB.horizontalLineToRelative(-3.0f);
        pathBuilderB.verticalLineTo(15.0f);
        pathBuilderB.horizontalLineTo(19.5f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __123 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
