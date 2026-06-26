package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_token", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Token", "Landroidx/compose/material/icons/Icons$Rounded;", "getToken", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _token;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Token", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.97f, 2.54f);
        pathBuilderD.curveToRelative(-0.6f, -0.34f, -1.34f, -0.34f, -1.94f, 0.0f);
        pathBuilderD.lineToRelative(-7.0f, 3.89f);
        pathBuilderD.lineTo(9.1f, 9.24f);
        pathBuilderD.curveTo(9.83f, 8.48f, 10.86f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(2.17f, 0.48f, 2.9f, 1.24f);
        s.r(pathBuilderD, 5.07f, -2.82f, 12.97f, 2.54f);
        pathBuilderD.moveTo(10.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        a.y(pathBuilderD, 3.0f, 8.14f, 5.13f, 2.85f);
        pathBuilderD.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilderD.verticalLineToRelative(5.57f);
        pathBuilderD.lineToRelative(-6.97f, -3.87f);
        pathBuilderD.curveTo(3.39f, 17.22f, 3.0f, 16.55f, 3.0f, 15.82f);
        b.l(pathBuilderD, 8.14f, 13.0f, 21.44f, -5.57f);
        pathBuilderD.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilderD.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilderD.lineTo(21.0f, 8.14f);
        pathBuilderD.lineToRelative(0.0f, 7.68f);
        pathBuilderD.curveToRelative(0.0f, 0.73f, -0.39f, 1.4f, -1.03f, 1.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 13.0f, 21.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
