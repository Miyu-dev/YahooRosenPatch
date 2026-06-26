package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Bungalow.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bungalow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Bungalow", "Landroidx/compose/material/icons/Icons$Outlined;", "getBungalow", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BungalowKt {
    private static ImageVector _bungalow;

    public static final ImageVector getBungalow(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _bungalow;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bungalow", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(13.0f, 14.0f, -2.0f, -2.0f, 2.0f);
        android.support.v4.media.a.y(pathBuilderF, 14.0f, 18.1f, 16.56f);
        a.D(pathBuilderF, 17.0f, 14.79f, 21.0f, 7.0f);
        pathBuilderF.verticalLineToRelative(-6.2f);
        pathBuilderF.lineToRelative(-1.1f, 1.76f);
        pathBuilderF.lineTo(4.2f, 15.5f);
        pathBuilderF.lineTo(12.0f, 3.0f);
        s.r(pathBuilderF, 7.8f, 12.5f, 18.1f, 16.56f);
        pathBuilderF.moveTo(15.0f, 11.59f);
        pathBuilderF.lineToRelative(-3.0f, -4.8f);
        s.D(pathBuilderF, -3.0f, 4.8f, 19.0f, 2.0f);
        a.l(pathBuilderF, -3.0f, 2.0f, 3.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderF, 11.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bungalow = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
