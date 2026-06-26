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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SentimentVeryDissatisfied.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sentimentVeryDissatisfied", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SentimentVeryDissatisfied", "Landroidx/compose/material/icons/Icons$Outlined;", "getSentimentVeryDissatisfied", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SentimentVeryDissatisfiedKt {
    private static ImageVector _sentimentVeryDissatisfied;

    public static final ImageVector getSentimentVeryDissatisfied(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sentimentVeryDissatisfied;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SentimentVeryDissatisfied", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 13.5f);
        pathBuilderD.curveToRelative(-2.33f, 0.0f, -4.31f, 1.46f, -5.11f, 3.5f);
        pathBuilderD.horizontalLineToRelative(10.22f);
        pathBuilderD.curveToRelative(-0.8f, -2.04f, -2.78f, -3.5f, -5.11f, -3.5f);
        a.y(pathBuilderD, 7.82f, 12.0f, 1.06f, -1.06f);
        pathBuilderD.lineTo(9.94f, 12.0f);
        pathBuilderD.lineTo(11.0f, 10.94f);
        pathBuilderD.lineTo(9.94f, 9.88f);
        pathBuilderD.lineTo(11.0f, 8.82f);
        pathBuilderD.lineTo(9.94f, 7.76f);
        pathBuilderD.lineTo(8.88f, 8.82f);
        pathBuilderD.lineTo(7.82f, 7.76f);
        pathBuilderD.lineTo(6.76f, 8.82f);
        android.support.v4.media.a.n(pathBuilderD, 1.06f, 1.06f, -1.06f, 1.06f);
        pathBuilderD.moveTo(11.99f, 2.0f);
        pathBuilderD.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilderD.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        a.y(pathBuilderD, 16.18f, 7.76f, -1.06f, 1.06f);
        pathBuilderD.lineToRelative(-1.06f, -1.06f);
        pathBuilderD.lineTo(13.0f, 8.82f);
        pathBuilderD.lineToRelative(1.06f, 1.06f);
        pathBuilderD.lineTo(13.0f, 10.94f);
        pathBuilderD.lineTo(14.06f, 12.0f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        pathBuilderD.lineTo(16.18f, 12.0f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, -1.06f, -1.06f, 1.06f, -1.06f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentVeryDissatisfied = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
