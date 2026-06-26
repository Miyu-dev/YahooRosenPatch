package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.v;
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
import c.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DinnerDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dinnerDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DinnerDining", "Landroidx/compose/material/icons/Icons$Rounded;", "getDinnerDining", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DinnerDiningKt {
    private static ImageVector _dinnerDining;

    public static final ImageVector getDinnerDining(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _dinnerDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DinnerDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(2.85f, 19.85f, 1.0f, 1.0f);
        pathBuilderA.curveTo(3.95f, 20.95f, 4.07f, 21.0f, 4.21f, 21.0f);
        pathBuilderA.horizontalLineToRelative(15.59f);
        pathBuilderA.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        pathBuilderA.lineToRelative(1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilderA.horizontalLineTo(3.21f);
        pathBuilderA.curveTo(2.76f, 19.0f, 2.54f, 19.54f, 2.85f, 19.85f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(3.0f, 18.0f, 16.97f, 0.0f);
        pathBuilderA2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilderA2.curveToRelative(0.29f, -3.26f, -2.28f, -6.0f, -5.48f, -6.0f);
        pathBuilderA2.curveToRelative(-2.35f, 0.0f, -4.35f, 1.48f, -5.14f, 3.55f);
        pathBuilderA2.curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8.0f, 15.08f);
        pathBuilderA2.verticalLineTo(9.0f);
        pathBuilderA2.horizontalLineToRelative(1.75f);
        pathBuilderA2.curveTo(10.99f, 9.0f, 12.0f, 7.99f, 12.0f, 6.75f);
        pathBuilderA2.verticalLineToRelative(0.0f);
        pathBuilderA2.horizontalLineToRelative(8.25f);
        pathBuilderA2.curveTo(20.66f, 6.75f, 21.0f, 6.41f, 21.0f, 6.0f);
        pathBuilderA2.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderA2.horizontalLineTo(12.0f);
        pathBuilderA2.verticalLineToRelative(0.0f);
        pathBuilderA2.curveTo(12.0f, 4.01f, 10.99f, 3.0f, 9.75f, 3.0f);
        pathBuilderA2.horizontalLineToRelative(-6.0f);
        pathBuilderA2.curveTo(3.34f, 3.0f, 3.0f, 3.34f, 3.0f, 3.75f);
        pathBuilderA2.reflectiveCurveTo(3.34f, 4.5f, 3.75f, 4.5f);
        a.b.r(pathBuilderA2, 4.0f, 0.75f, 3.75f);
        pathBuilderA2.curveTo(3.34f, 5.25f, 3.0f, 5.59f, 3.0f, 6.0f);
        pathBuilderA2.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        b.B(pathBuilderA2, 4.0f, 7.5f, 3.75f);
        pathBuilderA2.curveTo(3.34f, 7.5f, 3.0f, 7.84f, 3.0f, 8.25f);
        pathBuilderA2.reflectiveCurveTo(3.34f, 9.0f, 3.75f, 9.0f);
        pathBuilderA2.horizontalLineTo(4.0f);
        pathBuilderA2.verticalLineToRelative(7.39f);
        pathBuilderA2.curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3.0f, 18.0f);
        b.r(pathBuilderA2, 8.0f, 4.5f, 2.0f, 0.75f);
        a.b.B(pathBuilderA2, 8.0f, 4.5f, 8.0f, 6.75f);
        k.d(pathBuilderA2, 2.0f, 7.5f, 8.0f, 6.75f);
        a.x(pathBuilderA2, 5.5f, 4.5f, 1.0f, 0.75f);
        a.b.m(pathBuilderA2, -1.0f, 4.5f, 5.5f, 6.75f);
        v.w(pathBuilderA2, 1.0f, 7.5f, -1.0f, 6.75f);
        a.x(pathBuilderA2, 5.5f, 9.0f, 1.0f, 6.06f);
        pathBuilderA2.curveToRelative(-0.35f, 0.06f, -0.68f, 0.17f, -1.0f, 0.3f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderA2, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dinnerDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
