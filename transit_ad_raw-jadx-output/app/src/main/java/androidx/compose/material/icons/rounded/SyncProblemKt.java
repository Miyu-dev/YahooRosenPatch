package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: SyncProblem.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_syncProblem", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SyncProblem", "Landroidx/compose/material/icons/Icons$Rounded;", "getSyncProblem", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SyncProblemKt {
    private static ImageVector _syncProblem;

    public static final ImageVector getSyncProblem(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _syncProblem;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SyncProblem", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(3.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        pathBuilderD.lineToRelative(-1.51f, 1.51f);
        pathBuilderD.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        pathBuilderD.lineTo(8.5f, 20.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD.verticalLineToRelative(-4.29f);
        pathBuilderD.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilderD.lineToRelative(-1.39f, 1.39f);
        pathBuilderD.curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f);
        pathBuilderD.curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f);
        pathBuilderD.verticalLineToRelative(-0.19f);
        pathBuilderD.curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f);
        pathBuilderD.curveTo(4.92f, 5.99f, 3.0f, 8.77f, 3.0f, 12.0f);
        b.r(pathBuilderD, 11.0f, 17.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderD, -2.0f, 2.0f, 19.79f, 4.0f);
        pathBuilderD.lineTo(15.5f, 4.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderD.verticalLineToRelative(4.29f);
        pathBuilderD.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderD.lineToRelative(1.39f, -1.39f);
        pathBuilderD.curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.39f, -1.4f, 4.46f, -3.43f, 5.42f);
        pathBuilderD.curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f);
        pathBuilderD.verticalLineToRelative(0.18f);
        pathBuilderD.curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f);
        pathBuilderD.curveTo(19.08f, 18.01f, 21.0f, 15.23f, 21.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        pathBuilderD.lineToRelative(1.51f, -1.51f);
        pathBuilderD.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 13.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.lineTo(13.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncProblem = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
