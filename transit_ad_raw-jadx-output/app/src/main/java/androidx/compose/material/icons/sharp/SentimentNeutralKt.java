package androidx.compose.material.icons.sharp;

import a.b;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SentimentNeutral.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sentimentNeutral", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SentimentNeutral", "Landroidx/compose/material/icons/Icons$Sharp;", "getSentimentNeutral", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SentimentNeutralKt {
    private static ImageVector _sentimentNeutral;

    public static final ImageVector getSentimentNeutral(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _sentimentNeutral;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SentimentNeutral", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.99f, 2.0f);
        pathBuilderD.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilderD.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.0f, 9.5f);
        pathBuilderD.curveTo(7.0f, 8.67f, 7.67f, 8.0f, 8.5f, 8.0f);
        pathBuilderD.reflectiveCurveTo(10.0f, 8.67f, 10.0f, 9.5f);
        pathBuilderD.reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f);
        pathBuilderD.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderD, 15.0f, 15.5f, 9.0f, 14.0f);
        b.m(pathBuilderD, 6.0f, 15.5f, 15.5f, 11.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f);
        pathBuilderD.reflectiveCurveTo(17.0f, 8.67f, 17.0f, 9.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 16.33f, 11.0f, 15.5f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentNeutral = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
