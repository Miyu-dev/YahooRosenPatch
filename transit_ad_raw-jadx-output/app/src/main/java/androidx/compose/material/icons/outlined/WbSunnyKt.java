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

/* JADX INFO: compiled from: WbSunny.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbSunny", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbSunny", "Landroidx/compose/material/icons/Icons$Outlined;", "getWbSunny", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbSunnyKt {
    private static ImageVector _wbSunny;

    public static final ImageVector getWbSunny(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wbSunny;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbSunny", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(6.76f, 4.84f, -1.8f, -1.79f);
        a.n(pathBuilderA, -1.41f, 1.41f, 1.79f, 1.79f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 1.0f, 10.5f, 3.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 1.0f, 12.5f, 11.0f, 0.55f);
        h.C(pathBuilderA, 2.0f, 13.0f, 3.5f, -2.0f);
        pathBuilderA.moveTo(19.04f, 3.045f);
        pathBuilderA.lineToRelative(1.408f, 1.407f);
        a.n(pathBuilderA, -1.79f, 1.79f, -1.407f, -1.408f);
        pathBuilderA.moveTo(17.24f, 18.16f);
        pathBuilderA.lineToRelative(1.79f, 1.8f);
        a.n(pathBuilderA, 1.41f, -1.41f, -1.8f, -1.79f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 20.0f, 10.5f, 3.0f, 2.0f);
        b.q(pathBuilderA, -3.0f, 12.0f, 5.5f);
        pathBuilderA.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderA.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 15.5f);
        pathBuilderA.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderA.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderA.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        b.r(pathBuilderA, 11.0f, 19.5f, 2.0f, 2.95f);
        b.q(pathBuilderA, -2.0f, 3.55f, 18.54f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 1.79f, -1.8f, -1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbSunny = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
