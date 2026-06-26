package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: RotateLeft.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rotateLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateLeft", "Landroidx/compose/material/icons/Icons$Sharp;", "getRotateLeft", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RotateLeftKt {
    private static ImageVector _rotateLeft;

    public static final ImageVector getRotateLeft(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _rotateLeft;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RotateLeft", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.11f, 8.53f, 5.7f, 7.11f);
        pathBuilderA.curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11.0f);
        pathBuilderA.horizontalLineToRelative(2.02f);
        pathBuilderA.curveToRelative(0.14f, -0.87f, 0.49f, -1.72f, 1.02f, -2.47f);
        a.t(pathBuilderA, 6.09f, 13.0f, 4.07f, 13.0f);
        pathBuilderA.curveToRelative(0.17f, 1.39f, 0.72f, 2.73f, 1.62f, 3.89f);
        pathBuilderA.lineToRelative(1.41f, -1.42f);
        pathBuilderA.curveToRelative(-0.52f, -0.75f, -0.87f, -1.59f, -1.01f, -2.47f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.1f, 18.32f);
        pathBuilderA.curveToRelative(1.16f, 0.9f, 2.51f, 1.44f, 3.9f, 1.61f);
        pathBuilderA.lineTo(11.0f, 17.9f);
        pathBuilderA.curveToRelative(-0.87f, -0.15f, -1.71f, -0.49f, -2.46f, -1.03f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 7.1f, 18.32f, 13.0f, 4.07f);
        pathBuilderA.lineTo(13.0f, 1.0f);
        pathBuilderA.lineTo(8.45f, 5.55f);
        pathBuilderA.lineTo(13.0f, 10.0f);
        pathBuilderA.lineTo(13.0f, 6.09f);
        pathBuilderA.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        pathBuilderA.reflectiveCurveToRelative(-2.16f, 5.43f, -5.0f, 5.91f);
        pathBuilderA.verticalLineToRelative(2.02f);
        pathBuilderA.curveToRelative(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderA, -3.05f, -7.44f, -7.0f, -7.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateLeft = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
