package androidx.compose.material.icons.filled;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: IosShare.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_iosShare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "IosShare", "Landroidx/compose/material/icons/Icons$Filled;", "getIosShare", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class IosShareKt {
    private static ImageVector _iosShare;

    public static final ImageVector getIosShare(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _iosShare;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.IosShare", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.0f, 5.0f, -1.42f, 1.42f);
        pathBuilderA.lineToRelative(-1.59f, -1.59f);
        pathBuilderA.lineTo(12.99f, 16.0f);
        pathBuilderA.horizontalLineToRelative(-1.98f);
        pathBuilderA.lineTo(11.01f, 4.83f);
        pathBuilderA.lineTo(9.42f, 6.42f);
        pathBuilderA.lineTo(8.0f, 5.0f);
        a.n(pathBuilderA, 4.0f, -4.0f, 4.0f, 4.0f);
        pathBuilderA.moveTo(20.0f, 10.0f);
        pathBuilderA.verticalLineToRelative(11.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderA.lineTo(6.0f, 23.0f);
        pathBuilderA.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.lineTo(4.0f, 10.0f);
        pathBuilderA.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        a.w(pathBuilderA, 3.0f, 2.0f, 6.0f, 10.0f);
        androidx.browser.browseractions.a.x(pathBuilderA, 11.0f, 12.0f, 18.0f, 10.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -3.0f, 15.0f, 8.0f, 3.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iosShare = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
