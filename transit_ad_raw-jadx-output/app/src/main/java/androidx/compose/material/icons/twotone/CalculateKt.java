package androidx.compose.material.icons.twotone;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Calculate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_calculate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Calculate", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCalculate", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CalculateKt {
    private static ImageVector _calculate;

    public static final ImageVector getCalculate(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _calculate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Calculate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(5.0f, 19.0f, 14.0f, 5.0f, 5.0f);
        a.y(pathBuilderQ, 19.0f, 13.03f, 7.06f);
        pathBuilderQ.lineTo(14.09f, 6.0f);
        pathBuilderQ.lineToRelative(1.41f, 1.41f);
        pathBuilderQ.lineTo(16.91f, 6.0f);
        pathBuilderQ.lineToRelative(1.06f, 1.06f);
        pathBuilderQ.lineToRelative(-1.41f, 1.41f);
        pathBuilderQ.lineToRelative(1.41f, 1.41f);
        pathBuilderQ.lineToRelative(-1.06f, 1.06f);
        pathBuilderQ.lineTo(15.5f, 9.54f);
        pathBuilderQ.lineToRelative(-1.41f, 1.41f);
        pathBuilderQ.lineToRelative(-1.06f, -1.06f);
        s.r(pathBuilderQ, 1.41f, -1.41f, 13.03f, 7.06f);
        androidx.appcompat.view.menu.a.x(pathBuilderQ, 13.0f, 13.25f, 5.0f, 1.5f);
        b.m(pathBuilderQ, -5.0f, 13.25f, 13.0f, 15.75f);
        androidx.compose.animation.a.B(pathBuilderQ, 5.0f, 1.5f, -5.0f, 15.75f);
        androidx.appcompat.view.menu.a.x(pathBuilderQ, 6.25f, 7.72f, 5.0f, 1.5f);
        b.m(pathBuilderQ, -5.0f, 7.72f, 6.0f, 14.5f);
        androidx.appcompat.view.menu.a.t(pathBuilderQ, 2.0f, -2.0f, 1.5f, 2.0f);
        androidx.appcompat.app.m.w(pathBuilderQ, 2.0f, 16.0f, -2.0f, 2.0f);
        pathBuilderQ.horizontalLineTo(8.0f);
        pathBuilderQ.verticalLineToRelative(-2.0f);
        pathBuilderQ.horizontalLineTo(6.0f);
        pathBuilderQ.verticalLineTo(14.5f);
        pathBuilderQ.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderQ.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(19.0f, 3.0f, 5.0f);
        pathBuilderB.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderB, 19.0f, 19.0f, 5.0f, 5.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 14.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(6.25f, 7.72f, 5.0f, 1.5f, -5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(13.0f, 15.75f, 5.0f, 1.5f, -5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(13.0f, 13.25f, 5.0f, 1.5f, -5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = androidx.compose.animation.b.a(8.0f, 18.0f, 1.5f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -1.5f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(-1.5f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 2.0f);
        pathBuilderA.lineToRelative(-2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 0.0f, 1.5f, 2.0f, 0.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = androidx.compose.animation.b.a(14.09f, 10.95f, 1.41f, -1.41f);
        pathBuilderA2.lineToRelative(1.41f, 1.41f);
        pathBuilderA2.lineToRelative(1.06f, -1.06f);
        pathBuilderA2.lineToRelative(-1.41f, -1.42f);
        pathBuilderA2.lineToRelative(1.41f, -1.41f);
        pathBuilderA2.lineToRelative(-1.06f, -1.06f);
        pathBuilderA2.lineToRelative(-1.41f, 1.41f);
        pathBuilderA2.lineToRelative(-1.41f, -1.41f);
        pathBuilderA2.lineToRelative(-1.06f, 1.06f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, 1.41f, 1.41f, -1.41f, 1.42f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _calculate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
