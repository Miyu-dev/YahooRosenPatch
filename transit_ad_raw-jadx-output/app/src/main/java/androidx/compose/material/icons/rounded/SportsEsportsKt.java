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

/* JADX INFO: compiled from: SportsEsports.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsEsports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsEsports", "Landroidx/compose/material/icons/Icons$Rounded;", "getSportsEsports", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsEsportsKt {
    private static ImageVector _sportsEsports;

    public static final ImageVector getSportsEsports(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sportsEsports;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsEsports", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.58f, 16.09f, -1.09f, -7.66f);
        pathBuilderA.curveTo(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        pathBuilderA.horizontalLineTo(7.47f);
        pathBuilderA.curveTo(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        pathBuilderA.lineToRelative(-1.09f, 7.66f);
        pathBuilderA.curveTo(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.68f, 0.0f, 1.32f, -0.27f, 1.8f, -0.75f);
        pathBuilderA.lineTo(9.0f, 16.0f);
        pathBuilderA.horizontalLineToRelative(6.0f);
        pathBuilderA.lineToRelative(2.25f, 2.25f);
        pathBuilderA.curveToRelative(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveTo(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        a.q(pathBuilderA, 11.0f, 11.0f, 9.0f, 2.0f);
        s.B(pathBuilderA, 8.0f, -2.0f, 6.0f, -1.0f);
        androidx.appcompat.app.m.w(pathBuilderA, 2.0f, 8.0f, 1.0f, 2.0f);
        a.b.m(pathBuilderA, 2.0f, 11.0f, 15.0f, 10.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.curveTo(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.0f, 13.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.curveTo(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsEsports = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
