package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Highlight.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_highlight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Highlight", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHighlight", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HighlightKt {
    private static ImageVector _highlight;

    public static final ImageVector getHighlight(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _highlight;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Highlight", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(11.0f, 20.0f, 2.0f, -3.83f);
        e.f(pathBuilderO, 3.0f, -3.0f, 11.0f, 8.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.m(pathBuilderO, 2.17f, 3.0f, 3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO2 = androidx.appcompat.app.m.o(6.0f, 14.0f, 3.0f, 3.0f, 5.0f);
        s.s(pathBuilderO2, 6.0f, -5.0f, 3.0f, -3.0f);
        pathBuilderO2.lineTo(18.0f, 9.0f);
        androidx.compose.animation.b.k(pathBuilderO2, 6.0f, 9.0f, 5.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderO2, 8.0f, 11.0f, 8.0f, 2.17f);
        pathBuilderO2.lineToRelative(-3.0f, 3.0f);
        androidx.compose.animation.a.o(pathBuilderO2, 13.0f, 20.0f, -2.0f, -3.83f);
        s.r(pathBuilderO2, -3.0f, -3.0f, 8.0f, 11.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderO2, 11.0f, 2.0f, 2.0f, 3.0f);
        androidx.compose.animation.b.q(pathBuilderO2, -2.0f, 4.916f, 4.464f);
        pathBuilderO2.lineToRelative(2.12f, 2.122f);
        android.support.v4.media.a.C(pathBuilderO2, 5.62f, 8.0f, 3.5f, 5.877f);
        pathBuilderO2.moveTo(18.372f, 8.0f);
        pathBuilderO2.lineToRelative(-1.414f, -1.414f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderO2, 2.12f, -2.12f, 1.415f, 1.413f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlight = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
