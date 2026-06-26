package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
import c.g;
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DeveloperBoardOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_developerBoardOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DeveloperBoardOff", "Landroidx/compose/material/icons/Icons$Sharp;", "getDeveloperBoardOff", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeveloperBoardOffKt {
    private static ImageVector _developerBoardOff;

    public static final ImageVector getDeveloperBoardOff(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _developerBoardOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DeveloperBoardOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(7.83f, 5.0f, 18.0f, 10.17f);
        h.n(pathBuilderF, 19.83f, 17.0f, 22.0f, -2.0f);
        a.t(pathBuilderF, -2.0f, -2.0f, 2.0f, -2.0f);
        a.A(pathBuilderF, -2.0f, 9.0f, 2.0f, 7.0f);
        g.f(pathBuilderF, -2.0f, 3.0f, 5.83f);
        a.z(pathBuilderF, 7.83f, 5.0f, 12.0f, 9.17f);
        s.y(pathBuilderF, 7.0f, 4.0f, 3.0f, -3.17f);
        a.z(pathBuilderF, 12.0f, 9.17f, 9.83f, 7.0f);
        pathBuilderF.horizontalLineTo(11.0f);
        pathBuilderF.verticalLineToRelative(1.17f);
        pathBuilderF.lineTo(9.83f, 7.0f);
        pathBuilderF.close();
        b.z(pathBuilderF, 13.83f, 11.0f, 16.0f, 2.17f);
        a.z(pathBuilderF, 13.83f, 11.0f, 18.17f, 21.0f);
        pathBuilderF.lineToRelative(2.31f, 2.31f);
        pathBuilderF.lineToRelative(1.41f, -1.41f);
        pathBuilderF.lineTo(2.1f, 2.1f);
        pathBuilderF.lineTo(0.69f, 3.51f);
        j.h(pathBuilderF, 2.0f, 4.83f, 21.0f, 18.17f);
        pathBuilderF.moveTo(4.0f, 19.0f);
        pathBuilderF.verticalLineTo(6.83f);
        pathBuilderF.lineToRelative(2.0f, 2.0f);
        pathBuilderF.verticalLineTo(12.0f);
        androidx.compose.animation.a.C(pathBuilderF, 3.17f, 1.0f, 1.0f, 6.0f);
        android.support.v4.media.a.m(pathBuilderF, 4.0f, 5.0f, -3.17f);
        s.D(pathBuilderF, 1.0f, 1.0f, 17.0f, 2.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.k(pathBuilderF, 2.0f, 2.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerBoardOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
