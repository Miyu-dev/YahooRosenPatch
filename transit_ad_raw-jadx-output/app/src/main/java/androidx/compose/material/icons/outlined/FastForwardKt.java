package androidx.compose.material.icons.outlined;

import a.b;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: FastForward.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fastForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FastForward", "Landroidx/compose/material/icons/Icons$Outlined;", "getFastForward", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FastForwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FastForward", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.0f, 9.86f, 18.03f, 12.0f);
        pathBuilderA.lineTo(15.0f, 14.14f);
        pathBuilderA.verticalLineTo(9.86f);
        pathBuilderA.moveTo(6.0f, 9.86f);
        pathBuilderA.lineTo(9.03f, 12.0f);
        pathBuilderA.lineTo(6.0f, 14.14f);
        pathBuilderA.verticalLineTo(9.86f);
        pathBuilderA.moveTo(13.0f, 6.0f);
        pathBuilderA.verticalLineToRelative(12.0f);
        pathBuilderA.lineToRelative(8.5f, -6.0f);
        a.C(pathBuilderA, 13.0f, 6.0f, 13.0f, 6.0f);
        pathBuilderA.moveTo(4.0f, 6.0f);
        pathBuilderA.verticalLineToRelative(12.0f);
        pathBuilderA.lineToRelative(8.5f, -6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 4.0f, 6.0f, 4.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastForward = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
