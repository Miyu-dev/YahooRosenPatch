package androidx.compose.material.icons.outlined;

import a.b;
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

/* JADX INFO: compiled from: HdrOn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOn", "Landroidx/compose/material/icons/Icons$Outlined;", "getHdrOn", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrOnKt {
    private static ImageVector _hdrOn;

    public static final ImageVector getHdrOn(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _hdrOn;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrOn", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(21.0f, 11.5f, -1.0f);
        pathBuilderE.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        b.s(pathBuilderE, 16.0f, 9.0f, 6.0f, 1.5f);
        a.t(pathBuilderE, -2.0f, 1.1f, 0.9f, 2.0f);
        pathBuilderE.lineTo(21.0f, 15.0f);
        pathBuilderE.lineToRelative(-0.9f, -2.1f);
        pathBuilderE.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        androidx.compose.animation.b.r(pathBuilderE, 19.5f, 11.5f, -2.0f, -1.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderE, 2.0f, 1.0f, 6.5f, 11.0f);
        pathBuilderE.horizontalLineToRelative(-2.0f);
        pathBuilderE.lineTo(4.5f, 9.0f);
        b.s(pathBuilderE, 3.0f, 9.0f, 6.0f, 1.5f);
        a.x(pathBuilderE, -2.5f, 2.0f, 6.5f, 15.0f);
        pathBuilderE.lineTo(8.0f, 15.0f);
        pathBuilderE.lineTo(8.0f, 9.0f);
        androidx.compose.animation.b.k(pathBuilderE, 6.5f, 9.0f, 2.0f);
        pathBuilderE.moveTo(13.0f, 9.0f);
        pathBuilderE.lineTo(9.5f, 9.0f);
        pathBuilderE.verticalLineToRelative(6.0f);
        pathBuilderE.lineTo(13.0f, 15.0f);
        pathBuilderE.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        pathBuilderE.verticalLineToRelative(-3.0f);
        pathBuilderE.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        androidx.compose.animation.b.r(pathBuilderE, 13.0f, 13.5f, -2.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderE, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOn = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
