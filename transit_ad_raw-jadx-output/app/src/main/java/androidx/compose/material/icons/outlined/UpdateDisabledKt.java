package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: UpdateDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_updateDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "UpdateDisabled", "Landroidx/compose/material/icons/Icons$Outlined;", "getUpdateDisabled", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UpdateDisabledKt {
    private static ImageVector _updateDisabled;

    public static final ImageVector getUpdateDisabled(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.UpdateDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.94f, 13.0f);
        pathBuilderD.curveToRelative(-0.15f, 1.38f, -0.62f, 2.67f, -1.33f, 3.79f);
        pathBuilderD.lineToRelative(-1.47f, -1.47f);
        pathBuilderD.curveToRelative(0.38f, -0.71f, 0.65f, -1.49f, 0.77f, -2.32f);
        b.w(pathBuilderD, 20.94f, 8.67f, 5.84f);
        pathBuilderD.curveTo(9.66f, 5.31f, 10.8f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.curveToRelative(2.37f, 0.0f, 4.47f, 1.19f, 5.74f, 3.0f);
        androidx.appcompat.graphics.drawable.a.i(pathBuilderD, 15.0f, 2.0f, 6.0f, 4.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.verticalLineToRelative(2.36f);
        pathBuilderD.curveTo(17.35f, 4.32f, 14.83f, 3.0f, 12.0f, 3.0f);
        pathBuilderD.curveToRelative(-1.76f, 0.0f, -3.4f, 0.51f, -4.78f, 1.39f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 8.67f, 5.84f, 11.0f, 7.0f);
        a.z(pathBuilderD, 1.17f, 2.0f, 2.0f, 7.0f);
        b.w(pathBuilderD, 11.0f, 19.78f, 22.61f);
        pathBuilderD.lineToRelative(-3.0f, -3.0f);
        pathBuilderD.curveTo(15.39f, 20.48f, 13.76f, 21.0f, 12.0f, 21.0f);
        pathBuilderD.curveToRelative(-4.97f, 0.0f, -9.0f, -4.03f, -9.0f, -9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f);
        pathBuilderD.lineTo(1.39f, 4.22f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderD, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderD.moveTo(15.32f, 18.15f);
        pathBuilderD.lineTo(5.84f, 8.67f);
        pathBuilderD.curveTo(5.31f, 9.66f, 5.0f, 10.8f, 5.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f);
        pathBuilderD.curveTo(13.2f, 19.0f, 14.34f, 18.69f, 15.32f, 18.15f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
