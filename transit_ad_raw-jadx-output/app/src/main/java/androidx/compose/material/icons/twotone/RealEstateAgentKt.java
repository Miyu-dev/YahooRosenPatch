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

/* JADX INFO: compiled from: RealEstateAgent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_realEstateAgent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RealEstateAgent", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRealEstateAgent", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RealEstateAgent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(10.5f, 9.44f, 5.32f, 1.99f);
        pathBuilderA.curveToRelative(1.24f, 0.46f, 2.21f, 1.41f, 2.74f, 2.57f);
        pathBuilderA.lineTo(19.0f, 14.0f);
        pathBuilderA.verticalLineTo(7.5f);
        pathBuilderA.lineTo(14.0f, 4.0f);
        androidx.appcompat.app.m.r(pathBuilderA, 9.0f, 7.5f, 9.0f, 0.33f);
        a.z(pathBuilderA, 10.5f, 9.44f, 14.5f, 7.0f);
        androidx.compose.animation.a.B(pathBuilderA, 1.0f, 1.0f, -1.0f, 7.0f);
        a.x(pathBuilderA, 14.5f, 9.0f, 1.0f, 1.0f);
        a.b.m(pathBuilderA, -1.0f, 9.0f, 12.5f, 7.0f);
        androidx.compose.animation.a.B(pathBuilderA, 1.0f, 1.0f, -1.0f, 7.0f);
        a.x(pathBuilderA, 12.5f, 9.0f, 1.0f, 1.0f);
        a.b.m(pathBuilderA, -1.0f, 9.0f, 3.0f, 13.0f);
        s.A(pathBuilderA, 2.0f, 7.0f, 3.0f, 13.0f);
        pathBuilderA.moveTo(19.9f, 18.57f);
        pathBuilderA.lineToRelative(-5.93f, 1.84f);
        androidx.appcompat.app.m.r(pathBuilderA, 7.0f, 18.48f, 13.0f, 1.61f);
        pathBuilderA.lineToRelative(5.82f, 2.17f);
        pathBuilderA.curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, -1.99f, -0.05f, -2.3f, -0.15f);
        pathBuilderA.lineToRelative(-2.38f, -0.79f);
        pathBuilderA.lineToRelative(-0.63f, 1.9f);
        pathBuilderA.lineToRelative(2.38f, 0.79f);
        pathBuilderA.curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f);
        pathBuilderA.horizontalLineTo(19.0f);
        pathBuilderA.curveTo(19.39f, 18.01f, 19.74f, 18.24f, 19.9f, 18.57f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.browser.browseractions.a.f(15.5f, 7.0f, -1.0f, 1.0f, 1.0f);
        a.B(pathBuilderF, 7.0f, 13.5f, 7.0f, -1.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderF, 1.0f, 1.0f, 7.0f);
        a.x(pathBuilderF, 15.5f, 9.0f, -1.0f, 1.0f);
        a.b.m(pathBuilderF, 1.0f, 9.0f, 13.5f, 9.0f);
        androidx.compose.animation.a.B(pathBuilderF, -1.0f, 1.0f, 1.0f, 9.0f);
        h.D(pathBuilderF, 21.0f, 6.5f, 14.0f, -2.0f);
        pathBuilderF.verticalLineTo(7.5f);
        pathBuilderF.lineTo(14.0f, 4.0f);
        androidx.browser.browseractions.a.D(pathBuilderF, 9.0f, 7.5f, 9.0f, 7.0f);
        pathBuilderF.verticalLineTo(6.5f);
        s.r(pathBuilderF, 7.0f, -5.0f, 21.0f, 6.5f);
        pathBuilderF.moveTo(19.0f, 16.0f);
        pathBuilderF.horizontalLineToRelative(-2.0f);
        pathBuilderF.curveToRelative(0.0f, -1.2f, -0.75f, -2.28f, -1.87f, -2.7f);
        h.n(pathBuilderF, 8.97f, 11.0f, 1.0f, 11.0f);
        s.s(pathBuilderF, 6.0f, -1.44f, 7.0f, 1.94f);
        pathBuilderF.lineToRelative(8.0f, -2.5f);
        pathBuilderF.verticalLineToRelative(-1.0f);
        pathBuilderF.curveTo(22.0f, 17.34f, 20.66f, 16.0f, 19.0f, 16.0f);
        androidx.appcompat.app.m.n(pathBuilderF, 3.0f, 20.0f, -7.0f, 2.0f);
        h.z(pathBuilderF, 7.0f, 3.0f, 13.97f, 20.41f);
        androidx.appcompat.app.m.r(pathBuilderF, 7.0f, 18.48f, 13.0f, 1.61f);
        pathBuilderF.lineToRelative(5.82f, 2.17f);
        pathBuilderF.curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f);
        pathBuilderF.curveToRelative(0.0f, 0.0f, -1.99f, -0.05f, -2.3f, -0.15f);
        pathBuilderF.lineToRelative(-2.38f, -0.79f);
        pathBuilderF.lineToRelative(-0.63f, 1.9f);
        pathBuilderF.lineToRelative(2.38f, 0.79f);
        pathBuilderF.curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f);
        pathBuilderF.horizontalLineTo(19.0f);
        pathBuilderF.curveToRelative(0.39f, 0.0f, 0.74f, 0.23f, 0.9f, 0.56f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderF, 13.97f, 20.41f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
