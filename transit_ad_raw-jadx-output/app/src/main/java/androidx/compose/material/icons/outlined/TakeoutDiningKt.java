package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: TakeoutDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_takeoutDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TakeoutDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getTakeoutDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TakeoutDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = b.p(7.79f, 18.0f, -0.51f, -7.0f, 9.46f);
        b.l(pathBuilderP, -0.51f, 7.0f, 7.79f);
        pathBuilderP.moveTo(9.83f, 5.0f);
        pathBuilderP.horizontalLineToRelative(4.33f);
        pathBuilderP.lineToRelative(2.8f, 2.73f);
        pathBuilderP.lineTo(16.87f, 9.0f);
        pathBuilderP.horizontalLineTo(7.12f);
        a.C(pathBuilderP, 7.03f, 7.73f, 9.83f, 5.0f);
        pathBuilderP.moveTo(22.0f, 7.46f);
        pathBuilderP.lineToRelative(-1.41f, -1.41f);
        pathBuilderP.lineTo(19.0f, 7.63f);
        pathBuilderP.lineToRelative(0.03f, -0.56f);
        pathBuilderP.lineTo(14.98f, 3.0f);
        pathBuilderP.horizontalLineTo(9.02f);
        pathBuilderP.lineTo(4.97f, 7.07f);
        pathBuilderP.lineTo(5.0f, 7.57f);
        pathBuilderP.lineTo(3.41f, 6.01f);
        pathBuilderP.lineTo(2.0f, 7.44f);
        pathBuilderP.lineToRelative(3.23f, 3.11f);
        pathBuilderP.lineTo(5.93f, 20.0f);
        pathBuilderP.horizontalLineToRelative(12.14f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderP, 0.7f, -9.44f, 22.0f, 7.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
