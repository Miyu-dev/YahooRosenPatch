package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: BrowserUpdated.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_browserUpdated", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrowserUpdated", "Landroidx/compose/material/icons/Icons$Outlined;", "getBrowserUpdated", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrowserUpdatedKt {
    private static ImageVector _browserUpdated;

    public static final ImageVector getBrowserUpdated(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _browserUpdated;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BrowserUpdated", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(22.0f, 13.0f, 3.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        a.p(pathBuilderE, -3.0f, 1.0f, 1.0f, 2.0f);
        a.z(pathBuilderE, 6.0f, -2.0f, 1.0f, -1.0f);
        pathBuilderE.horizontalLineTo(4.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderE.verticalLineTo(5.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderE.lineToRelative(8.0f, 0.0f);
        v.y(pathBuilderE, 2.0f, 4.0f, 5.0f, 11.0f);
        s.q(pathBuilderE, 16.0f, -3.0f, 22.0f);
        pathBuilderE.moveTo(15.0f, 15.0f);
        pathBuilderE.lineToRelative(-5.0f, -5.0f);
        pathBuilderE.lineToRelative(1.41f, -1.41f);
        androidx.appcompat.app.m.r(pathBuilderE, 14.0f, 11.17f, 3.0f, 2.0f);
        pathBuilderE.verticalLineToRelative(8.17f);
        pathBuilderE.lineToRelative(2.59f, -2.58f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderE, 20.0f, 10.0f, 15.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browserUpdated = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
