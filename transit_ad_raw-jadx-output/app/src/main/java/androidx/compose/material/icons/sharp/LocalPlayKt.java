package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: LocalPlay.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localPlay", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalPlay", "Landroidx/compose/material/icons/Icons$Sharp;", "getLocalPlay", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalPlayKt {
    private static ImageVector _localPlay;

    public static final ImageVector getLocalPlay(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _localPlay;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LocalPlay", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.lineTo(22.0f, 4.0f);
        pathBuilderD.lineTo(2.01f, 4.0f);
        pathBuilderD.verticalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 1.99f, 0.9f, 1.99f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        android.support.v4.media.a.m(pathBuilderD, 6.0f, 20.0f, -6.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderD, 15.58f, 16.8f, 12.0f, 14.5f);
        pathBuilderD.lineToRelative(-3.58f, 2.3f);
        pathBuilderD.lineToRelative(1.08f, -4.12f);
        pathBuilderD.lineToRelative(-3.29f, -2.69f);
        pathBuilderD.lineToRelative(4.24f, -0.25f);
        pathBuilderD.lineTo(12.0f, 5.8f);
        pathBuilderD.lineToRelative(1.54f, 3.95f);
        pathBuilderD.lineToRelative(4.24f, 0.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, -3.29f, 2.69f, 1.09f, 4.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPlay = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
