package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: GridOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gridOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GridOn", "Landroidx/compose/material/icons/Icons$TwoTone;", "getGridOn", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GridOnKt {
    private static ImageVector _gridOn;

    public static final ImageVector getGridOn(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _gridOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GridOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = a.v(10.0f, 10.0f, 4.0f, 4.0f, -4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 10.0f, 16.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderV, -4.0f, 4.0f, 4.0f, 4.0f);
        h.q(pathBuilderV, 4.0f, 4.0f, 8.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 4.0f, 10.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderV, 4.0f, 14.0f, 4.0f, 16.0f);
        androidx.appcompat.app.m.C(pathBuilderV, 4.0f, 4.0f, 4.0f, 20.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 16.0f, 4.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderV, -4.0f, 16.0f, 10.0f, 4.0f);
        androidx.appcompat.app.m.y(pathBuilderV, 4.0f, -4.0f, 16.0f, 16.0f);
        b.t(pathBuilderV, 4.0f, 4.0f, -4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 10.0f, 4.0f, 4.0f, 4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.c(pathBuilderV, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(20.0f, 2.0f, 4.0f, 2.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(16.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.lineTo(22.0f, 4.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderA, 8.0f, 20.0f, 4.0f, 20.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderA, -4.0f, 4.0f, 4.0f);
        pathBuilderA.moveTo(8.0f, 14.0f);
        a.b.s(pathBuilderA, 4.0f, 14.0f, -4.0f, 4.0f);
        android.support.v4.media.a.v(pathBuilderA, 4.0f, 8.0f, 8.0f);
        pathBuilderA.lineTo(4.0f, 8.0f);
        s.w(pathBuilderA, 4.0f, 4.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 14.0f, 20.0f, -4.0f, -4.0f);
        a.z(pathBuilderA, 4.0f, 4.0f, 14.0f, 14.0f);
        a.b.A(pathBuilderA, -4.0f, -4.0f, 4.0f, 4.0f);
        pathBuilderA.moveTo(14.0f, 8.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -4.0f, 10.0f, 4.0f, 4.0f);
        a.A(pathBuilderA, 4.0f, 20.0f, 20.0f, -4.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderA, -4.0f, 4.0f, 4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 20.0f, 14.0f, -4.0f, -4.0f);
        a.z(pathBuilderA, 4.0f, 4.0f, 20.0f, 8.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderA, -4.0f, 16.0f, 4.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderA, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
