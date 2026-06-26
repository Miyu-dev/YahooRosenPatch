package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: SettingsSuggest.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsSuggest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsSuggest", "Landroidx/compose/material/icons/Icons$Filled;", "getSettingsSuggest", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsSuggestKt {
    private static ImageVector _settingsSuggest;

    public static final ImageVector getSettingsSuggest(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsSuggest", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.41f, 6.59f, 15.0f, 5.5f);
        pathBuilderA.lineToRelative(2.41f, -1.09f);
        pathBuilderA.lineTo(18.5f, 2.0f);
        pathBuilderA.lineToRelative(1.09f, 2.41f);
        pathBuilderA.lineTo(22.0f, 5.5f);
        pathBuilderA.lineToRelative(-2.41f, 1.09f);
        a.C(pathBuilderA, 18.5f, 9.0f, 17.41f, 6.59f);
        pathBuilderA.moveTo(21.28f, 12.72f);
        pathBuilderA.lineTo(20.5f, 11.0f);
        pathBuilderA.lineToRelative(-0.78f, 1.72f);
        pathBuilderA.lineTo(18.0f, 13.5f);
        pathBuilderA.lineToRelative(1.72f, 0.78f);
        pathBuilderA.lineTo(20.5f, 16.0f);
        pathBuilderA.lineToRelative(0.78f, -1.72f);
        a.C(pathBuilderA, 23.0f, 13.5f, 21.28f, 12.72f);
        pathBuilderA.moveTo(16.24f, 14.37f);
        pathBuilderA.lineToRelative(1.94f, 1.47f);
        pathBuilderA.lineToRelative(-2.5f, 4.33f);
        pathBuilderA.lineToRelative(-2.24f, -0.94f);
        pathBuilderA.curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f);
        pathBuilderA.lineTo(12.5f, 22.0f);
        pathBuilderA.horizontalLineToRelative(-5.0f);
        pathBuilderA.lineToRelative(-0.3f, -2.41f);
        pathBuilderA.curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f);
        pathBuilderA.lineToRelative(-2.24f, 0.94f);
        pathBuilderA.lineToRelative(-2.5f, -4.33f);
        pathBuilderA.lineToRelative(1.94f, -1.47f);
        pathBuilderA.curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f);
        pathBuilderA.reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f);
        pathBuilderA.lineToRelative(-1.94f, -1.47f);
        pathBuilderA.lineToRelative(2.5f, -4.33f);
        pathBuilderA.lineToRelative(2.24f, 0.94f);
        pathBuilderA.curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f);
        pathBuilderA.lineTo(7.5f, 6.0f);
        pathBuilderA.horizontalLineToRelative(5.0f);
        pathBuilderA.lineToRelative(0.3f, 2.41f);
        pathBuilderA.curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f);
        pathBuilderA.lineToRelative(2.24f, -0.94f);
        pathBuilderA.lineToRelative(2.5f, 4.33f);
        pathBuilderA.lineToRelative(-1.94f, 1.47f);
        pathBuilderA.curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f);
        pathBuilderA.reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f);
        pathBuilderA.close();
        pathBuilderA.moveTo(13.0f, 14.0f);
        pathBuilderA.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderA.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 13.0f, 15.66f, 13.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
