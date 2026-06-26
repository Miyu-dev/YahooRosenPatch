package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: BabyChangingStation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_babyChangingStation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BabyChangingStation", "Landroidx/compose/material/icons/Icons$Outlined;", "getBabyChangingStation", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BabyChangingStationKt {
    private static ImageVector _babyChangingStation;

    public static final ImageVector getBabyChangingStation(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _babyChangingStation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BabyChangingStation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(14.0f, 8.0f, 2.0f, -3.0f);
        pathBuilderE.lineTo(8.31f, 8.82f);
        a.D(pathBuilderE, 7.0f, 12.75f, 22.0f, 3.0f);
        pathBuilderE.verticalLineTo(12.0f);
        pathBuilderE.lineToRelative(1.58f, -4.63f);
        pathBuilderE.curveTo(4.96f, 6.25f, 6.22f, 5.69f, 7.3f, 6.18f);
        s.r(pathBuilderE, 4.15f, 1.83f, 14.0f, 8.0f);
        pathBuilderE.moveTo(8.0f, 1.0f);
        pathBuilderE.curveTo(6.9f, 1.0f, 6.0f, 1.9f, 6.0f, 3.0f);
        pathBuilderE.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderE.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.reflectiveCurveTo(9.1f, 1.0f, 8.0f, 1.0f);
        b.r(pathBuilderE, 9.0f, 19.0f, 12.0f, -2.0f);
        a.b.B(pathBuilderE, 9.0f, 19.0f, 19.5f, 16.0f);
        pathBuilderE.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderE.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveTo(18.0f, 13.67f, 18.0f, 14.5f);
        pathBuilderE.curveTo(18.0f, 15.33f, 18.67f, 16.0f, 19.5f, 16.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(13.0f, 12.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.B(pathBuilderE, 9.0f, 2.0f, 2.0f, 1.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(2.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.l(pathBuilderE, -3.0f, -2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderE, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _babyChangingStation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
