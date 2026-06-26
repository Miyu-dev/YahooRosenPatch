package androidx.compose.material.icons.filled;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PersonOutline.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personOutline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonOutline", "Landroidx/compose/material/icons/Icons$Filled;", "getPersonOutline", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PersonOutlineKt {
    private static ImageVector _personOutline;

    public static final ImageVector getPersonOutline(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _personOutline;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonOutline", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 5.9f);
        pathBuilderD.curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
        pathBuilderD.reflectiveCurveToRelative(-0.94f, 2.1f, -2.1f, 2.1f);
        pathBuilderD.reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(0.94f, -2.1f, 2.1f, -2.1f);
        pathBuilderD.moveToRelative(0.0f, 9.0f);
        pathBuilderD.curveToRelative(2.97f, 0.0f, 6.1f, 1.46f, 6.1f, 2.1f);
        pathBuilderD.verticalLineToRelative(1.1f);
        pathBuilderD.lineTo(5.9f, 18.1f);
        pathBuilderD.lineTo(5.9f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
        pathBuilderD.moveTo(12.0f, 4.0f);
        pathBuilderD.curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 13.0f);
        pathBuilderD.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        android.support.v4.media.a.m(pathBuilderD, 3.0f, 16.0f, -3.0f);
        pathBuilderD.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOutline = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
