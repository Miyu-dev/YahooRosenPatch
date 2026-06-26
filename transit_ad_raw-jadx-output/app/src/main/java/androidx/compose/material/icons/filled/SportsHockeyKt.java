package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: SportsHockey.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsHockey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsHockey", "Landroidx/compose/material/icons/Icons$Filled;", "getSportsHockey", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsHockeyKt {
    private static ImageVector _sportsHockey;

    public static final ImageVector getSportsHockey(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _sportsHockey;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SportsHockey", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(2.0f, 17.0f, 3.0f, 2.0f, 0.0f);
        pathBuilderB.verticalLineToRelative(-4.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.curveTo(2.45f, 16.0f, 2.0f, 16.45f, 2.0f, 17.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(9.0f, 16.0f, 5.0f, 4.0f);
        pathBuilderF.lineToRelative(4.69f, -0.01f);
        pathBuilderF.curveToRelative(0.38f, 0.0f, 0.72f, -0.21f, 0.89f, -0.55f);
        pathBuilderF.lineToRelative(0.87f, -1.9f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderF, -1.59f, -3.48f, 9.0f, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.71f, 16.29f);
        pathBuilderD.curveTo(21.53f, 16.11f, 21.28f, 16.0f, 21.0f, 16.0f);
        s.s(pathBuilderD, -1.0f, 4.0f, 2.0f, 0.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveTo(22.0f, 16.72f, 21.89f, 16.47f, 21.71f, 16.29f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderX = android.support.v4.media.a.x(13.6f, 12.84f, 17.65f, 4.0f, 14.3f);
        pathBuilderX.lineToRelative(-1.76f, 3.97f);
        pathBuilderX.lineToRelative(-0.49f, 1.1f);
        pathBuilderX.lineTo(12.0f, 9.21f);
        pathBuilderX.lineTo(9.7f, 4.0f);
        pathBuilderX.horizontalLineTo(6.35f);
        pathBuilderX.lineToRelative(4.05f, 8.84f);
        pathBuilderX.lineToRelative(1.52f, 3.32f);
        pathBuilderX.lineTo(12.0f, 16.34f);
        pathBuilderX.lineToRelative(1.42f, 3.1f);
        pathBuilderX.curveToRelative(0.17f, 0.34f, 0.51f, 0.55f, 0.89f, 0.55f);
        a.b.s(pathBuilderX, 19.0f, 20.0f, -4.0f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderX, 13.6f, 12.84f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsHockey = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
