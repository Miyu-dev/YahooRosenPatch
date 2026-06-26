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

/* JADX INFO: compiled from: OfflineBolt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_offlineBolt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OfflineBolt", "Landroidx/compose/material/icons/Icons$Outlined;", "getOfflineBolt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.OfflineBolt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.02f);
        pathBuilderD.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilderD.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilderD.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilderD.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 19.98f);
        pathBuilderD.curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f);
        pathBuilderD.reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f);
        pathBuilderD.reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f);
        pathBuilderD.reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f);
        a.y(pathBuilderD, 12.75f, 5.0f, -4.5f, 8.5f);
        pathBuilderD.horizontalLineToRelative(3.14f);
        pathBuilderD.lineTo(11.39f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.h(pathBuilderD, 4.36f, -8.5f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
