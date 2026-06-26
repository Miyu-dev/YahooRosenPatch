package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ReportOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_reportOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReportOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getReportOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ReportOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(11.0f, 7.0f, 2.0f, 2.33f);
        pathBuilderO.lineToRelative(7.2f, 7.2f);
        pathBuilderO.lineToRelative(0.8f, -0.8f);
        pathBuilderO.lineTo(21.0f, 8.27f);
        pathBuilderO.lineTo(15.73f, 3.0f);
        pathBuilderO.lineTo(8.27f, 3.0f);
        s.r(pathBuilderO, -0.8f, 0.8f, 11.0f, 7.33f);
        pathBuilderO.moveTo(2.41f, 1.58f);
        pathBuilderO.lineTo(1.0f, 2.99f);
        pathBuilderO.lineToRelative(3.64f, 3.64f);
        pathBuilderO.lineTo(3.0f, 8.27f);
        f.d(pathBuilderO, 7.46f, 8.27f, 21.0f, 7.46f);
        pathBuilderO.lineToRelative(1.64f, -1.64f);
        pathBuilderO.lineTo(21.01f, 23.0f);
        s.r(pathBuilderO, 1.41f, -1.41f, 2.41f, 1.58f);
        pathBuilderO.moveTo(11.0f, 12.99f);
        pathBuilderO.lineToRelative(0.01f, 0.01f);
        androidx.compose.animation.b.k(pathBuilderO, 11.0f, 13.0f, -0.01f);
        pathBuilderO.moveTo(12.0f, 17.3f);
        pathBuilderO.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        pathBuilderO.curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f);
        pathBuilderO.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        pathBuilderO.curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
