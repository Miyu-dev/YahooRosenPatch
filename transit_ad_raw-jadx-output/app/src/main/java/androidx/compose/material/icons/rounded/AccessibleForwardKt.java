package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: AccessibleForward.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accessibleForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccessibleForward", "Landroidx/compose/material/icons/Icons$Rounded;", "getAccessibleForward", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AccessibleForwardKt {
    private static ImageVector _accessibleForward;

    public static final ImageVector getAccessibleForward(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _accessibleForward;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AccessibleForward", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(18.0f, 4.54f, -2.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = h.b(15.0f, 17.0f, -2.0f);
        pathBuilderB2.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilderB2.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilderB2.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilderB2.verticalLineToRelative(-2.0f);
        pathBuilderB2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderB2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderB2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        a.j(pathBuilderB2, 18.0f, 13.5f, -1.86f);
        pathBuilderB2.lineToRelative(1.67f, -3.67f);
        pathBuilderB2.curveTo(18.42f, 8.5f, 17.44f, 7.0f, 15.96f, 7.0f);
        pathBuilderB2.horizontalLineToRelative(-5.2f);
        pathBuilderB2.curveToRelative(-0.81f, 0.0f, -1.54f, 0.47f, -1.87f, 1.2f);
        pathBuilderB2.lineToRelative(-0.28f, 0.76f);
        pathBuilderB2.curveToRelative(-0.21f, 0.56f, 0.11f, 1.17f, 0.68f, 1.33f);
        pathBuilderB2.curveToRelative(0.49f, 0.14f, 1.0f, -0.11f, 1.2f, -0.58f);
        pathBuilderB2.lineToRelative(0.3f, -0.71f);
        pathBuilderB2.lineTo(13.0f, 9.0f);
        pathBuilderB2.lineToRelative(-1.83f, 4.1f);
        pathBuilderB2.curveToRelative(-0.6f, 1.33f, 0.39f, 2.9f, 1.85f, 2.9f);
        pathBuilderB2.lineTo(18.0f, 16.0f);
        pathBuilderB2.verticalLineToRelative(4.0f);
        pathBuilderB2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB2.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB2.verticalLineToRelative(-4.5f);
        pathBuilderB2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessibleForward = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
