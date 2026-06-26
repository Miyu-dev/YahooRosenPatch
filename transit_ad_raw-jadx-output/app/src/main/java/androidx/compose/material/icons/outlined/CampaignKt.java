package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Campaign.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_campaign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Campaign", "Landroidx/compose/material/icons/Icons$Outlined;", "getCampaign", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CampaignKt {
    private static ImageVector _campaign;

    public static final ImageVector getCampaign(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _campaign;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Campaign", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.0f, 11.0f);
        pathBuilderD.curveToRelative(0.0f, 0.67f, 0.0f, 1.33f, 0.0f, 2.0f);
        pathBuilderD.curveToRelative(1.2f, 0.0f, 2.76f, 0.0f, 4.0f, 0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.67f, 0.0f, -1.33f, 0.0f, -2.0f);
        pathBuilderD.curveTo(20.76f, 11.0f, 19.2f, 11.0f, 18.0f, 11.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(16.0f, 17.61f);
        pathBuilderD2.curveToRelative(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f);
        pathBuilderD2.curveToRelative(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f);
        pathBuilderD2.curveToRelative(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f);
        pathBuilderD2.curveTo(16.8f, 16.54f, 16.4f, 17.08f, 16.0f, 17.61f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(20.4f, 5.6f);
        pathBuilderD3.curveTo(20.0f, 5.07f, 19.6f, 4.53f, 19.2f, 4.0f);
        pathBuilderD3.curveToRelative(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f);
        pathBuilderD3.curveToRelative(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f);
        pathBuilderD3.curveTo(18.16f, 7.28f, 19.41f, 6.35f, 20.4f, 5.6f);
        pathBuilderD3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD4 = a.d(4.0f, 9.0f);
        pathBuilderD4.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD4.verticalLineToRelative(2.0f);
        pathBuilderD4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD4, 1.0f, 4.0f, 2.0f, -4.0f);
        c.a.l(pathBuilderD4, 1.0f, 5.0f, 3.0f, 6.0f);
        i.b(pathBuilderD4, 8.0f, 9.0f, 4.0f);
        pathBuilderD4.moveTo(9.03f, 10.71f);
        pathBuilderD4.lineTo(11.0f, 9.53f);
        pathBuilderD4.verticalLineToRelative(4.94f);
        pathBuilderD4.lineToRelative(-1.97f, -1.18f);
        pathBuilderD4.lineTo(8.55f, 13.0f);
        pathBuilderD4.horizontalLineTo(8.0f);
        pathBuilderD4.horizontalLineTo(4.0f);
        pathBuilderD4.verticalLineToRelative(-2.0f);
        pathBuilderD4.horizontalLineToRelative(4.0f);
        pathBuilderD4.horizontalLineToRelative(0.55f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD4, 9.03f, 10.71f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD5 = a.d(15.5f, 12.0f);
        pathBuilderD5.curveToRelative(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        pathBuilderD5.verticalLineToRelative(6.69f);
        pathBuilderD5.curveTo(14.92f, 14.53f, 15.5f, 13.33f, 15.5f, 12.0f);
        pathBuilderD5.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _campaign = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
