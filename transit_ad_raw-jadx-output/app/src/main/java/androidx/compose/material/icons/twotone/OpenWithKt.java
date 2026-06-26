package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: OpenWith.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_openWith", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OpenWith", "Landroidx/compose/material/icons/Icons$TwoTone;", "getOpenWith", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OpenWithKt {
    private static ImageVector _openWith;

    public static final ImageVector getOpenWith(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _openWith;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.OpenWith", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(10.0f, 9.0f, 4.0f, 14.0f, 6.0f);
        pathBuilderC.horizontalLineToRelative(3.0f);
        pathBuilderC.lineToRelative(-5.0f, -5.0f);
        pathBuilderC.lineToRelative(-5.0f, 5.0f);
        pathBuilderC.horizontalLineToRelative(3.0f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(9.0f, 10.0f);
        pathBuilderC.lineTo(6.0f, 10.0f);
        pathBuilderC.lineTo(6.0f, 7.0f);
        pathBuilderC.lineToRelative(-5.0f, 5.0f);
        v.u(pathBuilderC, 5.0f, 5.0f, -3.0f, 3.0f);
        a.v(pathBuilderC, -4.0f, 23.0f, 12.0f);
        v.u(pathBuilderC, -5.0f, -5.0f, 3.0f, -3.0f);
        a.m(pathBuilderC, 4.0f, 3.0f, 3.0f);
        a.t(pathBuilderC, 5.0f, -5.0f, 14.0f, 15.0f);
        a.w(pathBuilderC, -4.0f, 3.0f, 7.0f, 18.0f);
        pathBuilderC.lineToRelative(5.0f, 5.0f);
        pathBuilderC.lineToRelative(5.0f, -5.0f);
        pathBuilderC.horizontalLineToRelative(-3.0f);
        pathBuilderC.verticalLineToRelative(-3.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openWith = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
