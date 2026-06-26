package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: NoSim.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noSim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoSim", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoSim", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoSimKt {
    private static ImageVector _noSim;

    public static final ImageVector getNoSim(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noSim;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoSim", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.26f, 21.21f, 3.79f, 3.74f);
        pathBuilderA.lineTo(2.38f, 5.15f);
        pathBuilderA.lineToRelative(2.74f, 2.74f);
        pathBuilderA.lineToRelative(-0.12f, 0.12f);
        pathBuilderA.lineTo(5.0f, 19.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(10.0f);
        pathBuilderA.curveToRelative(0.35f, 0.0f, 0.68f, -0.1f, 0.97f, -0.26f);
        a.n(pathBuilderA, 1.88f, 1.88f, 1.41f, -1.41f);
        pathBuilderA.moveTo(7.0f, 19.0f);
        pathBuilderA.lineTo(7.0f, 9.77f);
        a.C(pathBuilderA, 16.23f, 19.0f, 7.0f, 19.0f);
        pathBuilderA.moveTo(10.84f, 5.0f);
        pathBuilderA.lineTo(17.0f, 5.0f);
        pathBuilderA.verticalLineToRelative(9.11f);
        pathBuilderA.lineToRelative(2.0f, 2.0f);
        pathBuilderA.lineTo(19.0f, 5.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.horizontalLineToRelative(-6.99f);
        pathBuilderA.lineTo(7.95f, 5.06f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.41f, 1.41f, 10.84f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noSim = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
