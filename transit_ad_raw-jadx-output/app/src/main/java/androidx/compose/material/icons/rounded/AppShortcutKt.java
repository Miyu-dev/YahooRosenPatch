package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: AppShortcut.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appShortcut", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppShortcut", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppShortcut", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AppShortcutKt {
    private static ImageVector _appShortcut;

    public static final ImageVector getAppShortcut(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _appShortcut;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AppShortcut", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderG = androidx.appcompat.app.m.g(17.0f, 18.0f, 7.0f, 6.0f, 10.0f);
        s.l(pathBuilderG, 1.0f, 2.0f, 3.0f);
        pathBuilderG.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderG.horizontalLineTo(7.0f);
        pathBuilderG.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilderG.verticalLineToRelative(18.0f);
        pathBuilderG.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderG.horizontalLineToRelative(10.0f);
        pathBuilderG.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderG, -4.0f, -2.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.38f, 9.62f, 0.4f, 0.87f);
        pathBuilderA.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        pathBuilderA.lineToRelative(0.4f, -0.87f);
        pathBuilderA.lineToRelative(0.87f, -0.4f);
        pathBuilderA.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        pathBuilderA.lineToRelative(-0.87f, -0.4f);
        pathBuilderA.lineToRelative(-0.4f, -0.87f);
        pathBuilderA.curveToRelative(-0.09f, -0.2f, -0.37f, -0.2f, -0.46f, 0.0f);
        pathBuilderA.lineToRelative(-0.4f, 0.87f);
        pathBuilderA.lineToRelative(-0.87f, 0.4f);
        pathBuilderA.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 20.38f, 9.62f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(15.54f, 9.0f, -0.79f, 1.75f);
        pathBuilderA2.lineTo(13.0f, 11.54f);
        pathBuilderA2.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA2.lineToRelative(1.75f, 0.79f);
        pathBuilderA2.lineTo(15.54f, 15.0f);
        pathBuilderA2.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilderA2.lineToRelative(0.79f, -1.75f);
        pathBuilderA2.lineTo(19.0f, 12.46f);
        pathBuilderA2.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA2.lineToRelative(-1.75f, -0.79f);
        pathBuilderA2.lineTo(16.46f, 9.0f);
        pathBuilderA2.curveTo(16.28f, 8.61f, 15.72f, 8.61f, 15.54f, 9.0f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = b.a(20.77f, 13.5f, -0.4f, 0.87f);
        pathBuilderA3.lineToRelative(-0.87f, 0.4f);
        pathBuilderA3.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        pathBuilderA3.lineToRelative(0.87f, 0.4f);
        pathBuilderA3.lineToRelative(0.4f, 0.87f);
        pathBuilderA3.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        pathBuilderA3.lineToRelative(0.4f, -0.87f);
        pathBuilderA3.lineToRelative(0.87f, -0.4f);
        pathBuilderA3.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        pathBuilderA3.lineToRelative(-0.87f, -0.4f);
        pathBuilderA3.lineToRelative(-0.4f, -0.87f);
        pathBuilderA3.curveTo(21.14f, 13.31f, 20.86f, 13.31f, 20.77f, 13.5f);
        pathBuilderA3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appShortcut = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
