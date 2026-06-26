package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: MapsHomeWork.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mapsHomeWork", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MapsHomeWork", "Landroidx/compose/material/icons/Icons$Rounded;", "getMapsHomeWork", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MapsHomeWorkKt {
    private static ImageVector _mapsHomeWork;

    public static final ImageVector getMapsHomeWork(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _mapsHomeWork;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MapsHomeWork", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.16f, 10.4f, -5.0f, -3.57f);
        pathBuilderA.curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f);
        pathBuilderA.lineToRelative(-5.0f, 3.57f);
        pathBuilderA.curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f);
        pathBuilderA.verticalLineTo(20.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.t(pathBuilderA, 4.0f, -6.0f, 4.0f, 6.0f);
        pathBuilderA.horizontalLineToRelative(4.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-7.97f);
        pathBuilderA.curveTo(15.0f, 11.38f, 14.69f, 10.78f, 14.16f, 10.4f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(21.03f, 3.0f, -9.06f);
        pathBuilderB.curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f);
        pathBuilderB.lineToRelative(0.09f, 0.09f);
        pathBuilderB.curveToRelative(0.08f, 0.05f, 0.16f, 0.09f, 0.24f, 0.14f);
        pathBuilderB.lineToRelative(5.0f, 3.57f);
        pathBuilderB.curveToRelative(0.76f, 0.54f, 1.3f, 1.34f, 1.54f, 2.23f);
        androidx.browser.browseractions.a.B(pathBuilderB, 19.0f, 2.0f, -2.0f, 2.0f);
        a.t(pathBuilderB, 2.0f, 2.0f, -2.0f, 3.0f);
        pathBuilderB.verticalLineToRelative(1.0f);
        pathBuilderB.horizontalLineToRelative(4.03f);
        pathBuilderB.curveToRelative(1.09f, 0.0f, 1.97f, -0.88f, 1.97f, -1.97f);
        pathBuilderB.verticalLineTo(4.97f);
        pathBuilderB.curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f);
        androidx.compose.animation.a.k(pathBuilderB, 19.0f, 9.0f, -2.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 2.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mapsHomeWork = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
