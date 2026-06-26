package androidx.compose.material.icons.sharp;

import a.b;
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

/* JADX INFO: compiled from: PersonAddDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_personAddDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PersonAddDisabled", "Landroidx/compose/material/icons/Icons$Sharp;", "getPersonAddDisabled", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PersonAddDisabledKt {
    private static ImageVector _personAddDisabled;

    public static final ImageVector getPersonAddDisabled(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _personAddDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PersonAddDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.48f, 11.95f);
        pathBuilderD.curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderD.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f);
        android.support.v4.media.a.t(pathBuilderD, 3.43f, 3.43f, 16.69f, 14.16f);
        pathBuilderD.lineTo(22.53f, 20.0f);
        pathBuilderD.lineTo(23.0f, 20.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f);
        a.y(pathBuilderD, 0.0f, 3.12f, 4.0f, 4.0f);
        pathBuilderD.lineTo(4.0f, 10.0f);
        b.s(pathBuilderD, 1.0f, 10.0f, 2.0f, 3.0f);
        a.l(pathBuilderD, 3.0f, 2.0f, -3.0f, 2.88f);
        pathBuilderD.lineToRelative(2.51f, 2.51f);
        pathBuilderD.curveTo(9.19f, 15.11f, 7.0f, 16.3f, 7.0f, 18.0f);
        a.t(pathBuilderD, 2.0f, 9.88f, 4.0f, 4.0f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.C(pathBuilderD, 1.41f, 1.71f, 0.0f, 3.12f);
        pathBuilderD.moveTo(6.88f, 10.0f);
        pathBuilderD.lineTo(6.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.m(pathBuilderD, -0.88f, 0.88f, 0.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
