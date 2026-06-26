package androidx.compose.material.icons.filled;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: NoFlash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noFlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFlash", "Landroidx/compose/material/icons/Icons$Filled;", "getNoFlash", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoFlash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.93f, 13.93f, 2.45f, 2.45f);
        pathBuilderA.lineTo(1.04f, 3.87f);
        pathBuilderA.lineToRelative(5.3f, 5.3f);
        pathBuilderA.lineTo(6.14f, 9.4f);
        pathBuilderA.horizontalLineTo(3.6f);
        pathBuilderA.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        pathBuilderA.verticalLineToRelative(9.4f);
        pathBuilderA.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        pathBuilderA.horizontalLineToRelative(12.8f);
        pathBuilderA.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        pathBuilderA.lineToRelative(2.18f, 2.18f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        a.C(pathBuilderA, 18.0f, 18.0f, 13.93f, 13.93f);
        pathBuilderA.moveTo(10.0f, 20.0f);
        pathBuilderA.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderA.curveToRelative(0.0f, -1.95f, 1.4f, -3.57f, 3.25f, -3.92f);
        pathBuilderA.lineToRelative(1.57f, 1.57f);
        pathBuilderA.curveToRelative(-0.26f, -0.09f, -0.53f, -0.15f, -0.82f, -0.15f);
        pathBuilderA.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilderA.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilderA.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderA.curveToRelative(0.0f, -0.29f, -0.06f, -0.56f, -0.15f, -0.82f);
        pathBuilderA.lineToRelative(1.57f, 1.57f);
        pathBuilderA.curveTo(13.57f, 18.6f, 11.95f, 20.0f, 10.0f, 20.0f);
        androidx.compose.animation.a.t(pathBuilderA, 18.0f, 15.17f, 10.83f, 8.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderA, 1.75f, 1.28f, 1.4f, 2.54f);
        pathBuilderA.curveToRelative(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f);
        androidx.compose.animation.a.y(pathBuilderA, 15.17f, 20.4f, 5.6f, 22.0f);
        androidx.appcompat.app.m.r(pathBuilderA, 19.0f, 11.0f, 7.0f, -1.0f);
        pathBuilderA.verticalLineTo(2.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.lineTo(20.4f, 5.6f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFlash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
