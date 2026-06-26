package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Router.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_router", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Router", "Landroidx/compose/material/icons/Icons$Outlined;", "getRouter", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RouterKt {
    private static ImageVector _router;

    public static final ImageVector getRouter(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _router;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Router", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.0f, 4.2f);
        pathBuilderD.curveToRelative(1.5f, 0.0f, 3.0f, 0.6f, 4.2f, 1.7f);
        pathBuilderD.lineToRelative(0.8f, -0.8f);
        pathBuilderD.curveTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.6f, 0.7f, -5.0f, 2.1f);
        pathBuilderD.lineToRelative(0.8f, 0.8f);
        pathBuilderD.curveTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        a.y(pathBuilderD, 12.7f, 6.7f, 0.8f, 0.8f);
        pathBuilderD.curveToRelative(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.8f, 0.3f, 2.5f, 1.0f);
        pathBuilderD.lineToRelative(0.8f, -0.8f);
        pathBuilderD.curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        pathBuilderD.reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f);
        androidx.compose.animation.a.j(pathBuilderD, 19.0f, 13.0f, -2.0f);
        androidx.compose.animation.a.o(pathBuilderD, 17.0f, 9.0f, -2.0f, 4.0f);
        pathBuilderD.lineTo(5.0f, 13.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderD, 19.0f, 19.0f, 5.0f, 19.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderD, -4.0f, 14.0f, 4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 6.0f, 16.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 6.0f, 18.0f, 9.5f, 16.0f);
        b.t(pathBuilderD, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 13.0f, 16.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.c(pathBuilderD, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _router = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
