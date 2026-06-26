package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: ControlCamera.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_controlCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ControlCamera", "Landroidx/compose/material/icons/Icons$Rounded;", "getControlCamera", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ControlCameraKt {
    private static ImageVector _controlCamera;

    public static final ImageVector getControlCamera(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _controlCamera;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ControlCamera", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.65f, 9.35f, 2.7f, 11.3f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineToRelative(1.95f, 1.95f);
        pathBuilderA.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        pathBuilderA.curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0.0f, -1.76f);
        pathBuilderA.lineToRelative(-0.88f, -0.9f);
        pathBuilderA.lineToRelative(0.88f, -0.89f);
        pathBuilderA.curveToRelative(0.48f, -0.49f, 0.48f, -1.27f, 0.0f, -1.76f);
        pathBuilderA.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.58f, 9.35f);
        pathBuilderA.curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0.0f, 1.76f);
        pathBuilderA.lineToRelative(0.88f, 0.89f);
        pathBuilderA.lineToRelative(-0.88f, 0.89f);
        pathBuilderA.curveToRelative(-0.48f, 0.49f, -0.48f, 1.27f, 0.0f, 1.76f);
        pathBuilderA.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        pathBuilderA.lineToRelative(1.95f, -1.95f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.lineToRelative(-1.95f, -1.95f);
        pathBuilderA.curveToRelative(-0.49f, -0.48f, -1.29f, -0.48f, -1.77f, 0.01f);
        a.y(pathBuilderA, 12.0f, 18.46f, -0.89f, -0.88f);
        pathBuilderA.curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0.0f);
        pathBuilderA.curveToRelative(-0.49f, 0.49f, -0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilderA.lineToRelative(1.95f, 1.95f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(1.95f, -1.95f);
        pathBuilderA.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderA.curveToRelative(-0.49f, -0.48f, -1.27f, -0.48f, -1.76f, 0.0f);
        android.support.v4.media.a.t(pathBuilderA, -0.9f, 0.88f, 9.35f, 6.42f);
        pathBuilderA.curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0.0f);
        pathBuilderA.lineToRelative(0.89f, -0.88f);
        pathBuilderA.lineToRelative(0.89f, 0.88f);
        pathBuilderA.curveToRelative(0.49f, 0.48f, 1.27f, 0.48f, 1.76f, 0.0f);
        pathBuilderA.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderA.lineTo(12.7f, 2.7f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineTo(9.35f, 4.65f);
        pathBuilderA.curveToRelative(-0.49f, 0.49f, -0.49f, 1.29f, 0.0f, 1.77f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 12.0f, -3.0f, 0.0f);
        pathBuilderB.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        pathBuilderB.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlCamera = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
