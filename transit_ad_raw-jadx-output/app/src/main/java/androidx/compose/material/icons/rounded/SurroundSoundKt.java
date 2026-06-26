package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: SurroundSound.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_surroundSound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SurroundSound", "Landroidx/compose/material/icons/Icons$Rounded;", "getSurroundSound", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SurroundSoundKt {
    private static ImageVector _surroundSound;

    public static final ImageVector getSurroundSound(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _surroundSound;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SurroundSound", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 4.0f, 4.0f, 4.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(12.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(22.0f, 6.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.11f, 16.89f);
        pathBuilderA.curveToRelative(-0.43f, 0.43f, -1.14f, 0.39f, -1.51f, -0.09f);
        pathBuilderA.curveTo(4.53f, 15.39f, 4.0f, 13.69f, 4.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(0.53f, -3.38f, 1.59f, -4.8f);
        pathBuilderA.curveToRelative(0.37f, -0.48f, 1.08f, -0.53f, 1.51f, -0.1f);
        pathBuilderA.curveToRelative(0.35f, 0.35f, 0.39f, 0.9f, 0.1f, 1.29f);
        pathBuilderA.curveTo(6.4f, 9.46f, 6.0f, 10.73f, 6.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(0.4f, 2.53f, 1.2f, 3.6f);
        pathBuilderA.curveToRelative(0.3f, 0.39f, 0.26f, 0.94f, -0.09f, 1.29f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 16.0f);
        pathBuilderA.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderA.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderA.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(16.9f, 16.9f);
        pathBuilderA.curveToRelative(-0.35f, -0.35f, -0.39f, -0.9f, -0.09f, -1.29f);
        pathBuilderA.curveTo(17.6f, 14.54f, 18.0f, 13.27f, 18.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.4f, -2.53f, -1.2f, -3.6f);
        pathBuilderA.curveToRelative(-0.3f, -0.39f, -0.26f, -0.95f, 0.09f, -1.3f);
        pathBuilderA.curveToRelative(0.43f, -0.43f, 1.14f, -0.39f, 1.51f, 0.09f);
        pathBuilderA.curveToRelative(1.07f, 1.41f, 1.6f, 3.1f, 1.6f, 4.8f);
        pathBuilderA.curveToRelative(0.0f, 1.69f, -0.53f, 3.38f, -1.59f, 4.8f);
        pathBuilderA.curveToRelative(-0.37f, 0.49f, -1.08f, 0.54f, -1.51f, 0.11f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 10.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderA, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _surroundSound = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
