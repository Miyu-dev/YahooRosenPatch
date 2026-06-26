package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: LocalFireDepartment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_localFireDepartment", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalFireDepartment", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLocalFireDepartment", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocalFireDepartmentKt {
    private static ImageVector _localFireDepartment;

    public static final ImageVector getLocalFireDepartment(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _localFireDepartment;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalFireDepartment", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.2f, 8.65f);
        pathBuilderD.curveTo(15.56f, 9.07f, 14.8f, 9.3f, 14.02f, 9.3f);
        pathBuilderD.curveToRelative(-2.06f, 0.0f, -3.77f, -1.55f, -3.99f, -3.55f);
        pathBuilderD.curveTo(8.13f, 7.35f, 6.0f, 9.84f, 6.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 1.79f, 0.79f, 3.4f, 2.04f, 4.5f);
        pathBuilderD.curveToRelative(-0.04f, -0.34f, -0.23f, -1.88f, 1.13f, -3.22f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.lineTo(12.0f, 11.5f);
        pathBuilderD.lineToRelative(2.83f, 2.78f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(1.35f, 1.33f, 1.17f, 2.86f, 1.13f, 3.21f);
        pathBuilderD.lineToRelative(0.0f, 0.01f);
        pathBuilderD.curveTo(17.21f, 16.4f, 18.0f, 14.79f, 18.0f, 13.0f);
        pathBuilderD.curveTo(18.0f, 11.35f, 17.34f, 9.78f, 16.2f, 8.65f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 14.31f, -1.42f, 1.4f);
        pathBuilderA.curveTo(10.2f, 16.07f, 10.0f, 16.55f, 10.0f, 17.06f);
        pathBuilderA.curveToRelative(0.0f, 1.07f, 0.9f, 1.94f, 2.0f, 1.94f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.87f, 2.0f, -1.94f);
        pathBuilderA.curveToRelative(0.0f, -0.51f, -0.2f, -0.99f, -0.57f, -1.36f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 12.0f, 14.31f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(16.0f, 6.0f, -0.44f, 0.55f);
        pathBuilderA2.curveToRelative(-0.42f, 0.52f, -0.98f, 0.75f, -1.54f, 0.75f);
        pathBuilderA2.curveTo(13.0f, 7.3f, 12.0f, 6.52f, 12.0f, 5.3f);
        pathBuilderA2.verticalLineTo(2.0f);
        pathBuilderA2.curveToRelative(0.0f, 0.0f, -8.0f, 4.0f, -8.0f, 11.0f);
        pathBuilderA2.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilderA2.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilderA2.curveTo(20.0f, 10.04f, 18.39f, 7.38f, 16.0f, 6.0f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(12.0f, 19.0f);
        pathBuilderA2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.87f, -2.0f, -1.94f);
        pathBuilderA2.curveToRelative(0.0f, -0.51f, 0.2f, -0.99f, 0.58f, -1.36f);
        pathBuilderA2.lineToRelative(1.42f, -1.4f);
        pathBuilderA2.lineToRelative(1.43f, 1.4f);
        pathBuilderA2.curveTo(13.8f, 16.07f, 14.0f, 16.55f, 14.0f, 17.06f);
        pathBuilderA2.curveTo(14.0f, 18.13f, 13.1f, 19.0f, 12.0f, 19.0f);
        androidx.compose.animation.a.t(pathBuilderA2, 15.96f, 17.5f, 15.96f, 17.5f);
        pathBuilderA2.curveToRelative(0.04f, -0.36f, 0.22f, -1.89f, -1.13f, -3.22f);
        pathBuilderA2.lineToRelative(0.0f, 0.0f);
        pathBuilderA2.lineTo(12.0f, 11.5f);
        pathBuilderA2.lineToRelative(-2.83f, 2.78f);
        pathBuilderA2.lineToRelative(0.0f, 0.0f);
        pathBuilderA2.curveToRelative(-1.36f, 1.34f, -1.17f, 2.88f, -1.13f, 3.22f);
        pathBuilderA2.curveTo(6.79f, 16.4f, 6.0f, 14.79f, 6.0f, 13.0f);
        pathBuilderA2.curveToRelative(0.0f, -3.16f, 2.13f, -5.65f, 4.03f, -7.25f);
        pathBuilderA2.curveToRelative(0.23f, 1.99f, 1.93f, 3.55f, 3.99f, 3.55f);
        pathBuilderA2.curveToRelative(0.78f, 0.0f, 1.54f, -0.23f, 2.18f, -0.66f);
        pathBuilderA2.curveTo(17.34f, 9.78f, 18.0f, 11.35f, 18.0f, 13.0f);
        pathBuilderA2.curveTo(18.0f, 14.79f, 17.21f, 16.4f, 15.96f, 17.5f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFireDepartment = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
