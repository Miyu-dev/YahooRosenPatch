package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CameraIndoor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cameraIndoor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CameraIndoor", "Landroidx/compose/material/icons/Icons$Outlined;", "getCameraIndoor", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CameraIndoorKt {
    private static ImageVector _cameraIndoor;

    public static final ImageVector getCameraIndoor(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _cameraIndoor;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CameraIndoor", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(14.0f, 13.0f, -1.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderE.horizontalLineTo(9.0f);
        pathBuilderE.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderE.horizontalLineToRelative(4.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.q(pathBuilderE, -1.0f, 2.0f, 1.06f, -4.12f);
        androidx.appcompat.view.menu.a.z(pathBuilderE, 14.0f, 13.0f, 12.0f, 5.5f);
        b.h(pathBuilderE, 6.0f, 4.5f, 9.0f, 6.0f);
        pathBuilderE.verticalLineToRelative(-9.0f);
        pathBuilderE.lineTo(12.0f, 5.5f);
        pathBuilderE.moveTo(12.0f, 3.0f);
        a.b.s(pathBuilderE, 4.0f, 9.0f, 12.0f, 16.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.v(pathBuilderE, 9.0f, 12.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraIndoor = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
