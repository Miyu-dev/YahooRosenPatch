package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: SmokeFree.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_smokeFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SmokeFree", "Landroidx/compose/material/icons/Icons$Outlined;", "getSmokeFree", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SmokeFreeKt {
    private static ImageVector _smokeFree;

    public static final ImageVector getSmokeFree(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _smokeFree;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SmokeFree", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(20.5f, 13.0f, 22.0f, 13.0f, 3.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderB, -1.5f, 18.0f, 13.0f, 1.5f);
        h.q(pathBuilderB, 3.0f, 18.0f, 16.0f);
        pathBuilderB.moveTo(17.0f, 13.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, -2.34f, 17.0f, 15.34f);
        pathBuilderB.moveTo(14.5f, 8.65f);
        pathBuilderB.horizontalLineToRelative(1.53f);
        pathBuilderB.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        androidx.compose.animation.a.o(pathBuilderB, 18.0f, 12.0f, 1.5f, -1.64f);
        pathBuilderB.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilderB.lineTo(14.5f, 7.2f);
        pathBuilderB.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        pathBuilderB.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        pathBuilderB.verticalLineToRelative(-1.5f);
        pathBuilderB.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        pathBuilderB.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        pathBuilderB.close();
        pathBuilderB.moveTo(18.85f, 4.73f);
        pathBuilderB.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilderB.horizontalLineToRelative(-1.5f);
        pathBuilderB.curveToRelative(0.0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f);
        pathBuilderB.verticalLineToRelative(1.5f);
        pathBuilderB.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        pathBuilderB.lineTo(20.5f, 12.0f);
        pathBuilderB.lineTo(22.0f, 12.0f);
        pathBuilderB.lineTo(22.0f, 9.76f);
        pathBuilderB.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        androidx.compose.animation.a.t(pathBuilderB, 3.41f, 4.59f, 2.0f, 6.0f);
        pathBuilderB.lineToRelative(7.0f, 7.0f);
        b.s(pathBuilderB, 2.0f, 13.0f, 3.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderB, 7.0f, 7.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokeFree = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
