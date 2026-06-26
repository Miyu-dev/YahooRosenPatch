package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Spellcheck.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spellcheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Spellcheck", "Landroidx/compose/material/icons/Icons$Rounded;", "getSpellcheck", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpellcheckKt {
    private static ImageVector _spellcheck;

    public static final ImageVector getSpellcheck(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _spellcheck;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Spellcheck", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.12f, 16.0f);
        pathBuilderD.curveToRelative(0.69f, 0.0f, 1.15f, -0.69f, 0.9f, -1.32f);
        pathBuilderD.lineTo(9.77f, 3.87f);
        pathBuilderD.curveTo(9.56f, 3.34f, 9.06f, 3.0f, 8.5f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.06f, 0.34f, -1.27f, 0.87f);
        pathBuilderD.lineTo(2.98f, 14.68f);
        pathBuilderD.curveToRelative(-0.25f, 0.63f, 0.22f, 1.32f, 0.9f, 1.32f);
        pathBuilderD.curveToRelative(0.4f, 0.0f, 0.76f, -0.25f, 0.91f, -0.63f);
        pathBuilderD.lineTo(5.67f, 13.0f);
        pathBuilderD.horizontalLineToRelative(5.64f);
        pathBuilderD.lineToRelative(0.9f, 2.38f);
        pathBuilderD.curveToRelative(0.15f, 0.37f, 0.51f, 0.62f, 0.91f, 0.62f);
        androidx.compose.animation.a.t(pathBuilderD, 6.43f, 11.0f, 8.5f, 5.48f);
        android.support.v4.media.a.C(pathBuilderD, 10.57f, 11.0f, 6.43f, 11.0f);
        pathBuilderD.moveTo(20.89f, 12.29f);
        pathBuilderD.lineToRelative(-7.39f, 7.39f);
        pathBuilderD.lineToRelative(-2.97f, -2.97f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(3.68f, 3.68f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(8.08f, -8.09f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.curveToRelative(-0.38f, -0.39f, -1.02f, -0.39f, -1.4f, -0.01f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spellcheck = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
