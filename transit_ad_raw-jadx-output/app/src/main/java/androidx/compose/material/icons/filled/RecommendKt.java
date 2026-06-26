package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Recommend.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_recommend", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Recommend", "Landroidx/compose/material/icons/Icons$Filled;", "getRecommend", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RecommendKt {
    private static ImageVector _recommend;

    public static final ImageVector getRecommend(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _recommend;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Recommend", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilderD.arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.0f, 11.8f);
        pathBuilderD.arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.1f, 0.5f);
        pathBuilderD.lineToRelative(-2.1f, 4.9f);
        pathBuilderD.arcToRelative(1.34f, 1.34f, 0.0f, false, true, -1.3f, 0.8f);
        pathBuilderD.lineTo(9.0f, 18.0f);
        pathBuilderD.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-5.0f);
        pathBuilderD.arcToRelative(1.28f, 1.28f, 0.0f, false, true, 0.4f, -1.0f);
        pathBuilderD.lineTo(12.0f, 5.0f);
        pathBuilderD.lineToRelative(0.69f, 0.69f);
        pathBuilderD.arcToRelative(1.08f, 1.08f, 0.0f, false, true, 0.3f, 0.7f);
        pathBuilderD.verticalLineToRelative(0.2f);
        pathBuilderD.lineTo(12.41f, 10.0f);
        pathBuilderD.lineTo(17.0f, 10.0f);
        pathBuilderD.arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recommend = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
