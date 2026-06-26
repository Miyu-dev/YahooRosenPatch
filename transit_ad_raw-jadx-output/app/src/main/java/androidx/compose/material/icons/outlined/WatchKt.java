package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Watch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_watch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Watch", "Landroidx/compose/material/icons/Icons$Outlined;", "getWatch", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Watch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.31f, 2.0f, 0.41f, 2.48f);
        pathBuilderA.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        pathBuilderA.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        pathBuilderA.lineTo(9.7f, 2.0f);
        pathBuilderA.horizontalLineToRelative(4.61f);
        pathBuilderA.moveToRelative(0.41f, 17.52f);
        pathBuilderA.lineTo(14.31f, 22.0f);
        pathBuilderA.lineTo(9.7f, 22.0f);
        pathBuilderA.lineToRelative(-0.41f, -2.47f);
        pathBuilderA.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        pathBuilderA.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        pathBuilderA.moveTo(16.0f, 0.0f);
        pathBuilderA.lineTo(8.0f, 0.0f);
        pathBuilderA.lineToRelative(-0.95f, 5.73f);
        pathBuilderA.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        pathBuilderA.lineTo(8.0f, 24.0f);
        pathBuilderA.horizontalLineToRelative(8.0f);
        pathBuilderA.lineToRelative(0.96f, -5.73f);
        pathBuilderA.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        a.z(pathBuilderA, 16.0f, 0.0f, 12.0f, 18.0f);
        pathBuilderA.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.j(pathBuilderA, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
