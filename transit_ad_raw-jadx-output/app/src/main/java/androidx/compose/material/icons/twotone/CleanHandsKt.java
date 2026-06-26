package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CleanHands.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cleanHands", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CleanHands", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCleanHands", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CleanHandsKt {
    private static ImageVector _cleanHands;

    public static final ImageVector getCleanHands(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _cleanHands;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CleanHands", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(9.24f, 9.5f, 7.42f);
        pathBuilderB.curveTo(7.94f, 8.61f, 8.89f, 8.0f, 10.0f, 8.0f);
        pathBuilderB.curveToRelative(1.62f, 0.0f, 2.94f, 1.29f, 2.99f, 2.9f);
        a.z(pathBuilderB, 9.24f, 9.5f, 5.0f, 20.0f);
        pathBuilderB.verticalLineToRelative(-7.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.verticalLineToRelative(7.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(19.9f, 18.57f);
        pathBuilderB.curveToRelative(-0.16f, -0.33f, -0.51f, -0.56f, -0.9f, -0.56f);
        pathBuilderB.horizontalLineToRelative(-5.35f);
        pathBuilderB.curveToRelative(-0.54f, 0.0f, -1.07f, -0.09f, -1.58f, -0.26f);
        pathBuilderB.lineToRelative(-2.38f, -0.79f);
        pathBuilderB.lineToRelative(0.63f, -1.9f);
        pathBuilderB.lineToRelative(2.38f, 0.79f);
        pathBuilderB.curveTo(13.01f, 15.95f, 15.0f, 16.0f, 15.0f, 16.0f);
        pathBuilderB.curveToRelative(0.0f, -0.37f, -0.23f, -0.7f, -0.57f, -0.83f);
        h.n(pathBuilderB, 8.61f, 13.0f, 7.0f, 5.48f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderB, 6.97f, 1.93f, 19.9f, 18.57f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.99f, 5.0f, 0.63f, 1.37f);
        pathBuilderA.lineTo(18.99f, 7.0f);
        pathBuilderA.lineToRelative(-1.37f, 0.63f);
        pathBuilderA.lineTo(16.99f, 9.0f);
        pathBuilderA.lineToRelative(-0.63f, -1.37f);
        pathBuilderA.lineTo(14.99f, 7.0f);
        pathBuilderA.lineToRelative(1.37f, -0.63f);
        pathBuilderA.lineTo(16.99f, 5.0f);
        pathBuilderA.moveTo(20.0f, 14.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -2.0f, -4.0f, -2.0f, -4.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.0f, 2.9f, -2.0f, 4.0f);
        pathBuilderA.curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f);
        h.B(pathBuilderA, 11.0f, 6.1f, 4.0f, 2.0f);
        pathBuilderA.curveToRelative(0.57f, 0.0f, 1.1f, 0.17f, 1.55f, 0.45f);
        pathBuilderA.lineToRelative(1.43f, -1.43f);
        pathBuilderA.curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f);
        pathBuilderA.curveToRelative(-1.47f, 0.0f, -5.44f, 0.0f, -5.5f, 0.0f);
        v.z(pathBuilderA, 2.0f, 9.0f, 2.11f);
        pathBuilderA.curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f);
        pathBuilderA.horizontalLineToRelative(2.16f);
        pathBuilderA.curveTo(7.94f, 8.61f, 8.89f, 8.0f, 10.0f, 8.0f);
        pathBuilderA.curveToRelative(1.62f, 0.0f, 2.94f, 1.29f, 2.99f, 2.9f);
        pathBuilderA.lineTo(15.0f, 11.65f);
        pathBuilderA.verticalLineTo(11.0f);
        pathBuilderA.curveTo(15.0f, 8.58f, 13.28f, 6.56f, 11.0f, 6.1f);
        androidx.compose.animation.a.n(pathBuilderA, 22.0f, 19.0f, 1.0f);
        pathBuilderA.lineToRelative(-8.0f, 2.5f);
        e.f(pathBuilderA, -7.0f, -1.94f, 22.0f, 1.0f);
        androidx.appcompat.app.m.u(pathBuilderA, 11.0f, 7.97f, 6.16f, 2.3f);
        pathBuilderA.curveTo(16.25f, 13.72f, 17.0f, 14.8f, 17.0f, 16.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveTo(20.66f, 16.0f, 22.0f, 17.34f, 22.0f, 19.0f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderA, 5.0f, 20.0f, -7.0f, 3.0f);
        h.z(pathBuilderA, 7.0f, 5.0f, 19.9f, 18.57f);
        pathBuilderA.curveToRelative(-0.16f, -0.33f, -0.51f, -0.56f, -0.9f, -0.56f);
        pathBuilderA.horizontalLineToRelative(-5.35f);
        pathBuilderA.curveToRelative(-0.54f, 0.0f, -1.07f, -0.09f, -1.58f, -0.26f);
        pathBuilderA.lineToRelative(-2.38f, -0.79f);
        pathBuilderA.lineToRelative(0.63f, -1.9f);
        pathBuilderA.lineToRelative(2.38f, 0.79f);
        pathBuilderA.curveTo(13.01f, 15.95f, 15.0f, 16.0f, 15.0f, 16.0f);
        pathBuilderA.curveToRelative(0.0f, -0.37f, -0.23f, -0.7f, -0.57f, -0.83f);
        h.n(pathBuilderA, 8.61f, 13.0f, 7.0f, 5.48f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 6.97f, 1.93f, 19.9f, 18.57f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cleanHands = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
