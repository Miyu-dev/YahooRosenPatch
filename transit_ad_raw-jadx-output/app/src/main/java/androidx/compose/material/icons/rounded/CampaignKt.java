package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: Campaign.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_campaign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Campaign", "Landroidx/compose/material/icons/Icons$Rounded;", "getCampaign", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CampaignKt {
    private static ImageVector _campaign;

    public static final ImageVector getCampaign(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _campaign;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Campaign", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.0f, 12.0f, 18.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.curveTo(18.45f, 11.0f, 18.0f, 11.45f, 18.0f, 12.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.59f, 16.82f);
        pathBuilderD.curveToRelative(-0.33f, 0.44f, -0.24f, 1.05f, 0.2f, 1.37f);
        pathBuilderD.curveToRelative(0.53f, 0.39f, 1.09f, 0.81f, 1.62f, 1.21f);
        pathBuilderD.curveToRelative(0.44f, 0.33f, 1.06f, 0.24f, 1.38f, -0.2f);
        pathBuilderD.curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f);
        pathBuilderD.curveToRelative(0.33f, -0.44f, 0.24f, -1.06f, -0.2f, -1.38f);
        pathBuilderD.curveToRelative(-0.53f, -0.4f, -1.09f, -0.82f, -1.61f, -1.21f);
        pathBuilderD.curveToRelative(-0.44f, -0.33f, -1.06f, -0.23f, -1.39f, 0.21f);
        pathBuilderD.curveTo(16.6f, 16.81f, 16.59f, 16.82f, 16.59f, 16.82f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(19.81f, 4.81f);
        pathBuilderD2.curveToRelative(0.0f, -0.01f, -0.01f, -0.01f, -0.01f, -0.02f);
        pathBuilderD2.curveToRelative(-0.33f, -0.44f, -0.95f, -0.53f, -1.38f, -0.2f);
        pathBuilderD2.curveToRelative(-0.53f, 0.4f, -1.1f, 0.82f, -1.62f, 1.22f);
        pathBuilderD2.curveToRelative(-0.44f, 0.33f, -0.52f, 0.95f, -0.19f, 1.38f);
        pathBuilderD2.curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.02f);
        pathBuilderD2.curveToRelative(0.33f, 0.44f, 0.94f, 0.53f, 1.38f, 0.2f);
        pathBuilderD2.curveToRelative(0.53f, -0.39f, 1.09f, -0.82f, 1.62f, -1.22f);
        pathBuilderD2.curveTo(20.05f, 5.87f, 20.13f, 5.25f, 19.81f, 4.81f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(8.0f, 9.0f, 4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(1.0f);
        pathBuilderB.verticalLineToRelative(3.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.t(pathBuilderB, -3.0f, 1.0f, 5.0f, 3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.v(pathBuilderB, 6.0f, 8.0f, 9.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(15.5f, 12.0f);
        pathBuilderD3.curveToRelative(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        pathBuilderD3.verticalLineToRelative(6.69f);
        pathBuilderD3.curveTo(14.92f, 14.53f, 15.5f, 13.33f, 15.5f, 12.0f);
        pathBuilderD3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _campaign = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
