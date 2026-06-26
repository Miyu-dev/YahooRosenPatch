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

/* JADX INFO: compiled from: HealthAndSafety.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_healthAndSafety", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HealthAndSafety", "Landroidx/compose/material/icons/Icons$Rounded;", "getHealthAndSafety", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HealthAndSafetyKt {
    private static ImageVector _healthAndSafety;

    public static final ImageVector getHealthAndSafety(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _healthAndSafety;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HealthAndSafety", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(10.5f, 13.0f, -1.0f);
        pathBuilderB.curveTo(8.67f, 13.0f, 8.0f, 12.33f, 8.0f, 11.5f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(8.0f, 10.67f, 8.67f, 10.0f, 9.5f, 10.0f);
        pathBuilderB.horizontalLineToRelative(1.0f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderB.verticalLineToRelative(1.0f);
        pathBuilderB.horizontalLineToRelative(1.0f);
        pathBuilderB.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderB.horizontalLineToRelative(-1.0f);
        pathBuilderB.verticalLineToRelative(1.0f);
        pathBuilderB.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        a.y(pathBuilderB, 13.0f, 11.3f, 2.26f);
        pathBuilderB.lineToRelative(-6.0f, 2.25f);
        pathBuilderB.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        pathBuilderB.verticalLineToRelative(4.7f);
        pathBuilderB.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilderB.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        pathBuilderB.verticalLineToRelative(-4.7f);
        pathBuilderB.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        pathBuilderB.lineToRelative(-6.0f, -2.25f);
        pathBuilderB.curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _healthAndSafety = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
