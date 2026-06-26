package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: RotateRight.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotateRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateRight", "Landroidx/compose/material/icons/Icons$Sharp;", "getRotateRight", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RotateRightKt {
    private static ImageVector _rotateRight;

    public static final ImageVector getRotateRight(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _rotateRight;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RotateRight", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(15.55f, 5.55f, 11.0f, 1.0f, 3.07f);
        pathBuilderB.curveTo(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(3.05f, 7.44f, 7.0f, 7.93f);
        pathBuilderB.verticalLineToRelative(-2.02f);
        pathBuilderB.curveToRelative(-2.84f, -0.48f, -5.0f, -2.94f, -5.0f, -5.91f);
        pathBuilderB.reflectiveCurveToRelative(2.16f, -5.43f, 5.0f, -5.91f);
        androidx.compose.animation.a.A(pathBuilderB, 11.0f, 10.0f, 4.55f, -4.45f);
        pathBuilderB.moveTo(19.93f, 11.0f);
        pathBuilderB.curveToRelative(-0.17f, -1.39f, -0.72f, -2.73f, -1.62f, -3.89f);
        pathBuilderB.lineToRelative(-1.42f, 1.42f);
        pathBuilderB.curveToRelative(0.54f, 0.75f, 0.88f, 1.6f, 1.02f, 2.47f);
        pathBuilderB.horizontalLineToRelative(2.02f);
        pathBuilderB.close();
        pathBuilderB.moveTo(13.0f, 17.9f);
        pathBuilderB.verticalLineToRelative(2.02f);
        pathBuilderB.curveToRelative(1.39f, -0.17f, 2.74f, -0.71f, 3.9f, -1.61f);
        pathBuilderB.lineToRelative(-1.44f, -1.44f);
        pathBuilderB.curveToRelative(-0.75f, 0.54f, -1.59f, 0.89f, -2.46f, 1.03f);
        androidx.browser.browseractions.a.y(pathBuilderB, 16.89f, 15.48f, 1.42f, 1.41f);
        pathBuilderB.curveToRelative(0.9f, -1.16f, 1.45f, -2.5f, 1.62f, -3.89f);
        pathBuilderB.horizontalLineToRelative(-2.02f);
        pathBuilderB.curveToRelative(-0.14f, 0.87f, -0.48f, 1.72f, -1.02f, 2.48f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateRight = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
