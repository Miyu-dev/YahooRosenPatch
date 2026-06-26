package androidx.compose.material.icons.sharp;

import a6.h;
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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FamilyRestroom.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_familyRestroom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FamilyRestroom", "Landroidx/compose/material/icons/Icons$Sharp;", "getFamilyRestroom", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FamilyRestroomKt {
    private static ImageVector _familyRestroom;

    public static final ImageVector getFamilyRestroom(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _familyRestroom;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FamilyRestroom", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(16.0f, 5.11f, 16.0f, 4.0f);
        androidx.appcompat.app.m.n(pathBuilderD, 20.0f, 22.0f, -6.0f, 2.5f);
        pathBuilderD.lineToRelative(-3.0f, -9.0f);
        pathBuilderD.lineToRelative(-3.0f, 0.0f);
        b.f(pathBuilderD, -1.17f, 3.5f, 17.0f, 22.0f);
        androidx.compose.animation.b.w(pathBuilderD, 20.0f, 12.5f, 11.5f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(11.0f, 9.17f, 11.0f, 10.0f);
        pathBuilderD.reflectiveCurveTo(11.67f, 11.5f, 12.5f, 11.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.5f, 6.0f);
        pathBuilderD.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(4.39f, 6.0f, 5.5f, 6.0f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderD, 7.5f, 22.0f, -7.0f, 9.0f);
        androidx.compose.animation.b.x(pathBuilderD, 7.0f, 2.0f, 8.0f, 1.5f);
        h.z(pathBuilderD, 7.0f, 7.5f, 14.0f, 22.0f);
        a.l(pathBuilderD, -4.0f, 1.0f, -5.5f, -5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.q(pathBuilderD, 18.0f, 1.0f, 4.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _familyRestroom = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
