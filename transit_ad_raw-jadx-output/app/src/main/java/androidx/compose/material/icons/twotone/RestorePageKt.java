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

/* JADX INFO: compiled from: RestorePage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_restorePage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RestorePage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRestorePage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RestorePageKt {
    private static ImageVector _restorePage;

    public static final ImageVector getRestorePage(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _restorePage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RestorePage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(6.0f, 4.0f, 16.0f, 12.0f);
        pathBuilderE.lineTo(18.0f, 8.83f);
        android.support.v4.media.a.C(pathBuilderE, 13.17f, 4.0f, 6.0f, 4.0f);
        pathBuilderE.moveTo(16.72f, 13.0f);
        pathBuilderE.curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f);
        pathBuilderE.curveToRelative(-1.84f, 0.0f, -3.43f, -1.12f, -4.12f, -2.7f);
        pathBuilderE.horizontalLineToRelative(1.54f);
        pathBuilderE.curveToRelative(0.57f, 0.81f, 1.51f, 1.35f, 2.58f, 1.35f);
        pathBuilderE.curveToRelative(1.74f, 0.0f, 3.15f, -1.41f, 3.15f, -3.15f);
        pathBuilderE.reflectiveCurveToRelative(-1.41f, -3.15f, -3.15f, -3.15f);
        pathBuilderE.curveToRelative(-1.21f, 0.0f, -2.27f, 0.7f, -2.79f, 1.71f);
        pathBuilderE.lineTo(10.88f, 13.0f);
        pathBuilderE.horizontalLineToRelative(-3.6f);
        pathBuilderE.lineTo(7.28f, 9.4f);
        pathBuilderE.lineToRelative(1.17f, 1.17f);
        pathBuilderE.curveToRelative(0.8f, -1.24f, 2.19f, -2.07f, 3.78f, -2.07f);
        pathBuilderE.curveToRelative(2.48f, 0.0f, 4.49f, 2.02f, 4.49f, 4.5f);
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
        pathBuilderA.moveTo(18.0f, 20.0f);
        pathBuilderA.lineTo(6.0f, 20.0f);
        pathBuilderA.lineTo(6.0f, 4.0f);
        pathBuilderA.horizontalLineToRelative(7.17f);
        android.support.v4.media.a.C(pathBuilderA, 18.0f, 8.83f, 18.0f, 20.0f);
        pathBuilderA.moveTo(8.45f, 10.57f);
        pathBuilderA.lineTo(7.28f, 9.4f);
        pathBuilderA.lineTo(7.28f, 13.0f);
        pathBuilderA.horizontalLineToRelative(3.6f);
        pathBuilderA.lineToRelative(-1.44f, -1.44f);
        pathBuilderA.curveToRelative(0.52f, -1.01f, 1.58f, -1.71f, 2.79f, -1.71f);
        pathBuilderA.curveToRelative(1.74f, 0.0f, 3.15f, 1.41f, 3.15f, 3.15f);
        pathBuilderA.reflectiveCurveToRelative(-1.41f, 3.15f, -3.15f, 3.15f);
        pathBuilderA.curveToRelative(-1.07f, 0.0f, -2.02f, -0.54f, -2.58f, -1.35f);
        pathBuilderA.lineTo(8.1f, 14.8f);
        pathBuilderA.curveToRelative(0.69f, 1.58f, 2.28f, 2.7f, 4.12f, 2.7f);
        pathBuilderA.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilderA.reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f);
        pathBuilderA.curveToRelative(-1.59f, 0.0f, -2.97f, 0.83f, -3.77f, 2.07f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restorePage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
