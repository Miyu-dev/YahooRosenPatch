package androidx.compose.material.icons.filled;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_router", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Router", "Landroidx/compose/material/icons/Icons$Filled;", "getRouter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RouterKt {
    private static ImageVector _router;

    public static final ImageVector getRouter(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _router;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Router", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.2f, 5.9f, 0.8f, -0.8f);
        pathBuilderA.curveTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(-3.6f, 0.7f, -5.0f, 2.1f);
        pathBuilderA.lineToRelative(0.8f, 0.8f);
        pathBuilderA.curveTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, 0.6f, 4.2f, 1.7f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.3f, 6.7f);
        pathBuilderA.curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f);
        pathBuilderA.reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f);
        pathBuilderA.lineToRelative(0.8f, 0.8f);
        pathBuilderA.curveToRelative(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f);
        pathBuilderA.curveToRelative(0.9f, 0.0f, 1.8f, 0.3f, 2.5f, 1.0f);
        a.t(pathBuilderA, 0.8f, -0.8f, 19.0f, 13.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -2.0f, 17.0f, 9.0f, -2.0f);
        pathBuilderA.verticalLineToRelative(4.0f);
        pathBuilderA.lineTo(5.0f, 13.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineToRelative(-4.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA, 8.0f, 18.0f, 6.0f, 18.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderA, -2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 11.5f, 18.0f, -2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderA, 2.0f, 2.0f, 15.0f, 18.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.j(pathBuilderA, -2.0f, -2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _router = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
