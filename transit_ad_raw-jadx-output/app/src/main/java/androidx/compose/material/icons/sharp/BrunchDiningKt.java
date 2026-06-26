package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: BrunchDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brunchDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrunchDining", "Landroidx/compose/material/icons/Icons$Sharp;", "getBrunchDining", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrunchDiningKt {
    private static ImageVector _brunchDining;

    public static final ImageVector getBrunchDining(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _brunchDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BrunchDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(18.0f, 8.0f, 2.0f, 4.0f, -2.0f);
        a.y(pathBuilderV, 8.0f, 16.0f, 22.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderV, -2.0f, 14.0f, 22.0f);
        pathBuilderV.moveTo(18.0f, 15.89f);
        pathBuilderV.lineToRelative(-0.4f, -0.42f);
        pathBuilderV.curveToRelative(-1.02f, -1.08f, -1.6f, -2.52f, -1.6f, -4.0f);
        v.r(pathBuilderV, 2.0f, 6.0f, 9.51f);
        pathBuilderV.curveToRelative(0.0f, 1.46f, -0.54f, 2.87f, -1.53f, 3.94f);
        androidx.appcompat.app.m.r(pathBuilderV, 20.0f, 15.97f, 20.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderV, 2.0f, -4.0f, 15.89f);
        b.y(pathBuilderV, 7.0f, 16.0f, -2.0f, 4.0f);
        c.a.j(pathBuilderV, 2.0f, 5.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.m(pathBuilderV, -2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brunchDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
