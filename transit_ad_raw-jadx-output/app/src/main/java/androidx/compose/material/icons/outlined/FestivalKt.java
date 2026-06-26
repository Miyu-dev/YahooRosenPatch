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

/* JADX INFO: compiled from: Festival.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_festival", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Festival", "Landroidx/compose/material/icons/Icons$Outlined;", "getFestival", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FestivalKt {
    private static ImageVector _festival;

    public static final ImageVector getFestival(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _festival;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Festival", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(23.0f, 11.0f, 9.0f);
        pathBuilderN.curveToRelative(-6.0f, -2.0f, -11.0f, -7.0f, -11.0f, -7.0f);
        pathBuilderN.reflectiveCurveTo(7.0f, 7.0f, 1.0f, 9.0f);
        pathBuilderN.verticalLineToRelative(2.0f);
        pathBuilderN.curveToRelative(0.0f, 1.49f, 0.93f, 2.75f, 2.24f, 3.26f);
        pathBuilderN.curveTo(3.2f, 16.76f, 2.92f, 19.69f, 2.0f, 22.0f);
        pathBuilderN.horizontalLineToRelative(20.0f);
        pathBuilderN.curveToRelative(-0.92f, -2.31f, -1.2f, -5.24f, -1.24f, -7.74f);
        pathBuilderN.curveTo(22.07f, 13.75f, 23.0f, 12.49f, 23.0f, 11.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(12.0f, 4.71f);
        pathBuilderN.curveToRelative(1.33f, 1.14f, 3.49f, 2.84f, 6.11f, 4.29f);
        pathBuilderN.horizontalLineTo(5.89f);
        pathBuilderN.curveTo(8.51f, 7.55f, 10.67f, 5.85f, 12.0f, 4.71f);
        a.j(pathBuilderN, 13.0f, 11.0f, 3.0f);
        pathBuilderN.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderN.reflectiveCurveTo(13.0f, 11.83f, 13.0f, 11.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(9.5f, 12.5f);
        pathBuilderN.curveTo(8.67f, 12.5f, 8.0f, 11.83f, 8.0f, 11.0f);
        pathBuilderN.horizontalLineToRelative(3.0f);
        pathBuilderN.curveTo(11.0f, 11.83f, 10.33f, 12.5f, 9.5f, 12.5f);
        pathBuilderN.close();
        pathBuilderN.moveTo(6.0f, 11.0f);
        pathBuilderN.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderN.reflectiveCurveTo(3.0f, 11.83f, 3.0f, 11.0f);
        b.w(pathBuilderN, 6.0f, 4.66f, 20.0f);
        pathBuilderN.curveToRelative(0.39f, -1.86f, 0.54f, -3.82f, 0.57f, -5.58f);
        pathBuilderN.curveToRelative(0.68f, -0.15f, 1.29f, -0.49f, 1.76f, -0.98f);
        pathBuilderN.curveToRelative(0.25f, 0.25f, 0.54f, 0.45f, 0.85f, 0.62f);
        pathBuilderN.curveToRelative(-0.1f, 1.87f, -0.26f, 4.0f, -0.52f, 5.93f);
        b.w(pathBuilderN, 4.66f, 9.35f, 20.0f);
        pathBuilderN.curveToRelative(0.24f, -1.83f, 0.39f, -3.78f, 0.48f, -5.53f);
        pathBuilderN.curveToRelative(0.84f, -0.08f, 1.61f, -0.45f, 2.17f, -1.02f);
        pathBuilderN.curveToRelative(0.56f, 0.57f, 1.32f, 0.94f, 2.17f, 1.02f);
        pathBuilderN.curveToRelative(0.1f, 1.75f, 0.24f, 3.7f, 0.48f, 5.53f);
        b.w(pathBuilderN, 9.35f, 16.67f, 20.0f);
        pathBuilderN.curveToRelative(-0.27f, -1.94f, -0.43f, -4.07f, -0.52f, -5.93f);
        pathBuilderN.curveToRelative(0.31f, -0.17f, 0.61f, -0.37f, 0.85f, -0.62f);
        pathBuilderN.curveToRelative(0.47f, 0.48f, 1.08f, 0.83f, 1.76f, 0.98f);
        pathBuilderN.curveToRelative(0.03f, 1.76f, 0.18f, 3.72f, 0.57f, 5.58f);
        b.w(pathBuilderN, 16.67f, 19.5f, 12.5f);
        pathBuilderN.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderN.horizontalLineToRelative(3.0f);
        pathBuilderN.curveTo(21.0f, 11.83f, 20.33f, 12.5f, 19.5f, 12.5f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _festival = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
