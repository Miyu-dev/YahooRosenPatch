package androidx.compose.material.icons.rounded;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SpeakerPhone.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_speakerPhone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpeakerPhone", "Landroidx/compose/material/icons/Icons$Rounded;", "getSpeakerPhone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpeakerPhoneKt {
    private static ImageVector _speakerPhone;

    public static final ImageVector getSpeakerPhone(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _speakerPhone;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SpeakerPhone", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.76f, 7.83f, 0.02f, 0.02f);
        pathBuilderA.curveToRelative(0.35f, 0.35f, 0.89f, 0.38f, 1.3f, 0.09f);
        pathBuilderA.curveTo(9.91f, 7.37f, 10.92f, 7.02f, 12.0f, 7.02f);
        pathBuilderA.reflectiveCurveToRelative(2.09f, 0.35f, 2.92f, 0.93f);
        pathBuilderA.curveToRelative(0.4f, 0.29f, 0.95f, 0.26f, 1.3f, -0.09f);
        pathBuilderA.lineToRelative(0.02f, -0.02f);
        pathBuilderA.curveToRelative(0.42f, -0.42f, 0.39f, -1.14f, -0.09f, -1.49f);
        pathBuilderA.curveTo(14.98f, 5.5f, 13.55f, 5.0f, 12.0f, 5.0f);
        pathBuilderA.reflectiveCurveTo(9.02f, 5.5f, 7.86f, 6.34f);
        pathBuilderA.curveTo(7.37f, 6.69f, 7.34f, 7.41f, 7.76f, 7.83f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 1.0f);
        pathBuilderD.curveTo(9.38f, 1.0f, 6.97f, 1.93f, 5.08f, 3.47f);
        pathBuilderD.curveTo(4.62f, 3.84f, 4.57f, 4.53f, 5.0f, 4.96f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f);
        pathBuilderD.curveTo(7.86f, 3.76f, 9.85f, 3.0f, 12.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(4.14f, 0.76f, 5.69f, 2.03f);
        pathBuilderD.curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f);
        pathBuilderD.curveTo(17.03f, 1.93f, 14.62f, 1.0f, 12.0f, 1.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(15.0f, 10.0f, -6.0f, 0.0f);
        pathBuilderA2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA2.verticalLineToRelative(10.0f);
        pathBuilderA2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA2.horizontalLineToRelative(5.99f);
        pathBuilderA2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA2.lineTo(16.0f, 11.0f);
        pathBuilderA2.curveTo(16.0f, 10.45f, 15.55f, 10.0f, 15.0f, 10.0f);
        a.q(pathBuilderA2, 15.0f, 20.0f, 9.0f, -8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderA2, 6.0f, 20.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerPhone = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
