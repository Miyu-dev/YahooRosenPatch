package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Plagiarism.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_plagiarism", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Plagiarism", "Landroidx/compose/material/icons/Icons$Outlined;", "getPlagiarism", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PlagiarismKt {
    private static ImageVector _plagiarism;

    public static final ImageVector getPlagiarism(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _plagiarism;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Plagiarism", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(14.0f, 2.0f, 6.0f);
        pathBuilderB.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilderB.verticalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderB.horizontalLineTo(18.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.u(pathBuilderB, 8.0f, 14.0f, 2.0f);
        pathBuilderB.moveTo(18.0f, 20.0f);
        androidx.appcompat.app.m.r(pathBuilderB, 6.0f, 20.0f, 4.0f, 7.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderB, 5.0f, 5.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.03f, 11.03f);
        pathBuilderD.curveToRelative(-1.37f, 1.37f, -1.37f, 3.58f, 0.0f, 4.95f);
        pathBuilderD.curveToRelative(1.12f, 1.12f, 2.8f, 1.31f, 4.13f, 0.59f);
        pathBuilderD.lineToRelative(1.88f, 1.88f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineToRelative(-1.88f, -1.88f);
        pathBuilderD.curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f);
        pathBuilderD.curveTo(12.61f, 9.66f, 10.39f, 9.66f, 9.03f, 11.03f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.56f, 14.56f);
        pathBuilderD.curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0.0f);
        pathBuilderD.curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilderD.curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f);
        pathBuilderD.curveTo(13.15f, 13.03f, 13.15f, 13.97f, 12.56f, 14.56f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _plagiarism = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
