package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SensorDoor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sensorDoor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SensorDoor", "Landroidx/compose/material/icons/Icons$Outlined;", "getSensorDoor", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SensorDoorKt {
    private static ImageVector _sensorDoor;

    public static final ImageVector getSensorDoor(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sensorDoor;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SensorDoor", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(18.0f, 4.0f, 16.0f, 6.0f, 4.0f);
        h.f(pathBuilderU, 18.0f, 18.0f, 2.0f, 6.0f);
        pathBuilderU.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        s.l(pathBuilderU, 18.0f, 16.0f, 4.0f);
        pathBuilderU.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderU, 18.0f, 2.0f, 15.5f, 10.5f);
        pathBuilderU.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderU.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderU.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a6.h.t(pathBuilderU, 16.33f, 10.5f, 15.5f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensorDoor = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
