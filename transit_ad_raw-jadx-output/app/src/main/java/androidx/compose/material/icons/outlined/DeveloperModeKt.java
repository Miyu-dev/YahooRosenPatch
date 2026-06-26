package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: DeveloperMode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_developerMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DeveloperMode", "Landroidx/compose/material/icons/Icons$Outlined;", "getDeveloperMode", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeveloperModeKt {
    private static ImageVector _developerMode;

    public static final ImageVector getDeveloperMode(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _developerMode;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DeveloperMode", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(7.0f, 5.0f, 10.0f, 2.0f, 2.0f);
        pathBuilderF.lineTo(19.0f, 3.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        pathBuilderF.lineTo(7.0f, 1.0f);
        pathBuilderF.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.x(pathBuilderF, 4.0f, 2.0f, 7.0f, 5.0f);
        pathBuilderF.moveTo(15.41f, 16.59f);
        pathBuilderF.lineTo(20.0f, 12.0f);
        pathBuilderF.lineToRelative(-4.59f, -4.59f);
        pathBuilderF.lineTo(14.0f, 8.83f);
        pathBuilderF.lineTo(17.17f, 12.0f);
        androidx.compose.animation.a.A(pathBuilderF, 14.0f, 15.17f, 1.41f, 1.42f);
        pathBuilderF.moveTo(10.0f, 15.17f);
        pathBuilderF.lineTo(6.83f, 12.0f);
        pathBuilderF.lineTo(10.0f, 8.83f);
        pathBuilderF.lineTo(8.59f, 7.41f);
        pathBuilderF.lineTo(4.0f, 12.0f);
        s.r(pathBuilderF, 4.59f, 4.59f, 10.0f, 15.17f);
        pathBuilderF.moveTo(17.0f, 19.0f);
        pathBuilderF.lineTo(7.0f, 19.0f);
        v.y(pathBuilderF, -2.0f, 5.0f, 17.0f, 4.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.horizontalLineToRelative(10.0f);
        pathBuilderF.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.j(pathBuilderF, -4.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerMode = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
