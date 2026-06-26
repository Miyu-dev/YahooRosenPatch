package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: StarBorderPurple500.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_starBorderPurple500", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StarBorderPurple500", "Landroidx/compose/material/icons/Icons$Rounded;", "getStarBorderPurple500", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StarBorderPurple500Kt {
    private static ImageVector _starBorderPurple500;

    public static final ImageVector getStarBorderPurple500(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _starBorderPurple500;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarBorderPurple500", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(12.0f, 8.89f, 12.94f, 12.0f, 2.82f);
        pathBuilderL.lineToRelative(-2.27f, 1.62f);
        pathBuilderL.lineToRelative(0.93f, 3.01f);
        pathBuilderL.lineTo(12.0f, 14.79f);
        pathBuilderL.lineToRelative(-2.42f, 1.84f);
        pathBuilderL.lineToRelative(0.93f, -3.01f);
        pathBuilderL.lineTo(8.24f, 12.0f);
        pathBuilderL.horizontalLineToRelative(2.82f);
        pathBuilderL.lineTo(12.0f, 8.89f);
        pathBuilderL.moveTo(9.58f, 10.0f);
        pathBuilderL.horizontalLineTo(5.12f);
        pathBuilderL.curveToRelative(-0.97f, 0.0f, -1.37f, 1.25f, -0.58f, 1.81f);
        pathBuilderL.lineToRelative(3.64f, 2.6f);
        pathBuilderL.lineToRelative(-1.43f, 4.61f);
        pathBuilderL.curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f);
        pathBuilderL.lineTo(12.0f, 17.31f);
        pathBuilderL.lineToRelative(3.69f, 2.81f);
        pathBuilderL.curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f);
        pathBuilderL.lineToRelative(-1.43f, -4.61f);
        pathBuilderL.lineToRelative(3.64f, -2.6f);
        pathBuilderL.curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f);
        pathBuilderL.horizontalLineToRelative(-4.46f);
        pathBuilderL.lineToRelative(-1.47f, -4.84f);
        pathBuilderL.curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderL, 9.58f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starBorderPurple500 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
