package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: PropaneTank.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_propaneTank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PropaneTank", "Landroidx/compose/material/icons/Icons$Rounded;", "getPropaneTank", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PropaneTankKt {
    private static ImageVector _propaneTank;

    public static final ImageVector getPropaneTank(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _propaneTank;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PropaneTank", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(4.0f, 15.0f, 3.0f);
        pathBuilderE.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderE.horizontalLineToRelative(8.0f);
        pathBuilderE.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.m(pathBuilderE, -3.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE2 = androidx.appcompat.app.m.e(20.0f, 13.0f, -3.0f);
        pathBuilderE2.curveToRelative(0.0f, -1.86f, -1.28f, -3.41f, -3.0f, -3.86f);
        pathBuilderE2.verticalLineTo(4.0f);
        pathBuilderE2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderE2.horizontalLineTo(9.0f);
        pathBuilderE2.curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
        pathBuilderE2.verticalLineToRelative(2.14f);
        pathBuilderE2.curveToRelative(-1.72f, 0.45f, -3.0f, 2.0f, -3.0f, 3.86f);
        h.z(pathBuilderE2, 3.0f, 20.0f, 9.0f, 4.0f);
        android.support.v4.media.a.s(pathBuilderE2, 6.0f, 2.0f, -2.0f);
        pathBuilderE2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderE2.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderE2, 9.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _propaneTank = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
