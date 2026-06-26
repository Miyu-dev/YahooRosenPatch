package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: ScreenRotation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenRotation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenRotation", "Landroidx/compose/material/icons/Icons$Sharp;", "getScreenRotation", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenRotationKt {
    private static ImageVector _screenRotation;

    public static final ImageVector getScreenRotation(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenRotation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.48f, 2.52f);
        pathBuilderD.curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
        pathBuilderD.horizontalLineToRelative(1.5f);
        pathBuilderD.curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
        pathBuilderD.lineToRelative(-0.66f, 0.03f);
        android.support.v4.media.a.n(pathBuilderD, 3.81f, 3.81f, 1.33f, -1.32f);
        pathBuilderD.moveTo(7.52f, 21.48f);
        pathBuilderD.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilderD.lineTo(0.05f, 13.0f);
        pathBuilderD.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilderD.lineToRelative(0.66f, -0.03f);
        android.support.v4.media.a.n(pathBuilderD, -3.81f, -3.81f, -1.33f, 1.32f);
        pathBuilderD.moveTo(9.17f, 0.69f);
        pathBuilderD.lineTo(0.69f, 9.17f);
        pathBuilderD.lineToRelative(14.14f, 14.14f);
        s.r(pathBuilderD, 8.48f, -8.48f, 9.17f, 0.69f);
        pathBuilderD.moveTo(14.83f, 21.19f);
        pathBuilderD.lineTo(2.81f, 9.17f);
        pathBuilderD.lineToRelative(6.36f, -6.36f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, 12.02f, 12.02f, -6.36f, 6.36f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
