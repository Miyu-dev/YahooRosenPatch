package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: AltRoute.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_altRoute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AltRoute", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAltRoute", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AltRouteKt {
    private static ImageVector _altRoute;

    public static final ImageVector getAltRoute(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _altRoute;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AltRoute", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.78f, 11.16f, -1.42f, 1.42f);
        pathBuilderA.curveToRelative(-0.68f, -0.69f, -1.34f, -1.58f, -1.79f, -2.94f);
        pathBuilderA.lineToRelative(1.94f, -0.49f);
        pathBuilderA.curveTo(8.83f, 10.04f, 9.28f, 10.65f, 9.78f, 11.16f);
        a.t(pathBuilderA, 11.0f, 6.0f, 7.0f, 2.0f);
        pathBuilderA.lineTo(3.0f, 6.0f);
        pathBuilderA.horizontalLineToRelative(3.02f);
        pathBuilderA.curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f);
        pathBuilderA.lineToRelative(1.94f, -0.49f);
        pathBuilderA.curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6.0f);
        b.w(pathBuilderA, 11.0f, 21.0f, 6.0f);
        pathBuilderA.lineToRelative(-4.0f, -4.0f);
        pathBuilderA.lineToRelative(-4.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(2.99f);
        pathBuilderA.curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f);
        pathBuilderA.curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f);
        pathBuilderA.curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f);
        pathBuilderA.lineTo(9.46f, 13.6f);
        pathBuilderA.curveTo(10.39f, 14.45f, 11.0f, 15.14f, 11.0f, 17.0f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderA, 0.0f, 5.0f, 2.0f, -5.0f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f);
        pathBuilderA.curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderA, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _altRoute = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
