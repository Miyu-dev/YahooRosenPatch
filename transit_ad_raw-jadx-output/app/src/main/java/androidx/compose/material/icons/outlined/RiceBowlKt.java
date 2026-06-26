package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: RiceBowl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_riceBowl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RiceBowl", "Landroidx/compose/material/icons/Icons$Outlined;", "getRiceBowl", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RiceBowlKt {
    private static ImageVector _riceBowl;

    public static final ImageVector getRiceBowl(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _riceBowl;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RiceBowl", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.66f, 14.0f);
        pathBuilderD.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        androidx.appcompat.app.m.r(pathBuilderD, 14.0f, 18.88f, 20.0f, -4.0f);
        pathBuilderD.verticalLineToRelative(-1.12f);
        pathBuilderD.lineToRelative(-1.27f, -0.5f);
        pathBuilderD.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        pathBuilderD.horizontalLineTo(19.66f);
        pathBuilderD.moveTo(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        v.r(pathBuilderD, 22.0f, 8.0f, -1.75f);
        pathBuilderD.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 12.0f, 2.0f, 10.0f, 12.0f);
        pathBuilderD.verticalLineTo(4.26f);
        pathBuilderD.curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(1.36f, 0.1f, 2.0f, 0.26f);
        pathBuilderD.verticalLineTo(12.0f);
        pathBuilderD.horizontalLineTo(10.0f);
        pathBuilderD.lineTo(10.0f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.0f, 12.0f);
        pathBuilderD.verticalLineTo(5.08f);
        pathBuilderD.curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 16.0f, 16.0f, 12.0f);
        pathBuilderD.moveTo(4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        pathBuilderD.verticalLineTo(12.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.lineTo(4.0f, 12.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _riceBowl = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
