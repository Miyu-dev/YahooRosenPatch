package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Spellcheck.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spellcheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Spellcheck", "Landroidx/compose/material/icons/Icons$Filled;", "getSpellcheck", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpellcheckKt {
    private static ImageVector _spellcheck;

    public static final ImageVector getSpellcheck(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _spellcheck;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Spellcheck", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(12.45f, 16.0f, 2.09f, 9.43f, 3.0f);
        pathBuilderC.lineTo(7.57f, 3.0f);
        pathBuilderC.lineTo(2.46f, 16.0f);
        a.B(pathBuilderC, 2.09f, 1.12f, -3.0f, 5.64f);
        android.support.v4.media.a.t(pathBuilderC, 1.14f, 3.0f, 6.43f, 11.0f);
        pathBuilderC.lineTo(8.5f, 5.48f);
        android.support.v4.media.a.C(pathBuilderC, 10.57f, 11.0f, 6.43f, 11.0f);
        pathBuilderC.moveTo(21.59f, 11.59f);
        pathBuilderC.lineToRelative(-8.09f, 8.09f);
        pathBuilderC.lineTo(9.83f, 16.0f);
        pathBuilderC.lineToRelative(-1.41f, 1.41f);
        pathBuilderC.lineToRelative(5.09f, 5.09f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderC, 23.0f, 13.0f, -1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spellcheck = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
