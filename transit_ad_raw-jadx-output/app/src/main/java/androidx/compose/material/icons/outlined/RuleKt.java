package androidx.compose.material.icons.outlined;

import a.b;
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

/* JADX INFO: compiled from: Rule.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rule", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rule", "Landroidx/compose/material/icons/Icons$Outlined;", "getRule", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RuleKt {
    private static ImageVector _rule;

    public static final ImageVector getRule(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _rule;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rule", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.54f, 11.0f, 13.0f, 7.46f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        pathBuilderA.lineToRelative(2.12f, 2.12f);
        pathBuilderA.lineToRelative(4.24f, -4.24f);
        s.r(pathBuilderA, 1.41f, 1.41f, 16.54f, 11.0f);
        b.z(pathBuilderA, 11.0f, 7.0f, 2.0f, 2.0f);
        b.m(pathBuilderA, 9.0f, 7.0f, 21.0f, 13.41f);
        pathBuilderA.lineTo(19.59f, 12.0f);
        pathBuilderA.lineTo(17.0f, 14.59f);
        pathBuilderA.lineTo(14.41f, 12.0f);
        pathBuilderA.lineTo(13.0f, 13.41f);
        pathBuilderA.lineTo(15.59f, 16.0f);
        pathBuilderA.lineTo(13.0f, 18.59f);
        pathBuilderA.lineTo(14.41f, 20.0f);
        pathBuilderA.lineTo(17.0f, 17.41f);
        pathBuilderA.lineTo(19.59f, 20.0f);
        pathBuilderA.lineTo(21.0f, 18.59f);
        a.C(pathBuilderA, 18.41f, 16.0f, 21.0f, 13.41f);
        b.z(pathBuilderA, 11.0f, 15.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderA, 9.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rule = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
