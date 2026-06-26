package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ImportantDevices.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_importantDevices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ImportantDevices", "Landroidx/compose/material/icons/Icons$Sharp;", "getImportantDevices", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ImportantDevicesKt {
    private static ImageVector _importantDevices;

    public static final ImageVector getImportantDevices(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _importantDevices;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ImportantDevices", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(24.0f, 11.01f, 17.0f, 11.0f, 11.0f);
        b.m(pathBuilderB, 7.0f, 11.01f, 23.0f, 20.0f);
        b.A(pathBuilderB, -5.0f, -7.0f, 5.0f, 7.0f);
        b.z(pathBuilderB, 22.0f, 2.0f, 0.0f, 16.0f);
        androidx.appcompat.app.m.x(pathBuilderB, 9.0f, 2.0f, 7.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderB, 8.0f, -2.0f, -2.0f, -2.0f);
        android.support.v4.media.a.z(pathBuilderB, 2.0f, -2.0f, 2.0f, 4.0f);
        androidx.compose.animation.a.B(pathBuilderB, 18.0f, 5.0f, 2.0f, 2.0f);
        pathBuilderB.moveTo(11.97f, 9.0f);
        pathBuilderB.lineTo(11.0f, 6.0f);
        pathBuilderB.lineToRelative(-0.97f, 3.0f);
        pathBuilderB.horizontalLineTo(7.0f);
        pathBuilderB.lineToRelative(2.47f, 1.76f);
        pathBuilderB.lineToRelative(-0.94f, 2.91f);
        pathBuilderB.lineToRelative(2.47f, -1.8f);
        pathBuilderB.lineToRelative(2.47f, 1.8f);
        pathBuilderB.lineToRelative(-0.94f, -2.91f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.p(pathBuilderB, 15.0f, 9.0f, -3.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importantDevices = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
