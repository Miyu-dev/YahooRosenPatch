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

/* JADX INFO: compiled from: NoLuggage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noLuggage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoLuggage", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoLuggage", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoLuggage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(16.0f, 13.17f, -1.5f, -1.5f, 9.0f);
        b.B(pathBuilderW, 16.0f, 13.17f, 19.78f, 22.61f);
        pathBuilderW.lineToRelative(-1.85f, -1.85f);
        pathBuilderW.curveTo(17.65f, 20.91f, 17.34f, 21.0f, 17.0f, 21.0f);
        pathBuilderW.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderW.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderW.horizontalLineTo(9.0f);
        pathBuilderW.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderW.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderW.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderW.verticalLineTo(8.0f);
        pathBuilderW.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        pathBuilderW.lineTo(1.39f, 4.22f);
        pathBuilderW.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderW, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderW.moveTo(16.17f, 19.0f);
        s.D(pathBuilderW, -3.42f, -3.42f, 18.0f, -1.5f);
        pathBuilderW.verticalLineToRelative(-3.92f);
        pathBuilderW.lineTo(9.5f, 12.33f);
        pathBuilderW.verticalLineTo(18.0f);
        androidx.compose.animation.a.z(pathBuilderW, 8.0f, -7.17f, -1.0f, -1.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderW, 19.0f, 16.17f, 12.75f, 9.0f);
        pathBuilderW.horizontalLineToRelative(-0.92f);
        pathBuilderW.lineToRelative(0.92f, 0.92f);
        pathBuilderW.verticalLineTo(9.0f);
        pathBuilderW.close();
        pathBuilderW.moveTo(19.0f, 8.0f);
        a.z(pathBuilderW, 8.17f, -2.0f, -2.0f, 8.0f);
        pathBuilderW.horizontalLineToRelative(-6.17f);
        pathBuilderW.lineTo(9.84f, 7.01f);
        pathBuilderW.lineTo(9.0f, 6.17f);
        pathBuilderW.verticalLineTo(6.0f);
        pathBuilderW.verticalLineTo(3.0f);
        pathBuilderW.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderW.horizontalLineToRelative(4.0f);
        pathBuilderW.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderW.verticalLineToRelative(3.0f);
        pathBuilderW.horizontalLineToRelative(2.0f);
        pathBuilderW.curveTo(18.1f, 6.0f, 19.0f, 6.9f, 19.0f, 8.0f);
        androidx.compose.animation.a.k(pathBuilderW, 10.5f, 6.0f, 3.0f, 3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderW, -3.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
