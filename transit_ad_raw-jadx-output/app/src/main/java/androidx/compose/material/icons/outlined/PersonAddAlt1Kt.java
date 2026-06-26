package androidx.compose.material.icons.outlined;

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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PersonAddAlt1.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personAddAlt1", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonAddAlt1", "Landroidx/compose/material/icons/Icons$Outlined;", "getPersonAddAlt1", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PersonAddAlt1Kt {
    private static ImageVector _personAddAlt1;

    public static final ImageVector getPersonAddAlt1(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _personAddAlt1;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonAddAlt1", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderD.reflectiveCurveTo(5.0f, 5.79f, 5.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveTo(13.0f, 10.21f, 13.0f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(11.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(7.0f, 9.1f, 7.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(11.0f, 6.9f, 11.0f, 8.0f);
        androidx.appcompat.app.m.n(pathBuilderD, 1.0f, 18.0f, 2.0f, 16.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilderD.reflectiveCurveTo(1.0f, 15.34f, 1.0f, 18.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(3.0f, 18.0f);
        pathBuilderD.curveToRelative(0.2f, -0.71f, 3.3f, -2.0f, 6.0f, -2.0f);
        pathBuilderD.curveToRelative(2.69f, 0.0f, 5.78f, 1.28f, 6.0f, 2.0f);
        a.r(pathBuilderD, 3.0f, 20.0f, 15.0f, -3.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderD, 3.0f, -2.0f, -3.0f, 7.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, -2.0f, 3.0f, -3.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, d.c(pathBuilderD, 3.0f, 3.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddAlt1 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
