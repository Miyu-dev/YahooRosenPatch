package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: CameraRoll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cameraRoll", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CameraRoll", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCameraRoll", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CameraRollKt {
    private static ImageVector _cameraRoll;

    public static final ImageVector getCameraRoll(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _cameraRoll;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CameraRoll", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 5.0f, 9.0f, 5.0f);
        pathBuilderA.lineTo(9.0f, 3.0f);
        pathBuilderA.lineTo(7.0f, 3.0f);
        v.y(pathBuilderA, 2.0f, 4.0f, 5.0f, 15.0f);
        a.s(pathBuilderA, 8.0f, -2.0f, 8.0f);
        pathBuilderA.lineTo(20.0f, 7.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderA, -8.0f, 12.0f, 5.0f);
        pathBuilderA.moveTo(11.0f, 17.0f);
        b.s(pathBuilderA, 9.0f, 17.0f, -2.0f, 2.0f);
        a.v(pathBuilderA, 2.0f, 11.0f, 10.0f);
        pathBuilderA.lineTo(9.0f, 10.0f);
        s.w(pathBuilderA, 9.0f, 8.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 17.0f, 8.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderA, -2.0f, 17.0f, 8.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 17.0f, 15.0f, 2.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderA, -2.0f, -2.0f, 13.0f, 8.0f);
        a.s(pathBuilderA, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 13.0f, 8.0f, 13.0f, 15.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.j(pathBuilderA, 2.0f, 2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(14.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-1.0f);
        pathBuilderD.lineTo(11.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineTo(6.0f, 1.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.lineTo(4.0f, 3.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(15.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.C(pathBuilderD, 8.0f, 22.0f, 5.0f, -8.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 20.0f, 18.0f, -8.0f, 2.0f);
        pathBuilderD.lineTo(4.0f, 20.0f);
        pathBuilderD.lineTo(4.0f, 5.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderD, 3.0f, 7.0f, 3.0f, 2.0f);
        androidx.browser.browseractions.a.l(pathBuilderD, 2.0f, 3.0f, 2.0f, 8.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderD, 11.0f, 9.0f, 15.0f, 2.0f);
        h.q(pathBuilderD, 2.0f, 9.0f, 17.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 9.0f, 8.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 9.0f, 10.0f, 13.0f, 15.0f);
        androidx.compose.animation.b.t(pathBuilderD, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 13.0f, 8.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderD, -2.0f, 17.0f, 15.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderD, 2.0f, -2.0f, 17.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.i(pathBuilderD, 2.0f, 2.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraRoll = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
