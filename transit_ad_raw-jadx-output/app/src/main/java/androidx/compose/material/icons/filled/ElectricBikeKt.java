package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ElectricBike.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricBike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricBike", "Landroidx/compose/material/icons/Icons$Filled;", "getElectricBike", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricBikeKt {
    private static ImageVector _electricBike;

    public static final ImageVector getElectricBike(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _electricBike;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ElectricBike", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(19.0f, 7.0f, -0.82f, -1.7f, -4.68f);
        pathBuilderA.curveTo(16.19f, 1.53f, 15.44f, 1.0f, 14.6f, 1.0f);
        androidx.compose.animation.a.s(pathBuilderA, 12.0f, 2.0f, 2.6f);
        pathBuilderA.lineToRelative(1.46f, 4.0f);
        androidx.compose.animation.a.C(pathBuilderA, -4.81f, -0.36f, -1.0f, 12.0f);
        b.x(pathBuilderA, 4.0f, 7.0f, 2.0f, 1.75f);
        pathBuilderA.lineToRelative(1.82f, 5.0f);
        pathBuilderA.horizontalLineTo(9.9f);
        pathBuilderA.curveTo(9.46f, 8.77f, 7.59f, 7.12f, 5.25f, 7.01f);
        pathBuilderA.curveTo(2.45f, 6.87f, 0.0f, 9.2f, 0.0f, 12.0f);
        pathBuilderA.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilderA.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilderA.horizontalLineToRelative(4.2f);
        pathBuilderA.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilderA.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        pathBuilderA.curveTo(24.0f, 9.2f, 21.8f, 7.0f, 19.0f, 7.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.82f, 13.0f);
        pathBuilderA.curveToRelative(-0.4f, 1.17f, -1.49f, 2.0f, -2.82f, 2.0f);
        pathBuilderA.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        pathBuilderA.reflectiveCurveToRelative(1.32f, -3.0f, 3.0f, -3.0f);
        pathBuilderA.curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f);
        androidx.compose.animation.a.w(pathBuilderA, 5.0f, 2.0f, 7.82f);
        pathBuilderA.moveTo(14.1f, 11.0f);
        androidx.compose.animation.a.C(pathBuilderA, -1.4f, -0.73f, -2.0f, 15.0f);
        pathBuilderA.curveTo(14.56f, 9.58f, 14.24f, 10.25f, 14.1f, 11.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(19.0f, 15.0f);
        pathBuilderA.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        pathBuilderA.curveToRelative(0.0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f);
        pathBuilderA.lineToRelative(0.96f, 2.64f);
        pathBuilderA.lineToRelative(1.88f, -0.68f);
        pathBuilderA.lineToRelative(-0.97f, -2.67f);
        pathBuilderA.curveTo(18.94f, 9.01f, 18.97f, 9.0f, 19.0f, 9.0f);
        pathBuilderA.curveToRelative(1.68f, 0.0f, 3.0f, 1.32f, 3.0f, 3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 20.68f, 15.0f, 19.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(11.0f, 20.0f, -4.0f, 0.0f);
        pathBuilderA2.lineToRelative(6.0f, 3.0f);
        pathBuilderA2.lineToRelative(0.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, 4.0f, 0.0f, -6.0f, -3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricBike = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
