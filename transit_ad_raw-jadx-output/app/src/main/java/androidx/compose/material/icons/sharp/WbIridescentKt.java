package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: WbIridescent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbIridescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbIridescent", "Landroidx/compose/material/icons/Icons$Sharp;", "getWbIridescent", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbIridescentKt {
    private static ImageVector _wbIridescent;

    public static final ImageVector getWbIridescent(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _wbIridescent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WbIridescent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(5.0f, 15.0f, 14.0f, 19.0f, 9.05f);
        a.C(pathBuilderC, 5.0f, 9.05f, 5.0f, 15.0f);
        b.y(pathBuilderC, 11.0f, 1.0f, 3.0f, 2.0f);
        h.m(pathBuilderC, 13.0f, 1.0f, -2.0f);
        pathBuilderC.moveTo(19.04f, 3.6f);
        pathBuilderC.lineToRelative(-1.79f, 1.79f);
        pathBuilderC.lineToRelative(1.41f, 1.41f);
        a.n(pathBuilderC, 1.8f, -1.79f, -1.42f, -1.41f);
        b.y(pathBuilderC, 13.0f, 23.0f, -2.95f, -2.0f);
        h.m(pathBuilderC, 11.0f, 23.0f, 2.0f);
        pathBuilderC.moveTo(20.45f, 19.09f);
        pathBuilderC.lineToRelative(-1.8f, -1.79f);
        pathBuilderC.lineToRelative(-1.41f, 1.41f);
        a.n(pathBuilderC, 1.79f, 1.8f, 1.42f, -1.42f);
        pathBuilderC.moveTo(3.55f, 5.01f);
        pathBuilderC.lineTo(5.34f, 6.8f);
        pathBuilderC.lineToRelative(1.41f, -1.41f);
        a.C(pathBuilderC, 4.96f, 3.6f, 3.55f, 5.01f);
        pathBuilderC.moveTo(4.96f, 20.5f);
        pathBuilderC.lineToRelative(1.79f, -1.8f);
        pathBuilderC.lineToRelative(-1.41f, -1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderC, -1.79f, 1.79f, 1.41f, 1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIridescent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
