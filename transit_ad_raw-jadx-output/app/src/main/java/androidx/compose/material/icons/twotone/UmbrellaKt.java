package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Umbrella.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Umbrella", "Landroidx/compose/material/icons/Icons$TwoTone;", "getUmbrella", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Umbrella", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.28f, 8.5f, 0.76f, 0.58f);
        pathBuilderA.lineToRelative(0.92f, -0.23f);
        pathBuilderA.lineTo(13.0f, 14.8f);
        h.u(pathBuilderA, 8.29f, 13.28f, 8.5f);
        pathBuilderA.moveTo(9.03f, 8.86f);
        pathBuilderA.lineTo(11.0f, 14.8f);
        pathBuilderA.verticalLineTo(8.29f);
        pathBuilderA.lineTo(10.72f, 8.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 9.96f, 9.09f, 9.03f, 8.86f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = c.c(14.5f, 6.92f, 13.0f, 5.77f, 3.88f);
        pathBuilderC.verticalLineTo(3.4f);
        pathBuilderC.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilderC.curveToRelative(0.28f, 0.0f, 0.5f, 0.21f, 0.5f, 0.48f);
        h.w(pathBuilderC, 4.0f, 2.0f, 3.4f);
        pathBuilderC.curveTo(16.0f, 2.07f, 14.88f, 1.0f, 13.5f, 1.0f);
        pathBuilderC.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilderC.verticalLineToRelative(0.48f);
        pathBuilderC.verticalLineToRelative(1.89f);
        pathBuilderC.lineTo(9.5f, 6.92f);
        pathBuilderC.lineTo(6.0f, 6.07f);
        pathBuilderC.lineToRelative(5.05f, 15.25f);
        pathBuilderC.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilderC.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        a.C(pathBuilderC, 18.0f, 6.07f, 14.5f, 6.92f);
        pathBuilderC.moveTo(13.28f, 8.5f);
        pathBuilderC.lineToRelative(0.76f, 0.58f);
        pathBuilderC.lineToRelative(0.92f, -0.23f);
        pathBuilderC.lineTo(13.0f, 14.8f);
        h.u(pathBuilderC, 8.29f, 13.28f, 8.5f);
        pathBuilderC.moveTo(9.96f, 9.09f);
        pathBuilderC.lineToRelative(0.76f, -0.58f);
        pathBuilderC.lineTo(11.0f, 8.29f);
        pathBuilderC.verticalLineToRelative(6.51f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderC, 9.03f, 8.86f, 9.96f, 9.09f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
