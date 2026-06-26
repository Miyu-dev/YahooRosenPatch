package androidx.compose.material.icons.filled;

import a.b;
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

/* JADX INFO: compiled from: BusinessCenter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_businessCenter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BusinessCenter", "Landroidx/compose/material/icons/Icons$Filled;", "getBusinessCenter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BusinessCenterKt {
    private static ImageVector _businessCenter;

    public static final ImageVector getBusinessCenter(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _businessCenter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BusinessCenter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(10.0f, 16.0f, -1.0f, 3.01f, 15.0f);
        pathBuilderU.lineTo(3.0f, 19.0f);
        pathBuilderU.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderU.horizontalLineToRelative(14.0f);
        pathBuilderU.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.y(pathBuilderU, -4.0f, -7.0f, 1.0f, -4.0f);
        pathBuilderU.moveTo(20.0f, 7.0f);
        pathBuilderU.horizontalLineToRelative(-4.01f);
        pathBuilderU.lineTo(15.99f, 5.0f);
        pathBuilderU.lineToRelative(-2.0f, -2.0f);
        androidx.compose.animation.a.p(pathBuilderU, -4.0f, -2.0f, 2.0f, 2.0f);
        pathBuilderU.lineTo(4.0f, 7.0f);
        pathBuilderU.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderU.verticalLineToRelative(3.0f);
        pathBuilderU.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderU, 6.0f, -2.0f, 4.0f, 2.0f);
        pathBuilderU.horizontalLineToRelative(6.0f);
        pathBuilderU.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderU.lineTo(22.0f, 9.0f);
        pathBuilderU.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.j(pathBuilderU, 14.0f, 7.0f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderU, 10.0f, 5.0f, 4.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _businessCenter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
