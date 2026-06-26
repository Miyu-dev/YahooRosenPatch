package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: DialerSip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dialerSip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DialerSip", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDialerSip", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DialerSipKt {
    private static ImageVector _dialerSip;

    public static final ImageVector getDialerSip(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _dialerSip;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DialerSip", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.2f, 18.21f);
        pathBuilderD.curveToRelative(1.2f, 0.41f, 2.48f, 0.67f, 3.8f, 0.75f);
        pathBuilderD.verticalLineToRelative(-1.5f);
        pathBuilderD.curveToRelative(-0.88f, -0.06f, -1.75f, -0.22f, -2.59f, -0.45f);
        android.support.v4.media.a.t(pathBuilderD, -1.21f, 1.2f, 6.54f, 5.0f);
        pathBuilderD.horizontalLineToRelative(-1.5f);
        pathBuilderD.curveToRelative(0.09f, 1.32f, 0.35f, 2.59f, 0.75f, 3.79f);
        pathBuilderD.lineToRelative(1.2f, -1.21f);
        pathBuilderD.curveToRelative(-0.24f, -0.83f, -0.39f, -1.7f, -0.45f, -2.58f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.graphics.drawable.a.v(16.0f, 3.0f, 1.0f, 5.0f, -1.0f);
        b.y(pathBuilderV, 12.0f, 7.0f, 1.0f, 3.0f);
        pathBuilderV.lineTo(15.0f, 5.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderV, -2.0f, 13.0f, 4.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderV, 15.0f, 3.0f, -3.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderV, 2.0f, 1.0f, 21.0f, 3.0f);
        android.support.v4.media.a.s(pathBuilderV, -3.0f, 5.0f, 1.0f);
        pathBuilderV.lineTo(19.0f, 6.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderV, 2.0f, 21.0f, 3.0f);
        pathBuilderV.moveTo(20.0f, 5.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderV, -1.0f, 19.0f, 4.0f, 1.0f);
        android.support.v4.media.a.v(pathBuilderV, 1.0f, 21.0f, 16.5f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        pathBuilderV.curveToRelative(-0.1f, -0.03f, -0.21f, -0.05f, -0.31f, -0.05f);
        pathBuilderV.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilderV.lineToRelative(-2.2f, 2.2f);
        pathBuilderV.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilderV.lineToRelative(2.2f, -2.21f);
        pathBuilderV.curveToRelative(0.27f, -0.26f, 0.35f, -0.65f, 0.24f, -1.0f);
        pathBuilderV.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.lineTo(4.0f, 3.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderV.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        pathBuilderV.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderV, -3.5f, 5.03f, 5.0f, 1.5f);
        pathBuilderV.curveToRelative(0.07f, 0.88f, 0.22f, 1.75f, 0.46f, 2.59f);
        pathBuilderV.lineTo(5.79f, 8.8f);
        pathBuilderV.curveToRelative(-0.41f, -1.21f, -0.67f, -2.48f, -0.76f, -3.8f);
        pathBuilderV.close();
        pathBuilderV.moveTo(19.0f, 18.97f);
        pathBuilderV.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        pathBuilderV.lineToRelative(1.2f, -1.2f);
        pathBuilderV.curveToRelative(0.85f, 0.24f, 1.71f, 0.39f, 2.59f, 0.45f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderV, 1.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dialerSip = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
