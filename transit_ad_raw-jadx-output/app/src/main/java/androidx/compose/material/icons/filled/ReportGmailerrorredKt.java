package androidx.compose.material.icons.filled;

import a6.h;
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
import c.b;
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ReportGmailerrorred.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_reportGmailerrorred", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReportGmailerrorred", "Landroidx/compose/material/icons/Icons$Filled;", "getReportGmailerrorred", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ReportGmailerrorredKt {
    private static ImageVector _reportGmailerrorred;

    public static final ImageVector getReportGmailerrorred(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _reportGmailerrorred;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ReportGmailerrorred", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.73f, 3.0f, 8.27f, 3.0f, 8.27f);
        f.d(pathBuilderA, 7.46f, 8.27f, 21.0f, 7.46f);
        pathBuilderA.lineTo(21.0f, 15.73f);
        h.u(pathBuilderA, 8.27f, 15.73f, 3.0f);
        pathBuilderA.moveTo(19.0f, 14.9f);
        pathBuilderA.lineTo(14.9f, 19.0f);
        pathBuilderA.horizontalLineTo(9.1f);
        pathBuilderA.lineTo(5.0f, 14.9f);
        pathBuilderA.verticalLineTo(9.1f);
        pathBuilderA.lineTo(9.1f, 5.0f);
        pathBuilderA.horizontalLineToRelative(5.8f);
        pathBuilderA.lineTo(19.0f, 9.1f);
        pathBuilderA.verticalLineTo(14.9f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(11.0f, 7.0f, 2.0f, 6.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(11.0f, 15.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportGmailerrorred = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
