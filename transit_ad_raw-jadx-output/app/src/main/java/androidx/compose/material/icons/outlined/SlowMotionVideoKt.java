package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: SlowMotionVideo.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_slowMotionVideo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SlowMotionVideo", "Landroidx/compose/material/icons/Icons$Outlined;", "getSlowMotionVideo", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SlowMotionVideoKt {
    private static ImageVector _slowMotionVideo;

    public static final ImageVector getSlowMotionVideo(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _slowMotionVideo;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SlowMotionVideo", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(13.05f, 9.79f, 10.0f, 7.5f, 9.0f);
        pathBuilderB.lineToRelative(3.05f, -2.29f);
        androidx.compose.animation.a.A(pathBuilderB, 16.0f, 12.0f, -2.95f, -2.21f);
        pathBuilderB.moveTo(13.05f, 9.79f);
        pathBuilderB.lineTo(10.0f, 7.5f);
        pathBuilderB.verticalLineToRelative(9.0f);
        pathBuilderB.lineToRelative(3.05f, -2.29f);
        androidx.compose.animation.a.A(pathBuilderB, 16.0f, 12.0f, -2.95f, -2.21f);
        pathBuilderB.moveTo(13.05f, 9.79f);
        pathBuilderB.lineTo(10.0f, 7.5f);
        pathBuilderB.verticalLineToRelative(9.0f);
        pathBuilderB.lineToRelative(3.05f, -2.29f);
        androidx.compose.animation.a.A(pathBuilderB, 16.0f, 12.0f, -2.95f, -2.21f);
        pathBuilderB.moveTo(11.0f, 4.07f);
        pathBuilderB.lineTo(11.0f, 2.05f);
        pathBuilderB.curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f);
        pathBuilderB.lineTo(7.1f, 5.69f);
        pathBuilderB.curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f);
        androidx.compose.animation.a.t(pathBuilderB, 5.69f, 7.1f, 4.26f, 5.68f);
        pathBuilderB.curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f);
        pathBuilderB.horizontalLineToRelative(2.02f);
        pathBuilderB.curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f);
        androidx.compose.animation.a.t(pathBuilderB, 4.07f, 13.0f, 2.05f, 13.0f);
        pathBuilderB.curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f);
        pathBuilderB.lineToRelative(1.43f, -1.43f);
        pathBuilderB.curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f);
        pathBuilderB.close();
        pathBuilderB.moveTo(5.68f, 19.74f);
        pathBuilderB.curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f);
        pathBuilderB.verticalLineToRelative(-2.02f);
        pathBuilderB.curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f);
        android.support.v4.media.a.t(pathBuilderB, -1.42f, 1.43f, 22.0f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, 5.16f, -3.92f, 9.42f, -8.95f, 9.95f);
        pathBuilderB.verticalLineToRelative(-2.02f);
        pathBuilderB.curveTo(16.97f, 19.41f, 20.0f, 16.05f, 20.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(-3.03f, -7.41f, -6.95f, -7.93f);
        pathBuilderB.lineTo(13.05f, 2.05f);
        pathBuilderB.curveTo(18.08f, 2.58f, 22.0f, 6.84f, 22.0f, 12.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _slowMotionVideo = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
