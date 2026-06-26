package androidx.compose.material.icons.rounded;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Church.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_church", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Church", "Landroidx/compose/material/icons/Icons$Rounded;", "getChurch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChurchKt {
    private static ImageVector _church;

    public static final ImageVector getChurch(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _church;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Church", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(18.0f, 12.22f, -1.99f);
        pathBuilderE.curveToRelative(0.0f, -0.76f, -0.43f, -1.45f, -1.11f, -1.79f);
        androidx.appcompat.app.m.r(pathBuilderE, 13.0f, 6.5f, 5.0f, 1.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderE.verticalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderE.horizontalLineToRelative(-1.0f);
        pathBuilderE.verticalLineTo(2.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderE.horizontalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(1.0f);
        pathBuilderE.horizontalLineToRelative(-1.0f);
        pathBuilderE.curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f);
        pathBuilderE.verticalLineToRelative(0.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.w(pathBuilderE, 1.0f, 1.5f, 7.11f, 8.45f);
        pathBuilderE.curveTo(6.43f, 8.79f, 6.0f, 9.48f, 6.0f, 10.24f);
        pathBuilderE.verticalLineToRelative(1.99f);
        pathBuilderE.lineToRelative(-2.81f, 1.25f);
        pathBuilderE.curveTo(2.47f, 13.79f, 2.0f, 14.51f, 2.0f, 15.3f);
        pathBuilderE.verticalLineTo(20.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(6.0f);
        pathBuilderE.lineToRelative(0.0f, -2.89f);
        pathBuilderE.curveToRelative(0.0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f);
        pathBuilderE.curveTo(12.92f, 16.82f, 14.0f, 17.79f, 14.0f, 19.0f);
        pathBuilderE.verticalLineToRelative(3.0f);
        pathBuilderE.horizontalLineToRelative(6.0f);
        pathBuilderE.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderE.verticalLineToRelative(-4.7f);
        pathBuilderE.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderE, 18.0f, 12.22f, 12.0f, 13.5f);
        pathBuilderE.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderE.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderE, 12.83f, 13.5f, 12.0f, 13.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _church = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
