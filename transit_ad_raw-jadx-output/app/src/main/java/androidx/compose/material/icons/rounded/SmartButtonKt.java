package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: SmartButton.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_smartButton", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SmartButton", "Landroidx/compose/material/icons/Icons$Rounded;", "getSmartButton", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SmartButtonKt {
    private static ImageVector _smartButton;

    public static final ImageVector getSmartButton(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _smartButton;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SmartButton", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(22.0f, 9.0f, 6.0f);
        pathBuilderE.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        a.B(pathBuilderE, -1.0f, 0.0f, -2.0f, 1.0f);
        b.x(pathBuilderE, 9.0f, 4.0f, 6.0f, 6.0f);
        pathBuilderE.verticalLineToRelative(2.0f);
        pathBuilderE.horizontalLineTo(4.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderE.verticalLineTo(9.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderE.horizontalLineToRelative(16.0f);
        pathBuilderE.curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f);
        pathBuilderE.close();
        pathBuilderE.moveTo(14.04f, 17.99f);
        pathBuilderE.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilderE.lineToRelative(0.63f, -1.4f);
        pathBuilderE.lineToRelative(1.4f, -0.63f);
        pathBuilderE.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderE.lineToRelative(-1.4f, -0.63f);
        pathBuilderE.lineToRelative(-0.63f, -1.4f);
        pathBuilderE.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilderE.lineToRelative(-0.63f, 1.4f);
        pathBuilderE.lineToRelative(-1.4f, 0.63f);
        pathBuilderE.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        s.r(pathBuilderE, 1.4f, 0.63f, 14.04f, 17.99f);
        pathBuilderE.moveTo(16.74f, 13.43f);
        pathBuilderE.curveToRelative(0.1f, 0.22f, 0.42f, 0.22f, 0.52f, 0.0f);
        pathBuilderE.lineToRelative(0.36f, -0.8f);
        pathBuilderE.lineToRelative(0.8f, -0.36f);
        pathBuilderE.curveToRelative(0.22f, -0.1f, 0.22f, -0.42f, 0.0f, -0.52f);
        pathBuilderE.lineToRelative(-0.8f, -0.36f);
        pathBuilderE.lineToRelative(-0.36f, -0.8f);
        pathBuilderE.curveToRelative(-0.1f, -0.22f, -0.42f, -0.22f, -0.52f, 0.0f);
        pathBuilderE.lineToRelative(-0.36f, 0.8f);
        pathBuilderE.lineToRelative(-0.8f, 0.36f);
        pathBuilderE.curveToRelative(-0.22f, 0.1f, -0.22f, 0.42f, 0.0f, 0.52f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderE, 0.8f, 0.36f, 16.74f, 13.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartButton = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
