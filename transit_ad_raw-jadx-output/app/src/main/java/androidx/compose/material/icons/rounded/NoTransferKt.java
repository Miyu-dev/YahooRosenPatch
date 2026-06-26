package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: NoTransfer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noTransfer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoTransfer", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoTransfer", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoTransferKt {
    private static ImageVector _noTransfer;

    public static final ImageVector getNoTransfer(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _noTransfer;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoTransfer", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(5.78f, 2.95f);
        pathBuilderD.curveTo(7.24f, 2.16f, 9.48f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.curveToRelative(4.42f, 0.0f, 8.0f, 0.5f, 8.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(0.0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f);
        v.A(pathBuilderD, 13.83f, 11.0f, 18.0f, 6.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 8.83f, 5.78f, 2.95f);
        pathBuilderD.moveTo(20.49f, 21.9f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-1.01f, -1.01f);
        pathBuilderD.curveTo(17.89f, 20.96f, 17.7f, 21.0f, 17.5f, 21.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f);
        androidx.appcompat.graphics.drawable.a.o(pathBuilderD, 19.0f, 8.0f, 0.5f);
        pathBuilderD.curveTo(8.0f, 20.33f, 7.33f, 21.0f, 6.5f, 21.0f);
        pathBuilderD.reflectiveCurveTo(5.0f, 20.33f, 5.0f, 19.5f);
        pathBuilderD.verticalLineToRelative(-1.28f);
        pathBuilderD.curveTo(4.39f, 17.67f, 4.0f, 16.88f, 4.0f, 16.0f);
        pathBuilderD.verticalLineTo(6.83f);
        pathBuilderD.lineToRelative(-1.9f, -1.9f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(16.97f, 16.97f);
        pathBuilderD.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.0f, 15.5f);
        pathBuilderD.curveTo(9.0f, 14.67f, 8.33f, 14.0f, 7.5f, 14.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 14.67f, 6.0f, 15.5f);
        pathBuilderD.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 16.33f, 9.0f, 15.5f);
        androidx.compose.animation.a.t(pathBuilderD, 8.17f, 11.0f, 6.0f, 8.83f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderD, 11.0f, 8.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noTransfer = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
