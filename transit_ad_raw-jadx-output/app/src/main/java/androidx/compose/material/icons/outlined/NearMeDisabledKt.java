package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: NearMeDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_nearMeDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearMeDisabled", "Landroidx/compose/material/icons/Icons$Outlined;", "getNearMeDisabled", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NearMeDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.0f, 6.34f, 21.0f, 3.0f);
        pathBuilderA.lineToRelative(-3.34f, 9.0f);
        pathBuilderA.lineToRelative(-1.56f, -1.56f);
        pathBuilderA.lineToRelative(1.5f, -4.05f);
        s.r(pathBuilderA, -4.05f, 1.5f, 12.0f, 6.34f);
        pathBuilderA.moveTo(21.19f, 21.19f);
        pathBuilderA.lineToRelative(-5.07f, -5.07f);
        pathBuilderA.lineTo(14.31f, 21.0f);
        pathBuilderA.horizontalLineTo(12.9f);
        pathBuilderA.lineToRelative(-2.83f, -7.07f);
        pathBuilderA.lineTo(3.0f, 11.1f);
        pathBuilderA.verticalLineTo(9.69f);
        pathBuilderA.lineToRelative(4.88f, -1.81f);
        pathBuilderA.lineTo(2.81f, 2.81f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderA, 18.38f, 18.38f, 21.19f, 21.19f);
        pathBuilderA.moveTo(14.57f, 14.57f);
        pathBuilderA.lineTo(9.43f, 9.43f);
        pathBuilderA.lineToRelative(-2.71f, 1.01f);
        pathBuilderA.lineToRelative(4.89f, 1.95f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA, 1.95f, 4.89f, 14.57f, 14.57f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
