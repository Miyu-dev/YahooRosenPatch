package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: DirectionsBike.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBike", "Landroidx/compose/material/icons/Icons$Filled;", "getDirectionsBike", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsBikeKt {
    private static ImageVector _directionsBike;

    public static final ImageVector getDirectionsBike(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _directionsBike;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirectionsBike", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.5f, 5.5f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.0f, 12.0f);
        pathBuilderD.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.0f, 20.5f);
        pathBuilderD.curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f);
        pathBuilderD.reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f);
        pathBuilderD.reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f);
        a.y(pathBuilderD, 10.8f, 10.5f, 2.4f, -2.4f);
        pathBuilderD.lineToRelative(0.8f, 0.8f);
        pathBuilderD.curveToRelative(1.3f, 1.3f, 3.0f, 2.1f, 5.1f, 2.1f);
        pathBuilderD.lineTo(19.1f, 9.0f);
        pathBuilderD.curveToRelative(-1.5f, 0.0f, -2.7f, -0.6f, -3.6f, -1.5f);
        pathBuilderD.lineToRelative(-1.9f, -1.9f);
        pathBuilderD.curveToRelative(-0.5f, -0.4f, -1.0f, -0.6f, -1.6f, -0.6f);
        pathBuilderD.reflectiveCurveToRelative(-1.1f, 0.2f, -1.4f, 0.6f);
        pathBuilderD.lineTo(7.8f, 8.4f);
        pathBuilderD.curveToRelative(-0.4f, 0.4f, -0.6f, 0.9f, -0.6f, 1.4f);
        pathBuilderD.curveToRelative(0.0f, 0.6f, 0.2f, 1.1f, 0.6f, 1.4f);
        b.s(pathBuilderD, 11.0f, 14.0f, 5.0f, 2.0f);
        v.v(pathBuilderD, -6.2f, -2.2f, -2.3f);
        pathBuilderD.moveTo(19.0f, 12.0f);
        pathBuilderD.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 20.5f);
        pathBuilderD.curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f);
        pathBuilderD.reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -1.6f, 3.5f, -3.5f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBike = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
