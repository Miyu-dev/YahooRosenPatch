package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: IntegrationInstructions.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_integrationInstructions", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IntegrationInstructions", "Landroidx/compose/material/icons/Icons$Filled;", "getIntegrationInstructions", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class IntegrationInstructionsKt {
    private static ImageVector _integrationInstructions;

    public static final ImageVector getIntegrationInstructions(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _integrationInstructions;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.IntegrationInstructions", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(19.0f, 3.0f, -4.18f);
        pathBuilderB.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        pathBuilderB.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.curveTo(4.86f, 3.0f, 4.73f, 3.01f, 4.6f, 3.04f);
        pathBuilderB.curveTo(4.21f, 3.12f, 3.86f, 3.32f, 3.59f, 3.59f);
        pathBuilderB.curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f);
        pathBuilderB.curveTo(3.06f, 4.46f, 3.0f, 4.72f, 3.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f);
        pathBuilderB.curveToRelative(0.1f, 0.24f, 0.25f, 0.45f, 0.43f, 0.64f);
        pathBuilderB.curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f);
        pathBuilderB.curveTo(4.73f, 20.99f, 4.86f, 21.0f, 5.0f, 21.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        a.y(pathBuilderB, 11.0f, 14.17f, -1.41f, 1.42f);
        pathBuilderB.lineTo(6.0f, 12.0f);
        pathBuilderB.lineToRelative(3.59f, -3.59f);
        pathBuilderB.lineTo(11.0f, 9.83f);
        android.support.v4.media.a.C(pathBuilderB, 8.83f, 12.0f, 11.0f, 14.17f);
        pathBuilderB.moveTo(12.0f, 4.25f);
        pathBuilderB.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderB.reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f);
        pathBuilderB.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f);
        androidx.compose.animation.a.t(pathBuilderB, 14.41f, 15.59f, 13.0f, 14.17f);
        pathBuilderB.lineTo(15.17f, 12.0f);
        pathBuilderB.lineTo(13.0f, 9.83f);
        pathBuilderB.lineToRelative(1.41f, -1.42f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB, 18.0f, 12.0f, 14.41f, 15.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _integrationInstructions = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
