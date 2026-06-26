package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: Nightlife.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nightlife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Nightlife", "Landroidx/compose/material/icons/Icons$Rounded;", "getNightlife", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NightlifeKt {
    private static ImageVector _nightlife;

    public static final ImageVector getNightlife(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _nightlife;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Nightlife", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(2.87f, 5.0f, 10.26f);
        pathBuilderB.curveToRelative(0.8f, 0.0f, 1.28f, 0.89f, 0.83f, 1.55f);
        b.s(pathBuilderB, 9.0f, 14.0f, 4.0f, 1.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderB.horizontalLineTo(6.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        a.w(pathBuilderB, 1.0f, -4.0f, 2.04f, 6.55f);
        pathBuilderB.curveTo(1.59f, 5.89f, 2.07f, 5.0f, 2.87f, 5.0f);
        androidx.browser.browseractions.a.y(pathBuilderB, 10.1f, 9.0f, 1.4f, -2.0f);
        pathBuilderB.horizontalLineTo(4.49f);
        pathBuilderB.lineToRelative(1.4f, 2.0f);
        pathBuilderB.horizontalLineTo(10.1f);
        pathBuilderB.close();
        pathBuilderB.moveTo(19.0f, 5.0f);
        pathBuilderB.horizontalLineToRelative(1.5f);
        pathBuilderB.curveTo(21.33f, 5.0f, 22.0f, 5.67f, 22.0f, 6.5f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(22.0f, 7.33f, 21.33f, 8.0f, 20.5f, 8.0f);
        androidx.compose.animation.a.z(pathBuilderB, 19.0f, 9.0f, 0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.0f, 1.84f, -1.64f, 3.28f, -3.54f, 2.95f);
        pathBuilderB.curveToRelative(-1.21f, -0.21f, -2.2f, -1.2f, -2.41f, -2.41f);
        pathBuilderB.curveTo(12.72f, 15.64f, 14.16f, 14.0f, 16.0f, 14.0f);
        pathBuilderB.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        pathBuilderB.verticalLineTo(7.0f);
        pathBuilderB.curveTo(17.0f, 5.9f, 17.9f, 5.0f, 19.0f, 5.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlife = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
