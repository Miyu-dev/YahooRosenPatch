package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FindInPage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_findInPage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FindInPage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFindInPage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FindInPageKt {
    private static ImageVector _findInPage;

    public static final ImageVector getFindInPage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _findInPage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FindInPage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(6.0f, 4.0f, 16.0f, 11.6f);
        pathBuilderE.lineToRelative(-2.85f, -2.85f);
        pathBuilderE.curveToRelative(-0.83f, 0.55f, -1.79f, 0.83f, -2.75f, 0.83f);
        pathBuilderE.curveToRelative(-1.28f, 0.0f, -2.55f, -0.49f, -3.53f, -1.46f);
        pathBuilderE.curveToRelative(-1.95f, -1.95f, -1.95f, -5.11f, 0.0f, -7.05f);
        pathBuilderE.curveTo(9.45f, 8.49f, 10.72f, 8.0f, 12.0f, 8.0f);
        pathBuilderE.curveToRelative(1.28f, 0.0f, 2.55f, 0.49f, 3.53f, 1.46f);
        pathBuilderE.curveToRelative(1.71f, 1.71f, 1.92f, 4.34f, 0.64f, 6.28f);
        pathBuilderE.lineTo(18.0f, 17.58f);
        pathBuilderE.verticalLineTo(9.0f);
        pathBuilderE.lineToRelative(-5.0f, -5.0f);
        pathBuilderE.horizontalLineTo(6.0f);
        pathBuilderE.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.0f, 2.0f, 6.0f, 2.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.lineTo(4.0f, 20.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderA.lineTo(18.0f, 22.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        androidx.compose.animation.a.A(pathBuilderA, 20.0f, 8.0f, -6.0f, -6.0f);
        pathBuilderA.moveTo(18.0f, 17.58f);
        pathBuilderA.lineToRelative(-1.84f, -1.84f);
        pathBuilderA.curveToRelative(1.28f, -1.94f, 1.07f, -4.57f, -0.64f, -6.28f);
        pathBuilderA.curveTo(14.55f, 8.49f, 13.28f, 8.0f, 12.0f, 8.0f);
        pathBuilderA.curveToRelative(-1.28f, 0.0f, -2.55f, 0.49f, -3.53f, 1.46f);
        pathBuilderA.curveToRelative(-1.95f, 1.95f, -1.95f, 5.11f, 0.0f, 7.05f);
        pathBuilderA.curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f);
        pathBuilderA.curveToRelative(0.96f, 0.0f, 1.92f, -0.28f, 2.75f, -0.83f);
        pathBuilderA.lineTo(17.6f, 20.0f);
        pathBuilderA.lineTo(6.0f, 20.0f);
        pathBuilderA.lineTo(6.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(7.0f);
        pathBuilderA.lineToRelative(5.0f, 5.0f);
        pathBuilderA.verticalLineToRelative(8.58f);
        pathBuilderA.close();
        pathBuilderA.moveTo(14.99f, 12.99f);
        pathBuilderA.curveToRelative(0.0f, 0.8f, -0.31f, 1.55f, -0.88f, 2.11f);
        pathBuilderA.curveToRelative(-0.56f, 0.56f, -1.31f, 0.88f, -2.11f, 0.88f);
        pathBuilderA.reflectiveCurveToRelative(-1.55f, -0.31f, -2.11f, -0.88f);
        pathBuilderA.curveToRelative(-0.56f, -0.56f, -0.88f, -1.31f, -0.88f, -2.11f);
        pathBuilderA.reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.11f);
        pathBuilderA.reflectiveCurveTo(11.2f, 10.0f, 12.0f, 10.0f);
        pathBuilderA.reflectiveCurveToRelative(1.55f, 0.31f, 2.11f, 0.88f);
        pathBuilderA.curveToRelative(0.57f, 0.56f, 0.88f, 1.31f, 0.88f, 2.11f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findInPage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
