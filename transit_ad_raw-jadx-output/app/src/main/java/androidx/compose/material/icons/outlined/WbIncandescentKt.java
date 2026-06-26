package androidx.compose.material.icons.outlined;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: WbIncandescent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbIncandescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbIncandescent", "Landroidx/compose/material/icons/Icons$Outlined;", "getWbIncandescent", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbIncandescentKt {
    private static ImageVector _wbIncandescent;

    public static final ImageVector getWbIncandescent(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wbIncandescent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbIncandescent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(3.55f, 19.09f, 1.41f, 1.41f);
        a.n(pathBuilderA, 1.79f, -1.8f, -1.41f, -1.41f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 11.0f, 20.0f, 2.0f, 3.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderA, -2.0f, 1.0f, 11.0f, 3.0f);
        h.q(pathBuilderA, 2.0f, 1.0f, 13.0f);
        pathBuilderA.moveTo(13.0f, 4.05f);
        pathBuilderA.verticalLineToRelative(3.96f);
        pathBuilderA.lineToRelative(1.0f, 0.58f);
        pathBuilderA.curveToRelative(1.24f, 0.72f, 2.0f, 2.04f, 2.0f, 3.46f);
        pathBuilderA.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilderA.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderA.curveToRelative(0.0f, -1.42f, 0.77f, -2.74f, 2.0f, -3.46f);
        pathBuilderA.lineToRelative(1.0f, -0.58f);
        pathBuilderA.lineTo(11.0f, 4.05f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.moveToRelative(2.0f, -2.0f);
        pathBuilderA.lineTo(9.0f, 2.05f);
        pathBuilderA.verticalLineToRelative(4.81f);
        pathBuilderA.curveTo(7.21f, 7.9f, 6.0f, 9.83f, 6.0f, 12.05f);
        pathBuilderA.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilderA.curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 15.0f, 2.05f, 20.0f, 11.0f);
        b.t(pathBuilderA, 3.0f, 2.0f, -3.0f);
        pathBuilderA.moveTo(17.24f, 18.71f);
        pathBuilderA.lineToRelative(1.79f, 1.8f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 1.41f, -1.41f, -1.8f, -1.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIncandescent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
