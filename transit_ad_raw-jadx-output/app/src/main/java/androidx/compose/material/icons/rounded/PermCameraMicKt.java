package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: PermCameraMic.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_permCameraMic", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PermCameraMic", "Landroidx/compose/material/icons/Icons$Rounded;", "getPermCameraMic", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PermCameraMicKt {
    private static ImageVector _permCameraMic;

    public static final ImageVector getPermCameraMic(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _permCameraMic;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PermCameraMic", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(20.0f, 5.0f, -3.17f, -1.24f, -1.35f);
        pathBuilderA.curveToRelative(-0.37f, -0.41f, -0.91f, -0.65f, -1.47f, -0.65f);
        pathBuilderA.lineTo(9.88f, 3.0f);
        pathBuilderA.curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f);
        pathBuilderA.lineTo(7.17f, 5.0f);
        pathBuilderA.lineTo(4.0f, 5.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(12.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(7.0f);
        pathBuilderA.verticalLineToRelative(-2.09f);
        pathBuilderA.curveToRelative(-2.45f, -0.42f, -4.41f, -2.32f, -4.89f, -4.75f);
        pathBuilderA.curveToRelative(-0.12f, -0.61f, 0.38f, -1.16f, 0.99f, -1.16f);
        pathBuilderA.curveToRelative(0.49f, 0.0f, 0.88f, 0.35f, 0.98f, 0.83f);
        pathBuilderA.curveTo(8.47f, 15.64f, 10.07f, 17.0f, 12.0f, 17.0f);
        pathBuilderA.reflectiveCurveToRelative(3.53f, -1.36f, 3.91f, -3.17f);
        pathBuilderA.curveToRelative(0.1f, -0.48f, 0.5f, -0.83f, 0.98f, -0.83f);
        pathBuilderA.curveToRelative(0.61f, 0.0f, 1.11f, 0.55f, 0.99f, 1.16f);
        pathBuilderA.curveToRelative(-0.48f, 2.43f, -2.44f, 4.34f, -4.89f, 4.75f);
        pathBuilderA.lineTo(12.99f, 21.0f);
        pathBuilderA.horizontalLineToRelative(7.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(21.99f, 7.0f);
        pathBuilderA.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(14.0f, 13.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.lineTo(10.0f, 9.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderA, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permCameraMic = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
