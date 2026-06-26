package androidx.compose.material.icons.twotone;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: BedroomChild.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bedroomChild", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BedroomChild", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBedroomChild", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BedroomChildKt {
    private static ImageVector _bedroomChild;

    public static final ImageVector getBedroomChild(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _bedroomChild;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BedroomChild", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(4.0f, 20.0f, 16.0f, 4.0f, 4.0f);
        a.y(pathBuilderQ, 20.0f, 6.0f, 12.87f);
        pathBuilderQ.curveToRelative(0.0f, -1.0f, 0.62f, -1.85f, 1.5f, -2.2f);
        pathBuilderQ.verticalLineTo(9.0f);
        pathBuilderQ.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderQ.horizontalLineToRelative(5.0f);
        pathBuilderQ.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderQ.verticalLineToRelative(1.67f);
        pathBuilderQ.curveToRelative(0.88f, 0.35f, 1.5f, 1.2f, 1.5f, 2.2f);
        s.y(pathBuilderQ, 17.0f, -1.5f, -1.5f, -9.0f);
        pathBuilderQ.verticalLineTo(17.0f);
        pathBuilderQ.horizontalLineTo(6.0f);
        pathBuilderQ.verticalLineTo(12.87f);
        pathBuilderQ.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderQ.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 2.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilderB.verticalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.0f);
        pathBuilderB.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderB, 20.0f, 20.0f, 4.0f, 4.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 16.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ2 = a.q(7.5f, 15.5f, 9.0f, 17.0f, 18.0f);
        pathBuilderQ2.verticalLineToRelative(-4.13f);
        pathBuilderQ2.curveToRelative(0.0f, -1.0f, -0.62f, -1.85f, -1.5f, -2.2f);
        pathBuilderQ2.verticalLineTo(9.0f);
        pathBuilderQ2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderQ2.horizontalLineToRelative(-5.0f);
        pathBuilderQ2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderQ2.verticalLineToRelative(1.67f);
        pathBuilderQ2.curveToRelative(-0.88f, 0.35f, -1.5f, 1.2f, -1.5f, 2.2f);
        androidx.appcompat.view.menu.a.v(pathBuilderQ2, 17.0f, 1.5f, 15.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderQ2, 9.0f, 8.5f, 6.0f, 2.0f);
        b.B(pathBuilderQ2, 9.0f, 8.5f, 8.37f, 12.0f);
        pathBuilderQ2.horizontalLineToRelative(7.27f);
        pathBuilderQ2.curveToRelative(0.48f, 0.0f, 0.87f, 0.39f, 0.87f, 0.87f);
        v.C(pathBuilderQ2, 14.0f, -9.0f, -1.13f, 7.5f);
        pathBuilderQ2.curveTo(7.5f, 12.39f, 7.89f, 12.0f, 8.37f, 12.0f);
        pathBuilderQ2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderQ2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomChild = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
