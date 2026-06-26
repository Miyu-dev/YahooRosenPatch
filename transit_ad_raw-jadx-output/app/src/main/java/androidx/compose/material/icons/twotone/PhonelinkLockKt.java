package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: PhonelinkLock.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phonelinkLock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkLock", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhonelinkLock", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhonelinkLockKt {
    private static ImageVector _phonelinkLock;

    public static final ImageVector getPhonelinkLock(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _phonelinkLock;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhonelinkLock", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.0f, 7.0f);
        pathBuilderD.curveTo(6.6f, 7.0f, 5.2f, 8.1f, 5.2f, 9.5f);
        pathBuilderD.lineTo(5.2f, 11.0f);
        pathBuilderD.curveToRelative(-0.6f, 0.0f, -1.2f, 0.6f, -1.2f, 1.2f);
        pathBuilderD.verticalLineToRelative(3.5f);
        pathBuilderD.curveToRelative(0.0f, 0.7f, 0.6f, 1.3f, 1.2f, 1.3f);
        pathBuilderD.horizontalLineToRelative(5.5f);
        pathBuilderD.curveToRelative(0.7f, 0.0f, 1.3f, -0.6f, 1.3f, -1.2f);
        pathBuilderD.verticalLineToRelative(-3.5f);
        pathBuilderD.curveToRelative(0.0f, -0.7f, -0.6f, -1.3f, -1.2f, -1.3f);
        pathBuilderD.lineTo(10.8f, 9.5f);
        pathBuilderD.curveTo(10.8f, 8.1f, 9.4f, 7.0f, 8.0f, 7.0f);
        androidx.compose.animation.a.j(pathBuilderD, 9.5f, 11.0f, -3.0f);
        pathBuilderD.lineTo(6.5f, 9.5f);
        pathBuilderD.curveToRelative(0.0f, -0.8f, 0.7f, -1.3f, 1.5f, -1.3f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.5f, 1.5f, 1.3f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 9.5f, 11.0f, 21.0f, 21.0f);
        pathBuilderD.lineTo(21.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.lineTo(9.0f, 1.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.x(pathBuilderD, 3.0f, 2.0f, 9.0f, 4.0f);
        android.support.v4.media.a.w(pathBuilderD, 10.0f, 16.0f, 9.0f, 20.0f);
        v.y(pathBuilderD, -2.0f, 7.0f, 18.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkLock = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
