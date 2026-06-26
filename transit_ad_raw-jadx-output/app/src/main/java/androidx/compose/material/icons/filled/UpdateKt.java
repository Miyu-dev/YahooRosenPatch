package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Update.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_update", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Update", "Landroidx/compose/material/icons/Icons$Filled;", "getUpdate", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _update;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Update", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(21.0f, 10.12f, -6.78f, 2.74f, -2.82f);
        pathBuilderA.curveToRelative(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f);
        pathBuilderA.curveToRelative(-2.73f, 2.71f, -2.73f, 7.08f, 0.0f, 9.79f);
        pathBuilderA.reflectiveCurveToRelative(7.15f, 2.71f, 9.88f, 0.0f);
        pathBuilderA.curveTo(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(0.0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f);
        pathBuilderA.curveToRelative(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0.0f);
        pathBuilderA.curveToRelative(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f);
        pathBuilderA.reflectiveCurveToRelative(9.14f, -3.47f, 12.65f, 0.0f);
        h.y(pathBuilderA, 21.0f, 3.0f, 10.12f);
        pathBuilderA.moveTo(12.5f, 8.0f);
        pathBuilderA.verticalLineToRelative(4.25f);
        pathBuilderA.lineToRelative(3.5f, 2.08f);
        pathBuilderA.lineToRelative(-0.72f, 1.21f);
        pathBuilderA.lineTo(11.0f, 13.0f);
        pathBuilderA.verticalLineTo(8.0f);
        pathBuilderA.horizontalLineTo(12.5f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
