package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dinnerDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DinnerDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getDinnerDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DinnerDiningKt {
    private static ImageVector _dinnerDining;

    public static final ImageVector getDinnerDining(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _dinnerDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DinnerDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(2.0f, 19.0f, 2.0f, 2.0f), 16.0f, 0.0f, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(3.0f, 18.0f, 16.97f);
        pathBuilderB.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.29f, -3.26f, -2.28f, -6.0f, -5.48f, -6.0f);
        pathBuilderB.curveToRelative(-2.35f, 0.0f, -4.35f, 1.48f, -5.14f, 3.55f);
        pathBuilderB.curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8.0f, 15.08f);
        pathBuilderB.verticalLineTo(9.0f);
        pathBuilderB.horizontalLineToRelative(1.75f);
        pathBuilderB.curveTo(10.99f, 9.0f, 12.0f, 7.99f, 12.0f, 6.75f);
        android.support.v4.media.a.s(pathBuilderB, 9.0f, -1.5f, -9.0f);
        pathBuilderB.curveTo(12.0f, 4.01f, 10.99f, 3.0f, 9.75f, 3.0f);
        androidx.browser.browseractions.a.B(pathBuilderB, 3.0f, 1.5f, 1.0f, 0.75f);
        a.i(pathBuilderB, 3.0f, 1.5f, 1.0f, 7.5f);
        s.t(pathBuilderB, 3.0f, 9.0f, 1.0f, 7.39f);
        pathBuilderB.curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3.0f, 18.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(14.5f, 14.0f);
        pathBuilderB.curveToRelative(0.99f, 0.0f, 1.91f, 0.4f, 2.58f, 1.14f);
        pathBuilderB.curveToRelative(0.24f, 0.26f, 0.44f, 0.55f, 0.58f, 0.86f);
        pathBuilderB.horizontalLineToRelative(-6.32f);
        pathBuilderB.curveTo(11.92f, 14.79f, 13.15f, 14.0f, 14.5f, 14.0f);
        b.r(pathBuilderB, 8.0f, 4.5f, 2.0f, 0.75f);
        a.b.B(pathBuilderB, 8.0f, 4.5f, 8.0f, 6.75f);
        k.d(pathBuilderB, 2.0f, 7.5f, 8.0f, 6.75f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 5.5f, 4.5f, 1.0f, 0.75f);
        a.b.m(pathBuilderB, -1.0f, 4.5f, 5.5f, 6.75f);
        v.w(pathBuilderB, 1.0f, 7.5f, -1.0f, 6.75f);
        androidx.appcompat.view.menu.a.x(pathBuilderB, 5.5f, 9.0f, 1.0f, 6.06f);
        pathBuilderB.curveToRelative(-0.35f, 0.06f, -0.68f, 0.17f, -1.0f, 0.3f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderB, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dinnerDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
