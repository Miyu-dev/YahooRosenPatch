package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: CellWifi.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cellWifi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellWifi", "Landroidx/compose/material/icons/Icons$Filled;", "getCellWifi", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CellWifiKt {
    private static ImageVector _cellWifi;

    public static final ImageVector getCellWifi(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _cellWifi;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CellWifi", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(18.0f, 9.98f, 6.0f, 22.0f, 12.0f);
        androidx.browser.browseractions.a.s(pathBuilderL, 4.0f, 5.97f, 18.0f, 9.98f);
        androidx.appcompat.view.menu.a.x(pathBuilderL, 20.0f, 20.0f, -2.0f, -7.22f);
        c.a.g(pathBuilderL, 2.0f, -2.0f, 20.0f);
        pathBuilderL.moveTo(5.22f, 7.22f);
        pathBuilderL.lineTo(3.93f, 5.93f);
        pathBuilderL.curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0.0f);
        pathBuilderL.lineToRelative(-1.29f, 1.29f);
        pathBuilderL.curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f);
        androidx.compose.animation.a.t(pathBuilderL, 12.93f, 11.07f, 11.0f, 13.0f);
        pathBuilderL.lineToRelative(-1.93f, -1.93f);
        pathBuilderL.curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f);
        pathBuilderL.close();
        pathBuilderL.moveTo(14.22f, 9.79f);
        pathBuilderL.curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0.0f);
        pathBuilderL.lineTo(6.5f, 8.5f);
        pathBuilderL.curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderL, 14.22f, 9.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellWifi = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
