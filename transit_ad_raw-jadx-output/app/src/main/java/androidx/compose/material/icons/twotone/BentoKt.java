package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Bento.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bento", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Bento", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBento", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BentoKt {
    private static ImageVector _bento;

    public static final ImageVector getBento(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _bento;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Bento", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderQ = a.q(4.0f, 17.0f, 8.0f, 7.0f, 4.0f);
        a.y(pathBuilderQ, 17.0f, 8.0f, 10.5f);
        pathBuilderQ.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderQ.reflectiveCurveTo(8.83f, 13.5f, 8.0f, 13.5f);
        pathBuilderQ.reflectiveCurveTo(6.5f, 12.83f, 6.5f, 12.0f);
        pathBuilderQ.reflectiveCurveTo(7.17f, 10.5f, 8.0f, 10.5f);
        b.r(pathBuilderQ, 14.0f, 13.0f, 6.0f, 4.0f);
        a.b.m(pathBuilderQ, -6.0f, 13.0f, 20.0f, 7.0f);
        pathBuilderQ.verticalLineToRelative(4.0f);
        pathBuilderQ.horizontalLineToRelative(-6.0f);
        pathBuilderQ.verticalLineTo(7.0f);
        pathBuilderQ.horizontalLineTo(20.0f);
        pathBuilderQ.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderQ.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 5.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilderB.verticalLineToRelative(10.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(7.0f);
        pathBuilderB.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        androidx.compose.animation.a.k(pathBuilderB, 20.0f, 11.0f, -6.0f, 7.0f);
        a.b.m(pathBuilderB, 6.0f, 11.0f, 4.0f, 7.0f);
        s.A(pathBuilderB, 8.0f, 10.0f, 4.0f, 7.0f);
        a.b.y(pathBuilderB, 14.0f, 17.0f, -4.0f, 6.0f);
        h.z(pathBuilderB, 4.0f, 14.0f, 9.5f, 12.0f);
        pathBuilderB.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderB.reflectiveCurveTo(6.5f, 12.83f, 6.5f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderB, 9.5f, 11.17f, 9.5f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bento = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
