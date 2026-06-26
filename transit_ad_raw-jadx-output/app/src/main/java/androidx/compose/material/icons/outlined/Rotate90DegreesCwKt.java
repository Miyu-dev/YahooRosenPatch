package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Rotate90DegreesCw.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotate90DegreesCw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rotate90DegreesCw", "Landroidx/compose/material/icons/Icons$Outlined;", "getRotate90DegreesCw", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Rotate90DegreesCwKt {
    private static ImageVector _rotate90DegreesCw;

    public static final ImageVector getRotate90DegreesCw(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _rotate90DegreesCw;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rotate90DegreesCw", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(2.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilderD.curveToRelative(1.76f, 0.0f, 3.4f, -0.51f, 4.79f, -1.38f);
        pathBuilderD.lineToRelative(-1.46f, -1.46f);
        pathBuilderD.curveTo(13.34f, 19.69f, 12.2f, 20.0f, 11.0f, 20.0f);
        pathBuilderD.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilderD.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilderD.horizontalLineToRelative(0.17f);
        pathBuilderD.lineTo(9.59f, 7.59f);
        pathBuilderD.lineTo(11.0f, 9.0f);
        pathBuilderD.lineToRelative(4.0f, -4.0f);
        pathBuilderD.lineToRelative(-4.0f, -4.0f);
        pathBuilderD.lineTo(9.58f, 2.41f);
        pathBuilderD.lineTo(11.17f, 4.0f);
        pathBuilderD.horizontalLineTo(11.0f);
        pathBuilderD.curveTo(6.03f, 4.0f, 2.0f, 8.03f, 2.0f, 13.0f);
        a.y(pathBuilderD, 11.0f, 13.0f, 6.0f, 6.0f);
        pathBuilderD.lineToRelative(6.0f, -6.0f);
        s.r(pathBuilderD, -6.0f, -6.0f, 11.0f, 13.0f);
        pathBuilderD.moveTo(17.0f, 16.17f);
        pathBuilderD.lineTo(13.83f, 13.0f);
        pathBuilderD.lineTo(17.0f, 9.83f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 20.17f, 13.0f, 17.0f, 16.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCw = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
