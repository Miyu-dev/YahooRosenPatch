package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: HourglassEmpty.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hourglassEmpty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HourglassEmpty", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHourglassEmpty", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HourglassEmptyKt {
    private static ImageVector _hourglassEmpty;

    public static final ImageVector getHourglassEmpty(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _hourglassEmpty;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HourglassEmpty", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(18.0f, 2.0f, 6.0f, 2.0f, 6.0f);
        pathBuilderB.horizontalLineToRelative(0.01f);
        pathBuilderB.lineTo(6.0f, 8.01f);
        pathBuilderB.lineTo(10.0f, 12.0f);
        pathBuilderB.lineToRelative(-4.0f, 4.0f);
        pathBuilderB.lineToRelative(0.01f, 0.01f);
        pathBuilderB.lineTo(6.0f, 16.01f);
        androidx.compose.animation.a.o(pathBuilderB, 6.0f, 22.0f, 12.0f, -5.99f);
        pathBuilderB.horizontalLineToRelative(-0.01f);
        pathBuilderB.lineTo(18.0f, 16.0f);
        pathBuilderB.lineToRelative(-4.0f, -4.0f);
        pathBuilderB.lineToRelative(4.0f, -3.99f);
        pathBuilderB.lineToRelative(-0.01f, -0.01f);
        android.support.v4.media.a.C(pathBuilderB, 18.0f, 8.0f, 18.0f, 2.0f);
        pathBuilderB.moveTo(16.0f, 16.5f);
        pathBuilderB.lineTo(16.0f, 20.0f);
        pathBuilderB.lineTo(8.0f, 20.0f);
        pathBuilderB.verticalLineToRelative(-3.5f);
        android.support.v4.media.a.n(pathBuilderB, 4.0f, -4.0f, 4.0f, 4.0f);
        pathBuilderB.moveTo(16.0f, 7.5f);
        pathBuilderB.lineToRelative(-4.0f, 4.0f);
        pathBuilderB.lineToRelative(-4.0f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.k(pathBuilderB, 8.0f, 4.0f, 8.0f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassEmpty = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
