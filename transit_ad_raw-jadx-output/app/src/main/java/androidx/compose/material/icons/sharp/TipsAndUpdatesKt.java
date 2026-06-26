package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: TipsAndUpdates.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tipsAndUpdates", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TipsAndUpdates", "Landroidx/compose/material/icons/Icons$Sharp;", "getTipsAndUpdates", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TipsAndUpdatesKt {
    private static ImageVector _tipsAndUpdates;

    public static final ImageVector getTipsAndUpdates(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _tipsAndUpdates;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TipsAndUpdates", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(7.0f, 20.0f, 4.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderB.reflectiveCurveTo(7.0f, 21.1f, 7.0f, 20.0f);
        b.r(pathBuilderB, 5.0f, 19.0f, 8.0f, -2.0f);
        a.b.B(pathBuilderB, 5.0f, 19.0f, 16.5f, 9.5f);
        pathBuilderB.curveToRelative(0.0f, 3.82f, -2.66f, 5.86f, -3.77f, 6.5f);
        pathBuilderB.horizontalLineTo(5.27f);
        pathBuilderB.curveTo(4.16f, 15.36f, 1.5f, 13.32f, 1.5f, 9.5f);
        pathBuilderB.curveTo(1.5f, 5.36f, 4.86f, 2.0f, 9.0f, 2.0f);
        pathBuilderB.reflectiveCurveTo(16.5f, 5.36f, 16.5f, 9.5f);
        a.t(pathBuilderB, 21.37f, 7.37f, 20.0f, 8.0f);
        pathBuilderB.lineToRelative(1.37f, 0.63f);
        pathBuilderB.lineTo(22.0f, 10.0f);
        pathBuilderB.lineToRelative(0.63f, -1.37f);
        pathBuilderB.lineTo(24.0f, 8.0f);
        pathBuilderB.lineToRelative(-1.37f, -0.63f);
        android.support.v4.media.a.C(pathBuilderB, 22.0f, 6.0f, 21.37f, 7.37f);
        pathBuilderB.moveTo(19.0f, 6.0f);
        pathBuilderB.lineToRelative(0.94f, -2.06f);
        pathBuilderB.lineTo(22.0f, 3.0f);
        pathBuilderB.lineToRelative(-2.06f, -0.94f);
        pathBuilderB.lineTo(19.0f, 0.0f);
        pathBuilderB.lineToRelative(-0.94f, 2.06f);
        pathBuilderB.lineTo(16.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderB, 2.06f, 0.94f, 19.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tipsAndUpdates = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
