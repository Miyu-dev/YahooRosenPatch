package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: DoNotTouch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotTouch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotTouch", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDoNotTouch", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DoNotTouch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(18.0f, 15.17f, 13.0f, -2.17f);
        a.z(pathBuilderO, 18.0f, 15.17f, 9.0f, 11.83f);
        pathBuilderO.lineToRelative(8.14f, 8.14f);
        pathBuilderO.curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f);
        pathBuilderO.horizontalLineToRelative(-6.0f);
        pathBuilderO.curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f);
        pathBuilderO.lineTo(6.87f, 16.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.k(pathBuilderO, 9.0f, 9.0f, 11.83f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(2.81f, 2.81f, 1.39f, 4.22f);
        pathBuilderA.lineTo(7.0f, 9.83f);
        pathBuilderA.lineToRelative(0.0f, 4.3f);
        pathBuilderA.lineToRelative(-2.6f, -1.48f);
        pathBuilderA.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        pathBuilderA.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        pathBuilderA.lineTo(2.0f, 13.88f);
        pathBuilderA.lineToRelative(6.8f, 7.18f);
        pathBuilderA.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        pathBuilderA.horizontalLineTo(17.0f);
        pathBuilderA.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.66f, -0.52f);
        pathBuilderA.lineToRelative(1.12f, 1.12f);
        s.r(pathBuilderA, 1.41f, -1.41f, 2.81f, 2.81f);
        pathBuilderA.moveTo(17.0f, 20.0f);
        pathBuilderA.horizontalLineToRelative(-6.0f);
        pathBuilderA.curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f);
        pathBuilderA.lineTo(6.87f, 16.0f);
        pathBuilderA.horizontalLineTo(9.0f);
        pathBuilderA.lineToRelative(0.0f, -4.17f);
        pathBuilderA.lineToRelative(8.14f, 8.14f);
        pathBuilderA.curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f);
        androidx.appcompat.graphics.drawable.a.w(pathBuilderA, 13.83f, 11.0f, 14.0f, 3.25f);
        pathBuilderA.curveTo(14.0f, 2.56f, 14.56f, 2.0f, 15.25f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        h.w(pathBuilderA, 11.0f, 1.0f, 5.25f);
        pathBuilderA.curveTo(17.5f, 4.56f, 18.06f, 4.0f, 18.75f, 4.0f);
        pathBuilderA.reflectiveCurveTo(20.0f, 4.56f, 20.0f, 5.25f);
        androidx.browser.browseractions.a.z(pathBuilderA, 11.92f, -2.0f, -2.0f, 13.0f);
        a.s(pathBuilderA, -2.17f, 13.83f, 11.0f);
        pathBuilderA.moveTo(13.0f, 10.17f);
        pathBuilderA.verticalLineTo(2.25f);
        pathBuilderA.curveTo(13.0f, 1.56f, 12.44f, 1.0f, 11.75f, 1.0f);
        pathBuilderA.reflectiveCurveTo(10.5f, 1.56f, 10.5f, 2.25f);
        h.q(pathBuilderA, 5.42f, 13.0f, 10.17f);
        pathBuilderA.moveTo(9.5f, 6.67f);
        pathBuilderA.verticalLineTo(4.25f);
        pathBuilderA.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        pathBuilderA.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderA, 0.0f, 9.5f, 6.67f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
