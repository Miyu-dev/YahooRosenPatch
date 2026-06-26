package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ElectricCar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricCar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricCar", "Landroidx/compose/material/icons/Icons$Sharp;", "getElectricCar", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricCarKt {
    private static ImageVector _electricCar;

    public static final ImageVector getElectricCar(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _electricCar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ElectricCar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.58f, 1.0f, 5.43f, 3.0f, 8.0f);
        a.l(pathBuilderA, 9.0f, 3.0f, -2.0f, 12.0f);
        s.l(pathBuilderA, 2.0f, 3.0f, 8.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 18.58f, 1.0f, 6.5f, 12.0f);
        pathBuilderA.curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f);
        pathBuilderA.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        pathBuilderA.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        pathBuilderA.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.5f, 12.0f);
        pathBuilderA.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderA.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilderA.reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f);
        pathBuilderA.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        a.y(pathBuilderA, 5.0f, 7.0f, 1.5f, -4.5f);
        pathBuilderA.horizontalLineToRelative(11.0f);
        pathBuilderA.lineTo(19.0f, 7.0f);
        pathBuilderA.horizontalLineTo(5.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = androidx.compose.animation.b.a(7.0f, 20.0f, 4.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, -2.0f);
        pathBuilderA2.lineToRelative(6.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, -4.0f, 0.0f, 0.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricCar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
