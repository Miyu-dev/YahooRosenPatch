package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Emergency.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emergency", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Emergency", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEmergency", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmergencyKt {
    private static ImageVector _emergency;

    public static final ImageVector getEmergency(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _emergency;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Emergency", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.43f, 16.87f, -4.68f, -2.7f);
        pathBuilderA.curveTo(13.42f, 13.97f, 13.0f, 14.21f, 13.0f, 14.6f);
        v.r(pathBuilderA, 20.0f, -2.0f, -5.4f);
        pathBuilderA.curveToRelative(0.0f, -0.38f, -0.42f, -0.63f, -0.75f, -0.43f);
        pathBuilderA.lineToRelative(-4.68f, 2.7f);
        pathBuilderA.lineToRelative(-1.0f, -1.73f);
        pathBuilderA.lineToRelative(4.68f, -2.7f);
        pathBuilderA.curveToRelative(0.33f, -0.19f, 0.33f, -0.67f, 0.0f, -0.87f);
        pathBuilderA.lineToRelative(-4.68f, -2.7f);
        pathBuilderA.lineToRelative(1.0f, -1.73f);
        pathBuilderA.lineToRelative(4.68f, 2.7f);
        pathBuilderA.curveTo(10.58f, 10.03f, 11.0f, 9.79f, 11.0f, 9.4f);
        v.r(pathBuilderA, 4.0f, 2.0f, 5.4f);
        pathBuilderA.curveToRelative(0.0f, 0.38f, 0.42f, 0.63f, 0.75f, 0.43f);
        pathBuilderA.lineToRelative(4.68f, -2.7f);
        pathBuilderA.lineToRelative(1.0f, 1.73f);
        pathBuilderA.lineToRelative(-4.68f, 2.7f);
        pathBuilderA.curveToRelative(-0.33f, 0.19f, -0.33f, 0.67f, 0.0f, 0.87f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 4.68f, 2.7f, 18.43f, 16.87f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(21.29f, 13.9f, 18.0f, 12.0f);
        pathBuilderA2.lineToRelative(3.29f, -1.9f);
        pathBuilderA2.curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f);
        pathBuilderA2.lineToRelative(-2.0f, -3.46f);
        pathBuilderA2.curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f);
        pathBuilderA2.lineTo(15.0f, 6.8f);
        pathBuilderA2.verticalLineTo(3.0f);
        pathBuilderA2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA2.horizontalLineToRelative(-4.0f);
        pathBuilderA2.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilderA2.verticalLineToRelative(3.8f);
        pathBuilderA2.lineTo(5.71f, 4.9f);
        pathBuilderA2.curveTo(5.23f, 4.63f, 4.62f, 4.79f, 4.34f, 5.27f);
        pathBuilderA2.lineToRelative(-2.0f, 3.46f);
        pathBuilderA2.curveTo(2.06f, 9.21f, 2.23f, 9.82f, 2.71f, 10.1f);
        pathBuilderA2.lineTo(6.0f, 12.0f);
        pathBuilderA2.lineToRelative(-3.29f, 1.9f);
        pathBuilderA2.curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f);
        pathBuilderA2.lineToRelative(2.0f, 3.46f);
        pathBuilderA2.curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f);
        pathBuilderA2.lineTo(9.0f, 17.2f);
        pathBuilderA2.verticalLineTo(21.0f);
        pathBuilderA2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA2.horizontalLineToRelative(4.0f);
        pathBuilderA2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA2.verticalLineToRelative(-3.8f);
        pathBuilderA2.lineToRelative(3.29f, 1.9f);
        pathBuilderA2.curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f);
        pathBuilderA2.lineToRelative(2.0f, -3.46f);
        pathBuilderA2.curveTo(21.94f, 14.79f, 21.77f, 14.18f, 21.29f, 13.9f);
        a.y(pathBuilderA2, 18.43f, 16.87f, -4.68f, -2.7f);
        pathBuilderA2.curveTo(13.42f, 13.97f, 13.0f, 14.21f, 13.0f, 14.6f);
        v.r(pathBuilderA2, 20.0f, -2.0f, -5.4f);
        pathBuilderA2.curveToRelative(0.0f, -0.38f, -0.42f, -0.63f, -0.75f, -0.43f);
        pathBuilderA2.lineToRelative(-4.68f, 2.7f);
        pathBuilderA2.lineToRelative(-1.0f, -1.73f);
        pathBuilderA2.lineToRelative(4.68f, -2.7f);
        pathBuilderA2.curveToRelative(0.33f, -0.19f, 0.33f, -0.67f, 0.0f, -0.87f);
        pathBuilderA2.lineToRelative(-4.68f, -2.7f);
        pathBuilderA2.lineToRelative(1.0f, -1.73f);
        pathBuilderA2.lineToRelative(4.68f, 2.7f);
        pathBuilderA2.curveTo(10.58f, 10.03f, 11.0f, 9.79f, 11.0f, 9.4f);
        v.r(pathBuilderA2, 4.0f, 2.0f, 5.4f);
        pathBuilderA2.curveToRelative(0.0f, 0.38f, 0.42f, 0.63f, 0.75f, 0.43f);
        pathBuilderA2.lineToRelative(4.68f, -2.7f);
        pathBuilderA2.lineToRelative(1.0f, 1.73f);
        pathBuilderA2.lineToRelative(-4.68f, 2.7f);
        pathBuilderA2.curveToRelative(-0.33f, 0.19f, -0.33f, 0.67f, 0.0f, 0.87f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA2, 4.68f, 2.7f, 18.43f, 16.87f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergency = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
