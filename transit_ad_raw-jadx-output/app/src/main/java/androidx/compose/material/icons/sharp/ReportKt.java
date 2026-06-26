package androidx.compose.material.icons.sharp;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Report.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_report", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Report", "Landroidx/compose/material/icons/Icons$Sharp;", "getReport", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ReportKt {
    private static ImageVector _report;

    public static final ImageVector getReport(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _report;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Report", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.73f, 3.0f, 8.27f, 3.0f);
        pathBuilderA.lineTo(3.0f, 8.27f);
        f.d(pathBuilderA, 7.46f, 8.27f, 21.0f, 7.46f);
        pathBuilderA.lineTo(21.0f, 15.73f);
        a.C(pathBuilderA, 21.0f, 8.27f, 15.73f, 3.0f);
        pathBuilderA.moveTo(12.0f, 17.3f);
        pathBuilderA.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        pathBuilderA.reflectiveCurveToRelative(0.58f, -1.3f, 1.3f, -1.3f);
        pathBuilderA.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        pathBuilderA.reflectiveCurveToRelative(-0.58f, 1.3f, -1.3f, 1.3f);
        androidx.compose.animation.a.j(pathBuilderA, 13.0f, 13.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderA, 11.0f, 7.0f, 2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _report = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
