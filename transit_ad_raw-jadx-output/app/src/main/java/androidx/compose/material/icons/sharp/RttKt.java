package androidx.compose.material.icons.sharp;

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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Rtt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rtt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rtt", "Landroidx/compose/material/icons/Icons$Sharp;", "getRtt", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RttKt {
    private static ImageVector _rtt;

    public static final ImageVector getRtt(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _rtt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Rtt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderP = b.p(9.03f, 3.0f, -1.11f, 7.07f, 2.62f);
        pathBuilderP.lineToRelative(0.7f, -4.5f);
        androidx.appcompat.app.m.D(pathBuilderP, 2.58f, 11.8f, 18.43f, 9.47f);
        pathBuilderP.lineTo(9.06f, 21.0f);
        a.B(pathBuilderP, 7.27f, 0.4f, -2.57f, -2.35f);
        pathBuilderP.lineToRelative(2.0f, -12.86f);
        a.B(pathBuilderP, 2.58f, -0.71f, 4.5f, 2.65f);
        i.b(pathBuilderP, 22.0f, 3.0f, 9.03f);
        pathBuilderP.moveTo(8.0f, 5.0f);
        pathBuilderP.horizontalLineTo(4.0f);
        pathBuilderP.lineTo(3.69f, 7.0f);
        pathBuilderP.horizontalLineToRelative(4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 8.0f, 5.0f, 7.39f, 9.0f);
        a.B(pathBuilderP, -4.0f, -0.31f, 2.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 7.39f, 9.0f, 8.31f, 17.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderP, -6.0f, 2.0f, 19.0f, 6.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderP, 8.31f, 17.0f, 8.93f, 13.0f);
        a.B(pathBuilderP, -6.0f, -0.31f, 2.0f, 6.01f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderP, 8.93f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rtt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
