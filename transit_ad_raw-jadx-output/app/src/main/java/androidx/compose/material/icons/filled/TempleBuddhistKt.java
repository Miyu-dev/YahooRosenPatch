package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: TempleBuddhist.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_templeBuddhist", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TempleBuddhist", "Landroidx/compose/material/icons/Icons$Filled;", "getTempleBuddhist", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TempleBuddhistKt {
    private static ImageVector _templeBuddhist;

    public static final ImageVector getTempleBuddhist(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _templeBuddhist;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TempleBuddhist", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.0f, 9.02f);
        pathBuilderD.curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f);
        pathBuilderD.horizontalLineTo(4.98f);
        pathBuilderD.curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f);
        pathBuilderD.horizontalLineTo(1.0f);
        pathBuilderD.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        v.r(pathBuilderD, 22.0f, 6.0f, -3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        android.support.v4.media.a.m(pathBuilderD, 3.0f, 6.0f, -9.14f);
        pathBuilderD.curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 21.0f, 9.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b.b(6.0f, 8.86f, 10.0f, 12.0f, 8.86f);
        pathBuilderB.curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f);
        pathBuilderB.lineToRelative(-2.0f, 0.02f);
        pathBuilderB.curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f);
        pathBuilderB.horizontalLineTo(6.98f);
        pathBuilderB.curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.curveTo(3.0f, 6.87f, 4.28f, 8.42f, 6.0f, 8.86f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(b.a(12.0f, 1.0f, -3.75f, 5.0f), 7.5f, 0.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _templeBuddhist = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
