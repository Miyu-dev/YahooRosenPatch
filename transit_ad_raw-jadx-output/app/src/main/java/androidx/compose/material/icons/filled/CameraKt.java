package androidx.compose.material.icons.filled;

import a6.h;
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

/* JADX INFO: compiled from: Camera.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_camera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "Landroidx/compose/material/icons/Icons$Filled;", "getCamera", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Camera", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.4f, 10.5f, 4.77f, -8.26f);
        pathBuilderA.curveTo(13.47f, 2.09f, 12.75f, 2.0f, 12.0f, 2.0f);
        pathBuilderA.curveToRelative(-2.4f, 0.0f, -4.6f, 0.85f, -6.32f, 2.25f);
        a.n(pathBuilderA, 3.66f, 6.35f, 0.06f, -0.1f);
        pathBuilderA.moveTo(21.54f, 9.0f);
        pathBuilderA.curveToRelative(-0.92f, -2.92f, -3.15f, -5.26f, -6.0f, -6.34f);
        h.m(pathBuilderA, 11.88f, 9.0f, 9.66f);
        pathBuilderA.moveTo(21.8f, 10.0f);
        pathBuilderA.horizontalLineToRelative(-7.49f);
        pathBuilderA.lineToRelative(0.29f, 0.5f);
        pathBuilderA.lineToRelative(4.76f, 8.25f);
        pathBuilderA.curveTo(21.0f, 16.97f, 22.0f, 14.61f, 22.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, -0.69f, -0.07f, -1.35f, -0.2f, -2.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 8.54f, 12.0f, -3.9f, -6.75f);
        pathBuilderA.curveTo(3.01f, 7.03f, 2.0f, 9.39f, 2.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 0.69f, 0.07f, 1.35f, 0.2f, 2.0f);
        b.C(pathBuilderA, 7.49f, -1.15f, -2.0f);
        pathBuilderA.moveTo(2.46f, 15.0f);
        pathBuilderA.curveToRelative(0.92f, 2.92f, 3.15f, 5.26f, 6.0f, 6.34f);
        a.C(pathBuilderA, 12.12f, 15.0f, 2.46f, 15.0f);
        pathBuilderA.moveTo(13.73f, 15.0f);
        pathBuilderA.lineToRelative(-3.9f, 6.76f);
        pathBuilderA.curveToRelative(0.7f, 0.15f, 1.42f, 0.24f, 2.17f, 0.24f);
        pathBuilderA.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.32f, -2.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, -3.66f, -6.35f, -0.93f, 1.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
