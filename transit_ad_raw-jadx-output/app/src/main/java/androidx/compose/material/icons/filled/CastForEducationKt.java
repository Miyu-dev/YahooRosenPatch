package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: CastForEducation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_castForEducation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CastForEducation", "Landroidx/compose/material/icons/Icons$Filled;", "getCastForEducation", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CastForEducationKt {
    private static ImageVector _castForEducation;

    public static final ImageVector getCastForEducation(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _castForEducation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CastForEducation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(21.0f, 3.0f, 3.0f);
        pathBuilderB.curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
        b.u(pathBuilderB, 3.0f, 2.0f, 5.0f, 18.0f);
        a.l(pathBuilderB, 14.0f, -7.0f, 2.0f, 7.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
        androidx.appcompat.app.m.n(pathBuilderB, 1.0f, 18.0f, 3.0f, 3.0f);
        pathBuilderB.curveTo(4.0f, 19.34f, 2.66f, 18.0f, 1.0f, 18.0f);
        androidx.compose.animation.a.n(pathBuilderB, 1.0f, 14.0f, 2.0f);
        pathBuilderB.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveTo(8.0f, 17.13f, 4.87f, 14.0f, 1.0f, 14.0f);
        androidx.compose.animation.a.n(pathBuilderB, 1.0f, 10.0f, 2.0f);
        pathBuilderB.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveTo(12.0f, 14.92f, 7.07f, 10.0f, 1.0f, 10.0f);
        androidx.compose.animation.a.n(pathBuilderB, 11.0f, 11.09f, 2.0f);
        pathBuilderB.lineTo(14.5f, 15.0f);
        pathBuilderB.lineToRelative(3.5f, -1.91f);
        pathBuilderB.verticalLineToRelative(-2.0f);
        android.support.v4.media.a.C(pathBuilderB, 14.5f, 13.0f, 11.0f, 11.09f);
        pathBuilderB.moveTo(14.5f, 6.0f);
        pathBuilderB.lineTo(9.0f, 9.0f);
        pathBuilderB.lineToRelative(5.5f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderB, 20.0f, 9.0f, 14.5f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castForEducation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
