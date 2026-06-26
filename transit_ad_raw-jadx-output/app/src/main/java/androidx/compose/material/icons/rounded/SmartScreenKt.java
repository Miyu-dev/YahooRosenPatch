package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SmartScreen.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_smartScreen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SmartScreen", "Landroidx/compose/material/icons/Icons$Rounded;", "getSmartScreen", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SmartScreenKt {
    private static ImageVector _smartScreen;

    public static final ImageVector getSmartScreen(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _smartScreen;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SmartScreen", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 5.0f, 3.0f);
        pathBuilderB.curveTo(1.9f, 5.0f, 1.0f, 5.9f, 1.0f, 7.0f);
        pathBuilderB.verticalLineToRelative(10.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(7.0f);
        pathBuilderB.curveTo(23.0f, 5.9f, 22.1f, 5.0f, 21.0f, 5.0f);
        a.x(pathBuilderB, 18.0f, 7.0f, 10.0f, 6.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderB, 7.0f, 18.0f, 14.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderB.reflectiveCurveTo(12.5f, 11.59f, 12.5f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderB.reflectiveCurveTo(14.0f, 12.41f, 14.0f, 12.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(9.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderB.reflectiveCurveTo(7.5f, 11.59f, 7.5f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderB.reflectiveCurveTo(9.0f, 12.41f, 9.0f, 12.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(16.5f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderB.reflectiveCurveTo(15.0f, 11.59f, 15.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderB.reflectiveCurveTo(16.5f, 12.41f, 16.5f, 12.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(11.5f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderB.reflectiveCurveTo(10.0f, 11.59f, 10.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderB, 11.5f, 12.41f, 11.5f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartScreen = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
