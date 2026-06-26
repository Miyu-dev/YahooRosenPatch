package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: RestorePage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_restorePage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RestorePage", "Landroidx/compose/material/icons/Icons$Rounded;", "getRestorePage", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RestorePageKt {
    private static ImageVector _restorePage;

    public static final ImageVector getRestorePage(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _restorePage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RestorePage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.41f, 7.41f, -4.83f, -4.83f);
        pathBuilderA.curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.lineTo(4.0f, 20.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderA.horizontalLineTo(18.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineTo(8.83f);
        pathBuilderA.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 18.0f);
        pathBuilderA.curveToRelative(-1.65f, 0.0f, -3.19f, -0.81f, -4.12f, -2.17f);
        pathBuilderA.curveToRelative(-0.23f, -0.34f, -0.15f, -0.81f, 0.19f, -1.04f);
        pathBuilderA.curveToRelative(0.34f, -0.24f, 0.81f, -0.15f, 1.04f, 0.19f);
        pathBuilderA.curveToRelative(0.65f, 0.95f, 1.73f, 1.52f, 2.88f, 1.52f);
        pathBuilderA.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderA.reflectiveCurveTo(13.93f, 9.5f, 12.0f, 9.5f);
        pathBuilderA.curveToRelative(-1.33f, 0.0f, -2.52f, 0.74f, -3.11f, 1.89f);
        pathBuilderA.lineTo(10.5f, 13.0f);
        pathBuilderA.horizontalLineTo(7.0f);
        pathBuilderA.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderA.verticalLineTo(9.0f);
        pathBuilderA.lineToRelative(1.3f, 1.3f);
        pathBuilderA.curveTo(8.71f, 8.89f, 10.26f, 8.0f, 12.0f, 8.0f);
        pathBuilderA.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderA, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restorePage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
