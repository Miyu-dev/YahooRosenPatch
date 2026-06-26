package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_linkOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinkOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getLinkOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LinkOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(14.0f, 9.0f, 2.87f);
        pathBuilderB.curveToRelative(1.46f, 0.0f, 2.8f, 0.98f, 3.08f, 2.42f);
        pathBuilderB.curveToRelative(0.31f, 1.64f, -0.74f, 3.11f, -2.22f, 3.48f);
        pathBuilderB.lineToRelative(1.53f, 1.53f);
        pathBuilderB.curveToRelative(1.77f, -0.91f, 2.95f, -2.82f, 2.7f, -5.01f);
        pathBuilderB.curveTo(21.68f, 8.86f, 19.37f, 7.0f, 16.79f, 7.0f);
        pathBuilderB.horizontalLineTo(14.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.curveTo(13.0f, 8.55f, 13.45f, 9.0f, 14.0f, 9.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(3.51f, 3.51f);
        pathBuilderB.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderB.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderB.lineToRelative(2.64f, 2.64f);
        pathBuilderB.curveToRelative(-1.77f, 0.91f, -2.95f, 2.82f, -2.7f, 5.01f);
        pathBuilderB.curveTo(2.32f, 15.14f, 4.63f, 17.0f, 7.21f, 17.0f);
        pathBuilderB.horizontalLineTo(10.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderB.horizontalLineTo(7.13f);
        pathBuilderB.curveToRelative(-1.46f, 0.0f, -2.8f, -0.98f, -3.08f, -2.42f);
        pathBuilderB.curveTo(3.74f, 10.94f, 4.8f, 9.47f, 6.27f, 9.1f);
        pathBuilderB.lineToRelative(2.12f, 2.12f);
        pathBuilderB.curveTo(8.16f, 11.41f, 8.0f, 11.68f, 8.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(1.17f);
        pathBuilderB.lineToRelative(8.9f, 8.9f);
        pathBuilderB.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderB.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        a.z(pathBuilderB, 3.51f, 3.51f, 14.0f, 11.0f);
        pathBuilderB.lineToRelative(1.71f, 1.71f);
        pathBuilderB.curveTo(15.89f, 12.53f, 16.0f, 12.28f, 16.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderB, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
