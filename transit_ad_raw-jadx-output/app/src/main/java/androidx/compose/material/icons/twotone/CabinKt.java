package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Cabin.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cabin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cabin", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCabin", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CabinKt {
    private static ImageVector _cabin;

    public static final ImageVector getCabin(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _cabin;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Cabin", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(13.94f, 7.0f, -3.89f, 12.0f, 5.52f);
        a.z(pathBuilderC, 13.94f, 7.0f, 7.44f, 9.0f);
        androidx.appcompat.graphics.drawable.a.C(pathBuilderC, 9.12f, 18.0f, 10.1f, 11.0f);
        pathBuilderC.horizontalLineTo(6.0f);
        pathBuilderC.verticalLineToRelative(-0.9f);
        pathBuilderC.lineTo(7.44f, 9.0f);
        pathBuilderC.close();
        android.support.v4.media.a.D(pathBuilderC, 18.0f, 13.0f, 2.0f, 6.0f);
        h.z(pathBuilderC, -2.0f, 18.0f, 6.0f, 19.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.m(pathBuilderC, -2.0f, 12.0f, 2.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(10.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilderD.curveTo(6.45f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.w(pathBuilderD, 10.0f, 12.0f, 3.0f);
        androidx.browser.browseractions.a.D(pathBuilderD, 6.0f, 7.58f, 6.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(3.11f);
        pathBuilderD.lineTo(1.0f, 11.4f);
        pathBuilderD.lineToRelative(1.21f, 1.59f);
        androidx.appcompat.app.m.r(pathBuilderD, 4.0f, 11.62f, 21.0f, 16.0f);
        pathBuilderD.verticalLineToRelative(-9.38f);
        pathBuilderD.lineToRelative(1.79f, 1.36f);
        android.support.v4.media.a.C(pathBuilderD, 23.0f, 11.4f, 12.0f, 3.0f);
        pathBuilderD.moveTo(13.94f, 7.0f);
        pathBuilderD.horizontalLineToRelative(-3.89f);
        android.support.v4.media.a.C(pathBuilderD, 12.0f, 5.52f, 13.94f, 7.0f);
        pathBuilderD.moveTo(7.44f, 9.0f);
        androidx.appcompat.graphics.drawable.a.C(pathBuilderD, 9.12f, 18.0f, 10.1f, 11.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.verticalLineToRelative(-0.9f);
        pathBuilderD.lineTo(7.44f, 9.0f);
        pathBuilderD.close();
        android.support.v4.media.a.D(pathBuilderD, 18.0f, 13.0f, 2.0f, 6.0f);
        h.z(pathBuilderD, -2.0f, 18.0f, 6.0f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.m(pathBuilderD, -2.0f, 12.0f, 2.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cabin = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
