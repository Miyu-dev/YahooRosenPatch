package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: Update.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_update", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Update", "Landroidx/compose/material/icons/Icons$Rounded;", "getUpdate", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _update;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Update", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(11.0f, 8.75f, 3.68f);
        pathBuilderE.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        pathBuilderE.lineToRelative(3.12f, 1.85f);
        pathBuilderE.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        pathBuilderE.curveToRelative(0.21f, -0.36f, 0.1f, -0.82f, -0.26f, -1.03f);
        pathBuilderE.lineToRelative(-2.87f, -1.71f);
        pathBuilderE.verticalLineToRelative(-3.4f);
        pathBuilderE.curveTo(12.5f, 8.34f, 12.16f, 8.0f, 11.75f, 8.0f);
        pathBuilderE.reflectiveCurveTo(11.0f, 8.34f, 11.0f, 8.75f);
        h.A(pathBuilderE, 21.0f, 9.5f, 4.21f);
        pathBuilderE.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderE.lineToRelative(-1.78f, 1.78f);
        pathBuilderE.curveToRelative(-1.81f, -1.81f, -4.39f, -2.85f, -7.21f, -2.6f);
        pathBuilderE.curveToRelative(-4.19f, 0.38f, -7.64f, 3.75f, -8.1f, 7.94f);
        pathBuilderE.curveTo(2.46f, 16.4f, 6.69f, 21.0f, 12.0f, 21.0f);
        pathBuilderE.curveToRelative(4.59f, 0.0f, 8.38f, -3.44f, 8.93f, -7.88f);
        pathBuilderE.curveToRelative(0.07f, -0.6f, -0.4f, -1.12f, -1.0f, -1.12f);
        pathBuilderE.curveToRelative(-0.5f, 0.0f, -0.92f, 0.37f, -0.98f, 0.86f);
        pathBuilderE.curveToRelative(-0.43f, 3.49f, -3.44f, 6.19f, -7.05f, 6.14f);
        pathBuilderE.curveToRelative(-3.71f, -0.05f, -6.84f, -3.18f, -6.9f, -6.9f);
        pathBuilderE.curveTo(4.94f, 8.2f, 8.11f, 5.0f, 12.0f, 5.0f);
        pathBuilderE.curveToRelative(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
        pathBuilderE.lineToRelative(-2.09f, 2.09f);
        pathBuilderE.curveTo(14.54f, 9.46f, 14.76f, 10.0f, 15.21f, 10.0f);
        pathBuilderE.horizontalLineToRelative(5.29f);
        pathBuilderE.curveTo(20.78f, 10.0f, 21.0f, 9.78f, 21.0f, 9.5f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
