package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ReportOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_reportOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReportOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getReportOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ReportOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(9.1f, 5.0f, 5.8f, 19.0f, 9.1f);
        pathBuilderC.verticalLineToRelative(5.8f);
        pathBuilderC.lineToRelative(-0.22f, 0.22f);
        pathBuilderC.lineToRelative(1.42f, 1.41f);
        pathBuilderC.lineToRelative(0.8f, -0.8f);
        pathBuilderC.verticalLineTo(8.27f);
        pathBuilderC.lineTo(15.73f, 3.0f);
        pathBuilderC.horizontalLineTo(8.27f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderC, -0.8f, 0.8f, 1.41f, 1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 16.0f, -1.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 9.33f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(0.33f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 1.58f);
        pathBuilder.lineTo(1.0f, 2.99f);
        pathBuilder.lineToRelative(3.64f, 3.64f);
        pathBuilder.lineTo(3.0f, 8.27f);
        f.d(pathBuilder, 7.46f, 8.27f, 21.0f, 7.46f);
        pathBuilder.lineToRelative(1.64f, -1.64f);
        pathBuilder.lineTo(21.01f, 23.0f);
        s.r(pathBuilder, 1.41f, -1.41f, 2.41f, 1.58f);
        pathBuilder.moveTo(14.9f, 19.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineTo(5.0f, 14.9f);
        pathBuilder.verticalLineTo(9.1f);
        pathBuilder.lineToRelative(1.05f, -1.05f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilder, 9.9f, 9.9f, 14.9f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
