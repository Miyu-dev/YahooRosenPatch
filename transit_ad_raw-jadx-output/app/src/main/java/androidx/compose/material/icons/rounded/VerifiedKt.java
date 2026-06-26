package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Verified.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_verified", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Verified", "Landroidx/compose/material/icons/Icons$Rounded;", "getVerified", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VerifiedKt {
    private static ImageVector _verified;

    public static final ImageVector getVerified(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _verified;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Verified", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(23.0f, 12.0f, -2.44f, -2.79f);
        pathBuilderA.lineToRelative(0.34f, -3.69f);
        pathBuilderA.lineToRelative(-3.61f, -0.82f);
        pathBuilderA.lineTo(15.4f, 1.5f);
        pathBuilderA.lineTo(12.0f, 2.96f);
        pathBuilderA.lineTo(8.6f, 1.5f);
        pathBuilderA.lineTo(6.71f, 4.69f);
        pathBuilderA.lineTo(3.1f, 5.5f);
        pathBuilderA.lineTo(3.44f, 9.2f);
        pathBuilderA.lineTo(1.0f, 12.0f);
        pathBuilderA.lineToRelative(2.44f, 2.79f);
        pathBuilderA.lineToRelative(-0.34f, 3.7f);
        pathBuilderA.lineToRelative(3.61f, 0.82f);
        pathBuilderA.lineTo(8.6f, 22.5f);
        pathBuilderA.lineToRelative(3.4f, -1.47f);
        pathBuilderA.lineToRelative(3.4f, 1.46f);
        pathBuilderA.lineToRelative(1.89f, -3.19f);
        pathBuilderA.lineToRelative(3.61f, -0.82f);
        s.r(pathBuilderA, -0.34f, -3.69f, 23.0f, 12.0f);
        pathBuilderA.moveTo(9.38f, 16.01f);
        pathBuilderA.lineTo(7.0f, 13.61f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.lineToRelative(0.07f, -0.07f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.0f);
        pathBuilderA.lineToRelative(1.61f, 1.62f);
        pathBuilderA.lineToRelative(5.15f, -5.16f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.0f);
        pathBuilderA.lineToRelative(0.07f, 0.07f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineToRelative(-5.92f, 5.94f);
        pathBuilderA.curveTo(10.41f, 16.4f, 9.78f, 16.4f, 9.38f, 16.01f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verified = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
