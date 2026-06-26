package androidx.compose.material.icons.outlined;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Cameraswitch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cameraswitch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cameraswitch", "Landroidx/compose/material/icons/Icons$Outlined;", "getCameraswitch", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CameraswitchKt {
    private static ImageVector _cameraswitch;

    public static final ImageVector getCameraswitch(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _cameraswitch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Cameraswitch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(16.0f, 7.0f, -1.0f, -1.0f, -1.0f);
        androidx.appcompat.app.m.D(pathBuilderA, -4.0f, 9.0f, 7.0f, 8.0f);
        pathBuilderA.curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f);
        pathBuilderA.verticalLineToRelative(6.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineTo(9.0f);
        pathBuilderA.curveTo(18.0f, 7.9f, 17.1f, 7.0f, 16.0f, 7.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderA, 16.0f, 15.0f, 8.0f, 9.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderA, 1.83f, 1.0f, -1.0f, 2.34f);
        pathBuilderA.lineToRelative(1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(16.0f);
        pathBuilderA.verticalLineTo(15.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 12.0f, -2.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilderB.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(8.57f, 0.52f, 13.05f, 5.0f);
        pathBuilderA2.lineToRelative(1.41f, -1.41f);
        pathBuilderA2.lineToRelative(-1.54f, -1.54f);
        pathBuilderA2.curveTo(17.7f, 2.46f, 21.53f, 6.24f, 22.0f, 11.0f);
        pathBuilderA2.horizontalLineToRelative(2.0f);
        pathBuilderA2.curveTo(23.36f, 3.3f, 15.79f, -1.67f, 8.57f, 0.52f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = androidx.compose.animation.b.a(9.54f, 20.41f, 1.54f, 1.54f);
        pathBuilderA3.curveTo(6.3f, 21.54f, 2.47f, 17.76f, 2.0f, 13.0f);
        pathBuilderA3.horizontalLineTo(0.0f);
        pathBuilderA3.curveToRelative(0.64f, 7.7f, 8.21f, 12.67f, 15.43f, 10.48f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA3, 10.95f, 19.0f, 9.54f, 20.41f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraswitch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
