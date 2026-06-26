package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
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
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SportsVolleyball.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsVolleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsVolleyball", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsVolleyball", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsVolleyballKt {
    private static ImageVector _sportsVolleyball;

    public static final ImageVector getSportsVolleyball(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sportsVolleyball;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsVolleyball", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.0f, 4.07f);
        pathBuilderD.curveToRelative(3.07f, 0.38f, 5.57f, 2.52f, 6.54f, 5.36f);
        h.y(pathBuilderD, 13.0f, 5.65f, 4.07f);
        pathBuilderD.moveTo(8.0f, 5.08f);
        pathBuilderD.curveToRelative(1.18f, -0.69f, 3.33f, -1.06f, 3.0f, -1.02f);
        f.f(pathBuilderD, 7.35f, -3.0f, 1.73f, 5.08f);
        pathBuilderD.moveTo(4.63f, 15.1f);
        pathBuilderD.curveTo(4.23f, 14.14f, 4.0f, 13.1f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.02f, 0.76f, -3.86f, 2.0f, -5.27f);
        h.q(pathBuilderD, 7.58f, 4.63f, 15.1f);
        pathBuilderD.moveTo(5.64f, 16.83f);
        pathBuilderD.lineTo(12.0f, 13.15f);
        pathBuilderD.lineToRelative(3.0f, 1.73f);
        pathBuilderD.lineToRelative(-6.98f, 4.03f);
        pathBuilderD.curveTo(7.09f, 18.38f, 6.28f, 17.68f, 5.64f, 16.83f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.42f, 19.84f);
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-0.54f, 0.0f, -1.07f, -0.06f, -1.58f, -0.16f);
        pathBuilderD.lineToRelative(6.58f, -3.8f);
        pathBuilderD.lineToRelative(1.36f, 0.78f);
        pathBuilderD.curveTo(16.9f, 18.75f, 14.6f, 20.0f, 12.0f, 20.0f);
        h.A(pathBuilderD, 13.0f, 11.42f, 7.96f);
        pathBuilderD.lineToRelative(7.0f, 4.05f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.23f, 2.14f, -0.63f, 3.09f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 13.0f, 11.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsVolleyball = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
