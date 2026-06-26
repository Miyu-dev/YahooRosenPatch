package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: CleanHands.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cleanHands", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CleanHands", "Landroidx/compose/material/icons/Icons$Filled;", "getCleanHands", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CleanHandsKt {
    private static ImageVector _cleanHands;

    public static final ImageVector getCleanHands(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _cleanHands;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CleanHands", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.99f, 5.0f, 0.63f, 1.37f);
        pathBuilderA.lineTo(18.99f, 7.0f);
        pathBuilderA.lineToRelative(-1.37f, 0.63f);
        pathBuilderA.lineTo(16.99f, 9.0f);
        pathBuilderA.lineToRelative(-0.63f, -1.37f);
        pathBuilderA.lineTo(14.99f, 7.0f);
        pathBuilderA.lineToRelative(1.37f, -0.63f);
        pathBuilderA.lineTo(16.99f, 5.0f);
        h.D(pathBuilderA, 11.0f, 6.13f, 4.0f, 2.0f);
        pathBuilderA.curveToRelative(0.57f, 0.0f, 1.1f, 0.17f, 1.55f, 0.45f);
        pathBuilderA.lineToRelative(1.43f, -1.43f);
        pathBuilderA.curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f);
        pathBuilderA.curveToRelative(-1.48f, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f);
        v.z(pathBuilderA, 2.0f, 9.0f, 2.14f);
        pathBuilderA.curveTo(7.23f, 6.51f, 5.81f, 7.8f, 5.26f, 9.5f);
        pathBuilderA.horizontalLineToRelative(3.98f);
        pathBuilderA.lineTo(15.0f, 11.65f);
        pathBuilderA.verticalLineToRelative(-0.62f);
        pathBuilderA.curveTo(15.0f, 8.61f, 13.28f, 6.59f, 11.0f, 6.13f);
        a.k(pathBuilderA, 1.0f, 22.0f, 4.0f, 11.0f);
        a.b.B(pathBuilderA, 1.0f, 22.0f, 20.0f, 17.0f);
        pathBuilderA.horizontalLineToRelative(-7.0f);
        pathBuilderA.lineToRelative(-2.09f, -0.73f);
        pathBuilderA.lineToRelative(0.33f, -0.94f);
        pathBuilderA.lineTo(13.0f, 16.0f);
        pathBuilderA.horizontalLineToRelative(2.82f);
        pathBuilderA.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        h.n(pathBuilderA, 8.97f, 11.0f, 7.0f, 9.02f);
        pathBuilderA.lineTo(14.0f, 22.0f);
        pathBuilderA.lineToRelative(8.0f, -3.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(21.99f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(20.0f, 14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -2.0f, -4.0f, -2.0f, -4.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.0f, 2.9f, -2.0f, 4.0f);
        pathBuilderA.curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cleanHands = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
