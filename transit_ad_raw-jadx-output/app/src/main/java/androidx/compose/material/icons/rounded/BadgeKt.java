package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_badge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Badge", "Landroidx/compose/material/icons/Icons$Rounded;", "getBadge", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BadgeKt {
    private static ImageVector _badge;

    public static final ImageVector getBadge(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _badge;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Badge", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(20.0f, 7.0f, -5.0f, 4.0f);
        pathBuilderT.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderT.horizontalLineToRelative(-2.0f);
        pathBuilderT.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        pathBuilderT.verticalLineToRelative(3.0f);
        pathBuilderT.horizontalLineTo(4.0f);
        pathBuilderT.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        pathBuilderT.verticalLineToRelative(11.0f);
        pathBuilderT.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderT.horizontalLineToRelative(16.0f);
        pathBuilderT.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderT.verticalLineTo(9.0f);
        pathBuilderT.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        pathBuilderT.close();
        pathBuilderT.moveTo(9.0f, 12.0f);
        pathBuilderT.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderT.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderT.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderT.curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f);
        a.q(pathBuilderT, 12.0f, 18.0f, 6.0f, -0.43f);
        pathBuilderT.curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f);
        pathBuilderT.curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f);
        pathBuilderT.reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f);
        pathBuilderT.curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f);
        androidx.appcompat.view.menu.a.B(pathBuilderT, 18.0f, 13.0f, 9.0f, -2.0f);
        androidx.appcompat.view.menu.a.v(pathBuilderT, 4.0f, 2.0f, 9.0f);
        pathBuilderT.moveTo(17.25f, 16.5f);
        pathBuilderT.horizontalLineToRelative(-2.5f);
        pathBuilderT.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderT.horizontalLineToRelative(2.5f);
        pathBuilderT.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveTo(18.0f, 16.16f, 17.66f, 16.5f, 17.25f, 16.5f);
        androidx.compose.animation.a.j(pathBuilderT, 17.25f, 13.5f, -2.5f);
        pathBuilderT.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderT.horizontalLineToRelative(2.5f);
        pathBuilderT.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveTo(18.0f, 13.16f, 17.66f, 13.5f, 17.25f, 13.5f);
        pathBuilderT.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderT.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _badge = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
