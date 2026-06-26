package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Science.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_science", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Science", "Landroidx/compose/material/icons/Icons$Outlined;", "getScience", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _science;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Science", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderX = a.x(13.0f, 11.33f, 18.0f, 18.0f, 6.0f);
        s.D(pathBuilderX, 5.0f, -6.67f, 6.0f, 2.0f);
        pathBuilderX.moveTo(15.96f, 4.0f);
        pathBuilderX.horizontalLineTo(8.04f);
        pathBuilderX.curveTo(7.62f, 4.0f, 7.39f, 4.48f, 7.65f, 4.81f);
        pathBuilderX.lineTo(9.0f, 6.5f);
        pathBuilderX.verticalLineToRelative(4.17f);
        pathBuilderX.lineTo(3.2f, 18.4f);
        pathBuilderX.curveTo(2.71f, 19.06f, 3.18f, 20.0f, 4.0f, 20.0f);
        pathBuilderX.horizontalLineToRelative(16.0f);
        pathBuilderX.curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f);
        pathBuilderX.lineTo(15.0f, 10.67f);
        pathBuilderX.verticalLineTo(6.5f);
        pathBuilderX.lineToRelative(1.35f, -1.69f);
        pathBuilderX.curveTo(16.61f, 4.48f, 16.38f, 4.0f, 15.96f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderX, 15.96f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
