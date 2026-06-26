package androidx.compose.material.icons.sharp;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: AppsOutage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appsOutage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppsOutage", "Landroidx/compose/material/icons/Icons$Sharp;", "getAppsOutage", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AppsOutageKt {
    private static ImageVector _appsOutage;

    public static final ImageVector getAppsOutage(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _appsOutage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AppsOutage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(4.0f, 8.0f, 4.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderQ, 8.0f, 10.0f, 20.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderQ, -4.0f, -4.0f, 20.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderQ, 4.0f, 20.0f, 4.0f, -4.0f);
        b.B(pathBuilderQ, 4.0f, 20.0f, 4.0f, 14.0f);
        s.A(pathBuilderQ, 4.0f, -4.0f, 4.0f, 14.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderQ, 10.0f, 14.0f, 4.0f, -4.0f);
        b.m(pathBuilderQ, -4.0f, 14.0f, 16.0f, 20.0f);
        androidx.compose.animation.a.B(pathBuilderQ, 4.0f, -4.0f, -4.0f, 20.0f);
        pathBuilderQ.moveTo(19.0f, 0.0f);
        pathBuilderQ.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderQ.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderQ.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderQ.reflectiveCurveTo(21.76f, 0.0f, 19.0f, 0.0f);
        androidx.compose.animation.a.k(pathBuilderQ, 19.5f, 8.0f, -1.0f, 7.0f);
        b.m(pathBuilderQ, 1.0f, 8.0f, 19.5f, 6.0f);
        v.w(pathBuilderQ, -1.0f, 2.0f, 1.0f, 6.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderQ, 16.0f, 14.0f, 4.0f, -2.07f);
        pathBuilderQ.curveTo(19.67f, 11.98f, 19.34f, 12.0f, 19.0f, 12.0f);
        pathBuilderQ.curveToRelative(-1.07f, 0.0f, -2.09f, -0.24f, -3.0f, -0.68f);
        androidx.compose.animation.b.l(pathBuilderQ, 14.0f, 10.0f, 4.0f, 4.0f);
        pathBuilderQ.horizontalLineToRelative(2.68f);
        pathBuilderQ.curveTo(12.24f, 7.09f, 12.0f, 6.07f, 12.0f, 5.0f);
        pathBuilderQ.curveToRelative(0.0f, -0.34f, 0.02f, -0.67f, 0.07f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderQ, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appsOutage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
