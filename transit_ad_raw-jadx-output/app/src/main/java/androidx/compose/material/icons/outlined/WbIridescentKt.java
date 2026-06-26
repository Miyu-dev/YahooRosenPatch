package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: WbIridescent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbIridescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbIridescent", "Landroidx/compose/material/icons/Icons$Outlined;", "getWbIridescent", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbIridescentKt {
    private static ImageVector _wbIridescent;

    public static final ImageVector getWbIridescent(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wbIridescent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbIridescent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(5.0f, 15.0f, 14.0f, 19.0f, 9.0f);
        b.k(pathBuilderC, 5.0f, 9.0f, 6.0f);
        a.x(pathBuilderC, 7.0f, 11.0f, 10.0f, 2.0f);
        b.k(pathBuilderC, 7.0f, 13.0f, -2.0f);
        a.x(pathBuilderC, 11.0f, 1.0f, 2.0f, 3.0f);
        b.q(pathBuilderC, -2.0f, 20.46f, 5.01f);
        pathBuilderC.lineTo(19.04f, 3.6f);
        android.support.v4.media.a.n(pathBuilderC, -1.79f, 1.79f, 1.41f, 1.41f);
        a.x(pathBuilderC, 11.0f, 20.0f, 2.0f, 3.0f);
        b.q(pathBuilderC, -2.0f, 17.24f, 18.71f);
        pathBuilderC.lineToRelative(1.79f, 1.8f);
        android.support.v4.media.a.n(pathBuilderC, 1.42f, -1.42f, -1.8f, -1.79f);
        pathBuilderC.moveTo(4.96f, 3.595f);
        pathBuilderC.lineToRelative(1.788f, 1.79f);
        android.support.v4.media.a.C(pathBuilderC, 5.34f, 6.79f, 3.553f, 5.003f);
        pathBuilderC.moveTo(3.55f, 19.08f);
        pathBuilderC.lineToRelative(1.41f, 1.42f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderC, 1.79f, -1.8f, -1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIridescent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
