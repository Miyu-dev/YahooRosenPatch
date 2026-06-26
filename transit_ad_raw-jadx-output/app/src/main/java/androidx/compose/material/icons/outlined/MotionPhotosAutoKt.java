package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: MotionPhotosAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_motionPhotosAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MotionPhotosAuto", "Landroidx/compose/material/icons/Icons$Outlined;", "getMotionPhotosAuto", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MotionPhotosAutoKt {
    private static ImageVector _motionPhotosAuto;

    public static final ImageVector getMotionPhotosAuto(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _motionPhotosAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MotionPhotosAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(2.88f, 7.88f, 1.54f, 1.54f);
        pathBuilderA.curveTo(4.15f, 10.23f, 4.0f, 11.1f, 4.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilderA.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilderA.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilderA.curveToRelative(-0.9f, 0.0f, -1.77f, 0.15f, -2.58f, 0.42f);
        pathBuilderA.lineTo(7.89f, 2.89f);
        pathBuilderA.curveTo(9.15f, 2.32f, 10.54f, 2.0f, 12.0f, 2.0f);
        pathBuilderA.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        pathBuilderA.reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilderA.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilderA.curveTo(2.0f, 10.53f, 2.32f, 9.14f, 2.88f, 7.88f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.0f, 5.5f);
        pathBuilderA.curveTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f);
        pathBuilderA.reflectiveCurveTo(4.0f, 6.33f, 4.0f, 5.5f);
        pathBuilderA.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        pathBuilderA.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        a.j(pathBuilderA, 12.03f, 8.99f, -0.07f);
        pathBuilderA.lineToRelative(-1.16f, 3.31f);
        androidx.appcompat.view.menu.a.s(pathBuilderA, 2.39f, 12.03f, 8.99f);
        pathBuilderA.moveTo(11.29f, 7.5f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderA, 1.43f, 3.01f, 8.0f, -1.39f);
        pathBuilderA.lineToRelative(-0.72f, -2.04f);
        androidx.appcompat.app.m.D(pathBuilderA, -3.23f, 9.66f, 15.5f, 8.28f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 11.29f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
