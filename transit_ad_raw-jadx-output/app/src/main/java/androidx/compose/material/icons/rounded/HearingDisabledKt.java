package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: HearingDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hearingDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HearingDisabled", "Landroidx/compose/material/icons/Icons$Rounded;", "getHearingDisabled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HearingDisabledKt {
    private static ImageVector _hearingDisabled;

    public static final ImageVector getHearingDisabled(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hearingDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HearingDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.96f, 3.3f);
        pathBuilderD.curveToRelative(-0.32f, -0.39f, -0.29f, -0.96f, 0.07f, -1.32f);
        pathBuilderD.lineToRelative(0.01f, -0.01f);
        pathBuilderD.curveToRelative(0.42f, -0.42f, 1.12f, -0.38f, 1.49f, 0.08f);
        pathBuilderD.curveTo(20.07f, 3.94f, 21.0f, 6.36f, 21.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, 2.57f, -0.89f, 4.94f, -2.36f, 6.81f);
        pathBuilderD.lineToRelative(-1.43f, -1.43f);
        pathBuilderD.curveTo(18.33f, 12.88f, 19.0f, 11.02f, 19.0f, 9.0f);
        pathBuilderD.curveTo(19.0f, 6.83f, 18.23f, 4.84f, 16.96f, 3.3f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.49f, 4.66f);
        pathBuilderD.curveTo(8.23f, 4.24f, 9.08f, 4.0f, 10.0f, 4.0f);
        pathBuilderD.curveToRelative(2.8f, 0.0f, 5.0f, 2.2f, 5.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.8f, -0.23f, 1.69f, -0.63f, 2.54f);
        pathBuilderD.lineToRelative(1.48f, 1.48f);
        pathBuilderD.curveToRelative(0.02f, -0.04f, 0.05f, -0.08f, 0.08f, -0.13f);
        pathBuilderD.curveTo(16.62f, 11.65f, 17.0f, 10.26f, 17.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -3.93f, -3.07f, -7.0f, -7.0f, -7.0f);
        pathBuilderD.curveTo(8.51f, 2.0f, 7.15f, 2.44f, 6.03f, 3.2f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 7.49f, 4.66f, 10.0f, 6.5f);
        pathBuilderD.curveToRelative(-0.21f, 0.0f, -0.4f, 0.03f, -0.59f, 0.08f);
        pathBuilderD.lineToRelative(3.01f, 3.01f);
        pathBuilderD.curveTo(12.47f, 9.4f, 12.5f, 9.21f, 12.5f, 9.0f);
        pathBuilderD.curveTo(12.5f, 7.62f, 11.38f, 6.5f, 10.0f, 6.5f);
        androidx.compose.animation.a.t(pathBuilderD, 20.49f, 20.49f, 3.51f, 3.51f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(1.42f, 1.42f);
        pathBuilderD.curveToRelative(-0.2f, 0.49f, -0.35f, 1.0f, -0.43f, 1.54f);
        pathBuilderD.curveTo(2.99f, 8.47f, 3.47f, 9.0f, 4.06f, 9.0f);
        pathBuilderD.horizontalLineTo(4.1f);
        pathBuilderD.curveToRelative(0.48f, 0.0f, 0.89f, -0.35f, 0.96f, -0.82f);
        pathBuilderD.curveTo(5.08f, 8.1f, 5.1f, 8.02f, 5.12f, 7.95f);
        pathBuilderD.lineToRelative(6.62f, 6.62f);
        pathBuilderD.curveToRelative(-0.88f, 0.68f, -1.78f, 1.41f, -2.27f, 2.9f);
        pathBuilderD.curveToRelative(-0.5f, 1.5f, -1.0f, 2.01f, -1.71f, 2.38f);
        pathBuilderD.curveTo(7.56f, 19.94f, 7.29f, 20.0f, 7.0f, 20.0f);
        pathBuilderD.curveToRelative(-0.88f, 0.0f, -1.63f, -0.58f, -1.9f, -1.37f);
        pathBuilderD.curveTo(4.97f, 18.24f, 4.57f, 18.0f, 4.15f, 18.0f);
        pathBuilderD.curveTo(3.49f, 18.0f, 3.0f, 18.64f, 3.2f, 19.26f);
        pathBuilderD.curveTo(3.73f, 20.85f, 5.23f, 22.0f, 7.0f, 22.0f);
        pathBuilderD.curveToRelative(0.57f, 0.0f, 1.13f, -0.12f, 1.64f, -0.35f);
        pathBuilderD.curveToRelative(1.36f, -0.71f, 2.13f, -1.73f, 2.73f, -3.55f);
        pathBuilderD.curveToRelative(0.32f, -0.98f, 0.9f, -1.43f, 1.71f, -2.05f);
        pathBuilderD.curveToRelative(0.03f, -0.02f, 0.05f, -0.04f, 0.08f, -0.06f);
        pathBuilderD.lineToRelative(5.91f, 5.91f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hearingDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
