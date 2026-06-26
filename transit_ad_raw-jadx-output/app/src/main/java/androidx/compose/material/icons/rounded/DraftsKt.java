package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Drafts.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_drafts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Drafts", "Landroidx/compose/material/icons/Icons$Rounded;", "getDrafts", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DraftsKt {
    private static ImageVector _drafts;

    public static final ImageVector getDrafts(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _drafts;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Drafts", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.99f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -0.72f, -0.37f, -1.35f, -0.94f, -1.7f);
        pathBuilderD.lineToRelative(-8.04f, -4.71f);
        pathBuilderD.curveToRelative(-0.62f, -0.37f, -1.4f, -0.37f, -2.02f, 0.0f);
        pathBuilderD.lineTo(2.95f, 6.3f);
        pathBuilderD.curveTo(2.38f, 6.65f, 2.0f, 7.28f, 2.0f, 8.0f);
        pathBuilderD.verticalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        android.support.v4.media.a.t(pathBuilderD, -0.01f, -10.0f, 10.94f, 12.34f);
        pathBuilderD.lineToRelative(-7.2f, -4.5f);
        pathBuilderD.lineToRelative(7.25f, -4.25f);
        pathBuilderD.curveToRelative(0.62f, -0.37f, 1.4f, -0.37f, 2.02f, 0.0f);
        pathBuilderD.lineToRelative(7.25f, 4.25f);
        pathBuilderD.lineToRelative(-7.2f, 4.5f);
        pathBuilderD.curveToRelative(-0.65f, 0.4f, -1.47f, 0.4f, -2.12f, 0.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _drafts = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
