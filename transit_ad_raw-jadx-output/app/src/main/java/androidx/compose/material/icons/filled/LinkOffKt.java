package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: LinkOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_linkOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinkOff", "Landroidx/compose/material/icons/Icons$Filled;", "getLinkOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LinkOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(17.0f, 7.0f, -4.0f, 1.9f, 4.0f);
        pathBuilderF.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        pathBuilderF.curveToRelative(0.0f, 1.43f, -0.98f, 2.63f, -2.31f, 2.98f);
        pathBuilderF.lineToRelative(1.46f, 1.46f);
        pathBuilderF.curveTo(20.88f, 15.61f, 22.0f, 13.95f, 22.0f, 12.0f);
        pathBuilderF.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        androidx.compose.animation.a.j(pathBuilderF, 16.0f, 11.0f, -2.19f);
        s.r(pathBuilderF, 2.0f, 2.0f, 16.0f, 13.0f);
        pathBuilderF.moveTo(2.0f, 4.27f);
        pathBuilderF.lineToRelative(3.11f, 3.11f);
        pathBuilderF.curveTo(3.29f, 8.12f, 2.0f, 9.91f, 2.0f, 12.0f);
        pathBuilderF.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        android.support.v4.media.a.w(pathBuilderF, 4.0f, -1.9f, 7.0f, 15.1f);
        pathBuilderF.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        pathBuilderF.curveToRelative(0.0f, -1.59f, 1.21f, -2.9f, 2.76f, -3.07f);
        pathBuilderF.lineTo(8.73f, 11.0f);
        b.s(pathBuilderF, 8.0f, 11.0f, 2.0f, 2.73f);
        pathBuilderF.lineTo(13.0f, 15.27f);
        pathBuilderF.lineTo(13.0f, 17.0f);
        pathBuilderF.horizontalLineToRelative(1.73f);
        pathBuilderF.lineToRelative(4.01f, 4.0f);
        pathBuilderF.lineTo(20.0f, 19.74f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderF, 3.27f, 3.0f, 2.0f, 4.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
