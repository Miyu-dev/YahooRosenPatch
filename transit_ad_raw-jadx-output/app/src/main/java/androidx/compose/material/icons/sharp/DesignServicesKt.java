package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: DesignServices.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_designServices", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DesignServices", "Landroidx/compose/material/icons/Icons$Sharp;", "getDesignServices", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DesignServices", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.79f, 17.06f, -5.55f, -5.55f);
        pathBuilderA.lineToRelative(1.57f, -1.57f);
        pathBuilderA.lineToRelative(-3.75f, -3.75f);
        pathBuilderA.lineToRelative(-1.57f, 1.57f);
        pathBuilderA.lineTo(6.94f, 2.21f);
        pathBuilderA.lineTo(2.21f, 6.94f);
        pathBuilderA.lineToRelative(5.55f, 5.55f);
        androidx.appcompat.app.m.r(pathBuilderA, 3.0f, 17.25f, 21.0f, 3.75f);
        pathBuilderA.lineToRelative(4.76f, -4.76f);
        pathBuilderA.lineToRelative(5.55f, 5.55f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        h.q(pathBuilderA, 0.0f, 21.79f, 17.06f);
        pathBuilderA.moveTo(9.18f, 11.07f);
        pathBuilderA.lineTo(5.04f, 6.94f);
        pathBuilderA.lineToRelative(1.9f, -1.9f);
        pathBuilderA.lineToRelative(1.27f, 1.27f);
        pathBuilderA.lineTo(7.02f, 7.5f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(1.19f, -1.19f);
        s.r(pathBuilderA, 1.45f, 1.45f, 9.18f, 11.07f);
        pathBuilderA.moveTo(12.93f, 14.82f);
        pathBuilderA.lineToRelative(1.9f, -1.9f);
        pathBuilderA.lineToRelative(1.45f, 1.45f);
        pathBuilderA.lineToRelative(-1.19f, 1.19f);
        pathBuilderA.lineToRelative(1.41f, 1.41f);
        pathBuilderA.lineToRelative(1.19f, -1.19f);
        pathBuilderA.lineToRelative(1.27f, 1.27f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, -1.9f, 1.9f, 12.93f, 14.82f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(15.133f, 5.123f, 2.538f, -2.538f), 3.748f, 3.748f, -2.538f, 2.538f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
