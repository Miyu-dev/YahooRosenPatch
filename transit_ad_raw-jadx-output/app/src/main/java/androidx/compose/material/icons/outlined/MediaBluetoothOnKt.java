package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: MediaBluetoothOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mediaBluetoothOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MediaBluetoothOn", "Landroidx/compose/material/icons/Icons$Outlined;", "getMediaBluetoothOn", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MediaBluetoothOnKt {
    private static ImageVector _mediaBluetoothOn;

    public static final ImageVector getMediaBluetoothOn(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _mediaBluetoothOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MediaBluetoothOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.0f, 3.0f, 0.01f, 10.55f);
        pathBuilderA.curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2.0f, -0.55f);
        pathBuilderA.curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f);
        pathBuilderA.reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f);
        pathBuilderA.reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f);
        pathBuilderA.verticalLineTo(7.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.verticalLineTo(3.0f);
        pathBuilderA.horizontalLineTo(9.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(21.0f, 12.43f);
        a.o(pathBuilderA, 17.57f, 9.0f, -0.6f, 4.55f);
        pathBuilderA.lineToRelative(-2.75f, -2.75f);
        pathBuilderA.lineToRelative(-0.85f, 0.85f);
        pathBuilderA.lineTo(16.73f, 15.0f);
        pathBuilderA.lineToRelative(-3.35f, 3.35f);
        pathBuilderA.lineToRelative(0.85f, 0.85f);
        s.D(pathBuilderA, 2.75f, -2.75f, 21.0f, 0.6f);
        pathBuilderA.lineTo(21.0f, 17.57f);
        android.support.v4.media.a.C(pathBuilderA, 18.42f, 15.0f, 21.0f, 12.43f);
        pathBuilderA.moveTo(18.17f, 11.3f);
        pathBuilderA.lineToRelative(1.13f, 1.13f);
        c.a.g(pathBuilderA, -1.13f, 1.13f, 11.3f);
        pathBuilderA.moveTo(19.3f, 17.57f);
        pathBuilderA.lineToRelative(-1.13f, 1.13f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.i(pathBuilderA, -2.26f, 19.3f, 17.57f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
