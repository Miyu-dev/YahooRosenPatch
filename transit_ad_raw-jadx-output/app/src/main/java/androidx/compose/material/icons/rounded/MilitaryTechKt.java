package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: MilitaryTech.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_militaryTech", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MilitaryTech", "Landroidx/compose/material/icons/Icons$Rounded;", "getMilitaryTech", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MilitaryTech", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(17.0f, 10.43f, 3.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineTo(8.0f);
        pathBuilderN.curveTo(7.45f, 2.0f, 7.0f, 2.45f, 7.0f, 3.0f);
        pathBuilderN.verticalLineToRelative(7.43f);
        pathBuilderN.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        pathBuilderN.lineToRelative(4.18f, 2.51f);
        pathBuilderN.lineToRelative(-0.99f, 2.34f);
        pathBuilderN.lineToRelative(-2.22f, 0.19f);
        pathBuilderN.curveTo(8.0f, 16.37f, 7.82f, 16.92f, 8.16f, 17.21f);
        pathBuilderN.lineToRelative(1.69f, 1.46f);
        pathBuilderN.lineToRelative(-0.51f, 2.18f);
        pathBuilderN.curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f);
        pathBuilderN.lineTo(12.0f, 20.23f);
        pathBuilderN.lineToRelative(1.91f, 1.15f);
        pathBuilderN.curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f);
        pathBuilderN.lineToRelative(-0.51f, -2.18f);
        pathBuilderN.lineToRelative(1.69f, -1.46f);
        pathBuilderN.curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f);
        pathBuilderN.lineToRelative(-2.22f, -0.19f);
        pathBuilderN.lineToRelative(-0.99f, -2.34f);
        pathBuilderN.lineToRelative(4.18f, -2.51f);
        pathBuilderN.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        a.y(pathBuilderN, 13.0f, 12.23f, -1.0f, 0.6f);
        s.D(pathBuilderN, -1.0f, -0.6f, 3.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderN, 12.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _militaryTech = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
