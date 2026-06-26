package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
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
import c.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RamenDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ramenDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RamenDining", "Landroidx/compose/material/icons/Icons$Rounded;", "getRamenDining", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RamenDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.0f, 2.84f, 22.0f, 2.84f);
        pathBuilderA.curveToRelative(0.0f, -0.45f, -0.39f, -0.79f, -0.83f, -0.75f);
        pathBuilderA.lineTo(4.89f, 3.9f);
        pathBuilderA.curveTo(4.38f, 3.95f, 4.0f, 4.38f, 4.0f, 4.89f);
        pathBuilderA.verticalLineTo(12.0f);
        pathBuilderA.horizontalLineTo(3.08f);
        pathBuilderA.curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f);
        pathBuilderA.curveTo(2.52f, 16.33f, 4.83f, 19.0f, 8.0f, 20.25f);
        pathBuilderA.verticalLineTo(21.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(6.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-0.75f);
        pathBuilderA.curveToRelative(3.17f, -1.25f, 5.48f, -3.92f, 5.92f, -7.12f);
        pathBuilderA.curveToRelative(0.08f, -0.6f, -0.4f, -1.13f, -1.0f, -1.13f);
        a.i(pathBuilderA, 10.5f, 8.0f, 10.75f);
        pathBuilderA.curveTo(21.66f, 8.0f, 22.0f, 7.66f, 22.0f, 7.25f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderA.horizontalLineTo(10.5f);
        pathBuilderA.verticalLineTo(4.78f);
        pathBuilderA.lineToRelative(10.83f, -1.19f);
        pathBuilderA.curveTo(21.71f, 3.54f, 22.0f, 3.22f, 22.0f, 2.84f);
        h.B(pathBuilderA, 6.5f, 5.22f, 6.5f, -1.0f);
        h.u(pathBuilderA, 5.34f, 6.5f, 5.22f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 5.5f, 8.0f, 1.0f, 4.0f);
        b.m(pathBuilderA, -1.0f, 8.0f, 9.0f, 12.0f);
        h.x(pathBuilderA, 8.0f, 8.0f, 1.0f, 12.0f);
        android.support.v4.media.a.B(pathBuilderA, 9.0f, 6.5f, 8.0f, 5.06f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.l(pathBuilderA, 1.0f, -0.11f, 6.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
