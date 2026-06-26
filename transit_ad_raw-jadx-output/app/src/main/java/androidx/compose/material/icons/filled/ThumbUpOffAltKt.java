package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: ThumbUpOffAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbUpOffAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbUpOffAlt", "Landroidx/compose/material/icons/Icons$Filled;", "getThumbUpOffAlt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThumbUpOffAltKt {
    private static ImageVector _thumbUpOffAlt;

    public static final ImageVector getThumbUpOffAlt(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _thumbUpOffAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbUpOffAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.11f, 5.72f, -0.57f, 2.89f);
        pathBuilderA.curveToRelative(-0.12f, 0.59f, 0.04f, 1.2f, 0.42f, 1.66f);
        pathBuilderA.curveToRelative(0.38f, 0.46f, 0.94f, 0.73f, 1.54f, 0.73f);
        pathBuilderA.horizontalLineTo(20.0f);
        pathBuilderA.verticalLineToRelative(1.08f);
        pathBuilderA.lineTo(17.43f, 18.0f);
        pathBuilderA.horizontalLineTo(9.34f);
        pathBuilderA.curveToRelative(-0.18f, 0.0f, -0.34f, -0.16f, -0.34f, -0.34f);
        pathBuilderA.verticalLineTo(9.82f);
        pathBuilderA.lineToRelative(4.11f, -4.1f);
        pathBuilderA.moveTo(14.0f, 2.0f);
        pathBuilderA.lineTo(7.59f, 8.41f);
        pathBuilderA.curveTo(7.21f, 8.79f, 7.0f, 9.3f, 7.0f, 9.83f);
        pathBuilderA.verticalLineToRelative(7.83f);
        pathBuilderA.curveTo(7.0f, 18.95f, 8.05f, 20.0f, 9.34f, 20.0f);
        pathBuilderA.horizontalLineToRelative(8.1f);
        pathBuilderA.curveToRelative(0.71f, 0.0f, 1.36f, -0.37f, 1.72f, -0.97f);
        pathBuilderA.lineToRelative(2.67f, -6.15f);
        pathBuilderA.curveToRelative(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f);
        pathBuilderA.verticalLineTo(11.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.horizontalLineToRelative(-5.5f);
        pathBuilderA.lineToRelative(0.92f, -4.65f);
        pathBuilderA.curveToRelative(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f);
        pathBuilderA.curveToRelative(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f);
        a.z(pathBuilderA, 14.0f, 2.0f, 4.0f, 9.0f);
        androidx.compose.animation.a.s(pathBuilderA, 2.0f, 11.0f, 2.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-9.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpOffAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
