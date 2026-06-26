package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: CropRotate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cropRotate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CropRotate", "Landroidx/compose/material/icons/Icons$Sharp;", "getCropRotate", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CropRotateKt {
    private static ImageVector _cropRotate;

    public static final ImageVector getCropRotate(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _cropRotate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CropRotate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.47f, 21.49f);
        pathBuilderD.curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13.0f);
        pathBuilderD.lineTo(0.0f, 13.0f);
        pathBuilderD.curveToRelative(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f);
        pathBuilderD.curveToRelative(0.23f, 0.0f, 0.44f, -0.02f, 0.66f, -0.03f);
        androidx.compose.animation.a.A(pathBuilderD, 8.8f, 20.15f, -1.33f, 1.34f);
        pathBuilderD.moveTo(12.05f, 0.0f);
        pathBuilderD.curveToRelative(-0.23f, 0.0f, -0.44f, 0.02f, -0.66f, 0.04f);
        pathBuilderD.lineToRelative(3.81f, 3.81f);
        pathBuilderD.lineToRelative(1.33f, -1.33f);
        pathBuilderD.curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11.0f);
        pathBuilderD.lineTo(24.0f, 11.0f);
        pathBuilderD.curveToRelative(-0.51f, -6.16f, -5.66f, -11.0f, -11.95f, -11.0f);
        androidx.compose.animation.a.j(pathBuilderD, 16.0f, 14.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderD, 18.0f, 6.0f, -8.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderD, 6.0f, 6.0f, 8.0f, 16.0f);
        pathBuilderD.lineTo(8.0f, 4.0f);
        pathBuilderD.lineTo(6.0f, 4.0f);
        v.y(pathBuilderD, 2.0f, 4.0f, 6.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 2.0f, 10.0f, 10.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 2.0f, -2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 8.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cropRotate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
