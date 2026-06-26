package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: AutoFixNormal.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoFixNormal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoFixNormal", "Landroidx/compose/material/icons/Icons$Outlined;", "getAutoFixNormal", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoFixNormalKt {
    private static ImageVector _autoFixNormal;

    public static final ImageVector getAutoFixNormal(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _autoFixNormal;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AutoFixNormal", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.0f, 7.0f, 0.94f, -2.06f);
        pathBuilderA.lineToRelative(2.06f, -0.94f);
        pathBuilderA.lineToRelative(-2.06f, -0.94f);
        pathBuilderA.lineToRelative(-0.94f, -2.06f);
        pathBuilderA.lineToRelative(-0.94f, 2.06f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, -2.06f, 0.94f, 2.06f, 0.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(17.71f, 9.12f, -2.83f, -2.83f);
        pathBuilderA2.curveTo(14.68f, 6.1f, 14.43f, 6.0f, 14.17f, 6.0f);
        pathBuilderA2.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilderA2.lineTo(2.29f, 17.46f);
        pathBuilderA2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA2.lineToRelative(2.83f, 2.83f);
        pathBuilderA2.curveTo(5.32f, 21.9f, 5.57f, 22.0f, 5.83f, 22.0f);
        pathBuilderA2.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        pathBuilderA2.lineToRelative(11.17f, -11.17f);
        pathBuilderA2.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        androidx.browser.browseractions.a.y(pathBuilderA2, 14.17f, 8.42f, 1.41f, 1.41f);
        pathBuilderA2.lineTo(14.41f, 11.0f);
        android.support.v4.media.a.C(pathBuilderA2, 13.0f, 9.59f, 14.17f, 8.42f);
        pathBuilderA2.moveTo(5.83f, 19.59f);
        pathBuilderA2.lineToRelative(-1.41f, -1.41f);
        pathBuilderA2.lineTo(11.59f, 11.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA2, 13.0f, 12.41f, 5.83f, 19.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixNormal = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
