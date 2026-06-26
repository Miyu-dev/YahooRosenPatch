package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: DoNotTouch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$Rounded;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoNotTouch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(13.0f, 10.17f, -2.5f, -2.5f, 2.25f);
        pathBuilderW.curveTo(10.5f, 1.56f, 11.06f, 1.0f, 11.75f, 1.0f);
        pathBuilderW.curveTo(12.44f, 1.0f, 13.0f, 1.56f, 13.0f, 2.25f);
        android.support.v4.media.a.y(pathBuilderW, 10.17f, 20.0f, 5.32f);
        pathBuilderW.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        pathBuilderW.curveToRelative(-0.75f, -0.08f, -1.38f, 0.51f, -1.38f, 1.24f);
        pathBuilderW.verticalLineToRelative(5.25f);
        pathBuilderW.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderW.horizontalLineToRelative(0.0f);
        pathBuilderW.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderW.lineToRelative(0.0f, -7.18f);
        pathBuilderW.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        pathBuilderW.curveTo(14.63f, 1.93f, 14.0f, 2.52f, 14.0f, 3.25f);
        pathBuilderW.verticalLineToRelative(7.92f);
        s.r(pathBuilderW, 6.0f, 6.0f, 20.0f, 5.32f);
        pathBuilderW.moveTo(9.5f, 4.25f);
        pathBuilderW.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilderW.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        h.y(pathBuilderW, 9.5f, 6.67f, 4.25f);
        pathBuilderW.moveTo(17.0f, 22.0f);
        pathBuilderW.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.65f, -0.52f);
        pathBuilderW.lineToRelative(-0.02f, -0.02f);
        pathBuilderW.lineToRelative(0.44f, 0.44f);
        pathBuilderW.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderW.lineToRelative(0.0f, 0.0f);
        pathBuilderW.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderW.lineTo(3.51f, 3.51f);
        pathBuilderW.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderW.lineToRelative(0.0f, 0.0f);
        pathBuilderW.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderW.lineToRelative(4.92f, 4.92f);
        pathBuilderW.lineTo(7.0f, 9.83f);
        pathBuilderW.verticalLineToRelative(4.3f);
        pathBuilderW.lineToRelative(-2.6f, -1.48f);
        pathBuilderW.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilderW.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilderW.lineTo(2.0f, 13.88f);
        pathBuilderW.lineToRelative(0.0f, 0.0f);
        pathBuilderW.lineToRelative(6.8f, 7.18f);
        pathBuilderW.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderW, 17.0f, 22.0f, 17.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
