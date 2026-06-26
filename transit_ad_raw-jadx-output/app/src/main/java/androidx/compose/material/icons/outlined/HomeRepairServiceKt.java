package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: HomeRepairService.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_homeRepairService", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HomeRepairService", "Landroidx/compose/material/icons/Icons$Outlined;", "getHomeRepairService", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HomeRepairServiceKt {
    private static ImageVector _homeRepairService;

    public static final ImageVector getHomeRepairService(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _homeRepairService;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HomeRepairService", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(20.0f, 8.0f, -3.0f, 6.0f);
        pathBuilderT.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderT.horizontalLineTo(9.0f);
        pathBuilderT.curveTo(7.9f, 4.0f, 7.0f, 4.9f, 7.0f, 6.0f);
        pathBuilderT.verticalLineToRelative(2.0f);
        pathBuilderT.horizontalLineTo(4.0f);
        pathBuilderT.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.l(pathBuilderT, 10.0f, 20.0f, 10.0f);
        pathBuilderT.curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f);
        androidx.compose.animation.b.r(pathBuilderT, 9.0f, 6.0f, 6.0f, 2.0f);
        b.B(pathBuilderT, 9.0f, 6.0f, 20.0f, 18.0f);
        a.B(pathBuilderT, 4.0f, -3.0f, 2.0f, 1.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderT, 2.0f, -1.0f, 8.0f, 1.0f);
        androidx.compose.animation.a.B(pathBuilderT, 2.0f, -1.0f, 2.0f, 18.0f);
        b.y(pathBuilderT, 18.0f, 13.0f, -1.0f, -2.0f);
        androidx.appcompat.app.m.z(pathBuilderT, 1.0f, 8.0f, -1.0f, 6.0f);
        b.x(pathBuilderT, 1.0f, 4.0f, -3.0f, 3.0f);
        pathBuilderT.horizontalLineToRelative(10.0f);
        pathBuilderT.horizontalLineToRelative(3.0f);
        pathBuilderT.verticalLineToRelative(3.0f);
        pathBuilderT.horizontalLineTo(18.0f);
        pathBuilderT.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderT.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeRepairService = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
