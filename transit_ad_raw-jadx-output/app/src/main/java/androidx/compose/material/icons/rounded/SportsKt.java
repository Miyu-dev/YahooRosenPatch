package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Sports.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sports", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sports", "Landroidx/compose/material/icons/Icons$Rounded;", "getSports", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsKt {
    private static ImageVector _sports;

    public static final ImageVector getSports(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sports;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sports", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(21.0f, 6.0f, -9.77f);
        pathBuilderB.curveTo(9.57f, 6.0f, 8.01f, 6.66f, 6.87f, 7.73f);
        pathBuilderB.curveTo(6.54f, 6.73f, 5.61f, 6.0f, 4.5f, 6.0f);
        pathBuilderB.curveTo(3.12f, 6.0f, 2.0f, 7.12f, 2.0f, 8.5f);
        pathBuilderB.curveTo(2.0f, 9.88f, 3.12f, 11.0f, 4.5f, 11.0f);
        pathBuilderB.curveToRelative(0.21f, 0.0f, 0.41f, -0.03f, 0.61f, -0.08f);
        pathBuilderB.curveToRelative(-0.05f, 0.25f, -0.09f, 0.51f, -0.1f, 0.78f);
        pathBuilderB.curveToRelative(-0.18f, 3.68f, 2.95f, 6.68f, 6.68f, 6.27f);
        pathBuilderB.curveToRelative(2.55f, -0.28f, 4.68f, -2.26f, 5.19f, -4.77f);
        pathBuilderB.curveToRelative(0.15f, -0.71f, 0.15f, -1.4f, 0.06f, -2.06f);
        pathBuilderB.curveToRelative(-0.09f, -0.6f, 0.38f, -1.13f, 0.99f, -1.13f);
        pathBuilderB.lineToRelative(2.76f, 0.0f);
        pathBuilderB.curveTo(21.56f, 10.0f, 22.0f, 9.55f, 22.0f, 9.0f);
        pathBuilderB.verticalLineTo(7.0f);
        pathBuilderB.curveTo(22.0f, 6.45f, 21.55f, 6.0f, 21.0f, 6.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(4.5f, 9.0f);
        pathBuilderB.curveTo(4.22f, 9.0f, 4.0f, 8.78f, 4.0f, 8.5f);
        pathBuilderB.curveTo(4.0f, 8.22f, 4.22f, 8.0f, 4.5f, 8.0f);
        pathBuilderB.reflectiveCurveTo(5.0f, 8.22f, 5.0f, 8.5f);
        pathBuilderB.curveTo(5.0f, 8.78f, 4.78f, 9.0f, 4.5f, 9.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(11.0f, 15.0f);
        pathBuilderB.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderB.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderB, 12.66f, 15.0f, 11.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(11.0f, 12.0f, -2.0f, 0.0f);
        pathBuilderB2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilderB2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sports = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
