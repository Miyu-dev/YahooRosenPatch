package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: EggAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_eggAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EggAlt", "Landroidx/compose/material/icons/Icons$Outlined;", "getEggAlt", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EggAltKt {
    private static ImageVector _eggAlt;

    public static final ImageVector getEggAlt(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _eggAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EggAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.0f, 9.0f);
        pathBuilderD.curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f);
        pathBuilderD.curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f);
        pathBuilderD.curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f);
        pathBuilderD.curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f);
        pathBuilderD.curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f);
        pathBuilderD.curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.99f, 20.0f);
        pathBuilderD.curveToRelative(-1.49f, 0.0f, -1.96f, -0.5f, -2.68f, -1.26f);
        pathBuilderD.curveTo(12.66f, 18.05f, 11.66f, 17.0f, 9.97f, 17.0f);
        pathBuilderD.curveTo(8.33f, 17.0f, 4.05f, 16.01f, 4.0f, 11.5f);
        pathBuilderD.curveTo(3.97f, 8.99f, 4.68f, 6.88f, 5.99f, 5.55f);
        pathBuilderD.curveTo(7.01f, 4.52f, 8.35f, 4.0f, 9.97f, 4.0f);
        pathBuilderD.curveToRelative(3.34f, 0.0f, 4.51f, 1.86f, 5.86f, 4.02f);
        pathBuilderD.curveToRelative(0.55f, 0.88f, 1.07f, 1.71f, 1.76f, 2.39f);
        pathBuilderD.curveToRelative(1.9f, 1.89f, 2.41f, 2.4f, 2.41f, 4.61f);
        pathBuilderD.curveTo(20.0f, 17.87f, 17.88f, 20.0f, 15.99f, 20.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 12.0f, -3.5f, 0.0f);
        pathBuilderB.arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f);
        pathBuilderB.arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eggAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
