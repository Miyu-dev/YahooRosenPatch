package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: Commute.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_commute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Commute", "Landroidx/compose/material/icons/Icons$Rounded;", "getCommute", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CommuteKt {
    private static ImageVector _commute;

    public static final ImageVector getCommute(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _commute;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Commute", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 4.0f, 5.0f, 4.0f);
        pathBuilderA.curveTo(3.34f, 4.0f, 2.0f, 5.34f, 2.0f, 7.0f);
        pathBuilderA.verticalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.lineToRelative(-0.77f, 0.77f);
        pathBuilderA.curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.72f, 0.28f, 1.0f, 0.0f);
        a.o(pathBuilderA, 7.0f, 18.0f, 2.0f, -5.0f);
        pathBuilderA.lineTo(4.5f, 13.0f);
        pathBuilderA.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderA.verticalLineToRelative(-6.0f);
        pathBuilderA.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderA.horizontalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderA.lineTo(13.0f, 8.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.lineTo(15.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(5.0f, 14.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(20.57f, 9.66f);
        pathBuilderA.curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.97f, -0.66f);
        pathBuilderA.horizontalLineToRelative(-7.19f);
        pathBuilderA.curveToRelative(-0.46f, 0.0f, -0.83f, 0.26f, -0.98f, 0.66f);
        pathBuilderA.lineToRelative(-1.42f, 4.11f);
        pathBuilderA.verticalLineToRelative(5.24f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderA, -1.0f, 8.0f, 1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.99f, -0.44f, 1.0f, -0.99f);
        a.A(pathBuilderA, 22.0f, 13.77f, -1.43f, -4.11f);
        pathBuilderA.moveTo(12.77f, 10.0f);
        pathBuilderA.horizontalLineToRelative(6.48f);
        pathBuilderA.curveToRelative(0.21f, 0.0f, 0.4f, 0.14f, 0.47f, 0.34f);
        pathBuilderA.lineToRelative(0.69f, 2.0f);
        pathBuilderA.curveToRelative(0.11f, 0.32f, -0.13f, 0.66f, -0.47f, 0.66f);
        pathBuilderA.horizontalLineToRelative(-7.85f);
        pathBuilderA.curveToRelative(-0.34f, 0.0f, -0.58f, -0.34f, -0.47f, -0.66f);
        pathBuilderA.lineToRelative(0.69f, -2.0f);
        pathBuilderA.curveToRelative(0.05f, -0.2f, 0.24f, -0.34f, 0.46f, -0.34f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 16.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(20.0f, 16.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderA, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commute = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
