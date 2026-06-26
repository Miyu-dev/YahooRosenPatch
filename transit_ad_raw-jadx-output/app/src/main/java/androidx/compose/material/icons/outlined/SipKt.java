package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Sip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sip", "Landroidx/compose/material/icons/Icons$Outlined;", "getSip", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SipKt {
    private static ImageVector _sip;

    public static final ImageVector getSip(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sip;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Sip", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(4.0f, 4.0f, 16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(12.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveTo(2.0f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f);
        androidx.appcompat.app.m.n(pathBuilderB, 4.0f, 6.0f, 12.0f, 16.0f);
        a.o(pathBuilderB, 6.0f, 4.0f, 11.0f, 9.0f);
        androidx.compose.animation.a.B(pathBuilderB, 2.0f, 6.0f, -2.0f, 9.0f);
        pathBuilderB.moveTo(14.0f, 9.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        s.A(pathBuilderB, -2.5f, 2.0f, 14.0f, 9.0f);
        a.x(pathBuilderB, 17.5f, 10.5f, -2.0f, 1.0f);
        b.m(pathBuilderB, 2.0f, 10.5f, 6.5f, 11.25f);
        pathBuilderB.horizontalLineTo(9.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderB.verticalLineTo(14.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        androidx.browser.browseractions.a.B(pathBuilderB, 5.0f, -1.5f, 3.5f, -0.75f);
        pathBuilderB.horizontalLineTo(6.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderB.verticalLineTo(10.0f);
        pathBuilderB.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.i(pathBuilderB, 4.0f, 1.5f, 6.5f, 11.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sip = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
