package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: GTranslate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gTranslate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GTranslate", "Landroidx/compose/material/icons/Icons$Filled;", "getGTranslate", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GTranslateKt {
    private static ImageVector _gTranslate;

    public static final ImageVector getGTranslate(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _gTranslate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GTranslate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.0f, 4.0f, 11.0f, 4.0f);
        pathBuilderA.lineToRelative(-1.0f, -3.0f);
        pathBuilderA.lineTo(3.0f, 1.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(15.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.B(pathBuilderA, 8.0f, 1.0f, 3.0f, 9.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(23.0f, 6.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.0f, 16.0f);
        pathBuilderA.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilderA.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilderA.curveToRelative(1.35f, 0.0f, 2.48f, 0.5f, 3.35f, 1.3f);
        pathBuilderA.lineTo(9.03f, 8.57f);
        pathBuilderA.curveToRelative(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f);
        pathBuilderA.curveToRelative(-1.74f, 0.0f, -3.15f, 1.44f, -3.15f, 3.21f);
        pathBuilderA.reflectiveCurveTo(5.26f, 14.21f, 7.0f, 14.21f);
        pathBuilderA.curveToRelative(2.01f, 0.0f, 2.84f, -1.44f, 2.92f, -2.41f);
        b.s(pathBuilderA, 7.0f, 11.8f, -1.71f, 4.68f);
        pathBuilderA.curveToRelative(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f);
        pathBuilderA.curveTo(11.8f, 13.97f, 9.89f, 16.0f, 7.0f, 16.0f);
        androidx.compose.animation.a.j(pathBuilderA, 13.17f, 10.58f, 3.7f);
        pathBuilderA.curveToRelative(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f);
        pathBuilderA.curveToRelative(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f);
        android.support.v4.media.a.t(pathBuilderA, -0.79f, -2.37f, 21.5f, 20.5f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.lineTo(14.0f, 21.5f);
        pathBuilderA.lineToRelative(2.0f, -2.5f);
        pathBuilderA.lineToRelative(-1.04f, -3.1f);
        pathBuilderA.lineToRelative(3.1f, 3.1f);
        pathBuilderA.lineToRelative(0.92f, -0.92f);
        pathBuilderA.lineToRelative(-3.3f, -3.25f);
        pathBuilderA.lineToRelative(0.02f, -0.02f);
        pathBuilderA.curveToRelative(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f);
        b.s(pathBuilderA, 20.0f, 10.59f, -1.3f, -4.53f);
        androidx.compose.animation.a.o(pathBuilderA, 15.47f, 8.0f, -1.29f, 1.29f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -1.44f, 11.46f, 5.5f, 9.04f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderA, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gTranslate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
