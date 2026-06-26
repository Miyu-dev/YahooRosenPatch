package androidx.compose.material.icons.outlined;

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
import c.e;
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FontDownloadOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fontDownloadOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FontDownloadOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getFontDownloadOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FontDownloadOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(4.83f, 2.0f, 20.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a.z(pathBuilderB, 15.17f, -2.0f, -2.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderB, 6.83f, 4.83f, 2.0f);
        pathBuilderB.moveTo(10.92f, 6.0f);
        pathBuilderB.lineToRelative(-0.57f, 1.52f);
        pathBuilderB.lineToRelative(1.36f, 1.36f);
        pathBuilderB.lineToRelative(0.23f, -0.66f);
        pathBuilderB.horizontalLineToRelative(0.1f);
        pathBuilderB.lineToRelative(0.54f, 1.52f);
        pathBuilderB.lineToRelative(3.04f, 3.04f);
        i.b(pathBuilderB, 13.07f, 6.0f, 10.92f);
        pathBuilderB.moveTo(20.49f, 23.31f);
        pathBuilderB.lineTo(19.17f, 22.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.83f);
        pathBuilderB.lineTo(0.69f, 3.51f);
        pathBuilderB.lineTo(2.1f, 2.1f);
        s.r(pathBuilderB, 19.8f, 19.8f, 20.49f, 23.31f);
        pathBuilderB.moveTo(17.17f, 20.0f);
        pathBuilderB.lineToRelative(-5.07f, -5.07f);
        e.g(pathBuilderB, 9.58f, 8.49f, 18.0f, 6.41f);
        pathBuilderB.lineToRelative(2.39f, -6.37f);
        pathBuilderB.lineTo(4.0f, 6.83f);
        pathBuilderB.verticalLineTo(20.0f);
        pathBuilderB.horizontalLineTo(17.17f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
