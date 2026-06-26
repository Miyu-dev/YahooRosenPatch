package androidx.compose.material.icons.twotone;

import a.b;
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
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HolidayVillage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_holidayVillage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HolidayVillage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHolidayVillage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HolidayVillageKt {
    private static ImageVector _holidayVillage;

    public static final ImageVector getHolidayVillage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _holidayVillage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HolidayVillage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(8.0f, 6.83f, -4.0f, 4.0f, 18.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderW, 3.0f, -3.0f, 2.0f, 3.0f);
        androidx.appcompat.app.m.C(pathBuilderW, 3.0f, -7.17f, 8.0f, 6.83f);
        b.z(pathBuilderW, 9.0f, 13.0f, 7.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderW, 2.0f, 13.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = androidx.appcompat.app.m.o(8.0f, 4.0f, -6.0f, 6.0f, 10.0f);
        a.s(pathBuilderO, 12.0f, 10.0f, 8.0f, 4.0f);
        b.z(pathBuilderO, 12.0f, 18.0f, 9.0f, -3.0f);
        s.B(pathBuilderO, 7.0f, 3.0f, 4.0f, -7.17f);
        pathBuilderO.lineToRelative(4.0f, -4.0f);
        c.a.g(pathBuilderO, 4.0f, 4.0f, 18.0f);
        b.z(pathBuilderO, 9.0f, 13.0f, 7.0f, -2.0f);
        b.m(pathBuilderO, 2.0f, 13.0f, 18.0f, 20.0f);
        pathBuilderO.verticalLineTo(8.35f);
        pathBuilderO.lineTo(13.65f, 4.0f);
        pathBuilderO.horizontalLineToRelative(-2.83f);
        j.h(pathBuilderO, 16.0f, 9.18f, 20.0f, 18.0f);
        pathBuilderO.moveTo(22.0f, 20.0f);
        pathBuilderO.verticalLineTo(6.69f);
        pathBuilderO.lineTo(19.31f, 4.0f);
        pathBuilderO.horizontalLineToRelative(-2.83f);
        pathBuilderO.lineTo(20.0f, 7.52f);
        pathBuilderO.verticalLineTo(20.0f);
        pathBuilderO.horizontalLineTo(22.0f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _holidayVillage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
