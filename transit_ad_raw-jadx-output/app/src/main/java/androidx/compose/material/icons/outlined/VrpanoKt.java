package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Vrpano.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vrpano", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Vrpano", "Landroidx/compose/material/icons/Icons$Outlined;", "getVrpano", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VrpanoKt {
    private static ImageVector _vrpano;

    public static final ImageVector getVrpano(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _vrpano;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Vrpano", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.01f, 4.0f);
        pathBuilderD.curveTo(20.45f, 4.0f, 17.4f, 5.5f, 12.0f, 5.5f);
        pathBuilderD.curveToRelative(-5.31f, 0.0f, -8.49f, -1.49f, -9.01f, -1.49f);
        pathBuilderD.curveTo(2.46f, 4.01f, 2.0f, 4.45f, 2.0f, 5.02f);
        pathBuilderD.verticalLineTo(19.0f);
        pathBuilderD.curveToRelative(0.0f, 0.57f, 0.46f, 1.0f, 0.99f, 1.0f);
        pathBuilderD.curveToRelative(0.57f, 0.0f, 3.55f, -1.5f, 9.01f, -1.5f);
        pathBuilderD.curveToRelative(5.42f, 0.0f, 8.44f, 1.5f, 9.01f, 1.5f);
        pathBuilderD.curveToRelative(0.53f, 0.0f, 0.99f, -0.43f, 0.99f, -1.0f);
        pathBuilderD.verticalLineTo(5.0f);
        pathBuilderD.curveTo(22.0f, 4.43f, 21.54f, 4.0f, 21.01f, 4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.0f, 17.63f);
        pathBuilderD.curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8.0f, -1.13f);
        pathBuilderD.curveToRelative(-3.39f, 0.0f, -5.99f, 0.54f, -8.0f, 1.13f);
        pathBuilderD.verticalLineTo(6.38f);
        pathBuilderD.curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12.0f, 7.5f);
        pathBuilderD.curveToRelative(3.38f, 0.0f, 5.99f, -0.54f, 8.0f, -1.13f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 17.63f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.17f, 10.99f, -3.69f, 4.42f);
        pathBuilderA.curveTo(7.48f, 15.15f, 9.66f, 15.0f, 12.0f, 15.0f);
        pathBuilderA.curveToRelative(2.3f, 0.0f, 4.52f, 0.15f, 6.51f, 0.4f);
        pathBuilderA.lineTo(14.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, -2.83f, 3.39f, 9.17f, 10.99f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vrpano = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
