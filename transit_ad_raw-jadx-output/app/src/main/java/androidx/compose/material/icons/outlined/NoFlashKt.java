package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoFlash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noFlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFlash", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoFlash", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoFlash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.4f, 5.6f, 22.0f, 19.0f, 11.0f);
        a.C(pathBuilderA, 7.0f, -1.0f, 2.0f, 4.0f);
        a.z(pathBuilderA, 20.4f, 5.6f, 16.0f, 11.4f);
        pathBuilderA.lineToRelative(0.0f, 1.77f);
        pathBuilderA.lineToRelative(2.0f, 2.0f);
        pathBuilderA.verticalLineTo(11.0f);
        pathBuilderA.curveToRelative(0.0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f);
        a.y(pathBuilderA, -2.54f, 12.58f, 8.0f, -1.75f);
        a.b.l(pathBuilderA, 3.4f, 3.4f, 16.0f);
        pathBuilderA.moveTo(2.1f, 2.1f);
        pathBuilderA.lineTo(0.69f, 3.51f);
        pathBuilderA.lineToRelative(5.66f, 5.66f);
        pathBuilderA.lineTo(6.14f, 9.4f);
        pathBuilderA.horizontalLineTo(3.6f);
        pathBuilderA.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        pathBuilderA.verticalLineToRelative(9.4f);
        pathBuilderA.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        pathBuilderA.horizontalLineToRelative(12.8f);
        pathBuilderA.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        pathBuilderA.lineToRelative(2.54f, 2.54f);
        s.r(pathBuilderA, 1.41f, -1.41f, 2.1f, 2.1f);
        pathBuilderA.moveTo(11.5f, 15.5f);
        pathBuilderA.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderA.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderA.reflectiveCurveTo(9.17f, 14.0f, 10.0f, 14.0f);
        pathBuilderA.reflectiveCurveTo(11.5f, 14.67f, 11.5f, 15.5f);
        androidx.browser.browseractions.a.q(pathBuilderA, 15.96f, 20.0f, 4.0f, -8.6f);
        pathBuilderA.horizontalLineToRelative(2.14f);
        pathBuilderA.horizontalLineToRelative(0.88f);
        pathBuilderA.lineToRelative(0.59f, -0.65f);
        pathBuilderA.lineToRelative(0.15f, -0.16f);
        pathBuilderA.lineToRelative(1.5f, 1.5f);
        pathBuilderA.curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f);
        pathBuilderA.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilderA.curveToRelative(1.68f, 0.0f, 3.07f, -1.18f, 3.42f, -2.76f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 2.55f, 2.55f, 15.96f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFlash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
