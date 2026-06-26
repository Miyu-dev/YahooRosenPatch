package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: Fastfood.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fastfood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fastfood", "Landroidx/compose/material/icons/Icons$Filled;", "getFastfood", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Fastfood", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(18.06f, 22.99f, 1.66f);
        pathBuilderB.curveToRelative(0.84f, 0.0f, 1.53f, -0.64f, 1.63f, -1.46f);
        pathBuilderB.lineTo(23.0f, 5.05f);
        a.y(pathBuilderB, -5.0f, 18.0f, 1.0f, -1.97f);
        androidx.browser.browseractions.a.t(pathBuilderB, 4.05f, -4.97f, 0.3f, 2.34f);
        pathBuilderB.curveToRelative(1.71f, 0.47f, 3.31f, 1.32f, 4.27f, 2.26f);
        pathBuilderB.curveToRelative(1.44f, 1.42f, 2.43f, 2.89f, 2.43f, 5.29f);
        android.support.v4.media.a.v(pathBuilderB, 8.05f, 1.0f, 21.99f);
        androidx.compose.animation.a.o(pathBuilderB, 1.0f, 21.0f, 15.03f, 0.99f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.01f, 1.0f);
        pathBuilderB.lineTo(2.01f, 22.99f);
        pathBuilderB.curveToRelative(-0.56f, 0.0f, -1.01f, -0.45f, -1.01f, -1.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(16.03f, 14.99f);
        pathBuilderB.curveToRelative(0.0f, -8.0f, -15.03f, -8.0f, -15.03f, 0.0f);
        a.w(pathBuilderB, 15.03f, 1.02f, 17.0f, 15.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderB, 2.0f, -15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
