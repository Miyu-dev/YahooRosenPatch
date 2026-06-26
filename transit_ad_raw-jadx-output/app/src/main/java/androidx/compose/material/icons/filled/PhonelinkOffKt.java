package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: PhonelinkOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phonelinkOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkOff", "Landroidx/compose/material/icons/Icons$Filled;", "getPhonelinkOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhonelinkOffKt {
    private static ImageVector _phonelinkOff;

    public static final ImageVector getPhonelinkOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _phonelinkOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhonelinkOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 6.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(6.82f);
        b.l(pathBuilder, 2.0f, 2.0f, 22.0f);
        pathBuilder.moveTo(1.92f, 1.65f);
        pathBuilder.lineTo(0.65f, 2.92f);
        pathBuilder.lineToRelative(1.82f, 1.82f);
        pathBuilder.curveTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f);
        b.x(pathBuilder, 11.0f, 0.0f, 3.0f, 17.73f);
        pathBuilder.lineToRelative(2.35f, 2.35f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        a.C(pathBuilder, 3.89f, 3.62f, 1.92f, 1.65f);
        pathBuilder.moveTo(4.0f, 6.27f);
        pathBuilder.lineTo(14.73f, 17.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(6.27f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        androidx.browser.browseractions.a.z(pathBuilder, 4.18f, 2.0f, 2.0f, 10.0f);
        a.s(pathBuilder, 4.0f, 7.0f, -2.18f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
