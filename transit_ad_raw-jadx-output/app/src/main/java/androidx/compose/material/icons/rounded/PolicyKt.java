package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Policy.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_policy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Policy", "Landroidx/compose/material/icons/Icons$Rounded;", "getPolicy", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PolicyKt {
    private static ImageVector _policy;

    public static final ImageVector getPolicy(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _policy;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Policy", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.0f, 6.3f);
        pathBuilderD.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        pathBuilderD.lineToRelative(-7.0f, -3.11f);
        pathBuilderD.curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
        pathBuilderD.lineToRelative(-7.0f, 3.11f);
        pathBuilderD.curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
        pathBuilderD.verticalLineTo(11.0f);
        pathBuilderD.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        pathBuilderD.curveToRelative(2.3f, -0.56f, 4.33f, -1.9f, 5.88f, -3.71f);
        pathBuilderD.lineToRelative(-3.12f, -3.12f);
        pathBuilderD.curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f);
        pathBuilderD.curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0.0f, -7.07f);
        pathBuilderD.curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0.0f);
        pathBuilderD.curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f);
        pathBuilderD.lineToRelative(2.9f, 2.9f);
        pathBuilderD.curveTo(20.29f, 15.69f, 21.0f, 13.38f, 21.0f, 11.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 6.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 12.0f, -3.0f, 0.0f);
        pathBuilderB.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        pathBuilderB.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _policy = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
