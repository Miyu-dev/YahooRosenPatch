package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: LinkOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_linkOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinkOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getLinkOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LinkOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.39f, 11.0f);
        pathBuilder.lineTo(16.0f, 12.61f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        a.x(pathBuilder, 17.0f, 7.0f, -4.0f, 1.9f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        pathBuilder.curveToRelative(0.0f, 1.27f, -0.77f, 2.37f, -1.87f, 2.84f);
        pathBuilder.lineToRelative(1.4f, 1.4f);
        pathBuilder.curveTo(21.05f, 15.36f, 22.0f, 13.79f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        androidx.browser.browseractions.a.y(pathBuilder, 2.0f, 4.27f, 3.11f, 3.11f);
        pathBuilder.curveTo(3.29f, 8.12f, 2.0f, 9.91f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        v.t(pathBuilder, 4.0f, -1.9f, 7.0f);
        pathBuilder.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        pathBuilder.curveToRelative(0.0f, -1.59f, 1.21f, -2.9f, 2.76f, -3.07f);
        h.n(pathBuilder, 8.73f, 11.0f, 8.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.C(pathBuilder, 2.73f, 13.0f, 15.27f, 17.0f);
        pathBuilder.horizontalLineToRelative(1.73f);
        pathBuilder.lineToRelative(4.01f, 4.01f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilder, 3.41f, 2.86f, 2.0f, 4.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
