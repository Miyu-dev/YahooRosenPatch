package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoLuggage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noLuggage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoLuggage", "Landroidx/compose/material/icons/Icons$Sharp;", "getNoLuggage", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoLuggage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(12.75f, 9.0f, 0.92f, 1.75f, 1.75f);
        a.o(pathBuilderB, 9.0f, 16.0f, 4.17f);
        s.D(pathBuilderB, 3.0f, 3.0f, 6.0f, -4.0f);
        pathBuilderB.verticalLineTo(2.0f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.horizontalLineTo(8.83f);
        a.b.l(pathBuilderB, 3.0f, 3.0f, 12.75f);
        androidx.browser.browseractions.a.A(pathBuilderB, 10.5f, 3.5f, 3.0f, 6.0f);
        a.b.m(pathBuilderB, -3.0f, 3.5f, 21.19f, 21.19f);
        pathBuilderB.lineTo(2.81f, 2.81f);
        pathBuilderB.lineTo(1.39f, 4.22f);
        androidx.appcompat.app.m.r(pathBuilderB, 5.0f, 7.83f, 21.0f, 2.0f);
        androidx.browser.browseractions.a.l(pathBuilderB, 1.0f, 2.0f, -1.0f, 6.0f);
        androidx.browser.browseractions.a.l(pathBuilderB, 1.0f, 2.0f, -1.0f, 1.17f);
        s.r(pathBuilderB, 1.61f, 1.61f, 21.19f, 21.19f);
        pathBuilderB.moveTo(8.0f, 18.0f);
        androidx.browser.browseractions.a.z(pathBuilderB, -7.17f, 1.5f, 1.5f, 18.0f);
        androidx.browser.browseractions.a.r(pathBuilderB, 8.0f, 11.25f, 18.0f, -3.92f);
        pathBuilderB.lineToRelative(1.5f, 1.5f);
        pathBuilderB.verticalLineTo(18.0f);
        pathBuilderB.horizontalLineTo(11.25f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
