package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: BatchPrediction.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_batchPrediction", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BatchPrediction", "Landroidx/compose/material/icons/Icons$Rounded;", "getBatchPrediction", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BatchPredictionKt {
    private static ImageVector _batchPrediction;

    public static final ImageVector getBatchPrediction(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _batchPrediction;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BatchPrediction", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(17.0f, 8.0f, 7.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(10.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(10.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(10.0f);
        pathBuilderB.curveTo(19.0f, 8.9f, 18.1f, 8.0f, 17.0f, 8.0f);
        a.t(pathBuilderB, 12.0f, 20.5f, 12.0f, 20.5f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.r(pathBuilderB, 19.0f, 2.0f, 0.5f);
        pathBuilderB.curveTo(13.0f, 20.05f, 12.55f, 20.5f, 12.0f, 20.5f);
        a.j(pathBuilderB, 13.0f, 18.0f, -2.0f);
        pathBuilderB.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilderB.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilderB.curveTo(15.5f, 15.0f, 13.0f, 16.5f, 13.0f, 18.0f);
        androidx.browser.browseractions.a.q(pathBuilderB, 18.0f, 6.5f, 6.0f, 0.0f);
        pathBuilderB.curveTo(6.0f, 5.67f, 6.67f, 5.0f, 7.5f, 5.0f);
        pathBuilderB.horizontalLineToRelative(9.0f);
        pathBuilderB.curveTo(17.33f, 5.0f, 18.0f, 5.67f, 18.0f, 6.5f);
        androidx.appcompat.view.menu.a.z(pathBuilderB, 18.0f, 6.5f, 17.0f, 3.5f);
        pathBuilderB.horizontalLineTo(7.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(7.0f, 2.67f, 7.67f, 2.0f, 8.5f, 2.0f);
        pathBuilderB.horizontalLineToRelative(7.0f);
        pathBuilderB.curveTo(16.33f, 2.0f, 17.0f, 2.67f, 17.0f, 3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 17.0f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batchPrediction = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
