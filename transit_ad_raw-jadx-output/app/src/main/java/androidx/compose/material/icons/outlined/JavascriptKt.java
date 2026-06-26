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

/* JADX INFO: compiled from: Javascript.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_javascript", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Javascript", "Landroidx/compose/material/icons/Icons$Outlined;", "getJavascript", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class JavascriptKt {
    private static ImageVector _javascript;

    public static final ImageVector getJavascript(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _javascript;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Javascript", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = a.p(12.0f, 14.0f, -1.0f, 1.5f, 0.5f);
        v.t(pathBuilderP, 2.0f, -1.0f, 13.0f);
        pathBuilderP.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderP.verticalLineTo(10.0f);
        pathBuilderP.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderP.horizontalLineToRelative(3.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.l(pathBuilderP, 1.0f, -1.5f, -0.5f, -2.0f);
        pathBuilderP.verticalLineToRelative(1.0f);
        pathBuilderP.horizontalLineTo(16.0f);
        pathBuilderP.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderP.verticalLineTo(14.0f);
        pathBuilderP.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderP.horizontalLineToRelative(-3.0f);
        pathBuilderP.curveTo(12.45f, 15.0f, 12.0f, 14.55f, 12.0f, 14.0f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderP, 9.0f, 9.0f, 4.5f, 7.5f);
        v.z(pathBuilderP, -1.0f, 6.0f, 1.0f);
        pathBuilderP.curveTo(6.0f, 14.33f, 6.67f, 15.0f, 7.5f, 15.0f);
        pathBuilderP.horizontalLineTo(9.0f);
        pathBuilderP.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderP.verticalLineTo(9.0f);
        pathBuilderP.curveTo(10.5f, 9.0f, 9.83f, 9.0f, 9.0f, 9.0f);
        pathBuilderP.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderP.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _javascript = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
