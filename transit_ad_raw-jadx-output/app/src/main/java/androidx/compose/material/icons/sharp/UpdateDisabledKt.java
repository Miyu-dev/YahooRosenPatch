package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: UpdateDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_updateDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "UpdateDisabled", "Landroidx/compose/material/icons/Icons$Sharp;", "getUpdateDisabled", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UpdateDisabledKt {
    private static ImageVector _updateDisabled;

    public static final ImageVector getUpdateDisabled(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.UpdateDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(8.67f, 5.84f, 7.22f, 4.39f);
        pathBuilderA.curveTo(8.6f, 3.51f, 10.24f, 3.0f, 12.0f, 3.0f);
        pathBuilderA.curveToRelative(2.74f, 0.0f, 5.19f, 1.23f, 6.84f, 3.16f);
        b.s(pathBuilderA, 21.0f, 4.0f, 6.0f, -6.0f);
        pathBuilderA.lineToRelative(2.41f, -2.41f);
        pathBuilderA.curveTo(16.12f, 6.02f, 14.18f, 5.0f, 12.0f, 5.0f);
        pathBuilderA.curveTo(10.8f, 5.0f, 9.66f, 5.31f, 8.67f, 5.84f);
        androidx.compose.animation.b.r(pathBuilderA, 13.0f, 7.0f, -2.0f, 1.17f);
        a.g(pathBuilderA, 2.0f, 2.0f, 7.0f);
        pathBuilderA.moveTo(19.78f, 22.61f);
        pathBuilderA.lineToRelative(-3.0f, -3.0f);
        pathBuilderA.curveTo(15.39f, 20.48f, 13.76f, 21.0f, 12.0f, 21.0f);
        pathBuilderA.curveToRelative(-4.97f, 0.0f, -9.0f, -4.03f, -9.0f, -9.0f);
        pathBuilderA.curveToRelative(0.0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f);
        pathBuilderA.lineTo(1.39f, 4.22f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderA, 18.38f, 18.38f, 19.78f, 22.61f);
        pathBuilderA.moveTo(15.32f, 18.15f);
        pathBuilderA.lineTo(5.84f, 8.67f);
        pathBuilderA.curveTo(5.31f, 9.66f, 5.0f, 10.8f, 5.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f);
        pathBuilderA.curveTo(13.2f, 19.0f, 14.34f, 18.69f, 15.32f, 18.15f);
        androidx.compose.animation.a.j(pathBuilderA, 20.94f, 13.0f, -2.02f);
        pathBuilderA.curveToRelative(-0.12f, 0.83f, -0.39f, 1.61f, -0.77f, 2.32f);
        pathBuilderA.lineToRelative(1.47f, 1.47f);
        pathBuilderA.curveTo(20.32f, 15.67f, 20.79f, 14.38f, 20.94f, 13.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
