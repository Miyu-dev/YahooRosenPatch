package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Crib.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_crib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Crib", "Landroidx/compose/material/icons/Icons$Outlined;", "getCrib", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Crib", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(18.0f, 9.0f, -6.0f, 4.0f, 8.0f);
        pathBuilderQ.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilderQ.verticalLineToRelative(6.0f);
        pathBuilderQ.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderQ.horizontalLineToRelative(2.0f);
        pathBuilderQ.verticalLineToRelative(2.93f);
        pathBuilderQ.curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f);
        pathBuilderQ.lineToRelative(-1.42f, 1.42f);
        pathBuilderQ.curveTo(6.74f, 20.88f, 9.24f, 22.0f, 12.0f, 22.0f);
        pathBuilderQ.curveToRelative(2.76f, 0.0f, 5.26f, -1.12f, 7.07f, -2.93f);
        pathBuilderQ.lineToRelative(-1.42f, -1.42f);
        pathBuilderQ.curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f);
        pathBuilderQ.verticalLineTo(16.0f);
        pathBuilderQ.horizontalLineToRelative(2.0f);
        pathBuilderQ.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderQ.verticalLineToRelative(-3.0f);
        pathBuilderQ.curveTo(20.0f, 9.9f, 19.1f, 9.0f, 18.0f, 9.0f);
        pathBuilderQ.close();
        pathBuilderQ.moveTo(14.0f, 19.75f);
        pathBuilderQ.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        pathBuilderQ.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        androidx.appcompat.view.menu.a.v(pathBuilderQ, 16.0f, 4.0f, 19.75f);
        a.B(pathBuilderQ, 18.0f, 14.0f, 6.0f, 8.0f);
        pathBuilderQ.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderQ, 2.0f, 5.0f, 8.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
