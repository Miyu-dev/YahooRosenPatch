package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AppSettingsAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_appSettingsAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AppSettingsAlt", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAppSettingsAlt", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AppSettingsAltKt {
    private static ImageVector _appSettingsAlt;

    public static final ImageVector getAppSettingsAlt(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AppSettingsAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.81f, 12.74f, -0.82f, -0.63f);
        pathBuilderA.curveToRelative(0.0f, -0.09f, 0.0f, -0.13f, 0.0f, -0.22f);
        pathBuilderA.lineToRelative(0.8f, -0.63f);
        pathBuilderA.curveToRelative(0.16f, -0.12f, 0.2f, -0.34f, 0.1f, -0.51f);
        pathBuilderA.lineToRelative(-0.85f, -1.48f);
        pathBuilderA.curveToRelative(-0.07f, -0.13f, -0.21f, -0.2f, -0.35f, -0.2f);
        pathBuilderA.curveToRelative(-0.05f, 0.0f, -0.1f, 0.01f, -0.15f, 0.03f);
        pathBuilderA.lineToRelative(-0.95f, 0.38f);
        pathBuilderA.curveToRelative(-0.08f, -0.05f, -0.11f, -0.07f, -0.19f, -0.11f);
        pathBuilderA.lineToRelative(-0.15f, -1.01f);
        pathBuilderA.curveTo(19.22f, 8.15f, 19.05f, 8.0f, 18.85f, 8.0f);
        pathBuilderA.horizontalLineToRelative(-1.71f);
        pathBuilderA.curveToRelative(-0.2f, 0.0f, -0.37f, 0.15f, -0.4f, 0.34f);
        pathBuilderA.lineTo(16.6f, 9.35f);
        pathBuilderA.curveToRelative(-0.03f, 0.02f, -0.07f, 0.03f, -0.1f, 0.05f);
        pathBuilderA.curveToRelative(-0.03f, 0.02f, -0.06f, 0.04f, -0.09f, 0.06f);
        pathBuilderA.lineToRelative(-0.95f, -0.38f);
        pathBuilderA.curveToRelative(-0.05f, -0.02f, -0.1f, -0.03f, -0.15f, -0.03f);
        pathBuilderA.curveToRelative(-0.14f, 0.0f, -0.27f, 0.07f, -0.35f, 0.2f);
        pathBuilderA.lineToRelative(-0.85f, 1.48f);
        pathBuilderA.curveToRelative(-0.1f, 0.17f, -0.06f, 0.39f, 0.1f, 0.51f);
        pathBuilderA.lineToRelative(0.8f, 0.63f);
        pathBuilderA.curveToRelative(0.0f, 0.09f, 0.0f, 0.13f, 0.0f, 0.23f);
        pathBuilderA.lineToRelative(-0.8f, 0.63f);
        pathBuilderA.curveToRelative(-0.16f, 0.12f, -0.2f, 0.34f, -0.1f, 0.51f);
        pathBuilderA.lineToRelative(0.85f, 1.48f);
        pathBuilderA.curveToRelative(0.07f, 0.13f, 0.21f, 0.2f, 0.35f, 0.2f);
        pathBuilderA.curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.15f, -0.03f);
        pathBuilderA.lineToRelative(0.95f, -0.37f);
        pathBuilderA.curveToRelative(0.08f, 0.05f, 0.12f, 0.07f, 0.2f, 0.11f);
        pathBuilderA.lineToRelative(0.15f, 1.01f);
        pathBuilderA.curveToRelative(0.03f, 0.2f, 0.2f, 0.34f, 0.4f, 0.34f);
        pathBuilderA.horizontalLineToRelative(1.71f);
        pathBuilderA.curveToRelative(0.2f, 0.0f, 0.37f, -0.15f, 0.4f, -0.34f);
        pathBuilderA.lineToRelative(0.15f, -1.01f);
        pathBuilderA.curveToRelative(0.03f, -0.02f, 0.07f, -0.03f, 0.1f, -0.05f);
        pathBuilderA.curveToRelative(0.03f, -0.02f, 0.06f, -0.04f, 0.09f, -0.06f);
        pathBuilderA.lineToRelative(0.95f, 0.38f);
        pathBuilderA.curveToRelative(0.05f, 0.02f, 0.1f, 0.03f, 0.15f, 0.03f);
        pathBuilderA.curveToRelative(0.14f, 0.0f, 0.27f, -0.07f, 0.35f, -0.2f);
        pathBuilderA.lineToRelative(0.85f, -1.48f);
        pathBuilderA.curveTo(22.01f, 13.08f, 21.97f, 12.86f, 21.81f, 12.74f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.0f, 13.5f);
        pathBuilderA.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderA.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderA.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderA.curveTo(19.5f, 12.83f, 18.83f, 13.5f, 18.0f, 13.5f);
        a.w(pathBuilderA, 17.0f, 18.0f, 7.0f, 6.0f);
        a.u(pathBuilderA, 10.0f, 1.0f, 2.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.horizontalLineTo(7.0f);
        pathBuilderA.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilderA.verticalLineToRelative(18.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(10.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.h(pathBuilderA, -4.0f, -2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 7.0f, 3.0f, 10.0f, 1.0f);
        a.b.B(pathBuilderA, 7.0f, 3.0f, 17.0f, 21.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.a.f(pathBuilderA, 7.0f, -1.0f, 10.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(7.0f, 3.0f, 10.0f, 1.0f, -10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(7.0f, 20.0f, 10.0f, 1.0f, -10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appSettingsAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
