package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: ViewInAr.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_viewInAr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewInAr", "Landroidx/compose/material/icons/Icons$Filled;", "getViewInAr", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ViewInArKt {
    private static ImageVector _viewInAr;

    public static final ImageVector getViewInAr(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _viewInAr;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ViewInAr", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.25f, 7.6f, -5.5f, -3.18f);
        pathBuilderA.curveToRelative(-0.46f, -0.27f, -1.04f, -0.27f, -1.5f, 0.0f);
        pathBuilderA.lineTo(5.75f, 7.6f);
        pathBuilderA.curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f);
        pathBuilderA.verticalLineToRelative(6.35f);
        pathBuilderA.curveToRelative(0.0f, 0.54f, 0.29f, 1.03f, 0.75f, 1.3f);
        pathBuilderA.lineToRelative(5.5f, 3.18f);
        pathBuilderA.curveToRelative(0.46f, 0.27f, 1.04f, 0.27f, 1.5f, 0.0f);
        pathBuilderA.lineToRelative(5.5f, -3.18f);
        pathBuilderA.curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f);
        pathBuilderA.lineTo(19.0f, 8.9f);
        pathBuilderA.curveToRelative(0.0f, -0.54f, -0.29f, -1.03f, -0.75f, -1.3f);
        a.n(pathBuilderA, 7.0f, 14.96f, -4.62f);
        pathBuilderA.lineToRelative(4.0f, 2.32f);
        v.v(pathBuilderA, 4.61f, -4.0f, -2.31f);
        pathBuilderA.moveTo(12.0f, 10.93f);
        pathBuilderA.lineTo(8.0f, 8.61f);
        pathBuilderA.lineToRelative(4.0f, -2.31f);
        android.support.v4.media.a.n(pathBuilderA, 4.0f, 2.31f, -4.0f, 2.32f);
        pathBuilderA.moveTo(13.0f, 17.27f);
        a.q(pathBuilderA, -4.61f, 4.0f, -2.32f, 4.62f);
        android.support.v4.media.a.t(pathBuilderA, -4.0f, 2.31f, 7.0f, 2.0f);
        pathBuilderA.lineTo(3.5f, 2.0f);
        pathBuilderA.curveTo(2.67f, 2.0f, 2.0f, 2.67f, 2.0f, 3.5f);
        pathBuilderA.lineTo(2.0f, 7.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, 2.0f, 4.0f, 4.0f, 3.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 7.0f, 2.0f, 17.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(3.5f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderA.lineTo(22.0f, 7.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -2.0f, 20.0f, 4.0f, -3.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 17.0f, 2.0f, 7.0f, 22.0f);
        pathBuilderA.lineTo(3.5f, 22.0f);
        pathBuilderA.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        a.o(pathBuilderA, 2.0f, 17.0f, 2.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderA, 3.0f, 2.0f, 17.0f, 22.0f);
        pathBuilderA.horizontalLineToRelative(3.5f);
        pathBuilderA.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        a.o(pathBuilderA, 22.0f, 17.0f, -2.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderA, -3.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewInAr = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
