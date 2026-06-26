package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FactCheck.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_factCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FactCheck", "Landroidx/compose/material/icons/Icons$Filled;", "getFactCheck", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FactCheckKt {
    private static ImageVector _factCheck;

    public static final ImageVector getFactCheck(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _factCheck;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FactCheck", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iM3071getEvenOddRgk1Os = PathFillType.INSTANCE.m3071getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 3.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        a.q(pathBuilderB, 10.0f, 17.0f, 5.0f, -2.0f);
        b.m(pathBuilderB, 5.0f, 17.0f, 10.0f, 13.0f);
        v.B(pathBuilderB, 5.0f, -2.0f, 5.0f, 13.0f);
        android.support.v4.media.a.B(pathBuilderB, 10.0f, 9.0f, 5.0f, 7.0f);
        b.m(pathBuilderB, 5.0f, 9.0f, 14.82f, 15.0f);
        pathBuilderB.lineTo(12.0f, 12.16f);
        pathBuilderB.lineToRelative(1.41f, -1.41f);
        pathBuilderB.lineToRelative(1.41f, 1.42f);
        pathBuilderB.lineTo(17.99f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderB, 1.42f, 1.42f, 14.82f, 15.0f), iM3071getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factCheck = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
