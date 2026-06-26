package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.d;
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: RamenDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_ramenDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RamenDining", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRamenDining", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RamenDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(8.73f, 18.39f, 1.27f, 0.5f, 20.0f);
        s.s(pathBuilderW, 4.0f, -1.11f, 1.27f, -0.5f);
        pathBuilderW.curveToRelative(2.16f, -0.85f, 3.74f, -2.47f, 4.4f, -4.39f);
        pathBuilderW.horizontalLineTo(4.34f);
        pathBuilderW.curveTo(4.99f, 15.92f, 6.58f, 17.54f, 8.73f, 18.39f);
        pathBuilderW.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderW.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = h.o(22.0f, 3.51f, 2.0f, 4.0f, 3.99f);
        pathBuilderO.verticalLineTo(12.0f);
        pathBuilderO.horizontalLineTo(2.0f);
        pathBuilderO.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        v.r(pathBuilderO, 22.0f, 8.0f, -1.75f);
        pathBuilderO.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        androidx.compose.animation.a.x(pathBuilderO, 10.5f, 8.0f, 22.0f, 6.5f);
        pathBuilderO.horizontalLineTo(10.5f);
        pathBuilderO.verticalLineTo(4.78f);
        pathBuilderO.lineTo(22.0f, 3.51f);
        pathBuilderO.close();
        pathBuilderO.moveTo(8.0f, 5.06f);
        e.f(pathBuilderO, 1.0f, -0.11f, 6.5f, 8.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderO, 5.06f, 8.0f, 8.0f, 1.0f);
        d.f(pathBuilderO, 4.0f, 8.0f, 8.0f);
        pathBuilderO.moveTo(5.5f, 5.34f);
        s.D(pathBuilderO, 1.0f, -0.11f, 6.5f, -1.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderO, 5.34f, 5.5f, 8.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderO, 4.0f, -1.0f, 8.0f);
        pathBuilderO.moveTo(19.66f, 14.0f);
        pathBuilderO.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        androidx.appcompat.app.m.r(pathBuilderO, 14.0f, 18.89f, 20.0f, -4.0f);
        pathBuilderO.verticalLineToRelative(-1.11f);
        pathBuilderO.lineToRelative(-1.27f, -0.5f);
        pathBuilderO.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderO, 19.66f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
