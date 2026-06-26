package androidx.compose.material.icons.twotone;

import a.b;
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

/* JADX INFO: compiled from: HdrOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHdrOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrOffKt {
    private static ImageVector _hdrOff;

    public static final ImageVector getHdrOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _hdrOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HdrOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(17.5f, 15.0f, -2.0f, 1.1f);
        pathBuilderE.lineToRelative(0.9f, 2.0f);
        pathBuilderE.lineTo(21.0f, 15.0f);
        pathBuilderE.lineToRelative(-0.9f, -2.1f);
        pathBuilderE.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilderE.verticalLineToRelative(-1.0f);
        pathBuilderE.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.lineTo(16.0f, 9.0f);
        pathBuilderE.verticalLineToRelative(4.86f);
        pathBuilderE.lineTo(17.14f, 15.0f);
        pathBuilderE.horizontalLineToRelative(0.36f);
        pathBuilderE.close();
        androidx.appcompat.view.menu.a.x(pathBuilderE, 17.5f, 10.5f, 2.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderE, -2.0f, -1.0f, 13.0f, 10.5f);
        pathBuilderE.verticalLineToRelative(0.36f);
        pathBuilderE.lineToRelative(1.5f, 1.5f);
        pathBuilderE.lineTo(14.5f, 10.5f);
        pathBuilderE.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.horizontalLineToRelative(-1.86f);
        s.r(pathBuilderE, 1.5f, 1.5f, 13.0f, 10.5f);
        pathBuilderE.moveTo(2.51f, 2.49f);
        pathBuilderE.lineTo(1.45f, 3.55f);
        androidx.compose.animation.a.o(pathBuilderE, 6.9f, 9.0f, -0.4f, 2.0f);
        pathBuilderE.horizontalLineToRelative(-2.0f);
        pathBuilderE.lineTo(4.5f, 9.0f);
        b.s(pathBuilderE, 3.0f, 9.0f, 6.0f, 1.5f);
        a.x(pathBuilderE, -2.5f, 2.0f, 6.5f, 15.0f);
        pathBuilderE.lineTo(8.0f, 15.0f);
        pathBuilderE.verticalLineToRelative(-4.9f);
        pathBuilderE.lineToRelative(1.5f, 1.5f);
        pathBuilderE.lineTo(9.5f, 15.0f);
        pathBuilderE.horizontalLineToRelative(3.4f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderE, 7.6f, 7.6f, 1.06f, -1.06f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
