package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Details.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_details", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Details", "Landroidx/compose/material/icons/Icons$Rounded;", "getDetails", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DetailsKt {
    private static ImageVector _details;

    public static final ImageVector getDetails(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _details;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Details", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(11.13f, 4.57f, -8.3f, 14.94f);
        pathBuilderA.curveTo(2.46f, 20.18f, 2.94f, 21.0f, 3.7f, 21.0f);
        pathBuilderA.horizontalLineToRelative(16.6f);
        pathBuilderA.curveToRelative(0.76f, 0.0f, 1.24f, -0.82f, 0.87f, -1.49f);
        pathBuilderA.lineToRelative(-8.3f, -14.94f);
        pathBuilderA.curveTo(12.49f, 3.89f, 11.51f, 3.89f, 11.13f, 4.57f);
        a.t(pathBuilderA, 13.0f, 8.92f, 18.6f, 19.0f);
        a.b.B(pathBuilderA, 13.0f, 8.92f, 11.0f, 8.92f);
        pathBuilderA.verticalLineTo(19.0f);
        pathBuilderA.horizontalLineTo(5.4f);
        pathBuilderA.lineTo(11.0f, 8.92f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _details = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
