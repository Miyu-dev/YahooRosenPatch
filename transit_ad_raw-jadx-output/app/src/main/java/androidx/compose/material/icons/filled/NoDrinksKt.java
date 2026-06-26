package androidx.compose.material.icons.filled;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoDrinks.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noDrinks", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoDrinks", "Landroidx/compose/material/icons/Icons$Filled;", "getNoDrinks", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoDrinksKt {
    private static ImageVector _noDrinks;

    public static final ImageVector getNoDrinks(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _noDrinks;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoDrinks", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(5.83f, 3.0f, 21.0f, 2.0f);
        pathBuilderF.lineToRelative(-6.2f, 6.97f);
        pathBuilderF.lineTo(9.83f, 7.0f);
        a.C(pathBuilderF, 6.74f, 1.78f, -2.0f, 7.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderF, 5.83f, 3.0f, 19.78f, 22.61f);
        androidx.browser.browseractions.a.D(pathBuilderF, 18.0f, 20.83f, 21.0f, 6.0f);
        android.support.v4.media.a.m(pathBuilderF, -2.0f, 5.0f, -5.0f);
        pathBuilderF.lineToRelative(-1.37f, -1.54f);
        pathBuilderF.lineTo(1.39f, 4.22f);
        pathBuilderF.lineToRelative(1.41f, -1.41f);
        pathBuilderF.lineTo(3.0f, 3.0f);
        s.r(pathBuilderF, 18.19f, 18.19f, 19.78f, 22.61f);
        pathBuilderF.moveTo(16.17f, 19.0f);
        pathBuilderF.lineTo(13.0f, 15.83f);
        pathBuilderF.verticalLineTo(19.0f);
        pathBuilderF.horizontalLineTo(16.17f);
        pathBuilderF.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderF.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noDrinks = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
