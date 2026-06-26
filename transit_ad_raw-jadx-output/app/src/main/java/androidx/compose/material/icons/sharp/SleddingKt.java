package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Sledding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sledding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sledding", "Landroidx/compose/material/icons/Icons$Sharp;", "getSledding", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SleddingKt {
    private static ImageVector _sledding;

    public static final ImageVector getSledding(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _sledding;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sledding", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.0f, 4.5f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(14.0f, 3.4f, 14.0f, 4.5f);
        a.y(pathBuilderD, 17.22f, 17.9f, 1.93f, 0.63f);
        pathBuilderD.lineToRelative(-0.46f, 1.43f);
        pathBuilderD.lineToRelative(-3.32f, -1.08f);
        pathBuilderD.lineTo(14.9f, 20.3f);
        pathBuilderD.lineToRelative(3.32f, 1.08f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f);
        pathBuilderD.curveToRelative(0.43f, -1.31f, -0.29f, -2.72f, -1.61f, -3.15f);
        pathBuilderD.lineToRelative(0.46f, -1.43f);
        pathBuilderD.curveToRelative(2.1f, 0.68f, 3.25f, 2.94f, 2.57f, 5.04f);
        pathBuilderD.curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.lineTo(1.0f, 17.36f);
        pathBuilderD.lineToRelative(0.46f, -1.43f);
        pathBuilderD.lineToRelative(3.93f, 1.28f);
        pathBuilderD.lineToRelative(0.46f, -1.43f);
        pathBuilderD.lineTo(1.93f, 14.5f);
        pathBuilderD.lineToRelative(0.46f, -1.43f);
        pathBuilderD.lineTo(4.0f, 13.6f);
        pathBuilderD.verticalLineTo(9.5f);
        pathBuilderD.lineToRelative(5.47f, -2.35f);
        pathBuilderD.curveToRelative(0.39f, -0.17f, 0.84f, -0.21f, 1.28f, -0.07f);
        pathBuilderD.curveToRelative(0.95f, 0.31f, 1.46f, 1.32f, 1.16f, 2.27f);
        pathBuilderD.lineToRelative(-1.05f, 3.24f);
        android.support.v4.media.a.C(pathBuilderD, 14.5f, 12.0f, 17.22f, 17.9f);
        pathBuilderD.moveTo(6.0f, 14.25f);
        pathBuilderD.lineToRelative(0.48f, 0.16f);
        pathBuilderD.lineToRelative(0.75f, -2.31f);
        pathBuilderD.lineTo(7.92f, 10.0f);
        h.y(pathBuilderD, 6.0f, 10.82f, 14.25f);
        pathBuilderD.moveTo(13.94f, 18.41f);
        pathBuilderD.lineToRelative(-6.66f, -2.16f);
        pathBuilderD.lineToRelative(-0.46f, 1.43f);
        s.r(pathBuilderD, 6.66f, 2.16f, 13.94f, 18.41f);
        pathBuilderD.moveTo(14.63f, 17.05f);
        pathBuilderD.lineToRelative(-1.18f, -2.56f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, -3.97f, 0.89f, 14.63f, 17.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sledding = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
