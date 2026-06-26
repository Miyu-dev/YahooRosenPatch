package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: Signpost.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signpost", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Signpost", "Landroidx/compose/material/icons/Icons$Sharp;", "getSignpost", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignpostKt {
    private static ImageVector _signpost;

    public static final ImageVector getSignpost(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _signpost;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Signpost", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.horizontalLineTo(5.5f);
        pathBuilderD.curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveTo(4.0f, 9.33f, 4.67f, 10.0f, 5.5f, 10.0f);
        b.r(pathBuilderD, 11.0f, 2.0f, 6.62f);
        pathBuilderD.curveToRelative(-0.4f, 0.0f, -0.78f, 0.16f, -1.06f, 0.44f);
        pathBuilderD.lineToRelative(-1.5f, 1.5f);
        pathBuilderD.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilderD.lineToRelative(1.5f, 1.5f);
        pathBuilderD.curveTo(5.84f, 17.84f, 6.22f, 18.0f, 6.62f, 18.0f);
        pathBuilderD.horizontalLineTo(11.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.horizontalLineToRelative(5.5f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        androidx.compose.animation.a.s(pathBuilderD, 13.0f, -2.0f, 4.38f);
        pathBuilderD.curveToRelative(0.4f, 0.0f, 0.78f, -0.16f, 1.06f, -0.44f);
        pathBuilderD.lineToRelative(1.5f, -1.5f);
        pathBuilderD.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilderD.lineToRelative(-1.5f, -1.5f);
        pathBuilderD.curveTo(18.16f, 4.16f, 17.78f, 4.0f, 17.38f, 4.0f);
        pathBuilderD.horizontalLineTo(13.0f);
        pathBuilderD.verticalLineTo(3.0f);
        pathBuilderD.curveTo(13.0f, 2.45f, 12.55f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signpost = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
