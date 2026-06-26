package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Rowing.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rowing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rowing", "Landroidx/compose/material/icons/Icons$Filled;", "getRowing", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RowingKt {
    private static ImageVector _rowing;

    public static final ImageVector getRowing(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _rowing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rowing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(8.5f, 14.5f, 4.0f, 19.0f);
        pathBuilderA.lineToRelative(1.5f, 1.5f);
        pathBuilderA.lineTo(9.0f, 17.0f);
        a.s(pathBuilderA, 2.0f, 8.5f, 14.5f);
        pathBuilderA.moveTo(15.0f, 1.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveTo(16.1f, 1.0f, 15.0f, 1.0f);
        androidx.compose.animation.a.t(pathBuilderA, 21.0f, 21.01f, 18.0f, 24.0f);
        pathBuilderA.lineToRelative(-2.99f, -3.01f);
        pathBuilderA.verticalLineTo(19.5f);
        pathBuilderA.lineToRelative(-7.1f, -7.09f);
        pathBuilderA.curveTo(7.6f, 12.46f, 7.3f, 12.48f, 7.0f, 12.48f);
        pathBuilderA.verticalLineToRelative(-2.16f);
        pathBuilderA.curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f);
        pathBuilderA.lineToRelative(1.4f, -1.55f);
        pathBuilderA.curveTo(13.42f, 6.34f, 14.06f, 6.0f, 14.72f, 6.0f);
        pathBuilderA.horizontalLineToRelative(0.03f);
        pathBuilderA.curveTo(15.99f, 6.01f, 17.0f, 7.02f, 17.0f, 8.26f);
        pathBuilderA.verticalLineToRelative(5.75f);
        pathBuilderA.curveToRelative(0.0f, 0.84f, -0.35f, 1.61f, -0.92f, 2.16f);
        pathBuilderA.lineToRelative(-3.58f, -3.58f);
        pathBuilderA.verticalLineToRelative(-2.27f);
        pathBuilderA.curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f);
        pathBuilderA.lineTo(16.5f, 18.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.k(pathBuilderA, 18.0f, 21.0f, 21.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rowing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
