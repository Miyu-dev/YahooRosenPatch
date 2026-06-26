package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: LinkedCamera.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_linkedCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinkedCamera", "Landroidx/compose/material/icons/Icons$Outlined;", "getLinkedCamera", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LinkedCameraKt {
    private static ImageVector _linkedCamera;

    public static final ImageVector getLinkedCamera(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _linkedCamera;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LinkedCamera", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(20.0f, 9.0f, 11.0f, 4.0f, 20.0f);
        pathBuilderU.lineTo(4.0f, 8.0f);
        pathBuilderU.horizontalLineToRelative(4.05f);
        pathBuilderU.lineToRelative(1.83f, -2.0f);
        pathBuilderU.lineTo(15.0f, 6.0f);
        pathBuilderU.lineTo(15.0f, 4.0f);
        pathBuilderU.lineTo(9.0f, 4.0f);
        pathBuilderU.lineTo(7.17f, 6.0f);
        pathBuilderU.lineTo(4.0f, 6.0f);
        pathBuilderU.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderU.verticalLineToRelative(12.0f);
        pathBuilderU.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderU.horizontalLineToRelative(16.0f);
        pathBuilderU.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.m(pathBuilderU, 22.0f, 9.0f, -2.0f);
        pathBuilderU.moveTo(20.67f, 7.99f);
        pathBuilderU.lineTo(22.0f, 7.99f);
        pathBuilderU.curveTo(21.99f, 4.68f, 19.31f, 2.0f, 16.0f, 2.0f);
        pathBuilderU.verticalLineToRelative(1.33f);
        pathBuilderU.curveToRelative(2.58f, 0.0f, 4.66f, 2.08f, 4.67f, 4.66f);
        androidx.compose.animation.a.j(pathBuilderU, 18.0f, 7.99f, 1.33f);
        pathBuilderU.curveToRelative(-0.01f, -1.84f, -1.49f, -3.32f, -3.33f, -3.32f);
        pathBuilderU.lineTo(16.0f, 6.0f);
        pathBuilderU.curveToRelative(1.11f, 0.0f, 1.99f, 0.89f, 2.0f, 1.99f);
        pathBuilderU.close();
        pathBuilderU.moveTo(7.0f, 14.0f);
        pathBuilderU.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderU.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderU.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilderU.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderU.close();
        pathBuilderU.moveTo(15.0f, 14.0f);
        pathBuilderU.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilderU.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilderU.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderU, 3.0f, 1.34f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkedCamera = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
