package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: BackHand.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_backHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BackHand", "Landroidx/compose/material/icons/Icons$Outlined;", "getBackHand", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BackHandKt {
    private static ImageVector _backHand;

    public static final ImageVector getBackHand(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _backHand;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BackHand", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD.curveToRelative(-0.23f, 0.0f, -0.46f, 0.03f, -0.67f, 0.09f);
        pathBuilderD.curveTo(14.46f, 0.66f, 13.56f, 0.0f, 12.5f, 0.0f);
        pathBuilderD.curveToRelative(-1.23f, 0.0f, -2.25f, 0.89f, -2.46f, 2.06f);
        pathBuilderD.curveTo(9.87f, 2.02f, 9.69f, 2.0f, 9.5f, 2.0f);
        pathBuilderD.curveTo(8.12f, 2.0f, 7.0f, 3.12f, 7.0f, 4.5f);
        pathBuilderD.verticalLineToRelative(5.89f);
        pathBuilderD.curveToRelative(-0.34f, -0.31f, -0.76f, -0.54f, -1.22f, -0.66f);
        pathBuilderD.lineTo(5.01f, 9.52f);
        pathBuilderD.curveToRelative(-0.83f, -0.23f, -1.7f, 0.09f, -2.19f, 0.83f);
        pathBuilderD.curveToRelative(-0.38f, 0.57f, -0.4f, 1.31f, -0.15f, 1.95f);
        pathBuilderD.lineToRelative(2.56f, 6.43f);
        pathBuilderD.curveTo(6.49f, 21.91f, 9.57f, 24.0f, 13.0f, 24.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        android.support.v4.media.a.y(pathBuilderD, 7.0f, 19.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-2.61f, 0.0f, -4.95f, -1.59f, -5.91f, -4.01f);
        pathBuilderD.lineToRelative(-2.6f, -6.54f);
        pathBuilderD.lineToRelative(0.53f, 0.14f);
        pathBuilderD.curveToRelative(0.46f, 0.12f, 0.83f, 0.46f, 1.0f, 0.9f);
        v.n(pathBuilderD, 7.0f, 15.0f, 2.0f, 4.5f);
        pathBuilderD.curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f);
        pathBuilderD.reflectiveCurveTo(10.0f, 4.22f, 10.0f, 4.5f);
        h.w(pathBuilderD, 12.0f, 2.0f, 2.5f);
        pathBuilderD.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilderD.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        h.w(pathBuilderD, 12.0f, 2.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.reflectiveCurveTo(16.0f, 3.72f, 16.0f, 4.0f);
        s.l(pathBuilderD, 8.0f, 2.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.reflectiveCurveTo(19.0f, 6.72f, 19.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 19.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backHand = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
