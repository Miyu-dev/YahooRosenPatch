package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NordicWalking.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nordicWalking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NordicWalking", "Landroidx/compose/material/icons/Icons$Filled;", "getNordicWalking", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NordicWalkingKt {
    private static ImageVector _nordicWalking;

    public static final ImageVector getNordicWalking(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _nordicWalking;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NordicWalking", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(19.0f, 23.0f, -1.5f, -9.0f, 19.0f);
        a.y(pathBuilderI, 23.0f, 7.53f, 14.0f, 6.0f);
        pathBuilderI.lineToRelative(-2.0f, 9.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderI, 1.53f, 7.53f, 14.0f);
        pathBuilderI.moveTo(13.5f, 5.5f);
        pathBuilderI.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderI.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderI.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderI.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        a.t(pathBuilderI, 9.8f, 8.9f, 7.0f, 23.0f);
        pathBuilderI.horizontalLineToRelative(2.1f);
        pathBuilderI.lineToRelative(1.8f, -8.0f);
        v.u(pathBuilderI, 2.1f, 2.0f, 6.0f, 2.0f);
        pathBuilderI.verticalLineToRelative(-7.5f);
        pathBuilderI.lineToRelative(-2.1f, -2.0f);
        pathBuilderI.lineToRelative(0.6f, -3.0f);
        pathBuilderI.curveTo(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f);
        pathBuilderI.verticalLineToRelative(-2.0f);
        pathBuilderI.curveToRelative(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f);
        pathBuilderI.lineToRelative(-1.0f, -1.6f);
        pathBuilderI.curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f);
        androidx.appcompat.app.m.r(pathBuilderI, 6.0f, 8.3f, 13.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.v(pathBuilderI, 9.6f, 9.8f, 8.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nordicWalking = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
