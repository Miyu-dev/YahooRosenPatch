package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: NoEncryptionGmailerrorred.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noEncryptionGmailerrorred", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoEncryptionGmailerrorred", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoEncryptionGmailerrorred", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoEncryptionGmailerrorredKt {
    private static ImageVector _noEncryptionGmailerrorred;

    public static final ImageVector getNoEncryptionGmailerrorred(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noEncryptionGmailerrorred;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoEncryptionGmailerrorred", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.9f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        pathBuilderD.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        a.t(pathBuilderD, 2.0f, -4.66f, 2.0f, 2.0f);
        androidx.compose.animation.a.z(pathBuilderD, 18.0f, 5.56f, 2.0f, 2.0f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-1.0f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderD.curveToRelative(-2.32f, 0.0f, -4.26f, 1.59f, -4.82f, 3.74f);
        h.y(pathBuilderD, 8.9f, 6.46f, 6.0f);
        pathBuilderD.moveTo(4.41f, 4.81f);
        pathBuilderD.lineTo(3.0f, 6.22f);
        pathBuilderD.lineToRelative(2.04f, 2.04f);
        pathBuilderD.curveTo(4.42f, 8.6f, 4.0f, 9.25f, 4.0f, 10.0f);
        pathBuilderD.verticalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(12.78f);
        pathBuilderD.lineToRelative(1.0f, 1.0f);
        s.r(pathBuilderD, 1.41f, -1.41f, 4.41f, 4.81f);
        h.D(pathBuilderD, 6.0f, 20.0f, 10.0f, 0.78f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.k(pathBuilderD, 10.0f, 10.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noEncryptionGmailerrorred = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
