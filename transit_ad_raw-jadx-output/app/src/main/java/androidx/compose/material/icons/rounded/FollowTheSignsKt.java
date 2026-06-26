package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: FollowTheSigns.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_followTheSigns", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FollowTheSigns", "Landroidx/compose/material/icons/Icons$Rounded;", "getFollowTheSigns", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FollowTheSignsKt {
    private static ImageVector _followTheSigns;

    public static final ImageVector getFollowTheSigns(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _followTheSigns;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FollowTheSigns", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.5f, 5.5f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(8.4f, 5.5f, 9.5f, 5.5f);
        androidx.compose.animation.a.t(pathBuilderD, 5.75f, 8.9f, 3.23f, 21.81f);
        pathBuilderD.curveTo(3.11f, 22.43f, 3.58f, 23.0f, 4.21f, 23.0f);
        pathBuilderD.horizontalLineTo(4.3f);
        pathBuilderD.curveToRelative(0.47f, 0.0f, 0.88f, -0.33f, 0.98f, -0.79f);
        pathBuilderD.lineTo(6.85f, 15.0f);
        pathBuilderD.lineTo(9.0f, 17.0f);
        pathBuilderD.verticalLineToRelative(5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-6.14f);
        pathBuilderD.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilderD.lineTo(8.95f, 13.4f);
        pathBuilderD.lineToRelative(0.6f, -3.0f);
        pathBuilderD.curveToRelative(1.07f, 1.32f, 2.58f, 2.23f, 4.31f, 2.51f);
        pathBuilderD.curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f);
        pathBuilderD.curveToRelative(-1.49f, -0.25f, -2.75f, -1.15f, -3.51f, -2.38f);
        pathBuilderD.lineTo(9.7f, 6.95f);
        pathBuilderD.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        pathBuilderD.curveTo(7.75f, 6.0f, 7.5f, 6.05f, 7.25f, 6.15f);
        pathBuilderD.lineToRelative(-4.63f, 1.9f);
        pathBuilderD.curveTo(2.25f, 8.2f, 2.0f, 8.57f, 2.0f, 8.97f);
        pathBuilderD.verticalLineTo(12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(9.65f);
        pathBuilderD.lineTo(5.75f, 8.9f);
        pathBuilderD.moveTo(21.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(-7.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(2.75f);
        pathBuilderD.verticalLineToRelative(13.25f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD.verticalLineTo(9.0f);
        pathBuilderD.horizontalLineTo(21.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(3.0f);
        pathBuilderD.curveTo(22.0f, 2.45f, 21.55f, 2.0f, 21.0f, 2.0f);
        a.y(pathBuilderD, 20.15f, 5.85f, -1.28f, 1.29f);
        pathBuilderD.curveToRelative(-0.31f, 0.32f, -0.85f, 0.09f, -0.85f, -0.35f);
        pathBuilderD.verticalLineTo(6.25f);
        pathBuilderD.horizontalLineToRelative(-2.76f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderD.reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderD.horizontalLineToRelative(2.76f);
        pathBuilderD.verticalLineTo(4.21f);
        pathBuilderD.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilderD.lineToRelative(1.28f, 1.29f);
        pathBuilderD.curveTo(20.34f, 5.34f, 20.34f, 5.66f, 20.15f, 5.85f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _followTheSigns = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
