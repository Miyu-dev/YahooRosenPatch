package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: SimCard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_simCard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SimCard", "Landroidx/compose/material/icons/Icons$Outlined;", "getSimCard", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SimCardKt {
    private static ImageVector _simCard;

    public static final ImageVector getSimCard(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _simCard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SimCard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(18.0f, 2.0f, -8.0f, 4.0f, 8.0f);
        pathBuilderC.verticalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.lineTo(20.0f, 4.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.n(pathBuilderC, 18.0f, 4.0f, 16.0f);
        pathBuilderC.lineTo(6.0f, 20.0f);
        pathBuilderC.lineTo(6.0f, 8.83f);
        android.support.v4.media.a.C(pathBuilderC, 10.83f, 4.0f, 18.0f, 4.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 7.0f, 17.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderC, 7.0f, 19.0f, 15.0f, 17.0f);
        b.t(pathBuilderC, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 7.0f, 11.0f, 2.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderC, 7.0f, 15.0f, 11.0f, 15.0f);
        b.t(pathBuilderC, 2.0f, 4.0f, -2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderC, 11.0f, 11.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderC, -2.0f, 15.0f, 11.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderC, 4.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
