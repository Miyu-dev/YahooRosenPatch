package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Blinds.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_blinds", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Blinds", "Landroidx/compose/material/icons/Icons$Filled;", "getBlinds", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BlindsKt {
    private static ImageVector _blinds;

    public static final ImageVector getBlinds(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _blinds;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Blinds", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = v.c(20.0f, 19.0f, 3.0f, 4.0f, 16.0f);
        a.B(pathBuilderC, 2.0f, 2.0f, 20.0f, -2.0f);
        h.v(pathBuilderC, 20.0f, 16.0f, 9.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderC, 2.0f, -2.0f, 9.0f);
        android.support.v4.media.a.B(pathBuilderC, 14.0f, 11.0f, 6.0f, 9.0f);
        b.m(pathBuilderC, 8.0f, 11.0f, 18.0f, 7.0f);
        v.w(pathBuilderC, -2.0f, 5.0f, 2.0f, 7.0f);
        android.support.v4.media.a.D(pathBuilderC, 14.0f, 5.0f, 2.0f, 6.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderC, 5.0f, 14.0f, 6.0f, 19.0f);
        android.support.v4.media.a.m(pathBuilderC, -6.0f, 8.0f, 1.82f);
        pathBuilderC.curveToRelative(-0.45f, 0.32f, -0.75f, 0.84f, -0.75f, 1.43f);
        pathBuilderC.curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f);
        pathBuilderC.reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f);
        pathBuilderC.curveToRelative(0.0f, -0.59f, -0.3f, -1.12f, -0.75f, -1.43f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.q(pathBuilderC, 13.0f, 2.0f, 6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blinds = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
