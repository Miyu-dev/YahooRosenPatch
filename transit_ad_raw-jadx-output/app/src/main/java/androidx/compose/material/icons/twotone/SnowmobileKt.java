package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Snowmobile.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_snowmobile", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowmobile", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSnowmobile", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SnowmobileKt {
    private static ImageVector _snowmobile;

    public static final ImageVector getSnowmobile(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _snowmobile;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Snowmobile", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(17.0f, 14.0f, -6.7f, -7.45f, -2.23f);
        pathBuilderA.lineToRelative(0.31f, -0.62f);
        pathBuilderA.lineTo(11.6f, 12.0f);
        pathBuilderA.lineToRelative(3.93f, -2.94f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, 3.77f, 3.44f, 4.27f, 4.14f);
        pathBuilderA.curveTo(19.8f, 13.2f, 18.7f, 14.0f, 17.0f, 14.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(22.0f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(-0.17f);
        pathBuilderD.lineToRelative(-2.2f, -2.2f);
        pathBuilderD.curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -1.0f, -8.0f, -8.0f, -8.0f, -8.0f);
        a.s(pathBuilderD, -3.0f, 2.0f, 2.25f);
        pathBuilderD.lineToRelative(0.8f, 0.72f);
        pathBuilderD.lineTo(11.0f, 10.0f);
        pathBuilderD.lineTo(2.0f, 9.0f);
        pathBuilderD.lineToRelative(-2.0f, 4.0f);
        pathBuilderD.lineToRelative(4.54f, 1.36f);
        pathBuilderD.lineToRelative(-3.49f, 1.88f);
        pathBuilderD.curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderD, 4.0f, 2.0f, 2.0f, -3.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        h.r(pathBuilderD, 22.0f, 8.0f, 18.0f, 2.0f);
        pathBuilderD.lineToRelative(5.25f, -2.83f);
        pathBuilderD.lineTo(10.0f, 16.0f);
        pathBuilderD.curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f);
        androidx.compose.animation.a.j(pathBuilderD, 17.0f, 14.0f, -6.7f);
        pathBuilderD.lineToRelative(-7.45f, -2.23f);
        pathBuilderD.lineToRelative(0.31f, -0.62f);
        pathBuilderD.lineTo(11.6f, 12.0f);
        pathBuilderD.lineToRelative(3.93f, -2.94f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 3.77f, 3.44f, 4.27f, 4.14f);
        pathBuilderD.curveTo(19.8f, 13.2f, 18.7f, 14.0f, 17.0f, 14.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowmobile = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
